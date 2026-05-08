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
 * A scientific study intended to increase health-related knowledge. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.
 */
@ResourceDef(name="ResearchStudy", profile="http://hl7.org/fhir/StructureDefinition/ResearchStudy")
public class ResearchStudy extends DomainResource {

    @Block()
    public static class ResearchStudyLabelComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Kind of name.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="primary | official | scientific | plain-language | subtitle | short-title | acronym | earlier-title | language | auto-translated | human-use | machine-use | duplicate-uid", formalDefinition="Kind of name." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/title-type")
        protected CodeableConcept type;

        /**
         * The name.
         */
        @Child(name = "value", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The name", formalDefinition="The name." )
        protected StringType value;

        /**
         * Used to express the specific language of the title.
         */
        @Child(name = "language", type = {CodeType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Used to express the specific language", formalDefinition="Used to express the specific language of the title." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/all-languages")
        protected CodeType language;

        private static final long serialVersionUID = -972639978L;

    /**
     * Constructor
     */
      public ResearchStudyLabelComponent() {
        super();
      }

        /**
         * @return {@link #type} (Kind of name.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyLabelComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Kind of name.)
         */
        public ResearchStudyLabelComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #value} (The name.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public StringType getValueElement() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyLabelComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new StringType(); // bb
          return this.value;
        }

        public boolean hasValueElement() { 
          return this.value != null && !this.value.isEmpty();
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The name.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public ResearchStudyLabelComponent setValueElement(StringType value) { 
          this.value = value;
          return this;
        }

        /**
         * @return The name.
         */
        public String getValue() { 
          return this.value == null ? null : this.value.getValue();
        }

        /**
         * @param value The name.
         */
        public ResearchStudyLabelComponent setValue(String value) { 
          if (Utilities.noString(value))
            this.value = null;
          else {
            if (this.value == null)
              this.value = new StringType();
            this.value.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #language} (Used to express the specific language of the title.). This is the underlying object with id, value and extensions. The accessor "getLanguage" gives direct access to the value
         */
        public CodeType getLanguageElement() { 
          if (this.language == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyLabelComponent.language");
            else if (Configuration.doAutoCreate())
              this.language = new CodeType(); // bb
          return this.language;
        }

        public boolean hasLanguageElement() { 
          return this.language != null && !this.language.isEmpty();
        }

        public boolean hasLanguage() { 
          return this.language != null && !this.language.isEmpty();
        }

        /**
         * @param value {@link #language} (Used to express the specific language of the title.). This is the underlying object with id, value and extensions. The accessor "getLanguage" gives direct access to the value
         */
        public ResearchStudyLabelComponent setLanguageElement(CodeType value) { 
          this.language = value;
          return this;
        }

        /**
         * @return Used to express the specific language of the title.
         */
        public String getLanguage() { 
          return this.language == null ? null : this.language.getValue();
        }

        /**
         * @param value Used to express the specific language of the title.
         */
        public ResearchStudyLabelComponent setLanguage(String value) { 
          if (Utilities.noString(value))
            this.language = null;
          else {
            if (this.language == null)
              this.language = new CodeType();
            this.language.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Kind of name.", 0, 1, type));
          children.add(new Property("value", "string", "The name.", 0, 1, value));
          children.add(new Property("language", "code", "Used to express the specific language of the title.", 0, 1, language));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Kind of name.", 0, 1, type);
          case 111972721: /*value*/  return new Property("value", "string", "The name.", 0, 1, value);
          case -1613589672: /*language*/  return new Property("language", "code", "Used to express the specific language of the title.", 0, 1, language);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // StringType
        case -1613589672: /*language*/ return this.language == null ? new Base[0] : new Base[] {this.language}; // CodeType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToString(value); // StringType
          return value;
        case -1613589672: // language
          this.language = TypeConvertor.castToCode(value); // CodeType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("value")) {
          this.value = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("language")) {
          this.language = TypeConvertor.castToCode(value); // CodeType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case 111972721:  return getValueElement();
        case -1613589672:  return getLanguageElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"string"};
        case -1613589672: /*language*/ return new String[] {"code"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("value")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.label.value");
        }
        else if (name.equals("language")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.label.language");
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyLabelComponent copy() {
        ResearchStudyLabelComponent dst = new ResearchStudyLabelComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyLabelComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.value = value == null ? null : value.copy();
        dst.language = language == null ? null : language.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyLabelComponent))
          return false;
        ResearchStudyLabelComponent o = (ResearchStudyLabelComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(value, o.value, true) && compareDeep(language, o.language, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyLabelComponent))
          return false;
        ResearchStudyLabelComponent o = (ResearchStudyLabelComponent) other_;
        return compareValues(value, o.value, true) && compareValues(language, o.language, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, value, language);
      }

  public String fhirType() {
    return "ResearchStudy.label";

  }

  }

    @Block()
    public static class ResearchStudyRelatesToComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The type of relationship to the related artifact.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of | part-of | amends | amended-with | appends | appended-with | cites | cited-by | comments-on | comment-in | contains | contained-in | corrects | correction-in | replaces | replaced-with | retracts | retracted-by | signs | similar-to | supports | supported-with | transforms | transformed-into | transformed-with | documents | specification-of | created-with | cite-as | reprint | reprint-of | summarizes", formalDefinition="The type of relationship to the related artifact." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/artifact-relationship-type")
        protected CodeableConcept type;

        /**
         * The artifact that is related to this ResearchStudy Resource.
         */
        @Child(name = "target", type = {UriType.class, Attachment.class, CanonicalType.class, Reference.class, MarkdownType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The artifact that is related to this ResearchStudy", formalDefinition="The artifact that is related to this ResearchStudy Resource." )
        protected DataType target;

        private static final long serialVersionUID = 55750058L;

    /**
     * Constructor
     */
      public ResearchStudyRelatesToComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ResearchStudyRelatesToComponent(CodeableConcept type, DataType target) {
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
              throw new Error("Attempt to auto-create ResearchStudyRelatesToComponent.type");
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
        public ResearchStudyRelatesToComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #target} (The artifact that is related to this ResearchStudy Resource.)
         */
        public DataType getTarget() { 
          return this.target;
        }

        /**
         * @return {@link #target} (The artifact that is related to this ResearchStudy Resource.)
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
         * @return {@link #target} (The artifact that is related to this ResearchStudy Resource.)
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
         * @return {@link #target} (The artifact that is related to this ResearchStudy Resource.)
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
         * @return {@link #target} (The artifact that is related to this ResearchStudy Resource.)
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
         * @return {@link #target} (The artifact that is related to this ResearchStudy Resource.)
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
         * @param value {@link #target} (The artifact that is related to this ResearchStudy Resource.)
         */
        public ResearchStudyRelatesToComponent setTarget(DataType value) { 
          if (value != null && !(value instanceof UriType || value instanceof Attachment || value instanceof CanonicalType || value instanceof Reference || value instanceof MarkdownType))
            throw new FHIRException("Not the right type for ResearchStudy.relatesTo.target[x]: "+value.fhirType());
          this.target = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "The type of relationship to the related artifact.", 0, 1, type));
          children.add(new Property("target[x]", "uri|Attachment|canonical(Any)|Reference(Any)|markdown", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The type of relationship to the related artifact.", 0, 1, type);
          case -815579825: /*target[x]*/  return new Property("target[x]", "uri|Attachment|canonical(Any)|Reference(Any)|markdown", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
          case -880905839: /*target*/  return new Property("target[x]", "uri|Attachment|canonical(Any)|Reference(Any)|markdown", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
          case -815585765: /*targetUri*/  return new Property("target[x]", "uri", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
          case 1345824148: /*targetAttachment*/  return new Property("target[x]", "Attachment", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
          case -1281653149: /*targetCanonical*/  return new Property("target[x]", "canonical(Any)", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
          case 1259806906: /*targetReference*/  return new Property("target[x]", "Reference(Any)", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
          case -1345146464: /*targetMarkdown*/  return new Property("target[x]", "markdown", "The artifact that is related to this ResearchStudy Resource.", 0, 1, target);
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

      public ResearchStudyRelatesToComponent copy() {
        ResearchStudyRelatesToComponent dst = new ResearchStudyRelatesToComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyRelatesToComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.target = target == null ? null : target.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyRelatesToComponent))
          return false;
        ResearchStudyRelatesToComponent o = (ResearchStudyRelatesToComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(target, o.target, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyRelatesToComponent))
          return false;
        ResearchStudyRelatesToComponent o = (ResearchStudyRelatesToComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, target);
      }

  public String fhirType() {
    return "ResearchStudy.relatesTo";

  }

  }

    @Block()
    public static class ResearchStudyAssociatedPartyComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Name of associated party.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Name of associated party", formalDefinition="Name of associated party." )
        protected StringType name;

        /**
         * Type of association.
         */
        @Child(name = "role", type = {CodeableConcept.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="sponsor | lead-sponsor | sponsor-investigator | primary-investigator | collaborator | funding-source | general-contact | recruitment-contact | sub-investigator | study-chair | irb | data-monitoring", formalDefinition="Type of association." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/research-study-party-role")
        protected CodeableConcept role;

        /**
         * Identifies the start date and the end date of the associated party in the role.
         */
        @Child(name = "period", type = {Period.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="When active in the role", formalDefinition="Identifies the start date and the end date of the associated party in the role." )
        protected List<Period> period;

        /**
         * A categorization other than role for the associated party.
         */
        @Child(name = "classifier", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="nih | fda | government | nonprofit | academic | industry", formalDefinition="A categorization other than role for the associated party." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/research-study-party-organization-type")
        protected List<CodeableConcept> classifier;

        /**
         * Individual or organization associated with study (use practitionerRole to specify their organisation).
         */
        @Child(name = "party", type = {Practitioner.class, PractitionerRole.class, Organization.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Individual or organization associated with study (use practitionerRole to specify their organisation)", formalDefinition="Individual or organization associated with study (use practitionerRole to specify their organisation)." )
        protected Reference party;

        private static final long serialVersionUID = -1418550998L;

    /**
     * Constructor
     */
      public ResearchStudyAssociatedPartyComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ResearchStudyAssociatedPartyComponent(CodeableConcept role) {
        super();
        this.setRole(role);
      }

        /**
         * @return {@link #name} (Name of associated party.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyAssociatedPartyComponent.name");
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
         * @param value {@link #name} (Name of associated party.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ResearchStudyAssociatedPartyComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return Name of associated party.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value Name of associated party.
         */
        public ResearchStudyAssociatedPartyComponent setName(String value) { 
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
         * @return {@link #role} (Type of association.)
         */
        public CodeableConcept getRole() { 
          if (this.role == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyAssociatedPartyComponent.role");
            else if (Configuration.doAutoCreate())
              this.role = new CodeableConcept(); // cc
          return this.role;
        }

        public boolean hasRole() { 
          return this.role != null && !this.role.isEmpty();
        }

        /**
         * @param value {@link #role} (Type of association.)
         */
        public ResearchStudyAssociatedPartyComponent setRole(CodeableConcept value) { 
          this.role = value;
          return this;
        }

        /**
         * @return {@link #period} (Identifies the start date and the end date of the associated party in the role.)
         */
        public List<Period> getPeriod() { 
          if (this.period == null)
            this.period = new ArrayList<Period>();
          return this.period;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ResearchStudyAssociatedPartyComponent setPeriod(List<Period> thePeriod) { 
          this.period = thePeriod;
          return this;
        }

        public boolean hasPeriod() { 
          if (this.period == null)
            return false;
          for (Period item : this.period)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Period addPeriod() { //3
          Period t = new Period();
          if (this.period == null)
            this.period = new ArrayList<Period>();
          this.period.add(t);
          return t;
        }

        public ResearchStudyAssociatedPartyComponent addPeriod(Period t) { //3
          if (t == null)
            return this;
          if (this.period == null)
            this.period = new ArrayList<Period>();
          this.period.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #period}, creating it if it does not already exist {3}
         */
        public Period getPeriodFirstRep() { 
          if (getPeriod().isEmpty()) {
            addPeriod();
          }
          return getPeriod().get(0);
        }

        /**
         * @return {@link #classifier} (A categorization other than role for the associated party.)
         */
        public List<CodeableConcept> getClassifier() { 
          if (this.classifier == null)
            this.classifier = new ArrayList<CodeableConcept>();
          return this.classifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ResearchStudyAssociatedPartyComponent setClassifier(List<CodeableConcept> theClassifier) { 
          this.classifier = theClassifier;
          return this;
        }

        public boolean hasClassifier() { 
          if (this.classifier == null)
            return false;
          for (CodeableConcept item : this.classifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addClassifier() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.classifier == null)
            this.classifier = new ArrayList<CodeableConcept>();
          this.classifier.add(t);
          return t;
        }

        public ResearchStudyAssociatedPartyComponent addClassifier(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.classifier == null)
            this.classifier = new ArrayList<CodeableConcept>();
          this.classifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #classifier}, creating it if it does not already exist {3}
         */
        public CodeableConcept getClassifierFirstRep() { 
          if (getClassifier().isEmpty()) {
            addClassifier();
          }
          return getClassifier().get(0);
        }

        /**
         * @return {@link #party} (Individual or organization associated with study (use practitionerRole to specify their organisation).)
         */
        public Reference getParty() { 
          if (this.party == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyAssociatedPartyComponent.party");
            else if (Configuration.doAutoCreate())
              this.party = new Reference(); // cc
          return this.party;
        }

        public boolean hasParty() { 
          return this.party != null && !this.party.isEmpty();
        }

        /**
         * @param value {@link #party} (Individual or organization associated with study (use practitionerRole to specify their organisation).)
         */
        public ResearchStudyAssociatedPartyComponent setParty(Reference value) { 
          this.party = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("name", "string", "Name of associated party.", 0, 1, name));
          children.add(new Property("role", "CodeableConcept", "Type of association.", 0, 1, role));
          children.add(new Property("period", "Period", "Identifies the start date and the end date of the associated party in the role.", 0, java.lang.Integer.MAX_VALUE, period));
          children.add(new Property("classifier", "CodeableConcept", "A categorization other than role for the associated party.", 0, java.lang.Integer.MAX_VALUE, classifier));
          children.add(new Property("party", "Reference(Practitioner|PractitionerRole|Organization)", "Individual or organization associated with study (use practitionerRole to specify their organisation).", 0, 1, party));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3373707: /*name*/  return new Property("name", "string", "Name of associated party.", 0, 1, name);
          case 3506294: /*role*/  return new Property("role", "CodeableConcept", "Type of association.", 0, 1, role);
          case -991726143: /*period*/  return new Property("period", "Period", "Identifies the start date and the end date of the associated party in the role.", 0, java.lang.Integer.MAX_VALUE, period);
          case -281470431: /*classifier*/  return new Property("classifier", "CodeableConcept", "A categorization other than role for the associated party.", 0, java.lang.Integer.MAX_VALUE, classifier);
          case 106437350: /*party*/  return new Property("party", "Reference(Practitioner|PractitionerRole|Organization)", "Individual or organization associated with study (use practitionerRole to specify their organisation).", 0, 1, party);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 3506294: /*role*/ return this.role == null ? new Base[0] : new Base[] {this.role}; // CodeableConcept
        case -991726143: /*period*/ return this.period == null ? new Base[0] : this.period.toArray(new Base[this.period.size()]); // Period
        case -281470431: /*classifier*/ return this.classifier == null ? new Base[0] : this.classifier.toArray(new Base[this.classifier.size()]); // CodeableConcept
        case 106437350: /*party*/ return this.party == null ? new Base[0] : new Base[] {this.party}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 3506294: // role
          this.role = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -991726143: // period
          this.getPeriod().add(TypeConvertor.castToPeriod(value)); // Period
          return value;
        case -281470431: // classifier
          this.getClassifier().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 106437350: // party
          this.party = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("role")) {
          this.role = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("period")) {
          this.getPeriod().add(TypeConvertor.castToPeriod(value));
        } else if (name.equals("classifier")) {
          this.getClassifier().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("party")) {
          this.party = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707:  return getNameElement();
        case 3506294:  return getRole();
        case -991726143:  return addPeriod(); 
        case -281470431:  return addClassifier(); 
        case 106437350:  return getParty();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return new String[] {"string"};
        case 3506294: /*role*/ return new String[] {"CodeableConcept"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case -281470431: /*classifier*/ return new String[] {"CodeableConcept"};
        case 106437350: /*party*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.associatedParty.name");
        }
        else if (name.equals("role")) {
          this.role = new CodeableConcept();
          return this.role;
        }
        else if (name.equals("period")) {
          return addPeriod();
        }
        else if (name.equals("classifier")) {
          return addClassifier();
        }
        else if (name.equals("party")) {
          this.party = new Reference();
          return this.party;
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyAssociatedPartyComponent copy() {
        ResearchStudyAssociatedPartyComponent dst = new ResearchStudyAssociatedPartyComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyAssociatedPartyComponent dst) {
        super.copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.role = role == null ? null : role.copy();
        if (period != null) {
          dst.period = new ArrayList<Period>();
          for (Period i : period)
            dst.period.add(i.copy());
        };
        if (classifier != null) {
          dst.classifier = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : classifier)
            dst.classifier.add(i.copy());
        };
        dst.party = party == null ? null : party.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyAssociatedPartyComponent))
          return false;
        ResearchStudyAssociatedPartyComponent o = (ResearchStudyAssociatedPartyComponent) other_;
        return compareDeep(name, o.name, true) && compareDeep(role, o.role, true) && compareDeep(period, o.period, true)
           && compareDeep(classifier, o.classifier, true) && compareDeep(party, o.party, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyAssociatedPartyComponent))
          return false;
        ResearchStudyAssociatedPartyComponent o = (ResearchStudyAssociatedPartyComponent) other_;
        return compareValues(name, o.name, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, role, period, classifier
          , party);
      }

  public String fhirType() {
    return "ResearchStudy.associatedParty";

  }

  }

    @Block()
    public static class ResearchStudyProgressStatusComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Label for status or state (e.g. recruitment status).
         */
        @Child(name = "state", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for status or state (e.g. recruitment status)", formalDefinition="Label for status or state (e.g. recruitment status)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/research-study-status")
        protected CodeableConcept state;

        /**
         * An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.
         */
        @Child(name = "actual", type = {BooleanType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Actual if true else anticipated", formalDefinition="An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date." )
        protected BooleanType actual;

        /**
         * Date range.
         */
        @Child(name = "period", type = {Period.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Date range", formalDefinition="Date range." )
        protected Period period;

        private static final long serialVersionUID = 1232680620L;

    /**
     * Constructor
     */
      public ResearchStudyProgressStatusComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ResearchStudyProgressStatusComponent(CodeableConcept state) {
        super();
        this.setState(state);
      }

        /**
         * @return {@link #state} (Label for status or state (e.g. recruitment status).)
         */
        public CodeableConcept getState() { 
          if (this.state == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyProgressStatusComponent.state");
            else if (Configuration.doAutoCreate())
              this.state = new CodeableConcept(); // cc
          return this.state;
        }

        public boolean hasState() { 
          return this.state != null && !this.state.isEmpty();
        }

        /**
         * @param value {@link #state} (Label for status or state (e.g. recruitment status).)
         */
        public ResearchStudyProgressStatusComponent setState(CodeableConcept value) { 
          this.state = value;
          return this;
        }

        /**
         * @return {@link #actual} (An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.). This is the underlying object with id, value and extensions. The accessor "getActual" gives direct access to the value
         */
        public BooleanType getActualElement() { 
          if (this.actual == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyProgressStatusComponent.actual");
            else if (Configuration.doAutoCreate())
              this.actual = new BooleanType(); // bb
          return this.actual;
        }

        public boolean hasActualElement() { 
          return this.actual != null && !this.actual.isEmpty();
        }

        public boolean hasActual() { 
          return this.actual != null && !this.actual.isEmpty();
        }

        /**
         * @param value {@link #actual} (An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.). This is the underlying object with id, value and extensions. The accessor "getActual" gives direct access to the value
         */
        public ResearchStudyProgressStatusComponent setActualElement(BooleanType value) { 
          this.actual = value;
          return this;
        }

        /**
         * @return An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.
         */
        public boolean getActual() { 
          return this.actual == null || this.actual.isEmpty() ? false : this.actual.getValue();
        }

        /**
         * @param value An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.
         */
        public ResearchStudyProgressStatusComponent setActual(boolean value) { 
            if (this.actual == null)
              this.actual = new BooleanType();
            this.actual.setValue(value);
          return this;
        }

        /**
         * @return {@link #period} (Date range.)
         */
        public Period getPeriod() { 
          if (this.period == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyProgressStatusComponent.period");
            else if (Configuration.doAutoCreate())
              this.period = new Period(); // cc
          return this.period;
        }

        public boolean hasPeriod() { 
          return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (Date range.)
         */
        public ResearchStudyProgressStatusComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("state", "CodeableConcept", "Label for status or state (e.g. recruitment status).", 0, 1, state));
          children.add(new Property("actual", "boolean", "An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.", 0, 1, actual));
          children.add(new Property("period", "Period", "Date range.", 0, 1, period));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 109757585: /*state*/  return new Property("state", "CodeableConcept", "Label for status or state (e.g. recruitment status).", 0, 1, state);
          case -1422939762: /*actual*/  return new Property("actual", "boolean", "An indication of whether or not the date is a known date when the state changed or will change. A value of true indicates a known date. A value of false indicates an estimated date.", 0, 1, actual);
          case -991726143: /*period*/  return new Property("period", "Period", "Date range.", 0, 1, period);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 109757585: /*state*/ return this.state == null ? new Base[0] : new Base[] {this.state}; // CodeableConcept
        case -1422939762: /*actual*/ return this.actual == null ? new Base[0] : new Base[] {this.actual}; // BooleanType
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 109757585: // state
          this.state = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1422939762: // actual
          this.actual = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("state")) {
          this.state = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("actual")) {
          this.actual = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109757585:  return getState();
        case -1422939762:  return getActualElement();
        case -991726143:  return getPeriod();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109757585: /*state*/ return new String[] {"CodeableConcept"};
        case -1422939762: /*actual*/ return new String[] {"boolean"};
        case -991726143: /*period*/ return new String[] {"Period"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("state")) {
          this.state = new CodeableConcept();
          return this.state;
        }
        else if (name.equals("actual")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.progressStatus.actual");
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyProgressStatusComponent copy() {
        ResearchStudyProgressStatusComponent dst = new ResearchStudyProgressStatusComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyProgressStatusComponent dst) {
        super.copyValues(dst);
        dst.state = state == null ? null : state.copy();
        dst.actual = actual == null ? null : actual.copy();
        dst.period = period == null ? null : period.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyProgressStatusComponent))
          return false;
        ResearchStudyProgressStatusComponent o = (ResearchStudyProgressStatusComponent) other_;
        return compareDeep(state, o.state, true) && compareDeep(actual, o.actual, true) && compareDeep(period, o.period, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyProgressStatusComponent))
          return false;
        ResearchStudyProgressStatusComponent o = (ResearchStudyProgressStatusComponent) other_;
        return compareValues(actual, o.actual, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(state, actual, period);
      }

  public String fhirType() {
    return "ResearchStudy.progressStatus";

  }

  }

    @Block()
    public static class ResearchStudyRecruitmentComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Estimated total number of participants to be enrolled.
         */
        @Child(name = "targetNumber", type = {UnsignedIntType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Estimated total number of participants to be enrolled", formalDefinition="Estimated total number of participants to be enrolled." )
        protected UnsignedIntType targetNumber;

        /**
         * Actual total number of participants enrolled in study.
         */
        @Child(name = "actualNumber", type = {UnsignedIntType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Actual total number of participants enrolled in study", formalDefinition="Actual total number of participants enrolled in study." )
        protected UnsignedIntType actualNumber;

        /**
         * Inclusion and exclusion criteria. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.
         */
        @Child(name = "eligibility", type = {Group.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Inclusion and exclusion criteria", formalDefinition="Inclusion and exclusion criteria. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'." )
        protected Reference eligibility;

        /**
         * Group of participants who were enrolled in study. The referenced Group Resource should have a membership element value of 'enumerated'.
         */
        @Child(name = "actualGroup", type = {Group.class}, order=4, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Group of participants who were enrolled in study", formalDefinition="Group of participants who were enrolled in study. The referenced Group Resource should have a membership element value of 'enumerated'." )
        protected Reference actualGroup;

        /**
         * Free text description of the recruitment of the study.
         */
        @Child(name = "description", type = {MarkdownType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the recruitment", formalDefinition="Free text description of the recruitment of the study." )
        protected MarkdownType description;

        private static final long serialVersionUID = 2093286046L;

    /**
     * Constructor
     */
      public ResearchStudyRecruitmentComponent() {
        super();
      }

        /**
         * @return {@link #targetNumber} (Estimated total number of participants to be enrolled.). This is the underlying object with id, value and extensions. The accessor "getTargetNumber" gives direct access to the value
         */
        public UnsignedIntType getTargetNumberElement() { 
          if (this.targetNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyRecruitmentComponent.targetNumber");
            else if (Configuration.doAutoCreate())
              this.targetNumber = new UnsignedIntType(); // bb
          return this.targetNumber;
        }

        public boolean hasTargetNumberElement() { 
          return this.targetNumber != null && !this.targetNumber.isEmpty();
        }

        public boolean hasTargetNumber() { 
          return this.targetNumber != null && !this.targetNumber.isEmpty();
        }

        /**
         * @param value {@link #targetNumber} (Estimated total number of participants to be enrolled.). This is the underlying object with id, value and extensions. The accessor "getTargetNumber" gives direct access to the value
         */
        public ResearchStudyRecruitmentComponent setTargetNumberElement(UnsignedIntType value) { 
          this.targetNumber = value;
          return this;
        }

        /**
         * @return Estimated total number of participants to be enrolled.
         */
        public int getTargetNumber() { 
          return this.targetNumber == null || this.targetNumber.isEmpty() ? 0 : this.targetNumber.getValue();
        }

        /**
         * @param value Estimated total number of participants to be enrolled.
         */
        public ResearchStudyRecruitmentComponent setTargetNumber(int value) { 
            if (this.targetNumber == null)
              this.targetNumber = new UnsignedIntType();
            this.targetNumber.setValue(value);
          return this;
        }

        /**
         * @return {@link #actualNumber} (Actual total number of participants enrolled in study.). This is the underlying object with id, value and extensions. The accessor "getActualNumber" gives direct access to the value
         */
        public UnsignedIntType getActualNumberElement() { 
          if (this.actualNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyRecruitmentComponent.actualNumber");
            else if (Configuration.doAutoCreate())
              this.actualNumber = new UnsignedIntType(); // bb
          return this.actualNumber;
        }

        public boolean hasActualNumberElement() { 
          return this.actualNumber != null && !this.actualNumber.isEmpty();
        }

        public boolean hasActualNumber() { 
          return this.actualNumber != null && !this.actualNumber.isEmpty();
        }

        /**
         * @param value {@link #actualNumber} (Actual total number of participants enrolled in study.). This is the underlying object with id, value and extensions. The accessor "getActualNumber" gives direct access to the value
         */
        public ResearchStudyRecruitmentComponent setActualNumberElement(UnsignedIntType value) { 
          this.actualNumber = value;
          return this;
        }

        /**
         * @return Actual total number of participants enrolled in study.
         */
        public int getActualNumber() { 
          return this.actualNumber == null || this.actualNumber.isEmpty() ? 0 : this.actualNumber.getValue();
        }

        /**
         * @param value Actual total number of participants enrolled in study.
         */
        public ResearchStudyRecruitmentComponent setActualNumber(int value) { 
            if (this.actualNumber == null)
              this.actualNumber = new UnsignedIntType();
            this.actualNumber.setValue(value);
          return this;
        }

        /**
         * @return {@link #eligibility} (Inclusion and exclusion criteria. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.)
         */
        public Reference getEligibility() { 
          if (this.eligibility == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyRecruitmentComponent.eligibility");
            else if (Configuration.doAutoCreate())
              this.eligibility = new Reference(); // cc
          return this.eligibility;
        }

        public boolean hasEligibility() { 
          return this.eligibility != null && !this.eligibility.isEmpty();
        }

        /**
         * @param value {@link #eligibility} (Inclusion and exclusion criteria. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.)
         */
        public ResearchStudyRecruitmentComponent setEligibility(Reference value) { 
          this.eligibility = value;
          return this;
        }

        /**
         * @return {@link #actualGroup} (Group of participants who were enrolled in study. The referenced Group Resource should have a membership element value of 'enumerated'.)
         */
        public Reference getActualGroup() { 
          if (this.actualGroup == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyRecruitmentComponent.actualGroup");
            else if (Configuration.doAutoCreate())
              this.actualGroup = new Reference(); // cc
          return this.actualGroup;
        }

        public boolean hasActualGroup() { 
          return this.actualGroup != null && !this.actualGroup.isEmpty();
        }

        /**
         * @param value {@link #actualGroup} (Group of participants who were enrolled in study. The referenced Group Resource should have a membership element value of 'enumerated'.)
         */
        public ResearchStudyRecruitmentComponent setActualGroup(Reference value) { 
          this.actualGroup = value;
          return this;
        }

        /**
         * @return {@link #description} (Free text description of the recruitment of the study.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyRecruitmentComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Free text description of the recruitment of the study.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ResearchStudyRecruitmentComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Free text description of the recruitment of the study.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Free text description of the recruitment of the study.
         */
        public ResearchStudyRecruitmentComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("targetNumber", "unsignedInt", "Estimated total number of participants to be enrolled.", 0, 1, targetNumber));
          children.add(new Property("actualNumber", "unsignedInt", "Actual total number of participants enrolled in study.", 0, 1, actualNumber));
          children.add(new Property("eligibility", "Reference(Group)", "Inclusion and exclusion criteria. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.", 0, 1, eligibility));
          children.add(new Property("actualGroup", "Reference(Group)", "Group of participants who were enrolled in study. The referenced Group Resource should have a membership element value of 'enumerated'.", 0, 1, actualGroup));
          children.add(new Property("description", "markdown", "Free text description of the recruitment of the study.", 0, 1, description));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -682948550: /*targetNumber*/  return new Property("targetNumber", "unsignedInt", "Estimated total number of participants to be enrolled.", 0, 1, targetNumber);
          case 746557047: /*actualNumber*/  return new Property("actualNumber", "unsignedInt", "Actual total number of participants enrolled in study.", 0, 1, actualNumber);
          case -930847859: /*eligibility*/  return new Property("eligibility", "Reference(Group)", "Inclusion and exclusion criteria. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.", 0, 1, eligibility);
          case 1403004305: /*actualGroup*/  return new Property("actualGroup", "Reference(Group)", "Group of participants who were enrolled in study. The referenced Group Resource should have a membership element value of 'enumerated'.", 0, 1, actualGroup);
          case -1724546052: /*description*/  return new Property("description", "markdown", "Free text description of the recruitment of the study.", 0, 1, description);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -682948550: /*targetNumber*/ return this.targetNumber == null ? new Base[0] : new Base[] {this.targetNumber}; // UnsignedIntType
        case 746557047: /*actualNumber*/ return this.actualNumber == null ? new Base[0] : new Base[] {this.actualNumber}; // UnsignedIntType
        case -930847859: /*eligibility*/ return this.eligibility == null ? new Base[0] : new Base[] {this.eligibility}; // Reference
        case 1403004305: /*actualGroup*/ return this.actualGroup == null ? new Base[0] : new Base[] {this.actualGroup}; // Reference
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -682948550: // targetNumber
          this.targetNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
          return value;
        case 746557047: // actualNumber
          this.actualNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
          return value;
        case -930847859: // eligibility
          this.eligibility = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1403004305: // actualGroup
          this.actualGroup = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("targetNumber")) {
          this.targetNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
        } else if (name.equals("actualNumber")) {
          this.actualNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
        } else if (name.equals("eligibility")) {
          this.eligibility = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("actualGroup")) {
          this.actualGroup = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -682948550:  return getTargetNumberElement();
        case 746557047:  return getActualNumberElement();
        case -930847859:  return getEligibility();
        case 1403004305:  return getActualGroup();
        case -1724546052:  return getDescriptionElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -682948550: /*targetNumber*/ return new String[] {"unsignedInt"};
        case 746557047: /*actualNumber*/ return new String[] {"unsignedInt"};
        case -930847859: /*eligibility*/ return new String[] {"Reference"};
        case 1403004305: /*actualGroup*/ return new String[] {"Reference"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("targetNumber")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.recruitment.targetNumber");
        }
        else if (name.equals("actualNumber")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.recruitment.actualNumber");
        }
        else if (name.equals("eligibility")) {
          this.eligibility = new Reference();
          return this.eligibility;
        }
        else if (name.equals("actualGroup")) {
          this.actualGroup = new Reference();
          return this.actualGroup;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.recruitment.description");
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyRecruitmentComponent copy() {
        ResearchStudyRecruitmentComponent dst = new ResearchStudyRecruitmentComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyRecruitmentComponent dst) {
        super.copyValues(dst);
        dst.targetNumber = targetNumber == null ? null : targetNumber.copy();
        dst.actualNumber = actualNumber == null ? null : actualNumber.copy();
        dst.eligibility = eligibility == null ? null : eligibility.copy();
        dst.actualGroup = actualGroup == null ? null : actualGroup.copy();
        dst.description = description == null ? null : description.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyRecruitmentComponent))
          return false;
        ResearchStudyRecruitmentComponent o = (ResearchStudyRecruitmentComponent) other_;
        return compareDeep(targetNumber, o.targetNumber, true) && compareDeep(actualNumber, o.actualNumber, true)
           && compareDeep(eligibility, o.eligibility, true) && compareDeep(actualGroup, o.actualGroup, true)
           && compareDeep(description, o.description, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyRecruitmentComponent))
          return false;
        ResearchStudyRecruitmentComponent o = (ResearchStudyRecruitmentComponent) other_;
        return compareValues(targetNumber, o.targetNumber, true) && compareValues(actualNumber, o.actualNumber, true)
           && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(targetNumber, actualNumber
          , eligibility, actualGroup, description);
      }

  public String fhirType() {
    return "ResearchStudy.recruitment";

  }

  }

    @Block()
    public static class ResearchStudyComparisonGroupComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Estimated total number of participants to be enrolled in the comparison group.
         */
        @Child(name = "targetNumber", type = {UnsignedIntType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Estimated total number of participants to be enrolled in the comparison group", formalDefinition="Estimated total number of participants to be enrolled in the comparison group." )
        protected UnsignedIntType targetNumber;

        /**
         * Actual total number of participants enrolled in the comparison group.
         */
        @Child(name = "actualNumber", type = {UnsignedIntType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Actual total number of participants enrolled in the comparison group", formalDefinition="Actual total number of participants enrolled in the comparison group." )
        protected UnsignedIntType actualNumber;

        /**
         * Inclusion and exclusion criteria for the comparison group as a subset of the eligibility for the overall study. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.
         */
        @Child(name = "eligibility", type = {Group.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Inclusion and exclusion criteria for the comparison group", formalDefinition="Inclusion and exclusion criteria for the comparison group as a subset of the eligibility for the overall study. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'." )
        protected Reference eligibility;

        /**
         * Group of participants who were enrolled in the comparison group as a subset of those enrolled in the overall study. The referenced Group Resource should have a membership element value of 'enumerated'.
         */
        @Child(name = "observedGroup", type = {Group.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Group of participants who were enrolled in the comparison group", formalDefinition="Group of participants who were enrolled in the comparison group as a subset of those enrolled in the overall study. The referenced Group Resource should have a membership element value of 'enumerated'." )
        protected Reference observedGroup;

        /**
         * Description of the comparison Group.
         */
        @Child(name = "description", type = {MarkdownType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the comparison Group", formalDefinition="Description of the comparison Group." )
        protected MarkdownType description;

        private static final long serialVersionUID = -1586921308L;

    /**
     * Constructor
     */
      public ResearchStudyComparisonGroupComponent() {
        super();
      }

        /**
         * @return {@link #targetNumber} (Estimated total number of participants to be enrolled in the comparison group.). This is the underlying object with id, value and extensions. The accessor "getTargetNumber" gives direct access to the value
         */
        public UnsignedIntType getTargetNumberElement() { 
          if (this.targetNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyComparisonGroupComponent.targetNumber");
            else if (Configuration.doAutoCreate())
              this.targetNumber = new UnsignedIntType(); // bb
          return this.targetNumber;
        }

        public boolean hasTargetNumberElement() { 
          return this.targetNumber != null && !this.targetNumber.isEmpty();
        }

        public boolean hasTargetNumber() { 
          return this.targetNumber != null && !this.targetNumber.isEmpty();
        }

        /**
         * @param value {@link #targetNumber} (Estimated total number of participants to be enrolled in the comparison group.). This is the underlying object with id, value and extensions. The accessor "getTargetNumber" gives direct access to the value
         */
        public ResearchStudyComparisonGroupComponent setTargetNumberElement(UnsignedIntType value) { 
          this.targetNumber = value;
          return this;
        }

        /**
         * @return Estimated total number of participants to be enrolled in the comparison group.
         */
        public int getTargetNumber() { 
          return this.targetNumber == null || this.targetNumber.isEmpty() ? 0 : this.targetNumber.getValue();
        }

        /**
         * @param value Estimated total number of participants to be enrolled in the comparison group.
         */
        public ResearchStudyComparisonGroupComponent setTargetNumber(int value) { 
            if (this.targetNumber == null)
              this.targetNumber = new UnsignedIntType();
            this.targetNumber.setValue(value);
          return this;
        }

        /**
         * @return {@link #actualNumber} (Actual total number of participants enrolled in the comparison group.). This is the underlying object with id, value and extensions. The accessor "getActualNumber" gives direct access to the value
         */
        public UnsignedIntType getActualNumberElement() { 
          if (this.actualNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyComparisonGroupComponent.actualNumber");
            else if (Configuration.doAutoCreate())
              this.actualNumber = new UnsignedIntType(); // bb
          return this.actualNumber;
        }

        public boolean hasActualNumberElement() { 
          return this.actualNumber != null && !this.actualNumber.isEmpty();
        }

        public boolean hasActualNumber() { 
          return this.actualNumber != null && !this.actualNumber.isEmpty();
        }

        /**
         * @param value {@link #actualNumber} (Actual total number of participants enrolled in the comparison group.). This is the underlying object with id, value and extensions. The accessor "getActualNumber" gives direct access to the value
         */
        public ResearchStudyComparisonGroupComponent setActualNumberElement(UnsignedIntType value) { 
          this.actualNumber = value;
          return this;
        }

        /**
         * @return Actual total number of participants enrolled in the comparison group.
         */
        public int getActualNumber() { 
          return this.actualNumber == null || this.actualNumber.isEmpty() ? 0 : this.actualNumber.getValue();
        }

        /**
         * @param value Actual total number of participants enrolled in the comparison group.
         */
        public ResearchStudyComparisonGroupComponent setActualNumber(int value) { 
            if (this.actualNumber == null)
              this.actualNumber = new UnsignedIntType();
            this.actualNumber.setValue(value);
          return this;
        }

        /**
         * @return {@link #eligibility} (Inclusion and exclusion criteria for the comparison group as a subset of the eligibility for the overall study. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.)
         */
        public Reference getEligibility() { 
          if (this.eligibility == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyComparisonGroupComponent.eligibility");
            else if (Configuration.doAutoCreate())
              this.eligibility = new Reference(); // cc
          return this.eligibility;
        }

        public boolean hasEligibility() { 
          return this.eligibility != null && !this.eligibility.isEmpty();
        }

        /**
         * @param value {@link #eligibility} (Inclusion and exclusion criteria for the comparison group as a subset of the eligibility for the overall study. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.)
         */
        public ResearchStudyComparisonGroupComponent setEligibility(Reference value) { 
          this.eligibility = value;
          return this;
        }

        /**
         * @return {@link #observedGroup} (Group of participants who were enrolled in the comparison group as a subset of those enrolled in the overall study. The referenced Group Resource should have a membership element value of 'enumerated'.)
         */
        public Reference getObservedGroup() { 
          if (this.observedGroup == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyComparisonGroupComponent.observedGroup");
            else if (Configuration.doAutoCreate())
              this.observedGroup = new Reference(); // cc
          return this.observedGroup;
        }

        public boolean hasObservedGroup() { 
          return this.observedGroup != null && !this.observedGroup.isEmpty();
        }

        /**
         * @param value {@link #observedGroup} (Group of participants who were enrolled in the comparison group as a subset of those enrolled in the overall study. The referenced Group Resource should have a membership element value of 'enumerated'.)
         */
        public ResearchStudyComparisonGroupComponent setObservedGroup(Reference value) { 
          this.observedGroup = value;
          return this;
        }

        /**
         * @return {@link #description} (Description of the comparison Group.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyComparisonGroupComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Description of the comparison Group.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ResearchStudyComparisonGroupComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Description of the comparison Group.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Description of the comparison Group.
         */
        public ResearchStudyComparisonGroupComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("targetNumber", "unsignedInt", "Estimated total number of participants to be enrolled in the comparison group.", 0, 1, targetNumber));
          children.add(new Property("actualNumber", "unsignedInt", "Actual total number of participants enrolled in the comparison group.", 0, 1, actualNumber));
          children.add(new Property("eligibility", "Reference(Group)", "Inclusion and exclusion criteria for the comparison group as a subset of the eligibility for the overall study. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.", 0, 1, eligibility));
          children.add(new Property("observedGroup", "Reference(Group)", "Group of participants who were enrolled in the comparison group as a subset of those enrolled in the overall study. The referenced Group Resource should have a membership element value of 'enumerated'.", 0, 1, observedGroup));
          children.add(new Property("description", "markdown", "Description of the comparison Group.", 0, 1, description));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -682948550: /*targetNumber*/  return new Property("targetNumber", "unsignedInt", "Estimated total number of participants to be enrolled in the comparison group.", 0, 1, targetNumber);
          case 746557047: /*actualNumber*/  return new Property("actualNumber", "unsignedInt", "Actual total number of participants enrolled in the comparison group.", 0, 1, actualNumber);
          case -930847859: /*eligibility*/  return new Property("eligibility", "Reference(Group)", "Inclusion and exclusion criteria for the comparison group as a subset of the eligibility for the overall study. The referenced Group Resource should have a membership element value of either 'definitional' or 'conceptual'.", 0, 1, eligibility);
          case 375599255: /*observedGroup*/  return new Property("observedGroup", "Reference(Group)", "Group of participants who were enrolled in the comparison group as a subset of those enrolled in the overall study. The referenced Group Resource should have a membership element value of 'enumerated'.", 0, 1, observedGroup);
          case -1724546052: /*description*/  return new Property("description", "markdown", "Description of the comparison Group.", 0, 1, description);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -682948550: /*targetNumber*/ return this.targetNumber == null ? new Base[0] : new Base[] {this.targetNumber}; // UnsignedIntType
        case 746557047: /*actualNumber*/ return this.actualNumber == null ? new Base[0] : new Base[] {this.actualNumber}; // UnsignedIntType
        case -930847859: /*eligibility*/ return this.eligibility == null ? new Base[0] : new Base[] {this.eligibility}; // Reference
        case 375599255: /*observedGroup*/ return this.observedGroup == null ? new Base[0] : new Base[] {this.observedGroup}; // Reference
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -682948550: // targetNumber
          this.targetNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
          return value;
        case 746557047: // actualNumber
          this.actualNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
          return value;
        case -930847859: // eligibility
          this.eligibility = TypeConvertor.castToReference(value); // Reference
          return value;
        case 375599255: // observedGroup
          this.observedGroup = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("targetNumber")) {
          this.targetNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
        } else if (name.equals("actualNumber")) {
          this.actualNumber = TypeConvertor.castToUnsignedInt(value); // UnsignedIntType
        } else if (name.equals("eligibility")) {
          this.eligibility = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("observedGroup")) {
          this.observedGroup = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -682948550:  return getTargetNumberElement();
        case 746557047:  return getActualNumberElement();
        case -930847859:  return getEligibility();
        case 375599255:  return getObservedGroup();
        case -1724546052:  return getDescriptionElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -682948550: /*targetNumber*/ return new String[] {"unsignedInt"};
        case 746557047: /*actualNumber*/ return new String[] {"unsignedInt"};
        case -930847859: /*eligibility*/ return new String[] {"Reference"};
        case 375599255: /*observedGroup*/ return new String[] {"Reference"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("targetNumber")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.comparisonGroup.targetNumber");
        }
        else if (name.equals("actualNumber")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.comparisonGroup.actualNumber");
        }
        else if (name.equals("eligibility")) {
          this.eligibility = new Reference();
          return this.eligibility;
        }
        else if (name.equals("observedGroup")) {
          this.observedGroup = new Reference();
          return this.observedGroup;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.comparisonGroup.description");
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyComparisonGroupComponent copy() {
        ResearchStudyComparisonGroupComponent dst = new ResearchStudyComparisonGroupComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyComparisonGroupComponent dst) {
        super.copyValues(dst);
        dst.targetNumber = targetNumber == null ? null : targetNumber.copy();
        dst.actualNumber = actualNumber == null ? null : actualNumber.copy();
        dst.eligibility = eligibility == null ? null : eligibility.copy();
        dst.observedGroup = observedGroup == null ? null : observedGroup.copy();
        dst.description = description == null ? null : description.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyComparisonGroupComponent))
          return false;
        ResearchStudyComparisonGroupComponent o = (ResearchStudyComparisonGroupComponent) other_;
        return compareDeep(targetNumber, o.targetNumber, true) && compareDeep(actualNumber, o.actualNumber, true)
           && compareDeep(eligibility, o.eligibility, true) && compareDeep(observedGroup, o.observedGroup, true)
           && compareDeep(description, o.description, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyComparisonGroupComponent))
          return false;
        ResearchStudyComparisonGroupComponent o = (ResearchStudyComparisonGroupComponent) other_;
        return compareValues(targetNumber, o.targetNumber, true) && compareValues(actualNumber, o.actualNumber, true)
           && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(targetNumber, actualNumber
          , eligibility, observedGroup, description);
      }

  public String fhirType() {
    return "ResearchStudy.comparisonGroup";

  }

  }

    @Block()
    public static class ResearchStudyObjectiveComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Unique, human-readable label for this objective of the study.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for the objective", formalDefinition="Unique, human-readable label for this objective of the study." )
        protected StringType name;

        /**
         * The kind of study objective.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="primary | secondary | exploratory", formalDefinition="The kind of study objective." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/research-study-objective-type")
        protected CodeableConcept type;

        /**
         * Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).
         */
        @Child(name = "description", type = {MarkdownType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the objective", formalDefinition="Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description)." )
        protected MarkdownType description;

        /**
         * An "outcome measure", "endpoint", "effect measure" or "measure of effect" is a specific measurement or observation used to quantify the effect of experimental variables on the participants in a study, or for observational studies, to describe patterns of diseases or traits or associations with exposures, risk factors or treatment.
         */
        @Child(name = "outcomeMeasure", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="A variable measured during the study", formalDefinition="An \"outcome measure\", \"endpoint\", \"effect measure\" or \"measure of effect\" is a specific measurement or observation used to quantify the effect of experimental variables on the participants in a study, or for observational studies, to describe patterns of diseases or traits or associations with exposures, risk factors or treatment." )
        protected List<ResearchStudyObjectiveOutcomeMeasureComponent> outcomeMeasure;

        private static final long serialVersionUID = -537104238L;

    /**
     * Constructor
     */
      public ResearchStudyObjectiveComponent() {
        super();
      }

        /**
         * @return {@link #name} (Unique, human-readable label for this objective of the study.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveComponent.name");
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
         * @param value {@link #name} (Unique, human-readable label for this objective of the study.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ResearchStudyObjectiveComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return Unique, human-readable label for this objective of the study.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value Unique, human-readable label for this objective of the study.
         */
        public ResearchStudyObjectiveComponent setName(String value) { 
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
         * @return {@link #type} (The kind of study objective.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The kind of study objective.)
         */
        public ResearchStudyObjectiveComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #description} (Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ResearchStudyObjectiveComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).
         */
        public ResearchStudyObjectiveComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #outcomeMeasure} (An "outcome measure", "endpoint", "effect measure" or "measure of effect" is a specific measurement or observation used to quantify the effect of experimental variables on the participants in a study, or for observational studies, to describe patterns of diseases or traits or associations with exposures, risk factors or treatment.)
         */
        public List<ResearchStudyObjectiveOutcomeMeasureComponent> getOutcomeMeasure() { 
          if (this.outcomeMeasure == null)
            this.outcomeMeasure = new ArrayList<ResearchStudyObjectiveOutcomeMeasureComponent>();
          return this.outcomeMeasure;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ResearchStudyObjectiveComponent setOutcomeMeasure(List<ResearchStudyObjectiveOutcomeMeasureComponent> theOutcomeMeasure) { 
          this.outcomeMeasure = theOutcomeMeasure;
          return this;
        }

        public boolean hasOutcomeMeasure() { 
          if (this.outcomeMeasure == null)
            return false;
          for (ResearchStudyObjectiveOutcomeMeasureComponent item : this.outcomeMeasure)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ResearchStudyObjectiveOutcomeMeasureComponent addOutcomeMeasure() { //3
          ResearchStudyObjectiveOutcomeMeasureComponent t = new ResearchStudyObjectiveOutcomeMeasureComponent();
          if (this.outcomeMeasure == null)
            this.outcomeMeasure = new ArrayList<ResearchStudyObjectiveOutcomeMeasureComponent>();
          this.outcomeMeasure.add(t);
          return t;
        }

        public ResearchStudyObjectiveComponent addOutcomeMeasure(ResearchStudyObjectiveOutcomeMeasureComponent t) { //3
          if (t == null)
            return this;
          if (this.outcomeMeasure == null)
            this.outcomeMeasure = new ArrayList<ResearchStudyObjectiveOutcomeMeasureComponent>();
          this.outcomeMeasure.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #outcomeMeasure}, creating it if it does not already exist {3}
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent getOutcomeMeasureFirstRep() { 
          if (getOutcomeMeasure().isEmpty()) {
            addOutcomeMeasure();
          }
          return getOutcomeMeasure().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("name", "string", "Unique, human-readable label for this objective of the study.", 0, 1, name));
          children.add(new Property("type", "CodeableConcept", "The kind of study objective.", 0, 1, type));
          children.add(new Property("description", "markdown", "Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).", 0, 1, description));
          children.add(new Property("outcomeMeasure", "", "An \"outcome measure\", \"endpoint\", \"effect measure\" or \"measure of effect\" is a specific measurement or observation used to quantify the effect of experimental variables on the participants in a study, or for observational studies, to describe patterns of diseases or traits or associations with exposures, risk factors or treatment.", 0, java.lang.Integer.MAX_VALUE, outcomeMeasure));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3373707: /*name*/  return new Property("name", "string", "Unique, human-readable label for this objective of the study.", 0, 1, name);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The kind of study objective.", 0, 1, type);
          case -1724546052: /*description*/  return new Property("description", "markdown", "Free text description of the objective of the study. This is what the study is trying to achieve rather than how it is going to achieve it (see ResearchStudy.description).", 0, 1, description);
          case -1510689364: /*outcomeMeasure*/  return new Property("outcomeMeasure", "", "An \"outcome measure\", \"endpoint\", \"effect measure\" or \"measure of effect\" is a specific measurement or observation used to quantify the effect of experimental variables on the participants in a study, or for observational studies, to describe patterns of diseases or traits or associations with exposures, risk factors or treatment.", 0, java.lang.Integer.MAX_VALUE, outcomeMeasure);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case -1510689364: /*outcomeMeasure*/ return this.outcomeMeasure == null ? new Base[0] : this.outcomeMeasure.toArray(new Base[this.outcomeMeasure.size()]); // ResearchStudyObjectiveOutcomeMeasureComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -1510689364: // outcomeMeasure
          this.getOutcomeMeasure().add((ResearchStudyObjectiveOutcomeMeasureComponent) value); // ResearchStudyObjectiveOutcomeMeasureComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("outcomeMeasure")) {
          this.getOutcomeMeasure().add((ResearchStudyObjectiveOutcomeMeasureComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707:  return getNameElement();
        case 3575610:  return getType();
        case -1724546052:  return getDescriptionElement();
        case -1510689364:  return addOutcomeMeasure(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return new String[] {"string"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case -1510689364: /*outcomeMeasure*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.objective.name");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.objective.description");
        }
        else if (name.equals("outcomeMeasure")) {
          return addOutcomeMeasure();
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyObjectiveComponent copy() {
        ResearchStudyObjectiveComponent dst = new ResearchStudyObjectiveComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyObjectiveComponent dst) {
        super.copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.type = type == null ? null : type.copy();
        dst.description = description == null ? null : description.copy();
        if (outcomeMeasure != null) {
          dst.outcomeMeasure = new ArrayList<ResearchStudyObjectiveOutcomeMeasureComponent>();
          for (ResearchStudyObjectiveOutcomeMeasureComponent i : outcomeMeasure)
            dst.outcomeMeasure.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyObjectiveComponent))
          return false;
        ResearchStudyObjectiveComponent o = (ResearchStudyObjectiveComponent) other_;
        return compareDeep(name, o.name, true) && compareDeep(type, o.type, true) && compareDeep(description, o.description, true)
           && compareDeep(outcomeMeasure, o.outcomeMeasure, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyObjectiveComponent))
          return false;
        ResearchStudyObjectiveComponent o = (ResearchStudyObjectiveComponent) other_;
        return compareValues(name, o.name, true) && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, type, description
          , outcomeMeasure);
      }

  public String fhirType() {
    return "ResearchStudy.objective";

  }

  }

    @Block()
    public static class ResearchStudyObjectiveOutcomeMeasureComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Label for the outcome measure.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for the outcome measure", formalDefinition="Label for the outcome measure." )
        protected StringType name;

        /**
         * The kind of outcome measure.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="primary | secondary | exploratory", formalDefinition="The kind of outcome measure." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/research-study-objective-type")
        protected CodeableConcept type;

        /**
         * Description of the outcome measure.
         */
        @Child(name = "description", type = {MarkdownType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Description of the outcome measure", formalDefinition="Description of the outcome measure." )
        protected MarkdownType description;

        /**
         * Definition of the outcome measure.
         */
        @Child(name = "endpoint", type = {EvidenceVariable.class}, order=4, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Definition of the outcome measure", formalDefinition="Definition of the outcome measure." )
        protected Reference endpoint;

        /**
         * Population for this estimand.
         */
        @Child(name = "population", type = {Group.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Population for this estimand", formalDefinition="Population for this estimand." )
        protected Reference population;

        /**
         * Comparison group of interest.
         */
        @Child(name = "intervention", type = {Group.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Comparison group of interest", formalDefinition="Comparison group of interest." )
        protected Reference intervention;

        /**
         * Comparison group for comparison.
         */
        @Child(name = "comparator", type = {Group.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Comparison group for comparison", formalDefinition="Comparison group for comparison." )
        protected Reference comparator;

        /**
         * Statistical measure for treatment effect estimate.
         */
        @Child(name = "summaryMeasure", type = {CodeableConcept.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Statistical measure for treatment effect estimate", formalDefinition="Statistical measure for treatment effect estimate." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/statistic-type")
        protected CodeableConcept summaryMeasure;

        /**
         * The planned statistical model for analysis of a single endpoint.
         */
        @Child(name = "endpointAnalysisPlan", type = {Evidence.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Statistical analysis plan for a single endpoint", formalDefinition="The planned statistical model for analysis of a single endpoint." )
        protected Reference endpointAnalysisPlan;

        /**
         * Handling of intercurrent event.
         */
        @Child(name = "eventHandling", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Handling of intercurrent event", formalDefinition="Handling of intercurrent event." )
        protected List<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent> eventHandling;

        private static final long serialVersionUID = -733823699L;

    /**
     * Constructor
     */
      public ResearchStudyObjectiveOutcomeMeasureComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ResearchStudyObjectiveOutcomeMeasureComponent(Reference endpoint) {
        super();
        this.setEndpoint(endpoint);
      }

        /**
         * @return {@link #name} (Label for the outcome measure.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.name");
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
         * @param value {@link #name} (Label for the outcome measure.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return Label for the outcome measure.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value Label for the outcome measure.
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setName(String value) { 
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
         * @return {@link #type} (The kind of outcome measure.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The kind of outcome measure.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #description} (Description of the outcome measure.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Description of the outcome measure.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Description of the outcome measure.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Description of the outcome measure.
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #endpoint} (Definition of the outcome measure.)
         */
        public Reference getEndpoint() { 
          if (this.endpoint == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.endpoint");
            else if (Configuration.doAutoCreate())
              this.endpoint = new Reference(); // cc
          return this.endpoint;
        }

        public boolean hasEndpoint() { 
          return this.endpoint != null && !this.endpoint.isEmpty();
        }

        /**
         * @param value {@link #endpoint} (Definition of the outcome measure.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setEndpoint(Reference value) { 
          this.endpoint = value;
          return this;
        }

        /**
         * @return {@link #population} (Population for this estimand.)
         */
        public Reference getPopulation() { 
          if (this.population == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.population");
            else if (Configuration.doAutoCreate())
              this.population = new Reference(); // cc
          return this.population;
        }

        public boolean hasPopulation() { 
          return this.population != null && !this.population.isEmpty();
        }

        /**
         * @param value {@link #population} (Population for this estimand.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setPopulation(Reference value) { 
          this.population = value;
          return this;
        }

        /**
         * @return {@link #intervention} (Comparison group of interest.)
         */
        public Reference getIntervention() { 
          if (this.intervention == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.intervention");
            else if (Configuration.doAutoCreate())
              this.intervention = new Reference(); // cc
          return this.intervention;
        }

        public boolean hasIntervention() { 
          return this.intervention != null && !this.intervention.isEmpty();
        }

        /**
         * @param value {@link #intervention} (Comparison group of interest.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setIntervention(Reference value) { 
          this.intervention = value;
          return this;
        }

        /**
         * @return {@link #comparator} (Comparison group for comparison.)
         */
        public Reference getComparator() { 
          if (this.comparator == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.comparator");
            else if (Configuration.doAutoCreate())
              this.comparator = new Reference(); // cc
          return this.comparator;
        }

        public boolean hasComparator() { 
          return this.comparator != null && !this.comparator.isEmpty();
        }

        /**
         * @param value {@link #comparator} (Comparison group for comparison.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setComparator(Reference value) { 
          this.comparator = value;
          return this;
        }

        /**
         * @return {@link #summaryMeasure} (Statistical measure for treatment effect estimate.)
         */
        public CodeableConcept getSummaryMeasure() { 
          if (this.summaryMeasure == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.summaryMeasure");
            else if (Configuration.doAutoCreate())
              this.summaryMeasure = new CodeableConcept(); // cc
          return this.summaryMeasure;
        }

        public boolean hasSummaryMeasure() { 
          return this.summaryMeasure != null && !this.summaryMeasure.isEmpty();
        }

        /**
         * @param value {@link #summaryMeasure} (Statistical measure for treatment effect estimate.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setSummaryMeasure(CodeableConcept value) { 
          this.summaryMeasure = value;
          return this;
        }

        /**
         * @return {@link #endpointAnalysisPlan} (The planned statistical model for analysis of a single endpoint.)
         */
        public Reference getEndpointAnalysisPlan() { 
          if (this.endpointAnalysisPlan == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureComponent.endpointAnalysisPlan");
            else if (Configuration.doAutoCreate())
              this.endpointAnalysisPlan = new Reference(); // cc
          return this.endpointAnalysisPlan;
        }

        public boolean hasEndpointAnalysisPlan() { 
          return this.endpointAnalysisPlan != null && !this.endpointAnalysisPlan.isEmpty();
        }

        /**
         * @param value {@link #endpointAnalysisPlan} (The planned statistical model for analysis of a single endpoint.)
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setEndpointAnalysisPlan(Reference value) { 
          this.endpointAnalysisPlan = value;
          return this;
        }

        /**
         * @return {@link #eventHandling} (Handling of intercurrent event.)
         */
        public List<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent> getEventHandling() { 
          if (this.eventHandling == null)
            this.eventHandling = new ArrayList<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent>();
          return this.eventHandling;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ResearchStudyObjectiveOutcomeMeasureComponent setEventHandling(List<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent> theEventHandling) { 
          this.eventHandling = theEventHandling;
          return this;
        }

        public boolean hasEventHandling() { 
          if (this.eventHandling == null)
            return false;
          for (ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent item : this.eventHandling)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent addEventHandling() { //3
          ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent t = new ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent();
          if (this.eventHandling == null)
            this.eventHandling = new ArrayList<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent>();
          this.eventHandling.add(t);
          return t;
        }

        public ResearchStudyObjectiveOutcomeMeasureComponent addEventHandling(ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent t) { //3
          if (t == null)
            return this;
          if (this.eventHandling == null)
            this.eventHandling = new ArrayList<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent>();
          this.eventHandling.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #eventHandling}, creating it if it does not already exist {3}
         */
        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent getEventHandlingFirstRep() { 
          if (getEventHandling().isEmpty()) {
            addEventHandling();
          }
          return getEventHandling().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("name", "string", "Label for the outcome measure.", 0, 1, name));
          children.add(new Property("type", "CodeableConcept", "The kind of outcome measure.", 0, 1, type));
          children.add(new Property("description", "markdown", "Description of the outcome measure.", 0, 1, description));
          children.add(new Property("endpoint", "Reference(EvidenceVariable)", "Definition of the outcome measure.", 0, 1, endpoint));
          children.add(new Property("population", "Reference(Group)", "Population for this estimand.", 0, 1, population));
          children.add(new Property("intervention", "Reference(Group)", "Comparison group of interest.", 0, 1, intervention));
          children.add(new Property("comparator", "Reference(Group)", "Comparison group for comparison.", 0, 1, comparator));
          children.add(new Property("summaryMeasure", "CodeableConcept", "Statistical measure for treatment effect estimate.", 0, 1, summaryMeasure));
          children.add(new Property("endpointAnalysisPlan", "Reference(Evidence)", "The planned statistical model for analysis of a single endpoint.", 0, 1, endpointAnalysisPlan));
          children.add(new Property("eventHandling", "", "Handling of intercurrent event.", 0, java.lang.Integer.MAX_VALUE, eventHandling));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3373707: /*name*/  return new Property("name", "string", "Label for the outcome measure.", 0, 1, name);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The kind of outcome measure.", 0, 1, type);
          case -1724546052: /*description*/  return new Property("description", "markdown", "Description of the outcome measure.", 0, 1, description);
          case 1741102485: /*endpoint*/  return new Property("endpoint", "Reference(EvidenceVariable)", "Definition of the outcome measure.", 0, 1, endpoint);
          case -2023558323: /*population*/  return new Property("population", "Reference(Group)", "Population for this estimand.", 0, 1, population);
          case -1452548393: /*intervention*/  return new Property("intervention", "Reference(Group)", "Comparison group of interest.", 0, 1, intervention);
          case -844673834: /*comparator*/  return new Property("comparator", "Reference(Group)", "Comparison group for comparison.", 0, 1, comparator);
          case 1869139672: /*summaryMeasure*/  return new Property("summaryMeasure", "CodeableConcept", "Statistical measure for treatment effect estimate.", 0, 1, summaryMeasure);
          case 1088101978: /*endpointAnalysisPlan*/  return new Property("endpointAnalysisPlan", "Reference(Evidence)", "The planned statistical model for analysis of a single endpoint.", 0, 1, endpointAnalysisPlan);
          case -1906754145: /*eventHandling*/  return new Property("eventHandling", "", "Handling of intercurrent event.", 0, java.lang.Integer.MAX_VALUE, eventHandling);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 1741102485: /*endpoint*/ return this.endpoint == null ? new Base[0] : new Base[] {this.endpoint}; // Reference
        case -2023558323: /*population*/ return this.population == null ? new Base[0] : new Base[] {this.population}; // Reference
        case -1452548393: /*intervention*/ return this.intervention == null ? new Base[0] : new Base[] {this.intervention}; // Reference
        case -844673834: /*comparator*/ return this.comparator == null ? new Base[0] : new Base[] {this.comparator}; // Reference
        case 1869139672: /*summaryMeasure*/ return this.summaryMeasure == null ? new Base[0] : new Base[] {this.summaryMeasure}; // CodeableConcept
        case 1088101978: /*endpointAnalysisPlan*/ return this.endpointAnalysisPlan == null ? new Base[0] : new Base[] {this.endpointAnalysisPlan}; // Reference
        case -1906754145: /*eventHandling*/ return this.eventHandling == null ? new Base[0] : this.eventHandling.toArray(new Base[this.eventHandling.size()]); // ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case 1741102485: // endpoint
          this.endpoint = TypeConvertor.castToReference(value); // Reference
          return value;
        case -2023558323: // population
          this.population = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1452548393: // intervention
          this.intervention = TypeConvertor.castToReference(value); // Reference
          return value;
        case -844673834: // comparator
          this.comparator = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1869139672: // summaryMeasure
          this.summaryMeasure = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1088101978: // endpointAnalysisPlan
          this.endpointAnalysisPlan = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1906754145: // eventHandling
          this.getEventHandling().add((ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent) value); // ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("endpoint")) {
          this.endpoint = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("population")) {
          this.population = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("intervention")) {
          this.intervention = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("comparator")) {
          this.comparator = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("summaryMeasure")) {
          this.summaryMeasure = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("endpointAnalysisPlan")) {
          this.endpointAnalysisPlan = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("eventHandling")) {
          this.getEventHandling().add((ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707:  return getNameElement();
        case 3575610:  return getType();
        case -1724546052:  return getDescriptionElement();
        case 1741102485:  return getEndpoint();
        case -2023558323:  return getPopulation();
        case -1452548393:  return getIntervention();
        case -844673834:  return getComparator();
        case 1869139672:  return getSummaryMeasure();
        case 1088101978:  return getEndpointAnalysisPlan();
        case -1906754145:  return addEventHandling(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return new String[] {"string"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 1741102485: /*endpoint*/ return new String[] {"Reference"};
        case -2023558323: /*population*/ return new String[] {"Reference"};
        case -1452548393: /*intervention*/ return new String[] {"Reference"};
        case -844673834: /*comparator*/ return new String[] {"Reference"};
        case 1869139672: /*summaryMeasure*/ return new String[] {"CodeableConcept"};
        case 1088101978: /*endpointAnalysisPlan*/ return new String[] {"Reference"};
        case -1906754145: /*eventHandling*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.objective.outcomeMeasure.name");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.objective.outcomeMeasure.description");
        }
        else if (name.equals("endpoint")) {
          this.endpoint = new Reference();
          return this.endpoint;
        }
        else if (name.equals("population")) {
          this.population = new Reference();
          return this.population;
        }
        else if (name.equals("intervention")) {
          this.intervention = new Reference();
          return this.intervention;
        }
        else if (name.equals("comparator")) {
          this.comparator = new Reference();
          return this.comparator;
        }
        else if (name.equals("summaryMeasure")) {
          this.summaryMeasure = new CodeableConcept();
          return this.summaryMeasure;
        }
        else if (name.equals("endpointAnalysisPlan")) {
          this.endpointAnalysisPlan = new Reference();
          return this.endpointAnalysisPlan;
        }
        else if (name.equals("eventHandling")) {
          return addEventHandling();
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyObjectiveOutcomeMeasureComponent copy() {
        ResearchStudyObjectiveOutcomeMeasureComponent dst = new ResearchStudyObjectiveOutcomeMeasureComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyObjectiveOutcomeMeasureComponent dst) {
        super.copyValues(dst);
        dst.name = name == null ? null : name.copy();
        dst.type = type == null ? null : type.copy();
        dst.description = description == null ? null : description.copy();
        dst.endpoint = endpoint == null ? null : endpoint.copy();
        dst.population = population == null ? null : population.copy();
        dst.intervention = intervention == null ? null : intervention.copy();
        dst.comparator = comparator == null ? null : comparator.copy();
        dst.summaryMeasure = summaryMeasure == null ? null : summaryMeasure.copy();
        dst.endpointAnalysisPlan = endpointAnalysisPlan == null ? null : endpointAnalysisPlan.copy();
        if (eventHandling != null) {
          dst.eventHandling = new ArrayList<ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent>();
          for (ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent i : eventHandling)
            dst.eventHandling.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyObjectiveOutcomeMeasureComponent))
          return false;
        ResearchStudyObjectiveOutcomeMeasureComponent o = (ResearchStudyObjectiveOutcomeMeasureComponent) other_;
        return compareDeep(name, o.name, true) && compareDeep(type, o.type, true) && compareDeep(description, o.description, true)
           && compareDeep(endpoint, o.endpoint, true) && compareDeep(population, o.population, true) && compareDeep(intervention, o.intervention, true)
           && compareDeep(comparator, o.comparator, true) && compareDeep(summaryMeasure, o.summaryMeasure, true)
           && compareDeep(endpointAnalysisPlan, o.endpointAnalysisPlan, true) && compareDeep(eventHandling, o.eventHandling, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyObjectiveOutcomeMeasureComponent))
          return false;
        ResearchStudyObjectiveOutcomeMeasureComponent o = (ResearchStudyObjectiveOutcomeMeasureComponent) other_;
        return compareValues(name, o.name, true) && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, type, description
          , endpoint, population, intervention, comparator, summaryMeasure, endpointAnalysisPlan
          , eventHandling);
      }

  public String fhirType() {
    return "ResearchStudy.objective.outcomeMeasure";

  }

  }

    @Block()
    public static class ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The event.
         */
        @Child(name = "event", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The event", formalDefinition="The event." )
        protected CodeableConcept event;

        /**
         * The group that is affected by this event handling.
         */
        @Child(name = "group", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The group that is affected by this event handling", formalDefinition="The group that is affected by this event handling." )
        protected CodeableConcept group;

        /**
         * How the data is handled.
         */
        @Child(name = "handling", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="How the data is handled", formalDefinition="How the data is handled." )
        protected CodeableConcept handling;

        /**
         * Text summary of event handling.
         */
        @Child(name = "description", type = {MarkdownType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Text summary of event handling", formalDefinition="Text summary of event handling." )
        protected MarkdownType description;

        private static final long serialVersionUID = 610653528L;

    /**
     * Constructor
     */
      public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent() {
        super();
      }

        /**
         * @return {@link #event} (The event.)
         */
        public CodeableConcept getEvent() { 
          if (this.event == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent.event");
            else if (Configuration.doAutoCreate())
              this.event = new CodeableConcept(); // cc
          return this.event;
        }

        public boolean hasEvent() { 
          return this.event != null && !this.event.isEmpty();
        }

        /**
         * @param value {@link #event} (The event.)
         */
        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent setEvent(CodeableConcept value) { 
          this.event = value;
          return this;
        }

        /**
         * @return {@link #group} (The group that is affected by this event handling.)
         */
        public CodeableConcept getGroup() { 
          if (this.group == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent.group");
            else if (Configuration.doAutoCreate())
              this.group = new CodeableConcept(); // cc
          return this.group;
        }

        public boolean hasGroup() { 
          return this.group != null && !this.group.isEmpty();
        }

        /**
         * @param value {@link #group} (The group that is affected by this event handling.)
         */
        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent setGroup(CodeableConcept value) { 
          this.group = value;
          return this;
        }

        /**
         * @return {@link #handling} (How the data is handled.)
         */
        public CodeableConcept getHandling() { 
          if (this.handling == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent.handling");
            else if (Configuration.doAutoCreate())
              this.handling = new CodeableConcept(); // cc
          return this.handling;
        }

        public boolean hasHandling() { 
          return this.handling != null && !this.handling.isEmpty();
        }

        /**
         * @param value {@link #handling} (How the data is handled.)
         */
        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent setHandling(CodeableConcept value) { 
          this.handling = value;
          return this;
        }

        /**
         * @return {@link #description} (Text summary of event handling.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public MarkdownType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new MarkdownType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Text summary of event handling.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent setDescriptionElement(MarkdownType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Text summary of event handling.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Text summary of event handling.
         */
        public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new MarkdownType();
            this.description.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("event", "CodeableConcept", "The event.", 0, 1, event));
          children.add(new Property("group", "CodeableConcept", "The group that is affected by this event handling.", 0, 1, group));
          children.add(new Property("handling", "CodeableConcept", "How the data is handled.", 0, 1, handling));
          children.add(new Property("description", "markdown", "Text summary of event handling.", 0, 1, description));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 96891546: /*event*/  return new Property("event", "CodeableConcept", "The event.", 0, 1, event);
          case 98629247: /*group*/  return new Property("group", "CodeableConcept", "The group that is affected by this event handling.", 0, 1, group);
          case 2072805: /*handling*/  return new Property("handling", "CodeableConcept", "How the data is handled.", 0, 1, handling);
          case -1724546052: /*description*/  return new Property("description", "markdown", "Text summary of event handling.", 0, 1, description);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 96891546: /*event*/ return this.event == null ? new Base[0] : new Base[] {this.event}; // CodeableConcept
        case 98629247: /*group*/ return this.group == null ? new Base[0] : new Base[] {this.group}; // CodeableConcept
        case 2072805: /*handling*/ return this.handling == null ? new Base[0] : new Base[] {this.handling}; // CodeableConcept
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 96891546: // event
          this.event = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 98629247: // group
          this.group = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 2072805: // handling
          this.handling = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("event")) {
          this.event = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("group")) {
          this.group = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("handling")) {
          this.handling = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 96891546:  return getEvent();
        case 98629247:  return getGroup();
        case 2072805:  return getHandling();
        case -1724546052:  return getDescriptionElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 96891546: /*event*/ return new String[] {"CodeableConcept"};
        case 98629247: /*group*/ return new String[] {"CodeableConcept"};
        case 2072805: /*handling*/ return new String[] {"CodeableConcept"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("event")) {
          this.event = new CodeableConcept();
          return this.event;
        }
        else if (name.equals("group")) {
          this.group = new CodeableConcept();
          return this.group;
        }
        else if (name.equals("handling")) {
          this.handling = new CodeableConcept();
          return this.handling;
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.objective.outcomeMeasure.eventHandling.description");
        }
        else
          return super.addChild(name);
      }

      public ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent copy() {
        ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent dst = new ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent dst) {
        super.copyValues(dst);
        dst.event = event == null ? null : event.copy();
        dst.group = group == null ? null : group.copy();
        dst.handling = handling == null ? null : handling.copy();
        dst.description = description == null ? null : description.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent))
          return false;
        ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent o = (ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent) other_;
        return compareDeep(event, o.event, true) && compareDeep(group, o.group, true) && compareDeep(handling, o.handling, true)
           && compareDeep(description, o.description, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent))
          return false;
        ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent o = (ResearchStudyObjectiveOutcomeMeasureEventHandlingComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(event, group, handling, description
          );
      }

  public String fhirType() {
    return "ResearchStudy.objective.outcomeMeasure.eventHandling";

  }

  }

    /**
     * Canonical identifier for this study resource, represented as a globally unique URI.
     */
    @Child(name = "url", type = {UriType.class}, order=0, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Canonical identifier for this study resource", formalDefinition="Canonical identifier for this study resource, represented as a globally unique URI." )
    protected UriType url;

    /**
     * Identifiers assigned to this research study by the sponsor or other systems.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Business Identifier for study", formalDefinition="Identifiers assigned to this research study by the sponsor or other systems." )
    protected List<Identifier> identifier;

    /**
     * The business version for the study record.
     */
    @Child(name = "version", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The business version for the study record", formalDefinition="The business version for the study record." )
    protected StringType version;

    /**
     * Name for this study (computer friendly).
     */
    @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Name for this study (computer friendly)", formalDefinition="Name for this study (computer friendly)." )
    protected StringType name;

    /**
     * The human readable name of the research study.
     */
    @Child(name = "title", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Human readable name of the study", formalDefinition="The human readable name of the research study." )
    protected StringType title;

    /**
     * Additional names for the study.
     */
    @Child(name = "label", type = {}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Additional names for the study", formalDefinition="Additional names for the study." )
    protected List<ResearchStudyLabelComponent> label;

    /**
     * The set of steps expected to be performed as part of the execution of the study.
     */
    @Child(name = "protocol", type = {PlanDefinition.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Steps followed in executing study", formalDefinition="The set of steps expected to be performed as part of the execution of the study." )
    protected List<Reference> protocol;

    /**
     * A larger research study of which this particular study is a component or step.
     */
    @Child(name = "partOf", type = {ResearchStudy.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Part of larger study", formalDefinition="A larger research study of which this particular study is a component or step." )
    protected List<Reference> partOf;

    /**
     * Display of the bibliographic citation of this ResearchStudy.
     */
    @Child(name = "citeAs", type = {MarkdownType.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="How to cite this ResearchStudy", formalDefinition="Display of the bibliographic citation of this ResearchStudy." )
    protected MarkdownType citeAs;

    /**
     * Relationships that this ResearchStudy has with other FHIR or non-FHIR resources that already exist.
     */
    @Child(name = "relatesTo", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Relationships to other Resources", formalDefinition="Relationships that this ResearchStudy has with other FHIR or non-FHIR resources that already exist." )
    protected List<ResearchStudyRelatesToComponent> relatesTo;

    /**
     * The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Date the resource last changed", formalDefinition="The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes." )
    protected DateTimeType date;

    /**
     * The publication state of the resource (not of the study).
     */
    @Child(name = "status", type = {CodeType.class}, order=11, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="draft | active | retired | unknown", formalDefinition="The publication state of the resource (not of the study)." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/publication-status")
    protected Enumeration<PublicationStatus> status;

    /**
     * The type of study based upon the intent of the study activities. A classification of the intent of the study.
     */
    @Child(name = "primaryPurposeType", type = {CodeableConcept.class}, order=12, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="treatment | prevention | diagnostic | supportive-care | screening | health-services-research | basic-science | device-feasibility", formalDefinition="The type of study based upon the intent of the study activities. A classification of the intent of the study." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/research-study-prim-purp-type")
    protected CodeableConcept primaryPurposeType;

    /**
     * The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.
     */
    @Child(name = "phase", type = {CodeableConcept.class}, order=13, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Classifier used for clinical trials", formalDefinition="The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/research-study-phase")
    protected CodeableConcept phase;

    /**
     * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
     */
    @Child(name = "studyDesign", type = {CodeableConcept.class}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Classifications of the study design characteristics", formalDefinition="Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/study-design")
    protected List<CodeableConcept> studyDesign;

    /**
     * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
     */
    @Child(name = "focus", type = {CodeableReference.class}, order=15, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Drugs, devices, etc. under study", formalDefinition="The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/research-study-focus-type")
    protected List<CodeableReference> focus;

    /**
     * The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
     */
    @Child(name = "condition", type = {CodeableConcept.class}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Condition being studied", formalDefinition="The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion \"healthy volunteer\", but the target condition code would be a Lupus SNOMED code." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/condition-code")
    protected List<CodeableConcept> condition;

    /**
     * Key terms to aid in searching for or filtering the study.
     */
    @Child(name = "keyword", type = {CodeableConcept.class}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Used to search for the study", formalDefinition="Key terms to aid in searching for or filtering the study." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/research-study-focus-type")
    protected List<CodeableConcept> keyword;

    /**
     * A country, state or other area where the study is taking place rather than its precise geographic location or address.
     */
    @Child(name = "region", type = {CodeableConcept.class}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Geographic area for the study", formalDefinition="A country, state or other area where the study is taking place rather than its precise geographic location or address." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/jurisdiction")
    protected List<CodeableConcept> region;

    /**
     * A brief text for explaining the study.
     */
    @Child(name = "descriptionSummary", type = {MarkdownType.class}, order=19, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Brief text explaining the study", formalDefinition="A brief text for explaining the study." )
    protected MarkdownType descriptionSummary;

    /**
     * A detailed and human-readable narrative of the study. E.g., study abstract.
     */
    @Child(name = "description", type = {MarkdownType.class}, order=20, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Detailed narrative of the study", formalDefinition="A detailed and human-readable narrative of the study. E.g., study abstract." )
    protected MarkdownType description;

    /**
     * Identifies the start date and the expected (or actual, depending on status) end date for the study.
     */
    @Child(name = "period", type = {Period.class}, order=21, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the study began and ended", formalDefinition="Identifies the start date and the expected (or actual, depending on status) end date for the study." )
    protected Period period;

    /**
     * A facility in which study activities are conducted.
     */
    @Child(name = "site", type = {Location.class, ResearchStudy.class, Organization.class}, order=22, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Facility where study activities are conducted", formalDefinition="A facility in which study activities are conducted." )
    protected List<Reference> site;

    /**
     * Comments made about the study by the performer, subject or other participants.
     */
    @Child(name = "note", type = {Annotation.class}, order=23, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Comments made about the study", formalDefinition="Comments made about the study by the performer, subject or other participants." )
    protected List<Annotation> note;

    /**
     * Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource.
     */
    @Child(name = "classifier", type = {CodeableConcept.class}, order=24, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Classification for the study", formalDefinition="Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/research-study-classifiers")
    protected List<CodeableConcept> classifier;

    /**
     * Sponsors, collaborators, and other parties.
     */
    @Child(name = "associatedParty", type = {}, order=25, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Sponsors, collaborators, and other parties", formalDefinition="Sponsors, collaborators, and other parties." )
    protected List<ResearchStudyAssociatedPartyComponent> associatedParty;

    /**
     * Status of study with time for that status.
     */
    @Child(name = "progressStatus", type = {}, order=26, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Status of study with time for that status", formalDefinition="Status of study with time for that status." )
    protected List<ResearchStudyProgressStatusComponent> progressStatus;

    /**
     * A description and/or code explaining the premature termination of the study.
     */
    @Child(name = "whyStopped", type = {CodeableConcept.class}, order=27, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="accrual-goal-met | closed-due-to-toxicity | closed-due-to-lack-of-study-progress | temporarily-closed-per-study-design", formalDefinition="A description and/or code explaining the premature termination of the study." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/research-study-reason-stopped")
    protected CodeableConcept whyStopped;

    /**
     * Target or actual group of participants enrolled in study.
     */
    @Child(name = "recruitment", type = {}, order=28, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Target or actual group of participants enrolled in study", formalDefinition="Target or actual group of participants enrolled in study." )
    protected ResearchStudyRecruitmentComponent recruitment;

    /**
     * Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40 degrees for 1 month}.
     */
    @Child(name = "comparisonGroup", type = {}, order=29, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Defined path through the study for a subject", formalDefinition="Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40 degrees for 1 month}." )
    protected List<ResearchStudyComparisonGroupComponent> comparisonGroup;

    /**
     * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
     */
    @Child(name = "objective", type = {}, order=30, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="A goal for the study", formalDefinition="A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study." )
    protected List<ResearchStudyObjectiveComponent> objective;

    /**
     * Link to one or more sets of results generated by the study. Could also link to a research registry holding the results such as ClinicalTrials.gov.
     */
    @Child(name = "result", type = {Composition.class, DiagnosticReport.class, Evidence.class}, order=31, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Link to results generated during the study", formalDefinition="Link to one or more sets of results generated by the study. Could also link to a research registry holding the results such as ClinicalTrials.gov." )
    protected List<Reference> result;

    private static final long serialVersionUID = 1555745719L;

  /**
   * Constructor
   */
    public ResearchStudy() {
      super();
    }

  /**
   * Constructor
   */
    public ResearchStudy(PublicationStatus status) {
      super();
      this.setStatus(status);
    }

    /**
     * @return {@link #url} (Canonical identifier for this study resource, represented as a globally unique URI.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.url");
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
     * @param value {@link #url} (Canonical identifier for this study resource, represented as a globally unique URI.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public ResearchStudy setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return Canonical identifier for this study resource, represented as a globally unique URI.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value Canonical identifier for this study resource, represented as a globally unique URI.
     */
    public ResearchStudy setUrl(String value) { 
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
     * @return {@link #identifier} (Identifiers assigned to this research study by the sponsor or other systems.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setIdentifier(List<Identifier> theIdentifier) { 
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

    public ResearchStudy addIdentifier(Identifier t) { //3
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
     * @return {@link #version} (The business version for the study record.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.version");
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
     * @param value {@link #version} (The business version for the study record.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public ResearchStudy setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The business version for the study record.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The business version for the study record.
     */
    public ResearchStudy setVersion(String value) { 
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
     * @return {@link #name} (Name for this study (computer friendly).). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.name");
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
     * @param value {@link #name} (Name for this study (computer friendly).). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public ResearchStudy setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return Name for this study (computer friendly).
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Name for this study (computer friendly).
     */
    public ResearchStudy setName(String value) { 
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
     * @return {@link #title} (The human readable name of the research study.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.title");
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
     * @param value {@link #title} (The human readable name of the research study.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public ResearchStudy setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return The human readable name of the research study.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value The human readable name of the research study.
     */
    public ResearchStudy setTitle(String value) { 
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
     * @return {@link #label} (Additional names for the study.)
     */
    public List<ResearchStudyLabelComponent> getLabel() { 
      if (this.label == null)
        this.label = new ArrayList<ResearchStudyLabelComponent>();
      return this.label;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setLabel(List<ResearchStudyLabelComponent> theLabel) { 
      this.label = theLabel;
      return this;
    }

    public boolean hasLabel() { 
      if (this.label == null)
        return false;
      for (ResearchStudyLabelComponent item : this.label)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ResearchStudyLabelComponent addLabel() { //3
      ResearchStudyLabelComponent t = new ResearchStudyLabelComponent();
      if (this.label == null)
        this.label = new ArrayList<ResearchStudyLabelComponent>();
      this.label.add(t);
      return t;
    }

    public ResearchStudy addLabel(ResearchStudyLabelComponent t) { //3
      if (t == null)
        return this;
      if (this.label == null)
        this.label = new ArrayList<ResearchStudyLabelComponent>();
      this.label.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #label}, creating it if it does not already exist {3}
     */
    public ResearchStudyLabelComponent getLabelFirstRep() { 
      if (getLabel().isEmpty()) {
        addLabel();
      }
      return getLabel().get(0);
    }

    /**
     * @return {@link #protocol} (The set of steps expected to be performed as part of the execution of the study.)
     */
    public List<Reference> getProtocol() { 
      if (this.protocol == null)
        this.protocol = new ArrayList<Reference>();
      return this.protocol;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setProtocol(List<Reference> theProtocol) { 
      this.protocol = theProtocol;
      return this;
    }

    public boolean hasProtocol() { 
      if (this.protocol == null)
        return false;
      for (Reference item : this.protocol)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addProtocol() { //3
      Reference t = new Reference();
      if (this.protocol == null)
        this.protocol = new ArrayList<Reference>();
      this.protocol.add(t);
      return t;
    }

    public ResearchStudy addProtocol(Reference t) { //3
      if (t == null)
        return this;
      if (this.protocol == null)
        this.protocol = new ArrayList<Reference>();
      this.protocol.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #protocol}, creating it if it does not already exist {3}
     */
    public Reference getProtocolFirstRep() { 
      if (getProtocol().isEmpty()) {
        addProtocol();
      }
      return getProtocol().get(0);
    }

    /**
     * @return {@link #partOf} (A larger research study of which this particular study is a component or step.)
     */
    public List<Reference> getPartOf() { 
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      return this.partOf;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setPartOf(List<Reference> thePartOf) { 
      this.partOf = thePartOf;
      return this;
    }

    public boolean hasPartOf() { 
      if (this.partOf == null)
        return false;
      for (Reference item : this.partOf)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPartOf() { //3
      Reference t = new Reference();
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return t;
    }

    public ResearchStudy addPartOf(Reference t) { //3
      if (t == null)
        return this;
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #partOf}, creating it if it does not already exist {3}
     */
    public Reference getPartOfFirstRep() { 
      if (getPartOf().isEmpty()) {
        addPartOf();
      }
      return getPartOf().get(0);
    }

    /**
     * @return {@link #citeAs} (Display of the bibliographic citation of this ResearchStudy.). This is the underlying object with id, value and extensions. The accessor "getCiteAs" gives direct access to the value
     */
    public MarkdownType getCiteAsElement() { 
      if (this.citeAs == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.citeAs");
        else if (Configuration.doAutoCreate())
          this.citeAs = new MarkdownType(); // bb
      return this.citeAs;
    }

    public boolean hasCiteAsElement() { 
      return this.citeAs != null && !this.citeAs.isEmpty();
    }

    public boolean hasCiteAs() { 
      return this.citeAs != null && !this.citeAs.isEmpty();
    }

    /**
     * @param value {@link #citeAs} (Display of the bibliographic citation of this ResearchStudy.). This is the underlying object with id, value and extensions. The accessor "getCiteAs" gives direct access to the value
     */
    public ResearchStudy setCiteAsElement(MarkdownType value) { 
      this.citeAs = value;
      return this;
    }

    /**
     * @return Display of the bibliographic citation of this ResearchStudy.
     */
    public String getCiteAs() { 
      return this.citeAs == null ? null : this.citeAs.getValue();
    }

    /**
     * @param value Display of the bibliographic citation of this ResearchStudy.
     */
    public ResearchStudy setCiteAs(String value) { 
      if (Utilities.noString(value))
        this.citeAs = null;
      else {
        if (this.citeAs == null)
          this.citeAs = new MarkdownType();
        this.citeAs.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this ResearchStudy has with other FHIR or non-FHIR resources that already exist.)
     */
    public List<ResearchStudyRelatesToComponent> getRelatesTo() { 
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<ResearchStudyRelatesToComponent>();
      return this.relatesTo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setRelatesTo(List<ResearchStudyRelatesToComponent> theRelatesTo) { 
      this.relatesTo = theRelatesTo;
      return this;
    }

    public boolean hasRelatesTo() { 
      if (this.relatesTo == null)
        return false;
      for (ResearchStudyRelatesToComponent item : this.relatesTo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ResearchStudyRelatesToComponent addRelatesTo() { //3
      ResearchStudyRelatesToComponent t = new ResearchStudyRelatesToComponent();
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<ResearchStudyRelatesToComponent>();
      this.relatesTo.add(t);
      return t;
    }

    public ResearchStudy addRelatesTo(ResearchStudyRelatesToComponent t) { //3
      if (t == null)
        return this;
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<ResearchStudyRelatesToComponent>();
      this.relatesTo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatesTo}, creating it if it does not already exist {3}
     */
    public ResearchStudyRelatesToComponent getRelatesToFirstRep() { 
      if (getRelatesTo().isEmpty()) {
        addRelatesTo();
      }
      return getRelatesTo().get(0);
    }

    /**
     * @return {@link #date} (The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.date");
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
     * @param value {@link #date} (The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ResearchStudy setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.
     */
    public ResearchStudy setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The publication state of the resource (not of the study).). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The publication state of the resource (not of the study).). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ResearchStudy setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The publication state of the resource (not of the study).
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The publication state of the resource (not of the study).
     */
    public ResearchStudy setStatus(PublicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #primaryPurposeType} (The type of study based upon the intent of the study activities. A classification of the intent of the study.)
     */
    public CodeableConcept getPrimaryPurposeType() { 
      if (this.primaryPurposeType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.primaryPurposeType");
        else if (Configuration.doAutoCreate())
          this.primaryPurposeType = new CodeableConcept(); // cc
      return this.primaryPurposeType;
    }

    public boolean hasPrimaryPurposeType() { 
      return this.primaryPurposeType != null && !this.primaryPurposeType.isEmpty();
    }

    /**
     * @param value {@link #primaryPurposeType} (The type of study based upon the intent of the study activities. A classification of the intent of the study.)
     */
    public ResearchStudy setPrimaryPurposeType(CodeableConcept value) { 
      this.primaryPurposeType = value;
      return this;
    }

    /**
     * @return {@link #phase} (The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.)
     */
    public CodeableConcept getPhase() { 
      if (this.phase == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.phase");
        else if (Configuration.doAutoCreate())
          this.phase = new CodeableConcept(); // cc
      return this.phase;
    }

    public boolean hasPhase() { 
      return this.phase != null && !this.phase.isEmpty();
    }

    /**
     * @param value {@link #phase} (The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.)
     */
    public ResearchStudy setPhase(CodeableConcept value) { 
      this.phase = value;
      return this;
    }

    /**
     * @return {@link #studyDesign} (Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.)
     */
    public List<CodeableConcept> getStudyDesign() { 
      if (this.studyDesign == null)
        this.studyDesign = new ArrayList<CodeableConcept>();
      return this.studyDesign;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setStudyDesign(List<CodeableConcept> theStudyDesign) { 
      this.studyDesign = theStudyDesign;
      return this;
    }

    public boolean hasStudyDesign() { 
      if (this.studyDesign == null)
        return false;
      for (CodeableConcept item : this.studyDesign)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addStudyDesign() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.studyDesign == null)
        this.studyDesign = new ArrayList<CodeableConcept>();
      this.studyDesign.add(t);
      return t;
    }

    public ResearchStudy addStudyDesign(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.studyDesign == null)
        this.studyDesign = new ArrayList<CodeableConcept>();
      this.studyDesign.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #studyDesign}, creating it if it does not already exist {3}
     */
    public CodeableConcept getStudyDesignFirstRep() { 
      if (getStudyDesign().isEmpty()) {
        addStudyDesign();
      }
      return getStudyDesign().get(0);
    }

    /**
     * @return {@link #focus} (The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.)
     */
    public List<CodeableReference> getFocus() { 
      if (this.focus == null)
        this.focus = new ArrayList<CodeableReference>();
      return this.focus;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setFocus(List<CodeableReference> theFocus) { 
      this.focus = theFocus;
      return this;
    }

    public boolean hasFocus() { 
      if (this.focus == null)
        return false;
      for (CodeableReference item : this.focus)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableReference addFocus() { //3
      CodeableReference t = new CodeableReference();
      if (this.focus == null)
        this.focus = new ArrayList<CodeableReference>();
      this.focus.add(t);
      return t;
    }

    public ResearchStudy addFocus(CodeableReference t) { //3
      if (t == null)
        return this;
      if (this.focus == null)
        this.focus = new ArrayList<CodeableReference>();
      this.focus.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #focus}, creating it if it does not already exist {3}
     */
    public CodeableReference getFocusFirstRep() { 
      if (getFocus().isEmpty()) {
        addFocus();
      }
      return getFocus().get(0);
    }

    /**
     * @return {@link #condition} (The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.)
     */
    public List<CodeableConcept> getCondition() { 
      if (this.condition == null)
        this.condition = new ArrayList<CodeableConcept>();
      return this.condition;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setCondition(List<CodeableConcept> theCondition) { 
      this.condition = theCondition;
      return this;
    }

    public boolean hasCondition() { 
      if (this.condition == null)
        return false;
      for (CodeableConcept item : this.condition)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addCondition() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.condition == null)
        this.condition = new ArrayList<CodeableConcept>();
      this.condition.add(t);
      return t;
    }

    public ResearchStudy addCondition(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.condition == null)
        this.condition = new ArrayList<CodeableConcept>();
      this.condition.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #condition}, creating it if it does not already exist {3}
     */
    public CodeableConcept getConditionFirstRep() { 
      if (getCondition().isEmpty()) {
        addCondition();
      }
      return getCondition().get(0);
    }

    /**
     * @return {@link #keyword} (Key terms to aid in searching for or filtering the study.)
     */
    public List<CodeableConcept> getKeyword() { 
      if (this.keyword == null)
        this.keyword = new ArrayList<CodeableConcept>();
      return this.keyword;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setKeyword(List<CodeableConcept> theKeyword) { 
      this.keyword = theKeyword;
      return this;
    }

    public boolean hasKeyword() { 
      if (this.keyword == null)
        return false;
      for (CodeableConcept item : this.keyword)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addKeyword() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.keyword == null)
        this.keyword = new ArrayList<CodeableConcept>();
      this.keyword.add(t);
      return t;
    }

    public ResearchStudy addKeyword(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.keyword == null)
        this.keyword = new ArrayList<CodeableConcept>();
      this.keyword.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #keyword}, creating it if it does not already exist {3}
     */
    public CodeableConcept getKeywordFirstRep() { 
      if (getKeyword().isEmpty()) {
        addKeyword();
      }
      return getKeyword().get(0);
    }

    /**
     * @return {@link #region} (A country, state or other area where the study is taking place rather than its precise geographic location or address.)
     */
    public List<CodeableConcept> getRegion() { 
      if (this.region == null)
        this.region = new ArrayList<CodeableConcept>();
      return this.region;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setRegion(List<CodeableConcept> theRegion) { 
      this.region = theRegion;
      return this;
    }

    public boolean hasRegion() { 
      if (this.region == null)
        return false;
      for (CodeableConcept item : this.region)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addRegion() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.region == null)
        this.region = new ArrayList<CodeableConcept>();
      this.region.add(t);
      return t;
    }

    public ResearchStudy addRegion(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.region == null)
        this.region = new ArrayList<CodeableConcept>();
      this.region.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #region}, creating it if it does not already exist {3}
     */
    public CodeableConcept getRegionFirstRep() { 
      if (getRegion().isEmpty()) {
        addRegion();
      }
      return getRegion().get(0);
    }

    /**
     * @return {@link #descriptionSummary} (A brief text for explaining the study.). This is the underlying object with id, value and extensions. The accessor "getDescriptionSummary" gives direct access to the value
     */
    public MarkdownType getDescriptionSummaryElement() { 
      if (this.descriptionSummary == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.descriptionSummary");
        else if (Configuration.doAutoCreate())
          this.descriptionSummary = new MarkdownType(); // bb
      return this.descriptionSummary;
    }

    public boolean hasDescriptionSummaryElement() { 
      return this.descriptionSummary != null && !this.descriptionSummary.isEmpty();
    }

    public boolean hasDescriptionSummary() { 
      return this.descriptionSummary != null && !this.descriptionSummary.isEmpty();
    }

    /**
     * @param value {@link #descriptionSummary} (A brief text for explaining the study.). This is the underlying object with id, value and extensions. The accessor "getDescriptionSummary" gives direct access to the value
     */
    public ResearchStudy setDescriptionSummaryElement(MarkdownType value) { 
      this.descriptionSummary = value;
      return this;
    }

    /**
     * @return A brief text for explaining the study.
     */
    public String getDescriptionSummary() { 
      return this.descriptionSummary == null ? null : this.descriptionSummary.getValue();
    }

    /**
     * @param value A brief text for explaining the study.
     */
    public ResearchStudy setDescriptionSummary(String value) { 
      if (Utilities.noString(value))
        this.descriptionSummary = null;
      else {
        if (this.descriptionSummary == null)
          this.descriptionSummary = new MarkdownType();
        this.descriptionSummary.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #description} (A detailed and human-readable narrative of the study. E.g., study abstract.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MarkdownType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.description");
        else if (Configuration.doAutoCreate())
          this.description = new MarkdownType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A detailed and human-readable narrative of the study. E.g., study abstract.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public ResearchStudy setDescriptionElement(MarkdownType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A detailed and human-readable narrative of the study. E.g., study abstract.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A detailed and human-readable narrative of the study. E.g., study abstract.
     */
    public ResearchStudy setDescription(String value) { 
      if (Utilities.noString(value))
        this.description = null;
      else {
        if (this.description == null)
          this.description = new MarkdownType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #period} (Identifies the start date and the expected (or actual, depending on status) end date for the study.)
     */
    public Period getPeriod() { 
      if (this.period == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.period");
        else if (Configuration.doAutoCreate())
          this.period = new Period(); // cc
      return this.period;
    }

    public boolean hasPeriod() { 
      return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Identifies the start date and the expected (or actual, depending on status) end date for the study.)
     */
    public ResearchStudy setPeriod(Period value) { 
      this.period = value;
      return this;
    }

    /**
     * @return {@link #site} (A facility in which study activities are conducted.)
     */
    public List<Reference> getSite() { 
      if (this.site == null)
        this.site = new ArrayList<Reference>();
      return this.site;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setSite(List<Reference> theSite) { 
      this.site = theSite;
      return this;
    }

    public boolean hasSite() { 
      if (this.site == null)
        return false;
      for (Reference item : this.site)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addSite() { //3
      Reference t = new Reference();
      if (this.site == null)
        this.site = new ArrayList<Reference>();
      this.site.add(t);
      return t;
    }

    public ResearchStudy addSite(Reference t) { //3
      if (t == null)
        return this;
      if (this.site == null)
        this.site = new ArrayList<Reference>();
      this.site.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #site}, creating it if it does not already exist {3}
     */
    public Reference getSiteFirstRep() { 
      if (getSite().isEmpty()) {
        addSite();
      }
      return getSite().get(0);
    }

    /**
     * @return {@link #note} (Comments made about the study by the performer, subject or other participants.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setNote(List<Annotation> theNote) { 
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

    public ResearchStudy addNote(Annotation t) { //3
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
     * @return {@link #classifier} (Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource.)
     */
    public List<CodeableConcept> getClassifier() { 
      if (this.classifier == null)
        this.classifier = new ArrayList<CodeableConcept>();
      return this.classifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setClassifier(List<CodeableConcept> theClassifier) { 
      this.classifier = theClassifier;
      return this;
    }

    public boolean hasClassifier() { 
      if (this.classifier == null)
        return false;
      for (CodeableConcept item : this.classifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addClassifier() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.classifier == null)
        this.classifier = new ArrayList<CodeableConcept>();
      this.classifier.add(t);
      return t;
    }

    public ResearchStudy addClassifier(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.classifier == null)
        this.classifier = new ArrayList<CodeableConcept>();
      this.classifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #classifier}, creating it if it does not already exist {3}
     */
    public CodeableConcept getClassifierFirstRep() { 
      if (getClassifier().isEmpty()) {
        addClassifier();
      }
      return getClassifier().get(0);
    }

    /**
     * @return {@link #associatedParty} (Sponsors, collaborators, and other parties.)
     */
    public List<ResearchStudyAssociatedPartyComponent> getAssociatedParty() { 
      if (this.associatedParty == null)
        this.associatedParty = new ArrayList<ResearchStudyAssociatedPartyComponent>();
      return this.associatedParty;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setAssociatedParty(List<ResearchStudyAssociatedPartyComponent> theAssociatedParty) { 
      this.associatedParty = theAssociatedParty;
      return this;
    }

    public boolean hasAssociatedParty() { 
      if (this.associatedParty == null)
        return false;
      for (ResearchStudyAssociatedPartyComponent item : this.associatedParty)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ResearchStudyAssociatedPartyComponent addAssociatedParty() { //3
      ResearchStudyAssociatedPartyComponent t = new ResearchStudyAssociatedPartyComponent();
      if (this.associatedParty == null)
        this.associatedParty = new ArrayList<ResearchStudyAssociatedPartyComponent>();
      this.associatedParty.add(t);
      return t;
    }

    public ResearchStudy addAssociatedParty(ResearchStudyAssociatedPartyComponent t) { //3
      if (t == null)
        return this;
      if (this.associatedParty == null)
        this.associatedParty = new ArrayList<ResearchStudyAssociatedPartyComponent>();
      this.associatedParty.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #associatedParty}, creating it if it does not already exist {3}
     */
    public ResearchStudyAssociatedPartyComponent getAssociatedPartyFirstRep() { 
      if (getAssociatedParty().isEmpty()) {
        addAssociatedParty();
      }
      return getAssociatedParty().get(0);
    }

    /**
     * @return {@link #progressStatus} (Status of study with time for that status.)
     */
    public List<ResearchStudyProgressStatusComponent> getProgressStatus() { 
      if (this.progressStatus == null)
        this.progressStatus = new ArrayList<ResearchStudyProgressStatusComponent>();
      return this.progressStatus;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setProgressStatus(List<ResearchStudyProgressStatusComponent> theProgressStatus) { 
      this.progressStatus = theProgressStatus;
      return this;
    }

    public boolean hasProgressStatus() { 
      if (this.progressStatus == null)
        return false;
      for (ResearchStudyProgressStatusComponent item : this.progressStatus)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ResearchStudyProgressStatusComponent addProgressStatus() { //3
      ResearchStudyProgressStatusComponent t = new ResearchStudyProgressStatusComponent();
      if (this.progressStatus == null)
        this.progressStatus = new ArrayList<ResearchStudyProgressStatusComponent>();
      this.progressStatus.add(t);
      return t;
    }

    public ResearchStudy addProgressStatus(ResearchStudyProgressStatusComponent t) { //3
      if (t == null)
        return this;
      if (this.progressStatus == null)
        this.progressStatus = new ArrayList<ResearchStudyProgressStatusComponent>();
      this.progressStatus.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #progressStatus}, creating it if it does not already exist {3}
     */
    public ResearchStudyProgressStatusComponent getProgressStatusFirstRep() { 
      if (getProgressStatus().isEmpty()) {
        addProgressStatus();
      }
      return getProgressStatus().get(0);
    }

    /**
     * @return {@link #whyStopped} (A description and/or code explaining the premature termination of the study.)
     */
    public CodeableConcept getWhyStopped() { 
      if (this.whyStopped == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.whyStopped");
        else if (Configuration.doAutoCreate())
          this.whyStopped = new CodeableConcept(); // cc
      return this.whyStopped;
    }

    public boolean hasWhyStopped() { 
      return this.whyStopped != null && !this.whyStopped.isEmpty();
    }

    /**
     * @param value {@link #whyStopped} (A description and/or code explaining the premature termination of the study.)
     */
    public ResearchStudy setWhyStopped(CodeableConcept value) { 
      this.whyStopped = value;
      return this;
    }

    /**
     * @return {@link #recruitment} (Target or actual group of participants enrolled in study.)
     */
    public ResearchStudyRecruitmentComponent getRecruitment() { 
      if (this.recruitment == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ResearchStudy.recruitment");
        else if (Configuration.doAutoCreate())
          this.recruitment = new ResearchStudyRecruitmentComponent(); // cc
      return this.recruitment;
    }

    public boolean hasRecruitment() { 
      return this.recruitment != null && !this.recruitment.isEmpty();
    }

    /**
     * @param value {@link #recruitment} (Target or actual group of participants enrolled in study.)
     */
    public ResearchStudy setRecruitment(ResearchStudyRecruitmentComponent value) { 
      this.recruitment = value;
      return this;
    }

    /**
     * @return {@link #comparisonGroup} (Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40 degrees for 1 month}.)
     */
    public List<ResearchStudyComparisonGroupComponent> getComparisonGroup() { 
      if (this.comparisonGroup == null)
        this.comparisonGroup = new ArrayList<ResearchStudyComparisonGroupComponent>();
      return this.comparisonGroup;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setComparisonGroup(List<ResearchStudyComparisonGroupComponent> theComparisonGroup) { 
      this.comparisonGroup = theComparisonGroup;
      return this;
    }

    public boolean hasComparisonGroup() { 
      if (this.comparisonGroup == null)
        return false;
      for (ResearchStudyComparisonGroupComponent item : this.comparisonGroup)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ResearchStudyComparisonGroupComponent addComparisonGroup() { //3
      ResearchStudyComparisonGroupComponent t = new ResearchStudyComparisonGroupComponent();
      if (this.comparisonGroup == null)
        this.comparisonGroup = new ArrayList<ResearchStudyComparisonGroupComponent>();
      this.comparisonGroup.add(t);
      return t;
    }

    public ResearchStudy addComparisonGroup(ResearchStudyComparisonGroupComponent t) { //3
      if (t == null)
        return this;
      if (this.comparisonGroup == null)
        this.comparisonGroup = new ArrayList<ResearchStudyComparisonGroupComponent>();
      this.comparisonGroup.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #comparisonGroup}, creating it if it does not already exist {3}
     */
    public ResearchStudyComparisonGroupComponent getComparisonGroupFirstRep() { 
      if (getComparisonGroup().isEmpty()) {
        addComparisonGroup();
      }
      return getComparisonGroup().get(0);
    }

    /**
     * @return {@link #objective} (A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.)
     */
    public List<ResearchStudyObjectiveComponent> getObjective() { 
      if (this.objective == null)
        this.objective = new ArrayList<ResearchStudyObjectiveComponent>();
      return this.objective;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setObjective(List<ResearchStudyObjectiveComponent> theObjective) { 
      this.objective = theObjective;
      return this;
    }

    public boolean hasObjective() { 
      if (this.objective == null)
        return false;
      for (ResearchStudyObjectiveComponent item : this.objective)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ResearchStudyObjectiveComponent addObjective() { //3
      ResearchStudyObjectiveComponent t = new ResearchStudyObjectiveComponent();
      if (this.objective == null)
        this.objective = new ArrayList<ResearchStudyObjectiveComponent>();
      this.objective.add(t);
      return t;
    }

    public ResearchStudy addObjective(ResearchStudyObjectiveComponent t) { //3
      if (t == null)
        return this;
      if (this.objective == null)
        this.objective = new ArrayList<ResearchStudyObjectiveComponent>();
      this.objective.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #objective}, creating it if it does not already exist {3}
     */
    public ResearchStudyObjectiveComponent getObjectiveFirstRep() { 
      if (getObjective().isEmpty()) {
        addObjective();
      }
      return getObjective().get(0);
    }

    /**
     * @return {@link #result} (Link to one or more sets of results generated by the study. Could also link to a research registry holding the results such as ClinicalTrials.gov.)
     */
    public List<Reference> getResult() { 
      if (this.result == null)
        this.result = new ArrayList<Reference>();
      return this.result;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ResearchStudy setResult(List<Reference> theResult) { 
      this.result = theResult;
      return this;
    }

    public boolean hasResult() { 
      if (this.result == null)
        return false;
      for (Reference item : this.result)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addResult() { //3
      Reference t = new Reference();
      if (this.result == null)
        this.result = new ArrayList<Reference>();
      this.result.add(t);
      return t;
    }

    public ResearchStudy addResult(Reference t) { //3
      if (t == null)
        return this;
      if (this.result == null)
        this.result = new ArrayList<Reference>();
      this.result.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #result}, creating it if it does not already exist {3}
     */
    public Reference getResultFirstRep() { 
      if (getResult().isEmpty()) {
        addResult();
      }
      return getResult().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "Canonical identifier for this study resource, represented as a globally unique URI.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "Identifiers assigned to this research study by the sponsor or other systems.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "The business version for the study record.", 0, 1, version));
        children.add(new Property("name", "string", "Name for this study (computer friendly).", 0, 1, name));
        children.add(new Property("title", "string", "The human readable name of the research study.", 0, 1, title));
        children.add(new Property("label", "", "Additional names for the study.", 0, java.lang.Integer.MAX_VALUE, label));
        children.add(new Property("protocol", "Reference(PlanDefinition)", "The set of steps expected to be performed as part of the execution of the study.", 0, java.lang.Integer.MAX_VALUE, protocol));
        children.add(new Property("partOf", "Reference(ResearchStudy)", "A larger research study of which this particular study is a component or step.", 0, java.lang.Integer.MAX_VALUE, partOf));
        children.add(new Property("citeAs", "markdown", "Display of the bibliographic citation of this ResearchStudy.", 0, 1, citeAs));
        children.add(new Property("relatesTo", "", "Relationships that this ResearchStudy has with other FHIR or non-FHIR resources that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo));
        children.add(new Property("date", "dateTime", "The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.", 0, 1, date));
        children.add(new Property("status", "code", "The publication state of the resource (not of the study).", 0, 1, status));
        children.add(new Property("primaryPurposeType", "CodeableConcept", "The type of study based upon the intent of the study activities. A classification of the intent of the study.", 0, 1, primaryPurposeType));
        children.add(new Property("phase", "CodeableConcept", "The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.", 0, 1, phase));
        children.add(new Property("studyDesign", "CodeableConcept", "Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.", 0, java.lang.Integer.MAX_VALUE, studyDesign));
        children.add(new Property("focus", "CodeableReference(Medication|MedicinalProductDefinition|SubstanceDefinition|DeviceDefinition|PlanDefinition)", "The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.", 0, java.lang.Integer.MAX_VALUE, focus));
        children.add(new Property("condition", "CodeableConcept", "The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion \"healthy volunteer\", but the target condition code would be a Lupus SNOMED code.", 0, java.lang.Integer.MAX_VALUE, condition));
        children.add(new Property("keyword", "CodeableConcept", "Key terms to aid in searching for or filtering the study.", 0, java.lang.Integer.MAX_VALUE, keyword));
        children.add(new Property("region", "CodeableConcept", "A country, state or other area where the study is taking place rather than its precise geographic location or address.", 0, java.lang.Integer.MAX_VALUE, region));
        children.add(new Property("descriptionSummary", "markdown", "A brief text for explaining the study.", 0, 1, descriptionSummary));
        children.add(new Property("description", "markdown", "A detailed and human-readable narrative of the study. E.g., study abstract.", 0, 1, description));
        children.add(new Property("period", "Period", "Identifies the start date and the expected (or actual, depending on status) end date for the study.", 0, 1, period));
        children.add(new Property("site", "Reference(Location|ResearchStudy|Organization)", "A facility in which study activities are conducted.", 0, java.lang.Integer.MAX_VALUE, site));
        children.add(new Property("note", "Annotation", "Comments made about the study by the performer, subject or other participants.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("classifier", "CodeableConcept", "Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource.", 0, java.lang.Integer.MAX_VALUE, classifier));
        children.add(new Property("associatedParty", "", "Sponsors, collaborators, and other parties.", 0, java.lang.Integer.MAX_VALUE, associatedParty));
        children.add(new Property("progressStatus", "", "Status of study with time for that status.", 0, java.lang.Integer.MAX_VALUE, progressStatus));
        children.add(new Property("whyStopped", "CodeableConcept", "A description and/or code explaining the premature termination of the study.", 0, 1, whyStopped));
        children.add(new Property("recruitment", "", "Target or actual group of participants enrolled in study.", 0, 1, recruitment));
        children.add(new Property("comparisonGroup", "", "Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40 degrees for 1 month}.", 0, java.lang.Integer.MAX_VALUE, comparisonGroup));
        children.add(new Property("objective", "", "A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.", 0, java.lang.Integer.MAX_VALUE, objective));
        children.add(new Property("result", "Reference(Composition|DiagnosticReport|Evidence)", "Link to one or more sets of results generated by the study. Could also link to a research registry holding the results such as ClinicalTrials.gov.", 0, java.lang.Integer.MAX_VALUE, result));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "Canonical identifier for this study resource, represented as a globally unique URI.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Identifiers assigned to this research study by the sponsor or other systems.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "The business version for the study record.", 0, 1, version);
        case 3373707: /*name*/  return new Property("name", "string", "Name for this study (computer friendly).", 0, 1, name);
        case 110371416: /*title*/  return new Property("title", "string", "The human readable name of the research study.", 0, 1, title);
        case 102727412: /*label*/  return new Property("label", "", "Additional names for the study.", 0, java.lang.Integer.MAX_VALUE, label);
        case -989163880: /*protocol*/  return new Property("protocol", "Reference(PlanDefinition)", "The set of steps expected to be performed as part of the execution of the study.", 0, java.lang.Integer.MAX_VALUE, protocol);
        case -995410646: /*partOf*/  return new Property("partOf", "Reference(ResearchStudy)", "A larger research study of which this particular study is a component or step.", 0, java.lang.Integer.MAX_VALUE, partOf);
        case -1360156695: /*citeAs*/  return new Property("citeAs", "markdown", "Display of the bibliographic citation of this ResearchStudy.", 0, 1, citeAs);
        case -7765931: /*relatesTo*/  return new Property("relatesTo", "", "Relationships that this ResearchStudy has with other FHIR or non-FHIR resources that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.", 0, 1, date);
        case -892481550: /*status*/  return new Property("status", "code", "The publication state of the resource (not of the study).", 0, 1, status);
        case -2132842986: /*primaryPurposeType*/  return new Property("primaryPurposeType", "CodeableConcept", "The type of study based upon the intent of the study activities. A classification of the intent of the study.", 0, 1, primaryPurposeType);
        case 106629499: /*phase*/  return new Property("phase", "CodeableConcept", "The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.", 0, 1, phase);
        case 1709211879: /*studyDesign*/  return new Property("studyDesign", "CodeableConcept", "Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.", 0, java.lang.Integer.MAX_VALUE, studyDesign);
        case 97604824: /*focus*/  return new Property("focus", "CodeableReference(Medication|MedicinalProductDefinition|SubstanceDefinition|DeviceDefinition|PlanDefinition)", "The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.", 0, java.lang.Integer.MAX_VALUE, focus);
        case -861311717: /*condition*/  return new Property("condition", "CodeableConcept", "The condition that is the focus of the study. For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion \"healthy volunteer\", but the target condition code would be a Lupus SNOMED code.", 0, java.lang.Integer.MAX_VALUE, condition);
        case -814408215: /*keyword*/  return new Property("keyword", "CodeableConcept", "Key terms to aid in searching for or filtering the study.", 0, java.lang.Integer.MAX_VALUE, keyword);
        case -934795532: /*region*/  return new Property("region", "CodeableConcept", "A country, state or other area where the study is taking place rather than its precise geographic location or address.", 0, java.lang.Integer.MAX_VALUE, region);
        case 21530634: /*descriptionSummary*/  return new Property("descriptionSummary", "markdown", "A brief text for explaining the study.", 0, 1, descriptionSummary);
        case -1724546052: /*description*/  return new Property("description", "markdown", "A detailed and human-readable narrative of the study. E.g., study abstract.", 0, 1, description);
        case -991726143: /*period*/  return new Property("period", "Period", "Identifies the start date and the expected (or actual, depending on status) end date for the study.", 0, 1, period);
        case 3530567: /*site*/  return new Property("site", "Reference(Location|ResearchStudy|Organization)", "A facility in which study activities are conducted.", 0, java.lang.Integer.MAX_VALUE, site);
        case 3387378: /*note*/  return new Property("note", "Annotation", "Comments made about the study by the performer, subject or other participants.", 0, java.lang.Integer.MAX_VALUE, note);
        case -281470431: /*classifier*/  return new Property("classifier", "CodeableConcept", "Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource.", 0, java.lang.Integer.MAX_VALUE, classifier);
        case -1841460864: /*associatedParty*/  return new Property("associatedParty", "", "Sponsors, collaborators, and other parties.", 0, java.lang.Integer.MAX_VALUE, associatedParty);
        case -1897502593: /*progressStatus*/  return new Property("progressStatus", "", "Status of study with time for that status.", 0, java.lang.Integer.MAX_VALUE, progressStatus);
        case -699986715: /*whyStopped*/  return new Property("whyStopped", "CodeableConcept", "A description and/or code explaining the premature termination of the study.", 0, 1, whyStopped);
        case 780783004: /*recruitment*/  return new Property("recruitment", "", "Target or actual group of participants enrolled in study.", 0, 1, recruitment);
        case -138266634: /*comparisonGroup*/  return new Property("comparisonGroup", "", "Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40 degrees for 1 month}.", 0, java.lang.Integer.MAX_VALUE, comparisonGroup);
        case -1489585863: /*objective*/  return new Property("objective", "", "A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.", 0, java.lang.Integer.MAX_VALUE, objective);
        case -934426595: /*result*/  return new Property("result", "Reference(Composition|DiagnosticReport|Evidence)", "Link to one or more sets of results generated by the study. Could also link to a research registry holding the results such as ClinicalTrials.gov.", 0, java.lang.Integer.MAX_VALUE, result);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case 102727412: /*label*/ return this.label == null ? new Base[0] : this.label.toArray(new Base[this.label.size()]); // ResearchStudyLabelComponent
        case -989163880: /*protocol*/ return this.protocol == null ? new Base[0] : this.protocol.toArray(new Base[this.protocol.size()]); // Reference
        case -995410646: /*partOf*/ return this.partOf == null ? new Base[0] : this.partOf.toArray(new Base[this.partOf.size()]); // Reference
        case -1360156695: /*citeAs*/ return this.citeAs == null ? new Base[0] : new Base[] {this.citeAs}; // MarkdownType
        case -7765931: /*relatesTo*/ return this.relatesTo == null ? new Base[0] : this.relatesTo.toArray(new Base[this.relatesTo.size()]); // ResearchStudyRelatesToComponent
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case -2132842986: /*primaryPurposeType*/ return this.primaryPurposeType == null ? new Base[0] : new Base[] {this.primaryPurposeType}; // CodeableConcept
        case 106629499: /*phase*/ return this.phase == null ? new Base[0] : new Base[] {this.phase}; // CodeableConcept
        case 1709211879: /*studyDesign*/ return this.studyDesign == null ? new Base[0] : this.studyDesign.toArray(new Base[this.studyDesign.size()]); // CodeableConcept
        case 97604824: /*focus*/ return this.focus == null ? new Base[0] : this.focus.toArray(new Base[this.focus.size()]); // CodeableReference
        case -861311717: /*condition*/ return this.condition == null ? new Base[0] : this.condition.toArray(new Base[this.condition.size()]); // CodeableConcept
        case -814408215: /*keyword*/ return this.keyword == null ? new Base[0] : this.keyword.toArray(new Base[this.keyword.size()]); // CodeableConcept
        case -934795532: /*region*/ return this.region == null ? new Base[0] : this.region.toArray(new Base[this.region.size()]); // CodeableConcept
        case 21530634: /*descriptionSummary*/ return this.descriptionSummary == null ? new Base[0] : new Base[] {this.descriptionSummary}; // MarkdownType
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case 3530567: /*site*/ return this.site == null ? new Base[0] : this.site.toArray(new Base[this.site.size()]); // Reference
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -281470431: /*classifier*/ return this.classifier == null ? new Base[0] : this.classifier.toArray(new Base[this.classifier.size()]); // CodeableConcept
        case -1841460864: /*associatedParty*/ return this.associatedParty == null ? new Base[0] : this.associatedParty.toArray(new Base[this.associatedParty.size()]); // ResearchStudyAssociatedPartyComponent
        case -1897502593: /*progressStatus*/ return this.progressStatus == null ? new Base[0] : this.progressStatus.toArray(new Base[this.progressStatus.size()]); // ResearchStudyProgressStatusComponent
        case -699986715: /*whyStopped*/ return this.whyStopped == null ? new Base[0] : new Base[] {this.whyStopped}; // CodeableConcept
        case 780783004: /*recruitment*/ return this.recruitment == null ? new Base[0] : new Base[] {this.recruitment}; // ResearchStudyRecruitmentComponent
        case -138266634: /*comparisonGroup*/ return this.comparisonGroup == null ? new Base[0] : this.comparisonGroup.toArray(new Base[this.comparisonGroup.size()]); // ResearchStudyComparisonGroupComponent
        case -1489585863: /*objective*/ return this.objective == null ? new Base[0] : this.objective.toArray(new Base[this.objective.size()]); // ResearchStudyObjectiveComponent
        case -934426595: /*result*/ return this.result == null ? new Base[0] : this.result.toArray(new Base[this.result.size()]); // Reference
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
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case 102727412: // label
          this.getLabel().add((ResearchStudyLabelComponent) value); // ResearchStudyLabelComponent
          return value;
        case -989163880: // protocol
          this.getProtocol().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -995410646: // partOf
          this.getPartOf().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -1360156695: // citeAs
          this.citeAs = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -7765931: // relatesTo
          this.getRelatesTo().add((ResearchStudyRelatesToComponent) value); // ResearchStudyRelatesToComponent
          return value;
        case 3076014: // date
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case -2132842986: // primaryPurposeType
          this.primaryPurposeType = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 106629499: // phase
          this.phase = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1709211879: // studyDesign
          this.getStudyDesign().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 97604824: // focus
          this.getFocus().add(TypeConvertor.castToCodeableReference(value)); // CodeableReference
          return value;
        case -861311717: // condition
          this.getCondition().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -814408215: // keyword
          this.getKeyword().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -934795532: // region
          this.getRegion().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 21530634: // descriptionSummary
          this.descriptionSummary = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -1724546052: // description
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case 3530567: // site
          this.getSite().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        case -281470431: // classifier
          this.getClassifier().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1841460864: // associatedParty
          this.getAssociatedParty().add((ResearchStudyAssociatedPartyComponent) value); // ResearchStudyAssociatedPartyComponent
          return value;
        case -1897502593: // progressStatus
          this.getProgressStatus().add((ResearchStudyProgressStatusComponent) value); // ResearchStudyProgressStatusComponent
          return value;
        case -699986715: // whyStopped
          this.whyStopped = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 780783004: // recruitment
          this.recruitment = (ResearchStudyRecruitmentComponent) value; // ResearchStudyRecruitmentComponent
          return value;
        case -138266634: // comparisonGroup
          this.getComparisonGroup().add((ResearchStudyComparisonGroupComponent) value); // ResearchStudyComparisonGroupComponent
          return value;
        case -1489585863: // objective
          this.getObjective().add((ResearchStudyObjectiveComponent) value); // ResearchStudyObjectiveComponent
          return value;
        case -934426595: // result
          this.getResult().add(TypeConvertor.castToReference(value)); // Reference
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
        } else if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("label")) {
          this.getLabel().add((ResearchStudyLabelComponent) value);
        } else if (name.equals("protocol")) {
          this.getProtocol().add(TypeConvertor.castToReference(value));
        } else if (name.equals("partOf")) {
          this.getPartOf().add(TypeConvertor.castToReference(value));
        } else if (name.equals("citeAs")) {
          this.citeAs = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("relatesTo")) {
          this.getRelatesTo().add((ResearchStudyRelatesToComponent) value);
        } else if (name.equals("date")) {
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("primaryPurposeType")) {
          this.primaryPurposeType = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("phase")) {
          this.phase = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("studyDesign")) {
          this.getStudyDesign().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("focus")) {
          this.getFocus().add(TypeConvertor.castToCodeableReference(value));
        } else if (name.equals("condition")) {
          this.getCondition().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("keyword")) {
          this.getKeyword().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("region")) {
          this.getRegion().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("descriptionSummary")) {
          this.descriptionSummary = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("description")) {
          this.description = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("site")) {
          this.getSite().add(TypeConvertor.castToReference(value));
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else if (name.equals("classifier")) {
          this.getClassifier().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("associatedParty")) {
          this.getAssociatedParty().add((ResearchStudyAssociatedPartyComponent) value);
        } else if (name.equals("progressStatus")) {
          this.getProgressStatus().add((ResearchStudyProgressStatusComponent) value);
        } else if (name.equals("whyStopped")) {
          this.whyStopped = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("recruitment")) {
          this.recruitment = (ResearchStudyRecruitmentComponent) value; // ResearchStudyRecruitmentComponent
        } else if (name.equals("comparisonGroup")) {
          this.getComparisonGroup().add((ResearchStudyComparisonGroupComponent) value);
        } else if (name.equals("objective")) {
          this.getObjective().add((ResearchStudyObjectiveComponent) value);
        } else if (name.equals("result")) {
          this.getResult().add(TypeConvertor.castToReference(value));
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
        case 3373707:  return getNameElement();
        case 110371416:  return getTitleElement();
        case 102727412:  return addLabel(); 
        case -989163880:  return addProtocol(); 
        case -995410646:  return addPartOf(); 
        case -1360156695:  return getCiteAsElement();
        case -7765931:  return addRelatesTo(); 
        case 3076014:  return getDateElement();
        case -892481550:  return getStatusElement();
        case -2132842986:  return getPrimaryPurposeType();
        case 106629499:  return getPhase();
        case 1709211879:  return addStudyDesign(); 
        case 97604824:  return addFocus(); 
        case -861311717:  return addCondition(); 
        case -814408215:  return addKeyword(); 
        case -934795532:  return addRegion(); 
        case 21530634:  return getDescriptionSummaryElement();
        case -1724546052:  return getDescriptionElement();
        case -991726143:  return getPeriod();
        case 3530567:  return addSite(); 
        case 3387378:  return addNote(); 
        case -281470431:  return addClassifier(); 
        case -1841460864:  return addAssociatedParty(); 
        case -1897502593:  return addProgressStatus(); 
        case -699986715:  return getWhyStopped();
        case 780783004:  return getRecruitment();
        case -138266634:  return addComparisonGroup(); 
        case -1489585863:  return addObjective(); 
        case -934426595:  return addResult(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 3373707: /*name*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case 102727412: /*label*/ return new String[] {};
        case -989163880: /*protocol*/ return new String[] {"Reference"};
        case -995410646: /*partOf*/ return new String[] {"Reference"};
        case -1360156695: /*citeAs*/ return new String[] {"markdown"};
        case -7765931: /*relatesTo*/ return new String[] {};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -2132842986: /*primaryPurposeType*/ return new String[] {"CodeableConcept"};
        case 106629499: /*phase*/ return new String[] {"CodeableConcept"};
        case 1709211879: /*studyDesign*/ return new String[] {"CodeableConcept"};
        case 97604824: /*focus*/ return new String[] {"CodeableReference"};
        case -861311717: /*condition*/ return new String[] {"CodeableConcept"};
        case -814408215: /*keyword*/ return new String[] {"CodeableConcept"};
        case -934795532: /*region*/ return new String[] {"CodeableConcept"};
        case 21530634: /*descriptionSummary*/ return new String[] {"markdown"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case 3530567: /*site*/ return new String[] {"Reference"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -281470431: /*classifier*/ return new String[] {"CodeableConcept"};
        case -1841460864: /*associatedParty*/ return new String[] {};
        case -1897502593: /*progressStatus*/ return new String[] {};
        case -699986715: /*whyStopped*/ return new String[] {"CodeableConcept"};
        case 780783004: /*recruitment*/ return new String[] {};
        case -138266634: /*comparisonGroup*/ return new String[] {};
        case -1489585863: /*objective*/ return new String[] {};
        case -934426595: /*result*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.version");
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.name");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.title");
        }
        else if (name.equals("label")) {
          return addLabel();
        }
        else if (name.equals("protocol")) {
          return addProtocol();
        }
        else if (name.equals("partOf")) {
          return addPartOf();
        }
        else if (name.equals("citeAs")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.citeAs");
        }
        else if (name.equals("relatesTo")) {
          return addRelatesTo();
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.date");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.status");
        }
        else if (name.equals("primaryPurposeType")) {
          this.primaryPurposeType = new CodeableConcept();
          return this.primaryPurposeType;
        }
        else if (name.equals("phase")) {
          this.phase = new CodeableConcept();
          return this.phase;
        }
        else if (name.equals("studyDesign")) {
          return addStudyDesign();
        }
        else if (name.equals("focus")) {
          return addFocus();
        }
        else if (name.equals("condition")) {
          return addCondition();
        }
        else if (name.equals("keyword")) {
          return addKeyword();
        }
        else if (name.equals("region")) {
          return addRegion();
        }
        else if (name.equals("descriptionSummary")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.descriptionSummary");
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a singleton property ResearchStudy.description");
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("site")) {
          return addSite();
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("classifier")) {
          return addClassifier();
        }
        else if (name.equals("associatedParty")) {
          return addAssociatedParty();
        }
        else if (name.equals("progressStatus")) {
          return addProgressStatus();
        }
        else if (name.equals("whyStopped")) {
          this.whyStopped = new CodeableConcept();
          return this.whyStopped;
        }
        else if (name.equals("recruitment")) {
          this.recruitment = new ResearchStudyRecruitmentComponent();
          return this.recruitment;
        }
        else if (name.equals("comparisonGroup")) {
          return addComparisonGroup();
        }
        else if (name.equals("objective")) {
          return addObjective();
        }
        else if (name.equals("result")) {
          return addResult();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "ResearchStudy";

  }

      public ResearchStudy copy() {
        ResearchStudy dst = new ResearchStudy();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ResearchStudy dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.name = name == null ? null : name.copy();
        dst.title = title == null ? null : title.copy();
        if (label != null) {
          dst.label = new ArrayList<ResearchStudyLabelComponent>();
          for (ResearchStudyLabelComponent i : label)
            dst.label.add(i.copy());
        };
        if (protocol != null) {
          dst.protocol = new ArrayList<Reference>();
          for (Reference i : protocol)
            dst.protocol.add(i.copy());
        };
        if (partOf != null) {
          dst.partOf = new ArrayList<Reference>();
          for (Reference i : partOf)
            dst.partOf.add(i.copy());
        };
        dst.citeAs = citeAs == null ? null : citeAs.copy();
        if (relatesTo != null) {
          dst.relatesTo = new ArrayList<ResearchStudyRelatesToComponent>();
          for (ResearchStudyRelatesToComponent i : relatesTo)
            dst.relatesTo.add(i.copy());
        };
        dst.date = date == null ? null : date.copy();
        dst.status = status == null ? null : status.copy();
        dst.primaryPurposeType = primaryPurposeType == null ? null : primaryPurposeType.copy();
        dst.phase = phase == null ? null : phase.copy();
        if (studyDesign != null) {
          dst.studyDesign = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : studyDesign)
            dst.studyDesign.add(i.copy());
        };
        if (focus != null) {
          dst.focus = new ArrayList<CodeableReference>();
          for (CodeableReference i : focus)
            dst.focus.add(i.copy());
        };
        if (condition != null) {
          dst.condition = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : condition)
            dst.condition.add(i.copy());
        };
        if (keyword != null) {
          dst.keyword = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : keyword)
            dst.keyword.add(i.copy());
        };
        if (region != null) {
          dst.region = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : region)
            dst.region.add(i.copy());
        };
        dst.descriptionSummary = descriptionSummary == null ? null : descriptionSummary.copy();
        dst.description = description == null ? null : description.copy();
        dst.period = period == null ? null : period.copy();
        if (site != null) {
          dst.site = new ArrayList<Reference>();
          for (Reference i : site)
            dst.site.add(i.copy());
        };
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (classifier != null) {
          dst.classifier = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : classifier)
            dst.classifier.add(i.copy());
        };
        if (associatedParty != null) {
          dst.associatedParty = new ArrayList<ResearchStudyAssociatedPartyComponent>();
          for (ResearchStudyAssociatedPartyComponent i : associatedParty)
            dst.associatedParty.add(i.copy());
        };
        if (progressStatus != null) {
          dst.progressStatus = new ArrayList<ResearchStudyProgressStatusComponent>();
          for (ResearchStudyProgressStatusComponent i : progressStatus)
            dst.progressStatus.add(i.copy());
        };
        dst.whyStopped = whyStopped == null ? null : whyStopped.copy();
        dst.recruitment = recruitment == null ? null : recruitment.copy();
        if (comparisonGroup != null) {
          dst.comparisonGroup = new ArrayList<ResearchStudyComparisonGroupComponent>();
          for (ResearchStudyComparisonGroupComponent i : comparisonGroup)
            dst.comparisonGroup.add(i.copy());
        };
        if (objective != null) {
          dst.objective = new ArrayList<ResearchStudyObjectiveComponent>();
          for (ResearchStudyObjectiveComponent i : objective)
            dst.objective.add(i.copy());
        };
        if (result != null) {
          dst.result = new ArrayList<Reference>();
          for (Reference i : result)
            dst.result.add(i.copy());
        };
      }

      protected ResearchStudy typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ResearchStudy))
          return false;
        ResearchStudy o = (ResearchStudy) other_;
        return compareDeep(url, o.url, true) && compareDeep(identifier, o.identifier, true) && compareDeep(version, o.version, true)
           && compareDeep(name, o.name, true) && compareDeep(title, o.title, true) && compareDeep(label, o.label, true)
           && compareDeep(protocol, o.protocol, true) && compareDeep(partOf, o.partOf, true) && compareDeep(citeAs, o.citeAs, true)
           && compareDeep(relatesTo, o.relatesTo, true) && compareDeep(date, o.date, true) && compareDeep(status, o.status, true)
           && compareDeep(primaryPurposeType, o.primaryPurposeType, true) && compareDeep(phase, o.phase, true)
           && compareDeep(studyDesign, o.studyDesign, true) && compareDeep(focus, o.focus, true) && compareDeep(condition, o.condition, true)
           && compareDeep(keyword, o.keyword, true) && compareDeep(region, o.region, true) && compareDeep(descriptionSummary, o.descriptionSummary, true)
           && compareDeep(description, o.description, true) && compareDeep(period, o.period, true) && compareDeep(site, o.site, true)
           && compareDeep(note, o.note, true) && compareDeep(classifier, o.classifier, true) && compareDeep(associatedParty, o.associatedParty, true)
           && compareDeep(progressStatus, o.progressStatus, true) && compareDeep(whyStopped, o.whyStopped, true)
           && compareDeep(recruitment, o.recruitment, true) && compareDeep(comparisonGroup, o.comparisonGroup, true)
           && compareDeep(objective, o.objective, true) && compareDeep(result, o.result, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ResearchStudy))
          return false;
        ResearchStudy o = (ResearchStudy) other_;
        return compareValues(url, o.url, true) && compareValues(version, o.version, true) && compareValues(name, o.name, true)
           && compareValues(title, o.title, true) && compareValues(citeAs, o.citeAs, true) && compareValues(date, o.date, true)
           && compareValues(status, o.status, true) && compareValues(descriptionSummary, o.descriptionSummary, true)
           && compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(url, identifier, version
          , name, title, label, protocol, partOf, citeAs, relatesTo, date, status, primaryPurposeType
          , phase, studyDesign, focus, condition, keyword, region, descriptionSummary, description
          , period, site, note, classifier, associatedParty, progressStatus, whyStopped
          , recruitment, comparisonGroup, objective, result);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ResearchStudy;
   }

 /**
   * Search parameter: <b>progress-period</b>
   * <p>
   * Description: <b>Date range</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ResearchStudy.progressStatus.period</b><br>
   * </p>
   */
  @SearchParamDefinition(name="progress-period", path="ResearchStudy.progressStatus.period", description="Date range", type="date" )
  public static final String SP_PROGRESS_PERIOD = "progress-period";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>progress-period</b>
   * <p>
   * Description: <b>Date range</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ResearchStudy.progressStatus.period</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam PROGRESS_PERIOD = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_PROGRESS_PERIOD);

 /**
   * Search parameter: <b>progress-status-state-actual</b>
   * <p>
   * Description: <b>Status of study by state and actual</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>ResearchStudy.progressStatus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="progress-status-state-actual", path="ResearchStudy.progressStatus", description="Status of study by state and actual", type="composite", compositeOf={"progress-state", "progress-actual"} )
  public static final String SP_PROGRESS_STATUS_STATE_ACTUAL = "progress-status-state-actual";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>progress-status-state-actual</b>
   * <p>
   * Description: <b>Status of study by state and actual</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>ResearchStudy.progressStatus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> PROGRESS_STATUS_STATE_ACTUAL = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(SP_PROGRESS_STATUS_STATE_ACTUAL);

 /**
   * Search parameter: <b>site</b>
   * <p>
   * Description: <b>Facility where study activities are conducted</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.site</b><br>
   * </p>
   */
  @SearchParamDefinition(name="site", path="ResearchStudy.site", description="Facility where study activities are conducted", type="reference", target={Location.class, Organization.class, ResearchStudy.class } )
  public static final String SP_SITE = "site";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>site</b>
   * <p>
   * Description: <b>Facility where study activities are conducted</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.site</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SITE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SITE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ResearchStudy:site</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SITE = new ca.uhn.fhir.model.api.Include("ResearchStudy:site").toLocked();

 /**
   * Search parameter: <b>keyword</b>
   * <p>
   * Description: <b>Used to search for the study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.keyword</b><br>
   * </p>
   */
  @SearchParamDefinition(name="keyword", path="ResearchStudy.keyword", description="Used to search for the study", type="token" )
  public static final String SP_KEYWORD = "keyword";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>keyword</b>
   * <p>
   * Description: <b>Used to search for the study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.keyword</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam KEYWORD = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_KEYWORD);

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human readable name of the research study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="ResearchStudy.title", description="The human readable name of the research study", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human readable name of the research study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Business Identifier for study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="ResearchStudy.identifier", description="Business Identifier for study", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Business Identifier for study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>focus-reference</b>
   * <p>
   * Description: <b>Drugs, devices, etc. under study, as a reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.focus.reference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="focus-reference", path="ResearchStudy.focus.reference", description="Drugs, devices, etc. under study, as a reference", type="reference", target={DeviceDefinition.class, Medication.class, MedicinalProductDefinition.class, PlanDefinition.class, SubstanceDefinition.class } )
  public static final String SP_FOCUS_REFERENCE = "focus-reference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>focus-reference</b>
   * <p>
   * Description: <b>Drugs, devices, etc. under study, as a reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.focus.reference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam FOCUS_REFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_FOCUS_REFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ResearchStudy:focus-reference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_FOCUS_REFERENCE = new ca.uhn.fhir.model.api.Include("ResearchStudy:focus-reference").toLocked();

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>Detailed narrative of the study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="ResearchStudy.description", description="Detailed narrative of the study", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>Detailed narrative of the study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>Name for this study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="ResearchStudy.name", description="Name for this study", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>Name for this study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>progress-state</b>
   * <p>
   * Description: <b>Label for status or state</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.progressStatus.state</b><br>
   * </p>
   */
  @SearchParamDefinition(name="progress-state", path="ResearchStudy.progressStatus.state", description="Label for status or state", type="token" )
  public static final String SP_PROGRESS_STATE = "progress-state";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>progress-state</b>
   * <p>
   * Description: <b>Label for status or state</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.progressStatus.state</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROGRESS_STATE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PROGRESS_STATE);

 /**
   * Search parameter: <b>eligibility</b>
   * <p>
   * Description: <b>Inclusion and exclusion criteria</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.recruitment.eligibility</b><br>
   * </p>
   */
  @SearchParamDefinition(name="eligibility", path="ResearchStudy.recruitment.eligibility", description="Inclusion and exclusion criteria", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Group") }, target={Group.class } )
  public static final String SP_ELIGIBILITY = "eligibility";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>eligibility</b>
   * <p>
   * Description: <b>Inclusion and exclusion criteria</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.recruitment.eligibility</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ELIGIBILITY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ELIGIBILITY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ResearchStudy:eligibility</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ELIGIBILITY = new ca.uhn.fhir.model.api.Include("ResearchStudy:eligibility").toLocked();

 /**
   * Search parameter: <b>progress-status-state-period-actual</b>
   * <p>
   * Description: <b>Status of study by state, period and actual</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>ResearchStudy.progressStatus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="progress-status-state-period-actual", path="ResearchStudy.progressStatus", description="Status of study by state, period and actual", type="composite", compositeOf={"progress-state", "progress-period"} )
  public static final String SP_PROGRESS_STATUS_STATE_PERIOD_ACTUAL = "progress-status-state-period-actual";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>progress-status-state-period-actual</b>
   * <p>
   * Description: <b>Status of study by state, period and actual</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>ResearchStudy.progressStatus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.DateClientParam> PROGRESS_STATUS_STATE_PERIOD_ACTUAL = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.DateClientParam>(SP_PROGRESS_STATUS_STATE_PERIOD_ACTUAL);

 /**
   * Search parameter: <b>objective-description</b>
   * <p>
   * Description: <b>Free text description of the objective of the study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.objective.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="objective-description", path="ResearchStudy.objective.description", description="Free text description of the objective of the study", type="string" )
  public static final String SP_OBJECTIVE_DESCRIPTION = "objective-description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>objective-description</b>
   * <p>
   * Description: <b>Free text description of the objective of the study</b><br>
   * Type: <b>string</b><br>
   * Path: <b>ResearchStudy.objective.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam OBJECTIVE_DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_OBJECTIVE_DESCRIPTION);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>active | active-but-not-recruiting | administratively-completed | approved | closed-to-accrual | closed-to-accrual-and-intervention | completed | disapproved | enrolling-by-invitation | in-review | not-yet-recruiting | recruiting | temporarily-closed-to-accrual | temporarily-closed-to-accrual-and-intervention | terminated | withdrawn</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="ResearchStudy.status", description="active | active-but-not-recruiting | administratively-completed | approved | closed-to-accrual | closed-to-accrual-and-intervention | completed | disapproved | enrolling-by-invitation | in-review | not-yet-recruiting | recruiting | temporarily-closed-to-accrual | temporarily-closed-to-accrual-and-intervention | terminated | withdrawn", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>active | active-but-not-recruiting | administratively-completed | approved | closed-to-accrual | closed-to-accrual-and-intervention | completed | disapproved | enrolling-by-invitation | in-review | not-yet-recruiting | recruiting | temporarily-closed-to-accrual | temporarily-closed-to-accrual-and-intervention | terminated | withdrawn</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>study-design</b>
   * <p>
   * Description: <b>Classifications of the study design characteristics</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.studyDesign</b><br>
   * </p>
   */
  @SearchParamDefinition(name="study-design", path="ResearchStudy.studyDesign", description="Classifications of the study design characteristics", type="token" )
  public static final String SP_STUDY_DESIGN = "study-design";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>study-design</b>
   * <p>
   * Description: <b>Classifications of the study design characteristics</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.studyDesign</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STUDY_DESIGN = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STUDY_DESIGN);

 /**
   * Search parameter: <b>recruitment-actual</b>
   * <p>
   * Description: <b>Actual number of participants enrolled in study across all groups</b><br>
   * Type: <b>number</b><br>
   * Path: <b>ResearchStudy.recruitment.actualNumber</b><br>
   * </p>
   */
  @SearchParamDefinition(name="recruitment-actual", path="ResearchStudy.recruitment.actualNumber", description="Actual number of participants enrolled in study across all groups", type="number" )
  public static final String SP_RECRUITMENT_ACTUAL = "recruitment-actual";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>recruitment-actual</b>
   * <p>
   * Description: <b>Actual number of participants enrolled in study across all groups</b><br>
   * Type: <b>number</b><br>
   * Path: <b>ResearchStudy.recruitment.actualNumber</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam RECRUITMENT_ACTUAL = new ca.uhn.fhir.rest.gclient.NumberClientParam(SP_RECRUITMENT_ACTUAL);

 /**
   * Search parameter: <b>classifier</b>
   * <p>
   * Description: <b>Classification for the study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.classifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="classifier", path="ResearchStudy.classifier", description="Classification for the study", type="token" )
  public static final String SP_CLASSIFIER = "classifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>classifier</b>
   * <p>
   * Description: <b>Classification for the study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.classifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CLASSIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CLASSIFIER);

 /**
   * Search parameter: <b>part-of</b>
   * <p>
   * Description: <b>Part of larger study</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.partOf</b><br>
   * </p>
   */
  @SearchParamDefinition(name="part-of", path="ResearchStudy.partOf", description="Part of larger study", type="reference", target={ResearchStudy.class } )
  public static final String SP_PART_OF = "part-of";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>part-of</b>
   * <p>
   * Description: <b>Part of larger study</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.partOf</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PART_OF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PART_OF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ResearchStudy:part-of</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PART_OF = new ca.uhn.fhir.model.api.Include("ResearchStudy:part-of").toLocked();

 /**
   * Search parameter: <b>recruitment-target</b>
   * <p>
   * Description: <b>Target number of participants enrolled in study across all groups</b><br>
   * Type: <b>number</b><br>
   * Path: <b>ResearchStudy.recruitment.targetNumber</b><br>
   * </p>
   */
  @SearchParamDefinition(name="recruitment-target", path="ResearchStudy.recruitment.targetNumber", description="Target number of participants enrolled in study across all groups", type="number" )
  public static final String SP_RECRUITMENT_TARGET = "recruitment-target";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>recruitment-target</b>
   * <p>
   * Description: <b>Target number of participants enrolled in study across all groups</b><br>
   * Type: <b>number</b><br>
   * Path: <b>ResearchStudy.recruitment.targetNumber</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.NumberClientParam RECRUITMENT_TARGET = new ca.uhn.fhir.rest.gclient.NumberClientParam(SP_RECRUITMENT_TARGET);

 /**
   * Search parameter: <b>protocol</b>
   * <p>
   * Description: <b>Steps followed in executing study</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.protocol</b><br>
   * </p>
   */
  @SearchParamDefinition(name="protocol", path="ResearchStudy.protocol", description="Steps followed in executing study", type="reference", target={PlanDefinition.class } )
  public static final String SP_PROTOCOL = "protocol";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>protocol</b>
   * <p>
   * Description: <b>Steps followed in executing study</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ResearchStudy.protocol</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PROTOCOL = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PROTOCOL);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ResearchStudy:protocol</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PROTOCOL = new ca.uhn.fhir.model.api.Include("ResearchStudy:protocol").toLocked();

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>When the study began and ended</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ResearchStudy.period</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="ResearchStudy.period", description="When the study began and ended", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>When the study began and ended</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ResearchStudy.period</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>progress-status-state-period</b>
   * <p>
   * Description: <b>Status of study by state and period</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>ResearchStudy.progressStatus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="progress-status-state-period", path="ResearchStudy.progressStatus", description="Status of study by state and period", type="composite", compositeOf={"progress-state", "progress-period"} )
  public static final String SP_PROGRESS_STATUS_STATE_PERIOD = "progress-status-state-period";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>progress-status-state-period</b>
   * <p>
   * Description: <b>Status of study by state and period</b><br>
   * Type: <b>composite</b><br>
   * Path: <b>ResearchStudy.progressStatus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.DateClientParam> PROGRESS_STATUS_STATE_PERIOD = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.DateClientParam>(SP_PROGRESS_STATUS_STATE_PERIOD);

 /**
   * Search parameter: <b>focus-code</b>
   * <p>
   * Description: <b>Drugs, devices, etc. under study, as a code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.focus.concept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="focus-code", path="ResearchStudy.focus.concept", description="Drugs, devices, etc. under study, as a code", type="token" )
  public static final String SP_FOCUS_CODE = "focus-code";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>focus-code</b>
   * <p>
   * Description: <b>Drugs, devices, etc. under study, as a code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.focus.concept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam FOCUS_CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_FOCUS_CODE);

 /**
   * Search parameter: <b>condition</b>
   * <p>
   * Description: <b>Condition being studied</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.condition</b><br>
   * </p>
   */
  @SearchParamDefinition(name="condition", path="ResearchStudy.condition", description="Condition being studied", type="token" )
  public static final String SP_CONDITION = "condition";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>condition</b>
   * <p>
   * Description: <b>Condition being studied</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.condition</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONDITION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONDITION);

 /**
   * Search parameter: <b>region</b>
   * <p>
   * Description: <b>Geographic area for the study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.region</b><br>
   * </p>
   */
  @SearchParamDefinition(name="region", path="ResearchStudy.region", description="Geographic area for the study", type="token" )
  public static final String SP_REGION = "region";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>region</b>
   * <p>
   * Description: <b>Geographic area for the study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.region</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam REGION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_REGION);

 /**
   * Search parameter: <b>objective-type</b>
   * <p>
   * Description: <b>The kind of study objective</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.objective.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="objective-type", path="ResearchStudy.objective.type", description="The kind of study objective", type="token" )
  public static final String SP_OBJECTIVE_TYPE = "objective-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>objective-type</b>
   * <p>
   * Description: <b>The kind of study objective</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.objective.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam OBJECTIVE_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_OBJECTIVE_TYPE);

 /**
   * Search parameter: <b>progress-actual</b>
   * <p>
   * Description: <b>Actual if true else anticipated</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.progressStatus.actual</b><br>
   * </p>
   */
  @SearchParamDefinition(name="progress-actual", path="ResearchStudy.progressStatus.actual", description="Actual if true else anticipated", type="token" )
  public static final String SP_PROGRESS_ACTUAL = "progress-actual";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>progress-actual</b>
   * <p>
   * Description: <b>Actual if true else anticipated</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.progressStatus.actual</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROGRESS_ACTUAL = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PROGRESS_ACTUAL);

 /**
   * Search parameter: <b>phase</b>
   * <p>
   * Description: <b>The stage in the progression of a study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.phase</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phase", path="ResearchStudy.phase", description="The stage in the progression of a study", type="token" )
  public static final String SP_PHASE = "phase";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phase</b>
   * <p>
   * Description: <b>The stage in the progression of a study</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ResearchStudy.phase</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHASE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHASE);


}

