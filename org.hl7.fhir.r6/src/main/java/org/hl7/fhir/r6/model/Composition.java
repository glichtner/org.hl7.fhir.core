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
 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and has traceability to the author who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 */
@ResourceDef(name="Composition", profile="http://hl7.org/fhir/StructureDefinition/Composition")
public class Composition extends DomainResource {

    @Block()
    public static class CompositionParticipantComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Meaning and purpose of participation, in creation of the clinical document. The list includes: data entry person, informant, primary information recipient, and tracker. Other types are allowed.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="AUT | AUTHEN | CST | LA | RCT | SBJ", formalDefinition="Meaning and purpose of participation, in creation of the clinical document. The list includes: data entry person, informant, primary information recipient, and tracker. Other types are allowed." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/fhir-clinical-doc-participant")
        protected List<CodeableConcept> type;

        /**
         * Exact function of the participant in the creation of the clinical document. This is more granular than type.
         */
        @Child(name = "function", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="", formalDefinition="Exact function of the participant in the creation of the clinical document. This is more granular than type." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/v3-ParticipationFunction")
        protected List<CodeableConcept> function;

        /**
         * Time period of participation.
         */
        @Child(name = "time", type = {Period.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Time period of participation", formalDefinition="Time period of participation." )
        protected Period time;

        /**
         * Who the participant is.
         */
        @Child(name = "party", type = {Practitioner.class, PractitionerRole.class, Patient.class, RelatedPerson.class, Device.class, Organization.class}, order=4, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Who the participant is", formalDefinition="Who the participant is." )
        protected Reference party;

        private static final long serialVersionUID = 1964976345L;

    /**
     * Constructor
     */
      public CompositionParticipantComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CompositionParticipantComponent(CodeableConcept type, Reference party) {
        super();
        this.addType(type);
        this.setParty(party);
      }

        /**
         * @return {@link #type} (Meaning and purpose of participation, in creation of the clinical document. The list includes: data entry person, informant, primary information recipient, and tracker. Other types are allowed.)
         */
        public List<CodeableConcept> getType() { 
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          return this.type;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CompositionParticipantComponent setType(List<CodeableConcept> theType) { 
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

        public CompositionParticipantComponent addType(CodeableConcept t) { //3
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
         * @return {@link #function} (Exact function of the participant in the creation of the clinical document. This is more granular than type.)
         */
        public List<CodeableConcept> getFunction() { 
          if (this.function == null)
            this.function = new ArrayList<CodeableConcept>();
          return this.function;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CompositionParticipantComponent setFunction(List<CodeableConcept> theFunction) { 
          this.function = theFunction;
          return this;
        }

        public boolean hasFunction() { 
          if (this.function == null)
            return false;
          for (CodeableConcept item : this.function)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addFunction() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.function == null)
            this.function = new ArrayList<CodeableConcept>();
          this.function.add(t);
          return t;
        }

        public CompositionParticipantComponent addFunction(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.function == null)
            this.function = new ArrayList<CodeableConcept>();
          this.function.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #function}, creating it if it does not already exist {3}
         */
        public CodeableConcept getFunctionFirstRep() { 
          if (getFunction().isEmpty()) {
            addFunction();
          }
          return getFunction().get(0);
        }

        /**
         * @return {@link #time} (Time period of participation.)
         */
        public Period getTime() { 
          if (this.time == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionParticipantComponent.time");
            else if (Configuration.doAutoCreate())
              this.time = new Period(); // cc
          return this.time;
        }

        public boolean hasTime() { 
          return this.time != null && !this.time.isEmpty();
        }

        /**
         * @param value {@link #time} (Time period of participation.)
         */
        public CompositionParticipantComponent setTime(Period value) { 
          this.time = value;
          return this;
        }

        /**
         * @return {@link #party} (Who the participant is.)
         */
        public Reference getParty() { 
          if (this.party == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionParticipantComponent.party");
            else if (Configuration.doAutoCreate())
              this.party = new Reference(); // cc
          return this.party;
        }

        public boolean hasParty() { 
          return this.party != null && !this.party.isEmpty();
        }

        /**
         * @param value {@link #party} (Who the participant is.)
         */
        public CompositionParticipantComponent setParty(Reference value) { 
          this.party = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Meaning and purpose of participation, in creation of the clinical document. The list includes: data entry person, informant, primary information recipient, and tracker. Other types are allowed.", 0, java.lang.Integer.MAX_VALUE, type));
          children.add(new Property("function", "CodeableConcept", "Exact function of the participant in the creation of the clinical document. This is more granular than type.", 0, java.lang.Integer.MAX_VALUE, function));
          children.add(new Property("time", "Period", "Time period of participation.", 0, 1, time));
          children.add(new Property("party", "Reference(Practitioner|PractitionerRole|Patient|RelatedPerson|Device|Organization)", "Who the participant is.", 0, 1, party));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Meaning and purpose of participation, in creation of the clinical document. The list includes: data entry person, informant, primary information recipient, and tracker. Other types are allowed.", 0, java.lang.Integer.MAX_VALUE, type);
          case 1380938712: /*function*/  return new Property("function", "CodeableConcept", "Exact function of the participant in the creation of the clinical document. This is more granular than type.", 0, java.lang.Integer.MAX_VALUE, function);
          case 3560141: /*time*/  return new Property("time", "Period", "Time period of participation.", 0, 1, time);
          case 106437350: /*party*/  return new Property("party", "Reference(Practitioner|PractitionerRole|Patient|RelatedPerson|Device|Organization)", "Who the participant is.", 0, 1, party);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
        case 1380938712: /*function*/ return this.function == null ? new Base[0] : this.function.toArray(new Base[this.function.size()]); // CodeableConcept
        case 3560141: /*time*/ return this.time == null ? new Base[0] : new Base[] {this.time}; // Period
        case 106437350: /*party*/ return this.party == null ? new Base[0] : new Base[] {this.party}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.getType().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 1380938712: // function
          this.getFunction().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3560141: // time
          this.time = TypeConvertor.castToPeriod(value); // Period
          return value;
        case 106437350: // party
          this.party = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.getType().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("function")) {
          this.getFunction().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("time")) {
          this.time = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("party")) {
          this.party = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return addType(); 
        case 1380938712:  return addFunction(); 
        case 3560141:  return getTime();
        case 106437350:  return getParty();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 1380938712: /*function*/ return new String[] {"CodeableConcept"};
        case 3560141: /*time*/ return new String[] {"Period"};
        case 106437350: /*party*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          return addType();
        }
        else if (name.equals("function")) {
          return addFunction();
        }
        else if (name.equals("time")) {
          this.time = new Period();
          return this.time;
        }
        else if (name.equals("party")) {
          this.party = new Reference();
          return this.party;
        }
        else
          return super.addChild(name);
      }

      public CompositionParticipantComponent copy() {
        CompositionParticipantComponent dst = new CompositionParticipantComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionParticipantComponent dst) {
        super.copyValues(dst);
        if (type != null) {
          dst.type = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : type)
            dst.type.add(i.copy());
        };
        if (function != null) {
          dst.function = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : function)
            dst.function.add(i.copy());
        };
        dst.time = time == null ? null : time.copy();
        dst.party = party == null ? null : party.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionParticipantComponent))
          return false;
        CompositionParticipantComponent o = (CompositionParticipantComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(function, o.function, true) && compareDeep(time, o.time, true)
           && compareDeep(party, o.party, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionParticipantComponent))
          return false;
        CompositionParticipantComponent o = (CompositionParticipantComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, function, time, party
          );
      }

  public String fhirType() {
    return "Composition.participant";

  }

  }

    @Block()
    public static class CompositionAttesterComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The type of attestation the authenticator offers.
         */
        @Child(name = "mode", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="personal | professional | legal | official", formalDefinition="The type of attestation the authenticator offers." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/composition-attestation-mode")
        protected CodeableConcept mode;

        /**
         * When the composition was attested by the party.
         */
        @Child(name = "time", type = {DateTimeType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When the composition was attested", formalDefinition="When the composition was attested by the party." )
        protected DateTimeType time;

        /**
         * Who attested the composition in the specified way.
         */
        @Child(name = "party", type = {Patient.class, RelatedPerson.class, Practitioner.class, PractitionerRole.class, Organization.class, Group.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Who attested the composition", formalDefinition="Who attested the composition in the specified way." )
        protected Reference party;

        private static final long serialVersionUID = 545132751L;

    /**
     * Constructor
     */
      public CompositionAttesterComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CompositionAttesterComponent(CodeableConcept mode) {
        super();
        this.setMode(mode);
      }

        /**
         * @return {@link #mode} (The type of attestation the authenticator offers.)
         */
        public CodeableConcept getMode() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionAttesterComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new CodeableConcept(); // cc
          return this.mode;
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (The type of attestation the authenticator offers.)
         */
        public CompositionAttesterComponent setMode(CodeableConcept value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return {@link #time} (When the composition was attested by the party.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public DateTimeType getTimeElement() { 
          if (this.time == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionAttesterComponent.time");
            else if (Configuration.doAutoCreate())
              this.time = new DateTimeType(); // bb
          return this.time;
        }

        public boolean hasTimeElement() { 
          return this.time != null && !this.time.isEmpty();
        }

        public boolean hasTime() { 
          return this.time != null && !this.time.isEmpty();
        }

        /**
         * @param value {@link #time} (When the composition was attested by the party.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public CompositionAttesterComponent setTimeElement(DateTimeType value) { 
          this.time = value;
          return this;
        }

        /**
         * @return When the composition was attested by the party.
         */
        public Date getTime() { 
          return this.time == null ? null : this.time.getValue();
        }

        /**
         * @param value When the composition was attested by the party.
         */
        public CompositionAttesterComponent setTime(Date value) { 
          if (value == null)
            this.time = null;
          else {
            if (this.time == null)
              this.time = new DateTimeType();
            this.time.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #party} (Who attested the composition in the specified way.)
         */
        public Reference getParty() { 
          if (this.party == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionAttesterComponent.party");
            else if (Configuration.doAutoCreate())
              this.party = new Reference(); // cc
          return this.party;
        }

        public boolean hasParty() { 
          return this.party != null && !this.party.isEmpty();
        }

        /**
         * @param value {@link #party} (Who attested the composition in the specified way.)
         */
        public CompositionAttesterComponent setParty(Reference value) { 
          this.party = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("mode", "CodeableConcept", "The type of attestation the authenticator offers.", 0, 1, mode));
          children.add(new Property("time", "dateTime", "When the composition was attested by the party.", 0, 1, time));
          children.add(new Property("party", "Reference(Patient|RelatedPerson|Practitioner|PractitionerRole|Organization|Group)", "Who attested the composition in the specified way.", 0, 1, party));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3357091: /*mode*/  return new Property("mode", "CodeableConcept", "The type of attestation the authenticator offers.", 0, 1, mode);
          case 3560141: /*time*/  return new Property("time", "dateTime", "When the composition was attested by the party.", 0, 1, time);
          case 106437350: /*party*/  return new Property("party", "Reference(Patient|RelatedPerson|Practitioner|PractitionerRole|Organization|Group)", "Who attested the composition in the specified way.", 0, 1, party);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3357091: /*mode*/ return this.mode == null ? new Base[0] : new Base[] {this.mode}; // CodeableConcept
        case 3560141: /*time*/ return this.time == null ? new Base[0] : new Base[] {this.time}; // DateTimeType
        case 106437350: /*party*/ return this.party == null ? new Base[0] : new Base[] {this.party}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3357091: // mode
          this.mode = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 3560141: // time
          this.time = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 106437350: // party
          this.party = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode")) {
          this.mode = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("time")) {
          this.time = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("party")) {
          this.party = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3357091:  return getMode();
        case 3560141:  return getTimeElement();
        case 106437350:  return getParty();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3357091: /*mode*/ return new String[] {"CodeableConcept"};
        case 3560141: /*time*/ return new String[] {"dateTime"};
        case 106437350: /*party*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
          this.mode = new CodeableConcept();
          return this.mode;
        }
        else if (name.equals("time")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.attester.time");
        }
        else if (name.equals("party")) {
          this.party = new Reference();
          return this.party;
        }
        else
          return super.addChild(name);
      }

      public CompositionAttesterComponent copy() {
        CompositionAttesterComponent dst = new CompositionAttesterComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionAttesterComponent dst) {
        super.copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.time = time == null ? null : time.copy();
        dst.party = party == null ? null : party.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionAttesterComponent))
          return false;
        CompositionAttesterComponent o = (CompositionAttesterComponent) other_;
        return compareDeep(mode, o.mode, true) && compareDeep(time, o.time, true) && compareDeep(party, o.party, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionAttesterComponent))
          return false;
        CompositionAttesterComponent o = (CompositionAttesterComponent) other_;
        return compareValues(time, o.time, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(mode, time, party);
      }

  public String fhirType() {
    return "Composition.attester";

  }

  }

    @Block()
    public static class CompositionRelatesToComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The type of relationship to the related artifact.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of | part-of | amends | amended-with | appends | appended-with | cites | cited-by | comments-on | comment-in | contains | contained-in | corrects | correction-in | replaces | replaced-with | retracts | retracted-by | signs | similar-to | supports | supported-with | transforms | transformed-into | transformed-with | documents | specification-of | created-with | cite-as | reprint | reprint-of | summarizes", formalDefinition="The type of relationship to the related artifact." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/artifact-relationship-type")
        protected CodeableConcept type;

        /**
         * The artifact that is related to this Composition Resource.
         */
        @Child(name = "target", type = {UriType.class, Attachment.class, CanonicalType.class, Reference.class, MarkdownType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The artifact that is related to this Composition", formalDefinition="The artifact that is related to this Composition Resource." )
        protected DataType target;

        private static final long serialVersionUID = 55750058L;

    /**
     * Constructor
     */
      public CompositionRelatesToComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CompositionRelatesToComponent(CodeableConcept type, DataType target) {
        super();
        this.setType(type);
        this.setTarget(target);
      }

        /**
         * @return {@link #type} (The type of relationship to the related artifact.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionRelatesToComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The type of relationship to the related artifact.)
         */
        public CompositionRelatesToComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public DataType getTarget() { 
          return this.target;
        }

        /**
         * @return {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public UriType getTargetUriType() throws FHIRException { 
          if (this.target == null)
            this.target = new UriType();
          if (!(this.target instanceof UriType))
            throw new FHIRException("Type mismatch: the type UriType was expected, but "+this.target.getClass().getName()+" was encountered");
          return (UriType) this.target;
        }

        public boolean hasTargetUriType() { 
          return this.target != null && this.target instanceof UriType;
        }

        /**
         * @return {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public Attachment getTargetAttachment() throws FHIRException { 
          if (this.target == null)
            this.target = new Attachment();
          if (!(this.target instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but "+this.target.getClass().getName()+" was encountered");
          return (Attachment) this.target;
        }

        public boolean hasTargetAttachment() { 
          return this.target != null && this.target instanceof Attachment;
        }

        /**
         * @return {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public CanonicalType getTargetCanonicalType() throws FHIRException { 
          if (this.target == null)
            this.target = new CanonicalType();
          if (!(this.target instanceof CanonicalType))
            throw new FHIRException("Type mismatch: the type CanonicalType was expected, but "+this.target.getClass().getName()+" was encountered");
          return (CanonicalType) this.target;
        }

        public boolean hasTargetCanonicalType() { 
          return this.target != null && this.target instanceof CanonicalType;
        }

        /**
         * @return {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public Reference getTargetReference() throws FHIRException { 
          if (this.target == null)
            this.target = new Reference();
          if (!(this.target instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.target.getClass().getName()+" was encountered");
          return (Reference) this.target;
        }

        public boolean hasTargetReference() { 
          return this.target != null && this.target instanceof Reference;
        }

        /**
         * @return {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public MarkdownType getTargetMarkdownType() throws FHIRException { 
          if (this.target == null)
            this.target = new MarkdownType();
          if (!(this.target instanceof MarkdownType))
            throw new FHIRException("Type mismatch: the type MarkdownType was expected, but "+this.target.getClass().getName()+" was encountered");
          return (MarkdownType) this.target;
        }

        public boolean hasTargetMarkdownType() { 
          return this.target != null && this.target instanceof MarkdownType;
        }

        public boolean hasTarget() { 
          return this.target != null && !this.target.isEmpty();
        }

        /**
         * @param value {@link #target} (The artifact that is related to this Composition Resource.)
         */
        public CompositionRelatesToComponent setTarget(DataType value) { 
          if (value != null && !(value instanceof UriType || value instanceof Attachment || value instanceof CanonicalType || value instanceof Reference || value instanceof MarkdownType))
            throw new FHIRException("Not the right type for Composition.relatesTo.target[x]: "+value.fhirType());
          this.target = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "The type of relationship to the related artifact.", 0, 1, type));
          children.add(new Property("target[x]", "uri|Attachment|canonical(Any)|Reference(Any)|markdown", "The artifact that is related to this Composition Resource.", 0, 1, target));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The type of relationship to the related artifact.", 0, 1, type);
          case -815579825: /*target[x]*/  return new Property("target[x]", "uri|Attachment|canonical(Any)|Reference(Any)|markdown", "The artifact that is related to this Composition Resource.", 0, 1, target);
          case -880905839: /*target*/  return new Property("target[x]", "uri|Attachment|canonical(Any)|Reference(Any)|markdown", "The artifact that is related to this Composition Resource.", 0, 1, target);
          case -815585765: /*targetUri*/  return new Property("target[x]", "uri", "The artifact that is related to this Composition Resource.", 0, 1, target);
          case 1345824148: /*targetAttachment*/  return new Property("target[x]", "Attachment", "The artifact that is related to this Composition Resource.", 0, 1, target);
          case -1281653149: /*targetCanonical*/  return new Property("target[x]", "canonical(Any)", "The artifact that is related to this Composition Resource.", 0, 1, target);
          case 1259806906: /*targetReference*/  return new Property("target[x]", "Reference(Any)", "The artifact that is related to this Composition Resource.", 0, 1, target);
          case -1345146464: /*targetMarkdown*/  return new Property("target[x]", "markdown", "The artifact that is related to this Composition Resource.", 0, 1, target);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -880905839: /*target*/ return this.target == null ? new Base[0] : new Base[] {this.target}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -880905839: // target
          this.target = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("target[x]")) {
          this.target = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case -815579825:  return getTarget();
        case -880905839:  return getTarget();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -880905839: /*target*/ return new String[] {"uri", "Attachment", "canonical", "Reference", "markdown"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("targetUri")) {
          this.target = new UriType();
          return this.target;
        }
        else if (name.equals("targetAttachment")) {
          this.target = new Attachment();
          return this.target;
        }
        else if (name.equals("targetCanonical")) {
          this.target = new CanonicalType();
          return this.target;
        }
        else if (name.equals("targetReference")) {
          this.target = new Reference();
          return this.target;
        }
        else if (name.equals("targetMarkdown")) {
          this.target = new MarkdownType();
          return this.target;
        }
        else
          return super.addChild(name);
      }

      public CompositionRelatesToComponent copy() {
        CompositionRelatesToComponent dst = new CompositionRelatesToComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionRelatesToComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.target = target == null ? null : target.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionRelatesToComponent))
          return false;
        CompositionRelatesToComponent o = (CompositionRelatesToComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(target, o.target, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionRelatesToComponent))
          return false;
        CompositionRelatesToComponent o = (CompositionRelatesToComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, target);
      }

  public String fhirType() {
    return "Composition.relatesTo";

  }

  }

    @Block()
    public static class CompositionEventComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.
         */
        @Child(name = "period", type = {Period.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The period covered by the documentation", formalDefinition="The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time." )
        protected Period period;

        /**
         * Represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which case the procedure being documented is necessarily a "History and Physical" act. The events may be included as a code or as a reference to an other resource.
         */
        @Child(name = "detail", type = {CodeableReference.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="The event(s) being documented, as code(s), reference(s), or both", formalDefinition="Represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which case the procedure being documented is necessarily a \"History and Physical\" act. The events may be included as a code or as a reference to an other resource." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/v3-ActCode")
        protected List<CodeableReference> detail;

        private static final long serialVersionUID = -2108044093L;

    /**
     * Constructor
     */
      public CompositionEventComponent() {
        super();
      }

        /**
         * @return {@link #period} (The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.)
         */
        public Period getPeriod() { 
          if (this.period == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionEventComponent.period");
            else if (Configuration.doAutoCreate())
              this.period = new Period(); // cc
          return this.period;
        }

        public boolean hasPeriod() { 
          return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.)
         */
        public CompositionEventComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        /**
         * @return {@link #detail} (Represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which case the procedure being documented is necessarily a "History and Physical" act. The events may be included as a code or as a reference to an other resource.)
         */
        public List<CodeableReference> getDetail() { 
          if (this.detail == null)
            this.detail = new ArrayList<CodeableReference>();
          return this.detail;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CompositionEventComponent setDetail(List<CodeableReference> theDetail) { 
          this.detail = theDetail;
          return this;
        }

        public boolean hasDetail() { 
          if (this.detail == null)
            return false;
          for (CodeableReference item : this.detail)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableReference addDetail() { //3
          CodeableReference t = new CodeableReference();
          if (this.detail == null)
            this.detail = new ArrayList<CodeableReference>();
          this.detail.add(t);
          return t;
        }

        public CompositionEventComponent addDetail(CodeableReference t) { //3
          if (t == null)
            return this;
          if (this.detail == null)
            this.detail = new ArrayList<CodeableReference>();
          this.detail.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #detail}, creating it if it does not already exist {3}
         */
        public CodeableReference getDetailFirstRep() { 
          if (getDetail().isEmpty()) {
            addDetail();
          }
          return getDetail().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("period", "Period", "The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.", 0, 1, period));
          children.add(new Property("detail", "CodeableReference(Any)", "Represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which case the procedure being documented is necessarily a \"History and Physical\" act. The events may be included as a code or as a reference to an other resource.", 0, java.lang.Integer.MAX_VALUE, detail));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -991726143: /*period*/  return new Property("period", "Period", "The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.", 0, 1, period);
          case -1335224239: /*detail*/  return new Property("detail", "CodeableReference(Any)", "Represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which case the procedure being documented is necessarily a \"History and Physical\" act. The events may be included as a code or as a reference to an other resource.", 0, java.lang.Integer.MAX_VALUE, detail);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case -1335224239: /*detail*/ return this.detail == null ? new Base[0] : this.detail.toArray(new Base[this.detail.size()]); // CodeableReference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case -1335224239: // detail
          this.getDetail().add(TypeConvertor.castToCodeableReference(value)); // CodeableReference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("detail")) {
          this.getDetail().add(TypeConvertor.castToCodeableReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -991726143:  return getPeriod();
        case -1335224239:  return addDetail(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -991726143: /*period*/ return new String[] {"Period"};
        case -1335224239: /*detail*/ return new String[] {"CodeableReference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("detail")) {
          return addDetail();
        }
        else
          return super.addChild(name);
      }

      public CompositionEventComponent copy() {
        CompositionEventComponent dst = new CompositionEventComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionEventComponent dst) {
        super.copyValues(dst);
        dst.period = period == null ? null : period.copy();
        if (detail != null) {
          dst.detail = new ArrayList<CodeableReference>();
          for (CodeableReference i : detail)
            dst.detail.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionEventComponent))
          return false;
        CompositionEventComponent o = (CompositionEventComponent) other_;
        return compareDeep(period, o.period, true) && compareDeep(detail, o.detail, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionEventComponent))
          return false;
        CompositionEventComponent o = (CompositionEventComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(period, detail);
      }

  public String fhirType() {
    return "Composition.event";

  }

  }

    @Block()
    public static class SectionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
         */
        @Child(name = "title", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for section (e.g. for ToC)", formalDefinition="The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents." )
        protected StringType title;

        /**
         * A code identifying the kind of content contained within the section. This must be consistent with the section title.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of section (recommended)", formalDefinition="A code identifying the kind of content contained within the section. This must be consistent with the section title." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/doc-section-codes")
        protected CodeableConcept code;

        /**
         * Identifies who is responsible for the information in this section, not necessarily who typed it in.   

The actual author of the section when it is not the author of the composition. If author is not specified, the author is assumed to be the author of the parent section or the author of the composition.
         */
        @Child(name = "author", type = {Practitioner.class, PractitionerRole.class, CareTeam.class, Device.class, Patient.class, RelatedPerson.class, Organization.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Who and/or what authored the section, when the section is authored by someone other than the composition.author", formalDefinition="Identifies who is responsible for the information in this section, not necessarily who typed it in.   \n\nThe actual author of the section when it is not the author of the composition. If author is not specified, the author is assumed to be the author of the parent section or the author of the composition." )
        protected List<Reference> author;

        /**
         * The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).
         */
        @Child(name = "focus", type = {Reference.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Who/what the section is about, when it is not about the subject of composition", formalDefinition="The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources)." )
        protected Reference focus;

        /**
         * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
         */
        @Child(name = "text", type = {Narrative.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Text summary of the section, for human interpretation", formalDefinition="A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative." )
        protected Narrative text;

        /**
         * Information about the section contents that is not represented by any of the section entries.
         */
        @Child(name = "note", type = {Annotation.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Information about the section contents that is not represented by any of the section entries", formalDefinition="Information about the section contents that is not represented by any of the section entries." )
        protected List<Annotation> note;

        /**
         * Specifies the order applied to the items in the section entries.
         */
        @Child(name = "orderedBy", type = {CodeableConcept.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Order of section entries", formalDefinition="Specifies the order applied to the items in the section entries." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/list-order")
        protected CodeableConcept orderedBy;

        /**
         * A reference to the actual resource from which the narrative in the section is derived.
         */
        @Child(name = "entry", type = {Reference.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="A reference to data that supports this section", formalDefinition="A reference to the actual resource from which the narrative in the section is derived." )
        protected List<Reference> entry;

        /**
         * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
         */
        @Child(name = "emptyReason", type = {CodeableConcept.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Why the section is empty", formalDefinition="If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/list-empty-reason")
        protected CodeableConcept emptyReason;

        /**
         * A nested sub-section within this section.
         */
        @Child(name = "section", type = {SectionComponent.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Nested Section", formalDefinition="A nested sub-section within this section." )
        protected List<SectionComponent> section;

        private static final long serialVersionUID = 2132008445L;

    /**
     * Constructor
     */
      public SectionComponent() {
        super();
      }

        /**
         * @return {@link #title} (The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public StringType getTitleElement() { 
          if (this.title == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.title");
            else if (Configuration.doAutoCreate())
              this.title = new StringType(); // bb
          return this.title;
        }

        public boolean hasTitleElement() { 
          return this.title != null && !this.title.isEmpty();
        }

        public boolean hasTitle() { 
          return this.title != null && !this.title.isEmpty();
        }

        /**
         * @param value {@link #title} (The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public SectionComponent setTitleElement(StringType value) { 
          this.title = value;
          return this;
        }

        /**
         * @return The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
         */
        public String getTitle() { 
          return this.title == null ? null : this.title.getValue();
        }

        /**
         * @param value The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
         */
        public SectionComponent setTitle(String value) { 
          if (Utilities.noString(value))
            this.title = null;
          else {
            if (this.title == null)
              this.title = new StringType();
            this.title.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #code} (A code identifying the kind of content contained within the section. This must be consistent with the section title.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (A code identifying the kind of content contained within the section. This must be consistent with the section title.)
         */
        public SectionComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #author} (Identifies who is responsible for the information in this section, not necessarily who typed it in.   

The actual author of the section when it is not the author of the composition. If author is not specified, the author is assumed to be the author of the parent section or the author of the composition.)
         */
        public List<Reference> getAuthor() { 
          if (this.author == null)
            this.author = new ArrayList<Reference>();
          return this.author;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setAuthor(List<Reference> theAuthor) { 
          this.author = theAuthor;
          return this;
        }

        public boolean hasAuthor() { 
          if (this.author == null)
            return false;
          for (Reference item : this.author)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addAuthor() { //3
          Reference t = new Reference();
          if (this.author == null)
            this.author = new ArrayList<Reference>();
          this.author.add(t);
          return t;
        }

        public SectionComponent addAuthor(Reference t) { //3
          if (t == null)
            return this;
          if (this.author == null)
            this.author = new ArrayList<Reference>();
          this.author.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist {3}
         */
        public Reference getAuthorFirstRep() { 
          if (getAuthor().isEmpty()) {
            addAuthor();
          }
          return getAuthor().get(0);
        }

        /**
         * @return {@link #focus} (The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).)
         */
        public Reference getFocus() { 
          if (this.focus == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.focus");
            else if (Configuration.doAutoCreate())
              this.focus = new Reference(); // cc
          return this.focus;
        }

        public boolean hasFocus() { 
          return this.focus != null && !this.focus.isEmpty();
        }

        /**
         * @param value {@link #focus} (The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).)
         */
        public SectionComponent setFocus(Reference value) { 
          this.focus = value;
          return this;
        }

        /**
         * @return {@link #text} (A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.)
         */
        public Narrative getText() { 
          if (this.text == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.text");
            else if (Configuration.doAutoCreate())
              this.text = new Narrative(); // cc
          return this.text;
        }

        public boolean hasText() { 
          return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.)
         */
        public SectionComponent setText(Narrative value) { 
          this.text = value;
          return this;
        }

        /**
         * @return {@link #note} (Information about the section contents that is not represented by any of the section entries.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public SectionComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist {3}
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #orderedBy} (Specifies the order applied to the items in the section entries.)
         */
        public CodeableConcept getOrderedBy() { 
          if (this.orderedBy == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.orderedBy");
            else if (Configuration.doAutoCreate())
              this.orderedBy = new CodeableConcept(); // cc
          return this.orderedBy;
        }

        public boolean hasOrderedBy() { 
          return this.orderedBy != null && !this.orderedBy.isEmpty();
        }

        /**
         * @param value {@link #orderedBy} (Specifies the order applied to the items in the section entries.)
         */
        public SectionComponent setOrderedBy(CodeableConcept value) { 
          this.orderedBy = value;
          return this;
        }

        /**
         * @return {@link #entry} (A reference to the actual resource from which the narrative in the section is derived.)
         */
        public List<Reference> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<Reference>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setEntry(List<Reference> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (Reference item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addEntry() { //3
          Reference t = new Reference();
          if (this.entry == null)
            this.entry = new ArrayList<Reference>();
          this.entry.add(t);
          return t;
        }

        public SectionComponent addEntry(Reference t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<Reference>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist {3}
         */
        public Reference getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        /**
         * @return {@link #emptyReason} (If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.)
         */
        public CodeableConcept getEmptyReason() { 
          if (this.emptyReason == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.emptyReason");
            else if (Configuration.doAutoCreate())
              this.emptyReason = new CodeableConcept(); // cc
          return this.emptyReason;
        }

        public boolean hasEmptyReason() { 
          return this.emptyReason != null && !this.emptyReason.isEmpty();
        }

        /**
         * @param value {@link #emptyReason} (If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.)
         */
        public SectionComponent setEmptyReason(CodeableConcept value) { 
          this.emptyReason = value;
          return this;
        }

        /**
         * @return {@link #section} (A nested sub-section within this section.)
         */
        public List<SectionComponent> getSection() { 
          if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
          return this.section;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setSection(List<SectionComponent> theSection) { 
          this.section = theSection;
          return this;
        }

        public boolean hasSection() { 
          if (this.section == null)
            return false;
          for (SectionComponent item : this.section)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public SectionComponent addSection() { //3
          SectionComponent t = new SectionComponent();
          if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
          this.section.add(t);
          return t;
        }

        public SectionComponent addSection(SectionComponent t) { //3
          if (t == null)
            return this;
          if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
          this.section.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #section}, creating it if it does not already exist {3}
         */
        public SectionComponent getSectionFirstRep() { 
          if (getSection().isEmpty()) {
            addSection();
          }
          return getSection().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("title", "string", "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.", 0, 1, title));
          children.add(new Property("code", "CodeableConcept", "A code identifying the kind of content contained within the section. This must be consistent with the section title.", 0, 1, code));
          children.add(new Property("author", "Reference(Practitioner|PractitionerRole|CareTeam|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in this section, not necessarily who typed it in.   \n\nThe actual author of the section when it is not the author of the composition. If author is not specified, the author is assumed to be the author of the parent section or the author of the composition.", 0, java.lang.Integer.MAX_VALUE, author));
          children.add(new Property("focus", "Reference(Any)", "The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).", 0, 1, focus));
          children.add(new Property("text", "Narrative", "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative.", 0, 1, text));
          children.add(new Property("note", "Annotation", "Information about the section contents that is not represented by any of the section entries.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("orderedBy", "CodeableConcept", "Specifies the order applied to the items in the section entries.", 0, 1, orderedBy));
          children.add(new Property("entry", "Reference(Any)", "A reference to the actual resource from which the narrative in the section is derived.", 0, java.lang.Integer.MAX_VALUE, entry));
          children.add(new Property("emptyReason", "CodeableConcept", "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.", 0, 1, emptyReason));
          children.add(new Property("section", "@Composition.section", "A nested sub-section within this section.", 0, java.lang.Integer.MAX_VALUE, section));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 110371416: /*title*/  return new Property("title", "string", "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.", 0, 1, title);
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "A code identifying the kind of content contained within the section. This must be consistent with the section title.", 0, 1, code);
          case -1406328437: /*author*/  return new Property("author", "Reference(Practitioner|PractitionerRole|CareTeam|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in this section, not necessarily who typed it in.   \n\nThe actual author of the section when it is not the author of the composition. If author is not specified, the author is assumed to be the author of the parent section or the author of the composition.", 0, java.lang.Integer.MAX_VALUE, author);
          case 97604824: /*focus*/  return new Property("focus", "Reference(Any)", "The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).", 0, 1, focus);
          case 3556653: /*text*/  return new Property("text", "Narrative", "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative.", 0, 1, text);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Information about the section contents that is not represented by any of the section entries.", 0, java.lang.Integer.MAX_VALUE, note);
          case -391079516: /*orderedBy*/  return new Property("orderedBy", "CodeableConcept", "Specifies the order applied to the items in the section entries.", 0, 1, orderedBy);
          case 96667762: /*entry*/  return new Property("entry", "Reference(Any)", "A reference to the actual resource from which the narrative in the section is derived.", 0, java.lang.Integer.MAX_VALUE, entry);
          case 1140135409: /*emptyReason*/  return new Property("emptyReason", "CodeableConcept", "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.", 0, 1, emptyReason);
          case 1970241253: /*section*/  return new Property("section", "@Composition.section", "A nested sub-section within this section.", 0, java.lang.Integer.MAX_VALUE, section);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // Reference
        case 97604824: /*focus*/ return this.focus == null ? new Base[0] : new Base[] {this.focus}; // Reference
        case 3556653: /*text*/ return this.text == null ? new Base[0] : new Base[] {this.text}; // Narrative
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -391079516: /*orderedBy*/ return this.orderedBy == null ? new Base[0] : new Base[] {this.orderedBy}; // CodeableConcept
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // Reference
        case 1140135409: /*emptyReason*/ return this.emptyReason == null ? new Base[0] : new Base[] {this.emptyReason}; // CodeableConcept
        case 1970241253: /*section*/ return this.section == null ? new Base[0] : this.section.toArray(new Base[this.section.size()]); // SectionComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1406328437: // author
          this.getAuthor().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 97604824: // focus
          this.focus = TypeConvertor.castToReference(value); // Reference
          return value;
        case 3556653: // text
          this.text = TypeConvertor.castToNarrative(value); // Narrative
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        case -391079516: // orderedBy
          this.orderedBy = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 96667762: // entry
          this.getEntry().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 1140135409: // emptyReason
          this.emptyReason = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1970241253: // section
          this.getSection().add((SectionComponent) value); // SectionComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("author")) {
          this.getAuthor().add(TypeConvertor.castToReference(value));
        } else if (name.equals("focus")) {
          this.focus = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("text")) {
          this.text = TypeConvertor.castToNarrative(value); // Narrative
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else if (name.equals("orderedBy")) {
          this.orderedBy = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("entry")) {
          this.getEntry().add(TypeConvertor.castToReference(value));
        } else if (name.equals("emptyReason")) {
          this.emptyReason = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("section")) {
          this.getSection().add((SectionComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 110371416:  return getTitleElement();
        case 3059181:  return getCode();
        case -1406328437:  return addAuthor(); 
        case 97604824:  return getFocus();
        case 3556653:  return getText();
        case 3387378:  return addNote(); 
        case -391079516:  return getOrderedBy();
        case 96667762:  return addEntry(); 
        case 1140135409:  return getEmptyReason();
        case 1970241253:  return addSection(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 110371416: /*title*/ return new String[] {"string"};
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -1406328437: /*author*/ return new String[] {"Reference"};
        case 97604824: /*focus*/ return new String[] {"Reference"};
        case 3556653: /*text*/ return new String[] {"Narrative"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -391079516: /*orderedBy*/ return new String[] {"CodeableConcept"};
        case 96667762: /*entry*/ return new String[] {"Reference"};
        case 1140135409: /*emptyReason*/ return new String[] {"CodeableConcept"};
        case 1970241253: /*section*/ return new String[] {"@Composition.section"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.section.title");
        }
        else if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("focus")) {
          this.focus = new Reference();
          return this.focus;
        }
        else if (name.equals("text")) {
          this.text = new Narrative();
          return this.text;
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("orderedBy")) {
          this.orderedBy = new CodeableConcept();
          return this.orderedBy;
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else if (name.equals("emptyReason")) {
          this.emptyReason = new CodeableConcept();
          return this.emptyReason;
        }
        else if (name.equals("section")) {
          return addSection();
        }
        else
          return super.addChild(name);
      }

      public SectionComponent copy() {
        SectionComponent dst = new SectionComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(SectionComponent dst) {
        super.copyValues(dst);
        dst.title = title == null ? null : title.copy();
        dst.code = code == null ? null : code.copy();
        if (author != null) {
          dst.author = new ArrayList<Reference>();
          for (Reference i : author)
            dst.author.add(i.copy());
        };
        dst.focus = focus == null ? null : focus.copy();
        dst.text = text == null ? null : text.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.orderedBy = orderedBy == null ? null : orderedBy.copy();
        if (entry != null) {
          dst.entry = new ArrayList<Reference>();
          for (Reference i : entry)
            dst.entry.add(i.copy());
        };
        dst.emptyReason = emptyReason == null ? null : emptyReason.copy();
        if (section != null) {
          dst.section = new ArrayList<SectionComponent>();
          for (SectionComponent i : section)
            dst.section.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof SectionComponent))
          return false;
        SectionComponent o = (SectionComponent) other_;
        return compareDeep(title, o.title, true) && compareDeep(code, o.code, true) && compareDeep(author, o.author, true)
           && compareDeep(focus, o.focus, true) && compareDeep(text, o.text, true) && compareDeep(note, o.note, true)
           && compareDeep(orderedBy, o.orderedBy, true) && compareDeep(entry, o.entry, true) && compareDeep(emptyReason, o.emptyReason, true)
           && compareDeep(section, o.section, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof SectionComponent))
          return false;
        SectionComponent o = (SectionComponent) other_;
        return compareValues(title, o.title, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(title, code, author, focus
          , text, note, orderedBy, entry, emptyReason, section);
      }

  public String fhirType() {
    return "Composition.section";

  }

  }

    /**
     * An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.
     */
    @Child(name = "url", type = {UriType.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Canonical identifier for this Composition, represented as a URI (globally unique)", formalDefinition="An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers." )
    protected UriType url;

    /**
     * A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Version-independent identifier for the Composition", formalDefinition="A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time." )
    protected List<Identifier> identifier;

    /**
     * An explicitly assigned identifier of a variation of the content in the Composition.
     */
    @Child(name = "version", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="An explicitly assigned identifier of a variation of the content in the Composition", formalDefinition="An explicitly assigned identifier of a variation of the content in the Composition." )
    protected StringType version;

    /**
     * References the consents associated with this document. Examples include a consent to perform the clinical service being documented (.event) or a consent for the information contained in the document to be released to a third party.
     */
    @Child(name = "consent", type = {Consent.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Represents informed consents and medico-legal transactions", formalDefinition="References the consents associated with this document. Examples include a consent to perform the clinical service being documented (.event) or a consent for the information contained in the document to be released to a third party." )
    protected List<Reference> consent;

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by this composition.
     */
    @Child(name = "basedOn", type = {Appointment.class, AppointmentResponse.class, CarePlan.class, Claim.class, CommunicationRequest.class, CoverageEligibilityRequest.class, DeviceRequest.class, EnrollmentRequest.class, MedicationRequest.class, NutritionOrder.class, RequestOrchestration.class, ServiceRequest.class, Task.class, VisionPrescription.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Fulfills plan, proposal or order", formalDefinition="A plan, proposal or order that is fulfilled in whole or in part by this composition." )
    protected List<Reference> basedOn;

    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    @Child(name = "status", type = {CodeType.class}, order=5, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="registered | partial | preliminary | final | amended | corrected | appended | cancelled | entered-in-error | deprecated | unknown", formalDefinition="The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/composition-status")
    protected Enumeration<CompositionStatus> status;

    /**
     * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=6, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Kind of composition (LOINC if possible)", formalDefinition="Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/doc-typecodes")
    protected CodeableConcept type;

    /**
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
     */
    @Child(name = "category", type = {CodeableConcept.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Categorization of Composition", formalDefinition="A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/referenced-item-category")
    protected List<CodeableConcept> category;

    /**
     * Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).
     */
    @Child(name = "subject", type = {Reference.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Who and/or what the composition is about", formalDefinition="Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)." )
    protected List<Reference> subject;

    /**
     * Describes the clinical encounter or type of care this documentation is associated with.
     */
    @Child(name = "encounter", type = {Encounter.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Context of the Composition", formalDefinition="Describes the clinical encounter or type of care this documentation is associated with." )
    protected Reference encounter;

    /**
     * The composition editing time, when the composition was last logically changed by the author.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=10, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Composition editing time", formalDefinition="The composition editing time, when the composition was last logically changed by the author." )
    protected DateTimeType date;

    /**
     * The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Composition instances.
     */
    @Child(name = "useContext", type = {UsageContext.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The context that the content is intended to support", formalDefinition="The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Composition instances." )
    protected List<UsageContext> useContext;

    /**
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     */
    @Child(name = "author", type = {Practitioner.class, PractitionerRole.class, CareTeam.class, Device.class, Patient.class, RelatedPerson.class, Organization.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Who and/or what authored the composition", formalDefinition="Identifies who is responsible for the information in the composition, not necessarily who typed it in." )
    protected List<Reference> author;

    /**
     * Identifies supporting entities, including parents, relatives, caregivers, insurance policyholders, guarantors, and others related in some way to the patient. A supporting person or organization is an individual or an organization with a relationship to the patient. A supporting person who is playing multiple roles would be recorded in multiple participants (e.g., emergency contact and next-of-kin).
     */
    @Child(name = "participant", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Identifies supporting entities, including parents, relatives, caregivers, insurance policyholders, guarantors, and others related in some way to the patient", formalDefinition="Identifies supporting entities, including parents, relatives, caregivers, insurance policyholders, guarantors, and others related in some way to the patient. A supporting person or organization is an individual or an organization with a relationship to the patient. A supporting person who is playing multiple roles would be recorded in multiple participants (e.g., emergency contact and next-of-kin)." )
    protected List<CompositionParticipantComponent> participant;

    /**
     * A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    @Child(name = "name", type = {StringType.class}, order=14, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Name for this Composition (computer friendly)", formalDefinition="A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation." )
    protected StringType name;

    /**
     * Official human-readable label for the composition.
     */
    @Child(name = "title", type = {StringType.class}, order=15, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Human Readable name/title", formalDefinition="Official human-readable label for the composition." )
    protected StringType title;

    /**
     * For any additional notes.
     */
    @Child(name = "note", type = {Annotation.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="For any additional notes", formalDefinition="For any additional notes." )
    protected List<Annotation> note;

    /**
     * A participant who has attested to the accuracy of the composition/document.
     */
    @Child(name = "attester", type = {}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Attests to accuracy of composition", formalDefinition="A participant who has attested to the accuracy of the composition/document." )
    protected List<CompositionAttesterComponent> attester;

    /**
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.
     */
    @Child(name = "custodian", type = {Organization.class, Patient.class, Group.class}, order=18, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Organization which maintains the composition", formalDefinition="Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information." )
    protected Reference custodian;

    /**
     * Relationships that this composition has with other compositions or documents (FHIR or non-FHIR resources) that already exist.
     */
    @Child(name = "relatesTo", type = {}, order=19, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Relationships to other compositions/documents", formalDefinition="Relationships that this composition has with other compositions or documents (FHIR or non-FHIR resources) that already exist." )
    protected List<CompositionRelatesToComponent> relatesTo;

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being documented.
     */
    @Child(name = "event", type = {}, order=20, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The clinical service(s) being documented", formalDefinition="The clinical service, such as a colonoscopy or an appendectomy, being documented." )
    protected List<CompositionEventComponent> event;

    /**
     * The root of the sections that make up the composition.
     */
    @Child(name = "section", type = {}, order=21, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Composition is broken into sections", formalDefinition="The root of the sections that make up the composition." )
    protected List<SectionComponent> section;

    private static final long serialVersionUID = 1900112031L;

  /**
   * Constructor
   */
    public Composition() {
      super();
    }

  /**
   * Constructor
   */
    public Composition(CompositionStatus status, CodeableConcept type, Date date) {
      super();
      this.setStatus(status);
      this.setType(type);
      this.setDate(date);
    }

    /**
     * @return {@link #url} (An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Composition setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.
     */
    public Composition setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setIdentifier(List<Identifier> theIdentifier) { 
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

    public Composition addIdentifier(Identifier t) { //3
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
     * @return {@link #version} (An explicitly assigned identifier of a variation of the content in the Composition.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (An explicitly assigned identifier of a variation of the content in the Composition.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Composition setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return An explicitly assigned identifier of a variation of the content in the Composition.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value An explicitly assigned identifier of a variation of the content in the Composition.
     */
    public Composition setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #consent} (References the consents associated with this document. Examples include a consent to perform the clinical service being documented (.event) or a consent for the information contained in the document to be released to a third party.)
     */
    public List<Reference> getConsent() { 
      if (this.consent == null)
        this.consent = new ArrayList<Reference>();
      return this.consent;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setConsent(List<Reference> theConsent) { 
      this.consent = theConsent;
      return this;
    }

    public boolean hasConsent() { 
      if (this.consent == null)
        return false;
      for (Reference item : this.consent)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addConsent() { //3
      Reference t = new Reference();
      if (this.consent == null)
        this.consent = new ArrayList<Reference>();
      this.consent.add(t);
      return t;
    }

    public Composition addConsent(Reference t) { //3
      if (t == null)
        return this;
      if (this.consent == null)
        this.consent = new ArrayList<Reference>();
      this.consent.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #consent}, creating it if it does not already exist {3}
     */
    public Reference getConsentFirstRep() { 
      if (getConsent().isEmpty()) {
        addConsent();
      }
      return getConsent().get(0);
    }

    /**
     * @return {@link #basedOn} (A plan, proposal or order that is fulfilled in whole or in part by this composition.)
     */
    public List<Reference> getBasedOn() { 
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      return this.basedOn;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setBasedOn(List<Reference> theBasedOn) { 
      this.basedOn = theBasedOn;
      return this;
    }

    public boolean hasBasedOn() { 
      if (this.basedOn == null)
        return false;
      for (Reference item : this.basedOn)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addBasedOn() { //3
      Reference t = new Reference();
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return t;
    }

    public Composition addBasedOn(Reference t) { //3
      if (t == null)
        return this;
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #basedOn}, creating it if it does not already exist {3}
     */
    public Reference getBasedOnFirstRep() { 
      if (getBasedOn().isEmpty()) {
        addBasedOn();
      }
      return getBasedOn().get(0);
    }

    /**
     * @return {@link #status} (The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<CompositionStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<CompositionStatus>(new CompositionStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Composition setStatusElement(Enumeration<CompositionStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    public CompositionStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    public Composition setStatus(CompositionStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<CompositionStatus>(new CompositionStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #type} (Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.)
     */
    public Composition setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #category} (A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.)
     */
    public List<CodeableConcept> getCategory() { 
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      return this.category;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setCategory(List<CodeableConcept> theCategory) { 
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

    public Composition addCategory(CodeableConcept t) { //3
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
     * @return {@link #subject} (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public List<Reference> getSubject() { 
      if (this.subject == null)
        this.subject = new ArrayList<Reference>();
      return this.subject;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setSubject(List<Reference> theSubject) { 
      this.subject = theSubject;
      return this;
    }

    public boolean hasSubject() { 
      if (this.subject == null)
        return false;
      for (Reference item : this.subject)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addSubject() { //3
      Reference t = new Reference();
      if (this.subject == null)
        this.subject = new ArrayList<Reference>();
      this.subject.add(t);
      return t;
    }

    public Composition addSubject(Reference t) { //3
      if (t == null)
        return this;
      if (this.subject == null)
        this.subject = new ArrayList<Reference>();
      this.subject.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #subject}, creating it if it does not already exist {3}
     */
    public Reference getSubjectFirstRep() { 
      if (getSubject().isEmpty()) {
        addSubject();
      }
      return getSubject().get(0);
    }

    /**
     * @return {@link #encounter} (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Reference getEncounter() { 
      if (this.encounter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.encounter");
        else if (Configuration.doAutoCreate())
          this.encounter = new Reference(); // cc
      return this.encounter;
    }

    public boolean hasEncounter() { 
      return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Composition setEncounter(Reference value) { 
      this.encounter = value;
      return this;
    }

    /**
     * @return {@link #date} (The composition editing time, when the composition was last logically changed by the author.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The composition editing time, when the composition was last logically changed by the author.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Composition setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The composition editing time, when the composition was last logically changed by the author.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The composition editing time, when the composition was last logically changed by the author.
     */
    public Composition setDate(Date value) { 
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      return this;
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Composition instances.)
     */
    public List<UsageContext> getUseContext() { 
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      return this.useContext;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setUseContext(List<UsageContext> theUseContext) { 
      this.useContext = theUseContext;
      return this;
    }

    public boolean hasUseContext() { 
      if (this.useContext == null)
        return false;
      for (UsageContext item : this.useContext)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addUseContext() { //3
      UsageContext t = new UsageContext();
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return t;
    }

    public Composition addUseContext(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #useContext}, creating it if it does not already exist {3}
     */
    public UsageContext getUseContextFirstRep() { 
      if (getUseContext().isEmpty()) {
        addUseContext();
      }
      return getUseContext().get(0);
    }

    /**
     * @return {@link #author} (Identifies who is responsible for the information in the composition, not necessarily who typed it in.)
     */
    public List<Reference> getAuthor() { 
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      return this.author;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setAuthor(List<Reference> theAuthor) { 
      this.author = theAuthor;
      return this;
    }

    public boolean hasAuthor() { 
      if (this.author == null)
        return false;
      for (Reference item : this.author)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addAuthor() { //3
      Reference t = new Reference();
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      this.author.add(t);
      return t;
    }

    public Composition addAuthor(Reference t) { //3
      if (t == null)
        return this;
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      this.author.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist {3}
     */
    public Reference getAuthorFirstRep() { 
      if (getAuthor().isEmpty()) {
        addAuthor();
      }
      return getAuthor().get(0);
    }

    /**
     * @return {@link #participant} (Identifies supporting entities, including parents, relatives, caregivers, insurance policyholders, guarantors, and others related in some way to the patient. A supporting person or organization is an individual or an organization with a relationship to the patient. A supporting person who is playing multiple roles would be recorded in multiple participants (e.g., emergency contact and next-of-kin).)
     */
    public List<CompositionParticipantComponent> getParticipant() { 
      if (this.participant == null)
        this.participant = new ArrayList<CompositionParticipantComponent>();
      return this.participant;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setParticipant(List<CompositionParticipantComponent> theParticipant) { 
      this.participant = theParticipant;
      return this;
    }

    public boolean hasParticipant() { 
      if (this.participant == null)
        return false;
      for (CompositionParticipantComponent item : this.participant)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionParticipantComponent addParticipant() { //3
      CompositionParticipantComponent t = new CompositionParticipantComponent();
      if (this.participant == null)
        this.participant = new ArrayList<CompositionParticipantComponent>();
      this.participant.add(t);
      return t;
    }

    public Composition addParticipant(CompositionParticipantComponent t) { //3
      if (t == null)
        return this;
      if (this.participant == null)
        this.participant = new ArrayList<CompositionParticipantComponent>();
      this.participant.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #participant}, creating it if it does not already exist {3}
     */
    public CompositionParticipantComponent getParticipantFirstRep() { 
      if (getParticipant().isEmpty()) {
        addParticipant();
      }
      return getParticipant().get(0);
    }

    /**
     * @return {@link #name} (A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.name");
        else if (Configuration.doAutoCreate())
          this.name = new StringType(); // bb
      return this.name;
    }

    public boolean hasNameElement() { 
      return this.name != null && !this.name.isEmpty();
    }

    public boolean hasName() { 
      return this.name != null && !this.name.isEmpty();
    }

    /**
     * @param value {@link #name} (A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public Composition setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.
     */
    public Composition setName(String value) { 
      if (Utilities.noString(value))
        this.name = null;
      else {
        if (this.name == null)
          this.name = new StringType();
        this.name.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (Official human-readable label for the composition.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (Official human-readable label for the composition.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public Composition setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return Official human-readable label for the composition.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value Official human-readable label for the composition.
     */
    public Composition setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #note} (For any additional notes.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public Composition addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist {3}
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

    /**
     * @return {@link #attester} (A participant who has attested to the accuracy of the composition/document.)
     */
    public List<CompositionAttesterComponent> getAttester() { 
      if (this.attester == null)
        this.attester = new ArrayList<CompositionAttesterComponent>();
      return this.attester;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setAttester(List<CompositionAttesterComponent> theAttester) { 
      this.attester = theAttester;
      return this;
    }

    public boolean hasAttester() { 
      if (this.attester == null)
        return false;
      for (CompositionAttesterComponent item : this.attester)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionAttesterComponent addAttester() { //3
      CompositionAttesterComponent t = new CompositionAttesterComponent();
      if (this.attester == null)
        this.attester = new ArrayList<CompositionAttesterComponent>();
      this.attester.add(t);
      return t;
    }

    public Composition addAttester(CompositionAttesterComponent t) { //3
      if (t == null)
        return this;
      if (this.attester == null)
        this.attester = new ArrayList<CompositionAttesterComponent>();
      this.attester.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #attester}, creating it if it does not already exist {3}
     */
    public CompositionAttesterComponent getAttesterFirstRep() { 
      if (getAttester().isEmpty()) {
        addAttester();
      }
      return getAttester().get(0);
    }

    /**
     * @return {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Reference getCustodian() { 
      if (this.custodian == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.custodian");
        else if (Configuration.doAutoCreate())
          this.custodian = new Reference(); // cc
      return this.custodian;
    }

    public boolean hasCustodian() { 
      return this.custodian != null && !this.custodian.isEmpty();
    }

    /**
     * @param value {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Composition setCustodian(Reference value) { 
      this.custodian = value;
      return this;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this composition has with other compositions or documents (FHIR or non-FHIR resources) that already exist.)
     */
    public List<CompositionRelatesToComponent> getRelatesTo() { 
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<CompositionRelatesToComponent>();
      return this.relatesTo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setRelatesTo(List<CompositionRelatesToComponent> theRelatesTo) { 
      this.relatesTo = theRelatesTo;
      return this;
    }

    public boolean hasRelatesTo() { 
      if (this.relatesTo == null)
        return false;
      for (CompositionRelatesToComponent item : this.relatesTo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionRelatesToComponent addRelatesTo() { //3
      CompositionRelatesToComponent t = new CompositionRelatesToComponent();
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<CompositionRelatesToComponent>();
      this.relatesTo.add(t);
      return t;
    }

    public Composition addRelatesTo(CompositionRelatesToComponent t) { //3
      if (t == null)
        return this;
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<CompositionRelatesToComponent>();
      this.relatesTo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatesTo}, creating it if it does not already exist {3}
     */
    public CompositionRelatesToComponent getRelatesToFirstRep() { 
      if (getRelatesTo().isEmpty()) {
        addRelatesTo();
      }
      return getRelatesTo().get(0);
    }

    /**
     * @return {@link #event} (The clinical service, such as a colonoscopy or an appendectomy, being documented.)
     */
    public List<CompositionEventComponent> getEvent() { 
      if (this.event == null)
        this.event = new ArrayList<CompositionEventComponent>();
      return this.event;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setEvent(List<CompositionEventComponent> theEvent) { 
      this.event = theEvent;
      return this;
    }

    public boolean hasEvent() { 
      if (this.event == null)
        return false;
      for (CompositionEventComponent item : this.event)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionEventComponent addEvent() { //3
      CompositionEventComponent t = new CompositionEventComponent();
      if (this.event == null)
        this.event = new ArrayList<CompositionEventComponent>();
      this.event.add(t);
      return t;
    }

    public Composition addEvent(CompositionEventComponent t) { //3
      if (t == null)
        return this;
      if (this.event == null)
        this.event = new ArrayList<CompositionEventComponent>();
      this.event.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #event}, creating it if it does not already exist {3}
     */
    public CompositionEventComponent getEventFirstRep() { 
      if (getEvent().isEmpty()) {
        addEvent();
      }
      return getEvent().get(0);
    }

    /**
     * @return {@link #section} (The root of the sections that make up the composition.)
     */
    public List<SectionComponent> getSection() { 
      if (this.section == null)
        this.section = new ArrayList<SectionComponent>();
      return this.section;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setSection(List<SectionComponent> theSection) { 
      this.section = theSection;
      return this;
    }

    public boolean hasSection() { 
      if (this.section == null)
        return false;
      for (SectionComponent item : this.section)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public SectionComponent addSection() { //3
      SectionComponent t = new SectionComponent();
      if (this.section == null)
        this.section = new ArrayList<SectionComponent>();
      this.section.add(t);
      return t;
    }

    public Composition addSection(SectionComponent t) { //3
      if (t == null)
        return this;
      if (this.section == null)
        this.section = new ArrayList<SectionComponent>();
      this.section.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #section}, creating it if it does not already exist {3}
     */
    public SectionComponent getSectionFirstRep() { 
      if (getSection().isEmpty()) {
        addSection();
      }
      return getSection().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "An explicitly assigned identifier of a variation of the content in the Composition.", 0, 1, version));
        children.add(new Property("consent", "Reference(Consent)", "References the consents associated with this document. Examples include a consent to perform the clinical service being documented (.event) or a consent for the information contained in the document to be released to a third party.", 0, java.lang.Integer.MAX_VALUE, consent));
        children.add(new Property("basedOn", "Reference(Appointment|AppointmentResponse|CarePlan|Claim|CommunicationRequest|CoverageEligibilityRequest|DeviceRequest|EnrollmentRequest|MedicationRequest|NutritionOrder|RequestOrchestration|ServiceRequest|Task|VisionPrescription)", "A plan, proposal or order that is fulfilled in whole or in part by this composition.", 0, java.lang.Integer.MAX_VALUE, basedOn));
        children.add(new Property("status", "code", "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.", 0, 1, status));
        children.add(new Property("type", "CodeableConcept", "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.", 0, 1, type));
        children.add(new Property("category", "CodeableConcept", "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.", 0, java.lang.Integer.MAX_VALUE, category));
        children.add(new Property("subject", "Reference(Any)", "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).", 0, java.lang.Integer.MAX_VALUE, subject));
        children.add(new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care this documentation is associated with.", 0, 1, encounter));
        children.add(new Property("date", "dateTime", "The composition editing time, when the composition was last logically changed by the author.", 0, 1, date));
        children.add(new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Composition instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        children.add(new Property("author", "Reference(Practitioner|PractitionerRole|CareTeam|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in the composition, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author));
        children.add(new Property("participant", "", "Identifies supporting entities, including parents, relatives, caregivers, insurance policyholders, guarantors, and others related in some way to the patient. A supporting person or organization is an individual or an organization with a relationship to the patient. A supporting person who is playing multiple roles would be recorded in multiple participants (e.g., emergency contact and next-of-kin).", 0, java.lang.Integer.MAX_VALUE, participant));
        children.add(new Property("name", "string", "A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name));
        children.add(new Property("title", "string", "Official human-readable label for the composition.", 0, 1, title));
        children.add(new Property("note", "Annotation", "For any additional notes.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("attester", "", "A participant who has attested to the accuracy of the composition/document.", 0, java.lang.Integer.MAX_VALUE, attester));
        children.add(new Property("custodian", "Reference(Organization|Patient|Group)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.", 0, 1, custodian));
        children.add(new Property("relatesTo", "", "Relationships that this composition has with other compositions or documents (FHIR or non-FHIR resources) that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo));
        children.add(new Property("event", "", "The clinical service, such as a colonoscopy or an appendectomy, being documented.", 0, java.lang.Integer.MAX_VALUE, event));
        children.add(new Property("section", "", "The root of the sections that make up the composition.", 0, java.lang.Integer.MAX_VALUE, section));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "An absolute URI that is used to identify this Composition when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which an authoritative instance of this Composition is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the Composition is stored on different servers.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "An explicitly assigned identifier of a variation of the content in the Composition.", 0, 1, version);
        case 951500826: /*consent*/  return new Property("consent", "Reference(Consent)", "References the consents associated with this document. Examples include a consent to perform the clinical service being documented (.event) or a consent for the information contained in the document to be released to a third party.", 0, java.lang.Integer.MAX_VALUE, consent);
        case -332612366: /*basedOn*/  return new Property("basedOn", "Reference(Appointment|AppointmentResponse|CarePlan|Claim|CommunicationRequest|CoverageEligibilityRequest|DeviceRequest|EnrollmentRequest|MedicationRequest|NutritionOrder|RequestOrchestration|ServiceRequest|Task|VisionPrescription)", "A plan, proposal or order that is fulfilled in whole or in part by this composition.", 0, java.lang.Integer.MAX_VALUE, basedOn);
        case -892481550: /*status*/  return new Property("status", "code", "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.", 0, 1, status);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.", 0, 1, type);
        case 50511102: /*category*/  return new Property("category", "CodeableConcept", "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.", 0, java.lang.Integer.MAX_VALUE, category);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(Any)", "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).", 0, java.lang.Integer.MAX_VALUE, subject);
        case 1524132147: /*encounter*/  return new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care this documentation is associated with.", 0, 1, encounter);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The composition editing time, when the composition was last logically changed by the author.", 0, 1, date);
        case -669707736: /*useContext*/  return new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate Composition instances.", 0, java.lang.Integer.MAX_VALUE, useContext);
        case -1406328437: /*author*/  return new Property("author", "Reference(Practitioner|PractitionerRole|CareTeam|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in the composition, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author);
        case 767422259: /*participant*/  return new Property("participant", "", "Identifies supporting entities, including parents, relatives, caregivers, insurance policyholders, guarantors, and others related in some way to the patient. A supporting person or organization is an individual or an organization with a relationship to the patient. A supporting person who is playing multiple roles would be recorded in multiple participants (e.g., emergency contact and next-of-kin).", 0, java.lang.Integer.MAX_VALUE, participant);
        case 3373707: /*name*/  return new Property("name", "string", "A natural language name identifying the composition. This name should be usable as an identifier for the module by machine processing applications such as code generation.", 0, 1, name);
        case 110371416: /*title*/  return new Property("title", "string", "Official human-readable label for the composition.", 0, 1, title);
        case 3387378: /*note*/  return new Property("note", "Annotation", "For any additional notes.", 0, java.lang.Integer.MAX_VALUE, note);
        case 542920370: /*attester*/  return new Property("attester", "", "A participant who has attested to the accuracy of the composition/document.", 0, java.lang.Integer.MAX_VALUE, attester);
        case 1611297262: /*custodian*/  return new Property("custodian", "Reference(Organization|Patient|Group)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.", 0, 1, custodian);
        case -7765931: /*relatesTo*/  return new Property("relatesTo", "", "Relationships that this composition has with other compositions or documents (FHIR or non-FHIR resources) that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo);
        case 96891546: /*event*/  return new Property("event", "", "The clinical service, such as a colonoscopy or an appendectomy, being documented.", 0, java.lang.Integer.MAX_VALUE, event);
        case 1970241253: /*section*/  return new Property("section", "", "The root of the sections that make up the composition.", 0, java.lang.Integer.MAX_VALUE, section);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 951500826: /*consent*/ return this.consent == null ? new Base[0] : this.consent.toArray(new Base[this.consent.size()]); // Reference
        case -332612366: /*basedOn*/ return this.basedOn == null ? new Base[0] : this.basedOn.toArray(new Base[this.basedOn.size()]); // Reference
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<CompositionStatus>
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 50511102: /*category*/ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : this.subject.toArray(new Base[this.subject.size()]); // Reference
        case 1524132147: /*encounter*/ return this.encounter == null ? new Base[0] : new Base[] {this.encounter}; // Reference
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -669707736: /*useContext*/ return this.useContext == null ? new Base[0] : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // Reference
        case 767422259: /*participant*/ return this.participant == null ? new Base[0] : this.participant.toArray(new Base[this.participant.size()]); // CompositionParticipantComponent
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 542920370: /*attester*/ return this.attester == null ? new Base[0] : this.attester.toArray(new Base[this.attester.size()]); // CompositionAttesterComponent
        case 1611297262: /*custodian*/ return this.custodian == null ? new Base[0] : new Base[] {this.custodian}; // Reference
        case -7765931: /*relatesTo*/ return this.relatesTo == null ? new Base[0] : this.relatesTo.toArray(new Base[this.relatesTo.size()]); // CompositionRelatesToComponent
        case 96891546: /*event*/ return this.event == null ? new Base[0] : this.event.toArray(new Base[this.event.size()]); // CompositionEventComponent
        case 1970241253: /*section*/ return this.section == null ? new Base[0] : this.section.toArray(new Base[this.section.size()]); // SectionComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = TypeConvertor.castToUri(value); // UriType
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 351608024: // version
          this.version = TypeConvertor.castToString(value); // StringType
          return value;
        case 951500826: // consent
          this.getConsent().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -332612366: // basedOn
          this.getBasedOn().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -892481550: // status
          value = new CompositionStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<CompositionStatus>
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 50511102: // category
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1867885268: // subject
          this.getSubject().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 1524132147: // encounter
          this.encounter = TypeConvertor.castToReference(value); // Reference
          return value;
        case 3076014: // date
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -669707736: // useContext
          this.getUseContext().add(TypeConvertor.castToUsageContext(value)); // UsageContext
          return value;
        case -1406328437: // author
          this.getAuthor().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 767422259: // participant
          this.getParticipant().add((CompositionParticipantComponent) value); // CompositionParticipantComponent
          return value;
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        case 542920370: // attester
          this.getAttester().add((CompositionAttesterComponent) value); // CompositionAttesterComponent
          return value;
        case 1611297262: // custodian
          this.custodian = TypeConvertor.castToReference(value); // Reference
          return value;
        case -7765931: // relatesTo
          this.getRelatesTo().add((CompositionRelatesToComponent) value); // CompositionRelatesToComponent
          return value;
        case 96891546: // event
          this.getEvent().add((CompositionEventComponent) value); // CompositionEventComponent
          return value;
        case 1970241253: // section
          this.getSection().add((SectionComponent) value); // SectionComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url")) {
          this.url = TypeConvertor.castToUri(value); // UriType
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("version")) {
          this.version = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("consent")) {
          this.getConsent().add(TypeConvertor.castToReference(value));
        } else if (name.equals("basedOn")) {
          this.getBasedOn().add(TypeConvertor.castToReference(value));
        } else if (name.equals("status")) {
          value = new CompositionStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<CompositionStatus>
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("category")) {
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("subject")) {
          this.getSubject().add(TypeConvertor.castToReference(value));
        } else if (name.equals("encounter")) {
          this.encounter = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("date")) {
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("useContext")) {
          this.getUseContext().add(TypeConvertor.castToUsageContext(value));
        } else if (name.equals("author")) {
          this.getAuthor().add(TypeConvertor.castToReference(value));
        } else if (name.equals("participant")) {
          this.getParticipant().add((CompositionParticipantComponent) value);
        } else if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else if (name.equals("attester")) {
          this.getAttester().add((CompositionAttesterComponent) value);
        } else if (name.equals("custodian")) {
          this.custodian = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("relatesTo")) {
          this.getRelatesTo().add((CompositionRelatesToComponent) value);
        } else if (name.equals("event")) {
          this.getEvent().add((CompositionEventComponent) value);
        } else if (name.equals("section")) {
          this.getSection().add((SectionComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079:  return getUrlElement();
        case -1618432855:  return addIdentifier(); 
        case 351608024:  return getVersionElement();
        case 951500826:  return addConsent(); 
        case -332612366:  return addBasedOn(); 
        case -892481550:  return getStatusElement();
        case 3575610:  return getType();
        case 50511102:  return addCategory(); 
        case -1867885268:  return addSubject(); 
        case 1524132147:  return getEncounter();
        case 3076014:  return getDateElement();
        case -669707736:  return addUseContext(); 
        case -1406328437:  return addAuthor(); 
        case 767422259:  return addParticipant(); 
        case 3373707:  return getNameElement();
        case 110371416:  return getTitleElement();
        case 3387378:  return addNote(); 
        case 542920370:  return addAttester(); 
        case 1611297262:  return getCustodian();
        case -7765931:  return addRelatesTo(); 
        case 96891546:  return addEvent(); 
        case 1970241253:  return addSection(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 951500826: /*consent*/ return new String[] {"Reference"};
        case -332612366: /*basedOn*/ return new String[] {"Reference"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 1524132147: /*encounter*/ return new String[] {"Reference"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -669707736: /*useContext*/ return new String[] {"UsageContext"};
        case -1406328437: /*author*/ return new String[] {"Reference"};
        case 767422259: /*participant*/ return new String[] {};
        case 3373707: /*name*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 542920370: /*attester*/ return new String[] {};
        case 1611297262: /*custodian*/ return new String[] {"Reference"};
        case -7765931: /*relatesTo*/ return new String[] {};
        case 96891546: /*event*/ return new String[] {};
        case 1970241253: /*section*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.version");
        }
        else if (name.equals("consent")) {
          return addConsent();
        }
        else if (name.equals("basedOn")) {
          return addBasedOn();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.status");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("category")) {
          return addCategory();
        }
        else if (name.equals("subject")) {
          return addSubject();
        }
        else if (name.equals("encounter")) {
          this.encounter = new Reference();
          return this.encounter;
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.date");
        }
        else if (name.equals("useContext")) {
          return addUseContext();
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("participant")) {
          return addParticipant();
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.name");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a singleton property Composition.title");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("attester")) {
          return addAttester();
        }
        else if (name.equals("custodian")) {
          this.custodian = new Reference();
          return this.custodian;
        }
        else if (name.equals("relatesTo")) {
          return addRelatesTo();
        }
        else if (name.equals("event")) {
          return addEvent();
        }
        else if (name.equals("section")) {
          return addSection();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Composition";

  }

      public Composition copy() {
        Composition dst = new Composition();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Composition dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        if (consent != null) {
          dst.consent = new ArrayList<Reference>();
          for (Reference i : consent)
            dst.consent.add(i.copy());
        };
        if (basedOn != null) {
          dst.basedOn = new ArrayList<Reference>();
          for (Reference i : basedOn)
            dst.basedOn.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        if (category != null) {
          dst.category = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : category)
            dst.category.add(i.copy());
        };
        if (subject != null) {
          dst.subject = new ArrayList<Reference>();
          for (Reference i : subject)
            dst.subject.add(i.copy());
        };
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.date = date == null ? null : date.copy();
        if (useContext != null) {
          dst.useContext = new ArrayList<UsageContext>();
          for (UsageContext i : useContext)
            dst.useContext.add(i.copy());
        };
        if (author != null) {
          dst.author = new ArrayList<Reference>();
          for (Reference i : author)
            dst.author.add(i.copy());
        };
        if (participant != null) {
          dst.participant = new ArrayList<CompositionParticipantComponent>();
          for (CompositionParticipantComponent i : participant)
            dst.participant.add(i.copy());
        };
        dst.name = name == null ? null : name.copy();
        dst.title = title == null ? null : title.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (attester != null) {
          dst.attester = new ArrayList<CompositionAttesterComponent>();
          for (CompositionAttesterComponent i : attester)
            dst.attester.add(i.copy());
        };
        dst.custodian = custodian == null ? null : custodian.copy();
        if (relatesTo != null) {
          dst.relatesTo = new ArrayList<CompositionRelatesToComponent>();
          for (CompositionRelatesToComponent i : relatesTo)
            dst.relatesTo.add(i.copy());
        };
        if (event != null) {
          dst.event = new ArrayList<CompositionEventComponent>();
          for (CompositionEventComponent i : event)
            dst.event.add(i.copy());
        };
        if (section != null) {
          dst.section = new ArrayList<SectionComponent>();
          for (SectionComponent i : section)
            dst.section.add(i.copy());
        };
      }

      protected Composition typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Composition))
          return false;
        Composition o = (Composition) other_;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true)
           && compareDeep(consent, o.consent, true) && compareDeep(basedOn, o.basedOn, true) && compareDeep(status, o.status, true)
           && compareDeep(type, o.type, true) && compareDeep(category, o.category, true) && compareDeep(subject, o.subject, true)
           && compareDeep(encounter, o.encounter, true) && compareDeep(date, o.date, true) && compareDeep(useContext, o.useContext, true)
           && compareDeep(author, o.author, true) && compareDeep(participant, o.participant, true) && compareDeep(name, o.name, true)
           && compareDeep(title, o.title, true) && compareDeep(note, o.note, true) && compareDeep(attester, o.attester, true)
           && compareDeep(custodian, o.custodian, true) && compareDeep(relatesTo, o.relatesTo, true) && compareDeep(event, o.event, true)
           && compareDeep(section, o.section, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Composition))
          return false;
        Composition o = (Composition) other_;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(status, o.status, true)
           && compareValues(date, o.date, true) && compareValues(name, o.name, true) && compareValues(title, o.title, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(url, identifier, version
          , consent, basedOn, status, type, category, subject, encounter, date, useContext
          , author, participant, name, title, note, attester, custodian, relatesTo, event
          , section);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Composition;
   }

 /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the activity definition</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Composition.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name="url", path="Composition.url", description="The uri that identifies the activity definition", type="uri" )
  public static final String SP_URL = "url";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the activity definition</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Composition.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

 /**
   * Search parameter: <b>category</b>
   * <p>
   * Description: <b>Categorization of Composition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="category", path="Composition.category", description="Categorization of Composition", type="token" )
  public static final String SP_CATEGORY = "category";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>category</b>
   * <p>
   * Description: <b>Categorization of Composition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CATEGORY);

 /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the activity definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name="version", path="Composition.version", description="The business version of the activity definition", type="token" )
  public static final String SP_VERSION = "version";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the activity definition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VERSION);

 /**
   * Search parameter: <b>event-reference</b>
   * <p>
   * Description: <b>Main clinical acts documented as references</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.event.detail.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="event-reference", path="Composition.event.detail.reference", description="Main clinical acts documented as references", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, Claim.class, ClaimResponse.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAlert.class, DeviceAssociation.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InsuranceProduct.class, Invoice.class, Library.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, Task.class, TerminologyCapabilities.class, ValueSet.class, VisionPrescription.class } )
  public static final String SP_EVENT_REFERENCE = "event-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>event-reference</b>
   * <p>
   * Description: <b>Main clinical acts documented as references</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.event.detail.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam EVENT_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_EVENT_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:event-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_EVENT_REFERENCE = new ca.uhn.fhir.model.api.Include("Composition:event-reference").toLocked();

 /**
   * Search parameter: <b>period</b>
   * <p>
   * Description: <b>The period covered by the documentation</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Composition.event.period</b><br>
   * </p>
   */
  @SearchParamDefinition(name="period", path="Composition.event.period", description="The period covered by the documentation", type="date" )
  public static final String SP_PERIOD = "period";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>period</b>
   * <p>
   * Description: <b>The period covered by the documentation</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Composition.event.period</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam PERIOD = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_PERIOD);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>preliminary | final | amended | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Composition.status", description="preliminary | final | amended | entered-in-error", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>preliminary | final | amended | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>author</b>
   * <p>
   * Description: <b>Who and/or what authored the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.author</b><br>
   * </p>
   */
  @SearchParamDefinition(name="author", path="Composition.author", description="Who and/or what authored the composition", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={CareTeam.class, Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_AUTHOR = "author";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>author</b>
   * <p>
   * Description: <b>Who and/or what authored the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.author</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam AUTHOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_AUTHOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:author</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_AUTHOR = new ca.uhn.fhir.model.api.Include("Composition:author").toLocked();

 /**
   * Search parameter: <b>attester</b>
   * <p>
   * Description: <b>Who attested the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.attester.party</b><br>
   * </p>
   */
  @SearchParamDefinition(name="attester", path="Composition.attester.party", description="Who attested the composition", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Group.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_ATTESTER = "attester";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>attester</b>
   * <p>
   * Description: <b>Who attested the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.attester.party</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ATTESTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ATTESTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:attester</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ATTESTER = new ca.uhn.fhir.model.api.Include("Composition:attester").toLocked();

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Date first version of the resource instance was recorded
* [Appointment](appointment.html): Appointment date/time.
* [AuditEvent](auditevent.html): Time when the event was recorded
* [CarePlan](careplan.html): Time period plan covers
* [CareTeam](careteam.html): A date within the coverage time period.
* [Composition](composition.html): Composition editing time
* [Consent](consent.html): When consent was agreed to
* [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report
* [DocumentReference](documentreference.html): When this document reference was created
* [Encounter](encounter.html): A date within the actualPeriod the Encounter lasted
* [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period
* [FamilyMemberHistory](familymemberhistory.html): When history was recorded or last updated
* [Flag](flag.html): Time period when flag is active
* [Immunization](immunization.html): Vaccination  (non)-Administration Date
* [Invoice](invoice.html): Invoice date / posting date
* [List](list.html): When the list was prepared
* [MeasureReport](measurereport.html): The date of the measure report
* [NutritionIntake](nutritionintake.html): Date when patient was taking (or not taking) the medication
* [Observation](observation.html): Clinically relevant time/time-period for observation
* [Procedure](procedure.html): When the procedure occurred or is occurring
* [ResearchSubject](researchsubject.html): Start and end of participation
* [RiskAssessment](riskassessment.html): When was assessment made?
</b><br>
   * Type: <b>date</b><br>
   * Path: <b>AllergyIntolerance.recordedDate | (start | requestedPeriod.start).first() | AuditEvent.recorded | CarePlan.period | Composition.date | Consent.date | DiagnosticReport.effective.ofType(dateTime) | DiagnosticReport.effective.ofType(Period) | DocumentReference.date | Encounter.actualPeriod | EpisodeOfCare.period | FamilyMemberHistory.date | Flag.period | (Immunization.occurrence.ofType(dateTime)) | Invoice.creation | List.date | MeasureReport.date | NutritionIntake.occurrence.ofType(dateTime) | NutritionIntake.occurrence.ofType(Period) | Observation.effective.ofType(dateTime) | Observation.effective.ofType(Period) | Observation.effective.ofType(Timing) | Observation.effective.ofType(instant) | Procedure.occurrence.ofType(dateTime) | Procedure.occurrence.ofType(Period) | Procedure.occurrence.ofType(Timing) | ResearchSubject.period | (RiskAssessment.occurrence.ofType(dateTime))</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="AllergyIntolerance.recordedDate | (start | requestedPeriod.start).first() | AuditEvent.recorded | CarePlan.period | Composition.date | Consent.date | DiagnosticReport.effective.ofType(dateTime) | DiagnosticReport.effective.ofType(Period) | DocumentReference.date | Encounter.actualPeriod | EpisodeOfCare.period | FamilyMemberHistory.date | Flag.period | (Immunization.occurrence.ofType(dateTime)) | Invoice.creation | List.date | MeasureReport.date | NutritionIntake.occurrence.ofType(dateTime) | NutritionIntake.occurrence.ofType(Period) | Observation.effective.ofType(dateTime) | Observation.effective.ofType(Period) | Observation.effective.ofType(Timing) | Observation.effective.ofType(instant) | Procedure.occurrence.ofType(dateTime) | Procedure.occurrence.ofType(Period) | Procedure.occurrence.ofType(Timing) | ResearchSubject.period | (RiskAssessment.occurrence.ofType(dateTime))", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): Date first version of the resource instance was recorded\r\n* [Appointment](appointment.html): Appointment date/time.\r\n* [AuditEvent](auditevent.html): Time when the event was recorded\r\n* [CarePlan](careplan.html): Time period plan covers\r\n* [CareTeam](careteam.html): A date within the coverage time period.\r\n* [Composition](composition.html): Composition editing time\r\n* [Consent](consent.html): When consent was agreed to\r\n* [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report\r\n* [DocumentReference](documentreference.html): When this document reference was created\r\n* [Encounter](encounter.html): A date within the actualPeriod the Encounter lasted\r\n* [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period\r\n* [FamilyMemberHistory](familymemberhistory.html): When history was recorded or last updated\r\n* [Flag](flag.html): Time period when flag is active\r\n* [Immunization](immunization.html): Vaccination  (non)-Administration Date\r\n* [Invoice](invoice.html): Invoice date / posting date\r\n* [List](list.html): When the list was prepared\r\n* [MeasureReport](measurereport.html): The date of the measure report\r\n* [NutritionIntake](nutritionintake.html): Date when patient was taking (or not taking) the medication\r\n* [Observation](observation.html): Clinically relevant time/time-period for observation\r\n* [Procedure](procedure.html): When the procedure occurred or is occurring\r\n* [ResearchSubject](researchsubject.html): Start and end of participation\r\n* [RiskAssessment](riskassessment.html): When was assessment made?\r\n", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Date first version of the resource instance was recorded
* [Appointment](appointment.html): Appointment date/time.
* [AuditEvent](auditevent.html): Time when the event was recorded
* [CarePlan](careplan.html): Time period plan covers
* [CareTeam](careteam.html): A date within the coverage time period.
* [Composition](composition.html): Composition editing time
* [Consent](consent.html): When consent was agreed to
* [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report
* [DocumentReference](documentreference.html): When this document reference was created
* [Encounter](encounter.html): A date within the actualPeriod the Encounter lasted
* [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period
* [FamilyMemberHistory](familymemberhistory.html): When history was recorded or last updated
* [Flag](flag.html): Time period when flag is active
* [Immunization](immunization.html): Vaccination  (non)-Administration Date
* [Invoice](invoice.html): Invoice date / posting date
* [List](list.html): When the list was prepared
* [MeasureReport](measurereport.html): The date of the measure report
* [NutritionIntake](nutritionintake.html): Date when patient was taking (or not taking) the medication
* [Observation](observation.html): Clinically relevant time/time-period for observation
* [Procedure](procedure.html): When the procedure occurred or is occurring
* [ResearchSubject](researchsubject.html): Start and end of participation
* [RiskAssessment](riskassessment.html): When was assessment made?
</b><br>
   * Type: <b>date</b><br>
   * Path: <b>AllergyIntolerance.recordedDate | (start | requestedPeriod.start).first() | AuditEvent.recorded | CarePlan.period | Composition.date | Consent.date | DiagnosticReport.effective.ofType(dateTime) | DiagnosticReport.effective.ofType(Period) | DocumentReference.date | Encounter.actualPeriod | EpisodeOfCare.period | FamilyMemberHistory.date | Flag.period | (Immunization.occurrence.ofType(dateTime)) | Invoice.creation | List.date | MeasureReport.date | NutritionIntake.occurrence.ofType(dateTime) | NutritionIntake.occurrence.ofType(Period) | Observation.effective.ofType(dateTime) | Observation.effective.ofType(Period) | Observation.effective.ofType(Timing) | Observation.effective.ofType(instant) | Procedure.occurrence.ofType(dateTime) | Procedure.occurrence.ofType(Period) | Procedure.occurrence.ofType(Timing) | ResearchSubject.period | (RiskAssessment.occurrence.ofType(dateTime))</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>encounter</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AuditEvent](auditevent.html): Encounter related to the activity recorded in the AuditEvent
* [CarePlan](careplan.html): The Encounter during which this CarePlan was created
* [Claim](claim.html): Encounters associated with a billed line item
* [Communication](communication.html): The Encounter during which this Communication was created
* [CommunicationRequest](communicationrequest.html): The Encounter during which this CommunicationRequest was created
* [Composition](composition.html): Context of the Composition
* [Condition](condition.html): The Encounter during which this Condition was created
* [DeviceRequest](devicerequest.html): Encounter during which request was created
* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
* [ExplanationOfBenefit](explanationofbenefit.html): Encounters associated with a billed line item
* [Flag](flag.html): Alert relevant during encounter
* [ImagingStudy](imagingstudy.html): The context of the study
* [List](list.html): Context in which list created
* [MedicationDispense](medicationdispense.html): Returns dispenses with a specific encounter
* [MedicationStatement](medicationstatement.html): Returns statements for a specific encounter
* [NutritionIntake](nutritionintake.html): Returns statements for a specific encounter
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
* [Observation](observation.html): Encounter related to the observation
* [Procedure](procedure.html): The Encounter during which this Procedure was created
* [Provenance](provenance.html): Encounter related to the Provenance
* [QuestionnaireResponse](questionnaireresponse.html): Encounter associated with the questionnaire response
* [RequestOrchestration](requestorchestration.html): The encounter the request orchestration applies to
* [RiskAssessment](riskassessment.html): Where was assessment performed?
* [ServiceRequest](servicerequest.html): An encounter in which this request is made
* [Task](task.html): Search by encounter
* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AuditEvent.encounter | CarePlan.encounter | Claim.item.encounter | Communication.encounter | CommunicationRequest.encounter | Composition.encounter | Condition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | ExplanationOfBenefit.item.encounter | Flag.encounter | ImagingStudy.encounter | List.encounter | MedicationDispense.encounter | MedicationStatement.encounter | NutritionIntake.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | Provenance.encounter | QuestionnaireResponse.encounter | RequestOrchestration.encounter | RiskAssessment.encounter | ServiceRequest.encounter | Task.encounter | VisionPrescription.encounter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="encounter", path="AuditEvent.encounter | CarePlan.encounter | Claim.item.encounter | Communication.encounter | CommunicationRequest.encounter | Composition.encounter | Condition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | ExplanationOfBenefit.item.encounter | Flag.encounter | ImagingStudy.encounter | List.encounter | MedicationDispense.encounter | MedicationStatement.encounter | NutritionIntake.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | Provenance.encounter | QuestionnaireResponse.encounter | RequestOrchestration.encounter | RiskAssessment.encounter | ServiceRequest.encounter | Task.encounter | VisionPrescription.encounter", description="Multiple Resources: \r\n\r\n* [AuditEvent](auditevent.html): Encounter related to the activity recorded in the AuditEvent\r\n* [CarePlan](careplan.html): The Encounter during which this CarePlan was created\r\n* [Claim](claim.html): Encounters associated with a billed line item\r\n* [Communication](communication.html): The Encounter during which this Communication was created\r\n* [CommunicationRequest](communicationrequest.html): The Encounter during which this CommunicationRequest was created\r\n* [Composition](composition.html): Context of the Composition\r\n* [Condition](condition.html): The Encounter during which this Condition was created\r\n* [DeviceRequest](devicerequest.html): Encounter during which request was created\r\n* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made\r\n* [ExplanationOfBenefit](explanationofbenefit.html): Encounters associated with a billed line item\r\n* [Flag](flag.html): Alert relevant during encounter\r\n* [ImagingStudy](imagingstudy.html): The context of the study\r\n* [List](list.html): Context in which list created\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with a specific encounter\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific encounter\r\n* [NutritionIntake](nutritionintake.html): Returns statements for a specific encounter\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier\r\n* [Observation](observation.html): Encounter related to the observation\r\n* [Procedure](procedure.html): The Encounter during which this Procedure was created\r\n* [Provenance](provenance.html): Encounter related to the Provenance\r\n* [QuestionnaireResponse](questionnaireresponse.html): Encounter associated with the questionnaire response\r\n* [RequestOrchestration](requestorchestration.html): The encounter the request orchestration applies to\r\n* [RiskAssessment](riskassessment.html): Where was assessment performed?\r\n* [ServiceRequest](servicerequest.html): An encounter in which this request is made\r\n* [Task](task.html): Search by encounter\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier\r\n", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Encounter") }, target={Encounter.class } )
  public static final String SP_ENCOUNTER = "encounter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AuditEvent](auditevent.html): Encounter related to the activity recorded in the AuditEvent
* [CarePlan](careplan.html): The Encounter during which this CarePlan was created
* [Claim](claim.html): Encounters associated with a billed line item
* [Communication](communication.html): The Encounter during which this Communication was created
* [CommunicationRequest](communicationrequest.html): The Encounter during which this CommunicationRequest was created
* [Composition](composition.html): Context of the Composition
* [Condition](condition.html): The Encounter during which this Condition was created
* [DeviceRequest](devicerequest.html): Encounter during which request was created
* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
* [ExplanationOfBenefit](explanationofbenefit.html): Encounters associated with a billed line item
* [Flag](flag.html): Alert relevant during encounter
* [ImagingStudy](imagingstudy.html): The context of the study
* [List](list.html): Context in which list created
* [MedicationDispense](medicationdispense.html): Returns dispenses with a specific encounter
* [MedicationStatement](medicationstatement.html): Returns statements for a specific encounter
* [NutritionIntake](nutritionintake.html): Returns statements for a specific encounter
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
* [Observation](observation.html): Encounter related to the observation
* [Procedure](procedure.html): The Encounter during which this Procedure was created
* [Provenance](provenance.html): Encounter related to the Provenance
* [QuestionnaireResponse](questionnaireresponse.html): Encounter associated with the questionnaire response
* [RequestOrchestration](requestorchestration.html): The encounter the request orchestration applies to
* [RiskAssessment](riskassessment.html): Where was assessment performed?
* [ServiceRequest](servicerequest.html): An encounter in which this request is made
* [Task](task.html): Search by encounter
* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AuditEvent.encounter | CarePlan.encounter | Claim.item.encounter | Communication.encounter | CommunicationRequest.encounter | Composition.encounter | Condition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | ExplanationOfBenefit.item.encounter | Flag.encounter | ImagingStudy.encounter | List.encounter | MedicationDispense.encounter | MedicationStatement.encounter | NutritionIntake.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | Provenance.encounter | QuestionnaireResponse.encounter | RequestOrchestration.encounter | RiskAssessment.encounter | ServiceRequest.encounter | Task.encounter | VisionPrescription.encounter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENCOUNTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENCOUNTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:encounter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENCOUNTER = new ca.uhn.fhir.model.api.Include("Composition:encounter").toLocked();

 /**
   * Search parameter: <b>section-text</b>
   * <p>
   * Description: <b>Search on the section narrative of the resource</b><br>
   * Type: <b>special</b><br>
   * Path: <b>Composition.repeat(section).text</b><br>
   * </p>
   */
  @SearchParamDefinition(name="section-text", path="Composition.repeat(section).text", description="Search on the section narrative of the resource", type="special" )
  public static final String SP_SECTION_TEXT = "section-text";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>section-text</b>
   * <p>
   * Description: <b>Search on the section narrative of the resource</b><br>
   * Type: <b>special</b><br>
   * Path: <b>Composition.repeat(section).text</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.SpecialClientParam SECTION_TEXT = new ca.uhn.fhir.rest.gclient.SpecialClientParam(SP_SECTION_TEXT);

 /**
   * Search parameter: <b>section</b>
   * <p>
   * Description: <b>Classification of section (recommended)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.repeat(section).code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="section", path="Composition.repeat(section).code", description="Classification of section (recommended)", type="token" )
  public static final String SP_SECTION = "section";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>section</b>
   * <p>
   * Description: <b>Classification of section (recommended)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.repeat(section).code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SECTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_SECTION);

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>Human Readable name/title</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Composition.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="Composition.title", description="Human Readable name/title", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>Human Readable name/title</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Composition.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): The entity that caused the expenses
* [AdverseEvent](adverseevent.html): Subject impacted by event
* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [Appointment](appointment.html): One of the individuals of the appointment is this patient
* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient
* [AuditEvent](auditevent.html): Where the activity involved patient data
* [Basic](basic.html): Identifies the focus of this resource
* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): The patient who underwent the procedure to collect the product
* [BodyStructure](bodystructure.html): Who this is about
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [Claim](claim.html): Patient receiving the products or services
* [ClaimResponse](claimresponse.html): The subject of care
* [Communication](communication.html): Focus of message
* [CommunicationRequest](communicationrequest.html): Focus of message
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [Contract](contract.html): The identity of the subject of the contract (if a patient)
* [Coverage](coverage.html): Retrieve coverages for a patient
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceAssociation](deviceassociation.html): The patient associated with the device
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient present at the encounter
* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results
* [ImagingSelection](imagingselection.html): Who the study is about
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [Invoice](invoice.html): Recipient(s) of goods and services
* [List](list.html): If all resources have the same subject
* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Person](person.html): The Person links to this Patient
* [Procedure](procedure.html): Search by subject - a patient
* [Provenance](provenance.html): Where the activity involved patient data
* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response
* [RelatedPerson](relatedperson.html): The patient this related person is related to
* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations
* [ResearchSubject](researchsubject.html): Who or what is part of study
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [Specimen](specimen.html): The patient the specimen comes from
* [Task](task.html): Search by patient
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BiologicallyDerivedProduct.collection.sourcePatient | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | Claim.subject.where(resolve() is Patient) | Claim.item.subject.where(resolve() is Patient) | ClaimResponse.subject.where(resolve() is Patient) | ClaimResponse.addItem.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceAssociation.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate.where(resolve() is Patient) | EpisodeOfCare.subject.where(resolve() is Patient) | ExplanationOfBenefit.subject.where(resolve() is Patient) | ExplanationOfBenefit.item.subject.where(resolve() is Patient) | ExplanationOfBenefit.addItem.subject.where(resolve() is Patient) | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | Task.for.where(resolve() is Patient) | VisionPrescription.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BiologicallyDerivedProduct.collection.sourcePatient | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | Claim.subject.where(resolve() is Patient) | Claim.item.subject.where(resolve() is Patient) | ClaimResponse.subject.where(resolve() is Patient) | ClaimResponse.addItem.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceAssociation.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate.where(resolve() is Patient) | EpisodeOfCare.subject.where(resolve() is Patient) | ExplanationOfBenefit.subject.where(resolve() is Patient) | ExplanationOfBenefit.item.subject.where(resolve() is Patient) | ExplanationOfBenefit.addItem.subject.where(resolve() is Patient) | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | Task.for.where(resolve() is Patient) | VisionPrescription.patient", description="Multiple Resources: \r\n\r\n* [Account](account.html): The entity that caused the expenses\r\n* [AdverseEvent](adverseevent.html): Subject impacted by event\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [Appointment](appointment.html): One of the individuals of the appointment is this patient\r\n* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient\r\n* [AuditEvent](auditevent.html): Where the activity involved patient data\r\n* [Basic](basic.html): Identifies the focus of this resource\r\n* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): The patient who underwent the procedure to collect the product\r\n* [BodyStructure](bodystructure.html): Who this is about\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [Claim](claim.html): Patient receiving the products or services\r\n* [ClaimResponse](claimresponse.html): The subject of care\r\n* [Communication](communication.html): Focus of message\r\n* [CommunicationRequest](communicationrequest.html): Focus of message\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [Contract](contract.html): The identity of the subject of the contract (if a patient)\r\n* [Coverage](coverage.html): Retrieve coverages for a patient\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceAssociation](deviceassociation.html): The patient associated with the device\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient present at the encounter\r\n* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results\r\n* [ImagingSelection](imagingselection.html): Who the study is about\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [Invoice](invoice.html): Recipient(s) of goods and services\r\n* [List](list.html): If all resources have the same subject\r\n* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.\r\n* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Person](person.html): The Person links to this Patient\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [Provenance](provenance.html): Where the activity involved patient data\r\n* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response\r\n* [RelatedPerson](relatedperson.html): The patient this related person is related to\r\n* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations\r\n* [ResearchSubject](researchsubject.html): Who or what is part of study\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [Specimen](specimen.html): The patient the specimen comes from\r\n* [Task](task.html): Search by patient\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type="reference", target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): The entity that caused the expenses
* [AdverseEvent](adverseevent.html): Subject impacted by event
* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [Appointment](appointment.html): One of the individuals of the appointment is this patient
* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient
* [AuditEvent](auditevent.html): Where the activity involved patient data
* [Basic](basic.html): Identifies the focus of this resource
* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): The patient who underwent the procedure to collect the product
* [BodyStructure](bodystructure.html): Who this is about
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [Claim](claim.html): Patient receiving the products or services
* [ClaimResponse](claimresponse.html): The subject of care
* [Communication](communication.html): Focus of message
* [CommunicationRequest](communicationrequest.html): Focus of message
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [Contract](contract.html): The identity of the subject of the contract (if a patient)
* [Coverage](coverage.html): Retrieve coverages for a patient
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceAssociation](deviceassociation.html): The patient associated with the device
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient present at the encounter
* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results
* [ImagingSelection](imagingselection.html): Who the study is about
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [Invoice](invoice.html): Recipient(s) of goods and services
* [List](list.html): If all resources have the same subject
* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Person](person.html): The Person links to this Patient
* [Procedure](procedure.html): Search by subject - a patient
* [Provenance](provenance.html): Where the activity involved patient data
* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response
* [RelatedPerson](relatedperson.html): The patient this related person is related to
* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations
* [ResearchSubject](researchsubject.html): Who or what is part of study
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [Specimen](specimen.html): The patient the specimen comes from
* [Task](task.html): Search by patient
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BiologicallyDerivedProduct.collection.sourcePatient | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | Claim.subject.where(resolve() is Patient) | Claim.item.subject.where(resolve() is Patient) | ClaimResponse.subject.where(resolve() is Patient) | ClaimResponse.addItem.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceAssociation.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate.where(resolve() is Patient) | EpisodeOfCare.subject.where(resolve() is Patient) | ExplanationOfBenefit.subject.where(resolve() is Patient) | ExplanationOfBenefit.item.subject.where(resolve() is Patient) | ExplanationOfBenefit.addItem.subject.where(resolve() is Patient) | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | Task.for.where(resolve() is Patient) | VisionPrescription.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("Composition:patient").toLocked();

 /**
   * Search parameter: <b>section-code-text</b>
   * <p>
   * Description: <b>Search on the section narrative of the resource</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>Composition.repeat(section)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="section-code-text", path="Composition.repeat(section)", description="Search on the section narrative of the resource", type="composite", compositeOf={"section", "section-text"} )
  public static final String SP_SECTION_CODE_TEXT = "section-code-text";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>section-code-text</b>
   * <p>
   * Description: <b>Search on the section narrative of the resource</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>Composition.repeat(section)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.SpecialClientParam> SECTION_CODE_TEXT = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.SpecialClientParam>(SP_SECTION_CODE_TEXT);

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>Who and/or what the composition is about</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="Composition.subject", description="Who and/or what the composition is about", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, Claim.class, ClaimResponse.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAlert.class, DeviceAssociation.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InsuranceProduct.class, Invoice.class, Library.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, Task.class, TerminologyCapabilities.class, ValueSet.class, VisionPrescription.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>Who and/or what the composition is about</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("Composition:subject").toLocked();

 /**
   * Search parameter: <b>entry</b>
   * <p>
   * Description: <b>A reference to data that supports this section</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.repeat(section).entry</b><br>
   * </p>
   */
  @SearchParamDefinition(name="entry", path="Composition.repeat(section).entry", description="A reference to data that supports this section", type="reference", target={Account.class, ActivityDefinition.class, ActorDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, ArtifactAssessment.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CarePlan.class, CareTeam.class, Claim.class, ClaimResponse.class, ClinicalUseDefinition.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceAlert.class, DeviceAssociation.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DiagnosticReport.class, DocumentReference.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingSelection.class, ImagingStudy.class, Immunization.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, InsuranceProduct.class, Invoice.class, Library.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationRequest.class, MedicationStatement.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Parameters.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestOrchestration.class, Requirements.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, Task.class, TerminologyCapabilities.class, ValueSet.class, VisionPrescription.class } )
  public static final String SP_ENTRY = "entry";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>entry</b>
   * <p>
   * Description: <b>A reference to data that supports this section</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.repeat(section).entry</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENTRY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENTRY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:entry</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENTRY = new ca.uhn.fhir.model.api.Include("Composition:entry").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): Account number
* [AdverseEvent](adverseevent.html): Business identifier for the event
* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [Appointment](appointment.html): An Identifier of the Appointment
* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response
* [Basic](basic.html): Business identifier
* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): Identifier
* [BodyStructure](bodystructure.html): Bodystructure identifier
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [Claim](claim.html): The primary identifier of the financial resource
* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse
* [Communication](communication.html): Unique identifier
* [CommunicationRequest](communicationrequest.html): Unique identifier
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [Contract](contract.html): The identity of the contract
* [Coverage](coverage.html): The primary identifier of the insured and the coverage
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentReference](documentreference.html): Identifier of the attachment binary
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Flag](flag.html): Business identifier
* [Goal](goal.html): External Ids for this goal
* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response
* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID
* [Immunization](immunization.html): Business identifier
* [Invoice](invoice.html): Business Identifier for item
* [List](list.html): Business identifier
* [MeasureReport](measurereport.html): External identifier of the measure report to be returned
* [Medication](medication.html): Returns medications with this external identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationStatement](medicationstatement.html): Return statements with this external identifier
* [NutritionIntake](nutritionintake.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Person](person.html): A person Identifier
* [Procedure](procedure.html): A unique identifier for a procedure
* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response
* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson
* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration
* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [Specimen](specimen.html): The unique identifier associated with the specimen
* [Task](task.html): Search for a task instance by its business identifier
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BiologicallyDerivedProduct.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | Claim.identifier | ClaimResponse.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | Task.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BiologicallyDerivedProduct.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | Claim.identifier | ClaimResponse.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | Task.identifier | VisionPrescription.identifier", description="Multiple Resources: \r\n\r\n* [Account](account.html): Account number\r\n* [AdverseEvent](adverseevent.html): Business identifier for the event\r\n* [AllergyIntolerance](allergyintolerance.html): External ids for this item\r\n* [Appointment](appointment.html): An Identifier of the Appointment\r\n* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response\r\n* [Basic](basic.html): Business identifier\r\n* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): Identifier\r\n* [BodyStructure](bodystructure.html): Bodystructure identifier\r\n* [CarePlan](careplan.html): External Ids for this plan\r\n* [CareTeam](careteam.html): External Ids for this team\r\n* [Claim](claim.html): The primary identifier of the financial resource\r\n* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse\r\n* [Communication](communication.html): Unique identifier\r\n* [CommunicationRequest](communicationrequest.html): Unique identifier\r\n* [Composition](composition.html): Version-independent identifier for the Composition\r\n* [Condition](condition.html): A unique identifier of the condition record\r\n* [Consent](consent.html): Identifier for this record (external references)\r\n* [Contract](contract.html): The identity of the contract\r\n* [Coverage](coverage.html): The primary identifier of the insured and the coverage\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier\r\n* [DetectedIssue](detectedissue.html): Unique id for the detected issue\r\n* [DeviceRequest](devicerequest.html): Business identifier for request/order\r\n* [DiagnosticReport](diagnosticreport.html): An identifier for the report\r\n* [DocumentReference](documentreference.html): Identifier of the attachment binary\r\n* [Encounter](encounter.html): Identifier(s) by which this encounter is known\r\n* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment\r\n* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier\r\n* [Flag](flag.html): Business identifier\r\n* [Goal](goal.html): External Ids for this goal\r\n* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response\r\n* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection\r\n* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID\r\n* [Immunization](immunization.html): Business identifier\r\n* [Invoice](invoice.html): Business Identifier for item\r\n* [List](list.html): Business identifier\r\n* [MeasureReport](measurereport.html): External identifier of the measure report to be returned\r\n* [Medication](medication.html): Returns medications with this external identifier\r\n* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier\r\n* [MedicationStatement](medicationstatement.html): Return statements with this external identifier\r\n* [NutritionIntake](nutritionintake.html): Return statements with this external identifier\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier\r\n* [Observation](observation.html): The unique id for a particular observation\r\n* [Person](person.html): A person Identifier\r\n* [Procedure](procedure.html): A unique identifier for a procedure\r\n* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response\r\n* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson\r\n* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration\r\n* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study\r\n* [RiskAssessment](riskassessment.html): Unique identifier for the assessment\r\n* [ServiceRequest](servicerequest.html): Identifiers assigned to this order\r\n* [Specimen](specimen.html): The unique identifier associated with the specimen\r\n* [Task](task.html): Search for a task instance by its business identifier\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier\r\n", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): Account number
* [AdverseEvent](adverseevent.html): Business identifier for the event
* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [Appointment](appointment.html): An Identifier of the Appointment
* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response
* [Basic](basic.html): Business identifier
* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): Identifier
* [BodyStructure](bodystructure.html): Bodystructure identifier
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [Claim](claim.html): The primary identifier of the financial resource
* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse
* [Communication](communication.html): Unique identifier
* [CommunicationRequest](communicationrequest.html): Unique identifier
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [Contract](contract.html): The identity of the contract
* [Coverage](coverage.html): The primary identifier of the insured and the coverage
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentReference](documentreference.html): Identifier of the attachment binary
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Flag](flag.html): Business identifier
* [Goal](goal.html): External Ids for this goal
* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response
* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID
* [Immunization](immunization.html): Business identifier
* [Invoice](invoice.html): Business Identifier for item
* [List](list.html): Business identifier
* [MeasureReport](measurereport.html): External identifier of the measure report to be returned
* [Medication](medication.html): Returns medications with this external identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationStatement](medicationstatement.html): Return statements with this external identifier
* [NutritionIntake](nutritionintake.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Person](person.html): A person Identifier
* [Procedure](procedure.html): A unique identifier for a procedure
* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response
* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson
* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration
* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [Specimen](specimen.html): The unique identifier associated with the specimen
* [Task](task.html): Search for a task instance by its business identifier
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BiologicallyDerivedProduct.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | Claim.identifier | ClaimResponse.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | Task.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>event-code</b>
   * <p>
   * Description: <b>Main clinical acts documented as codes</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.event.detail.concept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="event-code", path="Composition.event.detail.concept", description="Main clinical acts documented as codes", type="token" )
  public static final String SP_EVENT_CODE = "event-code";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>event-code</b>
   * <p>
   * Description: <b>Main clinical acts documented as codes</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.event.detail.concept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam EVENT_CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_EVENT_CODE);

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): E.g. patient, expense, depreciation
* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
* [Composition](composition.html): Kind of composition (LOINC if possible)
* [Coverage](coverage.html): The kind of coverage (health plan, auto, Workers Compensation)
* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
* [Encounter](encounter.html): Specific type of encounter
* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
* [Invoice](invoice.html): Type of Invoice
* [MedicationDispense](medicationdispense.html): Returns dispenses of a specific type
* [Specimen](specimen.html): The specimen type
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.type | AllergyIntolerance.type | Composition.type | Coverage.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type | Invoice.type | MedicationDispense.type | Specimen.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="Account.type | AllergyIntolerance.type | Composition.type | Coverage.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type | Invoice.type | MedicationDispense.type | Specimen.type", description="Multiple Resources: \r\n\r\n* [Account](account.html): E.g. patient, expense, depreciation\r\n* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)\r\n* [Composition](composition.html): Kind of composition (LOINC if possible)\r\n* [Coverage](coverage.html): The kind of coverage (health plan, auto, Workers Compensation)\r\n* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)\r\n* [Encounter](encounter.html): Specific type of encounter\r\n* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management\r\n* [Invoice](invoice.html): Type of Invoice\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses of a specific type\r\n* [Specimen](specimen.html): The specimen type\r\n", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): E.g. patient, expense, depreciation
* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
* [Composition](composition.html): Kind of composition (LOINC if possible)
* [Coverage](coverage.html): The kind of coverage (health plan, auto, Workers Compensation)
* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
* [Encounter](encounter.html): Specific type of encounter
* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
* [Invoice](invoice.html): Type of Invoice
* [MedicationDispense](medicationdispense.html): Returns dispenses of a specific type
* [Specimen](specimen.html): The specimen type
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.type | AllergyIntolerance.type | Composition.type | Coverage.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type | Invoice.type | MedicationDispense.type | Specimen.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);


}

