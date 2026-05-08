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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r6.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * Describes a physiological or technical alert condition report originated by a device.  The DeviceAlert resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable. 
 */
@ResourceDef(name="DeviceAlert", profile="http://hl7.org/fhir/StructureDefinition/DeviceAlert")
public class DeviceAlert extends DomainResource {

    public enum DeviceAlertStatusCodes {
        /**
         * The alert condition is present, or any signal from a previously present condition is not off
         */
        INPROGRESS, 
        /**
         * The alert condition is not present, and all signals are off
         */
        COMPLETED, 
        /**
         * This alert record was created in error and is not valid.
         */
        ENTEREDINERROR, 
        /**
         * The status of the alert is not known.
         */
        UNKNOWN, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static DeviceAlertStatusCodes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown DeviceAlertStatusCodes code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case INPROGRESS: return "in-progress";
            case COMPLETED: return "completed";
            case ENTEREDINERROR: return "entered-in-error";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case INPROGRESS: return "http://hl7.org/fhir/devicealert-status";
            case COMPLETED: return "http://hl7.org/fhir/devicealert-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/devicealert-status";
            case UNKNOWN: return "http://hl7.org/fhir/devicealert-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case INPROGRESS: return "The alert condition is present, or any signal from a previously present condition is not off";
            case COMPLETED: return "The alert condition is not present, and all signals are off";
            case ENTEREDINERROR: return "This alert record was created in error and is not valid.";
            case UNKNOWN: return "The status of the alert is not known.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case INPROGRESS: return "In Progress";
            case COMPLETED: return "Completed";
            case ENTEREDINERROR: return "Entered in Error";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class DeviceAlertStatusCodesEnumFactory implements EnumFactory<DeviceAlertStatusCodes> {
    public DeviceAlertStatusCodes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("in-progress".equals(codeString))
          return DeviceAlertStatusCodes.INPROGRESS;
        if ("completed".equals(codeString))
          return DeviceAlertStatusCodes.COMPLETED;
        if ("entered-in-error".equals(codeString))
          return DeviceAlertStatusCodes.ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return DeviceAlertStatusCodes.UNKNOWN;
        throw new IllegalArgumentException("Unknown DeviceAlertStatusCodes code '"+codeString+"'");
        }
        public Enumeration<DeviceAlertStatusCodes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<DeviceAlertStatusCodes>(this, DeviceAlertStatusCodes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<DeviceAlertStatusCodes>(this, DeviceAlertStatusCodes.NULL, code);
        if ("in-progress".equals(codeString))
          return new Enumeration<DeviceAlertStatusCodes>(this, DeviceAlertStatusCodes.INPROGRESS, code);
        if ("completed".equals(codeString))
          return new Enumeration<DeviceAlertStatusCodes>(this, DeviceAlertStatusCodes.COMPLETED, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<DeviceAlertStatusCodes>(this, DeviceAlertStatusCodes.ENTEREDINERROR, code);
        if ("unknown".equals(codeString))
          return new Enumeration<DeviceAlertStatusCodes>(this, DeviceAlertStatusCodes.UNKNOWN, code);
        throw new FHIRException("Unknown DeviceAlertStatusCodes code '"+codeString+"'");
        }
    public String toCode(DeviceAlertStatusCodes code) {
      if (code == DeviceAlertStatusCodes.INPROGRESS)
        return "in-progress";
      if (code == DeviceAlertStatusCodes.COMPLETED)
        return "completed";
      if (code == DeviceAlertStatusCodes.ENTEREDINERROR)
        return "entered-in-error";
      if (code == DeviceAlertStatusCodes.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(DeviceAlertStatusCodes code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class DeviceAlertDerivedFromComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Indicates the Observation whose value is causing the alert condition; or, if `component` is present, the Observation with a component causing the alert condition.
         */
        @Child(name = "observation", type = {Observation.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The Observation having a value causing the alert condition", formalDefinition="Indicates the Observation whose value is causing the alert condition; or, if `component` is present, the Observation with a component causing the alert condition." )
        protected Reference observation;

        /**
         * If applicable, the code of the component (of the Observation identified in `derivedFrom.observation`) having a value causing the alert condition. This might be used when the alert is associated with a specific component of an Observation, rather than the overall Observation; for example, a low diastolic blood pressure. Since the component is identified by matching `Observation.component.code`, if more than one component have the same code, the specific component is ambiguous. Repetitions of this element indicate additional components contributing to the alert condition.
         */
        @Child(name = "component", type = {Coding.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The Observation.component having a value causing the alert condition", formalDefinition="If applicable, the code of the component (of the Observation identified in `derivedFrom.observation`) having a value causing the alert condition. This might be used when the alert is associated with a specific component of an Observation, rather than the overall Observation; for example, a low diastolic blood pressure. Since the component is identified by matching `Observation.component.code`, if more than one component have the same code, the specific component is ambiguous. Repetitions of this element indicate additional components contributing to the alert condition." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/observation-codes")
        protected Coding component;

        /**
         * The limits beyond which a value was detected to cause the alert condition. The actual value is the `Observation.value[x]` referenced by `derivedFrom.observation` or, if specified, the `Observation.component.value[x]` of the component (with `Observation.component.code` matching `derivedFrom.component`) of the reference Observation.
         */
        @Child(name = "limit", type = {Range.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The boundaries beyond which a value was detected to cause the alert condition", formalDefinition="The limits beyond which a value was detected to cause the alert condition. The actual value is the `Observation.value[x]` referenced by `derivedFrom.observation` or, if specified, the `Observation.component.value[x]` of the component (with `Observation.component.code` matching `derivedFrom.component`) of the reference Observation." )
        protected Range limit;

        private static final long serialVersionUID = -137921314L;

    /**
     * Constructor
     */
      public DeviceAlertDerivedFromComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DeviceAlertDerivedFromComponent(Reference observation) {
        super();
        this.setObservation(observation);
      }

        /**
         * @return {@link #observation} (Indicates the Observation whose value is causing the alert condition; or, if `component` is present, the Observation with a component causing the alert condition.)
         */
        public Reference getObservation() { 
          if (this.observation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertDerivedFromComponent.observation");
            else if (Configuration.doAutoCreate())
              this.observation = new Reference(); // cc
          return this.observation;
        }

        public boolean hasObservation() { 
          return this.observation != null && !this.observation.isEmpty();
        }

        /**
         * @param value {@link #observation} (Indicates the Observation whose value is causing the alert condition; or, if `component` is present, the Observation with a component causing the alert condition.)
         */
        public DeviceAlertDerivedFromComponent setObservation(Reference value) { 
          this.observation = value;
          return this;
        }

        /**
         * @return {@link #component} (If applicable, the code of the component (of the Observation identified in `derivedFrom.observation`) having a value causing the alert condition. This might be used when the alert is associated with a specific component of an Observation, rather than the overall Observation; for example, a low diastolic blood pressure. Since the component is identified by matching `Observation.component.code`, if more than one component have the same code, the specific component is ambiguous. Repetitions of this element indicate additional components contributing to the alert condition.)
         */
        public Coding getComponent() { 
          if (this.component == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertDerivedFromComponent.component");
            else if (Configuration.doAutoCreate())
              this.component = new Coding(); // cc
          return this.component;
        }

        public boolean hasComponent() { 
          return this.component != null && !this.component.isEmpty();
        }

        /**
         * @param value {@link #component} (If applicable, the code of the component (of the Observation identified in `derivedFrom.observation`) having a value causing the alert condition. This might be used when the alert is associated with a specific component of an Observation, rather than the overall Observation; for example, a low diastolic blood pressure. Since the component is identified by matching `Observation.component.code`, if more than one component have the same code, the specific component is ambiguous. Repetitions of this element indicate additional components contributing to the alert condition.)
         */
        public DeviceAlertDerivedFromComponent setComponent(Coding value) { 
          this.component = value;
          return this;
        }

        /**
         * @return {@link #limit} (The limits beyond which a value was detected to cause the alert condition. The actual value is the `Observation.value[x]` referenced by `derivedFrom.observation` or, if specified, the `Observation.component.value[x]` of the component (with `Observation.component.code` matching `derivedFrom.component`) of the reference Observation.)
         */
        public Range getLimit() { 
          if (this.limit == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertDerivedFromComponent.limit");
            else if (Configuration.doAutoCreate())
              this.limit = new Range(); // cc
          return this.limit;
        }

        public boolean hasLimit() { 
          return this.limit != null && !this.limit.isEmpty();
        }

        /**
         * @param value {@link #limit} (The limits beyond which a value was detected to cause the alert condition. The actual value is the `Observation.value[x]` referenced by `derivedFrom.observation` or, if specified, the `Observation.component.value[x]` of the component (with `Observation.component.code` matching `derivedFrom.component`) of the reference Observation.)
         */
        public DeviceAlertDerivedFromComponent setLimit(Range value) { 
          this.limit = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("observation", "Reference(Observation)", "Indicates the Observation whose value is causing the alert condition; or, if `component` is present, the Observation with a component causing the alert condition.", 0, 1, observation));
          children.add(new Property("component", "Coding", "If applicable, the code of the component (of the Observation identified in `derivedFrom.observation`) having a value causing the alert condition. This might be used when the alert is associated with a specific component of an Observation, rather than the overall Observation; for example, a low diastolic blood pressure. Since the component is identified by matching `Observation.component.code`, if more than one component have the same code, the specific component is ambiguous. Repetitions of this element indicate additional components contributing to the alert condition.", 0, 1, component));
          children.add(new Property("limit", "Range", "The limits beyond which a value was detected to cause the alert condition. The actual value is the `Observation.value[x]` referenced by `derivedFrom.observation` or, if specified, the `Observation.component.value[x]` of the component (with `Observation.component.code` matching `derivedFrom.component`) of the reference Observation.", 0, 1, limit));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 122345516: /*observation*/  return new Property("observation", "Reference(Observation)", "Indicates the Observation whose value is causing the alert condition; or, if `component` is present, the Observation with a component causing the alert condition.", 0, 1, observation);
          case -1399907075: /*component*/  return new Property("component", "Coding", "If applicable, the code of the component (of the Observation identified in `derivedFrom.observation`) having a value causing the alert condition. This might be used when the alert is associated with a specific component of an Observation, rather than the overall Observation; for example, a low diastolic blood pressure. Since the component is identified by matching `Observation.component.code`, if more than one component have the same code, the specific component is ambiguous. Repetitions of this element indicate additional components contributing to the alert condition.", 0, 1, component);
          case 102976443: /*limit*/  return new Property("limit", "Range", "The limits beyond which a value was detected to cause the alert condition. The actual value is the `Observation.value[x]` referenced by `derivedFrom.observation` or, if specified, the `Observation.component.value[x]` of the component (with `Observation.component.code` matching `derivedFrom.component`) of the reference Observation.", 0, 1, limit);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 122345516: /*observation*/ return this.observation == null ? new Base[0] : new Base[] {this.observation}; // Reference
        case -1399907075: /*component*/ return this.component == null ? new Base[0] : new Base[] {this.component}; // Coding
        case 102976443: /*limit*/ return this.limit == null ? new Base[0] : new Base[] {this.limit}; // Range
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 122345516: // observation
          this.observation = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1399907075: // component
          this.component = TypeConvertor.castToCoding(value); // Coding
          return value;
        case 102976443: // limit
          this.limit = TypeConvertor.castToRange(value); // Range
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("observation")) {
          this.observation = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("component")) {
          this.component = TypeConvertor.castToCoding(value); // Coding
        } else if (name.equals("limit")) {
          this.limit = TypeConvertor.castToRange(value); // Range
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 122345516:  return getObservation();
        case -1399907075:  return getComponent();
        case 102976443:  return getLimit();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 122345516: /*observation*/ return new String[] {"Reference"};
        case -1399907075: /*component*/ return new String[] {"Coding"};
        case 102976443: /*limit*/ return new String[] {"Range"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("observation")) {
          this.observation = new Reference();
          return this.observation;
        }
        else if (name.equals("component")) {
          this.component = new Coding();
          return this.component;
        }
        else if (name.equals("limit")) {
          this.limit = new Range();
          return this.limit;
        }
        else
          return super.addChild(name);
      }

      public DeviceAlertDerivedFromComponent copy() {
        DeviceAlertDerivedFromComponent dst = new DeviceAlertDerivedFromComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DeviceAlertDerivedFromComponent dst) {
        super.copyValues(dst);
        dst.observation = observation == null ? null : observation.copy();
        dst.component = component == null ? null : component.copy();
        dst.limit = limit == null ? null : limit.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DeviceAlertDerivedFromComponent))
          return false;
        DeviceAlertDerivedFromComponent o = (DeviceAlertDerivedFromComponent) other_;
        return compareDeep(observation, o.observation, true) && compareDeep(component, o.component, true)
           && compareDeep(limit, o.limit, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DeviceAlertDerivedFromComponent))
          return false;
        DeviceAlertDerivedFromComponent o = (DeviceAlertDerivedFromComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(observation, component, limit
          );
      }

  public String fhirType() {
    return "DeviceAlert.derivedFrom";

  }

  }

    @Block()
    public static class DeviceAlertSignalComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Paused indicates that annunciation has temporarily been disabled ("snooze").
         */
        @Child(name = "activationState", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="on | off | paused", formalDefinition="Paused indicates that annunciation has temporarily been disabled (\"snooze\")." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-activationState")
        protected CodeableConcept activationState;

        /**
         * Indicates whether the signal is currently being annunciated. An on signal is currently being annunciated; a latched signal is currently being being annunciated although the alert condition has ended; an off signal is not currently being annunciated; and an acknowledged signal is not currently being annunciated because the user has acknowledged the signal.
         */
        @Child(name = "presence", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="on | latched | off | ack", formalDefinition="Indicates whether the signal is currently being annunciated. An on signal is currently being annunciated; a latched signal is currently being being annunciated although the alert condition has ended; an off signal is not currently being annunciated; and an acknowledged signal is not currently being annunciated because the user has acknowledged the signal." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-presence")
        protected CodeableConcept presence;

        /**
         * Signalling by the source device is local; signalling elsewhere is considered remote. A reference to the "top level" signalling device could also be present.
         */
        @Child(name = "annunciator", type = {CodeableReference.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Where the signal is being annunciated", formalDefinition="Signalling by the source device is local; signalling elsewhere is considered remote. A reference to the \"top level\" signalling device could also be present." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-annunciation")
        protected CodeableReference annunciator;

        /**
         * How the signal is being annunciated.
         */
        @Child(name = "manifestation", type = {CodeableConcept.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="How the signal is being annunciated", formalDefinition="How the signal is being annunciated." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-manifestation")
        protected CodeableConcept manifestation;

        /**
         * Details of the signal manifestation, such as a 1 meter visual indicator or a 4 meter visual indicator.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Characteristics of the signal manifestation", formalDefinition="Details of the signal manifestation, such as a 1 meter visual indicator or a 4 meter visual indicator." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-signalType")
        protected List<CodeableConcept> type;

        /**
         * The period during which the signal was being annunciated. If there is no indicated period end, the annunciation is on-going.
         */
        @Child(name = "indication", type = {Period.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When the signal was being annunciated", formalDefinition="The period during which the signal was being annunciated. If there is no indicated period end, the annunciation is on-going." )
        protected Period indication;

        private static final long serialVersionUID = 392945445L;

    /**
     * Constructor
     */
      public DeviceAlertSignalComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DeviceAlertSignalComponent(CodeableConcept activationState) {
        super();
        this.setActivationState(activationState);
      }

        /**
         * @return {@link #activationState} (Paused indicates that annunciation has temporarily been disabled ("snooze").)
         */
        public CodeableConcept getActivationState() { 
          if (this.activationState == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertSignalComponent.activationState");
            else if (Configuration.doAutoCreate())
              this.activationState = new CodeableConcept(); // cc
          return this.activationState;
        }

        public boolean hasActivationState() { 
          return this.activationState != null && !this.activationState.isEmpty();
        }

        /**
         * @param value {@link #activationState} (Paused indicates that annunciation has temporarily been disabled ("snooze").)
         */
        public DeviceAlertSignalComponent setActivationState(CodeableConcept value) { 
          this.activationState = value;
          return this;
        }

        /**
         * @return {@link #presence} (Indicates whether the signal is currently being annunciated. An on signal is currently being annunciated; a latched signal is currently being being annunciated although the alert condition has ended; an off signal is not currently being annunciated; and an acknowledged signal is not currently being annunciated because the user has acknowledged the signal.)
         */
        public CodeableConcept getPresence() { 
          if (this.presence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertSignalComponent.presence");
            else if (Configuration.doAutoCreate())
              this.presence = new CodeableConcept(); // cc
          return this.presence;
        }

        public boolean hasPresence() { 
          return this.presence != null && !this.presence.isEmpty();
        }

        /**
         * @param value {@link #presence} (Indicates whether the signal is currently being annunciated. An on signal is currently being annunciated; a latched signal is currently being being annunciated although the alert condition has ended; an off signal is not currently being annunciated; and an acknowledged signal is not currently being annunciated because the user has acknowledged the signal.)
         */
        public DeviceAlertSignalComponent setPresence(CodeableConcept value) { 
          this.presence = value;
          return this;
        }

        /**
         * @return {@link #annunciator} (Signalling by the source device is local; signalling elsewhere is considered remote. A reference to the "top level" signalling device could also be present.)
         */
        public CodeableReference getAnnunciator() { 
          if (this.annunciator == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertSignalComponent.annunciator");
            else if (Configuration.doAutoCreate())
              this.annunciator = new CodeableReference(); // cc
          return this.annunciator;
        }

        public boolean hasAnnunciator() { 
          return this.annunciator != null && !this.annunciator.isEmpty();
        }

        /**
         * @param value {@link #annunciator} (Signalling by the source device is local; signalling elsewhere is considered remote. A reference to the "top level" signalling device could also be present.)
         */
        public DeviceAlertSignalComponent setAnnunciator(CodeableReference value) { 
          this.annunciator = value;
          return this;
        }

        /**
         * @return {@link #manifestation} (How the signal is being annunciated.)
         */
        public CodeableConcept getManifestation() { 
          if (this.manifestation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertSignalComponent.manifestation");
            else if (Configuration.doAutoCreate())
              this.manifestation = new CodeableConcept(); // cc
          return this.manifestation;
        }

        public boolean hasManifestation() { 
          return this.manifestation != null && !this.manifestation.isEmpty();
        }

        /**
         * @param value {@link #manifestation} (How the signal is being annunciated.)
         */
        public DeviceAlertSignalComponent setManifestation(CodeableConcept value) { 
          this.manifestation = value;
          return this;
        }

        /**
         * @return {@link #type} (Details of the signal manifestation, such as a 1 meter visual indicator or a 4 meter visual indicator.)
         */
        public List<CodeableConcept> getType() { 
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          return this.type;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DeviceAlertSignalComponent setType(List<CodeableConcept> theType) { 
          this.type = theType;
          return this;
        }

        public boolean hasType() { 
          if (this.type == null)
            return false;
          for (CodeableConcept item : this.type)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addType() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          this.type.add(t);
          return t;
        }

        public DeviceAlertSignalComponent addType(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          this.type.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #type}, creating it if it does not already exist {3}
         */
        public CodeableConcept getTypeFirstRep() { 
          if (getType().isEmpty()) {
            addType();
          }
          return getType().get(0);
        }

        /**
         * @return {@link #indication} (The period during which the signal was being annunciated. If there is no indicated period end, the annunciation is on-going.)
         */
        public Period getIndication() { 
          if (this.indication == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceAlertSignalComponent.indication");
            else if (Configuration.doAutoCreate())
              this.indication = new Period(); // cc
          return this.indication;
        }

        public boolean hasIndication() { 
          return this.indication != null && !this.indication.isEmpty();
        }

        /**
         * @param value {@link #indication} (The period during which the signal was being annunciated. If there is no indicated period end, the annunciation is on-going.)
         */
        public DeviceAlertSignalComponent setIndication(Period value) { 
          this.indication = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("activationState", "CodeableConcept", "Paused indicates that annunciation has temporarily been disabled (\"snooze\").", 0, 1, activationState));
          children.add(new Property("presence", "CodeableConcept", "Indicates whether the signal is currently being annunciated. An on signal is currently being annunciated; a latched signal is currently being being annunciated although the alert condition has ended; an off signal is not currently being annunciated; and an acknowledged signal is not currently being annunciated because the user has acknowledged the signal.", 0, 1, presence));
          children.add(new Property("annunciator", "CodeableReference(Device)", "Signalling by the source device is local; signalling elsewhere is considered remote. A reference to the \"top level\" signalling device could also be present.", 0, 1, annunciator));
          children.add(new Property("manifestation", "CodeableConcept", "How the signal is being annunciated.", 0, 1, manifestation));
          children.add(new Property("type", "CodeableConcept", "Details of the signal manifestation, such as a 1 meter visual indicator or a 4 meter visual indicator.", 0, java.lang.Integer.MAX_VALUE, type));
          children.add(new Property("indication", "Period", "The period during which the signal was being annunciated. If there is no indicated period end, the annunciation is on-going.", 0, 1, indication));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 1276154139: /*activationState*/  return new Property("activationState", "CodeableConcept", "Paused indicates that annunciation has temporarily been disabled (\"snooze\").", 0, 1, activationState);
          case -1276666629: /*presence*/  return new Property("presence", "CodeableConcept", "Indicates whether the signal is currently being annunciated. An on signal is currently being annunciated; a latched signal is currently being being annunciated although the alert condition has ended; an off signal is not currently being annunciated; and an acknowledged signal is not currently being annunciated because the user has acknowledged the signal.", 0, 1, presence);
          case -77970570: /*annunciator*/  return new Property("annunciator", "CodeableReference(Device)", "Signalling by the source device is local; signalling elsewhere is considered remote. A reference to the \"top level\" signalling device could also be present.", 0, 1, annunciator);
          case 1115984422: /*manifestation*/  return new Property("manifestation", "CodeableConcept", "How the signal is being annunciated.", 0, 1, manifestation);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Details of the signal manifestation, such as a 1 meter visual indicator or a 4 meter visual indicator.", 0, java.lang.Integer.MAX_VALUE, type);
          case -597168804: /*indication*/  return new Property("indication", "Period", "The period during which the signal was being annunciated. If there is no indicated period end, the annunciation is on-going.", 0, 1, indication);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1276154139: /*activationState*/ return this.activationState == null ? new Base[0] : new Base[] {this.activationState}; // CodeableConcept
        case -1276666629: /*presence*/ return this.presence == null ? new Base[0] : new Base[] {this.presence}; // CodeableConcept
        case -77970570: /*annunciator*/ return this.annunciator == null ? new Base[0] : new Base[] {this.annunciator}; // CodeableReference
        case 1115984422: /*manifestation*/ return this.manifestation == null ? new Base[0] : new Base[] {this.manifestation}; // CodeableConcept
        case 3575610: /*type*/ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
        case -597168804: /*indication*/ return this.indication == null ? new Base[0] : new Base[] {this.indication}; // Period
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1276154139: // activationState
          this.activationState = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1276666629: // presence
          this.presence = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -77970570: // annunciator
          this.annunciator = TypeConvertor.castToCodeableReference(value); // CodeableReference
          return value;
        case 1115984422: // manifestation
          this.manifestation = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 3575610: // type
          this.getType().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -597168804: // indication
          this.indication = TypeConvertor.castToPeriod(value); // Period
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("activationState")) {
          this.activationState = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("presence")) {
          this.presence = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("annunciator")) {
          this.annunciator = TypeConvertor.castToCodeableReference(value); // CodeableReference
        } else if (name.equals("manifestation")) {
          this.manifestation = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("type")) {
          this.getType().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("indication")) {
          this.indication = TypeConvertor.castToPeriod(value); // Period
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1276154139:  return getActivationState();
        case -1276666629:  return getPresence();
        case -77970570:  return getAnnunciator();
        case 1115984422:  return getManifestation();
        case 3575610:  return addType(); 
        case -597168804:  return getIndication();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1276154139: /*activationState*/ return new String[] {"CodeableConcept"};
        case -1276666629: /*presence*/ return new String[] {"CodeableConcept"};
        case -77970570: /*annunciator*/ return new String[] {"CodeableReference"};
        case 1115984422: /*manifestation*/ return new String[] {"CodeableConcept"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -597168804: /*indication*/ return new String[] {"Period"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("activationState")) {
          this.activationState = new CodeableConcept();
          return this.activationState;
        }
        else if (name.equals("presence")) {
          this.presence = new CodeableConcept();
          return this.presence;
        }
        else if (name.equals("annunciator")) {
          this.annunciator = new CodeableReference();
          return this.annunciator;
        }
        else if (name.equals("manifestation")) {
          this.manifestation = new CodeableConcept();
          return this.manifestation;
        }
        else if (name.equals("type")) {
          return addType();
        }
        else if (name.equals("indication")) {
          this.indication = new Period();
          return this.indication;
        }
        else
          return super.addChild(name);
      }

      public DeviceAlertSignalComponent copy() {
        DeviceAlertSignalComponent dst = new DeviceAlertSignalComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DeviceAlertSignalComponent dst) {
        super.copyValues(dst);
        dst.activationState = activationState == null ? null : activationState.copy();
        dst.presence = presence == null ? null : presence.copy();
        dst.annunciator = annunciator == null ? null : annunciator.copy();
        dst.manifestation = manifestation == null ? null : manifestation.copy();
        if (type != null) {
          dst.type = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : type)
            dst.type.add(i.copy());
        };
        dst.indication = indication == null ? null : indication.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DeviceAlertSignalComponent))
          return false;
        DeviceAlertSignalComponent o = (DeviceAlertSignalComponent) other_;
        return compareDeep(activationState, o.activationState, true) && compareDeep(presence, o.presence, true)
           && compareDeep(annunciator, o.annunciator, true) && compareDeep(manifestation, o.manifestation, true)
           && compareDeep(type, o.type, true) && compareDeep(indication, o.indication, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DeviceAlertSignalComponent))
          return false;
        DeviceAlertSignalComponent o = (DeviceAlertSignalComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(activationState, presence
          , annunciator, manifestation, type, indication);
      }

  public String fhirType() {
    return "DeviceAlert.signal";

  }

  }

    /**
     * Business identifiers assigned to this alert, by the source device, gateway software, manufacturers, or other systems or organizations. These identifiers remain constant as the resource is updated and propagates from server to server.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Business identifier for this device alert", formalDefinition="Business identifiers assigned to this alert, by the source device, gateway software, manufacturers, or other systems or organizations. These identifiers remain constant as the resource is updated and propagates from server to server." )
    protected List<Identifier> identifier;

    /**
     * The procedure (or procedures) during which the alert condition was raised.
     */
    @Child(name = "procedure", type = {Procedure.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Procedure during which the alert occurred", formalDefinition="The procedure (or procedures) during which the alert condition was raised." )
    protected List<Reference> procedure;

    /**
     * The current state of the device alert.
     */
    @Child(name = "status", type = {CodeType.class}, order=2, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="in-progress | completed | entered-in-error | unknown", formalDefinition="The current state of the device alert." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-status")
    protected Enumeration<DeviceAlertStatusCodes> status;

    /**
     * Partitions the device alert into one or more categories that can be used to filter searching, to govern access control and/or to guide system behavior.
     */
    @Child(name = "category", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="High level categorization of device alert", formalDefinition="Partitions the device alert into one or more categories that can be used to filter searching, to govern access control and/or to guide system behavior." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-category")
    protected List<CodeableConcept> category;

    /**
     * physiological | technical.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=4, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="physiological | technical", formalDefinition="physiological | technical." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-type")
    protected CodeableConcept type;

    /**
     * The alert priority is usually reported by the source device. A priority of `info` SHOULD indicate that the alert is “for information only” and urgent action is not required. The element MAY be omitted if the priority is unknown.
     */
    @Child(name = "priority", type = {CodeableConcept.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="high | medium | low | info", formalDefinition="The alert priority is usually reported by the source device. A priority of `info` SHOULD indicate that the alert is “for information only” and urgent action is not required. The element MAY be omitted if the priority is unknown." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-priority")
    protected CodeableConcept priority;

    /**
     * A code that indicates the specific condition that triggered the alert.
     */
    @Child(name = "code", type = {CodeableConcept.class}, order=6, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The meaning of the alert", formalDefinition="A code that indicates the specific condition that triggered the alert." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/devicealert-condition")
    protected CodeableConcept code;

    /**
     * Who or what the alert is about.
     */
    @Child(name = "subject", type = {Patient.class, Device.class, BiologicallyDerivedProduct.class, Group.class, Location.class, Medication.class, NutritionProduct.class, Specimen.class}, order=7, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who or what the alert is about", formalDefinition="Who or what the alert is about." )
    protected Reference subject;

    /**
     * The Encounter during which the alert condition was raised.
     */
    @Child(name = "encounter", type = {Encounter.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Encounter during which the alert condition occurred", formalDefinition="The Encounter during which the alert condition was raised." )
    protected Reference encounter;

    /**
     * Whether the alert condition is currently active.
     */
    @Child(name = "presence", type = {BooleanType.class}, order=9, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Whether the alert condition is currently active", formalDefinition="Whether the alert condition is currently active." )
    protected BooleanType presence;

    /**
     * This element is used to record the date or time period when the alert condition did occur or is occurring.
     */
    @Child(name = "occurrence", type = {DateTimeType.class, Period.class}, order=10, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the alert condition occurred/is occurring", formalDefinition="This element is used to record the date or time period when the alert condition did occur or is occurring." )
    protected DataType occurrence;

    /**
     * Indicates the device that detected the alert condition. The device could be a top-level Device or component Device (such as an MDS, VMD, or Channel); or might identify the specific DeviceMetric of a Device (e.g., a heart rate reading) that was in an alert condition.
     */
    @Child(name = "device", type = {Device.class, DeviceMetric.class}, order=11, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The Device (or DeviceMetric) that detected the alert condition", formalDefinition="Indicates the device that detected the alert condition. The device could be a top-level Device or component Device (such as an MDS, VMD, or Channel); or might identify the specific DeviceMetric of a Device (e.g., a heart rate reading) that was in an alert condition." )
    protected Reference device;

    /**
     * An indication of whether (true) or not (false) the alert condition has been acknowledged.
     */
    @Child(name = "acknowledged", type = {BooleanType.class}, order=12, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Whether the alert condition has been acknowledged", formalDefinition="An indication of whether (true) or not (false) the alert condition has been acknowledged." )
    protected BooleanType acknowledged;

    /**
     * An indication of who or what acknowledged the alert condition.
     */
    @Child(name = "acknowledgedBy", type = {Patient.class, Device.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Who acknowledged the alert condition", formalDefinition="An indication of who or what acknowledged the alert condition." )
    protected Reference acknowledgedBy;

    /**
     * The principal physical location of the subject at the time the alert condition occurred. This could be different from the location of the alerting device at that time, and from the current location of either the subject or the alert condition detecting device.
     */
    @Child(name = "location", type = {Location.class}, order=14, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Location of the subject when the alert was raised", formalDefinition="The principal physical location of the subject at the time the alert condition occurred. This could be different from the location of the alerting device at that time, and from the current location of either the subject or the alert condition detecting device." )
    protected Reference location;

    /**
     * The value causing the alert condition.
     */
    @Child(name = "derivedFrom", type = {}, order=15, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="The value causing the alert condition", formalDefinition="The value causing the alert condition." )
    protected List<DeviceAlertDerivedFromComponent> derivedFrom;

    /**
     * The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.
     */
    @Child(name = "label", type = {StringType.class}, order=16, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Text to be displayed for the alert condition", formalDefinition="The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”." )
    protected StringType label;

    /**
     * Annunciation or notification of the alert condition.
     */
    @Child(name = "signal", type = {}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Annunciation or notification of the alert condition", formalDefinition="Annunciation or notification of the alert condition." )
    protected List<DeviceAlertSignalComponent> signal;

    private static final long serialVersionUID = -1091058641L;

  /**
   * Constructor
   */
    public DeviceAlert() {
      super();
    }

  /**
   * Constructor
   */
    public DeviceAlert(DeviceAlertStatusCodes status, CodeableConcept code, Reference subject, boolean presence) {
      super();
      this.setStatus(status);
      this.setCode(code);
      this.setSubject(subject);
      this.setPresence(presence);
    }

    /**
     * @return {@link #identifier} (Business identifiers assigned to this alert, by the source device, gateway software, manufacturers, or other systems or organizations. These identifiers remain constant as the resource is updated and propagates from server to server.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAlert setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public DeviceAlert addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #procedure} (The procedure (or procedures) during which the alert condition was raised.)
     */
    public List<Reference> getProcedure() { 
      if (this.procedure == null)
        this.procedure = new ArrayList<Reference>();
      return this.procedure;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAlert setProcedure(List<Reference> theProcedure) { 
      this.procedure = theProcedure;
      return this;
    }

    public boolean hasProcedure() { 
      if (this.procedure == null)
        return false;
      for (Reference item : this.procedure)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addProcedure() { //3
      Reference t = new Reference();
      if (this.procedure == null)
        this.procedure = new ArrayList<Reference>();
      this.procedure.add(t);
      return t;
    }

    public DeviceAlert addProcedure(Reference t) { //3
      if (t == null)
        return this;
      if (this.procedure == null)
        this.procedure = new ArrayList<Reference>();
      this.procedure.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #procedure}, creating it if it does not already exist {3}
     */
    public Reference getProcedureFirstRep() { 
      if (getProcedure().isEmpty()) {
        addProcedure();
      }
      return getProcedure().get(0);
    }

    /**
     * @return {@link #status} (The current state of the device alert.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DeviceAlertStatusCodes> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<DeviceAlertStatusCodes>(new DeviceAlertStatusCodesEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The current state of the device alert.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DeviceAlert setStatusElement(Enumeration<DeviceAlertStatusCodes> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The current state of the device alert.
     */
    public DeviceAlertStatusCodes getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The current state of the device alert.
     */
    public DeviceAlert setStatus(DeviceAlertStatusCodes value) { 
        if (this.status == null)
          this.status = new Enumeration<DeviceAlertStatusCodes>(new DeviceAlertStatusCodesEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #category} (Partitions the device alert into one or more categories that can be used to filter searching, to govern access control and/or to guide system behavior.)
     */
    public List<CodeableConcept> getCategory() { 
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      return this.category;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAlert setCategory(List<CodeableConcept> theCategory) { 
      this.category = theCategory;
      return this;
    }

    public boolean hasCategory() { 
      if (this.category == null)
        return false;
      for (CodeableConcept item : this.category)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addCategory() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      this.category.add(t);
      return t;
    }

    public DeviceAlert addCategory(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      this.category.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #category}, creating it if it does not already exist {3}
     */
    public CodeableConcept getCategoryFirstRep() { 
      if (getCategory().isEmpty()) {
        addCategory();
      }
      return getCategory().get(0);
    }

    /**
     * @return {@link #type} (physiological | technical.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (physiological | technical.)
     */
    public DeviceAlert setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #priority} (The alert priority is usually reported by the source device. A priority of `info` SHOULD indicate that the alert is “for information only” and urgent action is not required. The element MAY be omitted if the priority is unknown.)
     */
    public CodeableConcept getPriority() { 
      if (this.priority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.priority");
        else if (Configuration.doAutoCreate())
          this.priority = new CodeableConcept(); // cc
      return this.priority;
    }

    public boolean hasPriority() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (The alert priority is usually reported by the source device. A priority of `info` SHOULD indicate that the alert is “for information only” and urgent action is not required. The element MAY be omitted if the priority is unknown.)
     */
    public DeviceAlert setPriority(CodeableConcept value) { 
      this.priority = value;
      return this;
    }

    /**
     * @return {@link #code} (A code that indicates the specific condition that triggered the alert.)
     */
    public CodeableConcept getCode() { 
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeableConcept(); // cc
      return this.code;
    }

    public boolean hasCode() { 
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code that indicates the specific condition that triggered the alert.)
     */
    public DeviceAlert setCode(CodeableConcept value) { 
      this.code = value;
      return this;
    }

    /**
     * @return {@link #subject} (Who or what the alert is about.)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference(); // cc
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the alert is about.)
     */
    public DeviceAlert setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #encounter} (The Encounter during which the alert condition was raised.)
     */
    public Reference getEncounter() { 
      if (this.encounter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.encounter");
        else if (Configuration.doAutoCreate())
          this.encounter = new Reference(); // cc
      return this.encounter;
    }

    public boolean hasEncounter() { 
      return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (The Encounter during which the alert condition was raised.)
     */
    public DeviceAlert setEncounter(Reference value) { 
      this.encounter = value;
      return this;
    }

    /**
     * @return {@link #presence} (Whether the alert condition is currently active.). This is the underlying object with id, value and extensions. The accessor "getPresence" gives direct access to the value
     */
    public BooleanType getPresenceElement() { 
      if (this.presence == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.presence");
        else if (Configuration.doAutoCreate())
          this.presence = new BooleanType(); // bb
      return this.presence;
    }

    public boolean hasPresenceElement() { 
      return this.presence != null && !this.presence.isEmpty();
    }

    public boolean hasPresence() { 
      return this.presence != null && !this.presence.isEmpty();
    }

    /**
     * @param value {@link #presence} (Whether the alert condition is currently active.). This is the underlying object with id, value and extensions. The accessor "getPresence" gives direct access to the value
     */
    public DeviceAlert setPresenceElement(BooleanType value) { 
      this.presence = value;
      return this;
    }

    /**
     * @return Whether the alert condition is currently active.
     */
    public boolean getPresence() { 
      return this.presence == null || this.presence.isEmpty() ? false : this.presence.getValue();
    }

    /**
     * @param value Whether the alert condition is currently active.
     */
    public DeviceAlert setPresence(boolean value) { 
        if (this.presence == null)
          this.presence = new BooleanType();
        this.presence.setValue(value);
      return this;
    }

    /**
     * @return {@link #occurrence} (This element is used to record the date or time period when the alert condition did occur or is occurring.)
     */
    public DataType getOccurrence() { 
      return this.occurrence;
    }

    /**
     * @return {@link #occurrence} (This element is used to record the date or time period when the alert condition did occur or is occurring.)
     */
    public DateTimeType getOccurrenceDateTimeType() throws FHIRException { 
      if (this.occurrence == null)
        this.occurrence = new DateTimeType();
      if (!(this.occurrence instanceof DateTimeType))
        throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.occurrence.getClass().getName()+" was encountered");
      return (DateTimeType) this.occurrence;
    }

    public boolean hasOccurrenceDateTimeType() { 
      return this.occurrence != null && this.occurrence instanceof DateTimeType;
    }

    /**
     * @return {@link #occurrence} (This element is used to record the date or time period when the alert condition did occur or is occurring.)
     */
    public Period getOccurrencePeriod() throws FHIRException { 
      if (this.occurrence == null)
        this.occurrence = new Period();
      if (!(this.occurrence instanceof Period))
        throw new FHIRException("Type mismatch: the type Period was expected, but "+this.occurrence.getClass().getName()+" was encountered");
      return (Period) this.occurrence;
    }

    public boolean hasOccurrencePeriod() { 
      return this.occurrence != null && this.occurrence instanceof Period;
    }

    public boolean hasOccurrence() { 
      return this.occurrence != null && !this.occurrence.isEmpty();
    }

    /**
     * @param value {@link #occurrence} (This element is used to record the date or time period when the alert condition did occur or is occurring.)
     */
    public DeviceAlert setOccurrence(DataType value) { 
      if (value != null && !(value instanceof DateTimeType || value instanceof Period))
        throw new FHIRException("Not the right type for DeviceAlert.occurrence[x]: "+value.fhirType());
      this.occurrence = value;
      return this;
    }

    /**
     * @return {@link #device} (Indicates the device that detected the alert condition. The device could be a top-level Device or component Device (such as an MDS, VMD, or Channel); or might identify the specific DeviceMetric of a Device (e.g., a heart rate reading) that was in an alert condition.)
     */
    public Reference getDevice() { 
      if (this.device == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.device");
        else if (Configuration.doAutoCreate())
          this.device = new Reference(); // cc
      return this.device;
    }

    public boolean hasDevice() { 
      return this.device != null && !this.device.isEmpty();
    }

    /**
     * @param value {@link #device} (Indicates the device that detected the alert condition. The device could be a top-level Device or component Device (such as an MDS, VMD, or Channel); or might identify the specific DeviceMetric of a Device (e.g., a heart rate reading) that was in an alert condition.)
     */
    public DeviceAlert setDevice(Reference value) { 
      this.device = value;
      return this;
    }

    /**
     * @return {@link #acknowledged} (An indication of whether (true) or not (false) the alert condition has been acknowledged.). This is the underlying object with id, value and extensions. The accessor "getAcknowledged" gives direct access to the value
     */
    public BooleanType getAcknowledgedElement() { 
      if (this.acknowledged == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.acknowledged");
        else if (Configuration.doAutoCreate())
          this.acknowledged = new BooleanType(); // bb
      return this.acknowledged;
    }

    public boolean hasAcknowledgedElement() { 
      return this.acknowledged != null && !this.acknowledged.isEmpty();
    }

    public boolean hasAcknowledged() { 
      return this.acknowledged != null && !this.acknowledged.isEmpty();
    }

    /**
     * @param value {@link #acknowledged} (An indication of whether (true) or not (false) the alert condition has been acknowledged.). This is the underlying object with id, value and extensions. The accessor "getAcknowledged" gives direct access to the value
     */
    public DeviceAlert setAcknowledgedElement(BooleanType value) { 
      this.acknowledged = value;
      return this;
    }

    /**
     * @return An indication of whether (true) or not (false) the alert condition has been acknowledged.
     */
    public boolean getAcknowledged() { 
      return this.acknowledged == null || this.acknowledged.isEmpty() ? false : this.acknowledged.getValue();
    }

    /**
     * @param value An indication of whether (true) or not (false) the alert condition has been acknowledged.
     */
    public DeviceAlert setAcknowledged(boolean value) { 
        if (this.acknowledged == null)
          this.acknowledged = new BooleanType();
        this.acknowledged.setValue(value);
      return this;
    }

    /**
     * @return {@link #acknowledgedBy} (An indication of who or what acknowledged the alert condition.)
     */
    public Reference getAcknowledgedBy() { 
      if (this.acknowledgedBy == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.acknowledgedBy");
        else if (Configuration.doAutoCreate())
          this.acknowledgedBy = new Reference(); // cc
      return this.acknowledgedBy;
    }

    public boolean hasAcknowledgedBy() { 
      return this.acknowledgedBy != null && !this.acknowledgedBy.isEmpty();
    }

    /**
     * @param value {@link #acknowledgedBy} (An indication of who or what acknowledged the alert condition.)
     */
    public DeviceAlert setAcknowledgedBy(Reference value) { 
      this.acknowledgedBy = value;
      return this;
    }

    /**
     * @return {@link #location} (The principal physical location of the subject at the time the alert condition occurred. This could be different from the location of the alerting device at that time, and from the current location of either the subject or the alert condition detecting device.)
     */
    public Reference getLocation() { 
      if (this.location == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.location");
        else if (Configuration.doAutoCreate())
          this.location = new Reference(); // cc
      return this.location;
    }

    public boolean hasLocation() { 
      return this.location != null && !this.location.isEmpty();
    }

    /**
     * @param value {@link #location} (The principal physical location of the subject at the time the alert condition occurred. This could be different from the location of the alerting device at that time, and from the current location of either the subject or the alert condition detecting device.)
     */
    public DeviceAlert setLocation(Reference value) { 
      this.location = value;
      return this;
    }

    /**
     * @return {@link #derivedFrom} (The value causing the alert condition.)
     */
    public List<DeviceAlertDerivedFromComponent> getDerivedFrom() { 
      if (this.derivedFrom == null)
        this.derivedFrom = new ArrayList<DeviceAlertDerivedFromComponent>();
      return this.derivedFrom;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAlert setDerivedFrom(List<DeviceAlertDerivedFromComponent> theDerivedFrom) { 
      this.derivedFrom = theDerivedFrom;
      return this;
    }

    public boolean hasDerivedFrom() { 
      if (this.derivedFrom == null)
        return false;
      for (DeviceAlertDerivedFromComponent item : this.derivedFrom)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DeviceAlertDerivedFromComponent addDerivedFrom() { //3
      DeviceAlertDerivedFromComponent t = new DeviceAlertDerivedFromComponent();
      if (this.derivedFrom == null)
        this.derivedFrom = new ArrayList<DeviceAlertDerivedFromComponent>();
      this.derivedFrom.add(t);
      return t;
    }

    public DeviceAlert addDerivedFrom(DeviceAlertDerivedFromComponent t) { //3
      if (t == null)
        return this;
      if (this.derivedFrom == null)
        this.derivedFrom = new ArrayList<DeviceAlertDerivedFromComponent>();
      this.derivedFrom.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #derivedFrom}, creating it if it does not already exist {3}
     */
    public DeviceAlertDerivedFromComponent getDerivedFromFirstRep() { 
      if (getDerivedFrom().isEmpty()) {
        addDerivedFrom();
      }
      return getDerivedFrom().get(0);
    }

    /**
     * @return {@link #label} (The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public StringType getLabelElement() { 
      if (this.label == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAlert.label");
        else if (Configuration.doAutoCreate())
          this.label = new StringType(); // bb
      return this.label;
    }

    public boolean hasLabelElement() { 
      return this.label != null && !this.label.isEmpty();
    }

    public boolean hasLabel() { 
      return this.label != null && !this.label.isEmpty();
    }

    /**
     * @param value {@link #label} (The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.). This is the underlying object with id, value and extensions. The accessor "getLabel" gives direct access to the value
     */
    public DeviceAlert setLabelElement(StringType value) { 
      this.label = value;
      return this;
    }

    /**
     * @return The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.
     */
    public String getLabel() { 
      return this.label == null ? null : this.label.getValue();
    }

    /**
     * @param value The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.
     */
    public DeviceAlert setLabel(String value) { 
      if (Utilities.noString(value))
        this.label = null;
      else {
        if (this.label == null)
          this.label = new StringType();
        this.label.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #signal} (Annunciation or notification of the alert condition.)
     */
    public List<DeviceAlertSignalComponent> getSignal() { 
      if (this.signal == null)
        this.signal = new ArrayList<DeviceAlertSignalComponent>();
      return this.signal;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAlert setSignal(List<DeviceAlertSignalComponent> theSignal) { 
      this.signal = theSignal;
      return this;
    }

    public boolean hasSignal() { 
      if (this.signal == null)
        return false;
      for (DeviceAlertSignalComponent item : this.signal)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DeviceAlertSignalComponent addSignal() { //3
      DeviceAlertSignalComponent t = new DeviceAlertSignalComponent();
      if (this.signal == null)
        this.signal = new ArrayList<DeviceAlertSignalComponent>();
      this.signal.add(t);
      return t;
    }

    public DeviceAlert addSignal(DeviceAlertSignalComponent t) { //3
      if (t == null)
        return this;
      if (this.signal == null)
        this.signal = new ArrayList<DeviceAlertSignalComponent>();
      this.signal.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #signal}, creating it if it does not already exist {3}
     */
    public DeviceAlertSignalComponent getSignalFirstRep() { 
      if (getSignal().isEmpty()) {
        addSignal();
      }
      return getSignal().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Business identifiers assigned to this alert, by the source device, gateway software, manufacturers, or other systems or organizations. These identifiers remain constant as the resource is updated and propagates from server to server.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("procedure", "Reference(Procedure)", "The procedure (or procedures) during which the alert condition was raised.", 0, java.lang.Integer.MAX_VALUE, procedure));
        children.add(new Property("status", "code", "The current state of the device alert.", 0, 1, status));
        children.add(new Property("category", "CodeableConcept", "Partitions the device alert into one or more categories that can be used to filter searching, to govern access control and/or to guide system behavior.", 0, java.lang.Integer.MAX_VALUE, category));
        children.add(new Property("type", "CodeableConcept", "physiological | technical.", 0, 1, type));
        children.add(new Property("priority", "CodeableConcept", "The alert priority is usually reported by the source device. A priority of `info` SHOULD indicate that the alert is “for information only” and urgent action is not required. The element MAY be omitted if the priority is unknown.", 0, 1, priority));
        children.add(new Property("code", "CodeableConcept", "A code that indicates the specific condition that triggered the alert.", 0, 1, code));
        children.add(new Property("subject", "Reference(Patient|Device|BiologicallyDerivedProduct|Group|Location|Medication|NutritionProduct|Specimen)", "Who or what the alert is about.", 0, 1, subject));
        children.add(new Property("encounter", "Reference(Encounter)", "The Encounter during which the alert condition was raised.", 0, 1, encounter));
        children.add(new Property("presence", "boolean", "Whether the alert condition is currently active.", 0, 1, presence));
        children.add(new Property("occurrence[x]", "dateTime|Period", "This element is used to record the date or time period when the alert condition did occur or is occurring.", 0, 1, occurrence));
        children.add(new Property("device", "Reference(Device|DeviceMetric)", "Indicates the device that detected the alert condition. The device could be a top-level Device or component Device (such as an MDS, VMD, or Channel); or might identify the specific DeviceMetric of a Device (e.g., a heart rate reading) that was in an alert condition.", 0, 1, device));
        children.add(new Property("acknowledged", "boolean", "An indication of whether (true) or not (false) the alert condition has been acknowledged.", 0, 1, acknowledged));
        children.add(new Property("acknowledgedBy", "Reference(Patient|Device|Practitioner|PractitionerRole|RelatedPerson)", "An indication of who or what acknowledged the alert condition.", 0, 1, acknowledgedBy));
        children.add(new Property("location", "Reference(Location)", "The principal physical location of the subject at the time the alert condition occurred. This could be different from the location of the alerting device at that time, and from the current location of either the subject or the alert condition detecting device.", 0, 1, location));
        children.add(new Property("derivedFrom", "", "The value causing the alert condition.", 0, java.lang.Integer.MAX_VALUE, derivedFrom));
        children.add(new Property("label", "string", "The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.", 0, 1, label));
        children.add(new Property("signal", "", "Annunciation or notification of the alert condition.", 0, java.lang.Integer.MAX_VALUE, signal));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Business identifiers assigned to this alert, by the source device, gateway software, manufacturers, or other systems or organizations. These identifiers remain constant as the resource is updated and propagates from server to server.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -1095204141: /*procedure*/  return new Property("procedure", "Reference(Procedure)", "The procedure (or procedures) during which the alert condition was raised.", 0, java.lang.Integer.MAX_VALUE, procedure);
        case -892481550: /*status*/  return new Property("status", "code", "The current state of the device alert.", 0, 1, status);
        case 50511102: /*category*/  return new Property("category", "CodeableConcept", "Partitions the device alert into one or more categories that can be used to filter searching, to govern access control and/or to guide system behavior.", 0, java.lang.Integer.MAX_VALUE, category);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "physiological | technical.", 0, 1, type);
        case -1165461084: /*priority*/  return new Property("priority", "CodeableConcept", "The alert priority is usually reported by the source device. A priority of `info` SHOULD indicate that the alert is “for information only” and urgent action is not required. The element MAY be omitted if the priority is unknown.", 0, 1, priority);
        case 3059181: /*code*/  return new Property("code", "CodeableConcept", "A code that indicates the specific condition that triggered the alert.", 0, 1, code);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(Patient|Device|BiologicallyDerivedProduct|Group|Location|Medication|NutritionProduct|Specimen)", "Who or what the alert is about.", 0, 1, subject);
        case 1524132147: /*encounter*/  return new Property("encounter", "Reference(Encounter)", "The Encounter during which the alert condition was raised.", 0, 1, encounter);
        case -1276666629: /*presence*/  return new Property("presence", "boolean", "Whether the alert condition is currently active.", 0, 1, presence);
        case -2022646513: /*occurrence[x]*/  return new Property("occurrence[x]", "dateTime|Period", "This element is used to record the date or time period when the alert condition did occur or is occurring.", 0, 1, occurrence);
        case 1687874001: /*occurrence*/  return new Property("occurrence[x]", "dateTime|Period", "This element is used to record the date or time period when the alert condition did occur or is occurring.", 0, 1, occurrence);
        case -298443636: /*occurrenceDateTime*/  return new Property("occurrence[x]", "dateTime", "This element is used to record the date or time period when the alert condition did occur or is occurring.", 0, 1, occurrence);
        case 1397156594: /*occurrencePeriod*/  return new Property("occurrence[x]", "Period", "This element is used to record the date or time period when the alert condition did occur or is occurring.", 0, 1, occurrence);
        case -1335157162: /*device*/  return new Property("device", "Reference(Device|DeviceMetric)", "Indicates the device that detected the alert condition. The device could be a top-level Device or component Device (such as an MDS, VMD, or Channel); or might identify the specific DeviceMetric of a Device (e.g., a heart rate reading) that was in an alert condition.", 0, 1, device);
        case -1366527672: /*acknowledged*/  return new Property("acknowledged", "boolean", "An indication of whether (true) or not (false) the alert condition has been acknowledged.", 0, 1, acknowledged);
        case 1026901951: /*acknowledgedBy*/  return new Property("acknowledgedBy", "Reference(Patient|Device|Practitioner|PractitionerRole|RelatedPerson)", "An indication of who or what acknowledged the alert condition.", 0, 1, acknowledgedBy);
        case 1901043637: /*location*/  return new Property("location", "Reference(Location)", "The principal physical location of the subject at the time the alert condition occurred. This could be different from the location of the alerting device at that time, and from the current location of either the subject or the alert condition detecting device.", 0, 1, location);
        case 1077922663: /*derivedFrom*/  return new Property("derivedFrom", "", "The value causing the alert condition.", 0, java.lang.Integer.MAX_VALUE, derivedFrom);
        case 102727412: /*label*/  return new Property("label", "string", "The label might combine information from the alert code, priority, the measurement type, measurement value, body sites and other sources, e.g., “HR > 180”.", 0, 1, label);
        case -902467928: /*signal*/  return new Property("signal", "", "Annunciation or notification of the alert condition.", 0, java.lang.Integer.MAX_VALUE, signal);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -1095204141: /*procedure*/ return this.procedure == null ? new Base[0] : this.procedure.toArray(new Base[this.procedure.size()]); // Reference
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<DeviceAlertStatusCodes>
        case 50511102: /*category*/ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1165461084: /*priority*/ return this.priority == null ? new Base[0] : new Base[] {this.priority}; // CodeableConcept
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : new Base[] {this.subject}; // Reference
        case 1524132147: /*encounter*/ return this.encounter == null ? new Base[0] : new Base[] {this.encounter}; // Reference
        case -1276666629: /*presence*/ return this.presence == null ? new Base[0] : new Base[] {this.presence}; // BooleanType
        case 1687874001: /*occurrence*/ return this.occurrence == null ? new Base[0] : new Base[] {this.occurrence}; // DataType
        case -1335157162: /*device*/ return this.device == null ? new Base[0] : new Base[] {this.device}; // Reference
        case -1366527672: /*acknowledged*/ return this.acknowledged == null ? new Base[0] : new Base[] {this.acknowledged}; // BooleanType
        case 1026901951: /*acknowledgedBy*/ return this.acknowledgedBy == null ? new Base[0] : new Base[] {this.acknowledgedBy}; // Reference
        case 1901043637: /*location*/ return this.location == null ? new Base[0] : new Base[] {this.location}; // Reference
        case 1077922663: /*derivedFrom*/ return this.derivedFrom == null ? new Base[0] : this.derivedFrom.toArray(new Base[this.derivedFrom.size()]); // DeviceAlertDerivedFromComponent
        case 102727412: /*label*/ return this.label == null ? new Base[0] : new Base[] {this.label}; // StringType
        case -902467928: /*signal*/ return this.signal == null ? new Base[0] : this.signal.toArray(new Base[this.signal.size()]); // DeviceAlertSignalComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -1095204141: // procedure
          this.getProcedure().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -892481550: // status
          value = new DeviceAlertStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<DeviceAlertStatusCodes>
          return value;
        case 50511102: // category
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1165461084: // priority
          this.priority = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1867885268: // subject
          this.subject = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1524132147: // encounter
          this.encounter = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1276666629: // presence
          this.presence = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case 1687874001: // occurrence
          this.occurrence = TypeConvertor.castToType(value); // DataType
          return value;
        case -1335157162: // device
          this.device = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1366527672: // acknowledged
          this.acknowledged = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case 1026901951: // acknowledgedBy
          this.acknowledgedBy = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1901043637: // location
          this.location = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1077922663: // derivedFrom
          this.getDerivedFrom().add((DeviceAlertDerivedFromComponent) value); // DeviceAlertDerivedFromComponent
          return value;
        case 102727412: // label
          this.label = TypeConvertor.castToString(value); // StringType
          return value;
        case -902467928: // signal
          this.getSignal().add((DeviceAlertSignalComponent) value); // DeviceAlertSignalComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("procedure")) {
          this.getProcedure().add(TypeConvertor.castToReference(value));
        } else if (name.equals("status")) {
          value = new DeviceAlertStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<DeviceAlertStatusCodes>
        } else if (name.equals("category")) {
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("priority")) {
          this.priority = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("subject")) {
          this.subject = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("encounter")) {
          this.encounter = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("presence")) {
          this.presence = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("occurrence[x]")) {
          this.occurrence = TypeConvertor.castToType(value); // DataType
        } else if (name.equals("device")) {
          this.device = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("acknowledged")) {
          this.acknowledged = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("acknowledgedBy")) {
          this.acknowledgedBy = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("location")) {
          this.location = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("derivedFrom")) {
          this.getDerivedFrom().add((DeviceAlertDerivedFromComponent) value);
        } else if (name.equals("label")) {
          this.label = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("signal")) {
          this.getSignal().add((DeviceAlertSignalComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -1095204141:  return addProcedure(); 
        case -892481550:  return getStatusElement();
        case 50511102:  return addCategory(); 
        case 3575610:  return getType();
        case -1165461084:  return getPriority();
        case 3059181:  return getCode();
        case -1867885268:  return getSubject();
        case 1524132147:  return getEncounter();
        case -1276666629:  return getPresenceElement();
        case -2022646513:  return getOccurrence();
        case 1687874001:  return getOccurrence();
        case -1335157162:  return getDevice();
        case -1366527672:  return getAcknowledgedElement();
        case 1026901951:  return getAcknowledgedBy();
        case 1901043637:  return getLocation();
        case 1077922663:  return addDerivedFrom(); 
        case 102727412:  return getLabelElement();
        case -902467928:  return addSignal(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -1095204141: /*procedure*/ return new String[] {"Reference"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1165461084: /*priority*/ return new String[] {"CodeableConcept"};
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 1524132147: /*encounter*/ return new String[] {"Reference"};
        case -1276666629: /*presence*/ return new String[] {"boolean"};
        case 1687874001: /*occurrence*/ return new String[] {"dateTime", "Period"};
        case -1335157162: /*device*/ return new String[] {"Reference"};
        case -1366527672: /*acknowledged*/ return new String[] {"boolean"};
        case 1026901951: /*acknowledgedBy*/ return new String[] {"Reference"};
        case 1901043637: /*location*/ return new String[] {"Reference"};
        case 1077922663: /*derivedFrom*/ return new String[] {};
        case 102727412: /*label*/ return new String[] {"string"};
        case -902467928: /*signal*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("procedure")) {
          return addProcedure();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property DeviceAlert.status");
        }
        else if (name.equals("category")) {
          return addCategory();
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("priority")) {
          this.priority = new CodeableConcept();
          return this.priority;
        }
        else if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("subject")) {
          this.subject = new Reference();
          return this.subject;
        }
        else if (name.equals("encounter")) {
          this.encounter = new Reference();
          return this.encounter;
        }
        else if (name.equals("presence")) {
          throw new FHIRException("Cannot call addChild on a singleton property DeviceAlert.presence");
        }
        else if (name.equals("occurrenceDateTime")) {
          this.occurrence = new DateTimeType();
          return this.occurrence;
        }
        else if (name.equals("occurrencePeriod")) {
          this.occurrence = new Period();
          return this.occurrence;
        }
        else if (name.equals("device")) {
          this.device = new Reference();
          return this.device;
        }
        else if (name.equals("acknowledged")) {
          throw new FHIRException("Cannot call addChild on a singleton property DeviceAlert.acknowledged");
        }
        else if (name.equals("acknowledgedBy")) {
          this.acknowledgedBy = new Reference();
          return this.acknowledgedBy;
        }
        else if (name.equals("location")) {
          this.location = new Reference();
          return this.location;
        }
        else if (name.equals("derivedFrom")) {
          return addDerivedFrom();
        }
        else if (name.equals("label")) {
          throw new FHIRException("Cannot call addChild on a singleton property DeviceAlert.label");
        }
        else if (name.equals("signal")) {
          return addSignal();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "DeviceAlert";

  }

      public DeviceAlert copy() {
        DeviceAlert dst = new DeviceAlert();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DeviceAlert dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        if (procedure != null) {
          dst.procedure = new ArrayList<Reference>();
          for (Reference i : procedure)
            dst.procedure.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        if (category != null) {
          dst.category = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : category)
            dst.category.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.priority = priority == null ? null : priority.copy();
        dst.code = code == null ? null : code.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.presence = presence == null ? null : presence.copy();
        dst.occurrence = occurrence == null ? null : occurrence.copy();
        dst.device = device == null ? null : device.copy();
        dst.acknowledged = acknowledged == null ? null : acknowledged.copy();
        dst.acknowledgedBy = acknowledgedBy == null ? null : acknowledgedBy.copy();
        dst.location = location == null ? null : location.copy();
        if (derivedFrom != null) {
          dst.derivedFrom = new ArrayList<DeviceAlertDerivedFromComponent>();
          for (DeviceAlertDerivedFromComponent i : derivedFrom)
            dst.derivedFrom.add(i.copy());
        };
        dst.label = label == null ? null : label.copy();
        if (signal != null) {
          dst.signal = new ArrayList<DeviceAlertSignalComponent>();
          for (DeviceAlertSignalComponent i : signal)
            dst.signal.add(i.copy());
        };
      }

      protected DeviceAlert typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DeviceAlert))
          return false;
        DeviceAlert o = (DeviceAlert) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(procedure, o.procedure, true)
           && compareDeep(status, o.status, true) && compareDeep(category, o.category, true) && compareDeep(type, o.type, true)
           && compareDeep(priority, o.priority, true) && compareDeep(code, o.code, true) && compareDeep(subject, o.subject, true)
           && compareDeep(encounter, o.encounter, true) && compareDeep(presence, o.presence, true) && compareDeep(occurrence, o.occurrence, true)
           && compareDeep(device, o.device, true) && compareDeep(acknowledged, o.acknowledged, true) && compareDeep(acknowledgedBy, o.acknowledgedBy, true)
           && compareDeep(location, o.location, true) && compareDeep(derivedFrom, o.derivedFrom, true) && compareDeep(label, o.label, true)
           && compareDeep(signal, o.signal, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DeviceAlert))
          return false;
        DeviceAlert o = (DeviceAlert) other_;
        return compareValues(status, o.status, true) && compareValues(presence, o.presence, true) && compareValues(acknowledged, o.acknowledged, true)
           && compareValues(label, o.label, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, procedure, status
          , category, type, priority, code, subject, encounter, presence, occurrence, device
          , acknowledged, acknowledgedBy, location, derivedFrom, label, signal);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DeviceAlert;
   }

 /**
   * Search parameter: <b>annunciator-device</b>
   * <p>
   * Description: <b>The signalling device annunciating the condition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.signal.annunciator.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="annunciator-device", path="DeviceAlert.signal.annunciator.reference", description="The signalling device annunciating the condition", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device") }, target={Device.class } )
  public static final String SP_ANNUNCIATOR_DEVICE = "annunciator-device";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>annunciator-device</b>
   * <p>
   * Description: <b>The signalling device annunciating the condition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.signal.annunciator.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ANNUNCIATOR_DEVICE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ANNUNCIATOR_DEVICE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:annunciator-device</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ANNUNCIATOR_DEVICE = new ca.uhn.fhir.model.api.Include("DeviceAlert:annunciator-device").toLocked();

 /**
   * Search parameter: <b>acknowledged-by</b>
   * <p>
   * Description: <b>Who acknowledged the alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.acknowledgedBy</b><br>
   * </p>
   */
  @SearchParamDefinition(name="acknowledged-by", path="DeviceAlert.acknowledgedBy", description="Who acknowledged the alert", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={Device.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_ACKNOWLEDGED_BY = "acknowledged-by";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>acknowledged-by</b>
   * <p>
   * Description: <b>Who acknowledged the alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.acknowledgedBy</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ACKNOWLEDGED_BY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ACKNOWLEDGED_BY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:acknowledged-by</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ACKNOWLEDGED_BY = new ca.uhn.fhir.model.api.Include("DeviceAlert:acknowledged-by").toLocked();

 /**
   * Search parameter: <b>signal-presence</b>
   * <p>
   * Description: <b>Whether the alert is currently occurring</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.signal.presence</b><br>
   * </p>
   */
  @SearchParamDefinition(name="signal-presence", path="DeviceAlert.signal.presence", description="Whether the alert is currently occurring", type="token" )
  public static final String SP_SIGNAL_PRESENCE = "signal-presence";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>signal-presence</b>
   * <p>
   * Description: <b>Whether the alert is currently occurring</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.signal.presence</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SIGNAL_PRESENCE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_SIGNAL_PRESENCE);

 /**
   * Search parameter: <b>device</b>
   * <p>
   * Description: <b>The device detecting the condition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.device</b><br>
   * </p>
   */
  @SearchParamDefinition(name="device", path="DeviceAlert.device", description="The device detecting the condition", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device") }, target={Device.class, DeviceMetric.class } )
  public static final String SP_DEVICE = "device";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>device</b>
   * <p>
   * Description: <b>The device detecting the condition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.device</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEVICE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_DEVICE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:device</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEVICE = new ca.uhn.fhir.model.api.Include("DeviceAlert:device").toLocked();

 /**
   * Search parameter: <b>derived-from</b>
   * <p>
   * Description: <b>Whether the alert is currently occurring</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.derivedFrom.observation</b><br>
   * </p>
   */
  @SearchParamDefinition(name="derived-from", path="DeviceAlert.derivedFrom.observation", description="Whether the alert is currently occurring", type="reference", target={Observation.class } )
  public static final String SP_DERIVED_FROM = "derived-from";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>derived-from</b>
   * <p>
   * Description: <b>Whether the alert is currently occurring</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.derivedFrom.observation</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DERIVED_FROM = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_DERIVED_FROM);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:derived-from</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DERIVED_FROM = new ca.uhn.fhir.model.api.Include("DeviceAlert:derived-from").toLocked();

 /**
   * Search parameter: <b>annunciator-concept</b>
   * <p>
   * Description: <b>The whether the signalling device annunciating the condition is local or remote to the detecting device</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.signal.annunciator.concept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="annunciator-concept", path="DeviceAlert.signal.annunciator.concept", description="The whether the signalling device annunciating the condition is local or remote to the detecting device", type="token" )
  public static final String SP_ANNUNCIATOR_CONCEPT = "annunciator-concept";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>annunciator-concept</b>
   * <p>
   * Description: <b>The whether the signalling device annunciating the condition is local or remote to the detecting device</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.signal.annunciator.concept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ANNUNCIATOR_CONCEPT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ANNUNCIATOR_CONCEPT);

 /**
   * Search parameter: <b>encounter</b>
   * <p>
   * Description: <b>Encounter during which the alert occurred</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.encounter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="encounter", path="DeviceAlert.encounter", description="Encounter during which the alert occurred", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Encounter") }, target={Encounter.class } )
  public static final String SP_ENCOUNTER = "encounter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
   * <p>
   * Description: <b>Encounter during which the alert occurred</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.encounter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENCOUNTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENCOUNTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:encounter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENCOUNTER = new ca.uhn.fhir.model.api.Include("DeviceAlert:encounter").toLocked();

 /**
   * Search parameter: <b>category</b>
   * <p>
   * Description: <b>Alert category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="category", path="DeviceAlert.category", description="Alert category", type="token" )
  public static final String SP_CATEGORY = "category";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>category</b>
   * <p>
   * Description: <b>Alert category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CATEGORY);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Status of the alert</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="DeviceAlert.status", description="Status of the alert", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Status of the alert</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>indication</b>
   * <p>
   * Description: <b>When the signal was being annunciated</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DeviceAlert.signal.indication</b><br>
   * </p>
   */
  @SearchParamDefinition(name="indication", path="DeviceAlert.signal.indication", description="When the signal was being annunciated", type="date" )
  public static final String SP_INDICATION = "indication";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>indication</b>
   * <p>
   * Description: <b>When the signal was being annunciated</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DeviceAlert.signal.indication</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam INDICATION = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_INDICATION);

 /**
   * Search parameter: <b>presence</b>
   * <p>
   * Description: <b>Whether the alert condition is currently occurring</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.presence</b><br>
   * </p>
   */
  @SearchParamDefinition(name="presence", path="DeviceAlert.presence", description="Whether the alert condition is currently occurring", type="token" )
  public static final String SP_PRESENCE = "presence";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>presence</b>
   * <p>
   * Description: <b>Whether the alert condition is currently occurring</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.presence</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PRESENCE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PRESENCE);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>The patient subject of the alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.subject.where(resolve() is Patient)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="DeviceAlert.subject.where(resolve() is Patient)", description="The patient subject of the alert", type="reference", target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>The patient subject of the alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.subject.where(resolve() is Patient)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("DeviceAlert:patient").toLocked();

 /**
   * Search parameter: <b>procedure</b>
   * <p>
   * Description: <b>Procedure during which the alert occurred</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.procedure</b><br>
   * </p>
   */
  @SearchParamDefinition(name="procedure", path="DeviceAlert.procedure", description="Procedure during which the alert occurred", type="reference", target={Procedure.class } )
  public static final String SP_PROCEDURE = "procedure";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>procedure</b>
   * <p>
   * Description: <b>Procedure during which the alert occurred</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.procedure</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PROCEDURE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PROCEDURE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:procedure</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PROCEDURE = new ca.uhn.fhir.model.api.Include("DeviceAlert:procedure").toLocked();

 /**
   * Search parameter: <b>location</b>
   * <p>
   * Description: <b>Location of the subject at time of alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.location</b><br>
   * </p>
   */
  @SearchParamDefinition(name="location", path="DeviceAlert.location", description="Location of the subject at time of alert", type="reference", target={Location.class } )
  public static final String SP_LOCATION = "location";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>location</b>
   * <p>
   * Description: <b>Location of the subject at time of alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.location</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam LOCATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_LOCATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:location</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_LOCATION = new ca.uhn.fhir.model.api.Include("DeviceAlert:location").toLocked();

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>Subject of the alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="DeviceAlert.subject", description="Subject of the alert", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Group"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={BiologicallyDerivedProduct.class, Device.class, Group.class, Location.class, Medication.class, NutritionProduct.class, Patient.class, Specimen.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>Subject of the alert</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAlert.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAlert:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("DeviceAlert:subject").toLocked();

 /**
   * Search parameter: <b>occurrence</b>
   * <p>
   * Description: <b>When the alert condition occurred</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DeviceAlert.occurrence.ofType(Period) | occurrence.ofType(dateTime)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="occurrence", path="DeviceAlert.occurrence.ofType(Period) | occurrence.ofType(dateTime)", description="When the alert condition occurred", type="date" )
  public static final String SP_OCCURRENCE = "occurrence";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>occurrence</b>
   * <p>
   * Description: <b>When the alert condition occurred</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DeviceAlert.occurrence.ofType(Period) | occurrence.ofType(dateTime)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam OCCURRENCE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_OCCURRENCE);

 /**
   * Search parameter: <b>acknowledged</b>
   * <p>
   * Description: <b>Whether the alert condition has been acknowledged</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.acknowledged</b><br>
   * </p>
   */
  @SearchParamDefinition(name="acknowledged", path="DeviceAlert.acknowledged", description="Whether the alert condition has been acknowledged", type="token" )
  public static final String SP_ACKNOWLEDGED = "acknowledged";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>acknowledged</b>
   * <p>
   * Description: <b>Whether the alert condition has been acknowledged</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.acknowledged</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ACKNOWLEDGED = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ACKNOWLEDGED);

 /**
   * Search parameter: <b>code</b>
   * <p>
   * Description: <b>Alert condition code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="code", path="DeviceAlert.code", description="Alert condition code", type="token" )
  public static final String SP_CODE = "code";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>code</b>
   * <p>
   * Description: <b>Alert condition code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CODE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The identifier of the alert</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="DeviceAlert.identifier", description="The identifier of the alert", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The identifier of the alert</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>Whether the alert is physiological or technical</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="DeviceAlert.type", description="Whether the alert is physiological or technical", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>Whether the alert is physiological or technical</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);

 /**
   * Search parameter: <b>manifestation</b>
   * <p>
   * Description: <b>How the alert signal is manifested</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.signal.manifestation</b><br>
   * </p>
   */
  @SearchParamDefinition(name="manifestation", path="DeviceAlert.signal.manifestation", description="How the alert signal is manifested", type="token" )
  public static final String SP_MANIFESTATION = "manifestation";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>manifestation</b>
   * <p>
   * Description: <b>How the alert signal is manifested</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.signal.manifestation</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MANIFESTATION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MANIFESTATION);

 /**
   * Search parameter: <b>priority</b>
   * <p>
   * Description: <b>Priority of the alert condition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.priority</b><br>
   * </p>
   */
  @SearchParamDefinition(name="priority", path="DeviceAlert.priority", description="Priority of the alert condition", type="token" )
  public static final String SP_PRIORITY = "priority";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>priority</b>
   * <p>
   * Description: <b>Priority of the alert condition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAlert.priority</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PRIORITY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PRIORITY);


}

