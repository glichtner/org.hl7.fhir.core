package org.hl7.fhir.r6.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Thu, Mar 23, 2023 19:59+1100 for FHIR v5.0.0


import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.exceptions.FHIRException;

public class Enumerations {

// In here: 
//   ActionApplicabilityBehavior: Defines applicability behavior of a group.[RequestOrchestration, PlanDefinition]
//   ActionCardinalityBehavior: Defines behavior for an action or a group for how many times that item may be repeated.[RequestOrchestration, PlanDefinition]
//   ActionConditionKind: Defines the kinds of conditions that can appear on actions.[RequestOrchestration, PlanDefinition]
//   ActionGroupingBehavior: Defines organization behavior of a group.[RequestOrchestration, PlanDefinition]
//   ActionParticipantType: The type of participant for the action.[RequestOrchestration, ActivityDefinition, PlanDefinition]
//   ActionPrecheckBehavior: Defines selection frequency behavior for an action or group.[RequestOrchestration, PlanDefinition]
//   ActionRelationshipType: Defines the types of relationships between actions.[RequestOrchestration, PlanDefinition]
//   ActionRequiredBehavior: Defines expectations around whether an action or action group is required.[RequestOrchestration, PlanDefinition]
//   ActionSelectionBehavior: Defines selection behavior of a group.[RequestOrchestration, PlanDefinition]
//   ActorDefinitionActorType: The type of actor - system or human.[ExampleScenario, ActorDefinition]
//   AdministrativeGender: The gender of a person used for administrative purposes.[Patient, RelatedPerson, ObservationDefinition, Practitioner, Person]
//   AllLanguages: This value set includes all possible codes from BCP-47 (see http://tools.ietf.org/html/bcp47)[MeasureReport, EnrollmentResponse, Account, BodyStructure, TerminologyCapabilities, DomainResource, SubscriptionStatus, PaymentNotice, Ingredient, Appointment, Device, PaymentReconciliation, Location, Patient, ArtifactAssessment, RequestOrchestration, DeviceAssociation, MedicationStatement, ActivityDefinition, Observation, Contract, FamilyMemberHistory, Task, Provenance, MedicationDispense, Basic, ConceptMap, Library, InsurancePlan, Claim, RelatedPerson, SubscriptionTopic, BiologicallyDerivedProduct, Medication, CodeSystem, Encounter, CommunicationRequest, CanonicalResource, Communication, ImagingStudy, CoverageEligibilityRequest, Resource, ExampleScenario, Endpoint, CompartmentDefinition, Consent, InsuranceProduct, RegulatedAuthorization, ServiceRequest, QuestionnaireResponse, NamingSystem, StructureMap, PractitionerRole, AdverseEvent, PackagedProductDefinition, Slot, ManufacturedItemDefinition, MedicinalProductDefinition, List, SearchParameter, HealthcareService, Procedure, DeviceDefinition, ResearchSubject, VisionPrescription, Binary, AdministrableProductDefinition, Condition, Subscription, OrganizationAffiliation, NutritionProduct, Evidence, AllergyIntolerance, AppointmentResponse, ClinicalUseDefinition, OperationOutcome, MessageHeader, Organization, DetectedIssue, GuidanceResponse, Immunization, CareTeam, ImagingSelection, ExplanationOfBenefit, MetadataResource, Parameters, DeviceMetric, ResearchStudy, Composition, ValueSet, MedicationAdministration, Questionnaire, ImplementationGuide, MedicationRequest, CarePlan, AuditEvent, Invoice, ObservationDefinition, EventDefinition, NutritionIntake, DeviceAlert, Schedule, Attachment, CapabilityStatement, EnrollmentRequest, Flag, Requirements, Substance, SubstanceDefinition, OperationDefinition, MessageDefinition, EpisodeOfCare, CoverageEligibilityResponse, ActorDefinition, DiagnosticReport, Goal, Group, RiskAssessment, NutritionOrder, PlanDefinition, Coverage, Practitioner, StructureDefinition, EvidenceVariable, DocumentReference, DeviceRequest, SpecimenDefinition, ClaimResponse, Person, Measure, Bundle, Specimen]
//   BindingStrength: Indication of the degree of conformance expectations associated with a binding.[ElementDefinition, OperationDefinition]
//   CapabilityStatementKind: How a capability statement is intended to be used.[TerminologyCapabilities, CapabilityStatement]
//   ClaimProcessingCodes: This value set includes Claim Processing Outcome codes.[ExplanationOfBenefit, ClaimResponse]
//   CodeSystemContentMode: The extent of the content of the code system (the concepts and codes it defines) are represented in a code system resource.[TerminologyCapabilities, CodeSystem]
//   CompartmentType: Which type a compartment definition describes.[CompartmentDefinition]
//   CompositionStatus: The workflow/clinical status of the composition.[Composition, DocumentReference]
//   ConceptMapRelationship: The relationship between concepts.[ConceptMap]
//   ConsentDataMeaning: How a resource reference is interpreted when testing consent restrictions.[Consent]
//   ConsentProvisionType: How a rule statement is applied, such as adding additional consent or removing consent.[Consent]
//   Currencies: Currency codes from ISO 4217 (see https://www.iso.org/iso-4217-currency-codes.html)[Account, Money]
//   DaysOfWeek: The days of the week.[Appointment, Timing, Availability]
//   EncounterStatus: Current state of the encounter.[Encounter]
//   EventStatus: Codes identifying the lifecycle stage of an event.[Communication, Procedure, NutritionIntake]
//   FHIRTypes: All FHIR types[OperationDefinition, Measure, ParameterDefinition, DataRequirement]
//   FHIRVersion: All published FHIR Versions.[ImplementationGuide, CapabilityStatement, StructureDefinition]
//   FilterOperator: The kind of operation to perform as a part of a property based filter.[CodeSystem, ValueSet]
//   FinancialResourceStatusCodes: This value set includes Status codes.[EnrollmentResponse, PaymentNotice, PaymentReconciliation, Claim, CoverageEligibilityRequest, VisionPrescription, EnrollmentRequest, CoverageEligibilityResponse, Coverage, ClaimResponse]
//   ListMode: The processing mode that applies to this list.[List]
//   MimeTypes: This value set includes all possible codes from BCP-13 (see http://tools.ietf.org/html/bcp13)[ElementDefinition, Endpoint, Binary, Subscription, Attachment, Signature]
//   ObservationStatus: Codes providing the status of an observation.[Observation, RiskAssessment]
//   OperationParameterUse: Whether an operation parameter is an input or an output parameter.[OperationDefinition, ParameterDefinition]
//   PublicationStatus: The lifecycle status of an artifact.[TerminologyCapabilities, Ingredient, ActivityDefinition, ConceptMap, Library, SubscriptionTopic, CodeSystem, CanonicalResource, ExampleScenario, CompartmentDefinition, InsuranceProduct, NamingSystem, StructureMap, ManufacturedItemDefinition, SearchParameter, DeviceDefinition, ResearchSubject, AdministrableProductDefinition, Evidence, MetadataResource, ResearchStudy, ValueSet, Questionnaire, ImplementationGuide, ObservationDefinition, EventDefinition, CapabilityStatement, Requirements, OperationDefinition, MessageDefinition, ActorDefinition, Group, PlanDefinition, StructureDefinition, EvidenceVariable, SpecimenDefinition, Measure]
//   QuantityComparator: How the Quantity should be understood and represented.[Age, Count, Distance, Duration, Quantity]
//   RequestIntent: Codes indicating the degree of authority/intentionality associated with a request.[RequestOrchestration, ActivityDefinition, CommunicationRequest, ServiceRequest, NutritionOrder, DeviceRequest]
//   RequestPriority: Identifies the level of importance to be assigned to actioning the request.[RequestOrchestration, ActivityDefinition, Task, CommunicationRequest, Communication, ServiceRequest, VisionPrescription, MedicationRequest, NutritionOrder, PlanDefinition, DeviceRequest]
//   RequestStatus: Codes identifying the lifecycle stage of a request.[RequestOrchestration, CommunicationRequest, ServiceRequest, CarePlan, NutritionOrder, DeviceRequest]
//   ResourceTypeEnum: Concrete FHIR Resource Types[CompartmentDefinition, Questionnaire, ImplementationGuide, MessageDefinition]
//   SearchComparator: What Search Comparator Codes are supported in search.[SubscriptionTopic, SearchParameter, Subscription]
//   SearchModifierCode: A supported modifier for a search parameter.[SubscriptionTopic, Subscription]
//   SearchParamType: Data types allowed to be used for search parameters.[SearchParameter, CapabilityStatement, OperationDefinition]
//   SubscriptionStatusCodes: State values for FHIR Subscriptions.[SubscriptionStatus, Subscription]
//   Use: The purpose of the Claim: predetermination, preauthorization, claim.[Claim, ExplanationOfBenefit, ClaimResponse]
//   VersionIndependentResourceTypesAll: Current and past FHIR resource types (deleted or renamed), including abstract types[SearchParameter, OperationDefinition]


    public enum ActionApplicabilityBehavior {
        /**
         * The applicability of each action is evaluated independently; if the applicability criteria for an action evaluates to true, it is applied.
         */
        ALL, 
        /**
         * The applicability of each action is evaluated in order; the first action for which the applicability criteria evaluates to true is applied, and processing of the parent action stops.
         */
        ANY, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionApplicabilityBehavior fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("all".equals(codeString))
          return ALL;
        if ("any".equals(codeString))
          return ANY;
        throw new FHIRException("Unknown ActionApplicabilityBehavior code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "all", "any");
        }
        public String toCode() {
          switch (this) {
            case ALL: return "all";
            case ANY: return "any";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ALL: return "http://hl7.org/fhir/action-applicability-behavior";
            case ANY: return "http://hl7.org/fhir/action-applicability-behavior";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ALL: return "The applicability of each action is evaluated independently; if the applicability criteria for an action evaluates to true, it is applied.";
            case ANY: return "The applicability of each action is evaluated in order; the first action for which the applicability criteria evaluates to true is applied, and processing of the parent action stops.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ALL: return "All";
            case ANY: return "Any";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionApplicabilityBehaviorEnumFactory implements EnumFactory<ActionApplicabilityBehavior> {
    public ActionApplicabilityBehavior fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("all".equals(codeString))
          return ActionApplicabilityBehavior.ALL;
        if ("any".equals(codeString))
          return ActionApplicabilityBehavior.ANY;
        throw new IllegalArgumentException("Unknown ActionApplicabilityBehavior code '"+codeString+"'");
        }

        public Enumeration<ActionApplicabilityBehavior> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionApplicabilityBehavior>(this, ActionApplicabilityBehavior.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionApplicabilityBehavior>(this, ActionApplicabilityBehavior.NULL, code);
        if ("all".equals(codeString))
          return new Enumeration<ActionApplicabilityBehavior>(this, ActionApplicabilityBehavior.ALL, code);
        if ("any".equals(codeString))
          return new Enumeration<ActionApplicabilityBehavior>(this, ActionApplicabilityBehavior.ANY, code);
        throw new FHIRException("Unknown ActionApplicabilityBehavior code '"+codeString+"'");
        }
    public String toCode(ActionApplicabilityBehavior code) {
      if (code == ActionApplicabilityBehavior.ALL)
        return "all";
      if (code == ActionApplicabilityBehavior.ANY)
        return "any";
      return "?";
      }
    public String toSystem(ActionApplicabilityBehavior code) {
      return code.getSystem();
      }
    }

    public enum ActionCardinalityBehavior {
        /**
         * The action may only be selected one time.
         */
        SINGLE, 
        /**
         * The action may be selected multiple times.
         */
        MULTIPLE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionCardinalityBehavior fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("single".equals(codeString))
          return SINGLE;
        if ("multiple".equals(codeString))
          return MULTIPLE;
        throw new FHIRException("Unknown ActionCardinalityBehavior code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "single", "multiple");
        }
        public String toCode() {
          switch (this) {
            case SINGLE: return "single";
            case MULTIPLE: return "multiple";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case SINGLE: return "http://hl7.org/fhir/action-cardinality-behavior";
            case MULTIPLE: return "http://hl7.org/fhir/action-cardinality-behavior";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case SINGLE: return "The action may only be selected one time.";
            case MULTIPLE: return "The action may be selected multiple times.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case SINGLE: return "Single";
            case MULTIPLE: return "Multiple";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionCardinalityBehaviorEnumFactory implements EnumFactory<ActionCardinalityBehavior> {
    public ActionCardinalityBehavior fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("single".equals(codeString))
          return ActionCardinalityBehavior.SINGLE;
        if ("multiple".equals(codeString))
          return ActionCardinalityBehavior.MULTIPLE;
        throw new IllegalArgumentException("Unknown ActionCardinalityBehavior code '"+codeString+"'");
        }

        public Enumeration<ActionCardinalityBehavior> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionCardinalityBehavior>(this, ActionCardinalityBehavior.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionCardinalityBehavior>(this, ActionCardinalityBehavior.NULL, code);
        if ("single".equals(codeString))
          return new Enumeration<ActionCardinalityBehavior>(this, ActionCardinalityBehavior.SINGLE, code);
        if ("multiple".equals(codeString))
          return new Enumeration<ActionCardinalityBehavior>(this, ActionCardinalityBehavior.MULTIPLE, code);
        throw new FHIRException("Unknown ActionCardinalityBehavior code '"+codeString+"'");
        }
    public String toCode(ActionCardinalityBehavior code) {
      if (code == ActionCardinalityBehavior.SINGLE)
        return "single";
      if (code == ActionCardinalityBehavior.MULTIPLE)
        return "multiple";
      return "?";
      }
    public String toSystem(ActionCardinalityBehavior code) {
      return code.getSystem();
      }
    }

    public enum ActionConditionKind {
        /**
         * The condition describes whether or not a given action is applicable.
         */
        APPLICABILITY, 
        /**
         * The condition is a starting condition for the action.
         */
        START, 
        /**
         * The condition is a stop, or exit condition for the action.
         */
        STOP, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionConditionKind fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("applicability".equals(codeString))
          return APPLICABILITY;
        if ("start".equals(codeString))
          return START;
        if ("stop".equals(codeString))
          return STOP;
        throw new FHIRException("Unknown ActionConditionKind code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "applicability", "start", "stop");
        }
        public String toCode() {
          switch (this) {
            case APPLICABILITY: return "applicability";
            case START: return "start";
            case STOP: return "stop";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case APPLICABILITY: return "http://hl7.org/fhir/action-condition-kind";
            case START: return "http://hl7.org/fhir/action-condition-kind";
            case STOP: return "http://hl7.org/fhir/action-condition-kind";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case APPLICABILITY: return "The condition describes whether or not a given action is applicable.";
            case START: return "The condition is a starting condition for the action.";
            case STOP: return "The condition is a stop, or exit condition for the action.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case APPLICABILITY: return "Applicability";
            case START: return "Start";
            case STOP: return "Stop";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionConditionKindEnumFactory implements EnumFactory<ActionConditionKind> {
    public ActionConditionKind fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("applicability".equals(codeString))
          return ActionConditionKind.APPLICABILITY;
        if ("start".equals(codeString))
          return ActionConditionKind.START;
        if ("stop".equals(codeString))
          return ActionConditionKind.STOP;
        throw new IllegalArgumentException("Unknown ActionConditionKind code '"+codeString+"'");
        }

        public Enumeration<ActionConditionKind> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionConditionKind>(this, ActionConditionKind.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionConditionKind>(this, ActionConditionKind.NULL, code);
        if ("applicability".equals(codeString))
          return new Enumeration<ActionConditionKind>(this, ActionConditionKind.APPLICABILITY, code);
        if ("start".equals(codeString))
          return new Enumeration<ActionConditionKind>(this, ActionConditionKind.START, code);
        if ("stop".equals(codeString))
          return new Enumeration<ActionConditionKind>(this, ActionConditionKind.STOP, code);
        throw new FHIRException("Unknown ActionConditionKind code '"+codeString+"'");
        }
    public String toCode(ActionConditionKind code) {
      if (code == ActionConditionKind.APPLICABILITY)
        return "applicability";
      if (code == ActionConditionKind.START)
        return "start";
      if (code == ActionConditionKind.STOP)
        return "stop";
      return "?";
      }
    public String toSystem(ActionConditionKind code) {
      return code.getSystem();
      }
    }

    public enum ActionGroupingBehavior {
        /**
         * Any group marked with this behavior should be displayed as a visual group to the end user.
         */
        VISUALGROUP, 
        /**
         * A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.
         */
        LOGICALGROUP, 
        /**
         * A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are "aspirin, 500 mg, 2 times per day" and "aspirin, 300 mg, 3 times per day". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of "AtMostOne", unless it's a required action, in which case, it would be "ExactlyOne".
         */
        SENTENCEGROUP, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionGroupingBehavior fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("visual-group".equals(codeString))
          return VISUALGROUP;
        if ("logical-group".equals(codeString))
          return LOGICALGROUP;
        if ("sentence-group".equals(codeString))
          return SENTENCEGROUP;
        throw new FHIRException("Unknown ActionGroupingBehavior code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "visual-group", "logical-group", "sentence-group");
        }
        public String toCode() {
          switch (this) {
            case VISUALGROUP: return "visual-group";
            case LOGICALGROUP: return "logical-group";
            case SENTENCEGROUP: return "sentence-group";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case VISUALGROUP: return "http://hl7.org/fhir/action-grouping-behavior";
            case LOGICALGROUP: return "http://hl7.org/fhir/action-grouping-behavior";
            case SENTENCEGROUP: return "http://hl7.org/fhir/action-grouping-behavior";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case VISUALGROUP: return "Any group marked with this behavior should be displayed as a visual group to the end user.";
            case LOGICALGROUP: return "A group with this behavior logically groups its sub-elements, and may be shown as a visual group to the end user, but it is not required to do so.";
            case SENTENCEGROUP: return "A group of related alternative actions is a sentence group if the target referenced by the action is the same in all the actions and each action simply constitutes a different variation on how to specify the details for the target. For example, two actions that could be in a SentenceGroup are \"aspirin, 500 mg, 2 times per day\" and \"aspirin, 300 mg, 3 times per day\". In both cases, aspirin is the target referenced by the action, and the two actions represent different options for how aspirin might be ordered for the patient. Note that a SentenceGroup would almost always have an associated selection behavior of \"AtMostOne\", unless it's a required action, in which case, it would be \"ExactlyOne\".";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case VISUALGROUP: return "Visual Group";
            case LOGICALGROUP: return "Logical Group";
            case SENTENCEGROUP: return "Sentence Group";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionGroupingBehaviorEnumFactory implements EnumFactory<ActionGroupingBehavior> {
    public ActionGroupingBehavior fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("visual-group".equals(codeString))
          return ActionGroupingBehavior.VISUALGROUP;
        if ("logical-group".equals(codeString))
          return ActionGroupingBehavior.LOGICALGROUP;
        if ("sentence-group".equals(codeString))
          return ActionGroupingBehavior.SENTENCEGROUP;
        throw new IllegalArgumentException("Unknown ActionGroupingBehavior code '"+codeString+"'");
        }

        public Enumeration<ActionGroupingBehavior> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionGroupingBehavior>(this, ActionGroupingBehavior.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionGroupingBehavior>(this, ActionGroupingBehavior.NULL, code);
        if ("visual-group".equals(codeString))
          return new Enumeration<ActionGroupingBehavior>(this, ActionGroupingBehavior.VISUALGROUP, code);
        if ("logical-group".equals(codeString))
          return new Enumeration<ActionGroupingBehavior>(this, ActionGroupingBehavior.LOGICALGROUP, code);
        if ("sentence-group".equals(codeString))
          return new Enumeration<ActionGroupingBehavior>(this, ActionGroupingBehavior.SENTENCEGROUP, code);
        throw new FHIRException("Unknown ActionGroupingBehavior code '"+codeString+"'");
        }
    public String toCode(ActionGroupingBehavior code) {
      if (code == ActionGroupingBehavior.VISUALGROUP)
        return "visual-group";
      if (code == ActionGroupingBehavior.LOGICALGROUP)
        return "logical-group";
      if (code == ActionGroupingBehavior.SENTENCEGROUP)
        return "sentence-group";
      return "?";
      }
    public String toSystem(ActionGroupingBehavior code) {
      return code.getSystem();
      }
    }

    public enum ActionParticipantType {
        /**
         * The participant is a care team caring for the patient under evaluation.
         */
        CARETEAM, 
        /**
         * The participant is a system or device used in the care of the patient.
         */
        DEVICE, 
        /**
         * The participant is a group of participants involved in the care of the patient.
         */
        GROUP, 
        /**
         * The participant is an institution that can provide the given healthcare service used in the care of the patient.
         */
        HEALTHCARESERVICE, 
        /**
         * The participant is a location involved in the care of the patient.
         */
        LOCATION, 
        /**
         * The participant is an organization involved in the care of the patient.
         */
        ORGANIZATION, 
        /**
         * The participant is the patient under evaluation.
         */
        PATIENT, 
        /**
         * The participant is a practitioner involved in the patient's care.
         */
        PRACTITIONER, 
        /**
         * The participant is a particular practitioner role involved in the patient's care.
         */
        PRACTITIONERROLE, 
        /**
         * The participant is a person related to the patient.
         */
        RELATEDPERSON, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionParticipantType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("careteam".equals(codeString))
          return CARETEAM;
        if ("device".equals(codeString))
          return DEVICE;
        if ("group".equals(codeString))
          return GROUP;
        if ("healthcareservice".equals(codeString))
          return HEALTHCARESERVICE;
        if ("location".equals(codeString))
          return LOCATION;
        if ("organization".equals(codeString))
          return ORGANIZATION;
        if ("patient".equals(codeString))
          return PATIENT;
        if ("practitioner".equals(codeString))
          return PRACTITIONER;
        if ("practitionerrole".equals(codeString))
          return PRACTITIONERROLE;
        if ("relatedperson".equals(codeString))
          return RELATEDPERSON;
        throw new FHIRException("Unknown ActionParticipantType code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "careteam", "device", "group", "healthcareservice", "location", "organization", "patient", "practitioner", "practitionerrole", "relatedperson");
        }
        public String toCode() {
          switch (this) {
            case CARETEAM: return "careteam";
            case DEVICE: return "device";
            case GROUP: return "group";
            case HEALTHCARESERVICE: return "healthcareservice";
            case LOCATION: return "location";
            case ORGANIZATION: return "organization";
            case PATIENT: return "patient";
            case PRACTITIONER: return "practitioner";
            case PRACTITIONERROLE: return "practitionerrole";
            case RELATEDPERSON: return "relatedperson";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case CARETEAM: return "http://hl7.org/fhir/action-participant-type";
            case DEVICE: return "http://hl7.org/fhir/action-participant-type";
            case GROUP: return "http://hl7.org/fhir/action-participant-type";
            case HEALTHCARESERVICE: return "http://hl7.org/fhir/action-participant-type";
            case LOCATION: return "http://hl7.org/fhir/action-participant-type";
            case ORGANIZATION: return "http://hl7.org/fhir/action-participant-type";
            case PATIENT: return "http://hl7.org/fhir/action-participant-type";
            case PRACTITIONER: return "http://hl7.org/fhir/action-participant-type";
            case PRACTITIONERROLE: return "http://hl7.org/fhir/action-participant-type";
            case RELATEDPERSON: return "http://hl7.org/fhir/action-participant-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case CARETEAM: return "The participant is a care team caring for the patient under evaluation.";
            case DEVICE: return "The participant is a system or device used in the care of the patient.";
            case GROUP: return "The participant is a group of participants involved in the care of the patient.";
            case HEALTHCARESERVICE: return "The participant is an institution that can provide the given healthcare service used in the care of the patient.";
            case LOCATION: return "The participant is a location involved in the care of the patient.";
            case ORGANIZATION: return "The participant is an organization involved in the care of the patient.";
            case PATIENT: return "The participant is the patient under evaluation.";
            case PRACTITIONER: return "The participant is a practitioner involved in the patient's care.";
            case PRACTITIONERROLE: return "The participant is a particular practitioner role involved in the patient's care.";
            case RELATEDPERSON: return "The participant is a person related to the patient.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CARETEAM: return "CareTeam";
            case DEVICE: return "Device";
            case GROUP: return "Group";
            case HEALTHCARESERVICE: return "HealthcareService";
            case LOCATION: return "Location";
            case ORGANIZATION: return "Organization";
            case PATIENT: return "Patient";
            case PRACTITIONER: return "Practitioner";
            case PRACTITIONERROLE: return "PractitionerRole";
            case RELATEDPERSON: return "RelatedPerson";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionParticipantTypeEnumFactory implements EnumFactory<ActionParticipantType> {
    public ActionParticipantType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("careteam".equals(codeString))
          return ActionParticipantType.CARETEAM;
        if ("device".equals(codeString))
          return ActionParticipantType.DEVICE;
        if ("group".equals(codeString))
          return ActionParticipantType.GROUP;
        if ("healthcareservice".equals(codeString))
          return ActionParticipantType.HEALTHCARESERVICE;
        if ("location".equals(codeString))
          return ActionParticipantType.LOCATION;
        if ("organization".equals(codeString))
          return ActionParticipantType.ORGANIZATION;
        if ("patient".equals(codeString))
          return ActionParticipantType.PATIENT;
        if ("practitioner".equals(codeString))
          return ActionParticipantType.PRACTITIONER;
        if ("practitionerrole".equals(codeString))
          return ActionParticipantType.PRACTITIONERROLE;
        if ("relatedperson".equals(codeString))
          return ActionParticipantType.RELATEDPERSON;
        throw new IllegalArgumentException("Unknown ActionParticipantType code '"+codeString+"'");
        }

        public Enumeration<ActionParticipantType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionParticipantType>(this, ActionParticipantType.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionParticipantType>(this, ActionParticipantType.NULL, code);
        if ("careteam".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.CARETEAM, code);
        if ("device".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.DEVICE, code);
        if ("group".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.GROUP, code);
        if ("healthcareservice".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.HEALTHCARESERVICE, code);
        if ("location".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.LOCATION, code);
        if ("organization".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.ORGANIZATION, code);
        if ("patient".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.PATIENT, code);
        if ("practitioner".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.PRACTITIONER, code);
        if ("practitionerrole".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.PRACTITIONERROLE, code);
        if ("relatedperson".equals(codeString))
          return new Enumeration<ActionParticipantType>(this, ActionParticipantType.RELATEDPERSON, code);
        throw new FHIRException("Unknown ActionParticipantType code '"+codeString+"'");
        }
    public String toCode(ActionParticipantType code) {
      if (code == ActionParticipantType.CARETEAM)
        return "careteam";
      if (code == ActionParticipantType.DEVICE)
        return "device";
      if (code == ActionParticipantType.GROUP)
        return "group";
      if (code == ActionParticipantType.HEALTHCARESERVICE)
        return "healthcareservice";
      if (code == ActionParticipantType.LOCATION)
        return "location";
      if (code == ActionParticipantType.ORGANIZATION)
        return "organization";
      if (code == ActionParticipantType.PATIENT)
        return "patient";
      if (code == ActionParticipantType.PRACTITIONER)
        return "practitioner";
      if (code == ActionParticipantType.PRACTITIONERROLE)
        return "practitionerrole";
      if (code == ActionParticipantType.RELATEDPERSON)
        return "relatedperson";
      return "?";
      }
    public String toSystem(ActionParticipantType code) {
      return code.getSystem();
      }
    }

    public enum ActionPrecheckBehavior {
        /**
         * An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider "pre-checking" such an action as a convenience for the user.
         */
        YES, 
        /**
         * An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not "pre-check" such an action.
         */
        NO, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionPrecheckBehavior fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("yes".equals(codeString))
          return YES;
        if ("no".equals(codeString))
          return NO;
        throw new FHIRException("Unknown ActionPrecheckBehavior code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "yes", "no");
        }
        public String toCode() {
          switch (this) {
            case YES: return "yes";
            case NO: return "no";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case YES: return "http://hl7.org/fhir/action-precheck-behavior";
            case NO: return "http://hl7.org/fhir/action-precheck-behavior";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case YES: return "An action with this behavior is one of the most frequent action that is, or should be, included by an end user, for the particular context in which the action occurs. The system displaying the action to the end user should consider \"pre-checking\" such an action as a convenience for the user.";
            case NO: return "An action with this behavior is one of the less frequent actions included by the end user, for the particular context in which the action occurs. The system displaying the actions to the end user would typically not \"pre-check\" such an action.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case YES: return "Yes";
            case NO: return "No";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionPrecheckBehaviorEnumFactory implements EnumFactory<ActionPrecheckBehavior> {
    public ActionPrecheckBehavior fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("yes".equals(codeString))
          return ActionPrecheckBehavior.YES;
        if ("no".equals(codeString))
          return ActionPrecheckBehavior.NO;
        throw new IllegalArgumentException("Unknown ActionPrecheckBehavior code '"+codeString+"'");
        }

        public Enumeration<ActionPrecheckBehavior> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionPrecheckBehavior>(this, ActionPrecheckBehavior.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionPrecheckBehavior>(this, ActionPrecheckBehavior.NULL, code);
        if ("yes".equals(codeString))
          return new Enumeration<ActionPrecheckBehavior>(this, ActionPrecheckBehavior.YES, code);
        if ("no".equals(codeString))
          return new Enumeration<ActionPrecheckBehavior>(this, ActionPrecheckBehavior.NO, code);
        throw new FHIRException("Unknown ActionPrecheckBehavior code '"+codeString+"'");
        }
    public String toCode(ActionPrecheckBehavior code) {
      if (code == ActionPrecheckBehavior.YES)
        return "yes";
      if (code == ActionPrecheckBehavior.NO)
        return "no";
      return "?";
      }
    public String toSystem(ActionPrecheckBehavior code) {
      return code.getSystem();
      }
    }

    public enum ActionRelationshipType {
        /**
         * The action must be performed before the related action.
         */
        BEFORE, 
        /**
         * The action must be performed concurrent with the related action.
         */
        CONCURRENT, 
        /**
         * The action must be performed after the related action.
         */
        AFTER, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionRelationshipType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("before".equals(codeString))
          return BEFORE;
        if ("concurrent".equals(codeString))
          return CONCURRENT;
        if ("after".equals(codeString))
          return AFTER;
        throw new FHIRException("Unknown ActionRelationshipType code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "before", "concurrent", "after");
        }
        public String toCode() {
          switch (this) {
            case BEFORE: return "before";
            case CONCURRENT: return "concurrent";
            case AFTER: return "after";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case BEFORE: return "http://hl7.org/fhir/action-relationship-type";
            case CONCURRENT: return "http://hl7.org/fhir/action-relationship-type";
            case AFTER: return "http://hl7.org/fhir/action-relationship-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case BEFORE: return "The action must be performed before the related action.";
            case CONCURRENT: return "The action must be performed concurrent with the related action.";
            case AFTER: return "The action must be performed after the related action.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case BEFORE: return "Before";
            case CONCURRENT: return "Concurrent";
            case AFTER: return "After";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionRelationshipTypeEnumFactory implements EnumFactory<ActionRelationshipType> {
    public ActionRelationshipType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("before".equals(codeString))
          return ActionRelationshipType.BEFORE;
        if ("concurrent".equals(codeString))
          return ActionRelationshipType.CONCURRENT;
        if ("after".equals(codeString))
          return ActionRelationshipType.AFTER;
        throw new IllegalArgumentException("Unknown ActionRelationshipType code '"+codeString+"'");
        }

        public Enumeration<ActionRelationshipType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionRelationshipType>(this, ActionRelationshipType.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionRelationshipType>(this, ActionRelationshipType.NULL, code);
        if ("before".equals(codeString))
          return new Enumeration<ActionRelationshipType>(this, ActionRelationshipType.BEFORE, code);
        if ("concurrent".equals(codeString))
          return new Enumeration<ActionRelationshipType>(this, ActionRelationshipType.CONCURRENT, code);
        if ("after".equals(codeString))
          return new Enumeration<ActionRelationshipType>(this, ActionRelationshipType.AFTER, code);
        throw new FHIRException("Unknown ActionRelationshipType code '"+codeString+"'");
        }
    public String toCode(ActionRelationshipType code) {
      if (code == ActionRelationshipType.BEFORE)
        return "before";
      if (code == ActionRelationshipType.CONCURRENT)
        return "concurrent";
      if (code == ActionRelationshipType.AFTER)
        return "after";
      return "?";
      }
    public String toSystem(ActionRelationshipType code) {
      return code.getSystem();
      }
    }

    public enum ActionRequiredBehavior {
        /**
         * An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action.
         */
        MUST, 
        /**
         * An action with this behavior may be included in the set of actions processed by the end user.
         */
        COULD, 
        /**
         * An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included.
         */
        MUSTUNLESSDOCUMENTED, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionRequiredBehavior fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("must".equals(codeString))
          return MUST;
        if ("could".equals(codeString))
          return COULD;
        if ("must-unless-documented".equals(codeString))
          return MUSTUNLESSDOCUMENTED;
        throw new FHIRException("Unknown ActionRequiredBehavior code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "must", "could", "must-unless-documented");
        }
        public String toCode() {
          switch (this) {
            case MUST: return "must";
            case COULD: return "could";
            case MUSTUNLESSDOCUMENTED: return "must-unless-documented";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MUST: return "http://hl7.org/fhir/action-required-behavior";
            case COULD: return "http://hl7.org/fhir/action-required-behavior";
            case MUSTUNLESSDOCUMENTED: return "http://hl7.org/fhir/action-required-behavior";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MUST: return "An action with this behavior must be included in the actions processed by the end user; the end user SHALL NOT choose not to include this action.";
            case COULD: return "An action with this behavior may be included in the set of actions processed by the end user.";
            case MUSTUNLESSDOCUMENTED: return "An action with this behavior must be included in the set of actions processed by the end user, unless the end user provides documentation as to why the action was not included.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MUST: return "Must";
            case COULD: return "Could";
            case MUSTUNLESSDOCUMENTED: return "Must Unless Documented";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionRequiredBehaviorEnumFactory implements EnumFactory<ActionRequiredBehavior> {
    public ActionRequiredBehavior fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("must".equals(codeString))
          return ActionRequiredBehavior.MUST;
        if ("could".equals(codeString))
          return ActionRequiredBehavior.COULD;
        if ("must-unless-documented".equals(codeString))
          return ActionRequiredBehavior.MUSTUNLESSDOCUMENTED;
        throw new IllegalArgumentException("Unknown ActionRequiredBehavior code '"+codeString+"'");
        }

        public Enumeration<ActionRequiredBehavior> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionRequiredBehavior>(this, ActionRequiredBehavior.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionRequiredBehavior>(this, ActionRequiredBehavior.NULL, code);
        if ("must".equals(codeString))
          return new Enumeration<ActionRequiredBehavior>(this, ActionRequiredBehavior.MUST, code);
        if ("could".equals(codeString))
          return new Enumeration<ActionRequiredBehavior>(this, ActionRequiredBehavior.COULD, code);
        if ("must-unless-documented".equals(codeString))
          return new Enumeration<ActionRequiredBehavior>(this, ActionRequiredBehavior.MUSTUNLESSDOCUMENTED, code);
        throw new FHIRException("Unknown ActionRequiredBehavior code '"+codeString+"'");
        }
    public String toCode(ActionRequiredBehavior code) {
      if (code == ActionRequiredBehavior.MUST)
        return "must";
      if (code == ActionRequiredBehavior.COULD)
        return "could";
      if (code == ActionRequiredBehavior.MUSTUNLESSDOCUMENTED)
        return "must-unless-documented";
      return "?";
      }
    public String toSystem(ActionRequiredBehavior code) {
      return code.getSystem();
      }
    }

    public enum ActionSelectionBehavior {
        /**
         * Any number of the actions in the group may be chosen, from zero to all.
         */
        ANY, 
        /**
         * All the actions in the group must be selected as a single unit.
         */
        ALL, 
        /**
         * All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.
         */
        ALLORNONE, 
        /**
         * The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.
         */
        EXACTLYONE, 
        /**
         * The end user may choose zero or at most one of the actions in the group.
         */
        ATMOSTONE, 
        /**
         * The end user must choose a minimum of one, and as many additional as desired.
         */
        ONEORMORE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActionSelectionBehavior fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("any".equals(codeString))
          return ANY;
        if ("all".equals(codeString))
          return ALL;
        if ("all-or-none".equals(codeString))
          return ALLORNONE;
        if ("exactly-one".equals(codeString))
          return EXACTLYONE;
        if ("at-most-one".equals(codeString))
          return ATMOSTONE;
        if ("one-or-more".equals(codeString))
          return ONEORMORE;
        throw new FHIRException("Unknown ActionSelectionBehavior code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "any", "all", "all-or-none", "exactly-one", "at-most-one", "one-or-more");
        }
        public String toCode() {
          switch (this) {
            case ANY: return "any";
            case ALL: return "all";
            case ALLORNONE: return "all-or-none";
            case EXACTLYONE: return "exactly-one";
            case ATMOSTONE: return "at-most-one";
            case ONEORMORE: return "one-or-more";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ANY: return "http://hl7.org/fhir/action-selection-behavior";
            case ALL: return "http://hl7.org/fhir/action-selection-behavior";
            case ALLORNONE: return "http://hl7.org/fhir/action-selection-behavior";
            case EXACTLYONE: return "http://hl7.org/fhir/action-selection-behavior";
            case ATMOSTONE: return "http://hl7.org/fhir/action-selection-behavior";
            case ONEORMORE: return "http://hl7.org/fhir/action-selection-behavior";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ANY: return "Any number of the actions in the group may be chosen, from zero to all.";
            case ALL: return "All the actions in the group must be selected as a single unit.";
            case ALLORNONE: return "All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.";
            case EXACTLYONE: return "The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.";
            case ATMOSTONE: return "The end user may choose zero or at most one of the actions in the group.";
            case ONEORMORE: return "The end user must choose a minimum of one, and as many additional as desired.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ANY: return "Any";
            case ALL: return "All";
            case ALLORNONE: return "All Or None";
            case EXACTLYONE: return "Exactly One";
            case ATMOSTONE: return "At Most One";
            case ONEORMORE: return "One Or More";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActionSelectionBehaviorEnumFactory implements EnumFactory<ActionSelectionBehavior> {
    public ActionSelectionBehavior fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("any".equals(codeString))
          return ActionSelectionBehavior.ANY;
        if ("all".equals(codeString))
          return ActionSelectionBehavior.ALL;
        if ("all-or-none".equals(codeString))
          return ActionSelectionBehavior.ALLORNONE;
        if ("exactly-one".equals(codeString))
          return ActionSelectionBehavior.EXACTLYONE;
        if ("at-most-one".equals(codeString))
          return ActionSelectionBehavior.ATMOSTONE;
        if ("one-or-more".equals(codeString))
          return ActionSelectionBehavior.ONEORMORE;
        throw new IllegalArgumentException("Unknown ActionSelectionBehavior code '"+codeString+"'");
        }

        public Enumeration<ActionSelectionBehavior> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.NULL, code);
        if ("any".equals(codeString))
          return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.ANY, code);
        if ("all".equals(codeString))
          return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.ALL, code);
        if ("all-or-none".equals(codeString))
          return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.ALLORNONE, code);
        if ("exactly-one".equals(codeString))
          return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.EXACTLYONE, code);
        if ("at-most-one".equals(codeString))
          return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.ATMOSTONE, code);
        if ("one-or-more".equals(codeString))
          return new Enumeration<ActionSelectionBehavior>(this, ActionSelectionBehavior.ONEORMORE, code);
        throw new FHIRException("Unknown ActionSelectionBehavior code '"+codeString+"'");
        }
    public String toCode(ActionSelectionBehavior code) {
      if (code == ActionSelectionBehavior.ANY)
        return "any";
      if (code == ActionSelectionBehavior.ALL)
        return "all";
      if (code == ActionSelectionBehavior.ALLORNONE)
        return "all-or-none";
      if (code == ActionSelectionBehavior.EXACTLYONE)
        return "exactly-one";
      if (code == ActionSelectionBehavior.ATMOSTONE)
        return "at-most-one";
      if (code == ActionSelectionBehavior.ONEORMORE)
        return "one-or-more";
      return "?";
      }
    public String toSystem(ActionSelectionBehavior code) {
      return code.getSystem();
      }
    }

    public enum ActorDefinitionActorType {
        /**
         * A human being acting directly.
         */
        PERSON, 
        /**
         * A software application or collection of such applications functioning as or represented as a single entity.  (This would be instantiated in FHIR as a Device.)
         */
        SYSTEM, 
        /**
         * A group of people or animals
         */
        COLLECTIVE, 
        /**
         * Some other kind of actor
         */
        OTHER, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ActorDefinitionActorType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("person".equals(codeString))
          return PERSON;
        if ("system".equals(codeString))
          return SYSTEM;
        if ("collective".equals(codeString))
          return COLLECTIVE;
        if ("other".equals(codeString))
          return OTHER;
        throw new FHIRException("Unknown ActorDefinitionActorType code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "person", "system", "collective", "other");
        }
        public String toCode() {
          switch (this) {
            case PERSON: return "person";
            case SYSTEM: return "system";
            case COLLECTIVE: return "collective";
            case OTHER: return "other";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PERSON: return "http://hl7.org/fhir/actordefinition-actor-type";
            case SYSTEM: return "http://hl7.org/fhir/actordefinition-actor-type";
            case COLLECTIVE: return "http://hl7.org/fhir/actordefinition-actor-type";
            case OTHER: return "http://hl7.org/fhir/actordefinition-actor-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PERSON: return "A human being acting directly.";
            case SYSTEM: return "A software application or collection of such applications functioning as or represented as a single entity.  (This would be instantiated in FHIR as a Device.)";
            case COLLECTIVE: return "A group of people or animals";
            case OTHER: return "Some other kind of actor";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PERSON: return "Person";
            case SYSTEM: return "System";
            case COLLECTIVE: return "Collective";
            case OTHER: return "Other";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ActorDefinitionActorTypeEnumFactory implements EnumFactory<ActorDefinitionActorType> {
    public ActorDefinitionActorType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("person".equals(codeString))
          return ActorDefinitionActorType.PERSON;
        if ("system".equals(codeString))
          return ActorDefinitionActorType.SYSTEM;
        if ("collective".equals(codeString))
          return ActorDefinitionActorType.COLLECTIVE;
        if ("other".equals(codeString))
          return ActorDefinitionActorType.OTHER;
        throw new IllegalArgumentException("Unknown ActorDefinitionActorType code '"+codeString+"'");
        }

        public Enumeration<ActorDefinitionActorType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ActorDefinitionActorType>(this, ActorDefinitionActorType.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ActorDefinitionActorType>(this, ActorDefinitionActorType.NULL, code);
        if ("person".equals(codeString))
          return new Enumeration<ActorDefinitionActorType>(this, ActorDefinitionActorType.PERSON, code);
        if ("system".equals(codeString))
          return new Enumeration<ActorDefinitionActorType>(this, ActorDefinitionActorType.SYSTEM, code);
        if ("collective".equals(codeString))
          return new Enumeration<ActorDefinitionActorType>(this, ActorDefinitionActorType.COLLECTIVE, code);
        if ("other".equals(codeString))
          return new Enumeration<ActorDefinitionActorType>(this, ActorDefinitionActorType.OTHER, code);
        throw new FHIRException("Unknown ActorDefinitionActorType code '"+codeString+"'");
        }
    public String toCode(ActorDefinitionActorType code) {
      if (code == ActorDefinitionActorType.PERSON)
        return "person";
      if (code == ActorDefinitionActorType.SYSTEM)
        return "system";
      if (code == ActorDefinitionActorType.COLLECTIVE)
        return "collective";
      if (code == ActorDefinitionActorType.OTHER)
        return "other";
      return "?";
      }
    public String toSystem(ActorDefinitionActorType code) {
      return code.getSystem();
      }
    }

    public enum AdministrativeGender {
        /**
         * Male.
         */
        MALE, 
        /**
         * Female.
         */
        FEMALE, 
        /**
         * Other.
         */
        OTHER, 
        /**
         * Unknown.
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static AdministrativeGender fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("male".equals(codeString))
          return MALE;
        if ("female".equals(codeString))
          return FEMALE;
        if ("other".equals(codeString))
          return OTHER;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        throw new FHIRException("Unknown AdministrativeGender code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "male", "female", "other", "unknown");
        }
        public String toCode() {
          switch (this) {
            case MALE: return "male";
            case FEMALE: return "female";
            case OTHER: return "other";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MALE: return "http://hl7.org/fhir/administrative-gender";
            case FEMALE: return "http://hl7.org/fhir/administrative-gender";
            case OTHER: return "http://hl7.org/fhir/administrative-gender";
            case UNKNOWN: return "http://hl7.org/fhir/administrative-gender";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MALE: return "Male.";
            case FEMALE: return "Female.";
            case OTHER: return "Other.";
            case UNKNOWN: return "Unknown.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MALE: return "Male";
            case FEMALE: return "Female";
            case OTHER: return "Other";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class AdministrativeGenderEnumFactory implements EnumFactory<AdministrativeGender> {
    public AdministrativeGender fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("male".equals(codeString))
          return AdministrativeGender.MALE;
        if ("female".equals(codeString))
          return AdministrativeGender.FEMALE;
        if ("other".equals(codeString))
          return AdministrativeGender.OTHER;
        if ("unknown".equals(codeString))
          return AdministrativeGender.UNKNOWN;
        throw new IllegalArgumentException("Unknown AdministrativeGender code '"+codeString+"'");
        }

        public Enumeration<AdministrativeGender> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<AdministrativeGender>(this, AdministrativeGender.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<AdministrativeGender>(this, AdministrativeGender.NULL, code);
        if ("male".equals(codeString))
          return new Enumeration<AdministrativeGender>(this, AdministrativeGender.MALE, code);
        if ("female".equals(codeString))
          return new Enumeration<AdministrativeGender>(this, AdministrativeGender.FEMALE, code);
        if ("other".equals(codeString))
          return new Enumeration<AdministrativeGender>(this, AdministrativeGender.OTHER, code);
        if ("unknown".equals(codeString))
          return new Enumeration<AdministrativeGender>(this, AdministrativeGender.UNKNOWN, code);
        throw new FHIRException("Unknown AdministrativeGender code '"+codeString+"'");
        }
    public String toCode(AdministrativeGender code) {
      if (code == AdministrativeGender.MALE)
        return "male";
      if (code == AdministrativeGender.FEMALE)
        return "female";
      if (code == AdministrativeGender.OTHER)
        return "other";
      if (code == AdministrativeGender.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(AdministrativeGender code) {
      return code.getSystem();
      }
    }

    public enum AllLanguages {
        /**
         * added to help the parsers
         */
        NULL;
        public static AllLanguages fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        throw new FHIRException("Unknown AllLanguages code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString);
        }
        public String toCode() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class AllLanguagesEnumFactory implements EnumFactory<AllLanguages> {
    public AllLanguages fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        throw new IllegalArgumentException("Unknown AllLanguages code '"+codeString+"'");
        }

        public Enumeration<AllLanguages> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<AllLanguages>(this, AllLanguages.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<AllLanguages>(this, AllLanguages.NULL, code);
        throw new FHIRException("Unknown AllLanguages code '"+codeString+"'");
        }
    public String toCode(AllLanguages code) {
      return "?";
      }
    public String toSystem(AllLanguages code) {
      return code.getSystem();
      }
    }

    public enum BindingStrength {
        /**
         * To be conformant, the concept in this element SHALL be from the specified value set.
         */
        REQUIRED, 
        /**
         * To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
         */
        EXTENSIBLE, 
        /**
         * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
         */
        PREFERRED, 
        /**
         * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
         */
        EXAMPLE, 
        /**
         * There is no constraint on the allowed set of codes at the root level, though there may be additional bindings that apply in certain contexts.  The root binding element will be a description that gives guidance on potential downstream constraint of the allowed codes and/or highlights the presence of additional bindings.
         */
        DESCRIPTIVE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static BindingStrength fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("required".equals(codeString))
          return REQUIRED;
        if ("extensible".equals(codeString))
          return EXTENSIBLE;
        if ("preferred".equals(codeString))
          return PREFERRED;
        if ("example".equals(codeString))
          return EXAMPLE;
        if ("descriptive".equals(codeString))
          return DESCRIPTIVE;
        throw new FHIRException("Unknown BindingStrength code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "required", "extensible", "preferred", "example", "descriptive");
        }
        public String toCode() {
          switch (this) {
            case REQUIRED: return "required";
            case EXTENSIBLE: return "extensible";
            case PREFERRED: return "preferred";
            case EXAMPLE: return "example";
            case DESCRIPTIVE: return "descriptive";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case REQUIRED: return "http://hl7.org/fhir/binding-strength";
            case EXTENSIBLE: return "http://hl7.org/fhir/binding-strength";
            case PREFERRED: return "http://hl7.org/fhir/binding-strength";
            case EXAMPLE: return "http://hl7.org/fhir/binding-strength";
            case DESCRIPTIVE: return "http://hl7.org/fhir/binding-strength";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case REQUIRED: return "To be conformant, the concept in this element SHALL be from the specified value set.";
            case EXTENSIBLE: return "To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.";
            case PREFERRED: return "Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.";
            case EXAMPLE: return "Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.";
            case DESCRIPTIVE: return "There is no constraint on the allowed set of codes at the root level, though there may be additional bindings that apply in certain contexts.  The root binding element will be a description that gives guidance on potential downstream constraint of the allowed codes and/or highlights the presence of additional bindings.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case REQUIRED: return "Required";
            case EXTENSIBLE: return "Extensible";
            case PREFERRED: return "Preferred";
            case EXAMPLE: return "Example";
            case DESCRIPTIVE: return "descriptive";
            case NULL: return null;
            default: return "?";
          }
        }
        public boolean testable() {
          return this == REQUIRED || this == EXTENSIBLE;
        }
    }

  public static class BindingStrengthEnumFactory implements EnumFactory<BindingStrength> {
    public BindingStrength fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("required".equals(codeString))
          return BindingStrength.REQUIRED;
        if ("extensible".equals(codeString))
          return BindingStrength.EXTENSIBLE;
        if ("preferred".equals(codeString))
          return BindingStrength.PREFERRED;
        if ("example".equals(codeString))
          return BindingStrength.EXAMPLE;
        if ("descriptive".equals(codeString))
          return BindingStrength.DESCRIPTIVE;
        throw new IllegalArgumentException("Unknown BindingStrength code '"+codeString+"'");
        }

        public Enumeration<BindingStrength> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<BindingStrength>(this, BindingStrength.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<BindingStrength>(this, BindingStrength.NULL, code);
        if ("required".equals(codeString))
          return new Enumeration<BindingStrength>(this, BindingStrength.REQUIRED, code);
        if ("extensible".equals(codeString))
          return new Enumeration<BindingStrength>(this, BindingStrength.EXTENSIBLE, code);
        if ("preferred".equals(codeString))
          return new Enumeration<BindingStrength>(this, BindingStrength.PREFERRED, code);
        if ("example".equals(codeString))
          return new Enumeration<BindingStrength>(this, BindingStrength.EXAMPLE, code);
        if ("descriptive".equals(codeString))
          return new Enumeration<BindingStrength>(this, BindingStrength.DESCRIPTIVE, code);
        throw new FHIRException("Unknown BindingStrength code '"+codeString+"'");
        }
    public String toCode(BindingStrength code) {
      if (code == BindingStrength.REQUIRED)
        return "required";
      if (code == BindingStrength.EXTENSIBLE)
        return "extensible";
      if (code == BindingStrength.PREFERRED)
        return "preferred";
      if (code == BindingStrength.EXAMPLE)
        return "example";
      if (code == BindingStrength.DESCRIPTIVE)
        return "descriptive";
      return "?";
      }
    public String toSystem(BindingStrength code) {
      return code.getSystem();
      }
    }

    public enum CapabilityStatementKind {
        /**
         * The CapabilityStatement instance represents the present capabilities of a specific system instance.  This is the kind returned by /metadata for a FHIR server end-point.
         */
        INSTANCE, 
        /**
         * The CapabilityStatement instance represents the capabilities of a system or piece of software, independent of a particular installation.
         */
        CAPABILITY, 
        /**
         * The CapabilityStatement instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
         */
        REQUIREMENTS, 
        /**
         * added to help the parsers
         */
        NULL;
        public static CapabilityStatementKind fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("instance".equals(codeString))
          return INSTANCE;
        if ("capability".equals(codeString))
          return CAPABILITY;
        if ("requirements".equals(codeString))
          return REQUIREMENTS;
        throw new FHIRException("Unknown CapabilityStatementKind code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "instance", "capability", "requirements");
        }
        public String toCode() {
          switch (this) {
            case INSTANCE: return "instance";
            case CAPABILITY: return "capability";
            case REQUIREMENTS: return "requirements";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case INSTANCE: return "http://hl7.org/fhir/capability-statement-kind";
            case CAPABILITY: return "http://hl7.org/fhir/capability-statement-kind";
            case REQUIREMENTS: return "http://hl7.org/fhir/capability-statement-kind";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case INSTANCE: return "The CapabilityStatement instance represents the present capabilities of a specific system instance.  This is the kind returned by /metadata for a FHIR server end-point.";
            case CAPABILITY: return "The CapabilityStatement instance represents the capabilities of a system or piece of software, independent of a particular installation.";
            case REQUIREMENTS: return "The CapabilityStatement instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case INSTANCE: return "Instance";
            case CAPABILITY: return "Capability";
            case REQUIREMENTS: return "Requirements";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class CapabilityStatementKindEnumFactory implements EnumFactory<CapabilityStatementKind> {
    public CapabilityStatementKind fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("instance".equals(codeString))
          return CapabilityStatementKind.INSTANCE;
        if ("capability".equals(codeString))
          return CapabilityStatementKind.CAPABILITY;
        if ("requirements".equals(codeString))
          return CapabilityStatementKind.REQUIREMENTS;
        throw new IllegalArgumentException("Unknown CapabilityStatementKind code '"+codeString+"'");
        }

        public Enumeration<CapabilityStatementKind> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CapabilityStatementKind>(this, CapabilityStatementKind.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<CapabilityStatementKind>(this, CapabilityStatementKind.NULL, code);
        if ("instance".equals(codeString))
          return new Enumeration<CapabilityStatementKind>(this, CapabilityStatementKind.INSTANCE, code);
        if ("capability".equals(codeString))
          return new Enumeration<CapabilityStatementKind>(this, CapabilityStatementKind.CAPABILITY, code);
        if ("requirements".equals(codeString))
          return new Enumeration<CapabilityStatementKind>(this, CapabilityStatementKind.REQUIREMENTS, code);
        throw new FHIRException("Unknown CapabilityStatementKind code '"+codeString+"'");
        }
    public String toCode(CapabilityStatementKind code) {
      if (code == CapabilityStatementKind.INSTANCE)
        return "instance";
      if (code == CapabilityStatementKind.CAPABILITY)
        return "capability";
      if (code == CapabilityStatementKind.REQUIREMENTS)
        return "requirements";
      return "?";
      }
    public String toSystem(CapabilityStatementKind code) {
      return code.getSystem();
      }
    }

    public enum ClaimProcessingCodes {
        /**
         * The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.
         */
        QUEUED, 
        /**
         * The processing has completed without errors
         */
        COMPLETE, 
        /**
         * One or more errors have been detected in the Claim
         */
        ERROR, 
        /**
         * No errors have been detected in the Claim and some of the adjudication has been performed.
         */
        PARTIAL, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ClaimProcessingCodes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("queued".equals(codeString))
          return QUEUED;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("error".equals(codeString))
          return ERROR;
        if ("partial".equals(codeString))
          return PARTIAL;
        throw new FHIRException("Unknown ClaimProcessingCodes code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "queued", "complete", "error", "partial");
        }
        public String toCode() {
          switch (this) {
            case QUEUED: return "queued";
            case COMPLETE: return "complete";
            case ERROR: return "error";
            case PARTIAL: return "partial";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case QUEUED: return "http://hl7.org/fhir/claim-outcome";
            case COMPLETE: return "http://hl7.org/fhir/claim-outcome";
            case ERROR: return "http://hl7.org/fhir/claim-outcome";
            case PARTIAL: return "http://hl7.org/fhir/claim-outcome";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case QUEUED: return "The Claim/Pre-authorization/Pre-determination has been received but processing has not begun.";
            case COMPLETE: return "The processing has completed without errors";
            case ERROR: return "One or more errors have been detected in the Claim";
            case PARTIAL: return "No errors have been detected in the Claim and some of the adjudication has been performed.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case QUEUED: return "Queued";
            case COMPLETE: return "Processing Complete";
            case ERROR: return "Error";
            case PARTIAL: return "Partial Processing";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ClaimProcessingCodesEnumFactory implements EnumFactory<ClaimProcessingCodes> {
    public ClaimProcessingCodes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("queued".equals(codeString))
          return ClaimProcessingCodes.QUEUED;
        if ("complete".equals(codeString))
          return ClaimProcessingCodes.COMPLETE;
        if ("error".equals(codeString))
          return ClaimProcessingCodes.ERROR;
        if ("partial".equals(codeString))
          return ClaimProcessingCodes.PARTIAL;
        throw new IllegalArgumentException("Unknown ClaimProcessingCodes code '"+codeString+"'");
        }

        public Enumeration<ClaimProcessingCodes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ClaimProcessingCodes>(this, ClaimProcessingCodes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ClaimProcessingCodes>(this, ClaimProcessingCodes.NULL, code);
        if ("queued".equals(codeString))
          return new Enumeration<ClaimProcessingCodes>(this, ClaimProcessingCodes.QUEUED, code);
        if ("complete".equals(codeString))
          return new Enumeration<ClaimProcessingCodes>(this, ClaimProcessingCodes.COMPLETE, code);
        if ("error".equals(codeString))
          return new Enumeration<ClaimProcessingCodes>(this, ClaimProcessingCodes.ERROR, code);
        if ("partial".equals(codeString))
          return new Enumeration<ClaimProcessingCodes>(this, ClaimProcessingCodes.PARTIAL, code);
        throw new FHIRException("Unknown ClaimProcessingCodes code '"+codeString+"'");
        }
    public String toCode(ClaimProcessingCodes code) {
      if (code == ClaimProcessingCodes.QUEUED)
        return "queued";
      if (code == ClaimProcessingCodes.COMPLETE)
        return "complete";
      if (code == ClaimProcessingCodes.ERROR)
        return "error";
      if (code == ClaimProcessingCodes.PARTIAL)
        return "partial";
      return "?";
      }
    public String toSystem(ClaimProcessingCodes code) {
      return code.getSystem();
      }
    }

    public enum CodeSystemContentMode {
        /**
         * None of the concepts defined by the code system are included in the code system resource.
         */
        NOTPRESENT, 
        /**
         * A subset of the valid externally defined concepts are included in the code system resource. There is no specific purpose or documented intent other than for illustrative purposes. This example content mode should not be used if the content is better represented in a fragment.
         */
        EXAMPLE, 
        /**
         * A subset of the code system concepts that are included in the code system resource. This is a curated subset released for a specific purpose.
         */
        FRAGMENT, 
        /**
         * All the concepts defined by the code system are included in the code system resource.
         */
        COMPLETE, 
        /**
         * The resource doesn't define any new concepts; it just provides additional designations and properties to another code system.
         */
        SUPPLEMENT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static CodeSystemContentMode fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-present".equals(codeString))
          return NOTPRESENT;
        if ("example".equals(codeString))
          return EXAMPLE;
        if ("fragment".equals(codeString))
          return FRAGMENT;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("supplement".equals(codeString))
          return SUPPLEMENT;
        throw new FHIRException("Unknown CodeSystemContentMode code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "not-present", "example", "fragment", "complete", "supplement");
        }
        public String toCode() {
          switch (this) {
            case NOTPRESENT: return "not-present";
            case EXAMPLE: return "example";
            case FRAGMENT: return "fragment";
            case COMPLETE: return "complete";
            case SUPPLEMENT: return "supplement";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NOTPRESENT: return "http://hl7.org/fhir/codesystem-content-mode";
            case EXAMPLE: return "http://hl7.org/fhir/codesystem-content-mode";
            case FRAGMENT: return "http://hl7.org/fhir/codesystem-content-mode";
            case COMPLETE: return "http://hl7.org/fhir/codesystem-content-mode";
            case SUPPLEMENT: return "http://hl7.org/fhir/codesystem-content-mode";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NOTPRESENT: return "None of the concepts defined by the code system are included in the code system resource.";
            case EXAMPLE: return "A subset of the valid externally defined concepts are included in the code system resource. There is no specific purpose or documented intent other than for illustrative purposes. This example content mode should not be used if the content is better represented in a fragment.";
            case FRAGMENT: return "A subset of the code system concepts that are included in the code system resource. This is a curated subset released for a specific purpose.";
            case COMPLETE: return "All the concepts defined by the code system are included in the code system resource.";
            case SUPPLEMENT: return "The resource doesn't define any new concepts; it just provides additional designations and properties to another code system.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NOTPRESENT: return "Not Present";
            case EXAMPLE: return "Example";
            case FRAGMENT: return "Fragment";
            case COMPLETE: return "Complete";
            case SUPPLEMENT: return "Supplement";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class CodeSystemContentModeEnumFactory implements EnumFactory<CodeSystemContentMode> {
    public CodeSystemContentMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-present".equals(codeString))
          return CodeSystemContentMode.NOTPRESENT;
        if ("example".equals(codeString))
          return CodeSystemContentMode.EXAMPLE;
        if ("fragment".equals(codeString))
          return CodeSystemContentMode.FRAGMENT;
        if ("complete".equals(codeString))
          return CodeSystemContentMode.COMPLETE;
        if ("supplement".equals(codeString))
          return CodeSystemContentMode.SUPPLEMENT;
        throw new IllegalArgumentException("Unknown CodeSystemContentMode code '"+codeString+"'");
        }

        public Enumeration<CodeSystemContentMode> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.NULL, code);
        if ("not-present".equals(codeString))
          return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.NOTPRESENT, code);
        if ("example".equals(codeString))
          return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.EXAMPLE, code);
        if ("fragment".equals(codeString))
          return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.FRAGMENT, code);
        if ("complete".equals(codeString))
          return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.COMPLETE, code);
        if ("supplement".equals(codeString))
          return new Enumeration<CodeSystemContentMode>(this, CodeSystemContentMode.SUPPLEMENT, code);
        throw new FHIRException("Unknown CodeSystemContentMode code '"+codeString+"'");
        }
    public String toCode(CodeSystemContentMode code) {
      if (code == CodeSystemContentMode.NOTPRESENT)
        return "not-present";
      if (code == CodeSystemContentMode.EXAMPLE)
        return "example";
      if (code == CodeSystemContentMode.FRAGMENT)
        return "fragment";
      if (code == CodeSystemContentMode.COMPLETE)
        return "complete";
      if (code == CodeSystemContentMode.SUPPLEMENT)
        return "supplement";
      return "?";
      }
    public String toSystem(CodeSystemContentMode code) {
      return code.getSystem();
      }
    }

    public enum CompartmentType {
        /**
         * The compartment definition is for the patient compartment.
         */
        PATIENT, 
        /**
         * The compartment definition is for the encounter compartment.
         */
        ENCOUNTER, 
        /**
         * The compartment definition is for the related-person compartment.
         */
        RELATEDPERSON, 
        /**
         * The compartment definition is for the practitioner compartment.
         */
        PRACTITIONER, 
        /**
         * The compartment definition is for the device compartment.
         */
        DEVICE, 
        /**
         * The compartment definition is for the episodeofcare compartment.
         */
        EPISODEOFCARE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static CompartmentType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Patient".equals(codeString))
          return PATIENT;
        if ("Encounter".equals(codeString))
          return ENCOUNTER;
        if ("RelatedPerson".equals(codeString))
          return RELATEDPERSON;
        if ("Practitioner".equals(codeString))
          return PRACTITIONER;
        if ("Device".equals(codeString))
          return DEVICE;
        if ("EpisodeOfCare".equals(codeString))
          return EPISODEOFCARE;
        throw new FHIRException("Unknown CompartmentType code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "Patient", "Encounter", "RelatedPerson", "Practitioner", "Device", "EpisodeOfCare");
        }
        public String toCode() {
          switch (this) {
            case PATIENT: return "Patient";
            case ENCOUNTER: return "Encounter";
            case RELATEDPERSON: return "RelatedPerson";
            case PRACTITIONER: return "Practitioner";
            case DEVICE: return "Device";
            case EPISODEOFCARE: return "EpisodeOfCare";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PATIENT: return "http://hl7.org/fhir/compartment-type";
            case ENCOUNTER: return "http://hl7.org/fhir/compartment-type";
            case RELATEDPERSON: return "http://hl7.org/fhir/compartment-type";
            case PRACTITIONER: return "http://hl7.org/fhir/compartment-type";
            case DEVICE: return "http://hl7.org/fhir/compartment-type";
            case EPISODEOFCARE: return "http://hl7.org/fhir/compartment-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PATIENT: return "The compartment definition is for the patient compartment.";
            case ENCOUNTER: return "The compartment definition is for the encounter compartment.";
            case RELATEDPERSON: return "The compartment definition is for the related-person compartment.";
            case PRACTITIONER: return "The compartment definition is for the practitioner compartment.";
            case DEVICE: return "The compartment definition is for the device compartment.";
            case EPISODEOFCARE: return "The compartment definition is for the episodeofcare compartment.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PATIENT: return "Patient";
            case ENCOUNTER: return "Encounter";
            case RELATEDPERSON: return "RelatedPerson";
            case PRACTITIONER: return "Practitioner";
            case DEVICE: return "Device";
            case EPISODEOFCARE: return "EpisodeOfCare";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class CompartmentTypeEnumFactory implements EnumFactory<CompartmentType> {
    public CompartmentType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Patient".equals(codeString))
          return CompartmentType.PATIENT;
        if ("Encounter".equals(codeString))
          return CompartmentType.ENCOUNTER;
        if ("RelatedPerson".equals(codeString))
          return CompartmentType.RELATEDPERSON;
        if ("Practitioner".equals(codeString))
          return CompartmentType.PRACTITIONER;
        if ("Device".equals(codeString))
          return CompartmentType.DEVICE;
        if ("EpisodeOfCare".equals(codeString))
          return CompartmentType.EPISODEOFCARE;
        throw new IllegalArgumentException("Unknown CompartmentType code '"+codeString+"'");
        }

        public Enumeration<CompartmentType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CompartmentType>(this, CompartmentType.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<CompartmentType>(this, CompartmentType.NULL, code);
        if ("Patient".equals(codeString))
          return new Enumeration<CompartmentType>(this, CompartmentType.PATIENT, code);
        if ("Encounter".equals(codeString))
          return new Enumeration<CompartmentType>(this, CompartmentType.ENCOUNTER, code);
        if ("RelatedPerson".equals(codeString))
          return new Enumeration<CompartmentType>(this, CompartmentType.RELATEDPERSON, code);
        if ("Practitioner".equals(codeString))
          return new Enumeration<CompartmentType>(this, CompartmentType.PRACTITIONER, code);
        if ("Device".equals(codeString))
          return new Enumeration<CompartmentType>(this, CompartmentType.DEVICE, code);
        if ("EpisodeOfCare".equals(codeString))
          return new Enumeration<CompartmentType>(this, CompartmentType.EPISODEOFCARE, code);
        throw new FHIRException("Unknown CompartmentType code '"+codeString+"'");
        }
    public String toCode(CompartmentType code) {
      if (code == CompartmentType.PATIENT)
        return "Patient";
      if (code == CompartmentType.ENCOUNTER)
        return "Encounter";
      if (code == CompartmentType.RELATEDPERSON)
        return "RelatedPerson";
      if (code == CompartmentType.PRACTITIONER)
        return "Practitioner";
      if (code == CompartmentType.DEVICE)
        return "Device";
      if (code == CompartmentType.EPISODEOFCARE)
        return "EpisodeOfCare";
      return "?";
      }
    public String toSystem(CompartmentType code) {
      return code.getSystem();
      }
    }

    public enum CompositionStatus {
        /**
         * The existence of the composition is registered, but there is nothing yet available.
         */
        REGISTERED, 
        /**
         * This is a partial (e.g. initial, interim or preliminary) composition: data in the composition may be incomplete or unverified.
         */
        PARTIAL, 
        /**
         * This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
         */
        FINAL, 
        /**
         * The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person.
         */
        AMENDED, 
        /**
         * The composition is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
         */
        CANCELLED, 
        /**
         * The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.
         */
        ENTEREDINERROR, 
        /**
         * This composition has been withdrawn or superseded and should no longer be used.
         */
        DEPRECATED, 
        /**
         * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static CompositionStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("registered".equals(codeString))
          return REGISTERED;
        if ("partial".equals(codeString))
          return PARTIAL;
        if ("final".equals(codeString))
          return FINAL;
        if ("amended".equals(codeString))
          return AMENDED;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("deprecated".equals(codeString))
          return DEPRECATED;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        throw new FHIRException("Unknown CompositionStatus code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "registered", "partial", "final", "amended", "cancelled", "entered-in-error", "deprecated", "unknown");
        }
        public String toCode() {
          switch (this) {
            case REGISTERED: return "registered";
            case PARTIAL: return "partial";
            case FINAL: return "final";
            case AMENDED: return "amended";
            case CANCELLED: return "cancelled";
            case ENTEREDINERROR: return "entered-in-error";
            case DEPRECATED: return "deprecated";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case REGISTERED: return "http://hl7.org/fhir/composition-status";
            case PARTIAL: return "http://hl7.org/fhir/composition-status";
            case FINAL: return "http://hl7.org/fhir/composition-status";
            case AMENDED: return "http://hl7.org/fhir/composition-status";
            case CANCELLED: return "http://hl7.org/fhir/composition-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/composition-status";
            case DEPRECATED: return "http://hl7.org/fhir/composition-status";
            case UNKNOWN: return "http://hl7.org/fhir/composition-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case REGISTERED: return "The existence of the composition is registered, but there is nothing yet available.";
            case PARTIAL: return "This is a partial (e.g. initial, interim or preliminary) composition: data in the composition may be incomplete or unverified.";
            case FINAL: return "This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.";
            case AMENDED: return "The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as \"final\" and the composition is complete and verified by an authorized person.";
            case CANCELLED: return "The composition is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").";
            case ENTEREDINERROR: return "The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid.";
            case DEPRECATED: return "This composition has been withdrawn or superseded and should no longer be used.";
            case UNKNOWN: return "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case REGISTERED: return "Registered";
            case PARTIAL: return "Partial";
            case FINAL: return "Final";
            case AMENDED: return "Amended";
            case CANCELLED: return "Cancelled";
            case ENTEREDINERROR: return "Entered in Error";
            case DEPRECATED: return "Deprecated";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class CompositionStatusEnumFactory implements EnumFactory<CompositionStatus> {
    public CompositionStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("registered".equals(codeString))
          return CompositionStatus.REGISTERED;
        if ("partial".equals(codeString))
          return CompositionStatus.PARTIAL;
        if ("final".equals(codeString))
          return CompositionStatus.FINAL;
        if ("amended".equals(codeString))
          return CompositionStatus.AMENDED;
        if ("cancelled".equals(codeString))
          return CompositionStatus.CANCELLED;
        if ("entered-in-error".equals(codeString))
          return CompositionStatus.ENTEREDINERROR;
        if ("deprecated".equals(codeString))
          return CompositionStatus.DEPRECATED;
        if ("unknown".equals(codeString))
          return CompositionStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown CompositionStatus code '"+codeString+"'");
        }

        public Enumeration<CompositionStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CompositionStatus>(this, CompositionStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<CompositionStatus>(this, CompositionStatus.NULL, code);
        if ("registered".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.REGISTERED, code);
        if ("partial".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.PARTIAL, code);
        if ("final".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.FINAL, code);
        if ("amended".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.AMENDED, code);
        if ("cancelled".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.CANCELLED, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.ENTEREDINERROR, code);
        if ("deprecated".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.DEPRECATED, code);
        if ("unknown".equals(codeString))
          return new Enumeration<CompositionStatus>(this, CompositionStatus.UNKNOWN, code);
        throw new FHIRException("Unknown CompositionStatus code '"+codeString+"'");
        }
    public String toCode(CompositionStatus code) {
      if (code == CompositionStatus.REGISTERED)
        return "registered";
      if (code == CompositionStatus.PARTIAL)
        return "partial";
      if (code == CompositionStatus.FINAL)
        return "final";
      if (code == CompositionStatus.AMENDED)
        return "amended";
      if (code == CompositionStatus.CANCELLED)
        return "cancelled";
      if (code == CompositionStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == CompositionStatus.DEPRECATED)
        return "deprecated";
      if (code == CompositionStatus.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(CompositionStatus code) {
      return code.getSystem();
      }
    }

    public enum ConceptMapRelationship {
        RELATEDTO,
        EQUIVALENT,
        SOURCEISNARROWERTHANTARGET,
        SOURCEISBROADERTHANTARGET,
        NOTRELATEDTO,
        NULL;
        public static ConceptMapRelationship fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString)) return null;
            if ("related-to".equals(codeString)) return RELATEDTO;
            if ("equivalent".equals(codeString)) return EQUIVALENT;
            if ("source-is-narrower-than-target".equals(codeString)) return SOURCEISNARROWERTHANTARGET;
            if ("source-is-broader-than-target".equals(codeString)) return SOURCEISBROADERTHANTARGET;
            if ("not-related-to".equals(codeString)) return NOTRELATEDTO;
            throw new FHIRException("Unknown ConceptMapRelationship code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString)) return false;
            return Utilities.existsInList(codeString, "related-to", "equivalent", "source-is-narrower-than-target", "source-is-broader-than-target", "not-related-to");
        }
        public String toCode() {
          switch (this) {
            case RELATEDTO: return "related-to";
            case EQUIVALENT: return "equivalent";
            case SOURCEISNARROWERTHANTARGET: return "source-is-narrower-than-target";
            case SOURCEISBROADERTHANTARGET: return "source-is-broader-than-target";
            case NOTRELATEDTO: return "not-related-to";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSymbol() {
          switch (this) {
            case RELATEDTO: return "-";
            case EQUIVALENT: return "=";
            case SOURCEISNARROWERTHANTARGET: return "<";
            case SOURCEISBROADERTHANTARGET: return ">";
            case NOTRELATEDTO: return "!=";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case RELATEDTO: return "http://hl7.org/fhir/concept-map-relationship";
            case NOTRELATEDTO: return "http://hl7.org/fhir/concept-map-relationship";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case RELATEDTO: return "The concepts are related to each other, but the exact relationship is not known.";
            case NOTRELATEDTO: return "This is an explicit assertion that the target concept is not related to the source concept.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case RELATEDTO: return "Related To";
            case NOTRELATEDTO: return "Not Related To";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ConceptMapRelationshipEnumFactory implements EnumFactory<ConceptMapRelationship> {
    public ConceptMapRelationship fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("related-to".equals(codeString))
          return ConceptMapRelationship.RELATEDTO;
        if ("not-related-to".equals(codeString))
          return ConceptMapRelationship.NOTRELATEDTO;
        throw new IllegalArgumentException("Unknown ConceptMapRelationship code '"+codeString+"'");
        }

        public Enumeration<ConceptMapRelationship> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ConceptMapRelationship>(this, ConceptMapRelationship.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ConceptMapRelationship>(this, ConceptMapRelationship.NULL, code);
        if ("related-to".equals(codeString))
          return new Enumeration<ConceptMapRelationship>(this, ConceptMapRelationship.RELATEDTO, code);
        if ("not-related-to".equals(codeString))
          return new Enumeration<ConceptMapRelationship>(this, ConceptMapRelationship.NOTRELATEDTO, code);
        throw new FHIRException("Unknown ConceptMapRelationship code '"+codeString+"'");
        }
    public String toCode(ConceptMapRelationship code) {
      if (code == ConceptMapRelationship.RELATEDTO)
        return "related-to";
      if (code == ConceptMapRelationship.NOTRELATEDTO)
        return "not-related-to";
      return "?";
      }
    public String toSystem(ConceptMapRelationship code) {
      return code.getSystem();
      }
    }

    public enum ConsentDataMeaning {
        /**
         * The consent applies directly to the instance of the resource.
         */
        INSTANCE, 
        /**
         * The consent applies directly to the instance of the resource and instances it refers to.
         */
        RELATED, 
        /**
         * The consent applies directly to the instance of the resource and instances that refer to it.
         */
        DEPENDENTS, 
        /**
         * The consent applies to instances of resources that are authored by.
         */
        AUTHOREDBY, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ConsentDataMeaning fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("instance".equals(codeString))
          return INSTANCE;
        if ("related".equals(codeString))
          return RELATED;
        if ("dependents".equals(codeString))
          return DEPENDENTS;
        if ("authoredby".equals(codeString))
          return AUTHOREDBY;
        throw new FHIRException("Unknown ConsentDataMeaning code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "instance", "related", "dependents", "authoredby");
        }
        public String toCode() {
          switch (this) {
            case INSTANCE: return "instance";
            case RELATED: return "related";
            case DEPENDENTS: return "dependents";
            case AUTHOREDBY: return "authoredby";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case INSTANCE: return "http://hl7.org/fhir/consent-data-meaning";
            case RELATED: return "http://hl7.org/fhir/consent-data-meaning";
            case DEPENDENTS: return "http://hl7.org/fhir/consent-data-meaning";
            case AUTHOREDBY: return "http://hl7.org/fhir/consent-data-meaning";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case INSTANCE: return "The consent applies directly to the instance of the resource.";
            case RELATED: return "The consent applies directly to the instance of the resource and instances it refers to.";
            case DEPENDENTS: return "The consent applies directly to the instance of the resource and instances that refer to it.";
            case AUTHOREDBY: return "The consent applies to instances of resources that are authored by.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case INSTANCE: return "Instance";
            case RELATED: return "Related";
            case DEPENDENTS: return "Dependents";
            case AUTHOREDBY: return "AuthoredBy";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ConsentDataMeaningEnumFactory implements EnumFactory<ConsentDataMeaning> {
    public ConsentDataMeaning fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("instance".equals(codeString))
          return ConsentDataMeaning.INSTANCE;
        if ("related".equals(codeString))
          return ConsentDataMeaning.RELATED;
        if ("dependents".equals(codeString))
          return ConsentDataMeaning.DEPENDENTS;
        if ("authoredby".equals(codeString))
          return ConsentDataMeaning.AUTHOREDBY;
        throw new IllegalArgumentException("Unknown ConsentDataMeaning code '"+codeString+"'");
        }

        public Enumeration<ConsentDataMeaning> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ConsentDataMeaning>(this, ConsentDataMeaning.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ConsentDataMeaning>(this, ConsentDataMeaning.NULL, code);
        if ("instance".equals(codeString))
          return new Enumeration<ConsentDataMeaning>(this, ConsentDataMeaning.INSTANCE, code);
        if ("related".equals(codeString))
          return new Enumeration<ConsentDataMeaning>(this, ConsentDataMeaning.RELATED, code);
        if ("dependents".equals(codeString))
          return new Enumeration<ConsentDataMeaning>(this, ConsentDataMeaning.DEPENDENTS, code);
        if ("authoredby".equals(codeString))
          return new Enumeration<ConsentDataMeaning>(this, ConsentDataMeaning.AUTHOREDBY, code);
        throw new FHIRException("Unknown ConsentDataMeaning code '"+codeString+"'");
        }
    public String toCode(ConsentDataMeaning code) {
      if (code == ConsentDataMeaning.INSTANCE)
        return "instance";
      if (code == ConsentDataMeaning.RELATED)
        return "related";
      if (code == ConsentDataMeaning.DEPENDENTS)
        return "dependents";
      if (code == ConsentDataMeaning.AUTHOREDBY)
        return "authoredby";
      return "?";
      }
    public String toSystem(ConsentDataMeaning code) {
      return code.getSystem();
      }
    }

    public enum ConsentProvisionType {
        /**
         * Consent is denied for actions meeting these rules.
         */
        DENY, 
        /**
         * Consent is provided for actions meeting these rules.
         */
        PERMIT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ConsentProvisionType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("deny".equals(codeString))
          return DENY;
        if ("permit".equals(codeString))
          return PERMIT;
        throw new FHIRException("Unknown ConsentProvisionType code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "deny", "permit");
        }
        public String toCode() {
          switch (this) {
            case DENY: return "deny";
            case PERMIT: return "permit";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case DENY: return "http://hl7.org/fhir/consent-provision-type";
            case PERMIT: return "http://hl7.org/fhir/consent-provision-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case DENY: return "Consent is denied for actions meeting these rules.";
            case PERMIT: return "Consent is provided for actions meeting these rules.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DENY: return "Deny";
            case PERMIT: return "Permit";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ConsentProvisionTypeEnumFactory implements EnumFactory<ConsentProvisionType> {
    public ConsentProvisionType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("deny".equals(codeString))
          return ConsentProvisionType.DENY;
        if ("permit".equals(codeString))
          return ConsentProvisionType.PERMIT;
        throw new IllegalArgumentException("Unknown ConsentProvisionType code '"+codeString+"'");
        }

        public Enumeration<ConsentProvisionType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ConsentProvisionType>(this, ConsentProvisionType.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ConsentProvisionType>(this, ConsentProvisionType.NULL, code);
        if ("deny".equals(codeString))
          return new Enumeration<ConsentProvisionType>(this, ConsentProvisionType.DENY, code);
        if ("permit".equals(codeString))
          return new Enumeration<ConsentProvisionType>(this, ConsentProvisionType.PERMIT, code);
        throw new FHIRException("Unknown ConsentProvisionType code '"+codeString+"'");
        }
    public String toCode(ConsentProvisionType code) {
      if (code == ConsentProvisionType.DENY)
        return "deny";
      if (code == ConsentProvisionType.PERMIT)
        return "permit";
      return "?";
      }
    public String toSystem(ConsentProvisionType code) {
      return code.getSystem();
      }
    }

    public enum Currencies {
        /**
         * null
         */
        AED, 
        /**
         * null
         */
        AFN, 
        /**
         * null
         */
        ALL, 
        /**
         * null
         */
        AMD, 
        /**
         * null
         */
        ANG, 
        /**
         * null
         */
        AOA, 
        /**
         * null
         */
        ARS, 
        /**
         * null
         */
        AUD, 
        /**
         * null
         */
        AWG, 
        /**
         * null
         */
        AZN, 
        /**
         * null
         */
        BAM, 
        /**
         * null
         */
        BBD, 
        /**
         * null
         */
        BDT, 
        /**
         * null
         */
        BGN, 
        /**
         * null
         */
        BHD, 
        /**
         * null
         */
        BIF, 
        /**
         * null
         */
        BMD, 
        /**
         * null
         */
        BND, 
        /**
         * null
         */
        BOB, 
        /**
         * null
         */
        BOV, 
        /**
         * null
         */
        BRL, 
        /**
         * null
         */
        BSD, 
        /**
         * null
         */
        BTN, 
        /**
         * null
         */
        BWP, 
        /**
         * null
         */
        BYN, 
        /**
         * null
         */
        BZD, 
        /**
         * null
         */
        CAD, 
        /**
         * null
         */
        CDF, 
        /**
         * null
         */
        CHE, 
        /**
         * null
         */
        CHF, 
        /**
         * null
         */
        CHW, 
        /**
         * null
         */
        CLF, 
        /**
         * null
         */
        CLP, 
        /**
         * null
         */
        CNY, 
        /**
         * null
         */
        COP, 
        /**
         * null
         */
        COU, 
        /**
         * null
         */
        CRC, 
        /**
         * null
         */
        CUC, 
        /**
         * null
         */
        CUP, 
        /**
         * null
         */
        CVE, 
        /**
         * null
         */
        CZK, 
        /**
         * null
         */
        DJF, 
        /**
         * null
         */
        DKK, 
        /**
         * null
         */
        DOP, 
        /**
         * null
         */
        DZD, 
        /**
         * null
         */
        EGP, 
        /**
         * null
         */
        ERN, 
        /**
         * null
         */
        ETB, 
        /**
         * null
         */
        EUR, 
        /**
         * null
         */
        FJD, 
        /**
         * null
         */
        FKP, 
        /**
         * null
         */
        GBP, 
        /**
         * null
         */
        GEL, 
        /**
         * null
         */
        GGP, 
        /**
         * null
         */
        GHS, 
        /**
         * null
         */
        GIP, 
        /**
         * null
         */
        GMD, 
        /**
         * null
         */
        GNF, 
        /**
         * null
         */
        GTQ, 
        /**
         * null
         */
        GYD, 
        /**
         * null
         */
        HKD, 
        /**
         * null
         */
        HNL, 
        /**
         * null
         */
        HRK, 
        /**
         * null
         */
        HTG, 
        /**
         * null
         */
        HUF, 
        /**
         * null
         */
        IDR, 
        /**
         * null
         */
        ILS, 
        /**
         * null
         */
        IMP, 
        /**
         * null
         */
        INR, 
        /**
         * null
         */
        IQD, 
        /**
         * null
         */
        IRR, 
        /**
         * null
         */
        ISK, 
        /**
         * null
         */
        JEP, 
        /**
         * null
         */
        JMD, 
        /**
         * null
         */
        JOD, 
        /**
         * null
         */
        JPY, 
        /**
         * null
         */
        KES, 
        /**
         * null
         */
        KGS, 
        /**
         * null
         */
        KHR, 
        /**
         * null
         */
        KMF, 
        /**
         * null
         */
        KPW, 
        /**
         * null
         */
        KRW, 
        /**
         * null
         */
        KWD, 
        /**
         * null
         */
        KYD, 
        /**
         * null
         */
        KZT, 
        /**
         * null
         */
        LAK, 
        /**
         * null
         */
        LBP, 
        /**
         * null
         */
        LKR, 
        /**
         * null
         */
        LRD, 
        /**
         * null
         */
        LSL, 
        /**
         * null
         */
        LYD, 
        /**
         * null
         */
        MAD, 
        /**
         * null
         */
        MDL, 
        /**
         * null
         */
        MGA, 
        /**
         * null
         */
        MKD, 
        /**
         * null
         */
        MMK, 
        /**
         * null
         */
        MNT, 
        /**
         * null
         */
        MOP, 
        /**
         * null
         */
        MRU, 
        /**
         * null
         */
        MUR, 
        /**
         * null
         */
        MVR, 
        /**
         * null
         */
        MWK, 
        /**
         * null
         */
        MXN, 
        /**
         * null
         */
        MXV, 
        /**
         * null
         */
        MYR, 
        /**
         * null
         */
        MZN, 
        /**
         * null
         */
        NAD, 
        /**
         * null
         */
        NGN, 
        /**
         * null
         */
        NIO, 
        /**
         * null
         */
        NOK, 
        /**
         * null
         */
        NPR, 
        /**
         * null
         */
        NZD, 
        /**
         * null
         */
        OMR, 
        /**
         * null
         */
        PAB, 
        /**
         * null
         */
        PEN, 
        /**
         * null
         */
        PGK, 
        /**
         * null
         */
        PHP, 
        /**
         * null
         */
        PKR, 
        /**
         * null
         */
        PLN, 
        /**
         * null
         */
        PYG, 
        /**
         * null
         */
        QAR, 
        /**
         * null
         */
        RON, 
        /**
         * null
         */
        RSD, 
        /**
         * null
         */
        RUB, 
        /**
         * null
         */
        RWF, 
        /**
         * null
         */
        SAR, 
        /**
         * null
         */
        SBD, 
        /**
         * null
         */
        SCR, 
        /**
         * null
         */
        SDG, 
        /**
         * null
         */
        SEK, 
        /**
         * null
         */
        SGD, 
        /**
         * null
         */
        SHP, 
        /**
         * null
         */
        SLL, 
        /**
         * null
         */
        SOS, 
        /**
         * null
         */
        SRD, 
        /**
         * null
         */
        SSP, 
        /**
         * null
         */
        STN, 
        /**
         * null
         */
        SVC, 
        /**
         * null
         */
        SYP, 
        /**
         * null
         */
        SZL, 
        /**
         * null
         */
        THB, 
        /**
         * null
         */
        TJS, 
        /**
         * null
         */
        TMT, 
        /**
         * null
         */
        TND, 
        /**
         * null
         */
        TOP, 
        /**
         * null
         */
        TRY, 
        /**
         * null
         */
        TTD, 
        /**
         * null
         */
        TVD, 
        /**
         * null
         */
        TWD, 
        /**
         * null
         */
        TZS, 
        /**
         * null
         */
        UAH, 
        /**
         * null
         */
        UGX, 
        /**
         * null
         */
        USD, 
        /**
         * null
         */
        USN, 
        /**
         * null
         */
        UYI, 
        /**
         * null
         */
        UYU, 
        /**
         * null
         */
        UZS, 
        /**
         * null
         */
        VEF, 
        /**
         * null
         */
        VND, 
        /**
         * null
         */
        VUV, 
        /**
         * null
         */
        WST, 
        /**
         * null
         */
        XAF, 
        /**
         * null
         */
        XAG, 
        /**
         * null
         */
        XAU, 
        /**
         * null
         */
        XBA, 
        /**
         * null
         */
        XBB, 
        /**
         * null
         */
        XBC, 
        /**
         * null
         */
        XBD, 
        /**
         * null
         */
        XCD, 
        /**
         * null
         */
        XDR, 
        /**
         * null
         */
        XOF, 
        /**
         * null
         */
        XPD, 
        /**
         * null
         */
        XPF, 
        /**
         * null
         */
        XPT, 
        /**
         * null
         */
        XSU, 
        /**
         * null
         */
        XTS, 
        /**
         * null
         */
        XUA, 
        /**
         * null
         */
        XXX, 
        /**
         * null
         */
        YER, 
        /**
         * null
         */
        ZAR, 
        /**
         * null
         */
        ZMW, 
        /**
         * null
         */
        ZWL, 
        /**
         * added to help the parsers
         */
        NULL;
        public static Currencies fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("AED".equals(codeString))
          return AED;
        if ("AFN".equals(codeString))
          return AFN;
        if ("ALL".equals(codeString))
          return ALL;
        if ("AMD".equals(codeString))
          return AMD;
        if ("ANG".equals(codeString))
          return ANG;
        if ("AOA".equals(codeString))
          return AOA;
        if ("ARS".equals(codeString))
          return ARS;
        if ("AUD".equals(codeString))
          return AUD;
        if ("AWG".equals(codeString))
          return AWG;
        if ("AZN".equals(codeString))
          return AZN;
        if ("BAM".equals(codeString))
          return BAM;
        if ("BBD".equals(codeString))
          return BBD;
        if ("BDT".equals(codeString))
          return BDT;
        if ("BGN".equals(codeString))
          return BGN;
        if ("BHD".equals(codeString))
          return BHD;
        if ("BIF".equals(codeString))
          return BIF;
        if ("BMD".equals(codeString))
          return BMD;
        if ("BND".equals(codeString))
          return BND;
        if ("BOB".equals(codeString))
          return BOB;
        if ("BOV".equals(codeString))
          return BOV;
        if ("BRL".equals(codeString))
          return BRL;
        if ("BSD".equals(codeString))
          return BSD;
        if ("BTN".equals(codeString))
          return BTN;
        if ("BWP".equals(codeString))
          return BWP;
        if ("BYN".equals(codeString))
          return BYN;
        if ("BZD".equals(codeString))
          return BZD;
        if ("CAD".equals(codeString))
          return CAD;
        if ("CDF".equals(codeString))
          return CDF;
        if ("CHE".equals(codeString))
          return CHE;
        if ("CHF".equals(codeString))
          return CHF;
        if ("CHW".equals(codeString))
          return CHW;
        if ("CLF".equals(codeString))
          return CLF;
        if ("CLP".equals(codeString))
          return CLP;
        if ("CNY".equals(codeString))
          return CNY;
        if ("COP".equals(codeString))
          return COP;
        if ("COU".equals(codeString))
          return COU;
        if ("CRC".equals(codeString))
          return CRC;
        if ("CUC".equals(codeString))
          return CUC;
        if ("CUP".equals(codeString))
          return CUP;
        if ("CVE".equals(codeString))
          return CVE;
        if ("CZK".equals(codeString))
          return CZK;
        if ("DJF".equals(codeString))
          return DJF;
        if ("DKK".equals(codeString))
          return DKK;
        if ("DOP".equals(codeString))
          return DOP;
        if ("DZD".equals(codeString))
          return DZD;
        if ("EGP".equals(codeString))
          return EGP;
        if ("ERN".equals(codeString))
          return ERN;
        if ("ETB".equals(codeString))
          return ETB;
        if ("EUR".equals(codeString))
          return EUR;
        if ("FJD".equals(codeString))
          return FJD;
        if ("FKP".equals(codeString))
          return FKP;
        if ("GBP".equals(codeString))
          return GBP;
        if ("GEL".equals(codeString))
          return GEL;
        if ("GGP".equals(codeString))
          return GGP;
        if ("GHS".equals(codeString))
          return GHS;
        if ("GIP".equals(codeString))
          return GIP;
        if ("GMD".equals(codeString))
          return GMD;
        if ("GNF".equals(codeString))
          return GNF;
        if ("GTQ".equals(codeString))
          return GTQ;
        if ("GYD".equals(codeString))
          return GYD;
        if ("HKD".equals(codeString))
          return HKD;
        if ("HNL".equals(codeString))
          return HNL;
        if ("HRK".equals(codeString))
          return HRK;
        if ("HTG".equals(codeString))
          return HTG;
        if ("HUF".equals(codeString))
          return HUF;
        if ("IDR".equals(codeString))
          return IDR;
        if ("ILS".equals(codeString))
          return ILS;
        if ("IMP".equals(codeString))
          return IMP;
        if ("INR".equals(codeString))
          return INR;
        if ("IQD".equals(codeString))
          return IQD;
        if ("IRR".equals(codeString))
          return IRR;
        if ("ISK".equals(codeString))
          return ISK;
        if ("JEP".equals(codeString))
          return JEP;
        if ("JMD".equals(codeString))
          return JMD;
        if ("JOD".equals(codeString))
          return JOD;
        if ("JPY".equals(codeString))
          return JPY;
        if ("KES".equals(codeString))
          return KES;
        if ("KGS".equals(codeString))
          return KGS;
        if ("KHR".equals(codeString))
          return KHR;
        if ("KMF".equals(codeString))
          return KMF;
        if ("KPW".equals(codeString))
          return KPW;
        if ("KRW".equals(codeString))
          return KRW;
        if ("KWD".equals(codeString))
          return KWD;
        if ("KYD".equals(codeString))
          return KYD;
        if ("KZT".equals(codeString))
          return KZT;
        if ("LAK".equals(codeString))
          return LAK;
        if ("LBP".equals(codeString))
          return LBP;
        if ("LKR".equals(codeString))
          return LKR;
        if ("LRD".equals(codeString))
          return LRD;
        if ("LSL".equals(codeString))
          return LSL;
        if ("LYD".equals(codeString))
          return LYD;
        if ("MAD".equals(codeString))
          return MAD;
        if ("MDL".equals(codeString))
          return MDL;
        if ("MGA".equals(codeString))
          return MGA;
        if ("MKD".equals(codeString))
          return MKD;
        if ("MMK".equals(codeString))
          return MMK;
        if ("MNT".equals(codeString))
          return MNT;
        if ("MOP".equals(codeString))
          return MOP;
        if ("MRU".equals(codeString))
          return MRU;
        if ("MUR".equals(codeString))
          return MUR;
        if ("MVR".equals(codeString))
          return MVR;
        if ("MWK".equals(codeString))
          return MWK;
        if ("MXN".equals(codeString))
          return MXN;
        if ("MXV".equals(codeString))
          return MXV;
        if ("MYR".equals(codeString))
          return MYR;
        if ("MZN".equals(codeString))
          return MZN;
        if ("NAD".equals(codeString))
          return NAD;
        if ("NGN".equals(codeString))
          return NGN;
        if ("NIO".equals(codeString))
          return NIO;
        if ("NOK".equals(codeString))
          return NOK;
        if ("NPR".equals(codeString))
          return NPR;
        if ("NZD".equals(codeString))
          return NZD;
        if ("OMR".equals(codeString))
          return OMR;
        if ("PAB".equals(codeString))
          return PAB;
        if ("PEN".equals(codeString))
          return PEN;
        if ("PGK".equals(codeString))
          return PGK;
        if ("PHP".equals(codeString))
          return PHP;
        if ("PKR".equals(codeString))
          return PKR;
        if ("PLN".equals(codeString))
          return PLN;
        if ("PYG".equals(codeString))
          return PYG;
        if ("QAR".equals(codeString))
          return QAR;
        if ("RON".equals(codeString))
          return RON;
        if ("RSD".equals(codeString))
          return RSD;
        if ("RUB".equals(codeString))
          return RUB;
        if ("RWF".equals(codeString))
          return RWF;
        if ("SAR".equals(codeString))
          return SAR;
        if ("SBD".equals(codeString))
          return SBD;
        if ("SCR".equals(codeString))
          return SCR;
        if ("SDG".equals(codeString))
          return SDG;
        if ("SEK".equals(codeString))
          return SEK;
        if ("SGD".equals(codeString))
          return SGD;
        if ("SHP".equals(codeString))
          return SHP;
        if ("SLL".equals(codeString))
          return SLL;
        if ("SOS".equals(codeString))
          return SOS;
        if ("SRD".equals(codeString))
          return SRD;
        if ("SSP".equals(codeString))
          return SSP;
        if ("STN".equals(codeString))
          return STN;
        if ("SVC".equals(codeString))
          return SVC;
        if ("SYP".equals(codeString))
          return SYP;
        if ("SZL".equals(codeString))
          return SZL;
        if ("THB".equals(codeString))
          return THB;
        if ("TJS".equals(codeString))
          return TJS;
        if ("TMT".equals(codeString))
          return TMT;
        if ("TND".equals(codeString))
          return TND;
        if ("TOP".equals(codeString))
          return TOP;
        if ("TRY".equals(codeString))
          return TRY;
        if ("TTD".equals(codeString))
          return TTD;
        if ("TVD".equals(codeString))
          return TVD;
        if ("TWD".equals(codeString))
          return TWD;
        if ("TZS".equals(codeString))
          return TZS;
        if ("UAH".equals(codeString))
          return UAH;
        if ("UGX".equals(codeString))
          return UGX;
        if ("USD".equals(codeString))
          return USD;
        if ("USN".equals(codeString))
          return USN;
        if ("UYI".equals(codeString))
          return UYI;
        if ("UYU".equals(codeString))
          return UYU;
        if ("UZS".equals(codeString))
          return UZS;
        if ("VEF".equals(codeString))
          return VEF;
        if ("VND".equals(codeString))
          return VND;
        if ("VUV".equals(codeString))
          return VUV;
        if ("WST".equals(codeString))
          return WST;
        if ("XAF".equals(codeString))
          return XAF;
        if ("XAG".equals(codeString))
          return XAG;
        if ("XAU".equals(codeString))
          return XAU;
        if ("XBA".equals(codeString))
          return XBA;
        if ("XBB".equals(codeString))
          return XBB;
        if ("XBC".equals(codeString))
          return XBC;
        if ("XBD".equals(codeString))
          return XBD;
        if ("XCD".equals(codeString))
          return XCD;
        if ("XDR".equals(codeString))
          return XDR;
        if ("XOF".equals(codeString))
          return XOF;
        if ("XPD".equals(codeString))
          return XPD;
        if ("XPF".equals(codeString))
          return XPF;
        if ("XPT".equals(codeString))
          return XPT;
        if ("XSU".equals(codeString))
          return XSU;
        if ("XTS".equals(codeString))
          return XTS;
        if ("XUA".equals(codeString))
          return XUA;
        if ("XXX".equals(codeString))
          return XXX;
        if ("YER".equals(codeString))
          return YER;
        if ("ZAR".equals(codeString))
          return ZAR;
        if ("ZMW".equals(codeString))
          return ZMW;
        if ("ZWL".equals(codeString))
          return ZWL;
        throw new FHIRException("Unknown Currencies code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BOV", "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHE", "CHF", "CHW", "CLF", "CLP", "CNY", "COP", "COU", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MXV", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "SSP", "STN", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "USN", "UYI", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XBA", "XBB", "XBC", "XBD", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "XSU", "XTS", "XUA", "XXX", "YER", "ZAR", "ZMW", "ZWL");
        }
        public String toCode() {
          switch (this) {
            case AED: return "AED";
            case AFN: return "AFN";
            case ALL: return "ALL";
            case AMD: return "AMD";
            case ANG: return "ANG";
            case AOA: return "AOA";
            case ARS: return "ARS";
            case AUD: return "AUD";
            case AWG: return "AWG";
            case AZN: return "AZN";
            case BAM: return "BAM";
            case BBD: return "BBD";
            case BDT: return "BDT";
            case BGN: return "BGN";
            case BHD: return "BHD";
            case BIF: return "BIF";
            case BMD: return "BMD";
            case BND: return "BND";
            case BOB: return "BOB";
            case BOV: return "BOV";
            case BRL: return "BRL";
            case BSD: return "BSD";
            case BTN: return "BTN";
            case BWP: return "BWP";
            case BYN: return "BYN";
            case BZD: return "BZD";
            case CAD: return "CAD";
            case CDF: return "CDF";
            case CHE: return "CHE";
            case CHF: return "CHF";
            case CHW: return "CHW";
            case CLF: return "CLF";
            case CLP: return "CLP";
            case CNY: return "CNY";
            case COP: return "COP";
            case COU: return "COU";
            case CRC: return "CRC";
            case CUC: return "CUC";
            case CUP: return "CUP";
            case CVE: return "CVE";
            case CZK: return "CZK";
            case DJF: return "DJF";
            case DKK: return "DKK";
            case DOP: return "DOP";
            case DZD: return "DZD";
            case EGP: return "EGP";
            case ERN: return "ERN";
            case ETB: return "ETB";
            case EUR: return "EUR";
            case FJD: return "FJD";
            case FKP: return "FKP";
            case GBP: return "GBP";
            case GEL: return "GEL";
            case GGP: return "GGP";
            case GHS: return "GHS";
            case GIP: return "GIP";
            case GMD: return "GMD";
            case GNF: return "GNF";
            case GTQ: return "GTQ";
            case GYD: return "GYD";
            case HKD: return "HKD";
            case HNL: return "HNL";
            case HRK: return "HRK";
            case HTG: return "HTG";
            case HUF: return "HUF";
            case IDR: return "IDR";
            case ILS: return "ILS";
            case IMP: return "IMP";
            case INR: return "INR";
            case IQD: return "IQD";
            case IRR: return "IRR";
            case ISK: return "ISK";
            case JEP: return "JEP";
            case JMD: return "JMD";
            case JOD: return "JOD";
            case JPY: return "JPY";
            case KES: return "KES";
            case KGS: return "KGS";
            case KHR: return "KHR";
            case KMF: return "KMF";
            case KPW: return "KPW";
            case KRW: return "KRW";
            case KWD: return "KWD";
            case KYD: return "KYD";
            case KZT: return "KZT";
            case LAK: return "LAK";
            case LBP: return "LBP";
            case LKR: return "LKR";
            case LRD: return "LRD";
            case LSL: return "LSL";
            case LYD: return "LYD";
            case MAD: return "MAD";
            case MDL: return "MDL";
            case MGA: return "MGA";
            case MKD: return "MKD";
            case MMK: return "MMK";
            case MNT: return "MNT";
            case MOP: return "MOP";
            case MRU: return "MRU";
            case MUR: return "MUR";
            case MVR: return "MVR";
            case MWK: return "MWK";
            case MXN: return "MXN";
            case MXV: return "MXV";
            case MYR: return "MYR";
            case MZN: return "MZN";
            case NAD: return "NAD";
            case NGN: return "NGN";
            case NIO: return "NIO";
            case NOK: return "NOK";
            case NPR: return "NPR";
            case NZD: return "NZD";
            case OMR: return "OMR";
            case PAB: return "PAB";
            case PEN: return "PEN";
            case PGK: return "PGK";
            case PHP: return "PHP";
            case PKR: return "PKR";
            case PLN: return "PLN";
            case PYG: return "PYG";
            case QAR: return "QAR";
            case RON: return "RON";
            case RSD: return "RSD";
            case RUB: return "RUB";
            case RWF: return "RWF";
            case SAR: return "SAR";
            case SBD: return "SBD";
            case SCR: return "SCR";
            case SDG: return "SDG";
            case SEK: return "SEK";
            case SGD: return "SGD";
            case SHP: return "SHP";
            case SLL: return "SLL";
            case SOS: return "SOS";
            case SRD: return "SRD";
            case SSP: return "SSP";
            case STN: return "STN";
            case SVC: return "SVC";
            case SYP: return "SYP";
            case SZL: return "SZL";
            case THB: return "THB";
            case TJS: return "TJS";
            case TMT: return "TMT";
            case TND: return "TND";
            case TOP: return "TOP";
            case TRY: return "TRY";
            case TTD: return "TTD";
            case TVD: return "TVD";
            case TWD: return "TWD";
            case TZS: return "TZS";
            case UAH: return "UAH";
            case UGX: return "UGX";
            case USD: return "USD";
            case USN: return "USN";
            case UYI: return "UYI";
            case UYU: return "UYU";
            case UZS: return "UZS";
            case VEF: return "VEF";
            case VND: return "VND";
            case VUV: return "VUV";
            case WST: return "WST";
            case XAF: return "XAF";
            case XAG: return "XAG";
            case XAU: return "XAU";
            case XBA: return "XBA";
            case XBB: return "XBB";
            case XBC: return "XBC";
            case XBD: return "XBD";
            case XCD: return "XCD";
            case XDR: return "XDR";
            case XOF: return "XOF";
            case XPD: return "XPD";
            case XPF: return "XPF";
            case XPT: return "XPT";
            case XSU: return "XSU";
            case XTS: return "XTS";
            case XUA: return "XUA";
            case XXX: return "XXX";
            case YER: return "YER";
            case ZAR: return "ZAR";
            case ZMW: return "ZMW";
            case ZWL: return "ZWL";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case AED: return "urn:iso:std:iso:4217";
            case AFN: return "urn:iso:std:iso:4217";
            case ALL: return "urn:iso:std:iso:4217";
            case AMD: return "urn:iso:std:iso:4217";
            case ANG: return "urn:iso:std:iso:4217";
            case AOA: return "urn:iso:std:iso:4217";
            case ARS: return "urn:iso:std:iso:4217";
            case AUD: return "urn:iso:std:iso:4217";
            case AWG: return "urn:iso:std:iso:4217";
            case AZN: return "urn:iso:std:iso:4217";
            case BAM: return "urn:iso:std:iso:4217";
            case BBD: return "urn:iso:std:iso:4217";
            case BDT: return "urn:iso:std:iso:4217";
            case BGN: return "urn:iso:std:iso:4217";
            case BHD: return "urn:iso:std:iso:4217";
            case BIF: return "urn:iso:std:iso:4217";
            case BMD: return "urn:iso:std:iso:4217";
            case BND: return "urn:iso:std:iso:4217";
            case BOB: return "urn:iso:std:iso:4217";
            case BOV: return "urn:iso:std:iso:4217";
            case BRL: return "urn:iso:std:iso:4217";
            case BSD: return "urn:iso:std:iso:4217";
            case BTN: return "urn:iso:std:iso:4217";
            case BWP: return "urn:iso:std:iso:4217";
            case BYN: return "urn:iso:std:iso:4217";
            case BZD: return "urn:iso:std:iso:4217";
            case CAD: return "urn:iso:std:iso:4217";
            case CDF: return "urn:iso:std:iso:4217";
            case CHE: return "urn:iso:std:iso:4217";
            case CHF: return "urn:iso:std:iso:4217";
            case CHW: return "urn:iso:std:iso:4217";
            case CLF: return "urn:iso:std:iso:4217";
            case CLP: return "urn:iso:std:iso:4217";
            case CNY: return "urn:iso:std:iso:4217";
            case COP: return "urn:iso:std:iso:4217";
            case COU: return "urn:iso:std:iso:4217";
            case CRC: return "urn:iso:std:iso:4217";
            case CUC: return "urn:iso:std:iso:4217";
            case CUP: return "urn:iso:std:iso:4217";
            case CVE: return "urn:iso:std:iso:4217";
            case CZK: return "urn:iso:std:iso:4217";
            case DJF: return "urn:iso:std:iso:4217";
            case DKK: return "urn:iso:std:iso:4217";
            case DOP: return "urn:iso:std:iso:4217";
            case DZD: return "urn:iso:std:iso:4217";
            case EGP: return "urn:iso:std:iso:4217";
            case ERN: return "urn:iso:std:iso:4217";
            case ETB: return "urn:iso:std:iso:4217";
            case EUR: return "urn:iso:std:iso:4217";
            case FJD: return "urn:iso:std:iso:4217";
            case FKP: return "urn:iso:std:iso:4217";
            case GBP: return "urn:iso:std:iso:4217";
            case GEL: return "urn:iso:std:iso:4217";
            case GGP: return "urn:iso:std:iso:4217";
            case GHS: return "urn:iso:std:iso:4217";
            case GIP: return "urn:iso:std:iso:4217";
            case GMD: return "urn:iso:std:iso:4217";
            case GNF: return "urn:iso:std:iso:4217";
            case GTQ: return "urn:iso:std:iso:4217";
            case GYD: return "urn:iso:std:iso:4217";
            case HKD: return "urn:iso:std:iso:4217";
            case HNL: return "urn:iso:std:iso:4217";
            case HRK: return "urn:iso:std:iso:4217";
            case HTG: return "urn:iso:std:iso:4217";
            case HUF: return "urn:iso:std:iso:4217";
            case IDR: return "urn:iso:std:iso:4217";
            case ILS: return "urn:iso:std:iso:4217";
            case IMP: return "urn:iso:std:iso:4217";
            case INR: return "urn:iso:std:iso:4217";
            case IQD: return "urn:iso:std:iso:4217";
            case IRR: return "urn:iso:std:iso:4217";
            case ISK: return "urn:iso:std:iso:4217";
            case JEP: return "urn:iso:std:iso:4217";
            case JMD: return "urn:iso:std:iso:4217";
            case JOD: return "urn:iso:std:iso:4217";
            case JPY: return "urn:iso:std:iso:4217";
            case KES: return "urn:iso:std:iso:4217";
            case KGS: return "urn:iso:std:iso:4217";
            case KHR: return "urn:iso:std:iso:4217";
            case KMF: return "urn:iso:std:iso:4217";
            case KPW: return "urn:iso:std:iso:4217";
            case KRW: return "urn:iso:std:iso:4217";
            case KWD: return "urn:iso:std:iso:4217";
            case KYD: return "urn:iso:std:iso:4217";
            case KZT: return "urn:iso:std:iso:4217";
            case LAK: return "urn:iso:std:iso:4217";
            case LBP: return "urn:iso:std:iso:4217";
            case LKR: return "urn:iso:std:iso:4217";
            case LRD: return "urn:iso:std:iso:4217";
            case LSL: return "urn:iso:std:iso:4217";
            case LYD: return "urn:iso:std:iso:4217";
            case MAD: return "urn:iso:std:iso:4217";
            case MDL: return "urn:iso:std:iso:4217";
            case MGA: return "urn:iso:std:iso:4217";
            case MKD: return "urn:iso:std:iso:4217";
            case MMK: return "urn:iso:std:iso:4217";
            case MNT: return "urn:iso:std:iso:4217";
            case MOP: return "urn:iso:std:iso:4217";
            case MRU: return "urn:iso:std:iso:4217";
            case MUR: return "urn:iso:std:iso:4217";
            case MVR: return "urn:iso:std:iso:4217";
            case MWK: return "urn:iso:std:iso:4217";
            case MXN: return "urn:iso:std:iso:4217";
            case MXV: return "urn:iso:std:iso:4217";
            case MYR: return "urn:iso:std:iso:4217";
            case MZN: return "urn:iso:std:iso:4217";
            case NAD: return "urn:iso:std:iso:4217";
            case NGN: return "urn:iso:std:iso:4217";
            case NIO: return "urn:iso:std:iso:4217";
            case NOK: return "urn:iso:std:iso:4217";
            case NPR: return "urn:iso:std:iso:4217";
            case NZD: return "urn:iso:std:iso:4217";
            case OMR: return "urn:iso:std:iso:4217";
            case PAB: return "urn:iso:std:iso:4217";
            case PEN: return "urn:iso:std:iso:4217";
            case PGK: return "urn:iso:std:iso:4217";
            case PHP: return "urn:iso:std:iso:4217";
            case PKR: return "urn:iso:std:iso:4217";
            case PLN: return "urn:iso:std:iso:4217";
            case PYG: return "urn:iso:std:iso:4217";
            case QAR: return "urn:iso:std:iso:4217";
            case RON: return "urn:iso:std:iso:4217";
            case RSD: return "urn:iso:std:iso:4217";
            case RUB: return "urn:iso:std:iso:4217";
            case RWF: return "urn:iso:std:iso:4217";
            case SAR: return "urn:iso:std:iso:4217";
            case SBD: return "urn:iso:std:iso:4217";
            case SCR: return "urn:iso:std:iso:4217";
            case SDG: return "urn:iso:std:iso:4217";
            case SEK: return "urn:iso:std:iso:4217";
            case SGD: return "urn:iso:std:iso:4217";
            case SHP: return "urn:iso:std:iso:4217";
            case SLL: return "urn:iso:std:iso:4217";
            case SOS: return "urn:iso:std:iso:4217";
            case SRD: return "urn:iso:std:iso:4217";
            case SSP: return "urn:iso:std:iso:4217";
            case STN: return "urn:iso:std:iso:4217";
            case SVC: return "urn:iso:std:iso:4217";
            case SYP: return "urn:iso:std:iso:4217";
            case SZL: return "urn:iso:std:iso:4217";
            case THB: return "urn:iso:std:iso:4217";
            case TJS: return "urn:iso:std:iso:4217";
            case TMT: return "urn:iso:std:iso:4217";
            case TND: return "urn:iso:std:iso:4217";
            case TOP: return "urn:iso:std:iso:4217";
            case TRY: return "urn:iso:std:iso:4217";
            case TTD: return "urn:iso:std:iso:4217";
            case TVD: return "urn:iso:std:iso:4217";
            case TWD: return "urn:iso:std:iso:4217";
            case TZS: return "urn:iso:std:iso:4217";
            case UAH: return "urn:iso:std:iso:4217";
            case UGX: return "urn:iso:std:iso:4217";
            case USD: return "urn:iso:std:iso:4217";
            case USN: return "urn:iso:std:iso:4217";
            case UYI: return "urn:iso:std:iso:4217";
            case UYU: return "urn:iso:std:iso:4217";
            case UZS: return "urn:iso:std:iso:4217";
            case VEF: return "urn:iso:std:iso:4217";
            case VND: return "urn:iso:std:iso:4217";
            case VUV: return "urn:iso:std:iso:4217";
            case WST: return "urn:iso:std:iso:4217";
            case XAF: return "urn:iso:std:iso:4217";
            case XAG: return "urn:iso:std:iso:4217";
            case XAU: return "urn:iso:std:iso:4217";
            case XBA: return "urn:iso:std:iso:4217";
            case XBB: return "urn:iso:std:iso:4217";
            case XBC: return "urn:iso:std:iso:4217";
            case XBD: return "urn:iso:std:iso:4217";
            case XCD: return "urn:iso:std:iso:4217";
            case XDR: return "urn:iso:std:iso:4217";
            case XOF: return "urn:iso:std:iso:4217";
            case XPD: return "urn:iso:std:iso:4217";
            case XPF: return "urn:iso:std:iso:4217";
            case XPT: return "urn:iso:std:iso:4217";
            case XSU: return "urn:iso:std:iso:4217";
            case XTS: return "urn:iso:std:iso:4217";
            case XUA: return "urn:iso:std:iso:4217";
            case XXX: return "urn:iso:std:iso:4217";
            case YER: return "urn:iso:std:iso:4217";
            case ZAR: return "urn:iso:std:iso:4217";
            case ZMW: return "urn:iso:std:iso:4217";
            case ZWL: return "urn:iso:std:iso:4217";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case AED: return "";
            case AFN: return "";
            case ALL: return "";
            case AMD: return "";
            case ANG: return "";
            case AOA: return "";
            case ARS: return "";
            case AUD: return "";
            case AWG: return "";
            case AZN: return "";
            case BAM: return "";
            case BBD: return "";
            case BDT: return "";
            case BGN: return "";
            case BHD: return "";
            case BIF: return "";
            case BMD: return "";
            case BND: return "";
            case BOB: return "";
            case BOV: return "";
            case BRL: return "";
            case BSD: return "";
            case BTN: return "";
            case BWP: return "";
            case BYN: return "";
            case BZD: return "";
            case CAD: return "";
            case CDF: return "";
            case CHE: return "";
            case CHF: return "";
            case CHW: return "";
            case CLF: return "";
            case CLP: return "";
            case CNY: return "";
            case COP: return "";
            case COU: return "";
            case CRC: return "";
            case CUC: return "";
            case CUP: return "";
            case CVE: return "";
            case CZK: return "";
            case DJF: return "";
            case DKK: return "";
            case DOP: return "";
            case DZD: return "";
            case EGP: return "";
            case ERN: return "";
            case ETB: return "";
            case EUR: return "";
            case FJD: return "";
            case FKP: return "";
            case GBP: return "";
            case GEL: return "";
            case GGP: return "";
            case GHS: return "";
            case GIP: return "";
            case GMD: return "";
            case GNF: return "";
            case GTQ: return "";
            case GYD: return "";
            case HKD: return "";
            case HNL: return "";
            case HRK: return "";
            case HTG: return "";
            case HUF: return "";
            case IDR: return "";
            case ILS: return "";
            case IMP: return "";
            case INR: return "";
            case IQD: return "";
            case IRR: return "";
            case ISK: return "";
            case JEP: return "";
            case JMD: return "";
            case JOD: return "";
            case JPY: return "";
            case KES: return "";
            case KGS: return "";
            case KHR: return "";
            case KMF: return "";
            case KPW: return "";
            case KRW: return "";
            case KWD: return "";
            case KYD: return "";
            case KZT: return "";
            case LAK: return "";
            case LBP: return "";
            case LKR: return "";
            case LRD: return "";
            case LSL: return "";
            case LYD: return "";
            case MAD: return "";
            case MDL: return "";
            case MGA: return "";
            case MKD: return "";
            case MMK: return "";
            case MNT: return "";
            case MOP: return "";
            case MRU: return "";
            case MUR: return "";
            case MVR: return "";
            case MWK: return "";
            case MXN: return "";
            case MXV: return "";
            case MYR: return "";
            case MZN: return "";
            case NAD: return "";
            case NGN: return "";
            case NIO: return "";
            case NOK: return "";
            case NPR: return "";
            case NZD: return "";
            case OMR: return "";
            case PAB: return "";
            case PEN: return "";
            case PGK: return "";
            case PHP: return "";
            case PKR: return "";
            case PLN: return "";
            case PYG: return "";
            case QAR: return "";
            case RON: return "";
            case RSD: return "";
            case RUB: return "";
            case RWF: return "";
            case SAR: return "";
            case SBD: return "";
            case SCR: return "";
            case SDG: return "";
            case SEK: return "";
            case SGD: return "";
            case SHP: return "";
            case SLL: return "";
            case SOS: return "";
            case SRD: return "";
            case SSP: return "";
            case STN: return "";
            case SVC: return "";
            case SYP: return "";
            case SZL: return "";
            case THB: return "";
            case TJS: return "";
            case TMT: return "";
            case TND: return "";
            case TOP: return "";
            case TRY: return "";
            case TTD: return "";
            case TVD: return "";
            case TWD: return "";
            case TZS: return "";
            case UAH: return "";
            case UGX: return "";
            case USD: return "";
            case USN: return "";
            case UYI: return "";
            case UYU: return "";
            case UZS: return "";
            case VEF: return "";
            case VND: return "";
            case VUV: return "";
            case WST: return "";
            case XAF: return "";
            case XAG: return "";
            case XAU: return "";
            case XBA: return "";
            case XBB: return "";
            case XBC: return "";
            case XBD: return "";
            case XCD: return "";
            case XDR: return "";
            case XOF: return "";
            case XPD: return "";
            case XPF: return "";
            case XPT: return "";
            case XSU: return "";
            case XTS: return "";
            case XUA: return "";
            case XXX: return "";
            case YER: return "";
            case ZAR: return "";
            case ZMW: return "";
            case ZWL: return "";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case AED: return "United Arab Emirates dirham";
            case AFN: return "Afghan afghani";
            case ALL: return "Albanian lek";
            case AMD: return "Armenian dram";
            case ANG: return "Netherlands Antillean guilder";
            case AOA: return "Angolan kwanza";
            case ARS: return "Argentine peso";
            case AUD: return "Australian dollar";
            case AWG: return "Aruban florin";
            case AZN: return "Azerbaijani manat";
            case BAM: return "Bosnia and Herzegovina convertible mark";
            case BBD: return "Barbados dollar";
            case BDT: return "Bangladeshi taka";
            case BGN: return "Bulgarian lev";
            case BHD: return "Bahraini dinar";
            case BIF: return "Burundian franc";
            case BMD: return "Bermudian dollar";
            case BND: return "Brunei dollar";
            case BOB: return "Boliviano";
            case BOV: return "Bolivian Mvdol (funds code)";
            case BRL: return "Brazilian real";
            case BSD: return "Bahamian dollar";
            case BTN: return "Bhutanese ngultrum";
            case BWP: return "Botswana pula";
            case BYN: return "Belarusian ruble";
            case BZD: return "Belize dollar";
            case CAD: return "Canadian dollar";
            case CDF: return "Congolese franc";
            case CHE: return "WIR Euro (complementary currency)";
            case CHF: return "Swiss franc";
            case CHW: return "WIR Franc (complementary currency)";
            case CLF: return "Unidad de Fomento (funds code)";
            case CLP: return "Chilean peso";
            case CNY: return "Renminbi (Chinese) yuan[8]";
            case COP: return "Colombian peso";
            case COU: return "Unidad de Valor Real (UVR) (funds code)[9]";
            case CRC: return "Costa Rican colon";
            case CUC: return "Cuban convertible peso";
            case CUP: return "Cuban peso";
            case CVE: return "Cape Verde escudo";
            case CZK: return "Czech koruna";
            case DJF: return "Djiboutian franc";
            case DKK: return "Danish krone";
            case DOP: return "Dominican peso";
            case DZD: return "Algerian dinar";
            case EGP: return "Egyptian pound";
            case ERN: return "Eritrean nakfa";
            case ETB: return "Ethiopian birr";
            case EUR: return "Euro";
            case FJD: return "Fiji dollar";
            case FKP: return "Falkland Islands pound";
            case GBP: return "Pound sterling";
            case GEL: return "Georgian lari";
            case GGP: return "Guernsey Pound";
            case GHS: return "Ghanaian cedi";
            case GIP: return "Gibraltar pound";
            case GMD: return "Gambian dalasi";
            case GNF: return "Guinean franc";
            case GTQ: return "Guatemalan quetzal";
            case GYD: return "Guyanese dollar";
            case HKD: return "Hong Kong dollar";
            case HNL: return "Honduran lempira";
            case HRK: return "Croatian kuna";
            case HTG: return "Haitian gourde";
            case HUF: return "Hungarian forint";
            case IDR: return "Indonesian rupiah";
            case ILS: return "Israeli new shekel";
            case IMP: return "Isle of Man Pound";
            case INR: return "Indian rupee";
            case IQD: return "Iraqi dinar";
            case IRR: return "Iranian rial";
            case ISK: return "Icelandic króna";
            case JEP: return "Jersey Pound";
            case JMD: return "Jamaican dollar";
            case JOD: return "Jordanian dinar";
            case JPY: return "Japanese yen";
            case KES: return "Kenyan shilling";
            case KGS: return "Kyrgyzstani som";
            case KHR: return "Cambodian riel";
            case KMF: return "Comoro franc";
            case KPW: return "North Korean won";
            case KRW: return "South Korean won";
            case KWD: return "Kuwaiti dinar";
            case KYD: return "Cayman Islands dollar";
            case KZT: return "Kazakhstani tenge";
            case LAK: return "Lao kip";
            case LBP: return "Lebanese pound";
            case LKR: return "Sri Lankan rupee";
            case LRD: return "Liberian dollar";
            case LSL: return "Lesotho loti";
            case LYD: return "Libyan dinar";
            case MAD: return "Moroccan dirham";
            case MDL: return "Moldovan leu";
            case MGA: return "Malagasy ariary";
            case MKD: return "Macedonian denar";
            case MMK: return "Myanmar kyat";
            case MNT: return "Mongolian tögrög";
            case MOP: return "Macanese pataca";
            case MRU: return "Mauritanian ouguiya";
            case MUR: return "Mauritian rupee";
            case MVR: return "Maldivian rufiyaa";
            case MWK: return "Malawian kwacha";
            case MXN: return "Mexican peso";
            case MXV: return "Mexican Unidad de Inversion (UDI) (funds code)";
            case MYR: return "Malaysian ringgit";
            case MZN: return "Mozambican metical";
            case NAD: return "Namibian dollar";
            case NGN: return "Nigerian naira";
            case NIO: return "Nicaraguan córdoba";
            case NOK: return "Norwegian krone";
            case NPR: return "Nepalese rupee";
            case NZD: return "New Zealand dollar";
            case OMR: return "Omani rial";
            case PAB: return "Panamanian balboa";
            case PEN: return "Peruvian Sol";
            case PGK: return "Papua New Guinean kina";
            case PHP: return "Philippine piso[13]";
            case PKR: return "Pakistani rupee";
            case PLN: return "Polish złoty";
            case PYG: return "Paraguayan guaraní";
            case QAR: return "Qatari riyal";
            case RON: return "Romanian leu";
            case RSD: return "Serbian dinar";
            case RUB: return "Russian ruble";
            case RWF: return "Rwandan franc";
            case SAR: return "Saudi riyal";
            case SBD: return "Solomon Islands dollar";
            case SCR: return "Seychelles rupee";
            case SDG: return "Sudanese pound";
            case SEK: return "Swedish krona/kronor";
            case SGD: return "Singapore dollar";
            case SHP: return "Saint Helena pound";
            case SLL: return "Sierra Leonean leone";
            case SOS: return "Somali shilling";
            case SRD: return "Surinamese dollar";
            case SSP: return "South Sudanese pound";
            case STN: return "São Tomé and Príncipe dobra";
            case SVC: return "Salvadoran colón";
            case SYP: return "Syrian pound";
            case SZL: return "Swazi lilangeni";
            case THB: return "Thai baht";
            case TJS: return "Tajikistani somoni";
            case TMT: return "Turkmenistan manat";
            case TND: return "Tunisian dinar";
            case TOP: return "Tongan paʻanga";
            case TRY: return "Turkish lira";
            case TTD: return "Trinidad and Tobago dollar";
            case TVD: return "Tuvalu Dollar";
            case TWD: return "New Taiwan dollar";
            case TZS: return "Tanzanian shilling";
            case UAH: return "Ukrainian hryvnia";
            case UGX: return "Ugandan shilling";
            case USD: return "United States dollar";
            case USN: return "United States dollar (next day) (funds code)";
            case UYI: return "Uruguay Peso en Unidades Indexadas (URUIURUI) (funds code)";
            case UYU: return "Uruguayan peso";
            case UZS: return "Uzbekistan som";
            case VEF: return "Venezuelan bolívar";
            case VND: return "Vietnamese đồng";
            case VUV: return "Vanuatu vatu";
            case WST: return "Samoan tala";
            case XAF: return "CFA franc BEAC";
            case XAG: return "Silver (one troy ounce)";
            case XAU: return "Gold (one troy ounce)";
            case XBA: return "European Composite Unit (EURCO) (bond market unit)";
            case XBB: return "European Monetary Unit (E.M.U.-6) (bond market unit)";
            case XBC: return "European Unit of Account 9 (E.U.A.-9) (bond market unit)";
            case XBD: return "European Unit of Account 17 (E.U.A.-17) (bond market unit)";
            case XCD: return "East Caribbean dollar";
            case XDR: return "Special drawing rights";
            case XOF: return "CFA franc BCEAO";
            case XPD: return "Palladium (one troy ounce)";
            case XPF: return "CFP franc (franc Pacifique)";
            case XPT: return "Platinum (one troy ounce)";
            case XSU: return "SUCRE";
            case XTS: return "Code reserved for testing purposes";
            case XUA: return "ADB Unit of Account";
            case XXX: return "No currency";
            case YER: return "Yemeni rial";
            case ZAR: return "South African rand";
            case ZMW: return "Zambian kwacha";
            case ZWL: return "Zimbabwean dollar A/10";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class CurrenciesEnumFactory implements EnumFactory<Currencies> {
    public Currencies fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("AED".equals(codeString))
          return Currencies.AED;
        if ("AFN".equals(codeString))
          return Currencies.AFN;
        if ("ALL".equals(codeString))
          return Currencies.ALL;
        if ("AMD".equals(codeString))
          return Currencies.AMD;
        if ("ANG".equals(codeString))
          return Currencies.ANG;
        if ("AOA".equals(codeString))
          return Currencies.AOA;
        if ("ARS".equals(codeString))
          return Currencies.ARS;
        if ("AUD".equals(codeString))
          return Currencies.AUD;
        if ("AWG".equals(codeString))
          return Currencies.AWG;
        if ("AZN".equals(codeString))
          return Currencies.AZN;
        if ("BAM".equals(codeString))
          return Currencies.BAM;
        if ("BBD".equals(codeString))
          return Currencies.BBD;
        if ("BDT".equals(codeString))
          return Currencies.BDT;
        if ("BGN".equals(codeString))
          return Currencies.BGN;
        if ("BHD".equals(codeString))
          return Currencies.BHD;
        if ("BIF".equals(codeString))
          return Currencies.BIF;
        if ("BMD".equals(codeString))
          return Currencies.BMD;
        if ("BND".equals(codeString))
          return Currencies.BND;
        if ("BOB".equals(codeString))
          return Currencies.BOB;
        if ("BOV".equals(codeString))
          return Currencies.BOV;
        if ("BRL".equals(codeString))
          return Currencies.BRL;
        if ("BSD".equals(codeString))
          return Currencies.BSD;
        if ("BTN".equals(codeString))
          return Currencies.BTN;
        if ("BWP".equals(codeString))
          return Currencies.BWP;
        if ("BYN".equals(codeString))
          return Currencies.BYN;
        if ("BZD".equals(codeString))
          return Currencies.BZD;
        if ("CAD".equals(codeString))
          return Currencies.CAD;
        if ("CDF".equals(codeString))
          return Currencies.CDF;
        if ("CHE".equals(codeString))
          return Currencies.CHE;
        if ("CHF".equals(codeString))
          return Currencies.CHF;
        if ("CHW".equals(codeString))
          return Currencies.CHW;
        if ("CLF".equals(codeString))
          return Currencies.CLF;
        if ("CLP".equals(codeString))
          return Currencies.CLP;
        if ("CNY".equals(codeString))
          return Currencies.CNY;
        if ("COP".equals(codeString))
          return Currencies.COP;
        if ("COU".equals(codeString))
          return Currencies.COU;
        if ("CRC".equals(codeString))
          return Currencies.CRC;
        if ("CUC".equals(codeString))
          return Currencies.CUC;
        if ("CUP".equals(codeString))
          return Currencies.CUP;
        if ("CVE".equals(codeString))
          return Currencies.CVE;
        if ("CZK".equals(codeString))
          return Currencies.CZK;
        if ("DJF".equals(codeString))
          return Currencies.DJF;
        if ("DKK".equals(codeString))
          return Currencies.DKK;
        if ("DOP".equals(codeString))
          return Currencies.DOP;
        if ("DZD".equals(codeString))
          return Currencies.DZD;
        if ("EGP".equals(codeString))
          return Currencies.EGP;
        if ("ERN".equals(codeString))
          return Currencies.ERN;
        if ("ETB".equals(codeString))
          return Currencies.ETB;
        if ("EUR".equals(codeString))
          return Currencies.EUR;
        if ("FJD".equals(codeString))
          return Currencies.FJD;
        if ("FKP".equals(codeString))
          return Currencies.FKP;
        if ("GBP".equals(codeString))
          return Currencies.GBP;
        if ("GEL".equals(codeString))
          return Currencies.GEL;
        if ("GGP".equals(codeString))
          return Currencies.GGP;
        if ("GHS".equals(codeString))
          return Currencies.GHS;
        if ("GIP".equals(codeString))
          return Currencies.GIP;
        if ("GMD".equals(codeString))
          return Currencies.GMD;
        if ("GNF".equals(codeString))
          return Currencies.GNF;
        if ("GTQ".equals(codeString))
          return Currencies.GTQ;
        if ("GYD".equals(codeString))
          return Currencies.GYD;
        if ("HKD".equals(codeString))
          return Currencies.HKD;
        if ("HNL".equals(codeString))
          return Currencies.HNL;
        if ("HRK".equals(codeString))
          return Currencies.HRK;
        if ("HTG".equals(codeString))
          return Currencies.HTG;
        if ("HUF".equals(codeString))
          return Currencies.HUF;
        if ("IDR".equals(codeString))
          return Currencies.IDR;
        if ("ILS".equals(codeString))
          return Currencies.ILS;
        if ("IMP".equals(codeString))
          return Currencies.IMP;
        if ("INR".equals(codeString))
          return Currencies.INR;
        if ("IQD".equals(codeString))
          return Currencies.IQD;
        if ("IRR".equals(codeString))
          return Currencies.IRR;
        if ("ISK".equals(codeString))
          return Currencies.ISK;
        if ("JEP".equals(codeString))
          return Currencies.JEP;
        if ("JMD".equals(codeString))
          return Currencies.JMD;
        if ("JOD".equals(codeString))
          return Currencies.JOD;
        if ("JPY".equals(codeString))
          return Currencies.JPY;
        if ("KES".equals(codeString))
          return Currencies.KES;
        if ("KGS".equals(codeString))
          return Currencies.KGS;
        if ("KHR".equals(codeString))
          return Currencies.KHR;
        if ("KMF".equals(codeString))
          return Currencies.KMF;
        if ("KPW".equals(codeString))
          return Currencies.KPW;
        if ("KRW".equals(codeString))
          return Currencies.KRW;
        if ("KWD".equals(codeString))
          return Currencies.KWD;
        if ("KYD".equals(codeString))
          return Currencies.KYD;
        if ("KZT".equals(codeString))
          return Currencies.KZT;
        if ("LAK".equals(codeString))
          return Currencies.LAK;
        if ("LBP".equals(codeString))
          return Currencies.LBP;
        if ("LKR".equals(codeString))
          return Currencies.LKR;
        if ("LRD".equals(codeString))
          return Currencies.LRD;
        if ("LSL".equals(codeString))
          return Currencies.LSL;
        if ("LYD".equals(codeString))
          return Currencies.LYD;
        if ("MAD".equals(codeString))
          return Currencies.MAD;
        if ("MDL".equals(codeString))
          return Currencies.MDL;
        if ("MGA".equals(codeString))
          return Currencies.MGA;
        if ("MKD".equals(codeString))
          return Currencies.MKD;
        if ("MMK".equals(codeString))
          return Currencies.MMK;
        if ("MNT".equals(codeString))
          return Currencies.MNT;
        if ("MOP".equals(codeString))
          return Currencies.MOP;
        if ("MRU".equals(codeString))
          return Currencies.MRU;
        if ("MUR".equals(codeString))
          return Currencies.MUR;
        if ("MVR".equals(codeString))
          return Currencies.MVR;
        if ("MWK".equals(codeString))
          return Currencies.MWK;
        if ("MXN".equals(codeString))
          return Currencies.MXN;
        if ("MXV".equals(codeString))
          return Currencies.MXV;
        if ("MYR".equals(codeString))
          return Currencies.MYR;
        if ("MZN".equals(codeString))
          return Currencies.MZN;
        if ("NAD".equals(codeString))
          return Currencies.NAD;
        if ("NGN".equals(codeString))
          return Currencies.NGN;
        if ("NIO".equals(codeString))
          return Currencies.NIO;
        if ("NOK".equals(codeString))
          return Currencies.NOK;
        if ("NPR".equals(codeString))
          return Currencies.NPR;
        if ("NZD".equals(codeString))
          return Currencies.NZD;
        if ("OMR".equals(codeString))
          return Currencies.OMR;
        if ("PAB".equals(codeString))
          return Currencies.PAB;
        if ("PEN".equals(codeString))
          return Currencies.PEN;
        if ("PGK".equals(codeString))
          return Currencies.PGK;
        if ("PHP".equals(codeString))
          return Currencies.PHP;
        if ("PKR".equals(codeString))
          return Currencies.PKR;
        if ("PLN".equals(codeString))
          return Currencies.PLN;
        if ("PYG".equals(codeString))
          return Currencies.PYG;
        if ("QAR".equals(codeString))
          return Currencies.QAR;
        if ("RON".equals(codeString))
          return Currencies.RON;
        if ("RSD".equals(codeString))
          return Currencies.RSD;
        if ("RUB".equals(codeString))
          return Currencies.RUB;
        if ("RWF".equals(codeString))
          return Currencies.RWF;
        if ("SAR".equals(codeString))
          return Currencies.SAR;
        if ("SBD".equals(codeString))
          return Currencies.SBD;
        if ("SCR".equals(codeString))
          return Currencies.SCR;
        if ("SDG".equals(codeString))
          return Currencies.SDG;
        if ("SEK".equals(codeString))
          return Currencies.SEK;
        if ("SGD".equals(codeString))
          return Currencies.SGD;
        if ("SHP".equals(codeString))
          return Currencies.SHP;
        if ("SLL".equals(codeString))
          return Currencies.SLL;
        if ("SOS".equals(codeString))
          return Currencies.SOS;
        if ("SRD".equals(codeString))
          return Currencies.SRD;
        if ("SSP".equals(codeString))
          return Currencies.SSP;
        if ("STN".equals(codeString))
          return Currencies.STN;
        if ("SVC".equals(codeString))
          return Currencies.SVC;
        if ("SYP".equals(codeString))
          return Currencies.SYP;
        if ("SZL".equals(codeString))
          return Currencies.SZL;
        if ("THB".equals(codeString))
          return Currencies.THB;
        if ("TJS".equals(codeString))
          return Currencies.TJS;
        if ("TMT".equals(codeString))
          return Currencies.TMT;
        if ("TND".equals(codeString))
          return Currencies.TND;
        if ("TOP".equals(codeString))
          return Currencies.TOP;
        if ("TRY".equals(codeString))
          return Currencies.TRY;
        if ("TTD".equals(codeString))
          return Currencies.TTD;
        if ("TVD".equals(codeString))
          return Currencies.TVD;
        if ("TWD".equals(codeString))
          return Currencies.TWD;
        if ("TZS".equals(codeString))
          return Currencies.TZS;
        if ("UAH".equals(codeString))
          return Currencies.UAH;
        if ("UGX".equals(codeString))
          return Currencies.UGX;
        if ("USD".equals(codeString))
          return Currencies.USD;
        if ("USN".equals(codeString))
          return Currencies.USN;
        if ("UYI".equals(codeString))
          return Currencies.UYI;
        if ("UYU".equals(codeString))
          return Currencies.UYU;
        if ("UZS".equals(codeString))
          return Currencies.UZS;
        if ("VEF".equals(codeString))
          return Currencies.VEF;
        if ("VND".equals(codeString))
          return Currencies.VND;
        if ("VUV".equals(codeString))
          return Currencies.VUV;
        if ("WST".equals(codeString))
          return Currencies.WST;
        if ("XAF".equals(codeString))
          return Currencies.XAF;
        if ("XAG".equals(codeString))
          return Currencies.XAG;
        if ("XAU".equals(codeString))
          return Currencies.XAU;
        if ("XBA".equals(codeString))
          return Currencies.XBA;
        if ("XBB".equals(codeString))
          return Currencies.XBB;
        if ("XBC".equals(codeString))
          return Currencies.XBC;
        if ("XBD".equals(codeString))
          return Currencies.XBD;
        if ("XCD".equals(codeString))
          return Currencies.XCD;
        if ("XDR".equals(codeString))
          return Currencies.XDR;
        if ("XOF".equals(codeString))
          return Currencies.XOF;
        if ("XPD".equals(codeString))
          return Currencies.XPD;
        if ("XPF".equals(codeString))
          return Currencies.XPF;
        if ("XPT".equals(codeString))
          return Currencies.XPT;
        if ("XSU".equals(codeString))
          return Currencies.XSU;
        if ("XTS".equals(codeString))
          return Currencies.XTS;
        if ("XUA".equals(codeString))
          return Currencies.XUA;
        if ("XXX".equals(codeString))
          return Currencies.XXX;
        if ("YER".equals(codeString))
          return Currencies.YER;
        if ("ZAR".equals(codeString))
          return Currencies.ZAR;
        if ("ZMW".equals(codeString))
          return Currencies.ZMW;
        if ("ZWL".equals(codeString))
          return Currencies.ZWL;
        throw new IllegalArgumentException("Unknown Currencies code '"+codeString+"'");
        }

        public Enumeration<Currencies> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<Currencies>(this, Currencies.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<Currencies>(this, Currencies.NULL, code);
        if ("AED".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AED, code);
        if ("AFN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AFN, code);
        if ("ALL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ALL, code);
        if ("AMD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AMD, code);
        if ("ANG".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ANG, code);
        if ("AOA".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AOA, code);
        if ("ARS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ARS, code);
        if ("AUD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AUD, code);
        if ("AWG".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AWG, code);
        if ("AZN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.AZN, code);
        if ("BAM".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BAM, code);
        if ("BBD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BBD, code);
        if ("BDT".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BDT, code);
        if ("BGN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BGN, code);
        if ("BHD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BHD, code);
        if ("BIF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BIF, code);
        if ("BMD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BMD, code);
        if ("BND".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BND, code);
        if ("BOB".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BOB, code);
        if ("BOV".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BOV, code);
        if ("BRL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BRL, code);
        if ("BSD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BSD, code);
        if ("BTN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BTN, code);
        if ("BWP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BWP, code);
        if ("BYN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BYN, code);
        if ("BZD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.BZD, code);
        if ("CAD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CAD, code);
        if ("CDF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CDF, code);
        if ("CHE".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CHE, code);
        if ("CHF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CHF, code);
        if ("CHW".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CHW, code);
        if ("CLF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CLF, code);
        if ("CLP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CLP, code);
        if ("CNY".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CNY, code);
        if ("COP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.COP, code);
        if ("COU".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.COU, code);
        if ("CRC".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CRC, code);
        if ("CUC".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CUC, code);
        if ("CUP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CUP, code);
        if ("CVE".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CVE, code);
        if ("CZK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.CZK, code);
        if ("DJF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.DJF, code);
        if ("DKK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.DKK, code);
        if ("DOP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.DOP, code);
        if ("DZD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.DZD, code);
        if ("EGP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.EGP, code);
        if ("ERN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ERN, code);
        if ("ETB".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ETB, code);
        if ("EUR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.EUR, code);
        if ("FJD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.FJD, code);
        if ("FKP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.FKP, code);
        if ("GBP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GBP, code);
        if ("GEL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GEL, code);
        if ("GGP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GGP, code);
        if ("GHS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GHS, code);
        if ("GIP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GIP, code);
        if ("GMD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GMD, code);
        if ("GNF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GNF, code);
        if ("GTQ".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GTQ, code);
        if ("GYD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.GYD, code);
        if ("HKD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.HKD, code);
        if ("HNL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.HNL, code);
        if ("HRK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.HRK, code);
        if ("HTG".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.HTG, code);
        if ("HUF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.HUF, code);
        if ("IDR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.IDR, code);
        if ("ILS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ILS, code);
        if ("IMP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.IMP, code);
        if ("INR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.INR, code);
        if ("IQD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.IQD, code);
        if ("IRR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.IRR, code);
        if ("ISK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ISK, code);
        if ("JEP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.JEP, code);
        if ("JMD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.JMD, code);
        if ("JOD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.JOD, code);
        if ("JPY".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.JPY, code);
        if ("KES".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KES, code);
        if ("KGS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KGS, code);
        if ("KHR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KHR, code);
        if ("KMF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KMF, code);
        if ("KPW".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KPW, code);
        if ("KRW".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KRW, code);
        if ("KWD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KWD, code);
        if ("KYD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KYD, code);
        if ("KZT".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.KZT, code);
        if ("LAK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.LAK, code);
        if ("LBP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.LBP, code);
        if ("LKR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.LKR, code);
        if ("LRD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.LRD, code);
        if ("LSL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.LSL, code);
        if ("LYD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.LYD, code);
        if ("MAD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MAD, code);
        if ("MDL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MDL, code);
        if ("MGA".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MGA, code);
        if ("MKD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MKD, code);
        if ("MMK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MMK, code);
        if ("MNT".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MNT, code);
        if ("MOP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MOP, code);
        if ("MRU".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MRU, code);
        if ("MUR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MUR, code);
        if ("MVR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MVR, code);
        if ("MWK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MWK, code);
        if ("MXN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MXN, code);
        if ("MXV".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MXV, code);
        if ("MYR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MYR, code);
        if ("MZN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.MZN, code);
        if ("NAD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.NAD, code);
        if ("NGN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.NGN, code);
        if ("NIO".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.NIO, code);
        if ("NOK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.NOK, code);
        if ("NPR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.NPR, code);
        if ("NZD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.NZD, code);
        if ("OMR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.OMR, code);
        if ("PAB".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PAB, code);
        if ("PEN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PEN, code);
        if ("PGK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PGK, code);
        if ("PHP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PHP, code);
        if ("PKR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PKR, code);
        if ("PLN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PLN, code);
        if ("PYG".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.PYG, code);
        if ("QAR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.QAR, code);
        if ("RON".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.RON, code);
        if ("RSD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.RSD, code);
        if ("RUB".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.RUB, code);
        if ("RWF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.RWF, code);
        if ("SAR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SAR, code);
        if ("SBD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SBD, code);
        if ("SCR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SCR, code);
        if ("SDG".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SDG, code);
        if ("SEK".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SEK, code);
        if ("SGD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SGD, code);
        if ("SHP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SHP, code);
        if ("SLL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SLL, code);
        if ("SOS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SOS, code);
        if ("SRD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SRD, code);
        if ("SSP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SSP, code);
        if ("STN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.STN, code);
        if ("SVC".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SVC, code);
        if ("SYP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SYP, code);
        if ("SZL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.SZL, code);
        if ("THB".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.THB, code);
        if ("TJS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TJS, code);
        if ("TMT".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TMT, code);
        if ("TND".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TND, code);
        if ("TOP".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TOP, code);
        if ("TRY".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TRY, code);
        if ("TTD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TTD, code);
        if ("TVD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TVD, code);
        if ("TWD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TWD, code);
        if ("TZS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.TZS, code);
        if ("UAH".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.UAH, code);
        if ("UGX".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.UGX, code);
        if ("USD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.USD, code);
        if ("USN".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.USN, code);
        if ("UYI".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.UYI, code);
        if ("UYU".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.UYU, code);
        if ("UZS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.UZS, code);
        if ("VEF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.VEF, code);
        if ("VND".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.VND, code);
        if ("VUV".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.VUV, code);
        if ("WST".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.WST, code);
        if ("XAF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XAF, code);
        if ("XAG".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XAG, code);
        if ("XAU".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XAU, code);
        if ("XBA".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XBA, code);
        if ("XBB".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XBB, code);
        if ("XBC".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XBC, code);
        if ("XBD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XBD, code);
        if ("XCD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XCD, code);
        if ("XDR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XDR, code);
        if ("XOF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XOF, code);
        if ("XPD".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XPD, code);
        if ("XPF".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XPF, code);
        if ("XPT".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XPT, code);
        if ("XSU".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XSU, code);
        if ("XTS".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XTS, code);
        if ("XUA".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XUA, code);
        if ("XXX".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.XXX, code);
        if ("YER".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.YER, code);
        if ("ZAR".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ZAR, code);
        if ("ZMW".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ZMW, code);
        if ("ZWL".equals(codeString))
          return new Enumeration<Currencies>(this, Currencies.ZWL, code);
        throw new FHIRException("Unknown Currencies code '"+codeString+"'");
        }
    public String toCode(Currencies code) {
      if (code == Currencies.AED)
        return "AED";
      if (code == Currencies.AFN)
        return "AFN";
      if (code == Currencies.ALL)
        return "ALL";
      if (code == Currencies.AMD)
        return "AMD";
      if (code == Currencies.ANG)
        return "ANG";
      if (code == Currencies.AOA)
        return "AOA";
      if (code == Currencies.ARS)
        return "ARS";
      if (code == Currencies.AUD)
        return "AUD";
      if (code == Currencies.AWG)
        return "AWG";
      if (code == Currencies.AZN)
        return "AZN";
      if (code == Currencies.BAM)
        return "BAM";
      if (code == Currencies.BBD)
        return "BBD";
      if (code == Currencies.BDT)
        return "BDT";
      if (code == Currencies.BGN)
        return "BGN";
      if (code == Currencies.BHD)
        return "BHD";
      if (code == Currencies.BIF)
        return "BIF";
      if (code == Currencies.BMD)
        return "BMD";
      if (code == Currencies.BND)
        return "BND";
      if (code == Currencies.BOB)
        return "BOB";
      if (code == Currencies.BOV)
        return "BOV";
      if (code == Currencies.BRL)
        return "BRL";
      if (code == Currencies.BSD)
        return "BSD";
      if (code == Currencies.BTN)
        return "BTN";
      if (code == Currencies.BWP)
        return "BWP";
      if (code == Currencies.BYN)
        return "BYN";
      if (code == Currencies.BZD)
        return "BZD";
      if (code == Currencies.CAD)
        return "CAD";
      if (code == Currencies.CDF)
        return "CDF";
      if (code == Currencies.CHE)
        return "CHE";
      if (code == Currencies.CHF)
        return "CHF";
      if (code == Currencies.CHW)
        return "CHW";
      if (code == Currencies.CLF)
        return "CLF";
      if (code == Currencies.CLP)
        return "CLP";
      if (code == Currencies.CNY)
        return "CNY";
      if (code == Currencies.COP)
        return "COP";
      if (code == Currencies.COU)
        return "COU";
      if (code == Currencies.CRC)
        return "CRC";
      if (code == Currencies.CUC)
        return "CUC";
      if (code == Currencies.CUP)
        return "CUP";
      if (code == Currencies.CVE)
        return "CVE";
      if (code == Currencies.CZK)
        return "CZK";
      if (code == Currencies.DJF)
        return "DJF";
      if (code == Currencies.DKK)
        return "DKK";
      if (code == Currencies.DOP)
        return "DOP";
      if (code == Currencies.DZD)
        return "DZD";
      if (code == Currencies.EGP)
        return "EGP";
      if (code == Currencies.ERN)
        return "ERN";
      if (code == Currencies.ETB)
        return "ETB";
      if (code == Currencies.EUR)
        return "EUR";
      if (code == Currencies.FJD)
        return "FJD";
      if (code == Currencies.FKP)
        return "FKP";
      if (code == Currencies.GBP)
        return "GBP";
      if (code == Currencies.GEL)
        return "GEL";
      if (code == Currencies.GGP)
        return "GGP";
      if (code == Currencies.GHS)
        return "GHS";
      if (code == Currencies.GIP)
        return "GIP";
      if (code == Currencies.GMD)
        return "GMD";
      if (code == Currencies.GNF)
        return "GNF";
      if (code == Currencies.GTQ)
        return "GTQ";
      if (code == Currencies.GYD)
        return "GYD";
      if (code == Currencies.HKD)
        return "HKD";
      if (code == Currencies.HNL)
        return "HNL";
      if (code == Currencies.HRK)
        return "HRK";
      if (code == Currencies.HTG)
        return "HTG";
      if (code == Currencies.HUF)
        return "HUF";
      if (code == Currencies.IDR)
        return "IDR";
      if (code == Currencies.ILS)
        return "ILS";
      if (code == Currencies.IMP)
        return "IMP";
      if (code == Currencies.INR)
        return "INR";
      if (code == Currencies.IQD)
        return "IQD";
      if (code == Currencies.IRR)
        return "IRR";
      if (code == Currencies.ISK)
        return "ISK";
      if (code == Currencies.JEP)
        return "JEP";
      if (code == Currencies.JMD)
        return "JMD";
      if (code == Currencies.JOD)
        return "JOD";
      if (code == Currencies.JPY)
        return "JPY";
      if (code == Currencies.KES)
        return "KES";
      if (code == Currencies.KGS)
        return "KGS";
      if (code == Currencies.KHR)
        return "KHR";
      if (code == Currencies.KMF)
        return "KMF";
      if (code == Currencies.KPW)
        return "KPW";
      if (code == Currencies.KRW)
        return "KRW";
      if (code == Currencies.KWD)
        return "KWD";
      if (code == Currencies.KYD)
        return "KYD";
      if (code == Currencies.KZT)
        return "KZT";
      if (code == Currencies.LAK)
        return "LAK";
      if (code == Currencies.LBP)
        return "LBP";
      if (code == Currencies.LKR)
        return "LKR";
      if (code == Currencies.LRD)
        return "LRD";
      if (code == Currencies.LSL)
        return "LSL";
      if (code == Currencies.LYD)
        return "LYD";
      if (code == Currencies.MAD)
        return "MAD";
      if (code == Currencies.MDL)
        return "MDL";
      if (code == Currencies.MGA)
        return "MGA";
      if (code == Currencies.MKD)
        return "MKD";
      if (code == Currencies.MMK)
        return "MMK";
      if (code == Currencies.MNT)
        return "MNT";
      if (code == Currencies.MOP)
        return "MOP";
      if (code == Currencies.MRU)
        return "MRU";
      if (code == Currencies.MUR)
        return "MUR";
      if (code == Currencies.MVR)
        return "MVR";
      if (code == Currencies.MWK)
        return "MWK";
      if (code == Currencies.MXN)
        return "MXN";
      if (code == Currencies.MXV)
        return "MXV";
      if (code == Currencies.MYR)
        return "MYR";
      if (code == Currencies.MZN)
        return "MZN";
      if (code == Currencies.NAD)
        return "NAD";
      if (code == Currencies.NGN)
        return "NGN";
      if (code == Currencies.NIO)
        return "NIO";
      if (code == Currencies.NOK)
        return "NOK";
      if (code == Currencies.NPR)
        return "NPR";
      if (code == Currencies.NZD)
        return "NZD";
      if (code == Currencies.OMR)
        return "OMR";
      if (code == Currencies.PAB)
        return "PAB";
      if (code == Currencies.PEN)
        return "PEN";
      if (code == Currencies.PGK)
        return "PGK";
      if (code == Currencies.PHP)
        return "PHP";
      if (code == Currencies.PKR)
        return "PKR";
      if (code == Currencies.PLN)
        return "PLN";
      if (code == Currencies.PYG)
        return "PYG";
      if (code == Currencies.QAR)
        return "QAR";
      if (code == Currencies.RON)
        return "RON";
      if (code == Currencies.RSD)
        return "RSD";
      if (code == Currencies.RUB)
        return "RUB";
      if (code == Currencies.RWF)
        return "RWF";
      if (code == Currencies.SAR)
        return "SAR";
      if (code == Currencies.SBD)
        return "SBD";
      if (code == Currencies.SCR)
        return "SCR";
      if (code == Currencies.SDG)
        return "SDG";
      if (code == Currencies.SEK)
        return "SEK";
      if (code == Currencies.SGD)
        return "SGD";
      if (code == Currencies.SHP)
        return "SHP";
      if (code == Currencies.SLL)
        return "SLL";
      if (code == Currencies.SOS)
        return "SOS";
      if (code == Currencies.SRD)
        return "SRD";
      if (code == Currencies.SSP)
        return "SSP";
      if (code == Currencies.STN)
        return "STN";
      if (code == Currencies.SVC)
        return "SVC";
      if (code == Currencies.SYP)
        return "SYP";
      if (code == Currencies.SZL)
        return "SZL";
      if (code == Currencies.THB)
        return "THB";
      if (code == Currencies.TJS)
        return "TJS";
      if (code == Currencies.TMT)
        return "TMT";
      if (code == Currencies.TND)
        return "TND";
      if (code == Currencies.TOP)
        return "TOP";
      if (code == Currencies.TRY)
        return "TRY";
      if (code == Currencies.TTD)
        return "TTD";
      if (code == Currencies.TVD)
        return "TVD";
      if (code == Currencies.TWD)
        return "TWD";
      if (code == Currencies.TZS)
        return "TZS";
      if (code == Currencies.UAH)
        return "UAH";
      if (code == Currencies.UGX)
        return "UGX";
      if (code == Currencies.USD)
        return "USD";
      if (code == Currencies.USN)
        return "USN";
      if (code == Currencies.UYI)
        return "UYI";
      if (code == Currencies.UYU)
        return "UYU";
      if (code == Currencies.UZS)
        return "UZS";
      if (code == Currencies.VEF)
        return "VEF";
      if (code == Currencies.VND)
        return "VND";
      if (code == Currencies.VUV)
        return "VUV";
      if (code == Currencies.WST)
        return "WST";
      if (code == Currencies.XAF)
        return "XAF";
      if (code == Currencies.XAG)
        return "XAG";
      if (code == Currencies.XAU)
        return "XAU";
      if (code == Currencies.XBA)
        return "XBA";
      if (code == Currencies.XBB)
        return "XBB";
      if (code == Currencies.XBC)
        return "XBC";
      if (code == Currencies.XBD)
        return "XBD";
      if (code == Currencies.XCD)
        return "XCD";
      if (code == Currencies.XDR)
        return "XDR";
      if (code == Currencies.XOF)
        return "XOF";
      if (code == Currencies.XPD)
        return "XPD";
      if (code == Currencies.XPF)
        return "XPF";
      if (code == Currencies.XPT)
        return "XPT";
      if (code == Currencies.XSU)
        return "XSU";
      if (code == Currencies.XTS)
        return "XTS";
      if (code == Currencies.XUA)
        return "XUA";
      if (code == Currencies.XXX)
        return "XXX";
      if (code == Currencies.YER)
        return "YER";
      if (code == Currencies.ZAR)
        return "ZAR";
      if (code == Currencies.ZMW)
        return "ZMW";
      if (code == Currencies.ZWL)
        return "ZWL";
      return "?";
      }
    public String toSystem(Currencies code) {
      return code.getSystem();
      }
    }

    public enum DaysOfWeek {
        /**
         * Monday.
         */
        MON, 
        /**
         * Tuesday.
         */
        TUE, 
        /**
         * Wednesday.
         */
        WED, 
        /**
         * Thursday.
         */
        THU, 
        /**
         * Friday.
         */
        FRI, 
        /**
         * Saturday.
         */
        SAT, 
        /**
         * Sunday.
         */
        SUN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static DaysOfWeek fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("mon".equals(codeString))
          return MON;
        if ("tue".equals(codeString))
          return TUE;
        if ("wed".equals(codeString))
          return WED;
        if ("thu".equals(codeString))
          return THU;
        if ("fri".equals(codeString))
          return FRI;
        if ("sat".equals(codeString))
          return SAT;
        if ("sun".equals(codeString))
          return SUN;
        throw new FHIRException("Unknown DaysOfWeek code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "mon", "tue", "wed", "thu", "fri", "sat", "sun");
        }
        public String toCode() {
          switch (this) {
            case MON: return "mon";
            case TUE: return "tue";
            case WED: return "wed";
            case THU: return "thu";
            case FRI: return "fri";
            case SAT: return "sat";
            case SUN: return "sun";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MON: return "http://hl7.org/fhir/days-of-week";
            case TUE: return "http://hl7.org/fhir/days-of-week";
            case WED: return "http://hl7.org/fhir/days-of-week";
            case THU: return "http://hl7.org/fhir/days-of-week";
            case FRI: return "http://hl7.org/fhir/days-of-week";
            case SAT: return "http://hl7.org/fhir/days-of-week";
            case SUN: return "http://hl7.org/fhir/days-of-week";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MON: return "Monday.";
            case TUE: return "Tuesday.";
            case WED: return "Wednesday.";
            case THU: return "Thursday.";
            case FRI: return "Friday.";
            case SAT: return "Saturday.";
            case SUN: return "Sunday.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MON: return "Monday";
            case TUE: return "Tuesday";
            case WED: return "Wednesday";
            case THU: return "Thursday";
            case FRI: return "Friday";
            case SAT: return "Saturday";
            case SUN: return "Sunday";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class DaysOfWeekEnumFactory implements EnumFactory<DaysOfWeek> {
    public DaysOfWeek fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("mon".equals(codeString))
          return DaysOfWeek.MON;
        if ("tue".equals(codeString))
          return DaysOfWeek.TUE;
        if ("wed".equals(codeString))
          return DaysOfWeek.WED;
        if ("thu".equals(codeString))
          return DaysOfWeek.THU;
        if ("fri".equals(codeString))
          return DaysOfWeek.FRI;
        if ("sat".equals(codeString))
          return DaysOfWeek.SAT;
        if ("sun".equals(codeString))
          return DaysOfWeek.SUN;
        throw new IllegalArgumentException("Unknown DaysOfWeek code '"+codeString+"'");
        }

        public Enumeration<DaysOfWeek> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<DaysOfWeek>(this, DaysOfWeek.NULL, code);
        if ("mon".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.MON, code);
        if ("tue".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.TUE, code);
        if ("wed".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.WED, code);
        if ("thu".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.THU, code);
        if ("fri".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.FRI, code);
        if ("sat".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.SAT, code);
        if ("sun".equals(codeString))
          return new Enumeration<DaysOfWeek>(this, DaysOfWeek.SUN, code);
        throw new FHIRException("Unknown DaysOfWeek code '"+codeString+"'");
        }
    public String toCode(DaysOfWeek code) {
      if (code == DaysOfWeek.MON)
        return "mon";
      if (code == DaysOfWeek.TUE)
        return "tue";
      if (code == DaysOfWeek.WED)
        return "wed";
      if (code == DaysOfWeek.THU)
        return "thu";
      if (code == DaysOfWeek.FRI)
        return "fri";
      if (code == DaysOfWeek.SAT)
        return "sat";
      if (code == DaysOfWeek.SUN)
        return "sun";
      return "?";
      }
    public String toSystem(DaysOfWeek code) {
      return code.getSystem();
      }
    }

    public enum EncounterStatus {
        /**
         * The Encounter has not yet started.
         */
        PLANNED, 
        /**
         * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
         */
        INPROGRESS, 
        /**
         * The Encounter has begun, but is currently on hold, e.g. because the patient is temporarily on leave.
         */
        ONHOLD, 
        /**
         * The Encounter has been clinically completed, the patient has been discharged from the facility or the visit has ended, and the patient may have departed (refer to subjectStatus). While the encounter is in this status, administrative activities are usually performed, collating all required documentation and charge information before being released for billing, at which point the status will move to completed.
         */
        DISCHARGED, 
        /**
         * The Encounter has ended.
         */
        COMPLETED, 
        /**
         * The Encounter has ended before it has begun.
         */
        CANCELLED, 
        /**
         * The Encounter has started, but was not able to be completed. Further action may need to be performed, such as rescheduling appointments related to this encounter.
         */
        DISCONTINUED, 
        /**
         * This instance should not have been part of this patient's medical record.
         */
        ENTEREDINERROR, 
        /**
         * The encounter status is unknown. Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static EncounterStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
          return PLANNED;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("on-hold".equals(codeString))
          return ONHOLD;
        if ("discharged".equals(codeString))
          return DISCHARGED;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("discontinued".equals(codeString))
          return DISCONTINUED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        throw new FHIRException("Unknown EncounterStatus code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "planned", "in-progress", "on-hold", "discharged", "completed", "cancelled", "discontinued", "entered-in-error", "unknown");
        }
        public String toCode() {
          switch (this) {
            case PLANNED: return "planned";
            case INPROGRESS: return "in-progress";
            case ONHOLD: return "on-hold";
            case DISCHARGED: return "discharged";
            case COMPLETED: return "completed";
            case CANCELLED: return "cancelled";
            case DISCONTINUED: return "discontinued";
            case ENTEREDINERROR: return "entered-in-error";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PLANNED: return "http://hl7.org/fhir/encounter-status";
            case INPROGRESS: return "http://hl7.org/fhir/encounter-status";
            case ONHOLD: return "http://hl7.org/fhir/encounter-status";
            case DISCHARGED: return "http://hl7.org/fhir/encounter-status";
            case COMPLETED: return "http://hl7.org/fhir/encounter-status";
            case CANCELLED: return "http://hl7.org/fhir/encounter-status";
            case DISCONTINUED: return "http://hl7.org/fhir/encounter-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/encounter-status";
            case UNKNOWN: return "http://hl7.org/fhir/encounter-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PLANNED: return "The Encounter has not yet started.";
            case INPROGRESS: return "The Encounter has begun and the patient is present / the practitioner and the patient are meeting.";
            case ONHOLD: return "The Encounter has begun, but is currently on hold, e.g. because the patient is temporarily on leave.";
            case DISCHARGED: return "The Encounter has been clinically completed, the patient has been discharged from the facility or the visit has ended, and the patient may have departed (refer to subjectStatus). While the encounter is in this status, administrative activities are usually performed, collating all required documentation and charge information before being released for billing, at which point the status will move to completed.";
            case COMPLETED: return "The Encounter has ended.";
            case CANCELLED: return "The Encounter has ended before it has begun.";
            case DISCONTINUED: return "The Encounter has started, but was not able to be completed. Further action may need to be performed, such as rescheduling appointments related to this encounter.";
            case ENTEREDINERROR: return "This instance should not have been part of this patient's medical record.";
            case UNKNOWN: return "The encounter status is unknown. Note that \"unknown\" is a value of last resort and every attempt should be made to provide a meaningful value other than \"unknown\".";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PLANNED: return "Planned";
            case INPROGRESS: return "In Progress";
            case ONHOLD: return "On Hold";
            case DISCHARGED: return "Discharged";
            case COMPLETED: return "Completed";
            case CANCELLED: return "Cancelled";
            case DISCONTINUED: return "Discontinued";
            case ENTEREDINERROR: return "Entered in Error";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class EncounterStatusEnumFactory implements EnumFactory<EncounterStatus> {
    public EncounterStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("planned".equals(codeString))
          return EncounterStatus.PLANNED;
        if ("in-progress".equals(codeString))
          return EncounterStatus.INPROGRESS;
        if ("on-hold".equals(codeString))
          return EncounterStatus.ONHOLD;
        if ("discharged".equals(codeString))
          return EncounterStatus.DISCHARGED;
        if ("completed".equals(codeString))
          return EncounterStatus.COMPLETED;
        if ("cancelled".equals(codeString))
          return EncounterStatus.CANCELLED;
        if ("discontinued".equals(codeString))
          return EncounterStatus.DISCONTINUED;
        if ("entered-in-error".equals(codeString))
          return EncounterStatus.ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return EncounterStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown EncounterStatus code '"+codeString+"'");
        }

        public Enumeration<EncounterStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<EncounterStatus>(this, EncounterStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<EncounterStatus>(this, EncounterStatus.NULL, code);
        if ("planned".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.PLANNED, code);
        if ("in-progress".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.INPROGRESS, code);
        if ("on-hold".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.ONHOLD, code);
        if ("discharged".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.DISCHARGED, code);
        if ("completed".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.COMPLETED, code);
        if ("cancelled".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.CANCELLED, code);
        if ("discontinued".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.DISCONTINUED, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.ENTEREDINERROR, code);
        if ("unknown".equals(codeString))
          return new Enumeration<EncounterStatus>(this, EncounterStatus.UNKNOWN, code);
        throw new FHIRException("Unknown EncounterStatus code '"+codeString+"'");
        }
    public String toCode(EncounterStatus code) {
      if (code == EncounterStatus.PLANNED)
        return "planned";
      if (code == EncounterStatus.INPROGRESS)
        return "in-progress";
      if (code == EncounterStatus.ONHOLD)
        return "on-hold";
      if (code == EncounterStatus.DISCHARGED)
        return "discharged";
      if (code == EncounterStatus.COMPLETED)
        return "completed";
      if (code == EncounterStatus.CANCELLED)
        return "cancelled";
      if (code == EncounterStatus.DISCONTINUED)
        return "discontinued";
      if (code == EncounterStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == EncounterStatus.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(EncounterStatus code) {
      return code.getSystem();
      }
    }

    public enum EventStatus {
        /**
         * The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.
         */
        PREPARATION, 
        /**
         * The event is currently occurring.
         */
        INPROGRESS, 
        /**
         * The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific.
         */
        NOTDONE, 
        /**
         * The event has been temporarily stopped but is expected to resume in the future.
         */
        ONHOLD, 
        /**
         * The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred.
         */
        STOPPED, 
        /**
         * The event has now concluded.
         */
        COMPLETED, 
        /**
         * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "stopped" rather than "entered-in-error".).
         */
        ENTEREDINERROR, 
        /**
         * The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static EventStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("preparation".equals(codeString))
          return PREPARATION;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("not-done".equals(codeString))
          return NOTDONE;
        if ("on-hold".equals(codeString))
          return ONHOLD;
        if ("stopped".equals(codeString))
          return STOPPED;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        throw new FHIRException("Unknown EventStatus code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "preparation", "in-progress", "not-done", "on-hold", "stopped", "completed", "entered-in-error", "unknown");
        }
        public String toCode() {
          switch (this) {
            case PREPARATION: return "preparation";
            case INPROGRESS: return "in-progress";
            case NOTDONE: return "not-done";
            case ONHOLD: return "on-hold";
            case STOPPED: return "stopped";
            case COMPLETED: return "completed";
            case ENTEREDINERROR: return "entered-in-error";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PREPARATION: return "http://hl7.org/fhir/event-status";
            case INPROGRESS: return "http://hl7.org/fhir/event-status";
            case NOTDONE: return "http://hl7.org/fhir/event-status";
            case ONHOLD: return "http://hl7.org/fhir/event-status";
            case STOPPED: return "http://hl7.org/fhir/event-status";
            case COMPLETED: return "http://hl7.org/fhir/event-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/event-status";
            case UNKNOWN: return "http://hl7.org/fhir/event-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PREPARATION: return "The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.";
            case INPROGRESS: return "The event is currently occurring.";
            case NOTDONE: return "The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific.";
            case ONHOLD: return "The event has been temporarily stopped but is expected to resume in the future.";
            case STOPPED: return "The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred.";
            case COMPLETED: return "The event has now concluded.";
            case ENTEREDINERROR: return "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"stopped\" rather than \"entered-in-error\".).";
            case UNKNOWN: return "The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PREPARATION: return "Preparation";
            case INPROGRESS: return "In Progress";
            case NOTDONE: return "Not Done";
            case ONHOLD: return "On Hold";
            case STOPPED: return "Stopped";
            case COMPLETED: return "Completed";
            case ENTEREDINERROR: return "Entered in Error";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class EventStatusEnumFactory implements EnumFactory<EventStatus> {
    public EventStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("preparation".equals(codeString))
          return EventStatus.PREPARATION;
        if ("in-progress".equals(codeString))
          return EventStatus.INPROGRESS;
        if ("not-done".equals(codeString))
          return EventStatus.NOTDONE;
        if ("on-hold".equals(codeString))
          return EventStatus.ONHOLD;
        if ("stopped".equals(codeString))
          return EventStatus.STOPPED;
        if ("completed".equals(codeString))
          return EventStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
          return EventStatus.ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return EventStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown EventStatus code '"+codeString+"'");
        }

        public Enumeration<EventStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<EventStatus>(this, EventStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<EventStatus>(this, EventStatus.NULL, code);
        if ("preparation".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.PREPARATION, code);
        if ("in-progress".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.INPROGRESS, code);
        if ("not-done".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.NOTDONE, code);
        if ("on-hold".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.ONHOLD, code);
        if ("stopped".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.STOPPED, code);
        if ("completed".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.COMPLETED, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.ENTEREDINERROR, code);
        if ("unknown".equals(codeString))
          return new Enumeration<EventStatus>(this, EventStatus.UNKNOWN, code);
        throw new FHIRException("Unknown EventStatus code '"+codeString+"'");
        }
    public String toCode(EventStatus code) {
      if (code == EventStatus.PREPARATION)
        return "preparation";
      if (code == EventStatus.INPROGRESS)
        return "in-progress";
      if (code == EventStatus.NOTDONE)
        return "not-done";
      if (code == EventStatus.ONHOLD)
        return "on-hold";
      if (code == EventStatus.STOPPED)
        return "stopped";
      if (code == EventStatus.COMPLETED)
        return "completed";
      if (code == EventStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == EventStatus.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(EventStatus code) {
      return code.getSystem();
      }
    }

    public enum FHIRTypes {
        /**
         * Base Type: Base definition for all types defined in FHIR type system.
         */
        BASE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static FHIRTypes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Base".equals(codeString))
          return BASE;
        throw new FHIRException("Unknown FHIRTypes code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "Base");
        }
        public String toCode() {
          switch (this) {
            case BASE: return "Base";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case BASE: return "http://hl7.org/fhir/fhir-types";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case BASE: return "Base Type: Base definition for all types defined in FHIR type system.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case BASE: return "Base";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class FHIRTypesEnumFactory implements EnumFactory<FHIRTypes> {
    public FHIRTypes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Base".equals(codeString))
          return FHIRTypes.BASE;
        throw new IllegalArgumentException("Unknown FHIRTypes code '"+codeString+"'");
        }

        public Enumeration<FHIRTypes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<FHIRTypes>(this, FHIRTypes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<FHIRTypes>(this, FHIRTypes.NULL, code);
        if ("Base".equals(codeString))
          return new Enumeration<FHIRTypes>(this, FHIRTypes.BASE, code);
        throw new FHIRException("Unknown FHIRTypes code '"+codeString+"'");
        }
    public String toCode(FHIRTypes code) {
      if (code == FHIRTypes.BASE)
        return "Base";
      return "?";
      }
    public String toSystem(FHIRTypes code) {
      return code.getSystem();
      }
    }

    public enum FHIRVersion {
        /**
         * Oldest archived version of FHIR.
         */
        _0_01, 
        /**
         * 1st Draft for Comment (Sept 2012 Ballot).
         */
        _0_05, 
        /**
         * 2nd Draft for Comment (January 2013 Ballot).
         */
        _0_06, 
        /**
         * DSTU 1 Ballot version.
         */
        _0_11, 
        /**
         * DSTU 1 version.
         */
        _0_0, 
        /**
         * January 2015 Ballot.
         */
        _0_4, 
        /**
         * May 2015 Ballot.
         */
        _0_5, 
        /**
         * DSTU 2 version.
         */
        _1_0, 
        /**
         * GAO Ballot version.
         */
        _1_1, 
        /**
         * Connectathon 12 (Montreal) version.
         */
        _1_4, 
        /**
         * Connectathon 13 (Baltimore) version.
         */
        _1_6, 
        /**
         * Connectathon 14 (San Antonio) version.
         */
        _1_8, 
        /**
         * STU3 version.
         */
        _3_0, 
        /**
         * R4 Ballot #1 version.
         */
        _3_3, 
        /**
         * R4 Ballot #2 version.
         */
        _3_5, 
        /**
         * R4 version.
         */
        _4_0, 
        /**
         * R4B Ballot #1 version.
         */
        _4_1, 
        /**
         * R5 Preview #1 version.
         */
        _4_2, 
        /**
         * R4B version.
         */
        _4_3, 
        /**
         * R5 Preview #2 version.
         */
        _4_4, 
        /**
         * R5 Preview #3 version.
         */
        _4_5, 
        /**
         * R5 Draft Ballot version.
         */
        _4_6, 
        /**
         * R5 Versions.
         */
        _5_0, 
        /**
         * R6 Versions.
         */
        _6_0, 
        /**
         * added to help the parsers
         */
        NULL;
        public static FHIRVersion fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("0.01".equals(codeString))
          return _0_01;
        if ("0.05".equals(codeString))
          return _0_05;
        if ("0.06".equals(codeString))
          return _0_06;
        if ("0.11".equals(codeString))
          return _0_11;
        if ("0.0".equals(codeString))
          return _0_0;
        if ("0.4".equals(codeString))
          return _0_4;
        if ("0.5".equals(codeString))
          return _0_5;
        if ("1.0".equals(codeString))
          return _1_0;
        if ("1.1".equals(codeString))
          return _1_1;
        if ("1.4".equals(codeString))
          return _1_4;
        if ("1.6".equals(codeString))
          return _1_6;
        if ("1.8".equals(codeString))
          return _1_8;
        if ("3.0".equals(codeString))
          return _3_0;
        if ("3.3".equals(codeString))
          return _3_3;
        if ("3.5".equals(codeString))
          return _3_5;
        if ("4.0".equals(codeString))
          return _4_0;
        if ("4.1".equals(codeString))
          return _4_1;
        if ("4.2".equals(codeString))
          return _4_2;
        if ("4.3".equals(codeString))
          return _4_3;
        if ("4.4".equals(codeString))
          return _4_4;
        if ("4.5".equals(codeString))
          return _4_5;
        if ("4.6".equals(codeString))
          return _4_6;
        if ("5.0".equals(codeString))
          return _5_0;
        if ("6.0".equals(codeString))
          return _6_0;
        throw new FHIRException("Unknown FHIRVersion code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "0.01", "0.05", "0.06", "0.11", "0.0", "0.4", "0.5", "1.0", "1.1", "1.4", "1.6", "1.8", "3.0", "3.3", "3.5", "4.0", "4.1", "4.2", "4.3", "4.4", "4.5", "4.6", "5.0", "6.0");
        }
        public String toCode() {
          switch (this) {
            case _0_01: return "0.01";
            case _0_05: return "0.05";
            case _0_06: return "0.06";
            case _0_11: return "0.11";
            case _0_0: return "0.0";
            case _0_4: return "0.4";
            case _0_5: return "0.5";
            case _1_0: return "1.0";
            case _1_1: return "1.1";
            case _1_4: return "1.4";
            case _1_6: return "1.6";
            case _1_8: return "1.8";
            case _3_0: return "3.0";
            case _3_3: return "3.3";
            case _3_5: return "3.5";
            case _4_0: return "4.0";
            case _4_1: return "4.1";
            case _4_2: return "4.2";
            case _4_3: return "4.3";
            case _4_4: return "4.4";
            case _4_5: return "4.5";
            case _4_6: return "4.6";
            case _5_0: return "5.0";
            case _6_0: return "6.0";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case _0_01: return "http://hl7.org/fhir/FHIR-version";
            case _0_05: return "http://hl7.org/fhir/FHIR-version";
            case _0_06: return "http://hl7.org/fhir/FHIR-version";
            case _0_11: return "http://hl7.org/fhir/FHIR-version";
            case _0_0: return "http://hl7.org/fhir/FHIR-version";
            case _0_4: return "http://hl7.org/fhir/FHIR-version";
            case _0_5: return "http://hl7.org/fhir/FHIR-version";
            case _1_0: return "http://hl7.org/fhir/FHIR-version";
            case _1_1: return "http://hl7.org/fhir/FHIR-version";
            case _1_4: return "http://hl7.org/fhir/FHIR-version";
            case _1_6: return "http://hl7.org/fhir/FHIR-version";
            case _1_8: return "http://hl7.org/fhir/FHIR-version";
            case _3_0: return "http://hl7.org/fhir/FHIR-version";
            case _3_3: return "http://hl7.org/fhir/FHIR-version";
            case _3_5: return "http://hl7.org/fhir/FHIR-version";
            case _4_0: return "http://hl7.org/fhir/FHIR-version";
            case _4_1: return "http://hl7.org/fhir/FHIR-version";
            case _4_2: return "http://hl7.org/fhir/FHIR-version";
            case _4_3: return "http://hl7.org/fhir/FHIR-version";
            case _4_4: return "http://hl7.org/fhir/FHIR-version";
            case _4_5: return "http://hl7.org/fhir/FHIR-version";
            case _4_6: return "http://hl7.org/fhir/FHIR-version";
            case _5_0: return "http://hl7.org/fhir/FHIR-version";
            case _6_0: return "http://hl7.org/fhir/FHIR-version";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case _0_01: return "Oldest archived version of FHIR.";
            case _0_05: return "1st Draft for Comment (Sept 2012 Ballot).";
            case _0_06: return "2nd Draft for Comment (January 2013 Ballot).";
            case _0_11: return "DSTU 1 Ballot version.";
            case _0_0: return "DSTU 1 version.";
            case _0_4: return "January 2015 Ballot.";
            case _0_5: return "May 2015 Ballot.";
            case _1_0: return "DSTU 2 version.";
            case _1_1: return "GAO Ballot version.";
            case _1_4: return "Connectathon 12 (Montreal) version.";
            case _1_6: return "Connectathon 13 (Baltimore) version.";
            case _1_8: return "Connectathon 14 (San Antonio) version.";
            case _3_0: return "STU3 version.";
            case _3_3: return "R4 Ballot #1 version.";
            case _3_5: return "R4 Ballot #2 version.";
            case _4_0: return "R4 version.";
            case _4_1: return "R4B Ballot #1 version.";
            case _4_2: return "R5 Preview #1 version.";
            case _4_3: return "R4B version.";
            case _4_4: return "R5 Preview #2 version.";
            case _4_5: return "R5 Preview #3 version.";
            case _4_6: return "R5 Draft Ballot version.";
            case _5_0: return "R5 Versions.";
            case _6_0: return "R6 Versions.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case _0_01: return "0.01";
            case _0_05: return "0.05";
            case _0_06: return "0.06";
            case _0_11: return "0.11";
            case _0_0: return "0.0";
            case _0_4: return "0.4";
            case _0_5: return "0.5";
            case _1_0: return "1.0";
            case _1_1: return "1.1";
            case _1_4: return "1.4";
            case _1_6: return "1.6";
            case _1_8: return "1.8";
            case _3_0: return "3.0";
            case _3_3: return "3.3";
            case _3_5: return "3.5";
            case _4_0: return "4.0";
            case _4_1: return "4.1";
            case _4_2: return "4.2";
            case _4_3: return "4.3";
            case _4_4: return "4.4";
            case _4_5: return "4.5";
            case _4_6: return "4.6";
            case _5_0: return "5.0";
            case _6_0: return "6.0";
            case NULL: return null;
            default: return "?";
          }
        }
// manual code from configuration.txt:
//public String toCode(int len) {
//          return toCode().substring(0, len);
//        }
//
//     
//        @Override
//        public String toString() {
//          return toCode();
//        }
//        
//        
//        public boolean isR4B() {
//          return toCode().startsWith("4.1");
//        }
//        
// end addition
    }

  public static class FHIRVersionEnumFactory implements EnumFactory<FHIRVersion> {
    public FHIRVersion fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("0.01".equals(codeString))
          return FHIRVersion._0_01;
        if ("0.05".equals(codeString))
          return FHIRVersion._0_05;
        if ("0.06".equals(codeString))
          return FHIRVersion._0_06;
        if ("0.11".equals(codeString))
          return FHIRVersion._0_11;
        if ("0.0".equals(codeString))
          return FHIRVersion._0_0;
        if ("0.4".equals(codeString))
          return FHIRVersion._0_4;
        if ("0.5".equals(codeString))
          return FHIRVersion._0_5;
        if ("1.0".equals(codeString))
          return FHIRVersion._1_0;
        if ("1.1".equals(codeString))
          return FHIRVersion._1_1;
        if ("1.4".equals(codeString))
          return FHIRVersion._1_4;
        if ("1.6".equals(codeString))
          return FHIRVersion._1_6;
        if ("1.8".equals(codeString))
          return FHIRVersion._1_8;
        if ("3.0".equals(codeString))
          return FHIRVersion._3_0;
        if ("3.3".equals(codeString))
          return FHIRVersion._3_3;
        if ("3.5".equals(codeString))
          return FHIRVersion._3_5;
        if ("4.0".equals(codeString))
          return FHIRVersion._4_0;
        if ("4.1".equals(codeString))
          return FHIRVersion._4_1;
        if ("4.2".equals(codeString))
          return FHIRVersion._4_2;
        if ("4.3".equals(codeString))
          return FHIRVersion._4_3;
        if ("4.4".equals(codeString))
          return FHIRVersion._4_4;
        if ("4.5".equals(codeString))
          return FHIRVersion._4_5;
        if ("4.6".equals(codeString))
          return FHIRVersion._4_6;
        if ("5.0".equals(codeString))
          return FHIRVersion._5_0;
        if ("6.0".equals(codeString))
          return FHIRVersion._6_0;
        throw new IllegalArgumentException("Unknown FHIRVersion code '"+codeString+"'");
        }

        public Enumeration<FHIRVersion> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<FHIRVersion>(this, FHIRVersion.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<FHIRVersion>(this, FHIRVersion.NULL, code);
        if ("0.01".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_01, code);
        if ("0.05".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_05, code);
        if ("0.06".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_06, code);
        if ("0.11".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_11, code);
        if ("0.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_0, code);
        if ("0.4".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_4, code);
        if ("0.5".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._0_5, code);
        if ("1.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_0, code);
        if ("1.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_1, code);
        if ("1.4".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_4, code);
        if ("1.6".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_6, code);
        if ("1.8".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._1_8, code);
        if ("3.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_0, code);
        if ("3.3".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_3, code);
        if ("3.5".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._3_5, code);
        if ("4.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_0, code);
        if ("4.1".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_1, code);
        if ("4.2".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_2, code);
        if ("4.3".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_3, code);
        if ("4.4".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_4, code);
        if ("4.5".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_5, code);
        if ("4.6".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._4_6, code);
        if ("5.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._5_0, code);
        if ("6.0".equals(codeString))
          return new Enumeration<FHIRVersion>(this, FHIRVersion._6_0, code);
        throw new FHIRException("Unknown FHIRVersion code '"+codeString+"'");
        }
    public String toCode(FHIRVersion code) {
      if (code == FHIRVersion._0_01)
        return "0.01";
      if (code == FHIRVersion._0_05)
        return "0.05";
      if (code == FHIRVersion._0_06)
        return "0.06";
      if (code == FHIRVersion._0_11)
        return "0.11";
      if (code == FHIRVersion._0_0)
        return "0.0";
      if (code == FHIRVersion._0_4)
        return "0.4";
      if (code == FHIRVersion._0_5)
        return "0.5";
      if (code == FHIRVersion._1_0)
        return "1.0";
      if (code == FHIRVersion._1_1)
        return "1.1";
      if (code == FHIRVersion._1_4)
        return "1.4";
      if (code == FHIRVersion._1_6)
        return "1.6";
      if (code == FHIRVersion._1_8)
        return "1.8";
      if (code == FHIRVersion._3_0)
        return "3.0";
      if (code == FHIRVersion._3_3)
        return "3.3";
      if (code == FHIRVersion._3_5)
        return "3.5";
      if (code == FHIRVersion._4_0)
        return "4.0";
      if (code == FHIRVersion._4_1)
        return "4.1";
      if (code == FHIRVersion._4_2)
        return "4.2";
      if (code == FHIRVersion._4_3)
        return "4.3";
      if (code == FHIRVersion._4_4)
        return "4.4";
      if (code == FHIRVersion._4_5)
        return "4.5";
      if (code == FHIRVersion._4_6)
        return "4.6";
      if (code == FHIRVersion._5_0)
        return "5.0";
      if (code == FHIRVersion._6_0)
        return "6.0";
      return "?";
      }
    public String toSystem(FHIRVersion code) {
      return code.getSystem();
      }
    }

    public enum FilterOperator {
        /**
         * The specified property of the code equals the provided value.
         */
        EQUAL, 
        /**
         * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self).
         */
        ISA, 
        /**
         * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself (i.e. include descendant codes only).
         */
        DESCENDENTOF, 
        /**
         * The specified property of the code does not have an is-a relationship with the provided value.
         */
        ISNOTA, 
        /**
         * The specified property of the code  matches the regex specified in the provided value.
         */
        REGEX, 
        /**
         * The specified property of the code is in the set of codes or concepts specified in the provided value (comma-separated list).
         */
        IN, 
        /**
         * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma-separated list).
         */
        NOTIN, 
        /**
         * Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self).
         */
        GENERALIZES, 
        /**
         * Only concepts with a direct hierarchical relationship to the index code and no other concepts. This does not include the index code in the output.
         */
        CHILDOF, 
        /**
         * Includes concept ids that have a transitive is-a relationship with the concept Id provided as the value, but which do not have any concept ids with transitive is-a relationships with themselves.
         */
        DESCENDENTLEAF, 
        /**
         * The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values).
         */
        EXISTS, 
        /**
         * added to help the parsers
         */
        NULL;
        public static FilterOperator fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("=".equals(codeString))
          return EQUAL;
        if ("is-a".equals(codeString))
          return ISA;
        if ("descendent-of".equals(codeString))
          return DESCENDENTOF;
        if ("is-not-a".equals(codeString))
          return ISNOTA;
        if ("regex".equals(codeString))
          return REGEX;
        if ("in".equals(codeString))
          return IN;
        if ("not-in".equals(codeString))
          return NOTIN;
        if ("generalizes".equals(codeString))
          return GENERALIZES;
        if ("child-of".equals(codeString))
          return CHILDOF;
        if ("descendent-leaf".equals(codeString))
          return DESCENDENTLEAF;
        if ("exists".equals(codeString))
          return EXISTS;
        throw new FHIRException("Unknown FilterOperator code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "=", "is-a", "descendent-of", "is-not-a", "regex", "in", "not-in", "generalizes", "child-of", "descendent-leaf", "exists");
        }
        public String toCode() {
          switch (this) {
            case EQUAL: return "=";
            case ISA: return "is-a";
            case DESCENDENTOF: return "descendent-of";
            case ISNOTA: return "is-not-a";
            case REGEX: return "regex";
            case IN: return "in";
            case NOTIN: return "not-in";
            case GENERALIZES: return "generalizes";
            case CHILDOF: return "child-of";
            case DESCENDENTLEAF: return "descendent-leaf";
            case EXISTS: return "exists";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case EQUAL: return "http://hl7.org/fhir/filter-operator";
            case ISA: return "http://hl7.org/fhir/filter-operator";
            case DESCENDENTOF: return "http://hl7.org/fhir/filter-operator";
            case ISNOTA: return "http://hl7.org/fhir/filter-operator";
            case REGEX: return "http://hl7.org/fhir/filter-operator";
            case IN: return "http://hl7.org/fhir/filter-operator";
            case NOTIN: return "http://hl7.org/fhir/filter-operator";
            case GENERALIZES: return "http://hl7.org/fhir/filter-operator";
            case CHILDOF: return "http://hl7.org/fhir/filter-operator";
            case DESCENDENTLEAF: return "http://hl7.org/fhir/filter-operator";
            case EXISTS: return "http://hl7.org/fhir/filter-operator";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case EQUAL: return "The specified property of the code equals the provided value.";
            case ISA: return "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (include descendant codes and self).";
            case DESCENDENTOF: return "Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself (i.e. include descendant codes only).";
            case ISNOTA: return "The specified property of the code does not have an is-a relationship with the provided value.";
            case REGEX: return "The specified property of the code  matches the regex specified in the provided value.";
            case IN: return "The specified property of the code is in the set of codes or concepts specified in the provided value (comma-separated list).";
            case NOTIN: return "The specified property of the code is not in the set of codes or concepts specified in the provided value (comma-separated list).";
            case GENERALIZES: return "Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (i.e. include ancestor codes and self).";
            case CHILDOF: return "Only concepts with a direct hierarchical relationship to the index code and no other concepts. This does not include the index code in the output.";
            case DESCENDENTLEAF: return "Includes concept ids that have a transitive is-a relationship with the concept Id provided as the value, but which do not have any concept ids with transitive is-a relationships with themselves.";
            case EXISTS: return "The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values).";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case EQUAL: return "Equals";
            case ISA: return "Is A (by subsumption)";
            case DESCENDENTOF: return "Descendent Of (by subsumption)";
            case ISNOTA: return "Not (Is A) (by subsumption)";
            case REGEX: return "Regular Expression";
            case IN: return "In Set";
            case NOTIN: return "Not in Set";
            case GENERALIZES: return "Generalizes (by Subsumption)";
            case CHILDOF: return "Child Of";
            case DESCENDENTLEAF: return "Descendent Leaf";
            case EXISTS: return "Exists";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class FilterOperatorEnumFactory implements EnumFactory<FilterOperator> {
    public FilterOperator fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("=".equals(codeString))
          return FilterOperator.EQUAL;
        if ("is-a".equals(codeString))
          return FilterOperator.ISA;
        if ("descendent-of".equals(codeString))
          return FilterOperator.DESCENDENTOF;
        if ("is-not-a".equals(codeString))
          return FilterOperator.ISNOTA;
        if ("regex".equals(codeString))
          return FilterOperator.REGEX;
        if ("in".equals(codeString))
          return FilterOperator.IN;
        if ("not-in".equals(codeString))
          return FilterOperator.NOTIN;
        if ("generalizes".equals(codeString))
          return FilterOperator.GENERALIZES;
        if ("child-of".equals(codeString))
          return FilterOperator.CHILDOF;
        if ("descendent-leaf".equals(codeString))
          return FilterOperator.DESCENDENTLEAF;
        if ("exists".equals(codeString))
          return FilterOperator.EXISTS;
        throw new IllegalArgumentException("Unknown FilterOperator code '"+codeString+"'");
        }

        public Enumeration<FilterOperator> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<FilterOperator>(this, FilterOperator.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<FilterOperator>(this, FilterOperator.NULL, code);
        if ("=".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.EQUAL, code);
        if ("is-a".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.ISA, code);
        if ("descendent-of".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.DESCENDENTOF, code);
        if ("is-not-a".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.ISNOTA, code);
        if ("regex".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.REGEX, code);
        if ("in".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.IN, code);
        if ("not-in".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.NOTIN, code);
        if ("generalizes".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.GENERALIZES, code);
        if ("child-of".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.CHILDOF, code);
        if ("descendent-leaf".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.DESCENDENTLEAF, code);
        if ("exists".equals(codeString))
          return new Enumeration<FilterOperator>(this, FilterOperator.EXISTS, code);
        throw new FHIRException("Unknown FilterOperator code '"+codeString+"'");
        }
    public String toCode(FilterOperator code) {
      if (code == FilterOperator.EQUAL)
        return "=";
      if (code == FilterOperator.ISA)
        return "is-a";
      if (code == FilterOperator.DESCENDENTOF)
        return "descendent-of";
      if (code == FilterOperator.ISNOTA)
        return "is-not-a";
      if (code == FilterOperator.REGEX)
        return "regex";
      if (code == FilterOperator.IN)
        return "in";
      if (code == FilterOperator.NOTIN)
        return "not-in";
      if (code == FilterOperator.GENERALIZES)
        return "generalizes";
      if (code == FilterOperator.CHILDOF)
        return "child-of";
      if (code == FilterOperator.DESCENDENTLEAF)
        return "descendent-leaf";
      if (code == FilterOperator.EXISTS)
        return "exists";
      return "?";
      }
    public String toSystem(FilterOperator code) {
      return code.getSystem();
      }
    }

    public enum FinancialResourceStatusCodes {
        /**
         * The instance is currently in-force.
         */
        ACTIVE, 
        /**
         * The instance is withdrawn, rescinded or reversed.
         */
        CANCELLED, 
        /**
         * A new instance the contents of which is not complete.
         */
        DRAFT, 
        /**
         * The instance was entered in error.
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers
         */
        NULL;
        public static FinancialResourceStatusCodes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        throw new FHIRException("Unknown FinancialResourceStatusCodes code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "active", "cancelled", "draft", "entered-in-error");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case CANCELLED: return "cancelled";
            case DRAFT: return "draft";
            case ENTEREDINERROR: return "entered-in-error";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACTIVE: return "http://hl7.org/fhir/fm-status";
            case CANCELLED: return "http://hl7.org/fhir/fm-status";
            case DRAFT: return "http://hl7.org/fhir/fm-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/fm-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "The instance is currently in-force.";
            case CANCELLED: return "The instance is withdrawn, rescinded or reversed.";
            case DRAFT: return "A new instance the contents of which is not complete.";
            case ENTEREDINERROR: return "The instance was entered in error.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case CANCELLED: return "Cancelled";
            case DRAFT: return "Draft";
            case ENTEREDINERROR: return "Entered in Error";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class FinancialResourceStatusCodesEnumFactory implements EnumFactory<FinancialResourceStatusCodes> {
    public FinancialResourceStatusCodes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return FinancialResourceStatusCodes.ACTIVE;
        if ("cancelled".equals(codeString))
          return FinancialResourceStatusCodes.CANCELLED;
        if ("draft".equals(codeString))
          return FinancialResourceStatusCodes.DRAFT;
        if ("entered-in-error".equals(codeString))
          return FinancialResourceStatusCodes.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown FinancialResourceStatusCodes code '"+codeString+"'");
        }

        public Enumeration<FinancialResourceStatusCodes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<FinancialResourceStatusCodes>(this, FinancialResourceStatusCodes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<FinancialResourceStatusCodes>(this, FinancialResourceStatusCodes.NULL, code);
        if ("active".equals(codeString))
          return new Enumeration<FinancialResourceStatusCodes>(this, FinancialResourceStatusCodes.ACTIVE, code);
        if ("cancelled".equals(codeString))
          return new Enumeration<FinancialResourceStatusCodes>(this, FinancialResourceStatusCodes.CANCELLED, code);
        if ("draft".equals(codeString))
          return new Enumeration<FinancialResourceStatusCodes>(this, FinancialResourceStatusCodes.DRAFT, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<FinancialResourceStatusCodes>(this, FinancialResourceStatusCodes.ENTEREDINERROR, code);
        throw new FHIRException("Unknown FinancialResourceStatusCodes code '"+codeString+"'");
        }
    public String toCode(FinancialResourceStatusCodes code) {
      if (code == FinancialResourceStatusCodes.ACTIVE)
        return "active";
      if (code == FinancialResourceStatusCodes.CANCELLED)
        return "cancelled";
      if (code == FinancialResourceStatusCodes.DRAFT)
        return "draft";
      if (code == FinancialResourceStatusCodes.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    public String toSystem(FinancialResourceStatusCodes code) {
      return code.getSystem();
      }
    }

    public enum ListMode {
        /**
         * This list is the master list, maintained in an ongoing fashion with regular updates as the real-world list it is tracking changes.
         */
        WORKING, 
        /**
         * This list was prepared as a snapshot. It should not be assumed to be current.
         */
        SNAPSHOT, 
        /**
         * A point-in-time list that shows what changes have been made or recommended.  E.g. a discharge medication list showing what was added and removed during an encounter.
         */
        CHANGES, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ListMode fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("working".equals(codeString))
          return WORKING;
        if ("snapshot".equals(codeString))
          return SNAPSHOT;
        if ("changes".equals(codeString))
          return CHANGES;
        throw new FHIRException("Unknown ListMode code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "working", "snapshot", "changes");
        }
        public String toCode() {
          switch (this) {
            case WORKING: return "working";
            case SNAPSHOT: return "snapshot";
            case CHANGES: return "changes";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case WORKING: return "http://hl7.org/fhir/list-mode";
            case SNAPSHOT: return "http://hl7.org/fhir/list-mode";
            case CHANGES: return "http://hl7.org/fhir/list-mode";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case WORKING: return "This list is the master list, maintained in an ongoing fashion with regular updates as the real-world list it is tracking changes.";
            case SNAPSHOT: return "This list was prepared as a snapshot. It should not be assumed to be current.";
            case CHANGES: return "A point-in-time list that shows what changes have been made or recommended.  E.g. a discharge medication list showing what was added and removed during an encounter.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case WORKING: return "Working List";
            case SNAPSHOT: return "Snapshot List";
            case CHANGES: return "Change List";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ListModeEnumFactory implements EnumFactory<ListMode> {
    public ListMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("working".equals(codeString))
          return ListMode.WORKING;
        if ("snapshot".equals(codeString))
          return ListMode.SNAPSHOT;
        if ("changes".equals(codeString))
          return ListMode.CHANGES;
        throw new IllegalArgumentException("Unknown ListMode code '"+codeString+"'");
        }

        public Enumeration<ListMode> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ListMode>(this, ListMode.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ListMode>(this, ListMode.NULL, code);
        if ("working".equals(codeString))
          return new Enumeration<ListMode>(this, ListMode.WORKING, code);
        if ("snapshot".equals(codeString))
          return new Enumeration<ListMode>(this, ListMode.SNAPSHOT, code);
        if ("changes".equals(codeString))
          return new Enumeration<ListMode>(this, ListMode.CHANGES, code);
        throw new FHIRException("Unknown ListMode code '"+codeString+"'");
        }
    public String toCode(ListMode code) {
      if (code == ListMode.WORKING)
        return "working";
      if (code == ListMode.SNAPSHOT)
        return "snapshot";
      if (code == ListMode.CHANGES)
        return "changes";
      return "?";
      }
    public String toSystem(ListMode code) {
      return code.getSystem();
      }
    }

    public enum MimeTypes {
        /**
         * added to help the parsers
         */
        NULL;
        public static MimeTypes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        throw new FHIRException("Unknown MimeTypes code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString);
        }
        public String toCode() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class MimeTypesEnumFactory implements EnumFactory<MimeTypes> {
    public MimeTypes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        throw new IllegalArgumentException("Unknown MimeTypes code '"+codeString+"'");
        }

        public Enumeration<MimeTypes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<MimeTypes>(this, MimeTypes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<MimeTypes>(this, MimeTypes.NULL, code);
        throw new FHIRException("Unknown MimeTypes code '"+codeString+"'");
        }
    public String toCode(MimeTypes code) {
      return "?";
      }
    public String toSystem(MimeTypes code) {
      return code.getSystem();
      }
    }

    public enum ObservationStatus {
        /**
         * The existence of the observation is registered, but there is no result yet available.
         */
        REGISTERED, 
        /**
         * The specimen being processed in the laboratory but no results are available yet.
         */
        SPECIMENINPROCESS, 
        /**
         * This is an initial or interim observation: data may be incomplete or unverified.
         */
        PRELIMINARY, 
        /**
         * The observation is complete and there are no further actions needed. Additional information such "released", "signed", etc. would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied. Also, this status applies for situations where there is a "not-asked" code for dataAbsentReason.
         */
        FINAL, 
        /**
         * Subsequent to being Final, the observation has been modified. This includes updates/new information and corrections.
         */
        AMENDED, 
        /**
         * The observation is unavailable because the measurement was not started or not completed (also sometimes called "aborted"). A data absent reason should be present providing clarity as to why there is no value on an Observation instance
         */
        CANCELLED, 
        /**
         * The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".).
         */
        ENTEREDINERROR, 
        /**
         * The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.
         */
        UNKNOWN, 
        /**
         * The observation cannot be obtained.
         */
        CANNOTBEOBTAINED, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ObservationStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("registered".equals(codeString))
          return REGISTERED;
        if ("specimen-in-process".equals(codeString))
          return SPECIMENINPROCESS;
        if ("preliminary".equals(codeString))
          return PRELIMINARY;
        if ("final".equals(codeString))
          return FINAL;
        if ("amended".equals(codeString))
          return AMENDED;
        if ("cancelled".equals(codeString))
          return CANCELLED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        if ("cannot-be-obtained".equals(codeString))
          return CANNOTBEOBTAINED;
        throw new FHIRException("Unknown ObservationStatus code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "registered", "specimen-in-process", "preliminary", "final", "amended", "cancelled", "entered-in-error", "unknown", "cannot-be-obtained");
        }
        public String toCode() {
          switch (this) {
            case REGISTERED: return "registered";
            case SPECIMENINPROCESS: return "specimen-in-process";
            case PRELIMINARY: return "preliminary";
            case FINAL: return "final";
            case AMENDED: return "amended";
            case CANCELLED: return "cancelled";
            case ENTEREDINERROR: return "entered-in-error";
            case UNKNOWN: return "unknown";
            case CANNOTBEOBTAINED: return "cannot-be-obtained";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case REGISTERED: return "http://hl7.org/fhir/observation-status";
            case SPECIMENINPROCESS: return "http://hl7.org/fhir/observation-status";
            case PRELIMINARY: return "http://hl7.org/fhir/observation-status";
            case FINAL: return "http://hl7.org/fhir/observation-status";
            case AMENDED: return "http://hl7.org/fhir/observation-status";
            case CANCELLED: return "http://hl7.org/fhir/observation-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/observation-status";
            case UNKNOWN: return "http://hl7.org/fhir/observation-status";
            case CANNOTBEOBTAINED: return "http://hl7.org/fhir/observation-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case REGISTERED: return "The existence of the observation is registered, but there is no result yet available.";
            case SPECIMENINPROCESS: return "The specimen being processed in the laboratory but no results are available yet.";
            case PRELIMINARY: return "This is an initial or interim observation: data may be incomplete or unverified.";
            case FINAL: return "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc. would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied. Also, this status applies for situations where there is a \"not-asked\" code for dataAbsentReason.";
            case AMENDED: return "Subsequent to being Final, the observation has been modified. This includes updates/new information and corrections.";
            case CANCELLED: return "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\"). A data absent reason should be present providing clarity as to why there is no value on an Observation instance";
            case ENTEREDINERROR: return "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).";
            case UNKNOWN: return "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.";
            case CANNOTBEOBTAINED: return "The observation cannot be obtained.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case REGISTERED: return "Registered";
            case SPECIMENINPROCESS: return "Specimen-in-Process";
            case PRELIMINARY: return "Preliminary";
            case FINAL: return "Final";
            case AMENDED: return "Amended";
            case CANCELLED: return "Cancelled";
            case ENTEREDINERROR: return "Entered in Error";
            case UNKNOWN: return "Unknown";
            case CANNOTBEOBTAINED: return "Cannot be obtained";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ObservationStatusEnumFactory implements EnumFactory<ObservationStatus> {
    public ObservationStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("registered".equals(codeString))
          return ObservationStatus.REGISTERED;
        if ("specimen-in-process".equals(codeString))
          return ObservationStatus.SPECIMENINPROCESS;
        if ("preliminary".equals(codeString))
          return ObservationStatus.PRELIMINARY;
        if ("final".equals(codeString))
          return ObservationStatus.FINAL;
        if ("amended".equals(codeString))
          return ObservationStatus.AMENDED;
        if ("cancelled".equals(codeString))
          return ObservationStatus.CANCELLED;
        if ("entered-in-error".equals(codeString))
          return ObservationStatus.ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return ObservationStatus.UNKNOWN;
        if ("cannot-be-obtained".equals(codeString))
          return ObservationStatus.CANNOTBEOBTAINED;
        throw new IllegalArgumentException("Unknown ObservationStatus code '"+codeString+"'");
        }

        public Enumeration<ObservationStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ObservationStatus>(this, ObservationStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ObservationStatus>(this, ObservationStatus.NULL, code);
        if ("registered".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.REGISTERED, code);
        if ("specimen-in-process".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.SPECIMENINPROCESS, code);
        if ("preliminary".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.PRELIMINARY, code);
        if ("final".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.FINAL, code);
        if ("amended".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.AMENDED, code);
        if ("cancelled".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.CANCELLED, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.ENTEREDINERROR, code);
        if ("unknown".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.UNKNOWN, code);
        if ("cannot-be-obtained".equals(codeString))
          return new Enumeration<ObservationStatus>(this, ObservationStatus.CANNOTBEOBTAINED, code);
        throw new FHIRException("Unknown ObservationStatus code '"+codeString+"'");
        }
    public String toCode(ObservationStatus code) {
      if (code == ObservationStatus.REGISTERED)
        return "registered";
      if (code == ObservationStatus.SPECIMENINPROCESS)
        return "specimen-in-process";
      if (code == ObservationStatus.PRELIMINARY)
        return "preliminary";
      if (code == ObservationStatus.FINAL)
        return "final";
      if (code == ObservationStatus.AMENDED)
        return "amended";
      if (code == ObservationStatus.CANCELLED)
        return "cancelled";
      if (code == ObservationStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == ObservationStatus.UNKNOWN)
        return "unknown";
      if (code == ObservationStatus.CANNOTBEOBTAINED)
        return "cannot-be-obtained";
      return "?";
      }
    public String toSystem(ObservationStatus code) {
      return code.getSystem();
      }
    }

    public enum OperationParameterUse {
        /**
         * This is an input parameter.
         */
        IN, 
        /**
         * This is an output parameter.
         */
        OUT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static OperationParameterUse fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in".equals(codeString))
          return IN;
        if ("out".equals(codeString))
          return OUT;
        throw new FHIRException("Unknown OperationParameterUse code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "in", "out");
        }
        public String toCode() {
          switch (this) {
            case IN: return "in";
            case OUT: return "out";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case IN: return "http://hl7.org/fhir/operation-parameter-use";
            case OUT: return "http://hl7.org/fhir/operation-parameter-use";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case IN: return "This is an input parameter.";
            case OUT: return "This is an output parameter.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case IN: return "In";
            case OUT: return "Out";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class OperationParameterUseEnumFactory implements EnumFactory<OperationParameterUse> {
    public OperationParameterUse fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in".equals(codeString))
          return OperationParameterUse.IN;
        if ("out".equals(codeString))
          return OperationParameterUse.OUT;
        throw new IllegalArgumentException("Unknown OperationParameterUse code '"+codeString+"'");
        }

        public Enumeration<OperationParameterUse> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<OperationParameterUse>(this, OperationParameterUse.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<OperationParameterUse>(this, OperationParameterUse.NULL, code);
        if ("in".equals(codeString))
          return new Enumeration<OperationParameterUse>(this, OperationParameterUse.IN, code);
        if ("out".equals(codeString))
          return new Enumeration<OperationParameterUse>(this, OperationParameterUse.OUT, code);
        throw new FHIRException("Unknown OperationParameterUse code '"+codeString+"'");
        }
    public String toCode(OperationParameterUse code) {
      if (code == OperationParameterUse.IN)
        return "in";
      if (code == OperationParameterUse.OUT)
        return "out";
      return "?";
      }
    public String toSystem(OperationParameterUse code) {
      return code.getSystem();
      }
    }

    public enum PublicationStatus {
        /**
         * This resource is still under development and is not yet considered to be ready for normal use.
         */
        DRAFT, 
        /**
         * This resource is ready for normal use.
         */
        ACTIVE, 
        /**
         * This resource has been withdrawn or superseded and should no longer be used.
         */
        RETIRED, 
        /**
         * The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static PublicationStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("retired".equals(codeString))
          return RETIRED;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        throw new FHIRException("Unknown PublicationStatus code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "draft", "active", "retired", "unknown");
        }
        public String toCode() {
          switch (this) {
            case DRAFT: return "draft";
            case ACTIVE: return "active";
            case RETIRED: return "retired";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case DRAFT: return "http://hl7.org/fhir/publication-status";
            case ACTIVE: return "http://hl7.org/fhir/publication-status";
            case RETIRED: return "http://hl7.org/fhir/publication-status";
            case UNKNOWN: return "http://hl7.org/fhir/publication-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case DRAFT: return "This resource is still under development and is not yet considered to be ready for normal use.";
            case ACTIVE: return "This resource is ready for normal use.";
            case RETIRED: return "This resource has been withdrawn or superseded and should no longer be used.";
            case UNKNOWN: return "The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DRAFT: return "Draft";
            case ACTIVE: return "Active";
            case RETIRED: return "Retired";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class PublicationStatusEnumFactory implements EnumFactory<PublicationStatus> {
    public PublicationStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return PublicationStatus.DRAFT;
        if ("active".equals(codeString))
          return PublicationStatus.ACTIVE;
        if ("retired".equals(codeString))
          return PublicationStatus.RETIRED;
        if ("unknown".equals(codeString))
          return PublicationStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown PublicationStatus code '"+codeString+"'");
        }

        public Enumeration<PublicationStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<PublicationStatus>(this, PublicationStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<PublicationStatus>(this, PublicationStatus.NULL, code);
        if ("draft".equals(codeString))
          return new Enumeration<PublicationStatus>(this, PublicationStatus.DRAFT, code);
        if ("active".equals(codeString))
          return new Enumeration<PublicationStatus>(this, PublicationStatus.ACTIVE, code);
        if ("retired".equals(codeString))
          return new Enumeration<PublicationStatus>(this, PublicationStatus.RETIRED, code);
        if ("unknown".equals(codeString))
          return new Enumeration<PublicationStatus>(this, PublicationStatus.UNKNOWN, code);
        throw new FHIRException("Unknown PublicationStatus code '"+codeString+"'");
        }
    public String toCode(PublicationStatus code) {
      if (code == PublicationStatus.DRAFT)
        return "draft";
      if (code == PublicationStatus.ACTIVE)
        return "active";
      if (code == PublicationStatus.RETIRED)
        return "retired";
      if (code == PublicationStatus.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(PublicationStatus code) {
      return code.getSystem();
      }
    }

    public enum QuantityComparator {
        /**
         * The actual value is less than the given value.
         */
        LESS_THAN, 
        /**
         * The actual value is less than or equal to the given value.
         */
        LESS_OR_EQUAL, 
        /**
         * The actual value is greater than or equal to the given value.
         */
        GREATER_OR_EQUAL, 
        /**
         * The actual value is greater than the given value.
         */
        GREATER_THAN, 
        /**
         * The actual value is sufficient for the total quantity to equal the given value.
         */
        AD, 
        /**
         * added to help the parsers
         */
        NULL;
        public static QuantityComparator fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("<".equals(codeString))
          return LESS_THAN;
        if ("<=".equals(codeString))
          return LESS_OR_EQUAL;
        if (">=".equals(codeString))
          return GREATER_OR_EQUAL;
        if (">".equals(codeString))
          return GREATER_THAN;
        if ("ad".equals(codeString))
          return AD;
        throw new FHIRException("Unknown QuantityComparator code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "<", "<=", ">=", ">", "ad");
        }
        public String toCode() {
          switch (this) {
            case LESS_THAN: return "<";
            case LESS_OR_EQUAL: return "<=";
            case GREATER_OR_EQUAL: return ">=";
            case GREATER_THAN: return ">";
            case AD: return "ad";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case LESS_THAN: return "http://hl7.org/fhir/quantity-comparator";
            case LESS_OR_EQUAL: return "http://hl7.org/fhir/quantity-comparator";
            case GREATER_OR_EQUAL: return "http://hl7.org/fhir/quantity-comparator";
            case GREATER_THAN: return "http://hl7.org/fhir/quantity-comparator";
            case AD: return "http://hl7.org/fhir/quantity-comparator";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case LESS_THAN: return "The actual value is less than the given value.";
            case LESS_OR_EQUAL: return "The actual value is less than or equal to the given value.";
            case GREATER_OR_EQUAL: return "The actual value is greater than or equal to the given value.";
            case GREATER_THAN: return "The actual value is greater than the given value.";
            case AD: return "The actual value is sufficient for the total quantity to equal the given value.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case LESS_THAN: return "Less than";
            case LESS_OR_EQUAL: return "Less or Equal to";
            case GREATER_OR_EQUAL: return "Greater or Equal to";
            case GREATER_THAN: return "Greater than";
            case AD: return "Sufficient to achieve this total quantity";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class QuantityComparatorEnumFactory implements EnumFactory<QuantityComparator> {
    public QuantityComparator fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("<".equals(codeString))
          return QuantityComparator.LESS_THAN;
        if ("<=".equals(codeString))
          return QuantityComparator.LESS_OR_EQUAL;
        if (">=".equals(codeString))
          return QuantityComparator.GREATER_OR_EQUAL;
        if (">".equals(codeString))
          return QuantityComparator.GREATER_THAN;
        if ("ad".equals(codeString))
          return QuantityComparator.AD;
        throw new IllegalArgumentException("Unknown QuantityComparator code '"+codeString+"'");
        }

        public Enumeration<QuantityComparator> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<QuantityComparator>(this, QuantityComparator.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<QuantityComparator>(this, QuantityComparator.NULL, code);
        if ("<".equals(codeString))
          return new Enumeration<QuantityComparator>(this, QuantityComparator.LESS_THAN, code);
        if ("<=".equals(codeString))
          return new Enumeration<QuantityComparator>(this, QuantityComparator.LESS_OR_EQUAL, code);
        if (">=".equals(codeString))
          return new Enumeration<QuantityComparator>(this, QuantityComparator.GREATER_OR_EQUAL, code);
        if (">".equals(codeString))
          return new Enumeration<QuantityComparator>(this, QuantityComparator.GREATER_THAN, code);
        if ("ad".equals(codeString))
          return new Enumeration<QuantityComparator>(this, QuantityComparator.AD, code);
        throw new FHIRException("Unknown QuantityComparator code '"+codeString+"'");
        }
    public String toCode(QuantityComparator code) {
      if (code == QuantityComparator.LESS_THAN)
        return "<";
      if (code == QuantityComparator.LESS_OR_EQUAL)
        return "<=";
      if (code == QuantityComparator.GREATER_OR_EQUAL)
        return ">=";
      if (code == QuantityComparator.GREATER_THAN)
        return ">";
      if (code == QuantityComparator.AD)
        return "ad";
      return "?";
      }
    public String toSystem(QuantityComparator code) {
      return code.getSystem();
      }
    }

    public enum RequestIntent {
        /**
         * The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.
         */
        PROPOSAL, 
        /**
         * The request represents an intention to ensure something occurs without providing an authorization for others to act.
         */
        PLAN, 
        /**
         * The request represents an instruction authored by a Patient or RelatedPerson.
         */
        DIRECTIVE, 
        /**
         * The request represents a request/demand and authorization for action by the requestor.
         */
        ORDER, 
        /**
         * The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.
         */
        OPTION, 
        /**
         * added to help the parsers
         */
        NULL;
        public static RequestIntent fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposal".equals(codeString))
          return PROPOSAL;
        if ("plan".equals(codeString))
          return PLAN;
        if ("directive".equals(codeString))
          return DIRECTIVE;
        if ("order".equals(codeString))
          return ORDER;
        if ("option".equals(codeString))
          return OPTION;
        throw new FHIRException("Unknown RequestIntent code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "proposal", "plan", "directive", "order", "option");
        }
        public String toCode() {
          switch (this) {
            case PROPOSAL: return "proposal";
            case PLAN: return "plan";
            case DIRECTIVE: return "directive";
            case ORDER: return "order";
            case OPTION: return "option";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PROPOSAL: return "http://hl7.org/fhir/request-intent";
            case PLAN: return "http://hl7.org/fhir/request-intent";
            case DIRECTIVE: return "http://hl7.org/fhir/request-intent";
            case ORDER: return "http://hl7.org/fhir/request-intent";
            case OPTION: return "http://hl7.org/fhir/request-intent";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PROPOSAL: return "The request is a suggestion made by someone/something that does not have an intention to ensure it occurs and without providing an authorization to act.";
            case PLAN: return "The request represents an intention to ensure something occurs without providing an authorization for others to act.";
            case DIRECTIVE: return "The request represents an instruction authored by a Patient or RelatedPerson.";
            case ORDER: return "The request represents a request/demand and authorization for action by the requestor.";
            case OPTION: return "The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or other constraints among a set of requests.  Refer to [[[RequestOrchestration]]] for additional information on how this status is used.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PROPOSAL: return "Proposal";
            case PLAN: return "Plan";
            case DIRECTIVE: return "Directive";
            case ORDER: return "Order";
            case OPTION: return "Option";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class RequestIntentEnumFactory implements EnumFactory<RequestIntent> {
    public RequestIntent fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("proposal".equals(codeString))
          return RequestIntent.PROPOSAL;
        if ("plan".equals(codeString))
          return RequestIntent.PLAN;
        if ("directive".equals(codeString))
          return RequestIntent.DIRECTIVE;
        if ("order".equals(codeString))
          return RequestIntent.ORDER;
        if ("option".equals(codeString))
          return RequestIntent.OPTION;
        throw new IllegalArgumentException("Unknown RequestIntent code '"+codeString+"'");
        }

        public Enumeration<RequestIntent> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<RequestIntent>(this, RequestIntent.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<RequestIntent>(this, RequestIntent.NULL, code);
        if ("proposal".equals(codeString))
          return new Enumeration<RequestIntent>(this, RequestIntent.PROPOSAL, code);
        if ("plan".equals(codeString))
          return new Enumeration<RequestIntent>(this, RequestIntent.PLAN, code);
        if ("directive".equals(codeString))
          return new Enumeration<RequestIntent>(this, RequestIntent.DIRECTIVE, code);
        if ("order".equals(codeString))
          return new Enumeration<RequestIntent>(this, RequestIntent.ORDER, code);
        if ("option".equals(codeString))
          return new Enumeration<RequestIntent>(this, RequestIntent.OPTION, code);
        throw new FHIRException("Unknown RequestIntent code '"+codeString+"'");
        }
    public String toCode(RequestIntent code) {
      if (code == RequestIntent.PROPOSAL)
        return "proposal";
      if (code == RequestIntent.PLAN)
        return "plan";
      if (code == RequestIntent.DIRECTIVE)
        return "directive";
      if (code == RequestIntent.ORDER)
        return "order";
      if (code == RequestIntent.OPTION)
        return "option";
      return "?";
      }
    public String toSystem(RequestIntent code) {
      return code.getSystem();
      }
    }

    public enum RequestPriority {
        /**
         * The request has normal priority.
         */
        ROUTINE, 
        /**
         * The request should be actioned promptly - higher priority than routine.
         */
        URGENT, 
        /**
         * The request should be actioned as soon as possible - higher priority than urgent.
         */
        ASAP, 
        /**
         * The request should be actioned immediately - highest possible priority.  E.g. an emergency.
         */
        STAT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static RequestPriority fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
          return ROUTINE;
        if ("urgent".equals(codeString))
          return URGENT;
        if ("asap".equals(codeString))
          return ASAP;
        if ("stat".equals(codeString))
          return STAT;
        throw new FHIRException("Unknown RequestPriority code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "routine", "urgent", "asap", "stat");
        }
        public String toCode() {
          switch (this) {
            case ROUTINE: return "routine";
            case URGENT: return "urgent";
            case ASAP: return "asap";
            case STAT: return "stat";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ROUTINE: return "http://hl7.org/fhir/request-priority";
            case URGENT: return "http://hl7.org/fhir/request-priority";
            case ASAP: return "http://hl7.org/fhir/request-priority";
            case STAT: return "http://hl7.org/fhir/request-priority";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ROUTINE: return "The request has normal priority.";
            case URGENT: return "The request should be actioned promptly - higher priority than routine.";
            case ASAP: return "The request should be actioned as soon as possible - higher priority than urgent.";
            case STAT: return "The request should be actioned immediately - highest possible priority.  E.g. an emergency.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ROUTINE: return "Routine";
            case URGENT: return "Urgent";
            case ASAP: return "ASAP";
            case STAT: return "STAT";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class RequestPriorityEnumFactory implements EnumFactory<RequestPriority> {
    public RequestPriority fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
          return RequestPriority.ROUTINE;
        if ("urgent".equals(codeString))
          return RequestPriority.URGENT;
        if ("asap".equals(codeString))
          return RequestPriority.ASAP;
        if ("stat".equals(codeString))
          return RequestPriority.STAT;
        throw new IllegalArgumentException("Unknown RequestPriority code '"+codeString+"'");
        }

        public Enumeration<RequestPriority> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<RequestPriority>(this, RequestPriority.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<RequestPriority>(this, RequestPriority.NULL, code);
        if ("routine".equals(codeString))
          return new Enumeration<RequestPriority>(this, RequestPriority.ROUTINE, code);
        if ("urgent".equals(codeString))
          return new Enumeration<RequestPriority>(this, RequestPriority.URGENT, code);
        if ("asap".equals(codeString))
          return new Enumeration<RequestPriority>(this, RequestPriority.ASAP, code);
        if ("stat".equals(codeString))
          return new Enumeration<RequestPriority>(this, RequestPriority.STAT, code);
        throw new FHIRException("Unknown RequestPriority code '"+codeString+"'");
        }
    public String toCode(RequestPriority code) {
      if (code == RequestPriority.ROUTINE)
        return "routine";
      if (code == RequestPriority.URGENT)
        return "urgent";
      if (code == RequestPriority.ASAP)
        return "asap";
      if (code == RequestPriority.STAT)
        return "stat";
      return "?";
      }
    public String toSystem(RequestPriority code) {
      return code.getSystem();
      }
    }

    public enum RequestStatus {
        /**
         * The request has been created but is not yet complete or ready for action.
         */
        DRAFT, 
        /**
         * The request is in force and ready to be acted upon.
         */
        ACTIVE, 
        /**
         * The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.
         */
        ONHOLD, 
        /**
         * This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
         */
        ENTEREDINERROR, 
        /**
         * This request is no longer to be acted upon. This status does not differentiate what degree of action (if any) has already been undertaken against the request.
         */
        ENDED, 
        /**
         * The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
        NULL;
        public static RequestStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("on-hold".equals(codeString))
          return ONHOLD;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("ended".equals(codeString))
          return ENDED;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        throw new FHIRException("Unknown RequestStatus code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "draft", "active", "on-hold", "entered-in-error", "ended", "unknown");
        }
        public String toCode() {
          switch (this) {
            case DRAFT: return "draft";
            case ACTIVE: return "active";
            case ONHOLD: return "on-hold";
            case ENTEREDINERROR: return "entered-in-error";
            case ENDED: return "ended";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case DRAFT: return "http://hl7.org/fhir/request-status";
            case ACTIVE: return "http://hl7.org/fhir/request-status";
            case ONHOLD: return "http://hl7.org/fhir/request-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/request-status";
            case ENDED: return "http://hl7.org/fhir/request-status";
            case UNKNOWN: return "http://hl7.org/fhir/request-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case DRAFT: return "The request has been created but is not yet complete or ready for action.";
            case ACTIVE: return "The request is in force and ready to be acted upon.";
            case ONHOLD: return "The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the future.";
            case ENTEREDINERROR: return "This request should never have existed and should be considered 'void'.  (It is possible that real-world decisions were based on it.  If real-world activity has occurred, the status should be \"revoked\" rather than \"entered-in-error\".).";
            case ENDED: return "This request is no longer to be acted upon. This status does not differentiate what degree of action (if any) has already been undertaken against the request.";
            case UNKNOWN: return "The authoring/source system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DRAFT: return "Draft";
            case ACTIVE: return "Active";
            case ONHOLD: return "On Hold";
            case ENTEREDINERROR: return "Entered in Error";
            case ENDED: return "Ended";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class RequestStatusEnumFactory implements EnumFactory<RequestStatus> {
    public RequestStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("draft".equals(codeString))
          return RequestStatus.DRAFT;
        if ("active".equals(codeString))
          return RequestStatus.ACTIVE;
        if ("on-hold".equals(codeString))
          return RequestStatus.ONHOLD;
        if ("entered-in-error".equals(codeString))
          return RequestStatus.ENTEREDINERROR;
        if ("ended".equals(codeString))
          return RequestStatus.ENDED;
        if ("unknown".equals(codeString))
          return RequestStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown RequestStatus code '"+codeString+"'");
        }

        public Enumeration<RequestStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<RequestStatus>(this, RequestStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<RequestStatus>(this, RequestStatus.NULL, code);
        if ("draft".equals(codeString))
          return new Enumeration<RequestStatus>(this, RequestStatus.DRAFT, code);
        if ("active".equals(codeString))
          return new Enumeration<RequestStatus>(this, RequestStatus.ACTIVE, code);
        if ("on-hold".equals(codeString))
          return new Enumeration<RequestStatus>(this, RequestStatus.ONHOLD, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<RequestStatus>(this, RequestStatus.ENTEREDINERROR, code);
        if ("ended".equals(codeString))
          return new Enumeration<RequestStatus>(this, RequestStatus.ENDED, code);
        if ("unknown".equals(codeString))
          return new Enumeration<RequestStatus>(this, RequestStatus.UNKNOWN, code);
        throw new FHIRException("Unknown RequestStatus code '"+codeString+"'");
        }
    public String toCode(RequestStatus code) {
      if (code == RequestStatus.DRAFT)
        return "draft";
      if (code == RequestStatus.ACTIVE)
        return "active";
      if (code == RequestStatus.ONHOLD)
        return "on-hold";
      if (code == RequestStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == RequestStatus.ENDED)
        return "ended";
      if (code == RequestStatus.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(RequestStatus code) {
      return code.getSystem();
      }
    }

    public enum ResourceTypeEnum {
        /**
         * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
         */
        ACCOUNT, 
        /**
         * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
         */
        ACTIVITYDEFINITION, 
        /**
         * The ActorDefinition resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.
         */
        ACTORDEFINITION, 
        /**
         * A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).
         */
        ADMINISTRABLEPRODUCTDEFINITION, 
        /**
         * An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management.  Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers.  Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.
         */
        ADVERSEEVENT, 
        /**
         * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
         */
        ALLERGYINTOLERANCE, 
        /**
         * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
         */
        APPOINTMENT, 
        /**
         * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
         */
        APPOINTMENTRESPONSE, 
        /**
         * This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.
         */
        ARTIFACTASSESSMENT, 
        /**
         * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
         */
        AUDITEVENT, 
        /**
         * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
         */
        BASIC, 
        /**
         * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
         */
        BINARY, 
        /**
         * A biological material originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.
         */
        BIOLOGICALLYDERIVEDPRODUCT, 
        /**
         * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
         */
        BODYSTRUCTURE, 
        /**
         * A container for a collection of resources.
         */
        BUNDLE, 
        /**
         * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
         */
        CAPABILITYSTATEMENT, 
        /**
         * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
         */
        CAREPLAN, 
        /**
         * The Care Team includes all the people, organizations, and care teams who participate or plan to participate in the coordination and delivery of care.
         */
        CARETEAM, 
        /**
         * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
         */
        CLAIM, 
        /**
         * This resource provides the adjudication details from the processing of a Claim resource.
         */
        CLAIMRESPONSE, 
        /**
         * A single issue - either an indication, contraindication, interaction, undesirable effect or warning for a medicinal product, medication, device or procedure.
         */
        CLINICALUSEDEFINITION, 
        /**
         * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
         */
        CODESYSTEM, 
        /**
         * A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.
         */
        COMMUNICATION, 
        /**
         * A request to convey information from a sender to a recipient.
         */
        COMMUNICATIONREQUEST, 
        /**
         * A compartment definition that defines how resources are accessed on a server.
         */
        COMPARTMENTDEFINITION, 
        /**
         * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and has traceability to the author who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
         */
        COMPOSITION, 
        /**
         * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
         */
        CONCEPTMAP, 
        /**
         * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
         */
        CONDITION, 
        /**
         * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
         */
        CONSENT, 
        /**
         * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
         */
        CONTRACT, 
        /**
         * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
         */
        COVERAGE, 
        /**
         * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
         */
        COVERAGEELIGIBILITYREQUEST, 
        /**
         * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
         */
        COVERAGEELIGIBILITYRESPONSE, 
        /**
         * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.
         */
        DETECTEDISSUE, 
        /**
         * This resource describes the properties (regulated, has real time clock, etc.), administrative (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement, blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a given module, for example the serial number, manufacturer name, and model number). An actual unit may consist of several modules in a distinct hierarchy and these are represented by multiple Device resources and bound through the 'parent' element.
         */
        DEVICE, 
        /**
         * Describes a physiological or technical alert condition report originated by a device.  The DeviceAlert resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable. 
         */
        DEVICEALERT, 
        /**
         * A record of association of a device.
         */
        DEVICEASSOCIATION, 
        /**
         * This is a specialized resource that defines the characteristics and capabilities of a device.
         */
        DEVICEDEFINITION, 
        /**
         * Describes a measurement, calculation or setting capability of a device. The DeviceMetric resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable.
         */
        DEVICEMETRIC, 
        /**
         * Represents a request a device to be provided to a specific patient. The device may be an implantable device to be subsequently implanted, or an external assistive device, such as a walker, to be delivered and subsequently be used.
         */
        DEVICEREQUEST, 
        /**
         * The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.
         */
        DIAGNOSTICREPORT, 
        /**
         * A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this “document” encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
         */
        DOCUMENTREFERENCE, 
        /**
         * An interaction between healthcare provider(s), and/or patient(s) for the purpose of providing healthcare service(s) or assessing the health status of patient(s).
         */
        ENCOUNTER, 
        /**
         * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.
         */
        ENDPOINT, 
        /**
         * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
         */
        ENROLLMENTREQUEST, 
        /**
         * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
         */
        ENROLLMENTRESPONSE, 
        /**
         * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
         */
        EPISODEOFCARE, 
        /**
         * The EventDefinition resource provides a reusable description of when a particular event can occur.
         */
        EVENTDEFINITION, 
        /**
         * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
         */
        EVIDENCE, 
        /**
         * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
         */
        EVIDENCEVARIABLE, 
        /**
         * A walkthrough of a workflow showing the interaction between systems and the instances shared, possibly including the evolution of instances over time.
         */
        EXAMPLESCENARIO, 
        /**
         * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
         */
        EXPLANATIONOFBENEFIT, 
        /**
         * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
         */
        FAMILYMEMBERHISTORY, 
        /**
         * Prospective warnings of potential issues when providing care to the patient.
         */
        FLAG, 
        /**
         * Describes the intended objective(s) for a patient, group, or organizational care.  Examples include a patient's weight loss, restoration of an activity of daily living for a patient, obtaining herd immunity via immunization for a group, meeting a process improvement objective for an organization, etc.
         */
        GOAL, 
        /**
         * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not typically expected to act collectively*. These collections are also not typically formally or legally recognized.\r\n\r\n*NOTE: Group may be used to define families or households, which in some circumstances may act collectively or have a degree of legal or formal recognition. This should be considered an exception. When Group is used for types of entities other than Patient or RelatedPerson, the expectation remains that the Group will not act collectively or have formal recognition - use Organization if these behaviors are needed. See more discussion [below](group.html#group-usage)
         */
        GROUP, 
        /**
         * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
         */
        GUIDANCERESPONSE, 
        /**
         * The details of a healthcare service available at a location or in a catalog.  In the case where there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be represented using a set of linked HealthcareServices.
         */
        HEALTHCARESERVICE, 
        /**
         * A selection of DICOM SOP instances within a single Study and Series. This might include additional specifics such as a set of frames or an image region, allowing linkage to an Observation Resource.
         */
        IMAGINGSELECTION, 
        /**
         * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of images or other data objects (called Service-Object Pair Instances or SOP Instances) acquired or produced in a common context.
         */
        IMAGINGSTUDY, 
        /**
         * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
         */
        IMMUNIZATION, 
        /**
         * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
         */
        IMPLEMENTATIONGUIDE, 
        /**
         * An ingredient of a manufactured item or pharmaceutical product.
         */
        INGREDIENT, 
        /**
         * Details of a Health Insurance plan provided by an organization under an InsuranceProduct.
         */
        INSURANCEPLAN, 
        /**
         * Details of a Health Insurance product provided by an organization.
         */
        INSURANCEPRODUCT, 
        /**
         * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
         */
        INVOICE, 
        /**
         * The Library resource is a general-purpose container for knowledge artifact definitions. It can be used to describe and expose existing knowledge artifacts such as logic libraries and information model descriptions, as well as to describe a collection of knowledge artifacts.
         */
        LIBRARY, 
        /**
         * A List is a curated collection of resources, for things such as problem lists, allergy lists, facility list, organization list, etc.
         */
        LIST, 
        /**
         * Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.
         */
        LOCATION, 
        /**
         * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
         */
        MANUFACTUREDITEMDEFINITION, 
        /**
         * The Measure resource provides the definition of a quality measure.
         */
        MEASURE, 
        /**
         * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
         */
        MEASUREREPORT, 
        /**
         * This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
         */
        MEDICATION, 
        /**
         * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner. This event can also be used to record waste using a status of not-done and the appropriate statusReason.
         */
        MEDICATIONADMINISTRATION, 
        /**
         * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
         */
        MEDICATIONDISPENSE, 
        /**
         * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
         */
        MEDICATIONREQUEST, 
        /**
         * A record of a medication consumed by a patient.  A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future. The source of this information can be the patient, patient representative (e.g., spouse, significant other, family member, caregiver), or a clinician. A common scenario where this information is captured is during the history taking process during a patient encounter or stay. The medication information may come from sources such as the patient's memory, from a prescription bottle, or from a list of medications the patient, clinician or other party maintains. The primary difference between a MedicationStatement and a MedicationAdministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication. A MedicationStatement is often, if not always, less specific. There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise. As stated earlier, the MedicationStatement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party. MedicationAdministration is more formal and is not missing detailed information.
         */
        MEDICATIONSTATEMENT, 
        /**
         * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).
         */
        MEDICINALPRODUCTDEFINITION, 
        /**
         * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
         */
        MESSAGEDEFINITION, 
        /**
         * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
         */
        MESSAGEHEADER, 
        /**
         * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
         */
        NAMINGSYSTEM, 
        /**
         * A record of intake by a patient.  A NutritionIntake may indicate that the patient may be consuming the food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula now or has consumed it in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label, or from a clinician documenting observed intake.
         */
        NUTRITIONINTAKE, 
        /**
         * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to an individual or group.
         */
        NUTRITIONORDER, 
        /**
         * A food or supplement that is consumed by patients.
         */
        NUTRITIONPRODUCT, 
        /**
         * Measurements and simple assertions made about a patient, device or other subject.
         */
        OBSERVATION, 
        /**
         * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
         */
        OBSERVATIONDEFINITION, 
        /**
         * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
         */
        OPERATIONDEFINITION, 
        /**
         * A collection of error, warning, or information messages that result from a system action.
         */
        OPERATIONOUTCOME, 
        /**
         * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.
         */
        ORGANIZATION, 
        /**
         * Defines an affiliation/assotiation/relationship between 2 distinct organizations, that is not a part-of relationship/sub-division relationship.
         */
        ORGANIZATIONAFFILIATION, 
        /**
         * A medically related item or items, in a container or package.
         */
        PACKAGEDPRODUCTDEFINITION, 
        /**
         * This resource is used to pass information into and back from an operation (whether invoked directly from REST or within a messaging environment).  It is not persisted or allowed to be referenced by other resources except as described in the definition of the Parameters resource.
         */
        PARAMETERS, 
        /**
         * Demographics and other administrative information about an individual or animal that is the subject of potential, past, current, or future health-related care, services, or processes.
         */
        PATIENT, 
        /**
         * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
         */
        PAYMENTNOTICE, 
        /**
         * This resource provides the details including amount of a payment and allocates the payment items being paid.
         */
        PAYMENTRECONCILIATION, 
        /**
         * Demographics and administrative information about a person independent of a specific health-related context.
         */
        PERSON, 
        /**
         * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, drug quality specifications, and drug manufacturing process.
         */
        PLANDEFINITION, 
        /**
         * A person who is directly or indirectly involved in the provisioning of healthcare or related services.
         */
        PRACTITIONER, 
        /**
         * A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has performed at an organization during a period of time.
         */
        PRACTITIONERROLE, 
        /**
         * An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.
         */
        PROCEDURE, 
        /**
         * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which MAY impact security, privacy, and trust policies.
         */
        PROVENANCE, 
        /**
         * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
         */
        QUESTIONNAIRE, 
        /**
         * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
         */
        QUESTIONNAIRERESPONSE, 
        /**
         * Regulatory approval, clearance or licensing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.
         */
        REGULATEDAUTHORIZATION, 
        /**
         * Information about a person that is involved in a patient's health or the care for a patient, but who is not the primary target of healthcare.
         */
        RELATEDPERSON, 
        /**
         * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
         */
        REQUESTORCHESTRATION, 
        /**
         * The Requirements resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.
         */
        REQUIREMENTS, 
        /**
         * A scientific study intended to increase health-related knowledge. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.
         */
        RESEARCHSTUDY, 
        /**
         * A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.
         */
        RESEARCHSUBJECT, 
        /**
         * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
         */
        RISKASSESSMENT, 
        /**
         * A container for slots of time that may be available for booking appointments.
         */
        SCHEDULE, 
        /**
         * A search parameter that defines a named search item that can be used to search/filter on a resource.
         */
        SEARCHPARAMETER, 
        /**
         * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
         */
        SERVICEREQUEST, 
        /**
         * A slot of time on a schedule that may be available for booking appointments.
         */
        SLOT, 
        /**
         * A sample to be used for analysis.
         */
        SPECIMEN, 
        /**
         * A kind of specimen with associated set of requirements.
         */
        SPECIMENDEFINITION, 
        /**
         * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
         */
        STRUCTUREDEFINITION, 
        /**
         * A Map of relationships between 2 structures that can be used to transform data.
         */
        STRUCTUREMAP, 
        /**
         * The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
         */
        SUBSCRIPTION, 
        /**
         * The SubscriptionStatus resource describes the state of a Subscription during notifications. It is not persisted.
         */
        SUBSCRIPTIONSTATUS, 
        /**
         * Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.
         */
        SUBSCRIPTIONTOPIC, 
        /**
         * A homogeneous material with a definite composition.
         */
        SUBSTANCE, 
        /**
         * The detailed description of a substance, typically at a level beyond what is used for prescribing.
         */
        SUBSTANCEDEFINITION, 
        /**
         * A task to be performed as a part of a workflow and the related information like inputs, outputs and execution progress.
         */
        TASK, 
        /**
         * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
         */
        TERMINOLOGYCAPABILITIES, 
        /**
         * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
         */
        VALUESET, 
        /**
         * An authorization for the provision of glasses and/or contact lenses to a patient.
         */
        VISIONPRESCRIPTION, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ResourceTypeEnum fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Account".equals(codeString))
          return ACCOUNT;
        if ("ActivityDefinition".equals(codeString))
          return ACTIVITYDEFINITION;
        if ("ActorDefinition".equals(codeString))
          return ACTORDEFINITION;
        if ("AdministrableProductDefinition".equals(codeString))
          return ADMINISTRABLEPRODUCTDEFINITION;
        if ("AdverseEvent".equals(codeString))
          return ADVERSEEVENT;
        if ("AllergyIntolerance".equals(codeString))
          return ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
          return APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
          return APPOINTMENTRESPONSE;
        if ("ArtifactAssessment".equals(codeString))
          return ARTIFACTASSESSMENT;
        if ("AuditEvent".equals(codeString))
          return AUDITEVENT;
        if ("Basic".equals(codeString))
          return BASIC;
        if ("Binary".equals(codeString))
          return BINARY;
        if ("BiologicallyDerivedProduct".equals(codeString))
          return BIOLOGICALLYDERIVEDPRODUCT;
        if ("BodyStructure".equals(codeString))
          return BODYSTRUCTURE;
        if ("Bundle".equals(codeString))
          return BUNDLE;
        if ("CapabilityStatement".equals(codeString))
          return CAPABILITYSTATEMENT;
        if ("CarePlan".equals(codeString))
          return CAREPLAN;
        if ("CareTeam".equals(codeString))
          return CARETEAM;
        if ("Claim".equals(codeString))
          return CLAIM;
        if ("ClaimResponse".equals(codeString))
          return CLAIMRESPONSE;
        if ("ClinicalUseDefinition".equals(codeString))
          return CLINICALUSEDEFINITION;
        if ("CodeSystem".equals(codeString))
          return CODESYSTEM;
        if ("Communication".equals(codeString))
          return COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
          return COMMUNICATIONREQUEST;
        if ("CompartmentDefinition".equals(codeString))
          return COMPARTMENTDEFINITION;
        if ("Composition".equals(codeString))
          return COMPOSITION;
        if ("ConceptMap".equals(codeString))
          return CONCEPTMAP;
        if ("Condition".equals(codeString))
          return CONDITION;
        if ("Consent".equals(codeString))
          return CONSENT;
        if ("Contract".equals(codeString))
          return CONTRACT;
        if ("Coverage".equals(codeString))
          return COVERAGE;
        if ("CoverageEligibilityRequest".equals(codeString))
          return COVERAGEELIGIBILITYREQUEST;
        if ("CoverageEligibilityResponse".equals(codeString))
          return COVERAGEELIGIBILITYRESPONSE;
        if ("DetectedIssue".equals(codeString))
          return DETECTEDISSUE;
        if ("Device".equals(codeString))
          return DEVICE;
        if ("DeviceAlert".equals(codeString))
          return DEVICEALERT;
        if ("DeviceAssociation".equals(codeString))
          return DEVICEASSOCIATION;
        if ("DeviceDefinition".equals(codeString))
          return DEVICEDEFINITION;
        if ("DeviceMetric".equals(codeString))
          return DEVICEMETRIC;
        if ("DeviceRequest".equals(codeString))
          return DEVICEREQUEST;
        if ("DiagnosticReport".equals(codeString))
          return DIAGNOSTICREPORT;
        if ("DocumentReference".equals(codeString))
          return DOCUMENTREFERENCE;
        if ("Encounter".equals(codeString))
          return ENCOUNTER;
        if ("Endpoint".equals(codeString))
          return ENDPOINT;
        if ("EnrollmentRequest".equals(codeString))
          return ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
          return ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
          return EPISODEOFCARE;
        if ("EventDefinition".equals(codeString))
          return EVENTDEFINITION;
        if ("Evidence".equals(codeString))
          return EVIDENCE;
        if ("EvidenceVariable".equals(codeString))
          return EVIDENCEVARIABLE;
        if ("ExampleScenario".equals(codeString))
          return EXAMPLESCENARIO;
        if ("ExplanationOfBenefit".equals(codeString))
          return EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
          return FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
          return FLAG;
        if ("Goal".equals(codeString))
          return GOAL;
        if ("Group".equals(codeString))
          return GROUP;
        if ("GuidanceResponse".equals(codeString))
          return GUIDANCERESPONSE;
        if ("HealthcareService".equals(codeString))
          return HEALTHCARESERVICE;
        if ("ImagingSelection".equals(codeString))
          return IMAGINGSELECTION;
        if ("ImagingStudy".equals(codeString))
          return IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
          return IMMUNIZATION;
        if ("ImplementationGuide".equals(codeString))
          return IMPLEMENTATIONGUIDE;
        if ("Ingredient".equals(codeString))
          return INGREDIENT;
        if ("InsurancePlan".equals(codeString))
          return INSURANCEPLAN;
        if ("InsuranceProduct".equals(codeString))
          return INSURANCEPRODUCT;
        if ("Invoice".equals(codeString))
          return INVOICE;
        if ("Library".equals(codeString))
          return LIBRARY;
        if ("List".equals(codeString))
          return LIST;
        if ("Location".equals(codeString))
          return LOCATION;
        if ("ManufacturedItemDefinition".equals(codeString))
          return MANUFACTUREDITEMDEFINITION;
        if ("Measure".equals(codeString))
          return MEASURE;
        if ("MeasureReport".equals(codeString))
          return MEASUREREPORT;
        if ("Medication".equals(codeString))
          return MEDICATION;
        if ("MedicationAdministration".equals(codeString))
          return MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
          return MEDICATIONDISPENSE;
        if ("MedicationRequest".equals(codeString))
          return MEDICATIONREQUEST;
        if ("MedicationStatement".equals(codeString))
          return MEDICATIONSTATEMENT;
        if ("MedicinalProductDefinition".equals(codeString))
          return MEDICINALPRODUCTDEFINITION;
        if ("MessageDefinition".equals(codeString))
          return MESSAGEDEFINITION;
        if ("MessageHeader".equals(codeString))
          return MESSAGEHEADER;
        if ("NamingSystem".equals(codeString))
          return NAMINGSYSTEM;
        if ("NutritionIntake".equals(codeString))
          return NUTRITIONINTAKE;
        if ("NutritionOrder".equals(codeString))
          return NUTRITIONORDER;
        if ("NutritionProduct".equals(codeString))
          return NUTRITIONPRODUCT;
        if ("Observation".equals(codeString))
          return OBSERVATION;
        if ("ObservationDefinition".equals(codeString))
          return OBSERVATIONDEFINITION;
        if ("OperationDefinition".equals(codeString))
          return OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
          return OPERATIONOUTCOME;
        if ("Organization".equals(codeString))
          return ORGANIZATION;
        if ("OrganizationAffiliation".equals(codeString))
          return ORGANIZATIONAFFILIATION;
        if ("PackagedProductDefinition".equals(codeString))
          return PACKAGEDPRODUCTDEFINITION;
        if ("Parameters".equals(codeString))
          return PARAMETERS;
        if ("Patient".equals(codeString))
          return PATIENT;
        if ("PaymentNotice".equals(codeString))
          return PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
          return PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
          return PERSON;
        if ("PlanDefinition".equals(codeString))
          return PLANDEFINITION;
        if ("Practitioner".equals(codeString))
          return PRACTITIONER;
        if ("PractitionerRole".equals(codeString))
          return PRACTITIONERROLE;
        if ("Procedure".equals(codeString))
          return PROCEDURE;
        if ("Provenance".equals(codeString))
          return PROVENANCE;
        if ("Questionnaire".equals(codeString))
          return QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
          return QUESTIONNAIRERESPONSE;
        if ("RegulatedAuthorization".equals(codeString))
          return REGULATEDAUTHORIZATION;
        if ("RelatedPerson".equals(codeString))
          return RELATEDPERSON;
        if ("RequestOrchestration".equals(codeString))
          return REQUESTORCHESTRATION;
        if ("Requirements".equals(codeString))
          return REQUIREMENTS;
        if ("ResearchStudy".equals(codeString))
          return RESEARCHSTUDY;
        if ("ResearchSubject".equals(codeString))
          return RESEARCHSUBJECT;
        if ("RiskAssessment".equals(codeString))
          return RISKASSESSMENT;
        if ("Schedule".equals(codeString))
          return SCHEDULE;
        if ("SearchParameter".equals(codeString))
          return SEARCHPARAMETER;
        if ("ServiceRequest".equals(codeString))
          return SERVICEREQUEST;
        if ("Slot".equals(codeString))
          return SLOT;
        if ("Specimen".equals(codeString))
          return SPECIMEN;
        if ("SpecimenDefinition".equals(codeString))
          return SPECIMENDEFINITION;
        if ("StructureDefinition".equals(codeString))
          return STRUCTUREDEFINITION;
        if ("StructureMap".equals(codeString))
          return STRUCTUREMAP;
        if ("Subscription".equals(codeString))
          return SUBSCRIPTION;
        if ("SubscriptionStatus".equals(codeString))
          return SUBSCRIPTIONSTATUS;
        if ("SubscriptionTopic".equals(codeString))
          return SUBSCRIPTIONTOPIC;
        if ("Substance".equals(codeString))
          return SUBSTANCE;
        if ("SubstanceDefinition".equals(codeString))
          return SUBSTANCEDEFINITION;
        if ("Task".equals(codeString))
          return TASK;
        if ("TerminologyCapabilities".equals(codeString))
          return TERMINOLOGYCAPABILITIES;
        if ("ValueSet".equals(codeString))
          return VALUESET;
        if ("VisionPrescription".equals(codeString))
          return VISIONPRESCRIPTION;
        throw new FHIRException("Unknown ResourceTypeEnum code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "Account", "ActivityDefinition", "ActorDefinition", "AdministrableProductDefinition", "AdverseEvent", "AllergyIntolerance", "Appointment", "AppointmentResponse", "ArtifactAssessment", "AuditEvent", "Basic", "Binary", "BiologicallyDerivedProduct", "BodyStructure", "Bundle", "CapabilityStatement", "CarePlan", "CareTeam", "Claim", "ClaimResponse", "ClinicalUseDefinition", "CodeSystem", "Communication", "CommunicationRequest", "CompartmentDefinition", "Composition", "ConceptMap", "Condition", "Consent", "Contract", "Coverage", "CoverageEligibilityRequest", "CoverageEligibilityResponse", "DetectedIssue", "Device", "DeviceAlert", "DeviceAssociation", "DeviceDefinition", "DeviceMetric", "DeviceRequest", "DiagnosticReport", "DocumentReference", "Encounter", "Endpoint", "EnrollmentRequest", "EnrollmentResponse", "EpisodeOfCare", "EventDefinition", "Evidence", "EvidenceVariable", "ExampleScenario", "ExplanationOfBenefit", "FamilyMemberHistory", "Flag", "Goal", "Group", "GuidanceResponse", "HealthcareService", "ImagingSelection", "ImagingStudy", "Immunization", "ImplementationGuide", "Ingredient", "InsurancePlan", "InsuranceProduct", "Invoice", "Library", "List", "Location", "ManufacturedItemDefinition", "Measure", "MeasureReport", "Medication", "MedicationAdministration", "MedicationDispense", "MedicationRequest", "MedicationStatement", "MedicinalProductDefinition", "MessageDefinition", "MessageHeader", "NamingSystem", "NutritionIntake", "NutritionOrder", "NutritionProduct", "Observation", "ObservationDefinition", "OperationDefinition", "OperationOutcome", "Organization", "OrganizationAffiliation", "PackagedProductDefinition", "Parameters", "Patient", "PaymentNotice", "PaymentReconciliation", "Person", "PlanDefinition", "Practitioner", "PractitionerRole", "Procedure", "Provenance", "Questionnaire", "QuestionnaireResponse", "RegulatedAuthorization", "RelatedPerson", "RequestOrchestration", "Requirements", "ResearchStudy", "ResearchSubject", "RiskAssessment", "Schedule", "SearchParameter", "ServiceRequest", "Slot", "Specimen", "SpecimenDefinition", "StructureDefinition", "StructureMap", "Subscription", "SubscriptionStatus", "SubscriptionTopic", "Substance", "SubstanceDefinition", "Task", "TerminologyCapabilities", "ValueSet", "VisionPrescription");
        }
        public String toCode() {
          switch (this) {
            case ACCOUNT: return "Account";
            case ACTIVITYDEFINITION: return "ActivityDefinition";
            case ACTORDEFINITION: return "ActorDefinition";
            case ADMINISTRABLEPRODUCTDEFINITION: return "AdministrableProductDefinition";
            case ADVERSEEVENT: return "AdverseEvent";
            case ALLERGYINTOLERANCE: return "AllergyIntolerance";
            case APPOINTMENT: return "Appointment";
            case APPOINTMENTRESPONSE: return "AppointmentResponse";
            case ARTIFACTASSESSMENT: return "ArtifactAssessment";
            case AUDITEVENT: return "AuditEvent";
            case BASIC: return "Basic";
            case BINARY: return "Binary";
            case BIOLOGICALLYDERIVEDPRODUCT: return "BiologicallyDerivedProduct";
            case BODYSTRUCTURE: return "BodyStructure";
            case BUNDLE: return "Bundle";
            case CAPABILITYSTATEMENT: return "CapabilityStatement";
            case CAREPLAN: return "CarePlan";
            case CARETEAM: return "CareTeam";
            case CLAIM: return "Claim";
            case CLAIMRESPONSE: return "ClaimResponse";
            case CLINICALUSEDEFINITION: return "ClinicalUseDefinition";
            case CODESYSTEM: return "CodeSystem";
            case COMMUNICATION: return "Communication";
            case COMMUNICATIONREQUEST: return "CommunicationRequest";
            case COMPARTMENTDEFINITION: return "CompartmentDefinition";
            case COMPOSITION: return "Composition";
            case CONCEPTMAP: return "ConceptMap";
            case CONDITION: return "Condition";
            case CONSENT: return "Consent";
            case CONTRACT: return "Contract";
            case COVERAGE: return "Coverage";
            case COVERAGEELIGIBILITYREQUEST: return "CoverageEligibilityRequest";
            case COVERAGEELIGIBILITYRESPONSE: return "CoverageEligibilityResponse";
            case DETECTEDISSUE: return "DetectedIssue";
            case DEVICE: return "Device";
            case DEVICEALERT: return "DeviceAlert";
            case DEVICEASSOCIATION: return "DeviceAssociation";
            case DEVICEDEFINITION: return "DeviceDefinition";
            case DEVICEMETRIC: return "DeviceMetric";
            case DEVICEREQUEST: return "DeviceRequest";
            case DIAGNOSTICREPORT: return "DiagnosticReport";
            case DOCUMENTREFERENCE: return "DocumentReference";
            case ENCOUNTER: return "Encounter";
            case ENDPOINT: return "Endpoint";
            case ENROLLMENTREQUEST: return "EnrollmentRequest";
            case ENROLLMENTRESPONSE: return "EnrollmentResponse";
            case EPISODEOFCARE: return "EpisodeOfCare";
            case EVENTDEFINITION: return "EventDefinition";
            case EVIDENCE: return "Evidence";
            case EVIDENCEVARIABLE: return "EvidenceVariable";
            case EXAMPLESCENARIO: return "ExampleScenario";
            case EXPLANATIONOFBENEFIT: return "ExplanationOfBenefit";
            case FAMILYMEMBERHISTORY: return "FamilyMemberHistory";
            case FLAG: return "Flag";
            case GOAL: return "Goal";
            case GROUP: return "Group";
            case GUIDANCERESPONSE: return "GuidanceResponse";
            case HEALTHCARESERVICE: return "HealthcareService";
            case IMAGINGSELECTION: return "ImagingSelection";
            case IMAGINGSTUDY: return "ImagingStudy";
            case IMMUNIZATION: return "Immunization";
            case IMPLEMENTATIONGUIDE: return "ImplementationGuide";
            case INGREDIENT: return "Ingredient";
            case INSURANCEPLAN: return "InsurancePlan";
            case INSURANCEPRODUCT: return "InsuranceProduct";
            case INVOICE: return "Invoice";
            case LIBRARY: return "Library";
            case LIST: return "List";
            case LOCATION: return "Location";
            case MANUFACTUREDITEMDEFINITION: return "ManufacturedItemDefinition";
            case MEASURE: return "Measure";
            case MEASUREREPORT: return "MeasureReport";
            case MEDICATION: return "Medication";
            case MEDICATIONADMINISTRATION: return "MedicationAdministration";
            case MEDICATIONDISPENSE: return "MedicationDispense";
            case MEDICATIONREQUEST: return "MedicationRequest";
            case MEDICATIONSTATEMENT: return "MedicationStatement";
            case MEDICINALPRODUCTDEFINITION: return "MedicinalProductDefinition";
            case MESSAGEDEFINITION: return "MessageDefinition";
            case MESSAGEHEADER: return "MessageHeader";
            case NAMINGSYSTEM: return "NamingSystem";
            case NUTRITIONINTAKE: return "NutritionIntake";
            case NUTRITIONORDER: return "NutritionOrder";
            case NUTRITIONPRODUCT: return "NutritionProduct";
            case OBSERVATION: return "Observation";
            case OBSERVATIONDEFINITION: return "ObservationDefinition";
            case OPERATIONDEFINITION: return "OperationDefinition";
            case OPERATIONOUTCOME: return "OperationOutcome";
            case ORGANIZATION: return "Organization";
            case ORGANIZATIONAFFILIATION: return "OrganizationAffiliation";
            case PACKAGEDPRODUCTDEFINITION: return "PackagedProductDefinition";
            case PARAMETERS: return "Parameters";
            case PATIENT: return "Patient";
            case PAYMENTNOTICE: return "PaymentNotice";
            case PAYMENTRECONCILIATION: return "PaymentReconciliation";
            case PERSON: return "Person";
            case PLANDEFINITION: return "PlanDefinition";
            case PRACTITIONER: return "Practitioner";
            case PRACTITIONERROLE: return "PractitionerRole";
            case PROCEDURE: return "Procedure";
            case PROVENANCE: return "Provenance";
            case QUESTIONNAIRE: return "Questionnaire";
            case QUESTIONNAIRERESPONSE: return "QuestionnaireResponse";
            case REGULATEDAUTHORIZATION: return "RegulatedAuthorization";
            case RELATEDPERSON: return "RelatedPerson";
            case REQUESTORCHESTRATION: return "RequestOrchestration";
            case REQUIREMENTS: return "Requirements";
            case RESEARCHSTUDY: return "ResearchStudy";
            case RESEARCHSUBJECT: return "ResearchSubject";
            case RISKASSESSMENT: return "RiskAssessment";
            case SCHEDULE: return "Schedule";
            case SEARCHPARAMETER: return "SearchParameter";
            case SERVICEREQUEST: return "ServiceRequest";
            case SLOT: return "Slot";
            case SPECIMEN: return "Specimen";
            case SPECIMENDEFINITION: return "SpecimenDefinition";
            case STRUCTUREDEFINITION: return "StructureDefinition";
            case STRUCTUREMAP: return "StructureMap";
            case SUBSCRIPTION: return "Subscription";
            case SUBSCRIPTIONSTATUS: return "SubscriptionStatus";
            case SUBSCRIPTIONTOPIC: return "SubscriptionTopic";
            case SUBSTANCE: return "Substance";
            case SUBSTANCEDEFINITION: return "SubstanceDefinition";
            case TASK: return "Task";
            case TERMINOLOGYCAPABILITIES: return "TerminologyCapabilities";
            case VALUESET: return "ValueSet";
            case VISIONPRESCRIPTION: return "VisionPrescription";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACCOUNT: return "http://hl7.org/fhir/fhir-types";
            case ACTIVITYDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case ACTORDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case ADMINISTRABLEPRODUCTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case ADVERSEEVENT: return "http://hl7.org/fhir/fhir-types";
            case ALLERGYINTOLERANCE: return "http://hl7.org/fhir/fhir-types";
            case APPOINTMENT: return "http://hl7.org/fhir/fhir-types";
            case APPOINTMENTRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case ARTIFACTASSESSMENT: return "http://hl7.org/fhir/fhir-types";
            case AUDITEVENT: return "http://hl7.org/fhir/fhir-types";
            case BASIC: return "http://hl7.org/fhir/fhir-types";
            case BINARY: return "http://hl7.org/fhir/fhir-types";
            case BIOLOGICALLYDERIVEDPRODUCT: return "http://hl7.org/fhir/fhir-types";
            case BODYSTRUCTURE: return "http://hl7.org/fhir/fhir-types";
            case BUNDLE: return "http://hl7.org/fhir/fhir-types";
            case CAPABILITYSTATEMENT: return "http://hl7.org/fhir/fhir-types";
            case CAREPLAN: return "http://hl7.org/fhir/fhir-types";
            case CARETEAM: return "http://hl7.org/fhir/fhir-types";
            case CLAIM: return "http://hl7.org/fhir/fhir-types";
            case CLAIMRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case CLINICALUSEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case CODESYSTEM: return "http://hl7.org/fhir/fhir-types";
            case COMMUNICATION: return "http://hl7.org/fhir/fhir-types";
            case COMMUNICATIONREQUEST: return "http://hl7.org/fhir/fhir-types";
            case COMPARTMENTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case COMPOSITION: return "http://hl7.org/fhir/fhir-types";
            case CONCEPTMAP: return "http://hl7.org/fhir/fhir-types";
            case CONDITION: return "http://hl7.org/fhir/fhir-types";
            case CONSENT: return "http://hl7.org/fhir/fhir-types";
            case CONTRACT: return "http://hl7.org/fhir/fhir-types";
            case COVERAGE: return "http://hl7.org/fhir/fhir-types";
            case COVERAGEELIGIBILITYREQUEST: return "http://hl7.org/fhir/fhir-types";
            case COVERAGEELIGIBILITYRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case DETECTEDISSUE: return "http://hl7.org/fhir/fhir-types";
            case DEVICE: return "http://hl7.org/fhir/fhir-types";
            case DEVICEALERT: return "http://hl7.org/fhir/fhir-types";
            case DEVICEASSOCIATION: return "http://hl7.org/fhir/fhir-types";
            case DEVICEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case DEVICEMETRIC: return "http://hl7.org/fhir/fhir-types";
            case DEVICEREQUEST: return "http://hl7.org/fhir/fhir-types";
            case DIAGNOSTICREPORT: return "http://hl7.org/fhir/fhir-types";
            case DOCUMENTREFERENCE: return "http://hl7.org/fhir/fhir-types";
            case ENCOUNTER: return "http://hl7.org/fhir/fhir-types";
            case ENDPOINT: return "http://hl7.org/fhir/fhir-types";
            case ENROLLMENTREQUEST: return "http://hl7.org/fhir/fhir-types";
            case ENROLLMENTRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case EPISODEOFCARE: return "http://hl7.org/fhir/fhir-types";
            case EVENTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case EVIDENCE: return "http://hl7.org/fhir/fhir-types";
            case EVIDENCEVARIABLE: return "http://hl7.org/fhir/fhir-types";
            case EXAMPLESCENARIO: return "http://hl7.org/fhir/fhir-types";
            case EXPLANATIONOFBENEFIT: return "http://hl7.org/fhir/fhir-types";
            case FAMILYMEMBERHISTORY: return "http://hl7.org/fhir/fhir-types";
            case FLAG: return "http://hl7.org/fhir/fhir-types";
            case GOAL: return "http://hl7.org/fhir/fhir-types";
            case GROUP: return "http://hl7.org/fhir/fhir-types";
            case GUIDANCERESPONSE: return "http://hl7.org/fhir/fhir-types";
            case HEALTHCARESERVICE: return "http://hl7.org/fhir/fhir-types";
            case IMAGINGSELECTION: return "http://hl7.org/fhir/fhir-types";
            case IMAGINGSTUDY: return "http://hl7.org/fhir/fhir-types";
            case IMMUNIZATION: return "http://hl7.org/fhir/fhir-types";
            case IMPLEMENTATIONGUIDE: return "http://hl7.org/fhir/fhir-types";
            case INGREDIENT: return "http://hl7.org/fhir/fhir-types";
            case INSURANCEPLAN: return "http://hl7.org/fhir/fhir-types";
            case INSURANCEPRODUCT: return "http://hl7.org/fhir/fhir-types";
            case INVOICE: return "http://hl7.org/fhir/fhir-types";
            case LIBRARY: return "http://hl7.org/fhir/fhir-types";
            case LIST: return "http://hl7.org/fhir/fhir-types";
            case LOCATION: return "http://hl7.org/fhir/fhir-types";
            case MANUFACTUREDITEMDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case MEASURE: return "http://hl7.org/fhir/fhir-types";
            case MEASUREREPORT: return "http://hl7.org/fhir/fhir-types";
            case MEDICATION: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONADMINISTRATION: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONDISPENSE: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONREQUEST: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONSTATEMENT: return "http://hl7.org/fhir/fhir-types";
            case MEDICINALPRODUCTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case MESSAGEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case MESSAGEHEADER: return "http://hl7.org/fhir/fhir-types";
            case NAMINGSYSTEM: return "http://hl7.org/fhir/fhir-types";
            case NUTRITIONINTAKE: return "http://hl7.org/fhir/fhir-types";
            case NUTRITIONORDER: return "http://hl7.org/fhir/fhir-types";
            case NUTRITIONPRODUCT: return "http://hl7.org/fhir/fhir-types";
            case OBSERVATION: return "http://hl7.org/fhir/fhir-types";
            case OBSERVATIONDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case OPERATIONDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case OPERATIONOUTCOME: return "http://hl7.org/fhir/fhir-types";
            case ORGANIZATION: return "http://hl7.org/fhir/fhir-types";
            case ORGANIZATIONAFFILIATION: return "http://hl7.org/fhir/fhir-types";
            case PACKAGEDPRODUCTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case PARAMETERS: return "http://hl7.org/fhir/fhir-types";
            case PATIENT: return "http://hl7.org/fhir/fhir-types";
            case PAYMENTNOTICE: return "http://hl7.org/fhir/fhir-types";
            case PAYMENTRECONCILIATION: return "http://hl7.org/fhir/fhir-types";
            case PERSON: return "http://hl7.org/fhir/fhir-types";
            case PLANDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case PRACTITIONER: return "http://hl7.org/fhir/fhir-types";
            case PRACTITIONERROLE: return "http://hl7.org/fhir/fhir-types";
            case PROCEDURE: return "http://hl7.org/fhir/fhir-types";
            case PROVENANCE: return "http://hl7.org/fhir/fhir-types";
            case QUESTIONNAIRE: return "http://hl7.org/fhir/fhir-types";
            case QUESTIONNAIRERESPONSE: return "http://hl7.org/fhir/fhir-types";
            case REGULATEDAUTHORIZATION: return "http://hl7.org/fhir/fhir-types";
            case RELATEDPERSON: return "http://hl7.org/fhir/fhir-types";
            case REQUESTORCHESTRATION: return "http://hl7.org/fhir/fhir-types";
            case REQUIREMENTS: return "http://hl7.org/fhir/fhir-types";
            case RESEARCHSTUDY: return "http://hl7.org/fhir/fhir-types";
            case RESEARCHSUBJECT: return "http://hl7.org/fhir/fhir-types";
            case RISKASSESSMENT: return "http://hl7.org/fhir/fhir-types";
            case SCHEDULE: return "http://hl7.org/fhir/fhir-types";
            case SEARCHPARAMETER: return "http://hl7.org/fhir/fhir-types";
            case SERVICEREQUEST: return "http://hl7.org/fhir/fhir-types";
            case SLOT: return "http://hl7.org/fhir/fhir-types";
            case SPECIMEN: return "http://hl7.org/fhir/fhir-types";
            case SPECIMENDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case STRUCTUREDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case STRUCTUREMAP: return "http://hl7.org/fhir/fhir-types";
            case SUBSCRIPTION: return "http://hl7.org/fhir/fhir-types";
            case SUBSCRIPTIONSTATUS: return "http://hl7.org/fhir/fhir-types";
            case SUBSCRIPTIONTOPIC: return "http://hl7.org/fhir/fhir-types";
            case SUBSTANCE: return "http://hl7.org/fhir/fhir-types";
            case SUBSTANCEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case TASK: return "http://hl7.org/fhir/fhir-types";
            case TERMINOLOGYCAPABILITIES: return "http://hl7.org/fhir/fhir-types";
            case VALUESET: return "http://hl7.org/fhir/fhir-types";
            case VISIONPRESCRIPTION: return "http://hl7.org/fhir/fhir-types";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACCOUNT: return "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.";
            case ACTIVITYDEFINITION: return "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.";
            case ACTORDEFINITION: return "The ActorDefinition resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.";
            case ADMINISTRABLEPRODUCTDEFINITION: return "A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).";
            case ADVERSEEVENT: return "An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management.  Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers.  Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.";
            case ALLERGYINTOLERANCE: return "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.";
            case APPOINTMENT: return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
            case APPOINTMENTRESPONSE: return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
            case ARTIFACTASSESSMENT: return "This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.";
            case AUDITEVENT: return "A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.";
            case BASIC: return "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.";
            case BINARY: return "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.";
            case BIOLOGICALLYDERIVEDPRODUCT: return "A biological material originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.";
            case BODYSTRUCTURE: return "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.";
            case BUNDLE: return "A container for a collection of resources.";
            case CAPABILITYSTATEMENT: return "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
            case CAREPLAN: return "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.";
            case CARETEAM: return "The Care Team includes all the people, organizations, and care teams who participate or plan to participate in the coordination and delivery of care.";
            case CLAIM: return "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.";
            case CLAIMRESPONSE: return "This resource provides the adjudication details from the processing of a Claim resource.";
            case CLINICALUSEDEFINITION: return "A single issue - either an indication, contraindication, interaction, undesirable effect or warning for a medicinal product, medication, device or procedure.";
            case CODESYSTEM: return "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.";
            case COMMUNICATION: return "A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.";
            case COMMUNICATIONREQUEST: return "A request to convey information from a sender to a recipient.";
            case COMPARTMENTDEFINITION: return "A compartment definition that defines how resources are accessed on a server.";
            case COMPOSITION: return "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and has traceability to the author who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).";
            case CONCEPTMAP: return "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.";
            case CONDITION: return "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.";
            case CONSENT: return "A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.";
            case CONTRACT: return "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.";
            case COVERAGE: return "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.";
            case COVERAGEELIGIBILITYREQUEST: return "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.";
            case COVERAGEELIGIBILITYRESPONSE: return "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.";
            case DETECTEDISSUE: return "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.";
            case DEVICE: return "This resource describes the properties (regulated, has real time clock, etc.), administrative (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement, blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a given module, for example the serial number, manufacturer name, and model number). An actual unit may consist of several modules in a distinct hierarchy and these are represented by multiple Device resources and bound through the 'parent' element.";
            case DEVICEALERT: return "Describes a physiological or technical alert condition report originated by a device.  The DeviceAlert resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable. ";
            case DEVICEASSOCIATION: return "A record of association of a device.";
            case DEVICEDEFINITION: return "This is a specialized resource that defines the characteristics and capabilities of a device.";
            case DEVICEMETRIC: return "Describes a measurement, calculation or setting capability of a device. The DeviceMetric resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable.";
            case DEVICEREQUEST: return "Represents a request a device to be provided to a specific patient. The device may be an implantable device to be subsequently implanted, or an external assistive device, such as a walker, to be delivered and subsequently be used.";
            case DIAGNOSTICREPORT: return "The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.";
            case DOCUMENTREFERENCE: return "A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this “document” encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.";
            case ENCOUNTER: return "An interaction between healthcare provider(s), and/or patient(s) for the purpose of providing healthcare service(s) or assessing the health status of patient(s).";
            case ENDPOINT: return "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.";
            case ENROLLMENTREQUEST: return "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.";
            case ENROLLMENTRESPONSE: return "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.";
            case EPISODEOFCARE: return "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.";
            case EVENTDEFINITION: return "The EventDefinition resource provides a reusable description of when a particular event can occur.";
            case EVIDENCE: return "The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.";
            case EVIDENCEVARIABLE: return "The EvidenceVariable resource describes an element that knowledge (Evidence) is about.";
            case EXAMPLESCENARIO: return "A walkthrough of a workflow showing the interaction between systems and the instances shared, possibly including the evolution of instances over time.";
            case EXPLANATIONOFBENEFIT: return "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.";
            case FAMILYMEMBERHISTORY: return "Significant health conditions for a person related to the patient relevant in the context of care for the patient.";
            case FLAG: return "Prospective warnings of potential issues when providing care to the patient.";
            case GOAL: return "Describes the intended objective(s) for a patient, group, or organizational care.  Examples include a patient's weight loss, restoration of an activity of daily living for a patient, obtaining herd immunity via immunization for a group, meeting a process improvement objective for an organization, etc.";
            case GROUP: return "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not typically expected to act collectively*. These collections are also not typically formally or legally recognized.\\r\\n\\r\\n*NOTE: Group may be used to define families or households, which in some circumstances may act collectively or have a degree of legal or formal recognition. This should be considered an exception. When Group is used for types of entities other than Patient or RelatedPerson, the expectation remains that the Group will not act collectively or have formal recognition - use Organization if these behaviors are needed. See more discussion [below](group.html#group-usage)";
            case GUIDANCERESPONSE: return "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.";
            case HEALTHCARESERVICE: return "The details of a healthcare service available at a location or in a catalog.  In the case where there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be represented using a set of linked HealthcareServices.";
            case IMAGINGSELECTION: return "A selection of DICOM SOP instances within a single Study and Series. This might include additional specifics such as a set of frames or an image region, allowing linkage to an Observation Resource.";
            case IMAGINGSTUDY: return "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of images or other data objects (called Service-Object Pair Instances or SOP Instances) acquired or produced in a common context.";
            case IMMUNIZATION: return "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.";
            case IMPLEMENTATIONGUIDE: return "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.";
            case INGREDIENT: return "An ingredient of a manufactured item or pharmaceutical product.";
            case INSURANCEPLAN: return "Details of a Health Insurance plan provided by an organization under an InsuranceProduct.";
            case INSURANCEPRODUCT: return "Details of a Health Insurance product provided by an organization.";
            case INVOICE: return "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.";
            case LIBRARY: return "The Library resource is a general-purpose container for knowledge artifact definitions. It can be used to describe and expose existing knowledge artifacts such as logic libraries and information model descriptions, as well as to describe a collection of knowledge artifacts.";
            case LIST: return "A List is a curated collection of resources, for things such as problem lists, allergy lists, facility list, organization list, etc.";
            case LOCATION: return "Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.";
            case MANUFACTUREDITEMDEFINITION: return "The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.";
            case MEASURE: return "The Measure resource provides the definition of a quality measure.";
            case MEASUREREPORT: return "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.";
            case MEDICATION: return "This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.";
            case MEDICATIONADMINISTRATION: return "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner. This event can also be used to record waste using a status of not-done and the appropriate statusReason.";
            case MEDICATIONDISPENSE: return "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.";
            case MEDICATIONREQUEST: return "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.";
            case MEDICATIONSTATEMENT: return "A record of a medication consumed by a patient.  A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future. The source of this information can be the patient, patient representative (e.g., spouse, significant other, family member, caregiver), or a clinician. A common scenario where this information is captured is during the history taking process during a patient encounter or stay. The medication information may come from sources such as the patient's memory, from a prescription bottle, or from a list of medications the patient, clinician or other party maintains. The primary difference between a MedicationStatement and a MedicationAdministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication. A MedicationStatement is often, if not always, less specific. There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise. As stated earlier, the MedicationStatement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party. MedicationAdministration is more formal and is not missing detailed information.";
            case MEDICINALPRODUCTDEFINITION: return "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).";
            case MESSAGEDEFINITION: return "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.";
            case MESSAGEHEADER: return "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.";
            case NAMINGSYSTEM: return "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.";
            case NUTRITIONINTAKE: return "A record of intake by a patient.  A NutritionIntake may indicate that the patient may be consuming the food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula now or has consumed it in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label, or from a clinician documenting observed intake.";
            case NUTRITIONORDER: return "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to an individual or group.";
            case NUTRITIONPRODUCT: return "A food or supplement that is consumed by patients.";
            case OBSERVATION: return "Measurements and simple assertions made about a patient, device or other subject.";
            case OBSERVATIONDEFINITION: return "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.";
            case OPERATIONDEFINITION: return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
            case OPERATIONOUTCOME: return "A collection of error, warning, or information messages that result from a system action.";
            case ORGANIZATION: return "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.";
            case ORGANIZATIONAFFILIATION: return "Defines an affiliation/assotiation/relationship between 2 distinct organizations, that is not a part-of relationship/sub-division relationship.";
            case PACKAGEDPRODUCTDEFINITION: return "A medically related item or items, in a container or package.";
            case PARAMETERS: return "This resource is used to pass information into and back from an operation (whether invoked directly from REST or within a messaging environment).  It is not persisted or allowed to be referenced by other resources except as described in the definition of the Parameters resource.";
            case PATIENT: return "Demographics and other administrative information about an individual or animal that is the subject of potential, past, current, or future health-related care, services, or processes.";
            case PAYMENTNOTICE: return "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.";
            case PAYMENTRECONCILIATION: return "This resource provides the details including amount of a payment and allocates the payment items being paid.";
            case PERSON: return "Demographics and administrative information about a person independent of a specific health-related context.";
            case PLANDEFINITION: return "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, drug quality specifications, and drug manufacturing process.";
            case PRACTITIONER: return "A person who is directly or indirectly involved in the provisioning of healthcare or related services.";
            case PRACTITIONERROLE: return "A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has performed at an organization during a period of time.";
            case PROCEDURE: return "An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.";
            case PROVENANCE: return "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which MAY impact security, privacy, and trust policies.";
            case QUESTIONNAIRE: return "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.";
            case QUESTIONNAIRERESPONSE: return "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.";
            case REGULATEDAUTHORIZATION: return "Regulatory approval, clearance or licensing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.";
            case RELATEDPERSON: return "Information about a person that is involved in a patient's health or the care for a patient, but who is not the primary target of healthcare.";
            case REQUESTORCHESTRATION: return "A set of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".";
            case REQUIREMENTS: return "The Requirements resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.";
            case RESEARCHSTUDY: return "A scientific study intended to increase health-related knowledge. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.";
            case RESEARCHSUBJECT: return "A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.";
            case RISKASSESSMENT: return "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.";
            case SCHEDULE: return "A container for slots of time that may be available for booking appointments.";
            case SEARCHPARAMETER: return "A search parameter that defines a named search item that can be used to search/filter on a resource.";
            case SERVICEREQUEST: return "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.";
            case SLOT: return "A slot of time on a schedule that may be available for booking appointments.";
            case SPECIMEN: return "A sample to be used for analysis.";
            case SPECIMENDEFINITION: return "A kind of specimen with associated set of requirements.";
            case STRUCTUREDEFINITION: return "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.";
            case STRUCTUREMAP: return "A Map of relationships between 2 structures that can be used to transform data.";
            case SUBSCRIPTION: return "The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.";
            case SUBSCRIPTIONSTATUS: return "The SubscriptionStatus resource describes the state of a Subscription during notifications. It is not persisted.";
            case SUBSCRIPTIONTOPIC: return "Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.";
            case SUBSTANCE: return "A homogeneous material with a definite composition.";
            case SUBSTANCEDEFINITION: return "The detailed description of a substance, typically at a level beyond what is used for prescribing.";
            case TASK: return "A task to be performed as a part of a workflow and the related information like inputs, outputs and execution progress.";
            case TERMINOLOGYCAPABILITIES: return "A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
            case VALUESET: return "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).";
            case VISIONPRESCRIPTION: return "An authorization for the provision of glasses and/or contact lenses to a patient.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACCOUNT: return "Account";
            case ACTIVITYDEFINITION: return "ActivityDefinition";
            case ACTORDEFINITION: return "ActorDefinition";
            case ADMINISTRABLEPRODUCTDEFINITION: return "AdministrableProductDefinition";
            case ADVERSEEVENT: return "AdverseEvent";
            case ALLERGYINTOLERANCE: return "AllergyIntolerance";
            case APPOINTMENT: return "Appointment";
            case APPOINTMENTRESPONSE: return "AppointmentResponse";
            case ARTIFACTASSESSMENT: return "ArtifactAssessment";
            case AUDITEVENT: return "AuditEvent";
            case BASIC: return "Basic";
            case BINARY: return "Binary";
            case BIOLOGICALLYDERIVEDPRODUCT: return "BiologicallyDerivedProduct";
            case BODYSTRUCTURE: return "BodyStructure";
            case BUNDLE: return "Bundle";
            case CAPABILITYSTATEMENT: return "CapabilityStatement";
            case CAREPLAN: return "CarePlan";
            case CARETEAM: return "CareTeam";
            case CLAIM: return "Claim";
            case CLAIMRESPONSE: return "ClaimResponse";
            case CLINICALUSEDEFINITION: return "ClinicalUseDefinition";
            case CODESYSTEM: return "CodeSystem";
            case COMMUNICATION: return "Communication";
            case COMMUNICATIONREQUEST: return "CommunicationRequest";
            case COMPARTMENTDEFINITION: return "CompartmentDefinition";
            case COMPOSITION: return "Composition";
            case CONCEPTMAP: return "ConceptMap";
            case CONDITION: return "Condition";
            case CONSENT: return "Consent";
            case CONTRACT: return "Contract";
            case COVERAGE: return "Coverage";
            case COVERAGEELIGIBILITYREQUEST: return "CoverageEligibilityRequest";
            case COVERAGEELIGIBILITYRESPONSE: return "CoverageEligibilityResponse";
            case DETECTEDISSUE: return "DetectedIssue";
            case DEVICE: return "Device";
            case DEVICEALERT: return "DeviceAlert";
            case DEVICEASSOCIATION: return "DeviceAssociation";
            case DEVICEDEFINITION: return "DeviceDefinition";
            case DEVICEMETRIC: return "DeviceMetric";
            case DEVICEREQUEST: return "DeviceRequest";
            case DIAGNOSTICREPORT: return "DiagnosticReport";
            case DOCUMENTREFERENCE: return "DocumentReference";
            case ENCOUNTER: return "Encounter";
            case ENDPOINT: return "Endpoint";
            case ENROLLMENTREQUEST: return "EnrollmentRequest";
            case ENROLLMENTRESPONSE: return "EnrollmentResponse";
            case EPISODEOFCARE: return "EpisodeOfCare";
            case EVENTDEFINITION: return "EventDefinition";
            case EVIDENCE: return "Evidence";
            case EVIDENCEVARIABLE: return "EvidenceVariable";
            case EXAMPLESCENARIO: return "ExampleScenario";
            case EXPLANATIONOFBENEFIT: return "ExplanationOfBenefit";
            case FAMILYMEMBERHISTORY: return "FamilyMemberHistory";
            case FLAG: return "Flag";
            case GOAL: return "Goal";
            case GROUP: return "Group";
            case GUIDANCERESPONSE: return "GuidanceResponse";
            case HEALTHCARESERVICE: return "HealthcareService";
            case IMAGINGSELECTION: return "ImagingSelection";
            case IMAGINGSTUDY: return "ImagingStudy";
            case IMMUNIZATION: return "Immunization";
            case IMPLEMENTATIONGUIDE: return "ImplementationGuide";
            case INGREDIENT: return "Ingredient";
            case INSURANCEPLAN: return "InsurancePlan";
            case INSURANCEPRODUCT: return "InsuranceProduct";
            case INVOICE: return "Invoice";
            case LIBRARY: return "Library";
            case LIST: return "List";
            case LOCATION: return "Location";
            case MANUFACTUREDITEMDEFINITION: return "ManufacturedItemDefinition";
            case MEASURE: return "Measure";
            case MEASUREREPORT: return "MeasureReport";
            case MEDICATION: return "Medication";
            case MEDICATIONADMINISTRATION: return "MedicationAdministration";
            case MEDICATIONDISPENSE: return "MedicationDispense";
            case MEDICATIONREQUEST: return "MedicationRequest";
            case MEDICATIONSTATEMENT: return "MedicationStatement";
            case MEDICINALPRODUCTDEFINITION: return "MedicinalProductDefinition";
            case MESSAGEDEFINITION: return "MessageDefinition";
            case MESSAGEHEADER: return "MessageHeader";
            case NAMINGSYSTEM: return "NamingSystem";
            case NUTRITIONINTAKE: return "NutritionIntake";
            case NUTRITIONORDER: return "NutritionOrder";
            case NUTRITIONPRODUCT: return "NutritionProduct";
            case OBSERVATION: return "Observation";
            case OBSERVATIONDEFINITION: return "ObservationDefinition";
            case OPERATIONDEFINITION: return "OperationDefinition";
            case OPERATIONOUTCOME: return "OperationOutcome";
            case ORGANIZATION: return "Organization";
            case ORGANIZATIONAFFILIATION: return "OrganizationAffiliation";
            case PACKAGEDPRODUCTDEFINITION: return "PackagedProductDefinition";
            case PARAMETERS: return "Parameters";
            case PATIENT: return "Patient";
            case PAYMENTNOTICE: return "PaymentNotice";
            case PAYMENTRECONCILIATION: return "PaymentReconciliation";
            case PERSON: return "Person";
            case PLANDEFINITION: return "PlanDefinition";
            case PRACTITIONER: return "Practitioner";
            case PRACTITIONERROLE: return "PractitionerRole";
            case PROCEDURE: return "Procedure";
            case PROVENANCE: return "Provenance";
            case QUESTIONNAIRE: return "Questionnaire";
            case QUESTIONNAIRERESPONSE: return "QuestionnaireResponse";
            case REGULATEDAUTHORIZATION: return "RegulatedAuthorization";
            case RELATEDPERSON: return "RelatedPerson";
            case REQUESTORCHESTRATION: return "RequestOrchestration";
            case REQUIREMENTS: return "Requirements";
            case RESEARCHSTUDY: return "ResearchStudy";
            case RESEARCHSUBJECT: return "ResearchSubject";
            case RISKASSESSMENT: return "RiskAssessment";
            case SCHEDULE: return "Schedule";
            case SEARCHPARAMETER: return "SearchParameter";
            case SERVICEREQUEST: return "ServiceRequest";
            case SLOT: return "Slot";
            case SPECIMEN: return "Specimen";
            case SPECIMENDEFINITION: return "SpecimenDefinition";
            case STRUCTUREDEFINITION: return "StructureDefinition";
            case STRUCTUREMAP: return "StructureMap";
            case SUBSCRIPTION: return "Subscription";
            case SUBSCRIPTIONSTATUS: return "SubscriptionStatus";
            case SUBSCRIPTIONTOPIC: return "SubscriptionTopic";
            case SUBSTANCE: return "Substance";
            case SUBSTANCEDEFINITION: return "SubstanceDefinition";
            case TASK: return "Task";
            case TERMINOLOGYCAPABILITIES: return "TerminologyCapabilities";
            case VALUESET: return "ValueSet";
            case VISIONPRESCRIPTION: return "VisionPrescription";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class ResourceTypeEnumEnumFactory implements EnumFactory<ResourceTypeEnum> {
    public ResourceTypeEnum fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Account".equals(codeString))
          return ResourceTypeEnum.ACCOUNT;
        if ("ActivityDefinition".equals(codeString))
          return ResourceTypeEnum.ACTIVITYDEFINITION;
        if ("ActorDefinition".equals(codeString))
          return ResourceTypeEnum.ACTORDEFINITION;
        if ("AdministrableProductDefinition".equals(codeString))
          return ResourceTypeEnum.ADMINISTRABLEPRODUCTDEFINITION;
        if ("AdverseEvent".equals(codeString))
          return ResourceTypeEnum.ADVERSEEVENT;
        if ("AllergyIntolerance".equals(codeString))
          return ResourceTypeEnum.ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
          return ResourceTypeEnum.APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
          return ResourceTypeEnum.APPOINTMENTRESPONSE;
        if ("ArtifactAssessment".equals(codeString))
          return ResourceTypeEnum.ARTIFACTASSESSMENT;
        if ("AuditEvent".equals(codeString))
          return ResourceTypeEnum.AUDITEVENT;
        if ("Basic".equals(codeString))
          return ResourceTypeEnum.BASIC;
        if ("Binary".equals(codeString))
          return ResourceTypeEnum.BINARY;
        if ("BiologicallyDerivedProduct".equals(codeString))
          return ResourceTypeEnum.BIOLOGICALLYDERIVEDPRODUCT;
        if ("BodyStructure".equals(codeString))
          return ResourceTypeEnum.BODYSTRUCTURE;
        if ("Bundle".equals(codeString))
          return ResourceTypeEnum.BUNDLE;
        if ("CapabilityStatement".equals(codeString))
          return ResourceTypeEnum.CAPABILITYSTATEMENT;
        if ("CarePlan".equals(codeString))
          return ResourceTypeEnum.CAREPLAN;
        if ("CareTeam".equals(codeString))
          return ResourceTypeEnum.CARETEAM;
        if ("Claim".equals(codeString))
          return ResourceTypeEnum.CLAIM;
        if ("ClaimResponse".equals(codeString))
          return ResourceTypeEnum.CLAIMRESPONSE;
        if ("ClinicalUseDefinition".equals(codeString))
          return ResourceTypeEnum.CLINICALUSEDEFINITION;
        if ("CodeSystem".equals(codeString))
          return ResourceTypeEnum.CODESYSTEM;
        if ("Communication".equals(codeString))
          return ResourceTypeEnum.COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
          return ResourceTypeEnum.COMMUNICATIONREQUEST;
        if ("CompartmentDefinition".equals(codeString))
          return ResourceTypeEnum.COMPARTMENTDEFINITION;
        if ("Composition".equals(codeString))
          return ResourceTypeEnum.COMPOSITION;
        if ("ConceptMap".equals(codeString))
          return ResourceTypeEnum.CONCEPTMAP;
        if ("Condition".equals(codeString))
          return ResourceTypeEnum.CONDITION;
        if ("Consent".equals(codeString))
          return ResourceTypeEnum.CONSENT;
        if ("Contract".equals(codeString))
          return ResourceTypeEnum.CONTRACT;
        if ("Coverage".equals(codeString))
          return ResourceTypeEnum.COVERAGE;
        if ("CoverageEligibilityRequest".equals(codeString))
          return ResourceTypeEnum.COVERAGEELIGIBILITYREQUEST;
        if ("CoverageEligibilityResponse".equals(codeString))
          return ResourceTypeEnum.COVERAGEELIGIBILITYRESPONSE;
        if ("DetectedIssue".equals(codeString))
          return ResourceTypeEnum.DETECTEDISSUE;
        if ("Device".equals(codeString))
          return ResourceTypeEnum.DEVICE;
        if ("DeviceAlert".equals(codeString))
          return ResourceTypeEnum.DEVICEALERT;
        if ("DeviceAssociation".equals(codeString))
          return ResourceTypeEnum.DEVICEASSOCIATION;
        if ("DeviceDefinition".equals(codeString))
          return ResourceTypeEnum.DEVICEDEFINITION;
        if ("DeviceMetric".equals(codeString))
          return ResourceTypeEnum.DEVICEMETRIC;
        if ("DeviceRequest".equals(codeString))
          return ResourceTypeEnum.DEVICEREQUEST;
        if ("DiagnosticReport".equals(codeString))
          return ResourceTypeEnum.DIAGNOSTICREPORT;
        if ("DocumentReference".equals(codeString))
          return ResourceTypeEnum.DOCUMENTREFERENCE;
        if ("Encounter".equals(codeString))
          return ResourceTypeEnum.ENCOUNTER;
        if ("Endpoint".equals(codeString))
          return ResourceTypeEnum.ENDPOINT;
        if ("EnrollmentRequest".equals(codeString))
          return ResourceTypeEnum.ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
          return ResourceTypeEnum.ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
          return ResourceTypeEnum.EPISODEOFCARE;
        if ("EventDefinition".equals(codeString))
          return ResourceTypeEnum.EVENTDEFINITION;
        if ("Evidence".equals(codeString))
          return ResourceTypeEnum.EVIDENCE;
        if ("EvidenceVariable".equals(codeString))
          return ResourceTypeEnum.EVIDENCEVARIABLE;
        if ("ExampleScenario".equals(codeString))
          return ResourceTypeEnum.EXAMPLESCENARIO;
        if ("ExplanationOfBenefit".equals(codeString))
          return ResourceTypeEnum.EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
          return ResourceTypeEnum.FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
          return ResourceTypeEnum.FLAG;
        if ("Goal".equals(codeString))
          return ResourceTypeEnum.GOAL;
        if ("Group".equals(codeString))
          return ResourceTypeEnum.GROUP;
        if ("GuidanceResponse".equals(codeString))
          return ResourceTypeEnum.GUIDANCERESPONSE;
        if ("HealthcareService".equals(codeString))
          return ResourceTypeEnum.HEALTHCARESERVICE;
        if ("ImagingSelection".equals(codeString))
          return ResourceTypeEnum.IMAGINGSELECTION;
        if ("ImagingStudy".equals(codeString))
          return ResourceTypeEnum.IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
          return ResourceTypeEnum.IMMUNIZATION;
        if ("ImplementationGuide".equals(codeString))
          return ResourceTypeEnum.IMPLEMENTATIONGUIDE;
        if ("Ingredient".equals(codeString))
          return ResourceTypeEnum.INGREDIENT;
        if ("InsurancePlan".equals(codeString))
          return ResourceTypeEnum.INSURANCEPLAN;
        if ("InsuranceProduct".equals(codeString))
          return ResourceTypeEnum.INSURANCEPRODUCT;
        if ("Invoice".equals(codeString))
          return ResourceTypeEnum.INVOICE;
        if ("Library".equals(codeString))
          return ResourceTypeEnum.LIBRARY;
        if ("List".equals(codeString))
          return ResourceTypeEnum.LIST;
        if ("Location".equals(codeString))
          return ResourceTypeEnum.LOCATION;
        if ("ManufacturedItemDefinition".equals(codeString))
          return ResourceTypeEnum.MANUFACTUREDITEMDEFINITION;
        if ("Measure".equals(codeString))
          return ResourceTypeEnum.MEASURE;
        if ("MeasureReport".equals(codeString))
          return ResourceTypeEnum.MEASUREREPORT;
        if ("Medication".equals(codeString))
          return ResourceTypeEnum.MEDICATION;
        if ("MedicationAdministration".equals(codeString))
          return ResourceTypeEnum.MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
          return ResourceTypeEnum.MEDICATIONDISPENSE;
        if ("MedicationRequest".equals(codeString))
          return ResourceTypeEnum.MEDICATIONREQUEST;
        if ("MedicationStatement".equals(codeString))
          return ResourceTypeEnum.MEDICATIONSTATEMENT;
        if ("MedicinalProductDefinition".equals(codeString))
          return ResourceTypeEnum.MEDICINALPRODUCTDEFINITION;
        if ("MessageDefinition".equals(codeString))
          return ResourceTypeEnum.MESSAGEDEFINITION;
        if ("MessageHeader".equals(codeString))
          return ResourceTypeEnum.MESSAGEHEADER;
        if ("NamingSystem".equals(codeString))
          return ResourceTypeEnum.NAMINGSYSTEM;
        if ("NutritionIntake".equals(codeString))
          return ResourceTypeEnum.NUTRITIONINTAKE;
        if ("NutritionOrder".equals(codeString))
          return ResourceTypeEnum.NUTRITIONORDER;
        if ("NutritionProduct".equals(codeString))
          return ResourceTypeEnum.NUTRITIONPRODUCT;
        if ("Observation".equals(codeString))
          return ResourceTypeEnum.OBSERVATION;
        if ("ObservationDefinition".equals(codeString))
          return ResourceTypeEnum.OBSERVATIONDEFINITION;
        if ("OperationDefinition".equals(codeString))
          return ResourceTypeEnum.OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
          return ResourceTypeEnum.OPERATIONOUTCOME;
        if ("Organization".equals(codeString))
          return ResourceTypeEnum.ORGANIZATION;
        if ("OrganizationAffiliation".equals(codeString))
          return ResourceTypeEnum.ORGANIZATIONAFFILIATION;
        if ("PackagedProductDefinition".equals(codeString))
          return ResourceTypeEnum.PACKAGEDPRODUCTDEFINITION;
        if ("Parameters".equals(codeString))
          return ResourceTypeEnum.PARAMETERS;
        if ("Patient".equals(codeString))
          return ResourceTypeEnum.PATIENT;
        if ("PaymentNotice".equals(codeString))
          return ResourceTypeEnum.PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
          return ResourceTypeEnum.PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
          return ResourceTypeEnum.PERSON;
        if ("PlanDefinition".equals(codeString))
          return ResourceTypeEnum.PLANDEFINITION;
        if ("Practitioner".equals(codeString))
          return ResourceTypeEnum.PRACTITIONER;
        if ("PractitionerRole".equals(codeString))
          return ResourceTypeEnum.PRACTITIONERROLE;
        if ("Procedure".equals(codeString))
          return ResourceTypeEnum.PROCEDURE;
        if ("Provenance".equals(codeString))
          return ResourceTypeEnum.PROVENANCE;
        if ("Questionnaire".equals(codeString))
          return ResourceTypeEnum.QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
          return ResourceTypeEnum.QUESTIONNAIRERESPONSE;
        if ("RegulatedAuthorization".equals(codeString))
          return ResourceTypeEnum.REGULATEDAUTHORIZATION;
        if ("RelatedPerson".equals(codeString))
          return ResourceTypeEnum.RELATEDPERSON;
        if ("RequestOrchestration".equals(codeString))
          return ResourceTypeEnum.REQUESTORCHESTRATION;
        if ("Requirements".equals(codeString))
          return ResourceTypeEnum.REQUIREMENTS;
        if ("ResearchStudy".equals(codeString))
          return ResourceTypeEnum.RESEARCHSTUDY;
        if ("ResearchSubject".equals(codeString))
          return ResourceTypeEnum.RESEARCHSUBJECT;
        if ("RiskAssessment".equals(codeString))
          return ResourceTypeEnum.RISKASSESSMENT;
        if ("Schedule".equals(codeString))
          return ResourceTypeEnum.SCHEDULE;
        if ("SearchParameter".equals(codeString))
          return ResourceTypeEnum.SEARCHPARAMETER;
        if ("ServiceRequest".equals(codeString))
          return ResourceTypeEnum.SERVICEREQUEST;
        if ("Slot".equals(codeString))
          return ResourceTypeEnum.SLOT;
        if ("Specimen".equals(codeString))
          return ResourceTypeEnum.SPECIMEN;
        if ("SpecimenDefinition".equals(codeString))
          return ResourceTypeEnum.SPECIMENDEFINITION;
        if ("StructureDefinition".equals(codeString))
          return ResourceTypeEnum.STRUCTUREDEFINITION;
        if ("StructureMap".equals(codeString))
          return ResourceTypeEnum.STRUCTUREMAP;
        if ("Subscription".equals(codeString))
          return ResourceTypeEnum.SUBSCRIPTION;
        if ("SubscriptionStatus".equals(codeString))
          return ResourceTypeEnum.SUBSCRIPTIONSTATUS;
        if ("SubscriptionTopic".equals(codeString))
          return ResourceTypeEnum.SUBSCRIPTIONTOPIC;
        if ("Substance".equals(codeString))
          return ResourceTypeEnum.SUBSTANCE;
        if ("SubstanceDefinition".equals(codeString))
          return ResourceTypeEnum.SUBSTANCEDEFINITION;
        if ("Task".equals(codeString))
          return ResourceTypeEnum.TASK;
        if ("TerminologyCapabilities".equals(codeString))
          return ResourceTypeEnum.TERMINOLOGYCAPABILITIES;
        if ("ValueSet".equals(codeString))
          return ResourceTypeEnum.VALUESET;
        if ("VisionPrescription".equals(codeString))
          return ResourceTypeEnum.VISIONPRESCRIPTION;
        throw new IllegalArgumentException("Unknown ResourceTypeEnum code '"+codeString+"'");
        }

        public Enumeration<ResourceTypeEnum> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.NULL, code);
        if ("Account".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ACCOUNT, code);
        if ("ActivityDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ACTIVITYDEFINITION, code);
        if ("ActorDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ACTORDEFINITION, code);
        if ("AdministrableProductDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ADMINISTRABLEPRODUCTDEFINITION, code);
        if ("AdverseEvent".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ADVERSEEVENT, code);
        if ("AllergyIntolerance".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ALLERGYINTOLERANCE, code);
        if ("Appointment".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.APPOINTMENT, code);
        if ("AppointmentResponse".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.APPOINTMENTRESPONSE, code);
        if ("ArtifactAssessment".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ARTIFACTASSESSMENT, code);
        if ("AuditEvent".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.AUDITEVENT, code);
        if ("Basic".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.BASIC, code);
        if ("Binary".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.BINARY, code);
        if ("BiologicallyDerivedProduct".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.BIOLOGICALLYDERIVEDPRODUCT, code);
        if ("BodyStructure".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.BODYSTRUCTURE, code);
        if ("Bundle".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.BUNDLE, code);
        if ("CapabilityStatement".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CAPABILITYSTATEMENT, code);
        if ("CarePlan".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CAREPLAN, code);
        if ("CareTeam".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CARETEAM, code);
        if ("Claim".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CLAIM, code);
        if ("ClaimResponse".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CLAIMRESPONSE, code);
        if ("ClinicalUseDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CLINICALUSEDEFINITION, code);
        if ("CodeSystem".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CODESYSTEM, code);
        if ("Communication".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COMMUNICATION, code);
        if ("CommunicationRequest".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COMMUNICATIONREQUEST, code);
        if ("CompartmentDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COMPARTMENTDEFINITION, code);
        if ("Composition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COMPOSITION, code);
        if ("ConceptMap".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CONCEPTMAP, code);
        if ("Condition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CONDITION, code);
        if ("Consent".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CONSENT, code);
        if ("Contract".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.CONTRACT, code);
        if ("Coverage".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COVERAGE, code);
        if ("CoverageEligibilityRequest".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COVERAGEELIGIBILITYREQUEST, code);
        if ("CoverageEligibilityResponse".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.COVERAGEELIGIBILITYRESPONSE, code);
        if ("DetectedIssue".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DETECTEDISSUE, code);
        if ("Device".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DEVICE, code);
        if ("DeviceAlert".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DEVICEALERT, code);
        if ("DeviceAssociation".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DEVICEASSOCIATION, code);
        if ("DeviceDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DEVICEDEFINITION, code);
        if ("DeviceMetric".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DEVICEMETRIC, code);
        if ("DeviceRequest".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DEVICEREQUEST, code);
        if ("DiagnosticReport".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DIAGNOSTICREPORT, code);
        if ("DocumentReference".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.DOCUMENTREFERENCE, code);
        if ("Encounter".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ENCOUNTER, code);
        if ("Endpoint".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ENDPOINT, code);
        if ("EnrollmentRequest".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ENROLLMENTREQUEST, code);
        if ("EnrollmentResponse".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ENROLLMENTRESPONSE, code);
        if ("EpisodeOfCare".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.EPISODEOFCARE, code);
        if ("EventDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.EVENTDEFINITION, code);
        if ("Evidence".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.EVIDENCE, code);
        if ("EvidenceVariable".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.EVIDENCEVARIABLE, code);
        if ("ExampleScenario".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.EXAMPLESCENARIO, code);
        if ("ExplanationOfBenefit".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.EXPLANATIONOFBENEFIT, code);
        if ("FamilyMemberHistory".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.FAMILYMEMBERHISTORY, code);
        if ("Flag".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.FLAG, code);
        if ("Goal".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.GOAL, code);
        if ("Group".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.GROUP, code);
        if ("GuidanceResponse".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.GUIDANCERESPONSE, code);
        if ("HealthcareService".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.HEALTHCARESERVICE, code);
        if ("ImagingSelection".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.IMAGINGSELECTION, code);
        if ("ImagingStudy".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.IMAGINGSTUDY, code);
        if ("Immunization".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.IMMUNIZATION, code);
        if ("ImplementationGuide".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.IMPLEMENTATIONGUIDE, code);
        if ("Ingredient".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.INGREDIENT, code);
        if ("InsurancePlan".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.INSURANCEPLAN, code);
        if ("InsuranceProduct".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.INSURANCEPRODUCT, code);
        if ("Invoice".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.INVOICE, code);
        if ("Library".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.LIBRARY, code);
        if ("List".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.LIST, code);
        if ("Location".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.LOCATION, code);
        if ("ManufacturedItemDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MANUFACTUREDITEMDEFINITION, code);
        if ("Measure".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEASURE, code);
        if ("MeasureReport".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEASUREREPORT, code);
        if ("Medication".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEDICATION, code);
        if ("MedicationAdministration".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEDICATIONADMINISTRATION, code);
        if ("MedicationDispense".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEDICATIONDISPENSE, code);
        if ("MedicationRequest".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEDICATIONREQUEST, code);
        if ("MedicationStatement".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEDICATIONSTATEMENT, code);
        if ("MedicinalProductDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MEDICINALPRODUCTDEFINITION, code);
        if ("MessageDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MESSAGEDEFINITION, code);
        if ("MessageHeader".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.MESSAGEHEADER, code);
        if ("NamingSystem".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.NAMINGSYSTEM, code);
        if ("NutritionIntake".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.NUTRITIONINTAKE, code);
        if ("NutritionOrder".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.NUTRITIONORDER, code);
        if ("NutritionProduct".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.NUTRITIONPRODUCT, code);
        if ("Observation".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.OBSERVATION, code);
        if ("ObservationDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.OBSERVATIONDEFINITION, code);
        if ("OperationDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.OPERATIONDEFINITION, code);
        if ("OperationOutcome".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.OPERATIONOUTCOME, code);
        if ("Organization".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ORGANIZATION, code);
        if ("OrganizationAffiliation".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.ORGANIZATIONAFFILIATION, code);
        if ("PackagedProductDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PACKAGEDPRODUCTDEFINITION, code);
        if ("Parameters".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PARAMETERS, code);
        if ("Patient".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PATIENT, code);
        if ("PaymentNotice".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PAYMENTNOTICE, code);
        if ("PaymentReconciliation".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PAYMENTRECONCILIATION, code);
        if ("Person".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PERSON, code);
        if ("PlanDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PLANDEFINITION, code);
        if ("Practitioner".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PRACTITIONER, code);
        if ("PractitionerRole".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PRACTITIONERROLE, code);
        if ("Procedure".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PROCEDURE, code);
        if ("Provenance".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.PROVENANCE, code);
        if ("Questionnaire".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.QUESTIONNAIRE, code);
        if ("QuestionnaireResponse".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.QUESTIONNAIRERESPONSE, code);
        if ("RegulatedAuthorization".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.REGULATEDAUTHORIZATION, code);
        if ("RelatedPerson".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.RELATEDPERSON, code);
        if ("RequestOrchestration".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.REQUESTORCHESTRATION, code);
        if ("Requirements".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.REQUIREMENTS, code);
        if ("ResearchStudy".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.RESEARCHSTUDY, code);
        if ("ResearchSubject".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.RESEARCHSUBJECT, code);
        if ("RiskAssessment".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.RISKASSESSMENT, code);
        if ("Schedule".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SCHEDULE, code);
        if ("SearchParameter".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SEARCHPARAMETER, code);
        if ("ServiceRequest".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SERVICEREQUEST, code);
        if ("Slot".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SLOT, code);
        if ("Specimen".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SPECIMEN, code);
        if ("SpecimenDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SPECIMENDEFINITION, code);
        if ("StructureDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.STRUCTUREDEFINITION, code);
        if ("StructureMap".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.STRUCTUREMAP, code);
        if ("Subscription".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SUBSCRIPTION, code);
        if ("SubscriptionStatus".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SUBSCRIPTIONSTATUS, code);
        if ("SubscriptionTopic".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SUBSCRIPTIONTOPIC, code);
        if ("Substance".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SUBSTANCE, code);
        if ("SubstanceDefinition".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.SUBSTANCEDEFINITION, code);
        if ("Task".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.TASK, code);
        if ("TerminologyCapabilities".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.TERMINOLOGYCAPABILITIES, code);
        if ("ValueSet".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.VALUESET, code);
        if ("VisionPrescription".equals(codeString))
          return new Enumeration<ResourceTypeEnum>(this, ResourceTypeEnum.VISIONPRESCRIPTION, code);
        throw new FHIRException("Unknown ResourceTypeEnum code '"+codeString+"'");
        }
    public String toCode(ResourceTypeEnum code) {
      if (code == ResourceTypeEnum.ACCOUNT)
        return "Account";
      if (code == ResourceTypeEnum.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == ResourceTypeEnum.ACTORDEFINITION)
        return "ActorDefinition";
      if (code == ResourceTypeEnum.ADMINISTRABLEPRODUCTDEFINITION)
        return "AdministrableProductDefinition";
      if (code == ResourceTypeEnum.ADVERSEEVENT)
        return "AdverseEvent";
      if (code == ResourceTypeEnum.ALLERGYINTOLERANCE)
        return "AllergyIntolerance";
      if (code == ResourceTypeEnum.APPOINTMENT)
        return "Appointment";
      if (code == ResourceTypeEnum.APPOINTMENTRESPONSE)
        return "AppointmentResponse";
      if (code == ResourceTypeEnum.ARTIFACTASSESSMENT)
        return "ArtifactAssessment";
      if (code == ResourceTypeEnum.AUDITEVENT)
        return "AuditEvent";
      if (code == ResourceTypeEnum.BASIC)
        return "Basic";
      if (code == ResourceTypeEnum.BINARY)
        return "Binary";
      if (code == ResourceTypeEnum.BIOLOGICALLYDERIVEDPRODUCT)
        return "BiologicallyDerivedProduct";
      if (code == ResourceTypeEnum.BODYSTRUCTURE)
        return "BodyStructure";
      if (code == ResourceTypeEnum.BUNDLE)
        return "Bundle";
      if (code == ResourceTypeEnum.CAPABILITYSTATEMENT)
        return "CapabilityStatement";
      if (code == ResourceTypeEnum.CAREPLAN)
        return "CarePlan";
      if (code == ResourceTypeEnum.CARETEAM)
        return "CareTeam";
      if (code == ResourceTypeEnum.CLAIM)
        return "Claim";
      if (code == ResourceTypeEnum.CLAIMRESPONSE)
        return "ClaimResponse";
      if (code == ResourceTypeEnum.CLINICALUSEDEFINITION)
        return "ClinicalUseDefinition";
      if (code == ResourceTypeEnum.CODESYSTEM)
        return "CodeSystem";
      if (code == ResourceTypeEnum.COMMUNICATION)
        return "Communication";
      if (code == ResourceTypeEnum.COMMUNICATIONREQUEST)
        return "CommunicationRequest";
      if (code == ResourceTypeEnum.COMPARTMENTDEFINITION)
        return "CompartmentDefinition";
      if (code == ResourceTypeEnum.COMPOSITION)
        return "Composition";
      if (code == ResourceTypeEnum.CONCEPTMAP)
        return "ConceptMap";
      if (code == ResourceTypeEnum.CONDITION)
        return "Condition";
      if (code == ResourceTypeEnum.CONSENT)
        return "Consent";
      if (code == ResourceTypeEnum.CONTRACT)
        return "Contract";
      if (code == ResourceTypeEnum.COVERAGE)
        return "Coverage";
      if (code == ResourceTypeEnum.COVERAGEELIGIBILITYREQUEST)
        return "CoverageEligibilityRequest";
      if (code == ResourceTypeEnum.COVERAGEELIGIBILITYRESPONSE)
        return "CoverageEligibilityResponse";
      if (code == ResourceTypeEnum.DETECTEDISSUE)
        return "DetectedIssue";
      if (code == ResourceTypeEnum.DEVICE)
        return "Device";
      if (code == ResourceTypeEnum.DEVICEALERT)
        return "DeviceAlert";
      if (code == ResourceTypeEnum.DEVICEASSOCIATION)
        return "DeviceAssociation";
      if (code == ResourceTypeEnum.DEVICEDEFINITION)
        return "DeviceDefinition";
      if (code == ResourceTypeEnum.DEVICEMETRIC)
        return "DeviceMetric";
      if (code == ResourceTypeEnum.DEVICEREQUEST)
        return "DeviceRequest";
      if (code == ResourceTypeEnum.DIAGNOSTICREPORT)
        return "DiagnosticReport";
      if (code == ResourceTypeEnum.DOCUMENTREFERENCE)
        return "DocumentReference";
      if (code == ResourceTypeEnum.ENCOUNTER)
        return "Encounter";
      if (code == ResourceTypeEnum.ENDPOINT)
        return "Endpoint";
      if (code == ResourceTypeEnum.ENROLLMENTREQUEST)
        return "EnrollmentRequest";
      if (code == ResourceTypeEnum.ENROLLMENTRESPONSE)
        return "EnrollmentResponse";
      if (code == ResourceTypeEnum.EPISODEOFCARE)
        return "EpisodeOfCare";
      if (code == ResourceTypeEnum.EVENTDEFINITION)
        return "EventDefinition";
      if (code == ResourceTypeEnum.EVIDENCE)
        return "Evidence";
      if (code == ResourceTypeEnum.EVIDENCEVARIABLE)
        return "EvidenceVariable";
      if (code == ResourceTypeEnum.EXAMPLESCENARIO)
        return "ExampleScenario";
      if (code == ResourceTypeEnum.EXPLANATIONOFBENEFIT)
        return "ExplanationOfBenefit";
      if (code == ResourceTypeEnum.FAMILYMEMBERHISTORY)
        return "FamilyMemberHistory";
      if (code == ResourceTypeEnum.FLAG)
        return "Flag";
      if (code == ResourceTypeEnum.GOAL)
        return "Goal";
      if (code == ResourceTypeEnum.GROUP)
        return "Group";
      if (code == ResourceTypeEnum.GUIDANCERESPONSE)
        return "GuidanceResponse";
      if (code == ResourceTypeEnum.HEALTHCARESERVICE)
        return "HealthcareService";
      if (code == ResourceTypeEnum.IMAGINGSELECTION)
        return "ImagingSelection";
      if (code == ResourceTypeEnum.IMAGINGSTUDY)
        return "ImagingStudy";
      if (code == ResourceTypeEnum.IMMUNIZATION)
        return "Immunization";
      if (code == ResourceTypeEnum.IMPLEMENTATIONGUIDE)
        return "ImplementationGuide";
      if (code == ResourceTypeEnum.INGREDIENT)
        return "Ingredient";
      if (code == ResourceTypeEnum.INSURANCEPLAN)
        return "InsurancePlan";
      if (code == ResourceTypeEnum.INSURANCEPRODUCT)
        return "InsuranceProduct";
      if (code == ResourceTypeEnum.INVOICE)
        return "Invoice";
      if (code == ResourceTypeEnum.LIBRARY)
        return "Library";
      if (code == ResourceTypeEnum.LIST)
        return "List";
      if (code == ResourceTypeEnum.LOCATION)
        return "Location";
      if (code == ResourceTypeEnum.MANUFACTUREDITEMDEFINITION)
        return "ManufacturedItemDefinition";
      if (code == ResourceTypeEnum.MEASURE)
        return "Measure";
      if (code == ResourceTypeEnum.MEASUREREPORT)
        return "MeasureReport";
      if (code == ResourceTypeEnum.MEDICATION)
        return "Medication";
      if (code == ResourceTypeEnum.MEDICATIONADMINISTRATION)
        return "MedicationAdministration";
      if (code == ResourceTypeEnum.MEDICATIONDISPENSE)
        return "MedicationDispense";
      if (code == ResourceTypeEnum.MEDICATIONREQUEST)
        return "MedicationRequest";
      if (code == ResourceTypeEnum.MEDICATIONSTATEMENT)
        return "MedicationStatement";
      if (code == ResourceTypeEnum.MEDICINALPRODUCTDEFINITION)
        return "MedicinalProductDefinition";
      if (code == ResourceTypeEnum.MESSAGEDEFINITION)
        return "MessageDefinition";
      if (code == ResourceTypeEnum.MESSAGEHEADER)
        return "MessageHeader";
      if (code == ResourceTypeEnum.NAMINGSYSTEM)
        return "NamingSystem";
      if (code == ResourceTypeEnum.NUTRITIONINTAKE)
        return "NutritionIntake";
      if (code == ResourceTypeEnum.NUTRITIONORDER)
        return "NutritionOrder";
      if (code == ResourceTypeEnum.NUTRITIONPRODUCT)
        return "NutritionProduct";
      if (code == ResourceTypeEnum.OBSERVATION)
        return "Observation";
      if (code == ResourceTypeEnum.OBSERVATIONDEFINITION)
        return "ObservationDefinition";
      if (code == ResourceTypeEnum.OPERATIONDEFINITION)
        return "OperationDefinition";
      if (code == ResourceTypeEnum.OPERATIONOUTCOME)
        return "OperationOutcome";
      if (code == ResourceTypeEnum.ORGANIZATION)
        return "Organization";
      if (code == ResourceTypeEnum.ORGANIZATIONAFFILIATION)
        return "OrganizationAffiliation";
      if (code == ResourceTypeEnum.PACKAGEDPRODUCTDEFINITION)
        return "PackagedProductDefinition";
      if (code == ResourceTypeEnum.PARAMETERS)
        return "Parameters";
      if (code == ResourceTypeEnum.PATIENT)
        return "Patient";
      if (code == ResourceTypeEnum.PAYMENTNOTICE)
        return "PaymentNotice";
      if (code == ResourceTypeEnum.PAYMENTRECONCILIATION)
        return "PaymentReconciliation";
      if (code == ResourceTypeEnum.PERSON)
        return "Person";
      if (code == ResourceTypeEnum.PLANDEFINITION)
        return "PlanDefinition";
      if (code == ResourceTypeEnum.PRACTITIONER)
        return "Practitioner";
      if (code == ResourceTypeEnum.PRACTITIONERROLE)
        return "PractitionerRole";
      if (code == ResourceTypeEnum.PROCEDURE)
        return "Procedure";
      if (code == ResourceTypeEnum.PROVENANCE)
        return "Provenance";
      if (code == ResourceTypeEnum.QUESTIONNAIRE)
        return "Questionnaire";
      if (code == ResourceTypeEnum.QUESTIONNAIRERESPONSE)
        return "QuestionnaireResponse";
      if (code == ResourceTypeEnum.REGULATEDAUTHORIZATION)
        return "RegulatedAuthorization";
      if (code == ResourceTypeEnum.RELATEDPERSON)
        return "RelatedPerson";
      if (code == ResourceTypeEnum.REQUESTORCHESTRATION)
        return "RequestOrchestration";
      if (code == ResourceTypeEnum.REQUIREMENTS)
        return "Requirements";
      if (code == ResourceTypeEnum.RESEARCHSTUDY)
        return "ResearchStudy";
      if (code == ResourceTypeEnum.RESEARCHSUBJECT)
        return "ResearchSubject";
      if (code == ResourceTypeEnum.RISKASSESSMENT)
        return "RiskAssessment";
      if (code == ResourceTypeEnum.SCHEDULE)
        return "Schedule";
      if (code == ResourceTypeEnum.SEARCHPARAMETER)
        return "SearchParameter";
      if (code == ResourceTypeEnum.SERVICEREQUEST)
        return "ServiceRequest";
      if (code == ResourceTypeEnum.SLOT)
        return "Slot";
      if (code == ResourceTypeEnum.SPECIMEN)
        return "Specimen";
      if (code == ResourceTypeEnum.SPECIMENDEFINITION)
        return "SpecimenDefinition";
      if (code == ResourceTypeEnum.STRUCTUREDEFINITION)
        return "StructureDefinition";
      if (code == ResourceTypeEnum.STRUCTUREMAP)
        return "StructureMap";
      if (code == ResourceTypeEnum.SUBSCRIPTION)
        return "Subscription";
      if (code == ResourceTypeEnum.SUBSCRIPTIONSTATUS)
        return "SubscriptionStatus";
      if (code == ResourceTypeEnum.SUBSCRIPTIONTOPIC)
        return "SubscriptionTopic";
      if (code == ResourceTypeEnum.SUBSTANCE)
        return "Substance";
      if (code == ResourceTypeEnum.SUBSTANCEDEFINITION)
        return "SubstanceDefinition";
      if (code == ResourceTypeEnum.TASK)
        return "Task";
      if (code == ResourceTypeEnum.TERMINOLOGYCAPABILITIES)
        return "TerminologyCapabilities";
      if (code == ResourceTypeEnum.VALUESET)
        return "ValueSet";
      if (code == ResourceTypeEnum.VISIONPRESCRIPTION)
        return "VisionPrescription";
      return "?";
      }
    public String toSystem(ResourceTypeEnum code) {
      return code.getSystem();
      }
    }

    public enum SearchComparator {
        /**
         * the value for the parameter in the resource is equal to the provided value.
         */
        EQ, 
        /**
         * the value for the parameter in the resource is not equal to the provided value.
         */
        NE, 
        /**
         * the value for the parameter in the resource is greater than the provided value.
         */
        GT, 
        /**
         * the value for the parameter in the resource is less than the provided value.
         */
        LT, 
        /**
         * the value for the parameter in the resource is greater or equal to the provided value.
         */
        GE, 
        /**
         * the value for the parameter in the resource is less or equal to the provided value.
         */
        LE, 
        /**
         * the value for the parameter in the resource starts after the provided value.
         */
        SA, 
        /**
         * the value for the parameter in the resource ends before the provided value.
         */
        EB, 
        /**
         * the value for the parameter in the resource is approximately the same to the provided value.
         */
        AP, 
        /**
         * added to help the parsers
         */
        NULL;
        public static SearchComparator fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("eq".equals(codeString))
          return EQ;
        if ("ne".equals(codeString))
          return NE;
        if ("gt".equals(codeString))
          return GT;
        if ("lt".equals(codeString))
          return LT;
        if ("ge".equals(codeString))
          return GE;
        if ("le".equals(codeString))
          return LE;
        if ("sa".equals(codeString))
          return SA;
        if ("eb".equals(codeString))
          return EB;
        if ("ap".equals(codeString))
          return AP;
        throw new FHIRException("Unknown SearchComparator code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "eq", "ne", "gt", "lt", "ge", "le", "sa", "eb", "ap");
        }
        public String toCode() {
          switch (this) {
            case EQ: return "eq";
            case NE: return "ne";
            case GT: return "gt";
            case LT: return "lt";
            case GE: return "ge";
            case LE: return "le";
            case SA: return "sa";
            case EB: return "eb";
            case AP: return "ap";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case EQ: return "http://hl7.org/fhir/search-comparator";
            case NE: return "http://hl7.org/fhir/search-comparator";
            case GT: return "http://hl7.org/fhir/search-comparator";
            case LT: return "http://hl7.org/fhir/search-comparator";
            case GE: return "http://hl7.org/fhir/search-comparator";
            case LE: return "http://hl7.org/fhir/search-comparator";
            case SA: return "http://hl7.org/fhir/search-comparator";
            case EB: return "http://hl7.org/fhir/search-comparator";
            case AP: return "http://hl7.org/fhir/search-comparator";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case EQ: return "the value for the parameter in the resource is equal to the provided value.";
            case NE: return "the value for the parameter in the resource is not equal to the provided value.";
            case GT: return "the value for the parameter in the resource is greater than the provided value.";
            case LT: return "the value for the parameter in the resource is less than the provided value.";
            case GE: return "the value for the parameter in the resource is greater or equal to the provided value.";
            case LE: return "the value for the parameter in the resource is less or equal to the provided value.";
            case SA: return "the value for the parameter in the resource starts after the provided value.";
            case EB: return "the value for the parameter in the resource ends before the provided value.";
            case AP: return "the value for the parameter in the resource is approximately the same to the provided value.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case EQ: return "Equals";
            case NE: return "Not Equals";
            case GT: return "Greater Than";
            case LT: return "Less Than";
            case GE: return "Greater or Equals";
            case LE: return "Less of Equal";
            case SA: return "Starts After";
            case EB: return "Ends Before";
            case AP: return "Approximately";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class SearchComparatorEnumFactory implements EnumFactory<SearchComparator> {
    public SearchComparator fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("eq".equals(codeString))
          return SearchComparator.EQ;
        if ("ne".equals(codeString))
          return SearchComparator.NE;
        if ("gt".equals(codeString))
          return SearchComparator.GT;
        if ("lt".equals(codeString))
          return SearchComparator.LT;
        if ("ge".equals(codeString))
          return SearchComparator.GE;
        if ("le".equals(codeString))
          return SearchComparator.LE;
        if ("sa".equals(codeString))
          return SearchComparator.SA;
        if ("eb".equals(codeString))
          return SearchComparator.EB;
        if ("ap".equals(codeString))
          return SearchComparator.AP;
        throw new IllegalArgumentException("Unknown SearchComparator code '"+codeString+"'");
        }

        public Enumeration<SearchComparator> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<SearchComparator>(this, SearchComparator.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<SearchComparator>(this, SearchComparator.NULL, code);
        if ("eq".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.EQ, code);
        if ("ne".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.NE, code);
        if ("gt".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.GT, code);
        if ("lt".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.LT, code);
        if ("ge".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.GE, code);
        if ("le".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.LE, code);
        if ("sa".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.SA, code);
        if ("eb".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.EB, code);
        if ("ap".equals(codeString))
          return new Enumeration<SearchComparator>(this, SearchComparator.AP, code);
        throw new FHIRException("Unknown SearchComparator code '"+codeString+"'");
        }
    public String toCode(SearchComparator code) {
      if (code == SearchComparator.EQ)
        return "eq";
      if (code == SearchComparator.NE)
        return "ne";
      if (code == SearchComparator.GT)
        return "gt";
      if (code == SearchComparator.LT)
        return "lt";
      if (code == SearchComparator.GE)
        return "ge";
      if (code == SearchComparator.LE)
        return "le";
      if (code == SearchComparator.SA)
        return "sa";
      if (code == SearchComparator.EB)
        return "eb";
      if (code == SearchComparator.AP)
        return "ap";
      return "?";
      }
    public String toSystem(SearchComparator code) {
      return code.getSystem();
      }
    }

    public enum SearchModifierCode {
        /**
         * The search parameter returns resources that have a value or not.
         */
        MISSING, 
        /**
         * The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).
         */
        EXACT, 
        /**
         * The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.
         */
        CONTAINS, 
        /**
         * The search parameter returns resources that do not contain a match.
         */
        NOT, 
        /**
         * The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, Identifier.type.text, or Reference.display.
         */
        TEXT, 
        /**
         * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.
         */
        IN, 
        /**
         * The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.
         */
        NOTIN, 
        /**
         * The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).
         */
        BELOW, 
        /**
         * The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).
         */
        ABOVE, 
        /**
         * The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).
         */
        TYPE, 
        /**
         * The search parameter applies to the identifier on the resource, not the reference.
         */
        IDENTIFIER, 
        /**
         * The search parameter has the format system|code|value, where the system and code refer to an Identifier.type.coding.system and .code, and match if any of the type codes match. All 3 parts must be present.
         */
        OFTYPE, 
        /**
         * Tests whether the textual display value in a resource (e.g., CodeableConcept.text, Coding.display, or Reference.display) matches the supplied parameter value.
         */
        CODETEXT, 
        /**
         * Tests whether the value in a resource matches the supplied parameter value using advanced text handling that searches text associated with the code/value - e.g., CodeableConcept.text, Coding.display, or Identifier.type.text.
         */
        TEXTADVANCED, 
        /**
         * The search parameter indicates an inclusion directive (_include, _revinclude) that is applied to an included resource instead of the matching resource.
         */
        ITERATE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static SearchModifierCode fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("missing".equals(codeString))
          return MISSING;
        if ("exact".equals(codeString))
          return EXACT;
        if ("contains".equals(codeString))
          return CONTAINS;
        if ("not".equals(codeString))
          return NOT;
        if ("text".equals(codeString))
          return TEXT;
        if ("in".equals(codeString))
          return IN;
        if ("not-in".equals(codeString))
          return NOTIN;
        if ("below".equals(codeString))
          return BELOW;
        if ("above".equals(codeString))
          return ABOVE;
        if ("type".equals(codeString))
          return TYPE;
        if ("identifier".equals(codeString))
          return IDENTIFIER;
        if ("of-type".equals(codeString))
          return OFTYPE;
        if ("code-text".equals(codeString))
          return CODETEXT;
        if ("text-advanced".equals(codeString))
          return TEXTADVANCED;
        if ("iterate".equals(codeString))
          return ITERATE;
        throw new FHIRException("Unknown SearchModifierCode code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "missing", "exact", "contains", "not", "text", "in", "not-in", "below", "above", "type", "identifier", "of-type", "code-text", "text-advanced", "iterate");
        }
        public String toCode() {
          switch (this) {
            case MISSING: return "missing";
            case EXACT: return "exact";
            case CONTAINS: return "contains";
            case NOT: return "not";
            case TEXT: return "text";
            case IN: return "in";
            case NOTIN: return "not-in";
            case BELOW: return "below";
            case ABOVE: return "above";
            case TYPE: return "type";
            case IDENTIFIER: return "identifier";
            case OFTYPE: return "of-type";
            case CODETEXT: return "code-text";
            case TEXTADVANCED: return "text-advanced";
            case ITERATE: return "iterate";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MISSING: return "http://hl7.org/fhir/search-modifier-code";
            case EXACT: return "http://hl7.org/fhir/search-modifier-code";
            case CONTAINS: return "http://hl7.org/fhir/search-modifier-code";
            case NOT: return "http://hl7.org/fhir/search-modifier-code";
            case TEXT: return "http://hl7.org/fhir/search-modifier-code";
            case IN: return "http://hl7.org/fhir/search-modifier-code";
            case NOTIN: return "http://hl7.org/fhir/search-modifier-code";
            case BELOW: return "http://hl7.org/fhir/search-modifier-code";
            case ABOVE: return "http://hl7.org/fhir/search-modifier-code";
            case TYPE: return "http://hl7.org/fhir/search-modifier-code";
            case IDENTIFIER: return "http://hl7.org/fhir/search-modifier-code";
            case OFTYPE: return "http://hl7.org/fhir/search-modifier-code";
            case CODETEXT: return "http://hl7.org/fhir/search-modifier-code";
            case TEXTADVANCED: return "http://hl7.org/fhir/search-modifier-code";
            case ITERATE: return "http://hl7.org/fhir/search-modifier-code";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MISSING: return "The search parameter returns resources that have a value or not.";
            case EXACT: return "The search parameter returns resources that have a value that exactly matches the supplied parameter (the whole string, including casing and accents).";
            case CONTAINS: return "The search parameter returns resources that include the supplied parameter value anywhere within the field being searched.";
            case NOT: return "The search parameter returns resources that do not contain a match.";
            case TEXT: return "The search parameter is processed as a string that searches text associated with the code/value - either CodeableConcept.text, Coding.display, Identifier.type.text, or Reference.display.";
            case IN: return "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is in the specified value set.";
            case NOTIN: return "The search parameter is a URI (relative or absolute) that identifies a value set, and the search parameter tests whether the coding is not in the specified value set.";
            case BELOW: return "The search parameter tests whether the value in a resource is subsumed by the specified value (is-a, or hierarchical relationships).";
            case ABOVE: return "The search parameter tests whether the value in a resource subsumes the specified value (is-a, or hierarchical relationships).";
            case TYPE: return "The search parameter only applies to the Resource Type specified as a modifier (e.g. the modifier is not actually :type, but :Patient etc.).";
            case IDENTIFIER: return "The search parameter applies to the identifier on the resource, not the reference.";
            case OFTYPE: return "The search parameter has the format system|code|value, where the system and code refer to an Identifier.type.coding.system and .code, and match if any of the type codes match. All 3 parts must be present.";
            case CODETEXT: return "Tests whether the textual display value in a resource (e.g., CodeableConcept.text, Coding.display, or Reference.display) matches the supplied parameter value.";
            case TEXTADVANCED: return "Tests whether the value in a resource matches the supplied parameter value using advanced text handling that searches text associated with the code/value - e.g., CodeableConcept.text, Coding.display, or Identifier.type.text.";
            case ITERATE: return "The search parameter indicates an inclusion directive (_include, _revinclude) that is applied to an included resource instead of the matching resource.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MISSING: return "Missing";
            case EXACT: return "Exact";
            case CONTAINS: return "Contains";
            case NOT: return "Not";
            case TEXT: return "Text";
            case IN: return "In";
            case NOTIN: return "Not In";
            case BELOW: return "Below";
            case ABOVE: return "Above";
            case TYPE: return "Type";
            case IDENTIFIER: return "Identifier";
            case OFTYPE: return "Of Type";
            case CODETEXT: return "Code Text";
            case TEXTADVANCED: return "Text Advanced";
            case ITERATE: return "Iterate";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class SearchModifierCodeEnumFactory implements EnumFactory<SearchModifierCode> {
    public SearchModifierCode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("missing".equals(codeString))
          return SearchModifierCode.MISSING;
        if ("exact".equals(codeString))
          return SearchModifierCode.EXACT;
        if ("contains".equals(codeString))
          return SearchModifierCode.CONTAINS;
        if ("not".equals(codeString))
          return SearchModifierCode.NOT;
        if ("text".equals(codeString))
          return SearchModifierCode.TEXT;
        if ("in".equals(codeString))
          return SearchModifierCode.IN;
        if ("not-in".equals(codeString))
          return SearchModifierCode.NOTIN;
        if ("below".equals(codeString))
          return SearchModifierCode.BELOW;
        if ("above".equals(codeString))
          return SearchModifierCode.ABOVE;
        if ("type".equals(codeString))
          return SearchModifierCode.TYPE;
        if ("identifier".equals(codeString))
          return SearchModifierCode.IDENTIFIER;
        if ("of-type".equals(codeString))
          return SearchModifierCode.OFTYPE;
        if ("code-text".equals(codeString))
          return SearchModifierCode.CODETEXT;
        if ("text-advanced".equals(codeString))
          return SearchModifierCode.TEXTADVANCED;
        if ("iterate".equals(codeString))
          return SearchModifierCode.ITERATE;
        throw new IllegalArgumentException("Unknown SearchModifierCode code '"+codeString+"'");
        }

        public Enumeration<SearchModifierCode> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<SearchModifierCode>(this, SearchModifierCode.NULL, code);
        if ("missing".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.MISSING, code);
        if ("exact".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.EXACT, code);
        if ("contains".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.CONTAINS, code);
        if ("not".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.NOT, code);
        if ("text".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.TEXT, code);
        if ("in".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.IN, code);
        if ("not-in".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.NOTIN, code);
        if ("below".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.BELOW, code);
        if ("above".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.ABOVE, code);
        if ("type".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.TYPE, code);
        if ("identifier".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.IDENTIFIER, code);
        if ("of-type".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.OFTYPE, code);
        if ("code-text".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.CODETEXT, code);
        if ("text-advanced".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.TEXTADVANCED, code);
        if ("iterate".equals(codeString))
          return new Enumeration<SearchModifierCode>(this, SearchModifierCode.ITERATE, code);
        throw new FHIRException("Unknown SearchModifierCode code '"+codeString+"'");
        }
    public String toCode(SearchModifierCode code) {
      if (code == SearchModifierCode.MISSING)
        return "missing";
      if (code == SearchModifierCode.EXACT)
        return "exact";
      if (code == SearchModifierCode.CONTAINS)
        return "contains";
      if (code == SearchModifierCode.NOT)
        return "not";
      if (code == SearchModifierCode.TEXT)
        return "text";
      if (code == SearchModifierCode.IN)
        return "in";
      if (code == SearchModifierCode.NOTIN)
        return "not-in";
      if (code == SearchModifierCode.BELOW)
        return "below";
      if (code == SearchModifierCode.ABOVE)
        return "above";
      if (code == SearchModifierCode.TYPE)
        return "type";
      if (code == SearchModifierCode.IDENTIFIER)
        return "identifier";
      if (code == SearchModifierCode.OFTYPE)
        return "of-type";
      if (code == SearchModifierCode.CODETEXT)
        return "code-text";
      if (code == SearchModifierCode.TEXTADVANCED)
        return "text-advanced";
      if (code == SearchModifierCode.ITERATE)
        return "iterate";
      return "?";
      }
    public String toSystem(SearchModifierCode code) {
      return code.getSystem();
      }
    }

    public enum SearchParamType {
        /**
         * Search parameter SHALL be a number (a whole number, or a decimal).
         */
        NUMBER, 
        /**
         * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
         */
        DATE, 
        /**
         * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
         */
        STRING, 
        /**
         * Search parameter on a coded element or identifier. May be used to search through the text, display, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
         */
        TOKEN, 
        /**
         * A reference to another resource (Reference or canonical).
         */
        REFERENCE, 
        /**
         * A composite search parameter that combines a search on two values together.
         */
        COMPOSITE, 
        /**
         * A search parameter that searches on a quantity.
         */
        QUANTITY, 
        /**
         * A search parameter that searches on a URI (RFC 3986).
         */
        URI, 
        /**
         * Special logic applies to this parameter per the description of the search parameter.
         */
        SPECIAL, 
        /**
         * A search parameter defined to chain through into embedded resources.
         */
        RESOURCE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static SearchParamType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("number".equals(codeString))
          return NUMBER;
        if ("date".equals(codeString))
          return DATE;
        if ("string".equals(codeString))
          return STRING;
        if ("token".equals(codeString))
          return TOKEN;
        if ("reference".equals(codeString))
          return REFERENCE;
        if ("composite".equals(codeString))
          return COMPOSITE;
        if ("quantity".equals(codeString))
          return QUANTITY;
        if ("uri".equals(codeString))
          return URI;
        if ("special".equals(codeString))
          return SPECIAL;
        if ("resource".equals(codeString))
          return RESOURCE;
        throw new FHIRException("Unknown SearchParamType code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "number", "date", "string", "token", "reference", "composite", "quantity", "uri", "special", "resource");
        }
        public String toCode() {
          switch (this) {
            case NUMBER: return "number";
            case DATE: return "date";
            case STRING: return "string";
            case TOKEN: return "token";
            case REFERENCE: return "reference";
            case COMPOSITE: return "composite";
            case QUANTITY: return "quantity";
            case URI: return "uri";
            case SPECIAL: return "special";
            case RESOURCE: return "resource";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NUMBER: return "http://hl7.org/fhir/search-param-type";
            case DATE: return "http://hl7.org/fhir/search-param-type";
            case STRING: return "http://hl7.org/fhir/search-param-type";
            case TOKEN: return "http://hl7.org/fhir/search-param-type";
            case REFERENCE: return "http://hl7.org/fhir/search-param-type";
            case COMPOSITE: return "http://hl7.org/fhir/search-param-type";
            case QUANTITY: return "http://hl7.org/fhir/search-param-type";
            case URI: return "http://hl7.org/fhir/search-param-type";
            case SPECIAL: return "http://hl7.org/fhir/search-param-type";
            case RESOURCE: return "http://hl7.org/fhir/search-param-type";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NUMBER: return "Search parameter SHALL be a number (a whole number, or a decimal).";
            case DATE: return "Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.";
            case STRING: return "Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.";
            case TOKEN: return "Search parameter on a coded element or identifier. May be used to search through the text, display, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a \"|\", depending on the modifier used.";
            case REFERENCE: return "A reference to another resource (Reference or canonical).";
            case COMPOSITE: return "A composite search parameter that combines a search on two values together.";
            case QUANTITY: return "A search parameter that searches on a quantity.";
            case URI: return "A search parameter that searches on a URI (RFC 3986).";
            case SPECIAL: return "Special logic applies to this parameter per the description of the search parameter.";
            case RESOURCE: return "A search parameter defined to chain through into embedded resources.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NUMBER: return "Number";
            case DATE: return "Date/DateTime";
            case STRING: return "String";
            case TOKEN: return "Token";
            case REFERENCE: return "Reference";
            case COMPOSITE: return "Composite";
            case QUANTITY: return "Quantity";
            case URI: return "URI";
            case SPECIAL: return "Special";
            case RESOURCE: return "Resource";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class SearchParamTypeEnumFactory implements EnumFactory<SearchParamType> {
    public SearchParamType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("number".equals(codeString))
          return SearchParamType.NUMBER;
        if ("date".equals(codeString))
          return SearchParamType.DATE;
        if ("string".equals(codeString))
          return SearchParamType.STRING;
        if ("token".equals(codeString))
          return SearchParamType.TOKEN;
        if ("reference".equals(codeString))
          return SearchParamType.REFERENCE;
        if ("composite".equals(codeString))
          return SearchParamType.COMPOSITE;
        if ("quantity".equals(codeString))
          return SearchParamType.QUANTITY;
        if ("uri".equals(codeString))
          return SearchParamType.URI;
        if ("special".equals(codeString))
          return SearchParamType.SPECIAL;
        if ("resource".equals(codeString))
          return SearchParamType.RESOURCE;
        throw new IllegalArgumentException("Unknown SearchParamType code '"+codeString+"'");
        }

        public Enumeration<SearchParamType> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<SearchParamType>(this, SearchParamType.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<SearchParamType>(this, SearchParamType.NULL, code);
        if ("number".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.NUMBER, code);
        if ("date".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.DATE, code);
        if ("string".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.STRING, code);
        if ("token".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.TOKEN, code);
        if ("reference".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.REFERENCE, code);
        if ("composite".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.COMPOSITE, code);
        if ("quantity".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.QUANTITY, code);
        if ("uri".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.URI, code);
        if ("special".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.SPECIAL, code);
        if ("resource".equals(codeString))
          return new Enumeration<SearchParamType>(this, SearchParamType.RESOURCE, code);
        throw new FHIRException("Unknown SearchParamType code '"+codeString+"'");
        }
    public String toCode(SearchParamType code) {
      if (code == SearchParamType.NUMBER)
        return "number";
      if (code == SearchParamType.DATE)
        return "date";
      if (code == SearchParamType.STRING)
        return "string";
      if (code == SearchParamType.TOKEN)
        return "token";
      if (code == SearchParamType.REFERENCE)
        return "reference";
      if (code == SearchParamType.COMPOSITE)
        return "composite";
      if (code == SearchParamType.QUANTITY)
        return "quantity";
      if (code == SearchParamType.URI)
        return "uri";
      if (code == SearchParamType.SPECIAL)
        return "special";
      if (code == SearchParamType.RESOURCE)
        return "resource";
      return "?";
      }
    public String toSystem(SearchParamType code) {
      return code.getSystem();
      }
    }

    public enum SubscriptionStatusCodes {
        /**
         * The client has requested the subscription, and the server has not yet set it up.
         */
        REQUESTED, 
        /**
         * The subscription is active.
         */
        ACTIVE, 
        /**
         * The server has an error executing the notification.
         */
        ERROR, 
        /**
         * Too many errors have occurred or the subscription has expired.
         */
        OFF, 
        /**
         * This subscription has been flagged as incorrect.
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers
         */
        NULL;
        public static SubscriptionStatusCodes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("requested".equals(codeString))
          return REQUESTED;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("error".equals(codeString))
          return ERROR;
        if ("off".equals(codeString))
          return OFF;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        throw new FHIRException("Unknown SubscriptionStatusCodes code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "requested", "active", "error", "off", "entered-in-error");
        }
        public String toCode() {
          switch (this) {
            case REQUESTED: return "requested";
            case ACTIVE: return "active";
            case ERROR: return "error";
            case OFF: return "off";
            case ENTEREDINERROR: return "entered-in-error";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case REQUESTED: return "http://hl7.org/fhir/subscription-status";
            case ACTIVE: return "http://hl7.org/fhir/subscription-status";
            case ERROR: return "http://hl7.org/fhir/subscription-status";
            case OFF: return "http://hl7.org/fhir/subscription-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/subscription-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case REQUESTED: return "The client has requested the subscription, and the server has not yet set it up.";
            case ACTIVE: return "The subscription is active.";
            case ERROR: return "The server has an error executing the notification.";
            case OFF: return "Too many errors have occurred or the subscription has expired.";
            case ENTEREDINERROR: return "This subscription has been flagged as incorrect.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case REQUESTED: return "Requested";
            case ACTIVE: return "Active";
            case ERROR: return "Error";
            case OFF: return "Off";
            case ENTEREDINERROR: return "Entered in Error";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class SubscriptionStatusCodesEnumFactory implements EnumFactory<SubscriptionStatusCodes> {
    public SubscriptionStatusCodes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("requested".equals(codeString))
          return SubscriptionStatusCodes.REQUESTED;
        if ("active".equals(codeString))
          return SubscriptionStatusCodes.ACTIVE;
        if ("error".equals(codeString))
          return SubscriptionStatusCodes.ERROR;
        if ("off".equals(codeString))
          return SubscriptionStatusCodes.OFF;
        if ("entered-in-error".equals(codeString))
          return SubscriptionStatusCodes.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown SubscriptionStatusCodes code '"+codeString+"'");
        }

        public Enumeration<SubscriptionStatusCodes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.NULL, code);
        if ("requested".equals(codeString))
          return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.REQUESTED, code);
        if ("active".equals(codeString))
          return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.ACTIVE, code);
        if ("error".equals(codeString))
          return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.ERROR, code);
        if ("off".equals(codeString))
          return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.OFF, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<SubscriptionStatusCodes>(this, SubscriptionStatusCodes.ENTEREDINERROR, code);
        throw new FHIRException("Unknown SubscriptionStatusCodes code '"+codeString+"'");
        }
    public String toCode(SubscriptionStatusCodes code) {
      if (code == SubscriptionStatusCodes.REQUESTED)
        return "requested";
      if (code == SubscriptionStatusCodes.ACTIVE)
        return "active";
      if (code == SubscriptionStatusCodes.ERROR)
        return "error";
      if (code == SubscriptionStatusCodes.OFF)
        return "off";
      if (code == SubscriptionStatusCodes.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    public String toSystem(SubscriptionStatusCodes code) {
      return code.getSystem();
      }
    }

    public enum Use {
        /**
         * The treatment is complete and this represents a Claim for the services.
         */
        CLAIM, 
        /**
         * The treatment is proposed and this represents a Pre-authorization for the services.
         */
        PREAUTHORIZATION, 
        /**
         * The treatment is proposed and this represents a Pre-determination for the services.
         */
        PREDETERMINATION, 
        /**
         * added to help the parsers
         */
        NULL;
        public static Use fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("claim".equals(codeString))
          return CLAIM;
        if ("preauthorization".equals(codeString))
          return PREAUTHORIZATION;
        if ("predetermination".equals(codeString))
          return PREDETERMINATION;
        throw new FHIRException("Unknown Use code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "claim", "preauthorization", "predetermination");
        }
        public String toCode() {
          switch (this) {
            case CLAIM: return "claim";
            case PREAUTHORIZATION: return "preauthorization";
            case PREDETERMINATION: return "predetermination";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case CLAIM: return "http://hl7.org/fhir/claim-use";
            case PREAUTHORIZATION: return "http://hl7.org/fhir/claim-use";
            case PREDETERMINATION: return "http://hl7.org/fhir/claim-use";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case CLAIM: return "The treatment is complete and this represents a Claim for the services.";
            case PREAUTHORIZATION: return "The treatment is proposed and this represents a Pre-authorization for the services.";
            case PREDETERMINATION: return "The treatment is proposed and this represents a Pre-determination for the services.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case CLAIM: return "Claim";
            case PREAUTHORIZATION: return "Preauthorization";
            case PREDETERMINATION: return "Predetermination";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class UseEnumFactory implements EnumFactory<Use> {
    public Use fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("claim".equals(codeString))
          return Use.CLAIM;
        if ("preauthorization".equals(codeString))
          return Use.PREAUTHORIZATION;
        if ("predetermination".equals(codeString))
          return Use.PREDETERMINATION;
        throw new IllegalArgumentException("Unknown Use code '"+codeString+"'");
        }

        public Enumeration<Use> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<Use>(this, Use.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<Use>(this, Use.NULL, code);
        if ("claim".equals(codeString))
          return new Enumeration<Use>(this, Use.CLAIM, code);
        if ("preauthorization".equals(codeString))
          return new Enumeration<Use>(this, Use.PREAUTHORIZATION, code);
        if ("predetermination".equals(codeString))
          return new Enumeration<Use>(this, Use.PREDETERMINATION, code);
        throw new FHIRException("Unknown Use code '"+codeString+"'");
        }
    public String toCode(Use code) {
      if (code == Use.CLAIM)
        return "claim";
      if (code == Use.PREAUTHORIZATION)
        return "preauthorization";
      if (code == Use.PREDETERMINATION)
        return "predetermination";
      return "?";
      }
    public String toSystem(Use code) {
      return code.getSystem();
      }
    }

    public enum VersionIndependentResourceTypesAll {
        /**
         * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
         */
        ACCOUNT, 
        /**
         * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
         */
        ACTIVITYDEFINITION, 
        /**
         * The ActorDefinition resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.
         */
        ACTORDEFINITION, 
        /**
         * A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).
         */
        ADMINISTRABLEPRODUCTDEFINITION, 
        /**
         * An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management.  Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers.  Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.
         */
        ADVERSEEVENT, 
        /**
         * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
         */
        ALLERGYINTOLERANCE, 
        /**
         * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
         */
        APPOINTMENT, 
        /**
         * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
         */
        APPOINTMENTRESPONSE, 
        /**
         * This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.
         */
        ARTIFACTASSESSMENT, 
        /**
         * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
         */
        AUDITEVENT, 
        /**
         * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
         */
        BASIC, 
        /**
         * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
         */
        BINARY, 
        /**
         * A biological material originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.
         */
        BIOLOGICALLYDERIVEDPRODUCT, 
        /**
         * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
         */
        BODYSTRUCTURE, 
        /**
         * A container for a collection of resources.
         */
        BUNDLE, 
        /**
         * Common Interface declaration for conformance and knowledge artifact resources.
         */
        CANONICALRESOURCE, 
        /**
         * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
         */
        CAPABILITYSTATEMENT, 
        /**
         * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
         */
        CAREPLAN, 
        /**
         * The Care Team includes all the people, organizations, and care teams who participate or plan to participate in the coordination and delivery of care.
         */
        CARETEAM, 
        /**
         * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
         */
        CLAIM, 
        /**
         * This resource provides the adjudication details from the processing of a Claim resource.
         */
        CLAIMRESPONSE, 
        /**
         * A single issue - either an indication, contraindication, interaction, undesirable effect or warning for a medicinal product, medication, device or procedure.
         */
        CLINICALUSEDEFINITION, 
        /**
         * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
         */
        CODESYSTEM, 
        /**
         * A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.
         */
        COMMUNICATION, 
        /**
         * A request to convey information from a sender to a recipient.
         */
        COMMUNICATIONREQUEST, 
        /**
         * A compartment definition that defines how resources are accessed on a server.
         */
        COMPARTMENTDEFINITION, 
        /**
         * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and has traceability to the author who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
         */
        COMPOSITION, 
        /**
         * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
         */
        CONCEPTMAP, 
        /**
         * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
         */
        CONDITION, 
        /**
         * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
         */
        CONSENT, 
        /**
         * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
         */
        CONTRACT, 
        /**
         * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
         */
        COVERAGE, 
        /**
         * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
         */
        COVERAGEELIGIBILITYREQUEST, 
        /**
         * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
         */
        COVERAGEELIGIBILITYRESPONSE, 
        /**
         * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.
         */
        DETECTEDISSUE, 
        /**
         * This resource describes the properties (regulated, has real time clock, etc.), administrative (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement, blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a given module, for example the serial number, manufacturer name, and model number). An actual unit may consist of several modules in a distinct hierarchy and these are represented by multiple Device resources and bound through the 'parent' element.
         */
        DEVICE, 
        /**
         * Describes a physiological or technical alert condition report originated by a device.  The DeviceAlert resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable. 
         */
        DEVICEALERT, 
        /**
         * A record of association of a device.
         */
        DEVICEASSOCIATION, 
        /**
         * This is a specialized resource that defines the characteristics and capabilities of a device.
         */
        DEVICEDEFINITION, 
        /**
         * Describes a measurement, calculation or setting capability of a device. The DeviceMetric resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable.
         */
        DEVICEMETRIC, 
        /**
         * Represents a request a device to be provided to a specific patient. The device may be an implantable device to be subsequently implanted, or an external assistive device, such as a walker, to be delivered and subsequently be used.
         */
        DEVICEREQUEST, 
        /**
         * The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.
         */
        DIAGNOSTICREPORT, 
        /**
         * A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this “document” encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.
         */
        DOCUMENTREFERENCE, 
        /**
         * A resource that includes narrative, extensions, and contained resources.
         */
        DOMAINRESOURCE, 
        /**
         * An interaction between healthcare provider(s), and/or patient(s) for the purpose of providing healthcare service(s) or assessing the health status of patient(s).
         */
        ENCOUNTER, 
        /**
         * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.
         */
        ENDPOINT, 
        /**
         * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
         */
        ENROLLMENTREQUEST, 
        /**
         * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
         */
        ENROLLMENTRESPONSE, 
        /**
         * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
         */
        EPISODEOFCARE, 
        /**
         * The EventDefinition resource provides a reusable description of when a particular event can occur.
         */
        EVENTDEFINITION, 
        /**
         * The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.
         */
        EVIDENCE, 
        /**
         * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
         */
        EVIDENCEVARIABLE, 
        /**
         * A walkthrough of a workflow showing the interaction between systems and the instances shared, possibly including the evolution of instances over time.
         */
        EXAMPLESCENARIO, 
        /**
         * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
         */
        EXPLANATIONOFBENEFIT, 
        /**
         * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
         */
        FAMILYMEMBERHISTORY, 
        /**
         * Prospective warnings of potential issues when providing care to the patient.
         */
        FLAG, 
        /**
         * Describes the intended objective(s) for a patient, group, or organizational care.  Examples include a patient's weight loss, restoration of an activity of daily living for a patient, obtaining herd immunity via immunization for a group, meeting a process improvement objective for an organization, etc.
         */
        GOAL, 
        /**
         * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not typically expected to act collectively*. These collections are also not typically formally or legally recognized.\r\n\r\n*NOTE: Group may be used to define families or households, which in some circumstances may act collectively or have a degree of legal or formal recognition. This should be considered an exception. When Group is used for types of entities other than Patient or RelatedPerson, the expectation remains that the Group will not act collectively or have formal recognition - use Organization if these behaviors are needed. See more discussion [below](group.html#group-usage)
         */
        GROUP, 
        /**
         * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
         */
        GUIDANCERESPONSE, 
        /**
         * The details of a healthcare service available at a location or in a catalog.  In the case where there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be represented using a set of linked HealthcareServices.
         */
        HEALTHCARESERVICE, 
        /**
         * A selection of DICOM SOP instances within a single Study and Series. This might include additional specifics such as a set of frames or an image region, allowing linkage to an Observation Resource.
         */
        IMAGINGSELECTION, 
        /**
         * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of images or other data objects (called Service-Object Pair Instances or SOP Instances) acquired or produced in a common context.
         */
        IMAGINGSTUDY, 
        /**
         * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
         */
        IMMUNIZATION, 
        /**
         * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
         */
        IMPLEMENTATIONGUIDE, 
        /**
         * An ingredient of a manufactured item or pharmaceutical product.
         */
        INGREDIENT, 
        /**
         * Details of a Health Insurance plan provided by an organization under an InsuranceProduct.
         */
        INSURANCEPLAN, 
        /**
         * Details of a Health Insurance product provided by an organization.
         */
        INSURANCEPRODUCT, 
        /**
         * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
         */
        INVOICE, 
        /**
         * The Library resource is a general-purpose container for knowledge artifact definitions. It can be used to describe and expose existing knowledge artifacts such as logic libraries and information model descriptions, as well as to describe a collection of knowledge artifacts.
         */
        LIBRARY, 
        /**
         * A List is a curated collection of resources, for things such as problem lists, allergy lists, facility list, organization list, etc.
         */
        LIST, 
        /**
         * Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.
         */
        LOCATION, 
        /**
         * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.
         */
        MANUFACTUREDITEMDEFINITION, 
        /**
         * The Measure resource provides the definition of a quality measure.
         */
        MEASURE, 
        /**
         * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
         */
        MEASUREREPORT, 
        /**
         * This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
         */
        MEDICATION, 
        /**
         * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner. This event can also be used to record waste using a status of not-done and the appropriate statusReason.
         */
        MEDICATIONADMINISTRATION, 
        /**
         * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
         */
        MEDICATIONDISPENSE, 
        /**
         * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
         */
        MEDICATIONREQUEST, 
        /**
         * A record of a medication consumed by a patient.  A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future. The source of this information can be the patient, patient representative (e.g., spouse, significant other, family member, caregiver), or a clinician. A common scenario where this information is captured is during the history taking process during a patient encounter or stay. The medication information may come from sources such as the patient's memory, from a prescription bottle, or from a list of medications the patient, clinician or other party maintains. The primary difference between a MedicationStatement and a MedicationAdministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication. A MedicationStatement is often, if not always, less specific. There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise. As stated earlier, the MedicationStatement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party. MedicationAdministration is more formal and is not missing detailed information.
         */
        MEDICATIONSTATEMENT, 
        /**
         * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).
         */
        MEDICINALPRODUCTDEFINITION, 
        /**
         * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
         */
        MESSAGEDEFINITION, 
        /**
         * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
         */
        MESSAGEHEADER, 
        /**
         * Common Interface declaration for conformance and knowledge artifact resources.
         */
        METADATARESOURCE, 
        /**
         * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
         */
        NAMINGSYSTEM, 
        /**
         * A record of intake by a patient.  A NutritionIntake may indicate that the patient may be consuming the food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula now or has consumed it in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label, or from a clinician documenting observed intake.
         */
        NUTRITIONINTAKE, 
        /**
         * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to an individual or group.
         */
        NUTRITIONORDER, 
        /**
         * A food or supplement that is consumed by patients.
         */
        NUTRITIONPRODUCT, 
        /**
         * Measurements and simple assertions made about a patient, device or other subject.
         */
        OBSERVATION, 
        /**
         * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
         */
        OBSERVATIONDEFINITION, 
        /**
         * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
         */
        OPERATIONDEFINITION, 
        /**
         * A collection of error, warning, or information messages that result from a system action.
         */
        OPERATIONOUTCOME, 
        /**
         * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.
         */
        ORGANIZATION, 
        /**
         * Defines an affiliation/assotiation/relationship between 2 distinct organizations, that is not a part-of relationship/sub-division relationship.
         */
        ORGANIZATIONAFFILIATION, 
        /**
         * A medically related item or items, in a container or package.
         */
        PACKAGEDPRODUCTDEFINITION, 
        /**
         * This resource is used to pass information into and back from an operation (whether invoked directly from REST or within a messaging environment).  It is not persisted or allowed to be referenced by other resources except as described in the definition of the Parameters resource.
         */
        PARAMETERS, 
        /**
         * Demographics and other administrative information about an individual or animal that is the subject of potential, past, current, or future health-related care, services, or processes.
         */
        PATIENT, 
        /**
         * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
         */
        PAYMENTNOTICE, 
        /**
         * This resource provides the details including amount of a payment and allocates the payment items being paid.
         */
        PAYMENTRECONCILIATION, 
        /**
         * Demographics and administrative information about a person independent of a specific health-related context.
         */
        PERSON, 
        /**
         * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, drug quality specifications, and drug manufacturing process.
         */
        PLANDEFINITION, 
        /**
         * A person who is directly or indirectly involved in the provisioning of healthcare or related services.
         */
        PRACTITIONER, 
        /**
         * A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has performed at an organization during a period of time.
         */
        PRACTITIONERROLE, 
        /**
         * An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.
         */
        PROCEDURE, 
        /**
         * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which MAY impact security, privacy, and trust policies.
         */
        PROVENANCE, 
        /**
         * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
         */
        QUESTIONNAIRE, 
        /**
         * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
         */
        QUESTIONNAIRERESPONSE, 
        /**
         * Regulatory approval, clearance or licensing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.
         */
        REGULATEDAUTHORIZATION, 
        /**
         * Information about a person that is involved in a patient's health or the care for a patient, but who is not the primary target of healthcare.
         */
        RELATEDPERSON, 
        /**
         * A set of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
         */
        REQUESTORCHESTRATION, 
        /**
         * The Requirements resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.
         */
        REQUIREMENTS, 
        /**
         * A scientific study intended to increase health-related knowledge. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.
         */
        RESEARCHSTUDY, 
        /**
         * A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.
         */
        RESEARCHSUBJECT, 
        /**
         * This is the base resource type for everything.
         */
        RESOURCE, 
        /**
         * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
         */
        RISKASSESSMENT, 
        /**
         * A container for slots of time that may be available for booking appointments.
         */
        SCHEDULE, 
        /**
         * A search parameter that defines a named search item that can be used to search/filter on a resource.
         */
        SEARCHPARAMETER, 
        /**
         * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
         */
        SERVICEREQUEST, 
        /**
         * A slot of time on a schedule that may be available for booking appointments.
         */
        SLOT, 
        /**
         * A sample to be used for analysis.
         */
        SPECIMEN, 
        /**
         * A kind of specimen with associated set of requirements.
         */
        SPECIMENDEFINITION, 
        /**
         * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
         */
        STRUCTUREDEFINITION, 
        /**
         * A Map of relationships between 2 structures that can be used to transform data.
         */
        STRUCTUREMAP, 
        /**
         * The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.
         */
        SUBSCRIPTION, 
        /**
         * The SubscriptionStatus resource describes the state of a Subscription during notifications. It is not persisted.
         */
        SUBSCRIPTIONSTATUS, 
        /**
         * Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.
         */
        SUBSCRIPTIONTOPIC, 
        /**
         * A homogeneous material with a definite composition.
         */
        SUBSTANCE, 
        /**
         * The detailed description of a substance, typically at a level beyond what is used for prescribing.
         */
        SUBSTANCEDEFINITION, 
        /**
         * A task to be performed as a part of a workflow and the related information like inputs, outputs and execution progress.
         */
        TASK, 
        /**
         * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
         */
        TERMINOLOGYCAPABILITIES, 
        /**
         * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
         */
        VALUESET, 
        /**
         * An authorization for the provision of glasses and/or contact lenses to a patient.
         */
        VISIONPRESCRIPTION, 
        /**
         * null
         */
        BODYSITE, 
        /**
         * null
         */
        CATALOGENTRY, 
        /**
         * null
         */
        CONFORMANCE, 
        /**
         * null
         */
        DATAELEMENT, 
        /**
         * null
         */
        DEVICECOMPONENT, 
        /**
         * null
         */
        DEVICEUSEREQUEST, 
        /**
         * null
         */
        DEVICEUSESTATEMENT, 
        /**
         * null
         */
        DIAGNOSTICORDER, 
        /**
         * null
         */
        DOCUMENTMANIFEST, 
        /**
         * null
         */
        EFFECTEVIDENCESYNTHESIS, 
        /**
         * null
         */
        ELIGIBILITYREQUEST, 
        /**
         * null
         */
        ELIGIBILITYRESPONSE, 
        /**
         * null
         */
        EXPANSIONPROFILE, 
        /**
         * null
         */
        IMAGINGMANIFEST, 
        /**
         * null
         */
        IMAGINGOBJECTSELECTION, 
        /**
         * null
         */
        MEDIA, 
        /**
         * null
         */
        MEDICATIONORDER, 
        /**
         * null
         */
        MEDICATIONUSAGE, 
        /**
         * null
         */
        MEDICINALPRODUCT, 
        /**
         * null
         */
        MEDICINALPRODUCTAUTHORIZATION, 
        /**
         * null
         */
        MEDICINALPRODUCTCONTRAINDICATION, 
        /**
         * null
         */
        MEDICINALPRODUCTINDICATION, 
        /**
         * null
         */
        MEDICINALPRODUCTINGREDIENT, 
        /**
         * null
         */
        MEDICINALPRODUCTINTERACTION, 
        /**
         * null
         */
        MEDICINALPRODUCTMANUFACTURED, 
        /**
         * null
         */
        MEDICINALPRODUCTPACKAGED, 
        /**
         * null
         */
        MEDICINALPRODUCTPHARMACEUTICAL, 
        /**
         * null
         */
        MEDICINALPRODUCTUNDESIRABLEEFFECT, 
        /**
         * null
         */
        ORDER, 
        /**
         * null
         */
        ORDERRESPONSE, 
        /**
         * null
         */
        PROCEDUREREQUEST, 
        /**
         * null
         */
        PROCESSREQUEST, 
        /**
         * null
         */
        PROCESSRESPONSE, 
        /**
         * null
         */
        REFERRALREQUEST, 
        /**
         * null
         */
        REQUESTGROUP, 
        /**
         * null
         */
        RESEARCHDEFINITION, 
        /**
         * null
         */
        RESEARCHELEMENTDEFINITION, 
        /**
         * null
         */
        RISKEVIDENCESYNTHESIS, 
        /**
         * null
         */
        SEQUENCE, 
        /**
         * null
         */
        SERVICEDEFINITION, 
        /**
         * null
         */
        SUBSTANCESPECIFICATION, 
        /**
         * added to help the parsers
         */
        NULL;
        public static VersionIndependentResourceTypesAll fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Account".equals(codeString))
          return ACCOUNT;
        if ("ActivityDefinition".equals(codeString))
          return ACTIVITYDEFINITION;
        if ("ActorDefinition".equals(codeString))
          return ACTORDEFINITION;
        if ("AdministrableProductDefinition".equals(codeString))
          return ADMINISTRABLEPRODUCTDEFINITION;
        if ("AdverseEvent".equals(codeString))
          return ADVERSEEVENT;
        if ("AllergyIntolerance".equals(codeString))
          return ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
          return APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
          return APPOINTMENTRESPONSE;
        if ("ArtifactAssessment".equals(codeString))
          return ARTIFACTASSESSMENT;
        if ("AuditEvent".equals(codeString))
          return AUDITEVENT;
        if ("Basic".equals(codeString))
          return BASIC;
        if ("Binary".equals(codeString))
          return BINARY;
        if ("BiologicallyDerivedProduct".equals(codeString))
          return BIOLOGICALLYDERIVEDPRODUCT;
        if ("BodyStructure".equals(codeString))
          return BODYSTRUCTURE;
        if ("Bundle".equals(codeString))
          return BUNDLE;
        if ("CanonicalResource".equals(codeString))
          return CANONICALRESOURCE;
        if ("CapabilityStatement".equals(codeString))
          return CAPABILITYSTATEMENT;
        if ("CarePlan".equals(codeString))
          return CAREPLAN;
        if ("CareTeam".equals(codeString))
          return CARETEAM;
        if ("Claim".equals(codeString))
          return CLAIM;
        if ("ClaimResponse".equals(codeString))
          return CLAIMRESPONSE;
        if ("ClinicalUseDefinition".equals(codeString))
          return CLINICALUSEDEFINITION;
        if ("CodeSystem".equals(codeString))
          return CODESYSTEM;
        if ("Communication".equals(codeString))
          return COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
          return COMMUNICATIONREQUEST;
        if ("CompartmentDefinition".equals(codeString))
          return COMPARTMENTDEFINITION;
        if ("Composition".equals(codeString))
          return COMPOSITION;
        if ("ConceptMap".equals(codeString))
          return CONCEPTMAP;
        if ("Condition".equals(codeString))
          return CONDITION;
        if ("Consent".equals(codeString))
          return CONSENT;
        if ("Contract".equals(codeString))
          return CONTRACT;
        if ("Coverage".equals(codeString))
          return COVERAGE;
        if ("CoverageEligibilityRequest".equals(codeString))
          return COVERAGEELIGIBILITYREQUEST;
        if ("CoverageEligibilityResponse".equals(codeString))
          return COVERAGEELIGIBILITYRESPONSE;
        if ("DetectedIssue".equals(codeString))
          return DETECTEDISSUE;
        if ("Device".equals(codeString))
          return DEVICE;
        if ("DeviceAlert".equals(codeString))
          return DEVICEALERT;
        if ("DeviceAssociation".equals(codeString))
          return DEVICEASSOCIATION;
        if ("DeviceDefinition".equals(codeString))
          return DEVICEDEFINITION;
        if ("DeviceMetric".equals(codeString))
          return DEVICEMETRIC;
        if ("DeviceRequest".equals(codeString))
          return DEVICEREQUEST;
        if ("DiagnosticReport".equals(codeString))
          return DIAGNOSTICREPORT;
        if ("DocumentReference".equals(codeString))
          return DOCUMENTREFERENCE;
        if ("DomainResource".equals(codeString))
          return DOMAINRESOURCE;
        if ("Encounter".equals(codeString))
          return ENCOUNTER;
        if ("Endpoint".equals(codeString))
          return ENDPOINT;
        if ("EnrollmentRequest".equals(codeString))
          return ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
          return ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
          return EPISODEOFCARE;
        if ("EventDefinition".equals(codeString))
          return EVENTDEFINITION;
        if ("Evidence".equals(codeString))
          return EVIDENCE;
        if ("EvidenceVariable".equals(codeString))
          return EVIDENCEVARIABLE;
        if ("ExampleScenario".equals(codeString))
          return EXAMPLESCENARIO;
        if ("ExplanationOfBenefit".equals(codeString))
          return EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
          return FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
          return FLAG;
        if ("Goal".equals(codeString))
          return GOAL;
        if ("Group".equals(codeString))
          return GROUP;
        if ("GuidanceResponse".equals(codeString))
          return GUIDANCERESPONSE;
        if ("HealthcareService".equals(codeString))
          return HEALTHCARESERVICE;
        if ("ImagingSelection".equals(codeString))
          return IMAGINGSELECTION;
        if ("ImagingStudy".equals(codeString))
          return IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
          return IMMUNIZATION;
        if ("ImplementationGuide".equals(codeString))
          return IMPLEMENTATIONGUIDE;
        if ("Ingredient".equals(codeString))
          return INGREDIENT;
        if ("InsurancePlan".equals(codeString))
          return INSURANCEPLAN;
        if ("InsuranceProduct".equals(codeString))
          return INSURANCEPRODUCT;
        if ("Invoice".equals(codeString))
          return INVOICE;
        if ("Library".equals(codeString))
          return LIBRARY;
        if ("List".equals(codeString))
          return LIST;
        if ("Location".equals(codeString))
          return LOCATION;
        if ("ManufacturedItemDefinition".equals(codeString))
          return MANUFACTUREDITEMDEFINITION;
        if ("Measure".equals(codeString))
          return MEASURE;
        if ("MeasureReport".equals(codeString))
          return MEASUREREPORT;
        if ("Medication".equals(codeString))
          return MEDICATION;
        if ("MedicationAdministration".equals(codeString))
          return MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
          return MEDICATIONDISPENSE;
        if ("MedicationRequest".equals(codeString))
          return MEDICATIONREQUEST;
        if ("MedicationStatement".equals(codeString))
          return MEDICATIONSTATEMENT;
        if ("MedicinalProductDefinition".equals(codeString))
          return MEDICINALPRODUCTDEFINITION;
        if ("MessageDefinition".equals(codeString))
          return MESSAGEDEFINITION;
        if ("MessageHeader".equals(codeString))
          return MESSAGEHEADER;
        if ("MetadataResource".equals(codeString))
          return METADATARESOURCE;
        if ("NamingSystem".equals(codeString))
          return NAMINGSYSTEM;
        if ("NutritionIntake".equals(codeString))
          return NUTRITIONINTAKE;
        if ("NutritionOrder".equals(codeString))
          return NUTRITIONORDER;
        if ("NutritionProduct".equals(codeString))
          return NUTRITIONPRODUCT;
        if ("Observation".equals(codeString))
          return OBSERVATION;
        if ("ObservationDefinition".equals(codeString))
          return OBSERVATIONDEFINITION;
        if ("OperationDefinition".equals(codeString))
          return OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
          return OPERATIONOUTCOME;
        if ("Organization".equals(codeString))
          return ORGANIZATION;
        if ("OrganizationAffiliation".equals(codeString))
          return ORGANIZATIONAFFILIATION;
        if ("PackagedProductDefinition".equals(codeString))
          return PACKAGEDPRODUCTDEFINITION;
        if ("Parameters".equals(codeString))
          return PARAMETERS;
        if ("Patient".equals(codeString))
          return PATIENT;
        if ("PaymentNotice".equals(codeString))
          return PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
          return PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
          return PERSON;
        if ("PlanDefinition".equals(codeString))
          return PLANDEFINITION;
        if ("Practitioner".equals(codeString))
          return PRACTITIONER;
        if ("PractitionerRole".equals(codeString))
          return PRACTITIONERROLE;
        if ("Procedure".equals(codeString))
          return PROCEDURE;
        if ("Provenance".equals(codeString))
          return PROVENANCE;
        if ("Questionnaire".equals(codeString))
          return QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
          return QUESTIONNAIRERESPONSE;
        if ("RegulatedAuthorization".equals(codeString))
          return REGULATEDAUTHORIZATION;
        if ("RelatedPerson".equals(codeString))
          return RELATEDPERSON;
        if ("RequestOrchestration".equals(codeString))
          return REQUESTORCHESTRATION;
        if ("Requirements".equals(codeString))
          return REQUIREMENTS;
        if ("ResearchStudy".equals(codeString))
          return RESEARCHSTUDY;
        if ("ResearchSubject".equals(codeString))
          return RESEARCHSUBJECT;
        if ("Resource".equals(codeString))
          return RESOURCE;
        if ("RiskAssessment".equals(codeString))
          return RISKASSESSMENT;
        if ("Schedule".equals(codeString))
          return SCHEDULE;
        if ("SearchParameter".equals(codeString))
          return SEARCHPARAMETER;
        if ("ServiceRequest".equals(codeString))
          return SERVICEREQUEST;
        if ("Slot".equals(codeString))
          return SLOT;
        if ("Specimen".equals(codeString))
          return SPECIMEN;
        if ("SpecimenDefinition".equals(codeString))
          return SPECIMENDEFINITION;
        if ("StructureDefinition".equals(codeString))
          return STRUCTUREDEFINITION;
        if ("StructureMap".equals(codeString))
          return STRUCTUREMAP;
        if ("Subscription".equals(codeString))
          return SUBSCRIPTION;
        if ("SubscriptionStatus".equals(codeString))
          return SUBSCRIPTIONSTATUS;
        if ("SubscriptionTopic".equals(codeString))
          return SUBSCRIPTIONTOPIC;
        if ("Substance".equals(codeString))
          return SUBSTANCE;
        if ("SubstanceDefinition".equals(codeString))
          return SUBSTANCEDEFINITION;
        if ("Task".equals(codeString))
          return TASK;
        if ("TerminologyCapabilities".equals(codeString))
          return TERMINOLOGYCAPABILITIES;
        if ("ValueSet".equals(codeString))
          return VALUESET;
        if ("VisionPrescription".equals(codeString))
          return VISIONPRESCRIPTION;
        if ("BodySite".equals(codeString))
          return BODYSITE;
        if ("CatalogEntry".equals(codeString))
          return CATALOGENTRY;
        if ("Conformance".equals(codeString))
          return CONFORMANCE;
        if ("DataElement".equals(codeString))
          return DATAELEMENT;
        if ("DeviceComponent".equals(codeString))
          return DEVICECOMPONENT;
        if ("DeviceUseRequest".equals(codeString))
          return DEVICEUSEREQUEST;
        if ("DeviceUseStatement".equals(codeString))
          return DEVICEUSESTATEMENT;
        if ("DiagnosticOrder".equals(codeString))
          return DIAGNOSTICORDER;
        if ("DocumentManifest".equals(codeString))
          return DOCUMENTMANIFEST;
        if ("EffectEvidenceSynthesis".equals(codeString))
          return EFFECTEVIDENCESYNTHESIS;
        if ("EligibilityRequest".equals(codeString))
          return ELIGIBILITYREQUEST;
        if ("EligibilityResponse".equals(codeString))
          return ELIGIBILITYRESPONSE;
        if ("ExpansionProfile".equals(codeString))
          return EXPANSIONPROFILE;
        if ("ImagingManifest".equals(codeString))
          return IMAGINGMANIFEST;
        if ("ImagingObjectSelection".equals(codeString))
          return IMAGINGOBJECTSELECTION;
        if ("Media".equals(codeString))
          return MEDIA;
        if ("MedicationOrder".equals(codeString))
          return MEDICATIONORDER;
        if ("MedicationUsage".equals(codeString))
          return MEDICATIONUSAGE;
        if ("MedicinalProduct".equals(codeString))
          return MEDICINALPRODUCT;
        if ("MedicinalProductAuthorization".equals(codeString))
          return MEDICINALPRODUCTAUTHORIZATION;
        if ("MedicinalProductContraindication".equals(codeString))
          return MEDICINALPRODUCTCONTRAINDICATION;
        if ("MedicinalProductIndication".equals(codeString))
          return MEDICINALPRODUCTINDICATION;
        if ("MedicinalProductIngredient".equals(codeString))
          return MEDICINALPRODUCTINGREDIENT;
        if ("MedicinalProductInteraction".equals(codeString))
          return MEDICINALPRODUCTINTERACTION;
        if ("MedicinalProductManufactured".equals(codeString))
          return MEDICINALPRODUCTMANUFACTURED;
        if ("MedicinalProductPackaged".equals(codeString))
          return MEDICINALPRODUCTPACKAGED;
        if ("MedicinalProductPharmaceutical".equals(codeString))
          return MEDICINALPRODUCTPHARMACEUTICAL;
        if ("MedicinalProductUndesirableEffect".equals(codeString))
          return MEDICINALPRODUCTUNDESIRABLEEFFECT;
        if ("Order".equals(codeString))
          return ORDER;
        if ("OrderResponse".equals(codeString))
          return ORDERRESPONSE;
        if ("ProcedureRequest".equals(codeString))
          return PROCEDUREREQUEST;
        if ("ProcessRequest".equals(codeString))
          return PROCESSREQUEST;
        if ("ProcessResponse".equals(codeString))
          return PROCESSRESPONSE;
        if ("ReferralRequest".equals(codeString))
          return REFERRALREQUEST;
        if ("RequestGroup".equals(codeString))
          return REQUESTGROUP;
        if ("ResearchDefinition".equals(codeString))
          return RESEARCHDEFINITION;
        if ("ResearchElementDefinition".equals(codeString))
          return RESEARCHELEMENTDEFINITION;
        if ("RiskEvidenceSynthesis".equals(codeString))
          return RISKEVIDENCESYNTHESIS;
        if ("Sequence".equals(codeString))
          return SEQUENCE;
        if ("ServiceDefinition".equals(codeString))
          return SERVICEDEFINITION;
        if ("SubstanceSpecification".equals(codeString))
          return SUBSTANCESPECIFICATION;
        throw new FHIRException("Unknown VersionIndependentResourceTypesAll code '"+codeString+"'");
        }
        public static boolean isValidCode(String codeString) {
            if (codeString == null || "".equals(codeString))
                return false;
          return Utilities.existsInList(codeString, "Account", "ActivityDefinition", "ActorDefinition", "AdministrableProductDefinition", "AdverseEvent", "AllergyIntolerance", "Appointment", "AppointmentResponse", "ArtifactAssessment", "AuditEvent", "Basic", "Binary", "BiologicallyDerivedProduct", "BodyStructure", "Bundle", "CanonicalResource", "CapabilityStatement", "CarePlan", "CareTeam", "Claim", "ClaimResponse", "ClinicalUseDefinition", "CodeSystem", "Communication", "CommunicationRequest", "CompartmentDefinition", "Composition", "ConceptMap", "Condition", "Consent", "Contract", "Coverage", "CoverageEligibilityRequest", "CoverageEligibilityResponse", "DetectedIssue", "Device", "DeviceAlert", "DeviceAssociation", "DeviceDefinition", "DeviceMetric", "DeviceRequest", "DiagnosticReport", "DocumentReference", "DomainResource", "Encounter", "Endpoint", "EnrollmentRequest", "EnrollmentResponse", "EpisodeOfCare", "EventDefinition", "Evidence", "EvidenceVariable", "ExampleScenario", "ExplanationOfBenefit", "FamilyMemberHistory", "Flag", "Goal", "Group", "GuidanceResponse", "HealthcareService", "ImagingSelection", "ImagingStudy", "Immunization", "ImplementationGuide", "Ingredient", "InsurancePlan", "InsuranceProduct", "Invoice", "Library", "List", "Location", "ManufacturedItemDefinition", "Measure", "MeasureReport", "Medication", "MedicationAdministration", "MedicationDispense", "MedicationRequest", "MedicationStatement", "MedicinalProductDefinition", "MessageDefinition", "MessageHeader", "MetadataResource", "NamingSystem", "NutritionIntake", "NutritionOrder", "NutritionProduct", "Observation", "ObservationDefinition", "OperationDefinition", "OperationOutcome", "Organization", "OrganizationAffiliation", "PackagedProductDefinition", "Parameters", "Patient", "PaymentNotice", "PaymentReconciliation", "Person", "PlanDefinition", "Practitioner", "PractitionerRole", "Procedure", "Provenance", "Questionnaire", "QuestionnaireResponse", "RegulatedAuthorization", "RelatedPerson", "RequestOrchestration", "Requirements", "ResearchStudy", "ResearchSubject", "Resource", "RiskAssessment", "Schedule", "SearchParameter", "ServiceRequest", "Slot", "Specimen", "SpecimenDefinition", "StructureDefinition", "StructureMap", "Subscription", "SubscriptionStatus", "SubscriptionTopic", "Substance", "SubstanceDefinition", "Task", "TerminologyCapabilities", "ValueSet", "VisionPrescription", "BodySite", "CatalogEntry", "Conformance", "DataElement", "DeviceComponent", "DeviceUseRequest", "DeviceUseStatement", "DiagnosticOrder", "DocumentManifest", "EffectEvidenceSynthesis", "EligibilityRequest", "EligibilityResponse", "ExpansionProfile", "ImagingManifest", "ImagingObjectSelection", "Media", "MedicationOrder", "MedicationUsage", "MedicinalProduct", "MedicinalProductAuthorization", "MedicinalProductContraindication", "MedicinalProductIndication", "MedicinalProductIngredient", "MedicinalProductInteraction", "MedicinalProductManufactured", "MedicinalProductPackaged", "MedicinalProductPharmaceutical", "MedicinalProductUndesirableEffect", "Order", "OrderResponse", "ProcedureRequest", "ProcessRequest", "ProcessResponse", "ReferralRequest", "RequestGroup", "ResearchDefinition", "ResearchElementDefinition", "RiskEvidenceSynthesis", "Sequence", "ServiceDefinition", "SubstanceSpecification");
        }
        public String toCode() {
          switch (this) {
            case ACCOUNT: return "Account";
            case ACTIVITYDEFINITION: return "ActivityDefinition";
            case ACTORDEFINITION: return "ActorDefinition";
            case ADMINISTRABLEPRODUCTDEFINITION: return "AdministrableProductDefinition";
            case ADVERSEEVENT: return "AdverseEvent";
            case ALLERGYINTOLERANCE: return "AllergyIntolerance";
            case APPOINTMENT: return "Appointment";
            case APPOINTMENTRESPONSE: return "AppointmentResponse";
            case ARTIFACTASSESSMENT: return "ArtifactAssessment";
            case AUDITEVENT: return "AuditEvent";
            case BASIC: return "Basic";
            case BINARY: return "Binary";
            case BIOLOGICALLYDERIVEDPRODUCT: return "BiologicallyDerivedProduct";
            case BODYSTRUCTURE: return "BodyStructure";
            case BUNDLE: return "Bundle";
            case CANONICALRESOURCE: return "CanonicalResource";
            case CAPABILITYSTATEMENT: return "CapabilityStatement";
            case CAREPLAN: return "CarePlan";
            case CARETEAM: return "CareTeam";
            case CLAIM: return "Claim";
            case CLAIMRESPONSE: return "ClaimResponse";
            case CLINICALUSEDEFINITION: return "ClinicalUseDefinition";
            case CODESYSTEM: return "CodeSystem";
            case COMMUNICATION: return "Communication";
            case COMMUNICATIONREQUEST: return "CommunicationRequest";
            case COMPARTMENTDEFINITION: return "CompartmentDefinition";
            case COMPOSITION: return "Composition";
            case CONCEPTMAP: return "ConceptMap";
            case CONDITION: return "Condition";
            case CONSENT: return "Consent";
            case CONTRACT: return "Contract";
            case COVERAGE: return "Coverage";
            case COVERAGEELIGIBILITYREQUEST: return "CoverageEligibilityRequest";
            case COVERAGEELIGIBILITYRESPONSE: return "CoverageEligibilityResponse";
            case DETECTEDISSUE: return "DetectedIssue";
            case DEVICE: return "Device";
            case DEVICEALERT: return "DeviceAlert";
            case DEVICEASSOCIATION: return "DeviceAssociation";
            case DEVICEDEFINITION: return "DeviceDefinition";
            case DEVICEMETRIC: return "DeviceMetric";
            case DEVICEREQUEST: return "DeviceRequest";
            case DIAGNOSTICREPORT: return "DiagnosticReport";
            case DOCUMENTREFERENCE: return "DocumentReference";
            case DOMAINRESOURCE: return "DomainResource";
            case ENCOUNTER: return "Encounter";
            case ENDPOINT: return "Endpoint";
            case ENROLLMENTREQUEST: return "EnrollmentRequest";
            case ENROLLMENTRESPONSE: return "EnrollmentResponse";
            case EPISODEOFCARE: return "EpisodeOfCare";
            case EVENTDEFINITION: return "EventDefinition";
            case EVIDENCE: return "Evidence";
            case EVIDENCEVARIABLE: return "EvidenceVariable";
            case EXAMPLESCENARIO: return "ExampleScenario";
            case EXPLANATIONOFBENEFIT: return "ExplanationOfBenefit";
            case FAMILYMEMBERHISTORY: return "FamilyMemberHistory";
            case FLAG: return "Flag";
            case GOAL: return "Goal";
            case GROUP: return "Group";
            case GUIDANCERESPONSE: return "GuidanceResponse";
            case HEALTHCARESERVICE: return "HealthcareService";
            case IMAGINGSELECTION: return "ImagingSelection";
            case IMAGINGSTUDY: return "ImagingStudy";
            case IMMUNIZATION: return "Immunization";
            case IMPLEMENTATIONGUIDE: return "ImplementationGuide";
            case INGREDIENT: return "Ingredient";
            case INSURANCEPLAN: return "InsurancePlan";
            case INSURANCEPRODUCT: return "InsuranceProduct";
            case INVOICE: return "Invoice";
            case LIBRARY: return "Library";
            case LIST: return "List";
            case LOCATION: return "Location";
            case MANUFACTUREDITEMDEFINITION: return "ManufacturedItemDefinition";
            case MEASURE: return "Measure";
            case MEASUREREPORT: return "MeasureReport";
            case MEDICATION: return "Medication";
            case MEDICATIONADMINISTRATION: return "MedicationAdministration";
            case MEDICATIONDISPENSE: return "MedicationDispense";
            case MEDICATIONREQUEST: return "MedicationRequest";
            case MEDICATIONSTATEMENT: return "MedicationStatement";
            case MEDICINALPRODUCTDEFINITION: return "MedicinalProductDefinition";
            case MESSAGEDEFINITION: return "MessageDefinition";
            case MESSAGEHEADER: return "MessageHeader";
            case METADATARESOURCE: return "MetadataResource";
            case NAMINGSYSTEM: return "NamingSystem";
            case NUTRITIONINTAKE: return "NutritionIntake";
            case NUTRITIONORDER: return "NutritionOrder";
            case NUTRITIONPRODUCT: return "NutritionProduct";
            case OBSERVATION: return "Observation";
            case OBSERVATIONDEFINITION: return "ObservationDefinition";
            case OPERATIONDEFINITION: return "OperationDefinition";
            case OPERATIONOUTCOME: return "OperationOutcome";
            case ORGANIZATION: return "Organization";
            case ORGANIZATIONAFFILIATION: return "OrganizationAffiliation";
            case PACKAGEDPRODUCTDEFINITION: return "PackagedProductDefinition";
            case PARAMETERS: return "Parameters";
            case PATIENT: return "Patient";
            case PAYMENTNOTICE: return "PaymentNotice";
            case PAYMENTRECONCILIATION: return "PaymentReconciliation";
            case PERSON: return "Person";
            case PLANDEFINITION: return "PlanDefinition";
            case PRACTITIONER: return "Practitioner";
            case PRACTITIONERROLE: return "PractitionerRole";
            case PROCEDURE: return "Procedure";
            case PROVENANCE: return "Provenance";
            case QUESTIONNAIRE: return "Questionnaire";
            case QUESTIONNAIRERESPONSE: return "QuestionnaireResponse";
            case REGULATEDAUTHORIZATION: return "RegulatedAuthorization";
            case RELATEDPERSON: return "RelatedPerson";
            case REQUESTORCHESTRATION: return "RequestOrchestration";
            case REQUIREMENTS: return "Requirements";
            case RESEARCHSTUDY: return "ResearchStudy";
            case RESEARCHSUBJECT: return "ResearchSubject";
            case RESOURCE: return "Resource";
            case RISKASSESSMENT: return "RiskAssessment";
            case SCHEDULE: return "Schedule";
            case SEARCHPARAMETER: return "SearchParameter";
            case SERVICEREQUEST: return "ServiceRequest";
            case SLOT: return "Slot";
            case SPECIMEN: return "Specimen";
            case SPECIMENDEFINITION: return "SpecimenDefinition";
            case STRUCTUREDEFINITION: return "StructureDefinition";
            case STRUCTUREMAP: return "StructureMap";
            case SUBSCRIPTION: return "Subscription";
            case SUBSCRIPTIONSTATUS: return "SubscriptionStatus";
            case SUBSCRIPTIONTOPIC: return "SubscriptionTopic";
            case SUBSTANCE: return "Substance";
            case SUBSTANCEDEFINITION: return "SubstanceDefinition";
            case TASK: return "Task";
            case TERMINOLOGYCAPABILITIES: return "TerminologyCapabilities";
            case VALUESET: return "ValueSet";
            case VISIONPRESCRIPTION: return "VisionPrescription";
            case BODYSITE: return "BodySite";
            case CATALOGENTRY: return "CatalogEntry";
            case CONFORMANCE: return "Conformance";
            case DATAELEMENT: return "DataElement";
            case DEVICECOMPONENT: return "DeviceComponent";
            case DEVICEUSEREQUEST: return "DeviceUseRequest";
            case DEVICEUSESTATEMENT: return "DeviceUseStatement";
            case DIAGNOSTICORDER: return "DiagnosticOrder";
            case DOCUMENTMANIFEST: return "DocumentManifest";
            case EFFECTEVIDENCESYNTHESIS: return "EffectEvidenceSynthesis";
            case ELIGIBILITYREQUEST: return "EligibilityRequest";
            case ELIGIBILITYRESPONSE: return "EligibilityResponse";
            case EXPANSIONPROFILE: return "ExpansionProfile";
            case IMAGINGMANIFEST: return "ImagingManifest";
            case IMAGINGOBJECTSELECTION: return "ImagingObjectSelection";
            case MEDIA: return "Media";
            case MEDICATIONORDER: return "MedicationOrder";
            case MEDICATIONUSAGE: return "MedicationUsage";
            case MEDICINALPRODUCT: return "MedicinalProduct";
            case MEDICINALPRODUCTAUTHORIZATION: return "MedicinalProductAuthorization";
            case MEDICINALPRODUCTCONTRAINDICATION: return "MedicinalProductContraindication";
            case MEDICINALPRODUCTINDICATION: return "MedicinalProductIndication";
            case MEDICINALPRODUCTINGREDIENT: return "MedicinalProductIngredient";
            case MEDICINALPRODUCTINTERACTION: return "MedicinalProductInteraction";
            case MEDICINALPRODUCTMANUFACTURED: return "MedicinalProductManufactured";
            case MEDICINALPRODUCTPACKAGED: return "MedicinalProductPackaged";
            case MEDICINALPRODUCTPHARMACEUTICAL: return "MedicinalProductPharmaceutical";
            case MEDICINALPRODUCTUNDESIRABLEEFFECT: return "MedicinalProductUndesirableEffect";
            case ORDER: return "Order";
            case ORDERRESPONSE: return "OrderResponse";
            case PROCEDUREREQUEST: return "ProcedureRequest";
            case PROCESSREQUEST: return "ProcessRequest";
            case PROCESSRESPONSE: return "ProcessResponse";
            case REFERRALREQUEST: return "ReferralRequest";
            case REQUESTGROUP: return "RequestGroup";
            case RESEARCHDEFINITION: return "ResearchDefinition";
            case RESEARCHELEMENTDEFINITION: return "ResearchElementDefinition";
            case RISKEVIDENCESYNTHESIS: return "RiskEvidenceSynthesis";
            case SEQUENCE: return "Sequence";
            case SERVICEDEFINITION: return "ServiceDefinition";
            case SUBSTANCESPECIFICATION: return "SubstanceSpecification";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACCOUNT: return "http://hl7.org/fhir/fhir-types";
            case ACTIVITYDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case ACTORDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case ADMINISTRABLEPRODUCTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case ADVERSEEVENT: return "http://hl7.org/fhir/fhir-types";
            case ALLERGYINTOLERANCE: return "http://hl7.org/fhir/fhir-types";
            case APPOINTMENT: return "http://hl7.org/fhir/fhir-types";
            case APPOINTMENTRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case ARTIFACTASSESSMENT: return "http://hl7.org/fhir/fhir-types";
            case AUDITEVENT: return "http://hl7.org/fhir/fhir-types";
            case BASIC: return "http://hl7.org/fhir/fhir-types";
            case BINARY: return "http://hl7.org/fhir/fhir-types";
            case BIOLOGICALLYDERIVEDPRODUCT: return "http://hl7.org/fhir/fhir-types";
            case BODYSTRUCTURE: return "http://hl7.org/fhir/fhir-types";
            case BUNDLE: return "http://hl7.org/fhir/fhir-types";
            case CANONICALRESOURCE: return "http://hl7.org/fhir/fhir-types";
            case CAPABILITYSTATEMENT: return "http://hl7.org/fhir/fhir-types";
            case CAREPLAN: return "http://hl7.org/fhir/fhir-types";
            case CARETEAM: return "http://hl7.org/fhir/fhir-types";
            case CLAIM: return "http://hl7.org/fhir/fhir-types";
            case CLAIMRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case CLINICALUSEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case CODESYSTEM: return "http://hl7.org/fhir/fhir-types";
            case COMMUNICATION: return "http://hl7.org/fhir/fhir-types";
            case COMMUNICATIONREQUEST: return "http://hl7.org/fhir/fhir-types";
            case COMPARTMENTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case COMPOSITION: return "http://hl7.org/fhir/fhir-types";
            case CONCEPTMAP: return "http://hl7.org/fhir/fhir-types";
            case CONDITION: return "http://hl7.org/fhir/fhir-types";
            case CONSENT: return "http://hl7.org/fhir/fhir-types";
            case CONTRACT: return "http://hl7.org/fhir/fhir-types";
            case COVERAGE: return "http://hl7.org/fhir/fhir-types";
            case COVERAGEELIGIBILITYREQUEST: return "http://hl7.org/fhir/fhir-types";
            case COVERAGEELIGIBILITYRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case DETECTEDISSUE: return "http://hl7.org/fhir/fhir-types";
            case DEVICE: return "http://hl7.org/fhir/fhir-types";
            case DEVICEALERT: return "http://hl7.org/fhir/fhir-types";
            case DEVICEASSOCIATION: return "http://hl7.org/fhir/fhir-types";
            case DEVICEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case DEVICEMETRIC: return "http://hl7.org/fhir/fhir-types";
            case DEVICEREQUEST: return "http://hl7.org/fhir/fhir-types";
            case DIAGNOSTICREPORT: return "http://hl7.org/fhir/fhir-types";
            case DOCUMENTREFERENCE: return "http://hl7.org/fhir/fhir-types";
            case DOMAINRESOURCE: return "http://hl7.org/fhir/fhir-types";
            case ENCOUNTER: return "http://hl7.org/fhir/fhir-types";
            case ENDPOINT: return "http://hl7.org/fhir/fhir-types";
            case ENROLLMENTREQUEST: return "http://hl7.org/fhir/fhir-types";
            case ENROLLMENTRESPONSE: return "http://hl7.org/fhir/fhir-types";
            case EPISODEOFCARE: return "http://hl7.org/fhir/fhir-types";
            case EVENTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case EVIDENCE: return "http://hl7.org/fhir/fhir-types";
            case EVIDENCEVARIABLE: return "http://hl7.org/fhir/fhir-types";
            case EXAMPLESCENARIO: return "http://hl7.org/fhir/fhir-types";
            case EXPLANATIONOFBENEFIT: return "http://hl7.org/fhir/fhir-types";
            case FAMILYMEMBERHISTORY: return "http://hl7.org/fhir/fhir-types";
            case FLAG: return "http://hl7.org/fhir/fhir-types";
            case GOAL: return "http://hl7.org/fhir/fhir-types";
            case GROUP: return "http://hl7.org/fhir/fhir-types";
            case GUIDANCERESPONSE: return "http://hl7.org/fhir/fhir-types";
            case HEALTHCARESERVICE: return "http://hl7.org/fhir/fhir-types";
            case IMAGINGSELECTION: return "http://hl7.org/fhir/fhir-types";
            case IMAGINGSTUDY: return "http://hl7.org/fhir/fhir-types";
            case IMMUNIZATION: return "http://hl7.org/fhir/fhir-types";
            case IMPLEMENTATIONGUIDE: return "http://hl7.org/fhir/fhir-types";
            case INGREDIENT: return "http://hl7.org/fhir/fhir-types";
            case INSURANCEPLAN: return "http://hl7.org/fhir/fhir-types";
            case INSURANCEPRODUCT: return "http://hl7.org/fhir/fhir-types";
            case INVOICE: return "http://hl7.org/fhir/fhir-types";
            case LIBRARY: return "http://hl7.org/fhir/fhir-types";
            case LIST: return "http://hl7.org/fhir/fhir-types";
            case LOCATION: return "http://hl7.org/fhir/fhir-types";
            case MANUFACTUREDITEMDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case MEASURE: return "http://hl7.org/fhir/fhir-types";
            case MEASUREREPORT: return "http://hl7.org/fhir/fhir-types";
            case MEDICATION: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONADMINISTRATION: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONDISPENSE: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONREQUEST: return "http://hl7.org/fhir/fhir-types";
            case MEDICATIONSTATEMENT: return "http://hl7.org/fhir/fhir-types";
            case MEDICINALPRODUCTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case MESSAGEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case MESSAGEHEADER: return "http://hl7.org/fhir/fhir-types";
            case METADATARESOURCE: return "http://hl7.org/fhir/fhir-types";
            case NAMINGSYSTEM: return "http://hl7.org/fhir/fhir-types";
            case NUTRITIONINTAKE: return "http://hl7.org/fhir/fhir-types";
            case NUTRITIONORDER: return "http://hl7.org/fhir/fhir-types";
            case NUTRITIONPRODUCT: return "http://hl7.org/fhir/fhir-types";
            case OBSERVATION: return "http://hl7.org/fhir/fhir-types";
            case OBSERVATIONDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case OPERATIONDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case OPERATIONOUTCOME: return "http://hl7.org/fhir/fhir-types";
            case ORGANIZATION: return "http://hl7.org/fhir/fhir-types";
            case ORGANIZATIONAFFILIATION: return "http://hl7.org/fhir/fhir-types";
            case PACKAGEDPRODUCTDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case PARAMETERS: return "http://hl7.org/fhir/fhir-types";
            case PATIENT: return "http://hl7.org/fhir/fhir-types";
            case PAYMENTNOTICE: return "http://hl7.org/fhir/fhir-types";
            case PAYMENTRECONCILIATION: return "http://hl7.org/fhir/fhir-types";
            case PERSON: return "http://hl7.org/fhir/fhir-types";
            case PLANDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case PRACTITIONER: return "http://hl7.org/fhir/fhir-types";
            case PRACTITIONERROLE: return "http://hl7.org/fhir/fhir-types";
            case PROCEDURE: return "http://hl7.org/fhir/fhir-types";
            case PROVENANCE: return "http://hl7.org/fhir/fhir-types";
            case QUESTIONNAIRE: return "http://hl7.org/fhir/fhir-types";
            case QUESTIONNAIRERESPONSE: return "http://hl7.org/fhir/fhir-types";
            case REGULATEDAUTHORIZATION: return "http://hl7.org/fhir/fhir-types";
            case RELATEDPERSON: return "http://hl7.org/fhir/fhir-types";
            case REQUESTORCHESTRATION: return "http://hl7.org/fhir/fhir-types";
            case REQUIREMENTS: return "http://hl7.org/fhir/fhir-types";
            case RESEARCHSTUDY: return "http://hl7.org/fhir/fhir-types";
            case RESEARCHSUBJECT: return "http://hl7.org/fhir/fhir-types";
            case RESOURCE: return "http://hl7.org/fhir/fhir-types";
            case RISKASSESSMENT: return "http://hl7.org/fhir/fhir-types";
            case SCHEDULE: return "http://hl7.org/fhir/fhir-types";
            case SEARCHPARAMETER: return "http://hl7.org/fhir/fhir-types";
            case SERVICEREQUEST: return "http://hl7.org/fhir/fhir-types";
            case SLOT: return "http://hl7.org/fhir/fhir-types";
            case SPECIMEN: return "http://hl7.org/fhir/fhir-types";
            case SPECIMENDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case STRUCTUREDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case STRUCTUREMAP: return "http://hl7.org/fhir/fhir-types";
            case SUBSCRIPTION: return "http://hl7.org/fhir/fhir-types";
            case SUBSCRIPTIONSTATUS: return "http://hl7.org/fhir/fhir-types";
            case SUBSCRIPTIONTOPIC: return "http://hl7.org/fhir/fhir-types";
            case SUBSTANCE: return "http://hl7.org/fhir/fhir-types";
            case SUBSTANCEDEFINITION: return "http://hl7.org/fhir/fhir-types";
            case TASK: return "http://hl7.org/fhir/fhir-types";
            case TERMINOLOGYCAPABILITIES: return "http://hl7.org/fhir/fhir-types";
            case VALUESET: return "http://hl7.org/fhir/fhir-types";
            case VISIONPRESCRIPTION: return "http://hl7.org/fhir/fhir-types";
            case BODYSITE: return "http://hl7.org/fhir/fhir-old-types";
            case CATALOGENTRY: return "http://hl7.org/fhir/fhir-old-types";
            case CONFORMANCE: return "http://hl7.org/fhir/fhir-old-types";
            case DATAELEMENT: return "http://hl7.org/fhir/fhir-old-types";
            case DEVICECOMPONENT: return "http://hl7.org/fhir/fhir-old-types";
            case DEVICEUSEREQUEST: return "http://hl7.org/fhir/fhir-old-types";
            case DEVICEUSESTATEMENT: return "http://hl7.org/fhir/fhir-old-types";
            case DIAGNOSTICORDER: return "http://hl7.org/fhir/fhir-old-types";
            case DOCUMENTMANIFEST: return "http://hl7.org/fhir/fhir-old-types";
            case EFFECTEVIDENCESYNTHESIS: return "http://hl7.org/fhir/fhir-old-types";
            case ELIGIBILITYREQUEST: return "http://hl7.org/fhir/fhir-old-types";
            case ELIGIBILITYRESPONSE: return "http://hl7.org/fhir/fhir-old-types";
            case EXPANSIONPROFILE: return "http://hl7.org/fhir/fhir-old-types";
            case IMAGINGMANIFEST: return "http://hl7.org/fhir/fhir-old-types";
            case IMAGINGOBJECTSELECTION: return "http://hl7.org/fhir/fhir-old-types";
            case MEDIA: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICATIONORDER: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICATIONUSAGE: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCT: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTAUTHORIZATION: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTCONTRAINDICATION: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTINDICATION: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTINGREDIENT: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTINTERACTION: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTMANUFACTURED: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTPACKAGED: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTPHARMACEUTICAL: return "http://hl7.org/fhir/fhir-old-types";
            case MEDICINALPRODUCTUNDESIRABLEEFFECT: return "http://hl7.org/fhir/fhir-old-types";
            case ORDER: return "http://hl7.org/fhir/fhir-old-types";
            case ORDERRESPONSE: return "http://hl7.org/fhir/fhir-old-types";
            case PROCEDUREREQUEST: return "http://hl7.org/fhir/fhir-old-types";
            case PROCESSREQUEST: return "http://hl7.org/fhir/fhir-old-types";
            case PROCESSRESPONSE: return "http://hl7.org/fhir/fhir-old-types";
            case REFERRALREQUEST: return "http://hl7.org/fhir/fhir-old-types";
            case REQUESTGROUP: return "http://hl7.org/fhir/fhir-old-types";
            case RESEARCHDEFINITION: return "http://hl7.org/fhir/fhir-old-types";
            case RESEARCHELEMENTDEFINITION: return "http://hl7.org/fhir/fhir-old-types";
            case RISKEVIDENCESYNTHESIS: return "http://hl7.org/fhir/fhir-old-types";
            case SEQUENCE: return "http://hl7.org/fhir/fhir-old-types";
            case SERVICEDEFINITION: return "http://hl7.org/fhir/fhir-old-types";
            case SUBSTANCESPECIFICATION: return "http://hl7.org/fhir/fhir-old-types";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACCOUNT: return "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.";
            case ACTIVITYDEFINITION: return "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.";
            case ACTORDEFINITION: return "The ActorDefinition resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.";
            case ADMINISTRABLEPRODUCTDEFINITION: return "A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).";
            case ADVERSEEVENT: return "An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management.  Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers.  Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.";
            case ALLERGYINTOLERANCE: return "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.";
            case APPOINTMENT: return "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).";
            case APPOINTMENTRESPONSE: return "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.";
            case ARTIFACTASSESSMENT: return "This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.";
            case AUDITEVENT: return "A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.";
            case BASIC: return "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.";
            case BINARY: return "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.";
            case BIOLOGICALLYDERIVEDPRODUCT: return "A biological material originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.";
            case BODYSTRUCTURE: return "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.";
            case BUNDLE: return "A container for a collection of resources.";
            case CANONICALRESOURCE: return "Common Interface declaration for conformance and knowledge artifact resources.";
            case CAPABILITYSTATEMENT: return "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
            case CAREPLAN: return "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.";
            case CARETEAM: return "The Care Team includes all the people, organizations, and care teams who participate or plan to participate in the coordination and delivery of care.";
            case CLAIM: return "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.";
            case CLAIMRESPONSE: return "This resource provides the adjudication details from the processing of a Claim resource.";
            case CLINICALUSEDEFINITION: return "A single issue - either an indication, contraindication, interaction, undesirable effect or warning for a medicinal product, medication, device or procedure.";
            case CODESYSTEM: return "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.";
            case COMMUNICATION: return "A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.";
            case COMMUNICATIONREQUEST: return "A request to convey information from a sender to a recipient.";
            case COMPARTMENTDEFINITION: return "A compartment definition that defines how resources are accessed on a server.";
            case COMPOSITION: return "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and has traceability to the author who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).";
            case CONCEPTMAP: return "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.";
            case CONDITION: return "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.";
            case CONSENT: return "A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.";
            case CONTRACT: return "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.";
            case COVERAGE: return "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.";
            case COVERAGEELIGIBILITYREQUEST: return "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.";
            case COVERAGEELIGIBILITYRESPONSE: return "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.";
            case DETECTEDISSUE: return "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.";
            case DEVICE: return "This resource describes the properties (regulated, has real time clock, etc.), administrative (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement, blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a given module, for example the serial number, manufacturer name, and model number). An actual unit may consist of several modules in a distinct hierarchy and these are represented by multiple Device resources and bound through the 'parent' element.";
            case DEVICEALERT: return "Describes a physiological or technical alert condition report originated by a device.  The DeviceAlert resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable. ";
            case DEVICEASSOCIATION: return "A record of association of a device.";
            case DEVICEDEFINITION: return "This is a specialized resource that defines the characteristics and capabilities of a device.";
            case DEVICEMETRIC: return "Describes a measurement, calculation or setting capability of a device. The DeviceMetric resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable.";
            case DEVICEREQUEST: return "Represents a request a device to be provided to a specific patient. The device may be an implantable device to be subsequently implanted, or an external assistive device, such as a walker, to be delivered and subsequently be used.";
            case DIAGNOSTICREPORT: return "The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.";
            case DOCUMENTREFERENCE: return "A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this “document” encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.";
            case DOMAINRESOURCE: return "A resource that includes narrative, extensions, and contained resources.";
            case ENCOUNTER: return "An interaction between healthcare provider(s), and/or patient(s) for the purpose of providing healthcare service(s) or assessing the health status of patient(s).";
            case ENDPOINT: return "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.";
            case ENROLLMENTREQUEST: return "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.";
            case ENROLLMENTRESPONSE: return "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.";
            case EPISODEOFCARE: return "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.";
            case EVENTDEFINITION: return "The EventDefinition resource provides a reusable description of when a particular event can occur.";
            case EVIDENCE: return "The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.";
            case EVIDENCEVARIABLE: return "The EvidenceVariable resource describes an element that knowledge (Evidence) is about.";
            case EXAMPLESCENARIO: return "A walkthrough of a workflow showing the interaction between systems and the instances shared, possibly including the evolution of instances over time.";
            case EXPLANATIONOFBENEFIT: return "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.";
            case FAMILYMEMBERHISTORY: return "Significant health conditions for a person related to the patient relevant in the context of care for the patient.";
            case FLAG: return "Prospective warnings of potential issues when providing care to the patient.";
            case GOAL: return "Describes the intended objective(s) for a patient, group, or organizational care.  Examples include a patient's weight loss, restoration of an activity of daily living for a patient, obtaining herd immunity via immunization for a group, meeting a process improvement objective for an organization, etc.";
            case GROUP: return "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not typically expected to act collectively*. These collections are also not typically formally or legally recognized.\\r\\n\\r\\n*NOTE: Group may be used to define families or households, which in some circumstances may act collectively or have a degree of legal or formal recognition. This should be considered an exception. When Group is used for types of entities other than Patient or RelatedPerson, the expectation remains that the Group will not act collectively or have formal recognition - use Organization if these behaviors are needed. See more discussion [below](group.html#group-usage)";
            case GUIDANCERESPONSE: return "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.";
            case HEALTHCARESERVICE: return "The details of a healthcare service available at a location or in a catalog.  In the case where there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be represented using a set of linked HealthcareServices.";
            case IMAGINGSELECTION: return "A selection of DICOM SOP instances within a single Study and Series. This might include additional specifics such as a set of frames or an image region, allowing linkage to an Observation Resource.";
            case IMAGINGSTUDY: return "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of images or other data objects (called Service-Object Pair Instances or SOP Instances) acquired or produced in a common context.";
            case IMMUNIZATION: return "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.";
            case IMPLEMENTATIONGUIDE: return "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.";
            case INGREDIENT: return "An ingredient of a manufactured item or pharmaceutical product.";
            case INSURANCEPLAN: return "Details of a Health Insurance plan provided by an organization under an InsuranceProduct.";
            case INSURANCEPRODUCT: return "Details of a Health Insurance product provided by an organization.";
            case INVOICE: return "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.";
            case LIBRARY: return "The Library resource is a general-purpose container for knowledge artifact definitions. It can be used to describe and expose existing knowledge artifacts such as logic libraries and information model descriptions, as well as to describe a collection of knowledge artifacts.";
            case LIST: return "A List is a curated collection of resources, for things such as problem lists, allergy lists, facility list, organization list, etc.";
            case LOCATION: return "Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.";
            case MANUFACTUREDITEMDEFINITION: return "The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.";
            case MEASURE: return "The Measure resource provides the definition of a quality measure.";
            case MEASUREREPORT: return "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.";
            case MEDICATION: return "This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.";
            case MEDICATIONADMINISTRATION: return "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner. This event can also be used to record waste using a status of not-done and the appropriate statusReason.";
            case MEDICATIONDISPENSE: return "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.";
            case MEDICATIONREQUEST: return "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.";
            case MEDICATIONSTATEMENT: return "A record of a medication consumed by a patient.  A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future. The source of this information can be the patient, patient representative (e.g., spouse, significant other, family member, caregiver), or a clinician. A common scenario where this information is captured is during the history taking process during a patient encounter or stay. The medication information may come from sources such as the patient's memory, from a prescription bottle, or from a list of medications the patient, clinician or other party maintains. The primary difference between a MedicationStatement and a MedicationAdministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication. A MedicationStatement is often, if not always, less specific. There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise. As stated earlier, the MedicationStatement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party. MedicationAdministration is more formal and is not missing detailed information.";
            case MEDICINALPRODUCTDEFINITION: return "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).";
            case MESSAGEDEFINITION: return "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.";
            case MESSAGEHEADER: return "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.";
            case METADATARESOURCE: return "Common Interface declaration for conformance and knowledge artifact resources.";
            case NAMINGSYSTEM: return "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.";
            case NUTRITIONINTAKE: return "A record of intake by a patient.  A NutritionIntake may indicate that the patient may be consuming the food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula now or has consumed it in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food (i.e., solid and/or liquid), breastmilk, infant formula, supplements, enteral formula consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label, or from a clinician documenting observed intake.";
            case NUTRITIONORDER: return "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to an individual or group.";
            case NUTRITIONPRODUCT: return "A food or supplement that is consumed by patients.";
            case OBSERVATION: return "Measurements and simple assertions made about a patient, device or other subject.";
            case OBSERVATIONDEFINITION: return "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.";
            case OPERATIONDEFINITION: return "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).";
            case OPERATIONOUTCOME: return "A collection of error, warning, or information messages that result from a system action.";
            case ORGANIZATION: return "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.";
            case ORGANIZATIONAFFILIATION: return "Defines an affiliation/assotiation/relationship between 2 distinct organizations, that is not a part-of relationship/sub-division relationship.";
            case PACKAGEDPRODUCTDEFINITION: return "A medically related item or items, in a container or package.";
            case PARAMETERS: return "This resource is used to pass information into and back from an operation (whether invoked directly from REST or within a messaging environment).  It is not persisted or allowed to be referenced by other resources except as described in the definition of the Parameters resource.";
            case PATIENT: return "Demographics and other administrative information about an individual or animal that is the subject of potential, past, current, or future health-related care, services, or processes.";
            case PAYMENTNOTICE: return "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.";
            case PAYMENTRECONCILIATION: return "This resource provides the details including amount of a payment and allocates the payment items being paid.";
            case PERSON: return "Demographics and administrative information about a person independent of a specific health-related context.";
            case PLANDEFINITION: return "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, drug quality specifications, and drug manufacturing process.";
            case PRACTITIONER: return "A person who is directly or indirectly involved in the provisioning of healthcare or related services.";
            case PRACTITIONERROLE: return "A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has performed at an organization during a period of time.";
            case PROCEDURE: return "An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.";
            case PROVENANCE: return "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which MAY impact security, privacy, and trust policies.";
            case QUESTIONNAIRE: return "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.";
            case QUESTIONNAIRERESPONSE: return "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.";
            case REGULATEDAUTHORIZATION: return "Regulatory approval, clearance or licensing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.";
            case RELATEDPERSON: return "Information about a person that is involved in a patient's health or the care for a patient, but who is not the primary target of healthcare.";
            case REQUESTORCHESTRATION: return "A set of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".";
            case REQUIREMENTS: return "The Requirements resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.";
            case RESEARCHSTUDY: return "A scientific study intended to increase health-related knowledge. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.";
            case RESEARCHSUBJECT: return "A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.";
            case RESOURCE: return "This is the base resource type for everything.";
            case RISKASSESSMENT: return "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.";
            case SCHEDULE: return "A container for slots of time that may be available for booking appointments.";
            case SEARCHPARAMETER: return "A search parameter that defines a named search item that can be used to search/filter on a resource.";
            case SERVICEREQUEST: return "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.";
            case SLOT: return "A slot of time on a schedule that may be available for booking appointments.";
            case SPECIMEN: return "A sample to be used for analysis.";
            case SPECIMENDEFINITION: return "A kind of specimen with associated set of requirements.";
            case STRUCTUREDEFINITION: return "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.";
            case STRUCTUREMAP: return "A Map of relationships between 2 structures that can be used to transform data.";
            case SUBSCRIPTION: return "The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.";
            case SUBSCRIPTIONSTATUS: return "The SubscriptionStatus resource describes the state of a Subscription during notifications. It is not persisted.";
            case SUBSCRIPTIONTOPIC: return "Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.";
            case SUBSTANCE: return "A homogeneous material with a definite composition.";
            case SUBSTANCEDEFINITION: return "The detailed description of a substance, typically at a level beyond what is used for prescribing.";
            case TASK: return "A task to be performed as a part of a workflow and the related information like inputs, outputs and execution progress.";
            case TERMINOLOGYCAPABILITIES: return "A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.";
            case VALUESET: return "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).";
            case VISIONPRESCRIPTION: return "An authorization for the provision of glasses and/or contact lenses to a patient.";
            case BODYSITE: return "";
            case CATALOGENTRY: return "";
            case CONFORMANCE: return "";
            case DATAELEMENT: return "";
            case DEVICECOMPONENT: return "";
            case DEVICEUSEREQUEST: return "";
            case DEVICEUSESTATEMENT: return "";
            case DIAGNOSTICORDER: return "";
            case DOCUMENTMANIFEST: return "";
            case EFFECTEVIDENCESYNTHESIS: return "";
            case ELIGIBILITYREQUEST: return "";
            case ELIGIBILITYRESPONSE: return "";
            case EXPANSIONPROFILE: return "";
            case IMAGINGMANIFEST: return "";
            case IMAGINGOBJECTSELECTION: return "";
            case MEDIA: return "";
            case MEDICATIONORDER: return "";
            case MEDICATIONUSAGE: return "";
            case MEDICINALPRODUCT: return "";
            case MEDICINALPRODUCTAUTHORIZATION: return "";
            case MEDICINALPRODUCTCONTRAINDICATION: return "";
            case MEDICINALPRODUCTINDICATION: return "";
            case MEDICINALPRODUCTINGREDIENT: return "";
            case MEDICINALPRODUCTINTERACTION: return "";
            case MEDICINALPRODUCTMANUFACTURED: return "";
            case MEDICINALPRODUCTPACKAGED: return "";
            case MEDICINALPRODUCTPHARMACEUTICAL: return "";
            case MEDICINALPRODUCTUNDESIRABLEEFFECT: return "";
            case ORDER: return "";
            case ORDERRESPONSE: return "";
            case PROCEDUREREQUEST: return "";
            case PROCESSREQUEST: return "";
            case PROCESSRESPONSE: return "";
            case REFERRALREQUEST: return "";
            case REQUESTGROUP: return "";
            case RESEARCHDEFINITION: return "";
            case RESEARCHELEMENTDEFINITION: return "";
            case RISKEVIDENCESYNTHESIS: return "";
            case SEQUENCE: return "";
            case SERVICEDEFINITION: return "";
            case SUBSTANCESPECIFICATION: return "";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACCOUNT: return "Account";
            case ACTIVITYDEFINITION: return "ActivityDefinition";
            case ACTORDEFINITION: return "ActorDefinition";
            case ADMINISTRABLEPRODUCTDEFINITION: return "AdministrableProductDefinition";
            case ADVERSEEVENT: return "AdverseEvent";
            case ALLERGYINTOLERANCE: return "AllergyIntolerance";
            case APPOINTMENT: return "Appointment";
            case APPOINTMENTRESPONSE: return "AppointmentResponse";
            case ARTIFACTASSESSMENT: return "ArtifactAssessment";
            case AUDITEVENT: return "AuditEvent";
            case BASIC: return "Basic";
            case BINARY: return "Binary";
            case BIOLOGICALLYDERIVEDPRODUCT: return "BiologicallyDerivedProduct";
            case BODYSTRUCTURE: return "BodyStructure";
            case BUNDLE: return "Bundle";
            case CANONICALRESOURCE: return "CanonicalResource";
            case CAPABILITYSTATEMENT: return "CapabilityStatement";
            case CAREPLAN: return "CarePlan";
            case CARETEAM: return "CareTeam";
            case CLAIM: return "Claim";
            case CLAIMRESPONSE: return "ClaimResponse";
            case CLINICALUSEDEFINITION: return "ClinicalUseDefinition";
            case CODESYSTEM: return "CodeSystem";
            case COMMUNICATION: return "Communication";
            case COMMUNICATIONREQUEST: return "CommunicationRequest";
            case COMPARTMENTDEFINITION: return "CompartmentDefinition";
            case COMPOSITION: return "Composition";
            case CONCEPTMAP: return "ConceptMap";
            case CONDITION: return "Condition";
            case CONSENT: return "Consent";
            case CONTRACT: return "Contract";
            case COVERAGE: return "Coverage";
            case COVERAGEELIGIBILITYREQUEST: return "CoverageEligibilityRequest";
            case COVERAGEELIGIBILITYRESPONSE: return "CoverageEligibilityResponse";
            case DETECTEDISSUE: return "DetectedIssue";
            case DEVICE: return "Device";
            case DEVICEALERT: return "DeviceAlert";
            case DEVICEASSOCIATION: return "DeviceAssociation";
            case DEVICEDEFINITION: return "DeviceDefinition";
            case DEVICEMETRIC: return "DeviceMetric";
            case DEVICEREQUEST: return "DeviceRequest";
            case DIAGNOSTICREPORT: return "DiagnosticReport";
            case DOCUMENTREFERENCE: return "DocumentReference";
            case DOMAINRESOURCE: return "DomainResource";
            case ENCOUNTER: return "Encounter";
            case ENDPOINT: return "Endpoint";
            case ENROLLMENTREQUEST: return "EnrollmentRequest";
            case ENROLLMENTRESPONSE: return "EnrollmentResponse";
            case EPISODEOFCARE: return "EpisodeOfCare";
            case EVENTDEFINITION: return "EventDefinition";
            case EVIDENCE: return "Evidence";
            case EVIDENCEVARIABLE: return "EvidenceVariable";
            case EXAMPLESCENARIO: return "ExampleScenario";
            case EXPLANATIONOFBENEFIT: return "ExplanationOfBenefit";
            case FAMILYMEMBERHISTORY: return "FamilyMemberHistory";
            case FLAG: return "Flag";
            case GOAL: return "Goal";
            case GROUP: return "Group";
            case GUIDANCERESPONSE: return "GuidanceResponse";
            case HEALTHCARESERVICE: return "HealthcareService";
            case IMAGINGSELECTION: return "ImagingSelection";
            case IMAGINGSTUDY: return "ImagingStudy";
            case IMMUNIZATION: return "Immunization";
            case IMPLEMENTATIONGUIDE: return "ImplementationGuide";
            case INGREDIENT: return "Ingredient";
            case INSURANCEPLAN: return "InsurancePlan";
            case INSURANCEPRODUCT: return "InsuranceProduct";
            case INVOICE: return "Invoice";
            case LIBRARY: return "Library";
            case LIST: return "List";
            case LOCATION: return "Location";
            case MANUFACTUREDITEMDEFINITION: return "ManufacturedItemDefinition";
            case MEASURE: return "Measure";
            case MEASUREREPORT: return "MeasureReport";
            case MEDICATION: return "Medication";
            case MEDICATIONADMINISTRATION: return "MedicationAdministration";
            case MEDICATIONDISPENSE: return "MedicationDispense";
            case MEDICATIONREQUEST: return "MedicationRequest";
            case MEDICATIONSTATEMENT: return "MedicationStatement";
            case MEDICINALPRODUCTDEFINITION: return "MedicinalProductDefinition";
            case MESSAGEDEFINITION: return "MessageDefinition";
            case MESSAGEHEADER: return "MessageHeader";
            case METADATARESOURCE: return "MetadataResource";
            case NAMINGSYSTEM: return "NamingSystem";
            case NUTRITIONINTAKE: return "NutritionIntake";
            case NUTRITIONORDER: return "NutritionOrder";
            case NUTRITIONPRODUCT: return "NutritionProduct";
            case OBSERVATION: return "Observation";
            case OBSERVATIONDEFINITION: return "ObservationDefinition";
            case OPERATIONDEFINITION: return "OperationDefinition";
            case OPERATIONOUTCOME: return "OperationOutcome";
            case ORGANIZATION: return "Organization";
            case ORGANIZATIONAFFILIATION: return "OrganizationAffiliation";
            case PACKAGEDPRODUCTDEFINITION: return "PackagedProductDefinition";
            case PARAMETERS: return "Parameters";
            case PATIENT: return "Patient";
            case PAYMENTNOTICE: return "PaymentNotice";
            case PAYMENTRECONCILIATION: return "PaymentReconciliation";
            case PERSON: return "Person";
            case PLANDEFINITION: return "PlanDefinition";
            case PRACTITIONER: return "Practitioner";
            case PRACTITIONERROLE: return "PractitionerRole";
            case PROCEDURE: return "Procedure";
            case PROVENANCE: return "Provenance";
            case QUESTIONNAIRE: return "Questionnaire";
            case QUESTIONNAIRERESPONSE: return "QuestionnaireResponse";
            case REGULATEDAUTHORIZATION: return "RegulatedAuthorization";
            case RELATEDPERSON: return "RelatedPerson";
            case REQUESTORCHESTRATION: return "RequestOrchestration";
            case REQUIREMENTS: return "Requirements";
            case RESEARCHSTUDY: return "ResearchStudy";
            case RESEARCHSUBJECT: return "ResearchSubject";
            case RESOURCE: return "Resource";
            case RISKASSESSMENT: return "RiskAssessment";
            case SCHEDULE: return "Schedule";
            case SEARCHPARAMETER: return "SearchParameter";
            case SERVICEREQUEST: return "ServiceRequest";
            case SLOT: return "Slot";
            case SPECIMEN: return "Specimen";
            case SPECIMENDEFINITION: return "SpecimenDefinition";
            case STRUCTUREDEFINITION: return "StructureDefinition";
            case STRUCTUREMAP: return "StructureMap";
            case SUBSCRIPTION: return "Subscription";
            case SUBSCRIPTIONSTATUS: return "SubscriptionStatus";
            case SUBSCRIPTIONTOPIC: return "SubscriptionTopic";
            case SUBSTANCE: return "Substance";
            case SUBSTANCEDEFINITION: return "SubstanceDefinition";
            case TASK: return "Task";
            case TERMINOLOGYCAPABILITIES: return "TerminologyCapabilities";
            case VALUESET: return "ValueSet";
            case VISIONPRESCRIPTION: return "VisionPrescription";
            case BODYSITE: return "BodySite";
            case CATALOGENTRY: return "CatalogEntry";
            case CONFORMANCE: return "Conformance";
            case DATAELEMENT: return "DataElement";
            case DEVICECOMPONENT: return "DeviceComponent";
            case DEVICEUSEREQUEST: return "DeviceUseRequest";
            case DEVICEUSESTATEMENT: return "DeviceUseStatement";
            case DIAGNOSTICORDER: return "DiagnosticOrder";
            case DOCUMENTMANIFEST: return "DocumentManifest";
            case EFFECTEVIDENCESYNTHESIS: return "EffectEvidenceSynthesis";
            case ELIGIBILITYREQUEST: return "EligibilityRequest";
            case ELIGIBILITYRESPONSE: return "EligibilityResponse";
            case EXPANSIONPROFILE: return "ExpansionProfile";
            case IMAGINGMANIFEST: return "ImagingManifest";
            case IMAGINGOBJECTSELECTION: return "ImagingObjectSelection";
            case MEDIA: return "Media";
            case MEDICATIONORDER: return "MedicationOrder";
            case MEDICATIONUSAGE: return "MedicationUsage";
            case MEDICINALPRODUCT: return "MedicinalProduct";
            case MEDICINALPRODUCTAUTHORIZATION: return "MedicinalProductAuthorization";
            case MEDICINALPRODUCTCONTRAINDICATION: return "MedicinalProductContraindication";
            case MEDICINALPRODUCTINDICATION: return "MedicinalProductIndication";
            case MEDICINALPRODUCTINGREDIENT: return "MedicinalProductIngredient";
            case MEDICINALPRODUCTINTERACTION: return "MedicinalProductInteraction";
            case MEDICINALPRODUCTMANUFACTURED: return "MedicinalProductManufactured";
            case MEDICINALPRODUCTPACKAGED: return "MedicinalProductPackaged";
            case MEDICINALPRODUCTPHARMACEUTICAL: return "MedicinalProductPharmaceutical";
            case MEDICINALPRODUCTUNDESIRABLEEFFECT: return "MedicinalProductUndesirableEffect";
            case ORDER: return "Order";
            case ORDERRESPONSE: return "OrderResponse";
            case PROCEDUREREQUEST: return "ProcedureRequest";
            case PROCESSREQUEST: return "ProcessRequest";
            case PROCESSRESPONSE: return "ProcessResponse";
            case REFERRALREQUEST: return "ReferralRequest";
            case REQUESTGROUP: return "RequestGroup";
            case RESEARCHDEFINITION: return "ResearchDefinition";
            case RESEARCHELEMENTDEFINITION: return "ResearchElementDefinition";
            case RISKEVIDENCESYNTHESIS: return "RiskEvidenceSynthesis";
            case SEQUENCE: return "Sequence";
            case SERVICEDEFINITION: return "ServiceDefinition";
            case SUBSTANCESPECIFICATION: return "SubstanceSpecification";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class VersionIndependentResourceTypesAllEnumFactory implements EnumFactory<VersionIndependentResourceTypesAll> {
    public VersionIndependentResourceTypesAll fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("Account".equals(codeString))
          return VersionIndependentResourceTypesAll.ACCOUNT;
        if ("ActivityDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.ACTIVITYDEFINITION;
        if ("ActorDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.ACTORDEFINITION;
        if ("AdministrableProductDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.ADMINISTRABLEPRODUCTDEFINITION;
        if ("AdverseEvent".equals(codeString))
          return VersionIndependentResourceTypesAll.ADVERSEEVENT;
        if ("AllergyIntolerance".equals(codeString))
          return VersionIndependentResourceTypesAll.ALLERGYINTOLERANCE;
        if ("Appointment".equals(codeString))
          return VersionIndependentResourceTypesAll.APPOINTMENT;
        if ("AppointmentResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.APPOINTMENTRESPONSE;
        if ("ArtifactAssessment".equals(codeString))
          return VersionIndependentResourceTypesAll.ARTIFACTASSESSMENT;
        if ("AuditEvent".equals(codeString))
          return VersionIndependentResourceTypesAll.AUDITEVENT;
        if ("Basic".equals(codeString))
          return VersionIndependentResourceTypesAll.BASIC;
        if ("Binary".equals(codeString))
          return VersionIndependentResourceTypesAll.BINARY;
        if ("BiologicallyDerivedProduct".equals(codeString))
          return VersionIndependentResourceTypesAll.BIOLOGICALLYDERIVEDPRODUCT;
        if ("BodyStructure".equals(codeString))
          return VersionIndependentResourceTypesAll.BODYSTRUCTURE;
        if ("Bundle".equals(codeString))
          return VersionIndependentResourceTypesAll.BUNDLE;
        if ("CanonicalResource".equals(codeString))
          return VersionIndependentResourceTypesAll.CANONICALRESOURCE;
        if ("CapabilityStatement".equals(codeString))
          return VersionIndependentResourceTypesAll.CAPABILITYSTATEMENT;
        if ("CarePlan".equals(codeString))
          return VersionIndependentResourceTypesAll.CAREPLAN;
        if ("CareTeam".equals(codeString))
          return VersionIndependentResourceTypesAll.CARETEAM;
        if ("Claim".equals(codeString))
          return VersionIndependentResourceTypesAll.CLAIM;
        if ("ClaimResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.CLAIMRESPONSE;
        if ("ClinicalUseDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.CLINICALUSEDEFINITION;
        if ("CodeSystem".equals(codeString))
          return VersionIndependentResourceTypesAll.CODESYSTEM;
        if ("Communication".equals(codeString))
          return VersionIndependentResourceTypesAll.COMMUNICATION;
        if ("CommunicationRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.COMMUNICATIONREQUEST;
        if ("CompartmentDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.COMPARTMENTDEFINITION;
        if ("Composition".equals(codeString))
          return VersionIndependentResourceTypesAll.COMPOSITION;
        if ("ConceptMap".equals(codeString))
          return VersionIndependentResourceTypesAll.CONCEPTMAP;
        if ("Condition".equals(codeString))
          return VersionIndependentResourceTypesAll.CONDITION;
        if ("Consent".equals(codeString))
          return VersionIndependentResourceTypesAll.CONSENT;
        if ("Contract".equals(codeString))
          return VersionIndependentResourceTypesAll.CONTRACT;
        if ("Coverage".equals(codeString))
          return VersionIndependentResourceTypesAll.COVERAGE;
        if ("CoverageEligibilityRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.COVERAGEELIGIBILITYREQUEST;
        if ("CoverageEligibilityResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.COVERAGEELIGIBILITYRESPONSE;
        if ("DetectedIssue".equals(codeString))
          return VersionIndependentResourceTypesAll.DETECTEDISSUE;
        if ("Device".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICE;
        if ("DeviceAlert".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEALERT;
        if ("DeviceAssociation".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEASSOCIATION;
        if ("DeviceDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEDEFINITION;
        if ("DeviceMetric".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEMETRIC;
        if ("DeviceRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEREQUEST;
        if ("DiagnosticReport".equals(codeString))
          return VersionIndependentResourceTypesAll.DIAGNOSTICREPORT;
        if ("DocumentReference".equals(codeString))
          return VersionIndependentResourceTypesAll.DOCUMENTREFERENCE;
        if ("DomainResource".equals(codeString))
          return VersionIndependentResourceTypesAll.DOMAINRESOURCE;
        if ("Encounter".equals(codeString))
          return VersionIndependentResourceTypesAll.ENCOUNTER;
        if ("Endpoint".equals(codeString))
          return VersionIndependentResourceTypesAll.ENDPOINT;
        if ("EnrollmentRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.ENROLLMENTREQUEST;
        if ("EnrollmentResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.ENROLLMENTRESPONSE;
        if ("EpisodeOfCare".equals(codeString))
          return VersionIndependentResourceTypesAll.EPISODEOFCARE;
        if ("EventDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.EVENTDEFINITION;
        if ("Evidence".equals(codeString))
          return VersionIndependentResourceTypesAll.EVIDENCE;
        if ("EvidenceVariable".equals(codeString))
          return VersionIndependentResourceTypesAll.EVIDENCEVARIABLE;
        if ("ExampleScenario".equals(codeString))
          return VersionIndependentResourceTypesAll.EXAMPLESCENARIO;
        if ("ExplanationOfBenefit".equals(codeString))
          return VersionIndependentResourceTypesAll.EXPLANATIONOFBENEFIT;
        if ("FamilyMemberHistory".equals(codeString))
          return VersionIndependentResourceTypesAll.FAMILYMEMBERHISTORY;
        if ("Flag".equals(codeString))
          return VersionIndependentResourceTypesAll.FLAG;
        if ("Goal".equals(codeString))
          return VersionIndependentResourceTypesAll.GOAL;
        if ("Group".equals(codeString))
          return VersionIndependentResourceTypesAll.GROUP;
        if ("GuidanceResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.GUIDANCERESPONSE;
        if ("HealthcareService".equals(codeString))
          return VersionIndependentResourceTypesAll.HEALTHCARESERVICE;
        if ("ImagingSelection".equals(codeString))
          return VersionIndependentResourceTypesAll.IMAGINGSELECTION;
        if ("ImagingStudy".equals(codeString))
          return VersionIndependentResourceTypesAll.IMAGINGSTUDY;
        if ("Immunization".equals(codeString))
          return VersionIndependentResourceTypesAll.IMMUNIZATION;
        if ("ImplementationGuide".equals(codeString))
          return VersionIndependentResourceTypesAll.IMPLEMENTATIONGUIDE;
        if ("Ingredient".equals(codeString))
          return VersionIndependentResourceTypesAll.INGREDIENT;
        if ("InsurancePlan".equals(codeString))
          return VersionIndependentResourceTypesAll.INSURANCEPLAN;
        if ("InsuranceProduct".equals(codeString))
          return VersionIndependentResourceTypesAll.INSURANCEPRODUCT;
        if ("Invoice".equals(codeString))
          return VersionIndependentResourceTypesAll.INVOICE;
        if ("Library".equals(codeString))
          return VersionIndependentResourceTypesAll.LIBRARY;
        if ("List".equals(codeString))
          return VersionIndependentResourceTypesAll.LIST;
        if ("Location".equals(codeString))
          return VersionIndependentResourceTypesAll.LOCATION;
        if ("ManufacturedItemDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.MANUFACTUREDITEMDEFINITION;
        if ("Measure".equals(codeString))
          return VersionIndependentResourceTypesAll.MEASURE;
        if ("MeasureReport".equals(codeString))
          return VersionIndependentResourceTypesAll.MEASUREREPORT;
        if ("Medication".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATION;
        if ("MedicationAdministration".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATIONADMINISTRATION;
        if ("MedicationDispense".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATIONDISPENSE;
        if ("MedicationRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATIONREQUEST;
        if ("MedicationStatement".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATIONSTATEMENT;
        if ("MedicinalProductDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTDEFINITION;
        if ("MessageDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.MESSAGEDEFINITION;
        if ("MessageHeader".equals(codeString))
          return VersionIndependentResourceTypesAll.MESSAGEHEADER;
        if ("MetadataResource".equals(codeString))
          return VersionIndependentResourceTypesAll.METADATARESOURCE;
        if ("NamingSystem".equals(codeString))
          return VersionIndependentResourceTypesAll.NAMINGSYSTEM;
        if ("NutritionIntake".equals(codeString))
          return VersionIndependentResourceTypesAll.NUTRITIONINTAKE;
        if ("NutritionOrder".equals(codeString))
          return VersionIndependentResourceTypesAll.NUTRITIONORDER;
        if ("NutritionProduct".equals(codeString))
          return VersionIndependentResourceTypesAll.NUTRITIONPRODUCT;
        if ("Observation".equals(codeString))
          return VersionIndependentResourceTypesAll.OBSERVATION;
        if ("ObservationDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.OBSERVATIONDEFINITION;
        if ("OperationDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.OPERATIONDEFINITION;
        if ("OperationOutcome".equals(codeString))
          return VersionIndependentResourceTypesAll.OPERATIONOUTCOME;
        if ("Organization".equals(codeString))
          return VersionIndependentResourceTypesAll.ORGANIZATION;
        if ("OrganizationAffiliation".equals(codeString))
          return VersionIndependentResourceTypesAll.ORGANIZATIONAFFILIATION;
        if ("PackagedProductDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.PACKAGEDPRODUCTDEFINITION;
        if ("Parameters".equals(codeString))
          return VersionIndependentResourceTypesAll.PARAMETERS;
        if ("Patient".equals(codeString))
          return VersionIndependentResourceTypesAll.PATIENT;
        if ("PaymentNotice".equals(codeString))
          return VersionIndependentResourceTypesAll.PAYMENTNOTICE;
        if ("PaymentReconciliation".equals(codeString))
          return VersionIndependentResourceTypesAll.PAYMENTRECONCILIATION;
        if ("Person".equals(codeString))
          return VersionIndependentResourceTypesAll.PERSON;
        if ("PlanDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.PLANDEFINITION;
        if ("Practitioner".equals(codeString))
          return VersionIndependentResourceTypesAll.PRACTITIONER;
        if ("PractitionerRole".equals(codeString))
          return VersionIndependentResourceTypesAll.PRACTITIONERROLE;
        if ("Procedure".equals(codeString))
          return VersionIndependentResourceTypesAll.PROCEDURE;
        if ("Provenance".equals(codeString))
          return VersionIndependentResourceTypesAll.PROVENANCE;
        if ("Questionnaire".equals(codeString))
          return VersionIndependentResourceTypesAll.QUESTIONNAIRE;
        if ("QuestionnaireResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.QUESTIONNAIRERESPONSE;
        if ("RegulatedAuthorization".equals(codeString))
          return VersionIndependentResourceTypesAll.REGULATEDAUTHORIZATION;
        if ("RelatedPerson".equals(codeString))
          return VersionIndependentResourceTypesAll.RELATEDPERSON;
        if ("RequestOrchestration".equals(codeString))
          return VersionIndependentResourceTypesAll.REQUESTORCHESTRATION;
        if ("Requirements".equals(codeString))
          return VersionIndependentResourceTypesAll.REQUIREMENTS;
        if ("ResearchStudy".equals(codeString))
          return VersionIndependentResourceTypesAll.RESEARCHSTUDY;
        if ("ResearchSubject".equals(codeString))
          return VersionIndependentResourceTypesAll.RESEARCHSUBJECT;
        if ("Resource".equals(codeString))
          return VersionIndependentResourceTypesAll.RESOURCE;
        if ("RiskAssessment".equals(codeString))
          return VersionIndependentResourceTypesAll.RISKASSESSMENT;
        if ("Schedule".equals(codeString))
          return VersionIndependentResourceTypesAll.SCHEDULE;
        if ("SearchParameter".equals(codeString))
          return VersionIndependentResourceTypesAll.SEARCHPARAMETER;
        if ("ServiceRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.SERVICEREQUEST;
        if ("Slot".equals(codeString))
          return VersionIndependentResourceTypesAll.SLOT;
        if ("Specimen".equals(codeString))
          return VersionIndependentResourceTypesAll.SPECIMEN;
        if ("SpecimenDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.SPECIMENDEFINITION;
        if ("StructureDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.STRUCTUREDEFINITION;
        if ("StructureMap".equals(codeString))
          return VersionIndependentResourceTypesAll.STRUCTUREMAP;
        if ("Subscription".equals(codeString))
          return VersionIndependentResourceTypesAll.SUBSCRIPTION;
        if ("SubscriptionStatus".equals(codeString))
          return VersionIndependentResourceTypesAll.SUBSCRIPTIONSTATUS;
        if ("SubscriptionTopic".equals(codeString))
          return VersionIndependentResourceTypesAll.SUBSCRIPTIONTOPIC;
        if ("Substance".equals(codeString))
          return VersionIndependentResourceTypesAll.SUBSTANCE;
        if ("SubstanceDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.SUBSTANCEDEFINITION;
        if ("Task".equals(codeString))
          return VersionIndependentResourceTypesAll.TASK;
        if ("TerminologyCapabilities".equals(codeString))
          return VersionIndependentResourceTypesAll.TERMINOLOGYCAPABILITIES;
        if ("ValueSet".equals(codeString))
          return VersionIndependentResourceTypesAll.VALUESET;
        if ("VisionPrescription".equals(codeString))
          return VersionIndependentResourceTypesAll.VISIONPRESCRIPTION;
        if ("BodySite".equals(codeString))
          return VersionIndependentResourceTypesAll.BODYSITE;
        if ("CatalogEntry".equals(codeString))
          return VersionIndependentResourceTypesAll.CATALOGENTRY;
        if ("Conformance".equals(codeString))
          return VersionIndependentResourceTypesAll.CONFORMANCE;
        if ("DataElement".equals(codeString))
          return VersionIndependentResourceTypesAll.DATAELEMENT;
        if ("DeviceComponent".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICECOMPONENT;
        if ("DeviceUseRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEUSEREQUEST;
        if ("DeviceUseStatement".equals(codeString))
          return VersionIndependentResourceTypesAll.DEVICEUSESTATEMENT;
        if ("DiagnosticOrder".equals(codeString))
          return VersionIndependentResourceTypesAll.DIAGNOSTICORDER;
        if ("DocumentManifest".equals(codeString))
          return VersionIndependentResourceTypesAll.DOCUMENTMANIFEST;
        if ("EffectEvidenceSynthesis".equals(codeString))
          return VersionIndependentResourceTypesAll.EFFECTEVIDENCESYNTHESIS;
        if ("EligibilityRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.ELIGIBILITYREQUEST;
        if ("EligibilityResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.ELIGIBILITYRESPONSE;
        if ("ExpansionProfile".equals(codeString))
          return VersionIndependentResourceTypesAll.EXPANSIONPROFILE;
        if ("ImagingManifest".equals(codeString))
          return VersionIndependentResourceTypesAll.IMAGINGMANIFEST;
        if ("ImagingObjectSelection".equals(codeString))
          return VersionIndependentResourceTypesAll.IMAGINGOBJECTSELECTION;
        if ("Media".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDIA;
        if ("MedicationOrder".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATIONORDER;
        if ("MedicationUsage".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICATIONUSAGE;
        if ("MedicinalProduct".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCT;
        if ("MedicinalProductAuthorization".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTAUTHORIZATION;
        if ("MedicinalProductContraindication".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTCONTRAINDICATION;
        if ("MedicinalProductIndication".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTINDICATION;
        if ("MedicinalProductIngredient".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTINGREDIENT;
        if ("MedicinalProductInteraction".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTINTERACTION;
        if ("MedicinalProductManufactured".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTMANUFACTURED;
        if ("MedicinalProductPackaged".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTPACKAGED;
        if ("MedicinalProductPharmaceutical".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTPHARMACEUTICAL;
        if ("MedicinalProductUndesirableEffect".equals(codeString))
          return VersionIndependentResourceTypesAll.MEDICINALPRODUCTUNDESIRABLEEFFECT;
        if ("Order".equals(codeString))
          return VersionIndependentResourceTypesAll.ORDER;
        if ("OrderResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.ORDERRESPONSE;
        if ("ProcedureRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.PROCEDUREREQUEST;
        if ("ProcessRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.PROCESSREQUEST;
        if ("ProcessResponse".equals(codeString))
          return VersionIndependentResourceTypesAll.PROCESSRESPONSE;
        if ("ReferralRequest".equals(codeString))
          return VersionIndependentResourceTypesAll.REFERRALREQUEST;
        if ("RequestGroup".equals(codeString))
          return VersionIndependentResourceTypesAll.REQUESTGROUP;
        if ("ResearchDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.RESEARCHDEFINITION;
        if ("ResearchElementDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.RESEARCHELEMENTDEFINITION;
        if ("RiskEvidenceSynthesis".equals(codeString))
          return VersionIndependentResourceTypesAll.RISKEVIDENCESYNTHESIS;
        if ("Sequence".equals(codeString))
          return VersionIndependentResourceTypesAll.SEQUENCE;
        if ("ServiceDefinition".equals(codeString))
          return VersionIndependentResourceTypesAll.SERVICEDEFINITION;
        if ("SubstanceSpecification".equals(codeString))
          return VersionIndependentResourceTypesAll.SUBSTANCESPECIFICATION;
        throw new IllegalArgumentException("Unknown VersionIndependentResourceTypesAll code '"+codeString+"'");
        }

        public Enumeration<VersionIndependentResourceTypesAll> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.NULL, code);
        if ("Account".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ACCOUNT, code);
        if ("ActivityDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ACTIVITYDEFINITION, code);
        if ("ActorDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ACTORDEFINITION, code);
        if ("AdministrableProductDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ADMINISTRABLEPRODUCTDEFINITION, code);
        if ("AdverseEvent".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ADVERSEEVENT, code);
        if ("AllergyIntolerance".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ALLERGYINTOLERANCE, code);
        if ("Appointment".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.APPOINTMENT, code);
        if ("AppointmentResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.APPOINTMENTRESPONSE, code);
        if ("ArtifactAssessment".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ARTIFACTASSESSMENT, code);
        if ("AuditEvent".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.AUDITEVENT, code);
        if ("Basic".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.BASIC, code);
        if ("Binary".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.BINARY, code);
        if ("BiologicallyDerivedProduct".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.BIOLOGICALLYDERIVEDPRODUCT, code);
        if ("BodyStructure".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.BODYSTRUCTURE, code);
        if ("Bundle".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.BUNDLE, code);
        if ("CanonicalResource".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CANONICALRESOURCE, code);
        if ("CapabilityStatement".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CAPABILITYSTATEMENT, code);
        if ("CarePlan".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CAREPLAN, code);
        if ("CareTeam".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CARETEAM, code);
        if ("Claim".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CLAIM, code);
        if ("ClaimResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CLAIMRESPONSE, code);
        if ("ClinicalUseDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CLINICALUSEDEFINITION, code);
        if ("CodeSystem".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CODESYSTEM, code);
        if ("Communication".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COMMUNICATION, code);
        if ("CommunicationRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COMMUNICATIONREQUEST, code);
        if ("CompartmentDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COMPARTMENTDEFINITION, code);
        if ("Composition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COMPOSITION, code);
        if ("ConceptMap".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CONCEPTMAP, code);
        if ("Condition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CONDITION, code);
        if ("Consent".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CONSENT, code);
        if ("Contract".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CONTRACT, code);
        if ("Coverage".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COVERAGE, code);
        if ("CoverageEligibilityRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COVERAGEELIGIBILITYREQUEST, code);
        if ("CoverageEligibilityResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.COVERAGEELIGIBILITYRESPONSE, code);
        if ("DetectedIssue".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DETECTEDISSUE, code);
        if ("Device".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICE, code);
        if ("DeviceAlert".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEALERT, code);
        if ("DeviceAssociation".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEASSOCIATION, code);
        if ("DeviceDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEDEFINITION, code);
        if ("DeviceMetric".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEMETRIC, code);
        if ("DeviceRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEREQUEST, code);
        if ("DiagnosticReport".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DIAGNOSTICREPORT, code);
        if ("DocumentReference".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DOCUMENTREFERENCE, code);
        if ("DomainResource".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DOMAINRESOURCE, code);
        if ("Encounter".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ENCOUNTER, code);
        if ("Endpoint".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ENDPOINT, code);
        if ("EnrollmentRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ENROLLMENTREQUEST, code);
        if ("EnrollmentResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ENROLLMENTRESPONSE, code);
        if ("EpisodeOfCare".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EPISODEOFCARE, code);
        if ("EventDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EVENTDEFINITION, code);
        if ("Evidence".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EVIDENCE, code);
        if ("EvidenceVariable".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EVIDENCEVARIABLE, code);
        if ("ExampleScenario".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EXAMPLESCENARIO, code);
        if ("ExplanationOfBenefit".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EXPLANATIONOFBENEFIT, code);
        if ("FamilyMemberHistory".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.FAMILYMEMBERHISTORY, code);
        if ("Flag".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.FLAG, code);
        if ("Goal".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.GOAL, code);
        if ("Group".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.GROUP, code);
        if ("GuidanceResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.GUIDANCERESPONSE, code);
        if ("HealthcareService".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.HEALTHCARESERVICE, code);
        if ("ImagingSelection".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.IMAGINGSELECTION, code);
        if ("ImagingStudy".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.IMAGINGSTUDY, code);
        if ("Immunization".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.IMMUNIZATION, code);
        if ("ImplementationGuide".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.IMPLEMENTATIONGUIDE, code);
        if ("Ingredient".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.INGREDIENT, code);
        if ("InsurancePlan".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.INSURANCEPLAN, code);
        if ("InsuranceProduct".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.INSURANCEPRODUCT, code);
        if ("Invoice".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.INVOICE, code);
        if ("Library".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.LIBRARY, code);
        if ("List".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.LIST, code);
        if ("Location".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.LOCATION, code);
        if ("ManufacturedItemDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MANUFACTUREDITEMDEFINITION, code);
        if ("Measure".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEASURE, code);
        if ("MeasureReport".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEASUREREPORT, code);
        if ("Medication".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATION, code);
        if ("MedicationAdministration".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATIONADMINISTRATION, code);
        if ("MedicationDispense".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATIONDISPENSE, code);
        if ("MedicationRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATIONREQUEST, code);
        if ("MedicationStatement".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATIONSTATEMENT, code);
        if ("MedicinalProductDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTDEFINITION, code);
        if ("MessageDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MESSAGEDEFINITION, code);
        if ("MessageHeader".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MESSAGEHEADER, code);
        if ("MetadataResource".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.METADATARESOURCE, code);
        if ("NamingSystem".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.NAMINGSYSTEM, code);
        if ("NutritionIntake".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.NUTRITIONINTAKE, code);
        if ("NutritionOrder".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.NUTRITIONORDER, code);
        if ("NutritionProduct".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.NUTRITIONPRODUCT, code);
        if ("Observation".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.OBSERVATION, code);
        if ("ObservationDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.OBSERVATIONDEFINITION, code);
        if ("OperationDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.OPERATIONDEFINITION, code);
        if ("OperationOutcome".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.OPERATIONOUTCOME, code);
        if ("Organization".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ORGANIZATION, code);
        if ("OrganizationAffiliation".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ORGANIZATIONAFFILIATION, code);
        if ("PackagedProductDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PACKAGEDPRODUCTDEFINITION, code);
        if ("Parameters".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PARAMETERS, code);
        if ("Patient".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PATIENT, code);
        if ("PaymentNotice".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PAYMENTNOTICE, code);
        if ("PaymentReconciliation".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PAYMENTRECONCILIATION, code);
        if ("Person".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PERSON, code);
        if ("PlanDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PLANDEFINITION, code);
        if ("Practitioner".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PRACTITIONER, code);
        if ("PractitionerRole".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PRACTITIONERROLE, code);
        if ("Procedure".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PROCEDURE, code);
        if ("Provenance".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PROVENANCE, code);
        if ("Questionnaire".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.QUESTIONNAIRE, code);
        if ("QuestionnaireResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.QUESTIONNAIRERESPONSE, code);
        if ("RegulatedAuthorization".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.REGULATEDAUTHORIZATION, code);
        if ("RelatedPerson".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RELATEDPERSON, code);
        if ("RequestOrchestration".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.REQUESTORCHESTRATION, code);
        if ("Requirements".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.REQUIREMENTS, code);
        if ("ResearchStudy".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RESEARCHSTUDY, code);
        if ("ResearchSubject".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RESEARCHSUBJECT, code);
        if ("Resource".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RESOURCE, code);
        if ("RiskAssessment".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RISKASSESSMENT, code);
        if ("Schedule".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SCHEDULE, code);
        if ("SearchParameter".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SEARCHPARAMETER, code);
        if ("ServiceRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SERVICEREQUEST, code);
        if ("Slot".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SLOT, code);
        if ("Specimen".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SPECIMEN, code);
        if ("SpecimenDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SPECIMENDEFINITION, code);
        if ("StructureDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.STRUCTUREDEFINITION, code);
        if ("StructureMap".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.STRUCTUREMAP, code);
        if ("Subscription".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SUBSCRIPTION, code);
        if ("SubscriptionStatus".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SUBSCRIPTIONSTATUS, code);
        if ("SubscriptionTopic".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SUBSCRIPTIONTOPIC, code);
        if ("Substance".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SUBSTANCE, code);
        if ("SubstanceDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SUBSTANCEDEFINITION, code);
        if ("Task".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.TASK, code);
        if ("TerminologyCapabilities".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.TERMINOLOGYCAPABILITIES, code);
        if ("ValueSet".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.VALUESET, code);
        if ("VisionPrescription".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.VISIONPRESCRIPTION, code);
        if ("BodySite".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.BODYSITE, code);
        if ("CatalogEntry".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CATALOGENTRY, code);
        if ("Conformance".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.CONFORMANCE, code);
        if ("DataElement".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DATAELEMENT, code);
        if ("DeviceComponent".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICECOMPONENT, code);
        if ("DeviceUseRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEUSEREQUEST, code);
        if ("DeviceUseStatement".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DEVICEUSESTATEMENT, code);
        if ("DiagnosticOrder".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DIAGNOSTICORDER, code);
        if ("DocumentManifest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.DOCUMENTMANIFEST, code);
        if ("EffectEvidenceSynthesis".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EFFECTEVIDENCESYNTHESIS, code);
        if ("EligibilityRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ELIGIBILITYREQUEST, code);
        if ("EligibilityResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ELIGIBILITYRESPONSE, code);
        if ("ExpansionProfile".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.EXPANSIONPROFILE, code);
        if ("ImagingManifest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.IMAGINGMANIFEST, code);
        if ("ImagingObjectSelection".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.IMAGINGOBJECTSELECTION, code);
        if ("Media".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDIA, code);
        if ("MedicationOrder".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATIONORDER, code);
        if ("MedicationUsage".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICATIONUSAGE, code);
        if ("MedicinalProduct".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCT, code);
        if ("MedicinalProductAuthorization".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTAUTHORIZATION, code);
        if ("MedicinalProductContraindication".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTCONTRAINDICATION, code);
        if ("MedicinalProductIndication".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTINDICATION, code);
        if ("MedicinalProductIngredient".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTINGREDIENT, code);
        if ("MedicinalProductInteraction".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTINTERACTION, code);
        if ("MedicinalProductManufactured".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTMANUFACTURED, code);
        if ("MedicinalProductPackaged".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTPACKAGED, code);
        if ("MedicinalProductPharmaceutical".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTPHARMACEUTICAL, code);
        if ("MedicinalProductUndesirableEffect".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.MEDICINALPRODUCTUNDESIRABLEEFFECT, code);
        if ("Order".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ORDER, code);
        if ("OrderResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.ORDERRESPONSE, code);
        if ("ProcedureRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PROCEDUREREQUEST, code);
        if ("ProcessRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PROCESSREQUEST, code);
        if ("ProcessResponse".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.PROCESSRESPONSE, code);
        if ("ReferralRequest".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.REFERRALREQUEST, code);
        if ("RequestGroup".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.REQUESTGROUP, code);
        if ("ResearchDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RESEARCHDEFINITION, code);
        if ("ResearchElementDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RESEARCHELEMENTDEFINITION, code);
        if ("RiskEvidenceSynthesis".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.RISKEVIDENCESYNTHESIS, code);
        if ("Sequence".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SEQUENCE, code);
        if ("ServiceDefinition".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SERVICEDEFINITION, code);
        if ("SubstanceSpecification".equals(codeString))
          return new Enumeration<VersionIndependentResourceTypesAll>(this, VersionIndependentResourceTypesAll.SUBSTANCESPECIFICATION, code);
        throw new FHIRException("Unknown VersionIndependentResourceTypesAll code '"+codeString+"'");
        }
    public String toCode(VersionIndependentResourceTypesAll code) {
      if (code == VersionIndependentResourceTypesAll.ACCOUNT)
        return "Account";
      if (code == VersionIndependentResourceTypesAll.ACTIVITYDEFINITION)
        return "ActivityDefinition";
      if (code == VersionIndependentResourceTypesAll.ACTORDEFINITION)
        return "ActorDefinition";
      if (code == VersionIndependentResourceTypesAll.ADMINISTRABLEPRODUCTDEFINITION)
        return "AdministrableProductDefinition";
      if (code == VersionIndependentResourceTypesAll.ADVERSEEVENT)
        return "AdverseEvent";
      if (code == VersionIndependentResourceTypesAll.ALLERGYINTOLERANCE)
        return "AllergyIntolerance";
      if (code == VersionIndependentResourceTypesAll.APPOINTMENT)
        return "Appointment";
      if (code == VersionIndependentResourceTypesAll.APPOINTMENTRESPONSE)
        return "AppointmentResponse";
      if (code == VersionIndependentResourceTypesAll.ARTIFACTASSESSMENT)
        return "ArtifactAssessment";
      if (code == VersionIndependentResourceTypesAll.AUDITEVENT)
        return "AuditEvent";
      if (code == VersionIndependentResourceTypesAll.BASIC)
        return "Basic";
      if (code == VersionIndependentResourceTypesAll.BINARY)
        return "Binary";
      if (code == VersionIndependentResourceTypesAll.BIOLOGICALLYDERIVEDPRODUCT)
        return "BiologicallyDerivedProduct";
      if (code == VersionIndependentResourceTypesAll.BODYSTRUCTURE)
        return "BodyStructure";
      if (code == VersionIndependentResourceTypesAll.BUNDLE)
        return "Bundle";
      if (code == VersionIndependentResourceTypesAll.CANONICALRESOURCE)
        return "CanonicalResource";
      if (code == VersionIndependentResourceTypesAll.CAPABILITYSTATEMENT)
        return "CapabilityStatement";
      if (code == VersionIndependentResourceTypesAll.CAREPLAN)
        return "CarePlan";
      if (code == VersionIndependentResourceTypesAll.CARETEAM)
        return "CareTeam";
      if (code == VersionIndependentResourceTypesAll.CLAIM)
        return "Claim";
      if (code == VersionIndependentResourceTypesAll.CLAIMRESPONSE)
        return "ClaimResponse";
      if (code == VersionIndependentResourceTypesAll.CLINICALUSEDEFINITION)
        return "ClinicalUseDefinition";
      if (code == VersionIndependentResourceTypesAll.CODESYSTEM)
        return "CodeSystem";
      if (code == VersionIndependentResourceTypesAll.COMMUNICATION)
        return "Communication";
      if (code == VersionIndependentResourceTypesAll.COMMUNICATIONREQUEST)
        return "CommunicationRequest";
      if (code == VersionIndependentResourceTypesAll.COMPARTMENTDEFINITION)
        return "CompartmentDefinition";
      if (code == VersionIndependentResourceTypesAll.COMPOSITION)
        return "Composition";
      if (code == VersionIndependentResourceTypesAll.CONCEPTMAP)
        return "ConceptMap";
      if (code == VersionIndependentResourceTypesAll.CONDITION)
        return "Condition";
      if (code == VersionIndependentResourceTypesAll.CONSENT)
        return "Consent";
      if (code == VersionIndependentResourceTypesAll.CONTRACT)
        return "Contract";
      if (code == VersionIndependentResourceTypesAll.COVERAGE)
        return "Coverage";
      if (code == VersionIndependentResourceTypesAll.COVERAGEELIGIBILITYREQUEST)
        return "CoverageEligibilityRequest";
      if (code == VersionIndependentResourceTypesAll.COVERAGEELIGIBILITYRESPONSE)
        return "CoverageEligibilityResponse";
      if (code == VersionIndependentResourceTypesAll.DETECTEDISSUE)
        return "DetectedIssue";
      if (code == VersionIndependentResourceTypesAll.DEVICE)
        return "Device";
      if (code == VersionIndependentResourceTypesAll.DEVICEALERT)
        return "DeviceAlert";
      if (code == VersionIndependentResourceTypesAll.DEVICEASSOCIATION)
        return "DeviceAssociation";
      if (code == VersionIndependentResourceTypesAll.DEVICEDEFINITION)
        return "DeviceDefinition";
      if (code == VersionIndependentResourceTypesAll.DEVICEMETRIC)
        return "DeviceMetric";
      if (code == VersionIndependentResourceTypesAll.DEVICEREQUEST)
        return "DeviceRequest";
      if (code == VersionIndependentResourceTypesAll.DIAGNOSTICREPORT)
        return "DiagnosticReport";
      if (code == VersionIndependentResourceTypesAll.DOCUMENTREFERENCE)
        return "DocumentReference";
      if (code == VersionIndependentResourceTypesAll.DOMAINRESOURCE)
        return "DomainResource";
      if (code == VersionIndependentResourceTypesAll.ENCOUNTER)
        return "Encounter";
      if (code == VersionIndependentResourceTypesAll.ENDPOINT)
        return "Endpoint";
      if (code == VersionIndependentResourceTypesAll.ENROLLMENTREQUEST)
        return "EnrollmentRequest";
      if (code == VersionIndependentResourceTypesAll.ENROLLMENTRESPONSE)
        return "EnrollmentResponse";
      if (code == VersionIndependentResourceTypesAll.EPISODEOFCARE)
        return "EpisodeOfCare";
      if (code == VersionIndependentResourceTypesAll.EVENTDEFINITION)
        return "EventDefinition";
      if (code == VersionIndependentResourceTypesAll.EVIDENCE)
        return "Evidence";
      if (code == VersionIndependentResourceTypesAll.EVIDENCEVARIABLE)
        return "EvidenceVariable";
      if (code == VersionIndependentResourceTypesAll.EXAMPLESCENARIO)
        return "ExampleScenario";
      if (code == VersionIndependentResourceTypesAll.EXPLANATIONOFBENEFIT)
        return "ExplanationOfBenefit";
      if (code == VersionIndependentResourceTypesAll.FAMILYMEMBERHISTORY)
        return "FamilyMemberHistory";
      if (code == VersionIndependentResourceTypesAll.FLAG)
        return "Flag";
      if (code == VersionIndependentResourceTypesAll.GOAL)
        return "Goal";
      if (code == VersionIndependentResourceTypesAll.GROUP)
        return "Group";
      if (code == VersionIndependentResourceTypesAll.GUIDANCERESPONSE)
        return "GuidanceResponse";
      if (code == VersionIndependentResourceTypesAll.HEALTHCARESERVICE)
        return "HealthcareService";
      if (code == VersionIndependentResourceTypesAll.IMAGINGSELECTION)
        return "ImagingSelection";
      if (code == VersionIndependentResourceTypesAll.IMAGINGSTUDY)
        return "ImagingStudy";
      if (code == VersionIndependentResourceTypesAll.IMMUNIZATION)
        return "Immunization";
      if (code == VersionIndependentResourceTypesAll.IMPLEMENTATIONGUIDE)
        return "ImplementationGuide";
      if (code == VersionIndependentResourceTypesAll.INGREDIENT)
        return "Ingredient";
      if (code == VersionIndependentResourceTypesAll.INSURANCEPLAN)
        return "InsurancePlan";
      if (code == VersionIndependentResourceTypesAll.INSURANCEPRODUCT)
        return "InsuranceProduct";
      if (code == VersionIndependentResourceTypesAll.INVOICE)
        return "Invoice";
      if (code == VersionIndependentResourceTypesAll.LIBRARY)
        return "Library";
      if (code == VersionIndependentResourceTypesAll.LIST)
        return "List";
      if (code == VersionIndependentResourceTypesAll.LOCATION)
        return "Location";
      if (code == VersionIndependentResourceTypesAll.MANUFACTUREDITEMDEFINITION)
        return "ManufacturedItemDefinition";
      if (code == VersionIndependentResourceTypesAll.MEASURE)
        return "Measure";
      if (code == VersionIndependentResourceTypesAll.MEASUREREPORT)
        return "MeasureReport";
      if (code == VersionIndependentResourceTypesAll.MEDICATION)
        return "Medication";
      if (code == VersionIndependentResourceTypesAll.MEDICATIONADMINISTRATION)
        return "MedicationAdministration";
      if (code == VersionIndependentResourceTypesAll.MEDICATIONDISPENSE)
        return "MedicationDispense";
      if (code == VersionIndependentResourceTypesAll.MEDICATIONREQUEST)
        return "MedicationRequest";
      if (code == VersionIndependentResourceTypesAll.MEDICATIONSTATEMENT)
        return "MedicationStatement";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTDEFINITION)
        return "MedicinalProductDefinition";
      if (code == VersionIndependentResourceTypesAll.MESSAGEDEFINITION)
        return "MessageDefinition";
      if (code == VersionIndependentResourceTypesAll.MESSAGEHEADER)
        return "MessageHeader";
      if (code == VersionIndependentResourceTypesAll.METADATARESOURCE)
        return "MetadataResource";
      if (code == VersionIndependentResourceTypesAll.NAMINGSYSTEM)
        return "NamingSystem";
      if (code == VersionIndependentResourceTypesAll.NUTRITIONINTAKE)
        return "NutritionIntake";
      if (code == VersionIndependentResourceTypesAll.NUTRITIONORDER)
        return "NutritionOrder";
      if (code == VersionIndependentResourceTypesAll.NUTRITIONPRODUCT)
        return "NutritionProduct";
      if (code == VersionIndependentResourceTypesAll.OBSERVATION)
        return "Observation";
      if (code == VersionIndependentResourceTypesAll.OBSERVATIONDEFINITION)
        return "ObservationDefinition";
      if (code == VersionIndependentResourceTypesAll.OPERATIONDEFINITION)
        return "OperationDefinition";
      if (code == VersionIndependentResourceTypesAll.OPERATIONOUTCOME)
        return "OperationOutcome";
      if (code == VersionIndependentResourceTypesAll.ORGANIZATION)
        return "Organization";
      if (code == VersionIndependentResourceTypesAll.ORGANIZATIONAFFILIATION)
        return "OrganizationAffiliation";
      if (code == VersionIndependentResourceTypesAll.PACKAGEDPRODUCTDEFINITION)
        return "PackagedProductDefinition";
      if (code == VersionIndependentResourceTypesAll.PARAMETERS)
        return "Parameters";
      if (code == VersionIndependentResourceTypesAll.PATIENT)
        return "Patient";
      if (code == VersionIndependentResourceTypesAll.PAYMENTNOTICE)
        return "PaymentNotice";
      if (code == VersionIndependentResourceTypesAll.PAYMENTRECONCILIATION)
        return "PaymentReconciliation";
      if (code == VersionIndependentResourceTypesAll.PERSON)
        return "Person";
      if (code == VersionIndependentResourceTypesAll.PLANDEFINITION)
        return "PlanDefinition";
      if (code == VersionIndependentResourceTypesAll.PRACTITIONER)
        return "Practitioner";
      if (code == VersionIndependentResourceTypesAll.PRACTITIONERROLE)
        return "PractitionerRole";
      if (code == VersionIndependentResourceTypesAll.PROCEDURE)
        return "Procedure";
      if (code == VersionIndependentResourceTypesAll.PROVENANCE)
        return "Provenance";
      if (code == VersionIndependentResourceTypesAll.QUESTIONNAIRE)
        return "Questionnaire";
      if (code == VersionIndependentResourceTypesAll.QUESTIONNAIRERESPONSE)
        return "QuestionnaireResponse";
      if (code == VersionIndependentResourceTypesAll.REGULATEDAUTHORIZATION)
        return "RegulatedAuthorization";
      if (code == VersionIndependentResourceTypesAll.RELATEDPERSON)
        return "RelatedPerson";
      if (code == VersionIndependentResourceTypesAll.REQUESTORCHESTRATION)
        return "RequestOrchestration";
      if (code == VersionIndependentResourceTypesAll.REQUIREMENTS)
        return "Requirements";
      if (code == VersionIndependentResourceTypesAll.RESEARCHSTUDY)
        return "ResearchStudy";
      if (code == VersionIndependentResourceTypesAll.RESEARCHSUBJECT)
        return "ResearchSubject";
      if (code == VersionIndependentResourceTypesAll.RESOURCE)
        return "Resource";
      if (code == VersionIndependentResourceTypesAll.RISKASSESSMENT)
        return "RiskAssessment";
      if (code == VersionIndependentResourceTypesAll.SCHEDULE)
        return "Schedule";
      if (code == VersionIndependentResourceTypesAll.SEARCHPARAMETER)
        return "SearchParameter";
      if (code == VersionIndependentResourceTypesAll.SERVICEREQUEST)
        return "ServiceRequest";
      if (code == VersionIndependentResourceTypesAll.SLOT)
        return "Slot";
      if (code == VersionIndependentResourceTypesAll.SPECIMEN)
        return "Specimen";
      if (code == VersionIndependentResourceTypesAll.SPECIMENDEFINITION)
        return "SpecimenDefinition";
      if (code == VersionIndependentResourceTypesAll.STRUCTUREDEFINITION)
        return "StructureDefinition";
      if (code == VersionIndependentResourceTypesAll.STRUCTUREMAP)
        return "StructureMap";
      if (code == VersionIndependentResourceTypesAll.SUBSCRIPTION)
        return "Subscription";
      if (code == VersionIndependentResourceTypesAll.SUBSCRIPTIONSTATUS)
        return "SubscriptionStatus";
      if (code == VersionIndependentResourceTypesAll.SUBSCRIPTIONTOPIC)
        return "SubscriptionTopic";
      if (code == VersionIndependentResourceTypesAll.SUBSTANCE)
        return "Substance";
      if (code == VersionIndependentResourceTypesAll.SUBSTANCEDEFINITION)
        return "SubstanceDefinition";
      if (code == VersionIndependentResourceTypesAll.TASK)
        return "Task";
      if (code == VersionIndependentResourceTypesAll.TERMINOLOGYCAPABILITIES)
        return "TerminologyCapabilities";
      if (code == VersionIndependentResourceTypesAll.VALUESET)
        return "ValueSet";
      if (code == VersionIndependentResourceTypesAll.VISIONPRESCRIPTION)
        return "VisionPrescription";
      if (code == VersionIndependentResourceTypesAll.BODYSITE)
        return "BodySite";
      if (code == VersionIndependentResourceTypesAll.CATALOGENTRY)
        return "CatalogEntry";
      if (code == VersionIndependentResourceTypesAll.CONFORMANCE)
        return "Conformance";
      if (code == VersionIndependentResourceTypesAll.DATAELEMENT)
        return "DataElement";
      if (code == VersionIndependentResourceTypesAll.DEVICECOMPONENT)
        return "DeviceComponent";
      if (code == VersionIndependentResourceTypesAll.DEVICEUSEREQUEST)
        return "DeviceUseRequest";
      if (code == VersionIndependentResourceTypesAll.DEVICEUSESTATEMENT)
        return "DeviceUseStatement";
      if (code == VersionIndependentResourceTypesAll.DIAGNOSTICORDER)
        return "DiagnosticOrder";
      if (code == VersionIndependentResourceTypesAll.DOCUMENTMANIFEST)
        return "DocumentManifest";
      if (code == VersionIndependentResourceTypesAll.EFFECTEVIDENCESYNTHESIS)
        return "EffectEvidenceSynthesis";
      if (code == VersionIndependentResourceTypesAll.ELIGIBILITYREQUEST)
        return "EligibilityRequest";
      if (code == VersionIndependentResourceTypesAll.ELIGIBILITYRESPONSE)
        return "EligibilityResponse";
      if (code == VersionIndependentResourceTypesAll.EXPANSIONPROFILE)
        return "ExpansionProfile";
      if (code == VersionIndependentResourceTypesAll.IMAGINGMANIFEST)
        return "ImagingManifest";
      if (code == VersionIndependentResourceTypesAll.IMAGINGOBJECTSELECTION)
        return "ImagingObjectSelection";
      if (code == VersionIndependentResourceTypesAll.MEDIA)
        return "Media";
      if (code == VersionIndependentResourceTypesAll.MEDICATIONORDER)
        return "MedicationOrder";
      if (code == VersionIndependentResourceTypesAll.MEDICATIONUSAGE)
        return "MedicationUsage";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCT)
        return "MedicinalProduct";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTAUTHORIZATION)
        return "MedicinalProductAuthorization";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTCONTRAINDICATION)
        return "MedicinalProductContraindication";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTINDICATION)
        return "MedicinalProductIndication";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTINGREDIENT)
        return "MedicinalProductIngredient";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTINTERACTION)
        return "MedicinalProductInteraction";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTMANUFACTURED)
        return "MedicinalProductManufactured";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTPACKAGED)
        return "MedicinalProductPackaged";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTPHARMACEUTICAL)
        return "MedicinalProductPharmaceutical";
      if (code == VersionIndependentResourceTypesAll.MEDICINALPRODUCTUNDESIRABLEEFFECT)
        return "MedicinalProductUndesirableEffect";
      if (code == VersionIndependentResourceTypesAll.ORDER)
        return "Order";
      if (code == VersionIndependentResourceTypesAll.ORDERRESPONSE)
        return "OrderResponse";
      if (code == VersionIndependentResourceTypesAll.PROCEDUREREQUEST)
        return "ProcedureRequest";
      if (code == VersionIndependentResourceTypesAll.PROCESSREQUEST)
        return "ProcessRequest";
      if (code == VersionIndependentResourceTypesAll.PROCESSRESPONSE)
        return "ProcessResponse";
      if (code == VersionIndependentResourceTypesAll.REFERRALREQUEST)
        return "ReferralRequest";
      if (code == VersionIndependentResourceTypesAll.REQUESTGROUP)
        return "RequestGroup";
      if (code == VersionIndependentResourceTypesAll.RESEARCHDEFINITION)
        return "ResearchDefinition";
      if (code == VersionIndependentResourceTypesAll.RESEARCHELEMENTDEFINITION)
        return "ResearchElementDefinition";
      if (code == VersionIndependentResourceTypesAll.RISKEVIDENCESYNTHESIS)
        return "RiskEvidenceSynthesis";
      if (code == VersionIndependentResourceTypesAll.SEQUENCE)
        return "Sequence";
      if (code == VersionIndependentResourceTypesAll.SERVICEDEFINITION)
        return "ServiceDefinition";
      if (code == VersionIndependentResourceTypesAll.SUBSTANCESPECIFICATION)
        return "SubstanceSpecification";
      return "?";
      }
    public String toSystem(VersionIndependentResourceTypesAll code) {
      return code.getSystem();
      }
    }



// R6 stub enums - value set expansions not available in ballot4 package

  public enum EvidenceVariableHandling {
        CONTINUOUS, DICHOTOMOUS, ORDINAL, POLYCHOTOMOUS, NULL;
        public static EvidenceVariableHandling fromCode(String codeString) throws org.hl7.fhir.exceptions.FHIRException {
            if (codeString == null || "".equals(codeString)) return NULL;
            if ("continuous".equals(codeString)) return CONTINUOUS;
            if ("dichotomous".equals(codeString)) return DICHOTOMOUS;
            if ("ordinal".equals(codeString)) return ORDINAL;
            if ("polychotomous".equals(codeString)) return POLYCHOTOMOUS;
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown EvidenceVariableHandling code '"+codeString+"'");
        }
        public String toCode() {
            switch (this) {
                case CONTINUOUS: return "continuous";
                case DICHOTOMOUS: return "dichotomous";
                case ORDINAL: return "ordinal";
                case POLYCHOTOMOUS: return "polychotomous";
                default: return "?";
            }
        }
        public String getDisplay() { return toCode(); }
        public String getDefinition() { return toCode(); }
        public String getSystem() { return "http://hl7.org/fhir/evidence-variable-handling"; }
  }
  public static class EvidenceVariableHandlingEnumFactory implements EnumFactory<EvidenceVariableHandling> {
        public EvidenceVariableHandling fromCode(String codeString) throws IllegalArgumentException {
            try { return EvidenceVariableHandling.fromCode(codeString); }
            catch (org.hl7.fhir.exceptions.FHIRException e) { throw new IllegalArgumentException(e.getMessage(), e); }
        }
        public Enumeration<EvidenceVariableHandling> fromType(PrimitiveType<?> code) throws org.hl7.fhir.exceptions.FHIRException {
            if (code == null) return null;
            if (code.isEmpty()) return new Enumeration<EvidenceVariableHandling>(this, EvidenceVariableHandling.NULL, code);
            String codeString = ((PrimitiveType) code).asStringValue();
            if (codeString == null || "".equals(codeString)) return new Enumeration<EvidenceVariableHandling>(this, EvidenceVariableHandling.NULL, code);
            if ("continuous".equals(codeString)) return new Enumeration<EvidenceVariableHandling>(this, EvidenceVariableHandling.CONTINUOUS, code);
            if ("dichotomous".equals(codeString)) return new Enumeration<EvidenceVariableHandling>(this, EvidenceVariableHandling.DICHOTOMOUS, code);
            if ("ordinal".equals(codeString)) return new Enumeration<EvidenceVariableHandling>(this, EvidenceVariableHandling.ORDINAL, code);
            if ("polychotomous".equals(codeString)) return new Enumeration<EvidenceVariableHandling>(this, EvidenceVariableHandling.POLYCHOTOMOUS, code);
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown EvidenceVariableHandling code '"+codeString+"'");
        }
        public String toCode(EvidenceVariableHandling code) { return code.toCode(); }
        public String toSystem(EvidenceVariableHandling code) { return code.getSystem(); }
  }

  public enum ValueFilterComparator {
        EQ, GT, LT, GE, LE, SA, EB, NULL;
        public static ValueFilterComparator fromCode(String codeString) throws org.hl7.fhir.exceptions.FHIRException {
            if (codeString == null || "".equals(codeString)) return NULL;
            if ("eq".equals(codeString)) return EQ;
            if ("gt".equals(codeString)) return GT;
            if ("lt".equals(codeString)) return LT;
            if ("ge".equals(codeString)) return GE;
            if ("le".equals(codeString)) return LE;
            if ("sa".equals(codeString)) return SA;
            if ("eb".equals(codeString)) return EB;
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown ValueFilterComparator code '"+codeString+"'");
        }
        public String toCode() {
            switch (this) {
                case EQ: return "eq"; case GT: return "gt"; case LT: return "lt";
                case GE: return "ge"; case LE: return "le"; case SA: return "sa"; case EB: return "eb";
                default: return "?";
            }
        }
        public String getDisplay() { return toCode(); }
        public String getDefinition() { return toCode(); }
        public String getSystem() { return "http://hl7.org/fhir/search-comparator"; }
  }
  public static class ValueFilterComparatorEnumFactory implements EnumFactory<ValueFilterComparator> {
        public ValueFilterComparator fromCode(String codeString) throws IllegalArgumentException {
            try { return ValueFilterComparator.fromCode(codeString); }
            catch (org.hl7.fhir.exceptions.FHIRException e) { throw new IllegalArgumentException(e.getMessage(), e); }
        }
        public Enumeration<ValueFilterComparator> fromType(PrimitiveType<?> code) throws org.hl7.fhir.exceptions.FHIRException {
            if (code == null) return null;
            if (code.isEmpty()) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.NULL, code);
            String codeString = ((PrimitiveType) code).asStringValue();
            if (codeString == null || "".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.NULL, code);
            if ("eq".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.EQ, code);
            if ("gt".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.GT, code);
            if ("lt".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.LT, code);
            if ("ge".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.GE, code);
            if ("le".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.LE, code);
            if ("sa".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.SA, code);
            if ("eb".equals(codeString)) return new Enumeration<ValueFilterComparator>(this, ValueFilterComparator.EB, code);
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown ValueFilterComparator code '"+codeString+"'");
        }
        public String toCode(ValueFilterComparator code) { return code.toCode(); }
        public String toSystem(ValueFilterComparator code) { return code.getSystem(); }
  }

  public enum OperationSynchronicityControl {
        SYNCHRONOUS, ASYNCHRONOUS, EITHER, NULL;
        public static OperationSynchronicityControl fromCode(String codeString) throws org.hl7.fhir.exceptions.FHIRException {
            if (codeString == null || "".equals(codeString)) return NULL;
            if ("synchronous".equals(codeString)) return SYNCHRONOUS;
            if ("asynchronous".equals(codeString)) return ASYNCHRONOUS;
            if ("either".equals(codeString)) return EITHER;
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown OperationSynchronicityControl code '"+codeString+"'");
        }
        public String toCode() {
            switch (this) {
                case SYNCHRONOUS: return "synchronous";
                case ASYNCHRONOUS: return "asynchronous";
                case EITHER: return "either";
                default: return "?";
            }
        }
        public String getDisplay() { return toCode(); }
        public String getDefinition() { return toCode(); }
        public String getSystem() { return "http://hl7.org/fhir/synchronicity-control"; }
  }
  public static class OperationSynchronicityControlEnumFactory implements EnumFactory<OperationSynchronicityControl> {
        public OperationSynchronicityControl fromCode(String codeString) throws IllegalArgumentException {
            try { return OperationSynchronicityControl.fromCode(codeString); }
            catch (org.hl7.fhir.exceptions.FHIRException e) { throw new IllegalArgumentException(e.getMessage(), e); }
        }
        public Enumeration<OperationSynchronicityControl> fromType(PrimitiveType<?> code) throws org.hl7.fhir.exceptions.FHIRException {
            if (code == null) return null;
            if (code.isEmpty()) return new Enumeration<OperationSynchronicityControl>(this, OperationSynchronicityControl.NULL, code);
            String codeString = ((PrimitiveType) code).asStringValue();
            if (codeString == null || "".equals(codeString)) return new Enumeration<OperationSynchronicityControl>(this, OperationSynchronicityControl.NULL, code);
            if ("synchronous".equals(codeString)) return new Enumeration<OperationSynchronicityControl>(this, OperationSynchronicityControl.SYNCHRONOUS, code);
            if ("asynchronous".equals(codeString)) return new Enumeration<OperationSynchronicityControl>(this, OperationSynchronicityControl.ASYNCHRONOUS, code);
            if ("either".equals(codeString)) return new Enumeration<OperationSynchronicityControl>(this, OperationSynchronicityControl.EITHER, code);
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown OperationSynchronicityControl code '"+codeString+"'");
        }
        public String toCode(OperationSynchronicityControl code) { return code.toCode(); }
        public String toSystem(OperationSynchronicityControl code) { return code.getSystem(); }
  }

  public enum ExampleScenarioActorType {
        PERSON, SYSTEM, NULL;
        public static ExampleScenarioActorType fromCode(String codeString) throws org.hl7.fhir.exceptions.FHIRException {
            if (codeString == null || "".equals(codeString)) return null;
            if ("person".equals(codeString)) return PERSON;
            if ("system".equals(codeString)) return SYSTEM;
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown ExampleScenarioActorType code '"+codeString+"'");
        }
        public String toCode() {
            switch (this) {
                case PERSON: return "person";
                case SYSTEM: return "system";
                default: return "?";
            }
        }
        public String getDisplay() { return toCode(); }
        public String getDefinition() { return toCode(); }
        public String getSystem() { return "http://hl7.org/fhir/examplescenario-actor-type"; }
  }
  public static class ExampleScenarioActorTypeEnumFactory implements EnumFactory<ExampleScenarioActorType> {
        public ExampleScenarioActorType fromCode(String codeString) throws IllegalArgumentException {
            try { return ExampleScenarioActorType.fromCode(codeString); }
            catch (org.hl7.fhir.exceptions.FHIRException e) { throw new IllegalArgumentException(e.getMessage(), e); }
        }
        public Enumeration<ExampleScenarioActorType> fromType(PrimitiveType<?> code) throws org.hl7.fhir.exceptions.FHIRException {
            if (code == null) return null;
            if (code.isEmpty()) return new Enumeration<ExampleScenarioActorType>(this, ExampleScenarioActorType.NULL, code);
            String codeString = ((PrimitiveType) code).asStringValue();
            if (codeString == null || "".equals(codeString)) return new Enumeration<ExampleScenarioActorType>(this, ExampleScenarioActorType.NULL, code);
            if ("person".equals(codeString)) return new Enumeration<ExampleScenarioActorType>(this, ExampleScenarioActorType.PERSON, code);
            if ("system".equals(codeString)) return new Enumeration<ExampleScenarioActorType>(this, ExampleScenarioActorType.SYSTEM, code);
            throw new org.hl7.fhir.exceptions.FHIRException("Unknown ExampleScenarioActorType code '"+codeString+"'");
        }
        public String toCode(ExampleScenarioActorType code) { return code.toCode(); }
        public String toSystem(ExampleScenarioActorType code) { return code.getSystem(); }
  }

}
