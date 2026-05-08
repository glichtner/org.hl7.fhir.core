package org.hl7.fhir.r6.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.hl7.fhir.r6.formats.IParser.OutputStyle;
import org.hl7.fhir.r6.formats.XmlParser;
import org.hl7.fhir.r6.model.CapabilityStatement;
import org.hl7.fhir.r6.model.CodeSystem;
import org.hl7.fhir.r6.model.CompartmentDefinition;
import org.hl7.fhir.r6.model.ConceptMap;
import org.hl7.fhir.r6.model.Constants;
import org.hl7.fhir.r6.model.ExampleScenario;
import org.hl7.fhir.r6.model.GraphDefinition;
import org.hl7.fhir.r6.model.ImplementationGuide;
import org.hl7.fhir.r6.model.MessageDefinition;
import org.hl7.fhir.r6.model.NamingSystem;
import org.hl7.fhir.r6.model.OperationDefinition;
import org.hl7.fhir.r6.model.Resource;
import org.hl7.fhir.r6.model.SearchParameter;
import org.hl7.fhir.r6.model.StructureDefinition;
import org.hl7.fhir.r6.model.StructureMap;
import org.hl7.fhir.r6.model.TerminologyCapabilities;
import org.hl7.fhir.r6.model.ValueSet;
import org.junit.jupiter.api.Test;

class ResourceTests {

  @Test
  void testSupportsCopyright() {
    assertTrue(new CodeSystem().supportsCopyright());
    assertTrue(new ValueSet().supportsCopyright());
    assertTrue(new ConceptMap().supportsCopyright());
    assertTrue(new TerminologyCapabilities().supportsCopyright()); 
    assertTrue(new CapabilityStatement().supportsCopyright()); 
    assertTrue(new StructureDefinition().supportsCopyright()); 
    assertTrue(new ImplementationGuide().supportsCopyright()); 
    assertTrue(new MessageDefinition().supportsCopyright()); 
    assertTrue(new StructureMap().supportsCopyright()); 
    assertTrue(new ExampleScenario().supportsCopyright()); 
    assertTrue(new SearchParameter().supportsCopyright());
    assertTrue(new NamingSystem().supportsCopyright()); 
    assertTrue(new OperationDefinition().supportsCopyright()); 
    assertFalse(new CompartmentDefinition().supportsCopyright()); 
    assertTrue(new GraphDefinition().supportsCopyright()); 
  }

  private String SRC = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n\r\n"+
      "<Patient xmlns=\"http://hl7.org/fhir\">\r\n"+
      "  <name>\r\n"+
      "    <text value=\"Job Bloggs\"/>\r\n"+
      "  </name>\r\n"+
      "</Patient>\r\n";

  private String TGT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
      "<Patient xmlns=\"http://hl7.org/fhir\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://hl7.org/fhir http://test.org/Patient.xsd\">"+
      "<name>"+
      "<text value=\"Job Bloggs\"/>"+
      "</name>"+
      "</Patient>";
  
  @Test
  void testSchemaLocation() throws IOException {
    XmlParser xml = new XmlParser();
    xml.setSchemaPath("http://test.org");
    xml.setOutputStyle(OutputStyle.NORMAL);
    Resource res = xml.parse(SRC);
    String output = xml.composeString(res);
    assertEquals(TGT, output);
  }

  @Test
  void testCapabilityStatementFhirVersion() {
    CapabilityStatement cap = new CapabilityStatement();
    cap.getFhirVersionElement().setValueAsString(Constants.VERSION);
    assertEquals(Constants.VERSION, cap.getFhirVersion().getDisplay());
  }
}
