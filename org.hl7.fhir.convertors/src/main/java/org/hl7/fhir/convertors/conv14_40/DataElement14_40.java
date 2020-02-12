package org.hl7.fhir.convertors.conv14_40;

import org.hl7.fhir.convertors.VersionConvertor_14_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.BooleanType;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionKind;
import org.hl7.fhir.r4.model.UriType;

import java.util.Collections;

public class DataElement14_40 {

    public static org.hl7.fhir.r4.model.StructureDefinition convertDataElement(org.hl7.fhir.dstu2016may.model.DataElement src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.StructureDefinition tgt = new org.hl7.fhir.r4.model.StructureDefinition();
        VersionConvertor_14_40.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((UriType) VersionConvertor_14_40.convertType(src.getUrlElement()));
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.dstu2016may.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_14_40.convertIdentifier(t));
        }
        if (src.hasVersionElement())
            tgt.setVersionElement((StringType) VersionConvertor_14_40.convertType(src.getVersionElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_14_40.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((BooleanType) VersionConvertor_14_40.convertType(src.getExperimentalElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((StringType) VersionConvertor_14_40.convertType(src.getPublisherElement()));
        if (src.hasDateElement())
            tgt.setDateElement((DateTimeType) VersionConvertor_14_40.convertType(src.getDateElement()));
        if (src.hasNameElement())
            tgt.setNameElement((StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent t : src.getContact()) tgt.addContact(convertDataElementContactComponent(t));
        }
        for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext()) if (VersionConvertor_14_40.isJurisdiction(t))
            tgt.addJurisdiction(VersionConvertor_14_40.convertCodeableConcept(t));
        else
            tgt.addUseContext(VersionConvertor_14_40.convertCodeableConceptToUsageContext(t));
        if (src.hasCopyright())
            tgt.setCopyright(src.getCopyright());
        if (src.hasMapping()) {
            for (org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent t : src.getMapping()) tgt.addMapping(convertDataElementMappingComponent(t));
        }
        for (org.hl7.fhir.dstu2016may.model.ElementDefinition t : src.getElement()) if (src.hasElement()) {
            tgt.getSnapshot().addElement(VersionConvertor_14_40.convertElementDefinition(t, src.getElement(), src.getElement().indexOf(t)));
        }
        tgt.setKind(StructureDefinitionKind.COMPLEXTYPE);
        tgt.setAbstract(false);
        tgt.setType(tgt.getName());
        tgt.setBaseDefinition("http://hl7.org/fhir/StructureDefinition/Element");
        tgt.setDerivation(org.hl7.fhir.r4.model.StructureDefinition.TypeDerivationRule.SPECIALIZATION);
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent convertDataElementContactComponent(org.hl7.fhir.r4.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent tgt = new org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2016may.model.StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r4.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_40.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.ContactDetail convertDataElementContactComponent(org.hl7.fhir.dstu2016may.model.DataElement.DataElementContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.ContactDetail tgt = new org.hl7.fhir.r4.model.ContactDetail();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_40.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent convertDataElementMappingComponent(org.hl7.fhir.dstu2016may.model.DataElement.DataElementMappingComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent tgt = new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent();
        VersionConvertor_14_40.copyElement(src, tgt);
        if (src.hasIdentity()) {
            tgt.setIdentity(src.getIdentity());
        }
        if (src.hasUriElement())
            tgt.setUriElement((UriType) VersionConvertor_14_40.convertType(src.getUriElement()));
        if (src.hasNameElement())
            tgt.setNameElement((StringType) VersionConvertor_14_40.convertType(src.getNameElement()));
        if (src.hasCommentElement())
            tgt.setCommentElement((StringType) VersionConvertor_14_40.convertType(src.getCommentElement()));
        return tgt;
    }
}