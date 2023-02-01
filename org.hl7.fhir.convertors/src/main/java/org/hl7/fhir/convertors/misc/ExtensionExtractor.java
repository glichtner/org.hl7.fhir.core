package org.hl7.fhir.convertors.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.r5.context.CanonicalResourceManager;
import org.hl7.fhir.r5.formats.IParser.OutputStyle;
import org.hl7.fhir.r5.formats.JsonParser;
import org.hl7.fhir.r5.formats.XmlParser;
import org.hl7.fhir.r5.model.CanonicalResource;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.ElementDefinition;
import org.hl7.fhir.r5.model.ElementDefinition.ElementDefinitionBindingAdditionalComponent;
import org.hl7.fhir.r5.model.StructureDefinition;
import org.hl7.fhir.r5.model.StructureDefinition.StructureDefinitionContextComponent;
import org.hl7.fhir.r5.model.StructureDefinition.TypeDerivationRule;
import org.hl7.fhir.r5.model.ValueSet;
import org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.npm.FilesystemPackageCacheManager;
import org.hl7.fhir.utilities.npm.NpmPackage;

public class ExtensionExtractor {

  public static void main(String[] args) throws FHIRFormatError, FileNotFoundException, IOException {
    new ExtensionExtractor().process(args[0]);

  }

  private void process(String dst) throws IOException {
    FilesystemPackageCacheManager pcm = new FilesystemPackageCacheManager(true);
    NpmPackage r5 = pcm.loadPackage("hl7.fhir.r5.core",  "current");
    CanonicalResourceManager<CodeSystem> cslist = new CanonicalResourceManager<CodeSystem>(true);
    for (String r : r5.listResources("CodeSystem")) {
      CodeSystem cs = (CodeSystem) new JsonParser().parse(r5.load(r));
      cslist.see(cs, null);
    }
    CanonicalResourceManager<ValueSet> vslist = new CanonicalResourceManager<ValueSet>(true);
    for (String r : r5.listResources("ValueSet")) {
      ValueSet vs = (ValueSet) new JsonParser().parse(r5.load(r));
      vslist.see(vs, null);
    }
    for (ValueSet vs : vslist.getList()) {
      for (ConceptSetComponent inc : vs.getCompose().getInclude()) {
        CodeSystem cs = cslist.get(inc.getSystem());
        if (cs != null) {
          if (!cs.hasUserData("vsl")) {
            cs.setUserData("vsl", new ArrayList<ValueSet>()); 
          }
          ((ArrayList<ValueSet>) cs.getUserData("vsl")).add(vs);
        }
      }
    }
    for (String r : r5.listResources("StructureDefinition")) {
      StructureDefinition sd = (StructureDefinition) new JsonParser().parse(r5.load(r));
      if (sd.getType().equals("Extension") && sd.getDerivation() == TypeDerivationRule.CONSTRAINT) {
        for (ElementDefinition ed : sd.getSnapshot().getElement()) {
          seeBinding(ed.getBinding().getValueSet(), vslist, "ext", sd);
          for (ElementDefinitionBindingAdditionalComponent ab : ed.getBinding().getAdditional()) {
            seeBinding(ab.getValueSet(), vslist, "ext", sd);
          }
        }
        sd.setSnapshot(null);
        String fn;
        if (sd.getContext().size() == 0) {
          save(sd, dst,"none");
        } else if (sd.getContext().size() > 1) {
          boolean dt = true;
          for (StructureDefinitionContextComponent x : sd.getContext()) {
            String s = extractType(x.getExpression());
            dt = dt && isDataType(s);
          }
          if (dt) {
            save(sd, dst,"datatypes");
          } else {
            save(sd, dst,"multiple");
          }
        } else {
          String s = extractType(sd.getContextFirstRep().getExpression());
          if (isDataType(s)) {
            save(sd, dst,"datatypes");
          } else {
            save(sd, dst,s);
          }
        }
      } else {
        for (ElementDefinition ed : sd.getSnapshot().getElement()) {
          seeBinding(ed.getBinding().getValueSet(), vslist, "core", sd);
          for (ElementDefinitionBindingAdditionalComponent ab : ed.getBinding().getAdditional()) {
            seeBinding(ab.getValueSet(), vslist, "core", sd);
          }
        }
      }
    }
    for (ValueSet vs : vslist.getList()) {
      if (vs.hasUserData("core") || !vs.hasUserData("ext") || vs.getUrl().startsWith("http://terminology.")) {
        vslist.drop(vs.getId());
      }
    }
    for (CodeSystem cs : cslist.getList()) {
      boolean keep = false;
      if (cs.hasUserData("vsl") && !cs.getUrl().startsWith("http://terminology.")) {
        keep = true;
        for (ValueSet vs : (ArrayList<ValueSet>) cs.getUserData("vsl")) {
          if (!vslist.has(vs.getUrl())) {
            keep = false;
          }
        }
      }
      if (!keep) {
        cslist.drop(cs.getId());
      }
    }
    for (ValueSet vs : vslist.getList()) {
      StructureDefinition sd = (StructureDefinition) vs.getUserData("ext");
      String s = sd.getUserString("folder");
      save(vs, dst, s);
    }
    for (CodeSystem cs : cslist.getList()) {
      ValueSet vs = ((ArrayList<ValueSet>) cs.getUserData("vsl")).get(0);
      String s = vs.getUserString("folder");
      save(cs, dst,s);
    }
  }

  private void save(CanonicalResource cr, String dst, String folder) throws IOException {
    // TODO Auto-generated method stub
    cr.setText(null);
    if (!cr.hasTitle()) {
      cr.setTitle(Utilities.unCamelCase(cr.getName()));
    }
    String fn = Utilities.path(dst, folder, cr.fhirType()+"-"+cr.getId()+".xml"); 
    cr.setUserData("folder", folder);
    if (!new File(fn).exists()) {
      Utilities.createDirectory(Utilities.getDirectoryForFile(fn));
      new XmlParser().setOutputStyle(OutputStyle.PRETTY).compose(new FileOutputStream(fn), cr);
    }
  }

  private void seeBinding(String url, CanonicalResourceManager<ValueSet> vslist, String name, StructureDefinition sd) {
    ValueSet vs = vslist.get(url);
    if (vs != null) { 
      vs.setUserData(name, sd);
    }    
  }

  private boolean isDataType(String s) {
    return Utilities.existsInList(s,
        "PrimitiveType", "instant", "time", "date", "dateTime", "decimal", "boolean", "integer", "string",
        "uri", "base64Binary", "code", "id", "oid", "unsignedInt", "positiveInt", "markdown", "url", "canonical",
        "uuid", "integer64", "DataType", "BackboneType", "Identifier", "HumanName", "Address", "ContactPoint",
        "Timing", "Quantity", "SimpleQuantity", "Attachment", "Range", "Period", "Ratio", "RatioRange", "CodeableConcept",
        "Coding", "SampledData", "Age", "Distance", "Duration", "Count", "Money", "MoneyQuantity", "Annotation", "Signature", "DataType",
        "ContactDetail", "Contributor", "DataRequirement", "ParameterDefinition", "RelatedArtifact", "TriggerDefinition", "UsageContext",
        "Expression", "ExtendedContactDetail", "VirtualServiceDetail", "Availability", "MonetaryComponent", "DataType",
        "BackboneType", "Reference", "Narrative", "Extension", "Meta", "ElementDefinition", "Dosage", "xhtml", "CodeableReference");
  }

  private String extractType(String x) {
    String s = x;
    if (s.contains(".")) {
      s = s.substring(0, s.indexOf("."));
    }
    return s;
  }
}
