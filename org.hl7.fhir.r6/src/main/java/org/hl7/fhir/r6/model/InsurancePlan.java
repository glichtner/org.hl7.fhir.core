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
 * Details of a Health Insurance plan provided by an organization under an InsuranceProduct.
 */
@ResourceDef(name="InsurancePlan", profile="http://hl7.org/fhir/StructureDefinition/InsurancePlan")
public class InsurancePlan extends DomainResource {

    @Block()
    public static class InsurancePlanGeneralCostComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of cost.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of specific cost", formalDefinition="Type of cost." )
        protected CodeableConcept type;

        /**
         * Number of participants enrolled in the plan.
         */
        @Child(name = "groupSize", type = {PositiveIntType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of enrollees", formalDefinition="Number of participants enrolled in the plan." )
        protected PositiveIntType groupSize;

        /**
         * Value of the cost.
         */
        @Child(name = "cost", type = {Money.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Cost value", formalDefinition="Value of the cost." )
        protected Money cost;

        /**
         * Additional information about the general costs associated with this plan.
         */
        @Child(name = "comment", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Additional cost information", formalDefinition="Additional information about the general costs associated with this plan." )
        protected StringType comment;

        private static final long serialVersionUID = 1563949866L;

    /**
     * Constructor
     */
      public InsurancePlanGeneralCostComponent() {
        super();
      }

        /**
         * @return {@link #type} (Type of cost.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsurancePlanGeneralCostComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of cost.)
         */
        public InsurancePlanGeneralCostComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #groupSize} (Number of participants enrolled in the plan.). This is the underlying object with id, value and extensions. The accessor "getGroupSize" gives direct access to the value
         */
        public PositiveIntType getGroupSizeElement() { 
          if (this.groupSize == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsurancePlanGeneralCostComponent.groupSize");
            else if (Configuration.doAutoCreate())
              this.groupSize = new PositiveIntType(); // bb
          return this.groupSize;
        }

        public boolean hasGroupSizeElement() { 
          return this.groupSize != null && !this.groupSize.isEmpty();
        }

        public boolean hasGroupSize() { 
          return this.groupSize != null && !this.groupSize.isEmpty();
        }

        /**
         * @param value {@link #groupSize} (Number of participants enrolled in the plan.). This is the underlying object with id, value and extensions. The accessor "getGroupSize" gives direct access to the value
         */
        public InsurancePlanGeneralCostComponent setGroupSizeElement(PositiveIntType value) { 
          this.groupSize = value;
          return this;
        }

        /**
         * @return Number of participants enrolled in the plan.
         */
        public int getGroupSize() { 
          return this.groupSize == null || this.groupSize.isEmpty() ? 0 : this.groupSize.getValue();
        }

        /**
         * @param value Number of participants enrolled in the plan.
         */
        public InsurancePlanGeneralCostComponent setGroupSize(int value) { 
            if (this.groupSize == null)
              this.groupSize = new PositiveIntType();
            this.groupSize.setValue(value);
          return this;
        }

        /**
         * @return {@link #cost} (Value of the cost.)
         */
        public Money getCost() { 
          if (this.cost == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsurancePlanGeneralCostComponent.cost");
            else if (Configuration.doAutoCreate())
              this.cost = new Money(); // cc
          return this.cost;
        }

        public boolean hasCost() { 
          return this.cost != null && !this.cost.isEmpty();
        }

        /**
         * @param value {@link #cost} (Value of the cost.)
         */
        public InsurancePlanGeneralCostComponent setCost(Money value) { 
          this.cost = value;
          return this;
        }

        /**
         * @return {@link #comment} (Additional information about the general costs associated with this plan.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
         */
        public StringType getCommentElement() { 
          if (this.comment == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsurancePlanGeneralCostComponent.comment");
            else if (Configuration.doAutoCreate())
              this.comment = new StringType(); // bb
          return this.comment;
        }

        public boolean hasCommentElement() { 
          return this.comment != null && !this.comment.isEmpty();
        }

        public boolean hasComment() { 
          return this.comment != null && !this.comment.isEmpty();
        }

        /**
         * @param value {@link #comment} (Additional information about the general costs associated with this plan.). This is the underlying object with id, value and extensions. The accessor "getComment" gives direct access to the value
         */
        public InsurancePlanGeneralCostComponent setCommentElement(StringType value) { 
          this.comment = value;
          return this;
        }

        /**
         * @return Additional information about the general costs associated with this plan.
         */
        public String getComment() { 
          return this.comment == null ? null : this.comment.getValue();
        }

        /**
         * @param value Additional information about the general costs associated with this plan.
         */
        public InsurancePlanGeneralCostComponent setComment(String value) { 
          if (Utilities.noString(value))
            this.comment = null;
          else {
            if (this.comment == null)
              this.comment = new StringType();
            this.comment.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Type of cost.", 0, 1, type));
          children.add(new Property("groupSize", "positiveInt", "Number of participants enrolled in the plan.", 0, 1, groupSize));
          children.add(new Property("cost", "Money", "Value of the cost.", 0, 1, cost));
          children.add(new Property("comment", "string", "Additional information about the general costs associated with this plan.", 0, 1, comment));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of cost.", 0, 1, type);
          case -1483017440: /*groupSize*/  return new Property("groupSize", "positiveInt", "Number of participants enrolled in the plan.", 0, 1, groupSize);
          case 3059661: /*cost*/  return new Property("cost", "Money", "Value of the cost.", 0, 1, cost);
          case 950398559: /*comment*/  return new Property("comment", "string", "Additional information about the general costs associated with this plan.", 0, 1, comment);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1483017440: /*groupSize*/ return this.groupSize == null ? new Base[0] : new Base[] {this.groupSize}; // PositiveIntType
        case 3059661: /*cost*/ return this.cost == null ? new Base[0] : new Base[] {this.cost}; // Money
        case 950398559: /*comment*/ return this.comment == null ? new Base[0] : new Base[] {this.comment}; // StringType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1483017440: // groupSize
          this.groupSize = TypeConvertor.castToPositiveInt(value); // PositiveIntType
          return value;
        case 3059661: // cost
          this.cost = TypeConvertor.castToMoney(value); // Money
          return value;
        case 950398559: // comment
          this.comment = TypeConvertor.castToString(value); // StringType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("groupSize")) {
          this.groupSize = TypeConvertor.castToPositiveInt(value); // PositiveIntType
        } else if (name.equals("cost")) {
          this.cost = TypeConvertor.castToMoney(value); // Money
        } else if (name.equals("comment")) {
          this.comment = TypeConvertor.castToString(value); // StringType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case -1483017440:  return getGroupSizeElement();
        case 3059661:  return getCost();
        case 950398559:  return getCommentElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1483017440: /*groupSize*/ return new String[] {"positiveInt"};
        case 3059661: /*cost*/ return new String[] {"Money"};
        case 950398559: /*comment*/ return new String[] {"string"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("groupSize")) {
          throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.generalCost.groupSize");
        }
        else if (name.equals("cost")) {
          this.cost = new Money();
          return this.cost;
        }
        else if (name.equals("comment")) {
          throw new FHIRException("Cannot call addChild on a singleton property InsurancePlan.generalCost.comment");
        }
        else
          return super.addChild(name);
      }

      public InsurancePlanGeneralCostComponent copy() {
        InsurancePlanGeneralCostComponent dst = new InsurancePlanGeneralCostComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsurancePlanGeneralCostComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.groupSize = groupSize == null ? null : groupSize.copy();
        dst.cost = cost == null ? null : cost.copy();
        dst.comment = comment == null ? null : comment.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsurancePlanGeneralCostComponent))
          return false;
        InsurancePlanGeneralCostComponent o = (InsurancePlanGeneralCostComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(groupSize, o.groupSize, true) && compareDeep(cost, o.cost, true)
           && compareDeep(comment, o.comment, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsurancePlanGeneralCostComponent))
          return false;
        InsurancePlanGeneralCostComponent o = (InsurancePlanGeneralCostComponent) other_;
        return compareValues(groupSize, o.groupSize, true) && compareValues(comment, o.comment, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, groupSize, cost, comment
          );
      }

  public String fhirType() {
    return "InsurancePlan.generalCost";

  }

  }

    @Block()
    public static class InsurancePlanSpecificCostComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).
         */
        @Child(name = "category", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="General category of benefit", formalDefinition="General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health)." )
        protected CodeableConcept category;

        /**
         * List of the specific benefits under this category of benefit.
         */
        @Child(name = "benefit", type = {}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Benefits list", formalDefinition="List of the specific benefits under this category of benefit." )
        protected List<PlanBenefitComponent> benefit;

        private static final long serialVersionUID = 922585525L;

    /**
     * Constructor
     */
      public InsurancePlanSpecificCostComponent() {
        super();
      }

    /**
     * Constructor
     */
      public InsurancePlanSpecificCostComponent(CodeableConcept category) {
        super();
        this.setCategory(category);
      }

        /**
         * @return {@link #category} (General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).)
         */
        public CodeableConcept getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsurancePlanSpecificCostComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new CodeableConcept(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).)
         */
        public InsurancePlanSpecificCostComponent setCategory(CodeableConcept value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #benefit} (List of the specific benefits under this category of benefit.)
         */
        public List<PlanBenefitComponent> getBenefit() { 
          if (this.benefit == null)
            this.benefit = new ArrayList<PlanBenefitComponent>();
          return this.benefit;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public InsurancePlanSpecificCostComponent setBenefit(List<PlanBenefitComponent> theBenefit) { 
          this.benefit = theBenefit;
          return this;
        }

        public boolean hasBenefit() { 
          if (this.benefit == null)
            return false;
          for (PlanBenefitComponent item : this.benefit)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public PlanBenefitComponent addBenefit() { //3
          PlanBenefitComponent t = new PlanBenefitComponent();
          if (this.benefit == null)
            this.benefit = new ArrayList<PlanBenefitComponent>();
          this.benefit.add(t);
          return t;
        }

        public InsurancePlanSpecificCostComponent addBenefit(PlanBenefitComponent t) { //3
          if (t == null)
            return this;
          if (this.benefit == null)
            this.benefit = new ArrayList<PlanBenefitComponent>();
          this.benefit.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #benefit}, creating it if it does not already exist {3}
         */
        public PlanBenefitComponent getBenefitFirstRep() { 
          if (getBenefit().isEmpty()) {
            addBenefit();
          }
          return getBenefit().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("category", "CodeableConcept", "General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).", 0, 1, category));
          children.add(new Property("benefit", "", "List of the specific benefits under this category of benefit.", 0, java.lang.Integer.MAX_VALUE, benefit));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 50511102: /*category*/  return new Property("category", "CodeableConcept", "General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).", 0, 1, category);
          case -222710633: /*benefit*/  return new Property("benefit", "", "List of the specific benefits under this category of benefit.", 0, java.lang.Integer.MAX_VALUE, benefit);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // CodeableConcept
        case -222710633: /*benefit*/ return this.benefit == null ? new Base[0] : this.benefit.toArray(new Base[this.benefit.size()]); // PlanBenefitComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 50511102: // category
          this.category = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -222710633: // benefit
          this.getBenefit().add((PlanBenefitComponent) value); // PlanBenefitComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("category")) {
          this.category = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("benefit")) {
          this.getBenefit().add((PlanBenefitComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102:  return getCategory();
        case -222710633:  return addBenefit(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case -222710633: /*benefit*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("category")) {
          this.category = new CodeableConcept();
          return this.category;
        }
        else if (name.equals("benefit")) {
          return addBenefit();
        }
        else
          return super.addChild(name);
      }

      public InsurancePlanSpecificCostComponent copy() {
        InsurancePlanSpecificCostComponent dst = new InsurancePlanSpecificCostComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsurancePlanSpecificCostComponent dst) {
        super.copyValues(dst);
        dst.category = category == null ? null : category.copy();
        if (benefit != null) {
          dst.benefit = new ArrayList<PlanBenefitComponent>();
          for (PlanBenefitComponent i : benefit)
            dst.benefit.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsurancePlanSpecificCostComponent))
          return false;
        InsurancePlanSpecificCostComponent o = (InsurancePlanSpecificCostComponent) other_;
        return compareDeep(category, o.category, true) && compareDeep(benefit, o.benefit, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsurancePlanSpecificCostComponent))
          return false;
        InsurancePlanSpecificCostComponent o = (InsurancePlanSpecificCostComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(category, benefit);
      }

  public String fhirType() {
    return "InsurancePlan.specificCost";

  }

  }

    @Block()
    public static class PlanBenefitComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of benefit provided", formalDefinition="Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care)." )
        protected CodeableConcept type;

        /**
         * List of the costs associated with a specific benefit.
         */
        @Child(name = "cost", type = {}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="List of the costs", formalDefinition="List of the costs associated with a specific benefit." )
        protected List<PlanBenefitCostComponent> cost;

        private static final long serialVersionUID = 792296200L;

    /**
     * Constructor
     */
      public PlanBenefitComponent() {
        super();
      }

    /**
     * Constructor
     */
      public PlanBenefitComponent(CodeableConcept type) {
        super();
        this.setType(type);
      }

        /**
         * @return {@link #type} (Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PlanBenefitComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).)
         */
        public PlanBenefitComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #cost} (List of the costs associated with a specific benefit.)
         */
        public List<PlanBenefitCostComponent> getCost() { 
          if (this.cost == null)
            this.cost = new ArrayList<PlanBenefitCostComponent>();
          return this.cost;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public PlanBenefitComponent setCost(List<PlanBenefitCostComponent> theCost) { 
          this.cost = theCost;
          return this;
        }

        public boolean hasCost() { 
          if (this.cost == null)
            return false;
          for (PlanBenefitCostComponent item : this.cost)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public PlanBenefitCostComponent addCost() { //3
          PlanBenefitCostComponent t = new PlanBenefitCostComponent();
          if (this.cost == null)
            this.cost = new ArrayList<PlanBenefitCostComponent>();
          this.cost.add(t);
          return t;
        }

        public PlanBenefitComponent addCost(PlanBenefitCostComponent t) { //3
          if (t == null)
            return this;
          if (this.cost == null)
            this.cost = new ArrayList<PlanBenefitCostComponent>();
          this.cost.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #cost}, creating it if it does not already exist {3}
         */
        public PlanBenefitCostComponent getCostFirstRep() { 
          if (getCost().isEmpty()) {
            addCost();
          }
          return getCost().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).", 0, 1, type));
          children.add(new Property("cost", "", "List of the costs associated with a specific benefit.", 0, java.lang.Integer.MAX_VALUE, cost));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).", 0, 1, type);
          case 3059661: /*cost*/  return new Property("cost", "", "List of the costs associated with a specific benefit.", 0, java.lang.Integer.MAX_VALUE, cost);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 3059661: /*cost*/ return this.cost == null ? new Base[0] : this.cost.toArray(new Base[this.cost.size()]); // PlanBenefitCostComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 3059661: // cost
          this.getCost().add((PlanBenefitCostComponent) value); // PlanBenefitCostComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("cost")) {
          this.getCost().add((PlanBenefitCostComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case 3059661:  return addCost(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 3059661: /*cost*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("cost")) {
          return addCost();
        }
        else
          return super.addChild(name);
      }

      public PlanBenefitComponent copy() {
        PlanBenefitComponent dst = new PlanBenefitComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(PlanBenefitComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (cost != null) {
          dst.cost = new ArrayList<PlanBenefitCostComponent>();
          for (PlanBenefitCostComponent i : cost)
            dst.cost.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof PlanBenefitComponent))
          return false;
        PlanBenefitComponent o = (PlanBenefitComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(cost, o.cost, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof PlanBenefitComponent))
          return false;
        PlanBenefitComponent o = (PlanBenefitComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, cost);
      }

  public String fhirType() {
    return "InsurancePlan.specificCost.benefit";

  }

  }

    @Block()
    public static class PlanBenefitCostComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of cost (copay; individual cap; family cap; coinsurance; deductible).
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of specific cost", formalDefinition="Type of cost (copay; individual cap; family cap; coinsurance; deductible)." )
        protected CodeableConcept type;

        /**
         * Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).
         */
        @Child(name = "applicability", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="in-network | out-of-network | other", formalDefinition="Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/insuranceplan-applicability")
        protected CodeableConcept applicability;

        /**
         * Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).
         */
        @Child(name = "qualifier", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Additional information about the cost", formalDefinition="Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA)." )
        protected List<CodeableConcept> qualifier;

        /**
         * The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).
         */
        @Child(name = "value", type = {Quantity.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The actual cost value", formalDefinition="The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance)." )
        protected Quantity value;

        private static final long serialVersionUID = -1983766156L;

    /**
     * Constructor
     */
      public PlanBenefitCostComponent() {
        super();
      }

    /**
     * Constructor
     */
      public PlanBenefitCostComponent(CodeableConcept type) {
        super();
        this.setType(type);
      }

        /**
         * @return {@link #type} (Type of cost (copay; individual cap; family cap; coinsurance; deductible).)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PlanBenefitCostComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of cost (copay; individual cap; family cap; coinsurance; deductible).)
         */
        public PlanBenefitCostComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #applicability} (Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).)
         */
        public CodeableConcept getApplicability() { 
          if (this.applicability == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PlanBenefitCostComponent.applicability");
            else if (Configuration.doAutoCreate())
              this.applicability = new CodeableConcept(); // cc
          return this.applicability;
        }

        public boolean hasApplicability() { 
          return this.applicability != null && !this.applicability.isEmpty();
        }

        /**
         * @param value {@link #applicability} (Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).)
         */
        public PlanBenefitCostComponent setApplicability(CodeableConcept value) { 
          this.applicability = value;
          return this;
        }

        /**
         * @return {@link #qualifier} (Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).)
         */
        public List<CodeableConcept> getQualifier() { 
          if (this.qualifier == null)
            this.qualifier = new ArrayList<CodeableConcept>();
          return this.qualifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public PlanBenefitCostComponent setQualifier(List<CodeableConcept> theQualifier) { 
          this.qualifier = theQualifier;
          return this;
        }

        public boolean hasQualifier() { 
          if (this.qualifier == null)
            return false;
          for (CodeableConcept item : this.qualifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addQualifier() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.qualifier == null)
            this.qualifier = new ArrayList<CodeableConcept>();
          this.qualifier.add(t);
          return t;
        }

        public PlanBenefitCostComponent addQualifier(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.qualifier == null)
            this.qualifier = new ArrayList<CodeableConcept>();
          this.qualifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #qualifier}, creating it if it does not already exist {3}
         */
        public CodeableConcept getQualifierFirstRep() { 
          if (getQualifier().isEmpty()) {
            addQualifier();
          }
          return getQualifier().get(0);
        }

        /**
         * @return {@link #value} (The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).)
         */
        public Quantity getValue() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create PlanBenefitCostComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new Quantity(); // cc
          return this.value;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).)
         */
        public PlanBenefitCostComponent setValue(Quantity value) { 
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Type of cost (copay; individual cap; family cap; coinsurance; deductible).", 0, 1, type));
          children.add(new Property("applicability", "CodeableConcept", "Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).", 0, 1, applicability));
          children.add(new Property("qualifier", "CodeableConcept", "Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).", 0, java.lang.Integer.MAX_VALUE, qualifier));
          children.add(new Property("value", "Quantity", "The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of cost (copay; individual cap; family cap; coinsurance; deductible).", 0, 1, type);
          case -1526770491: /*applicability*/  return new Property("applicability", "CodeableConcept", "Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).", 0, 1, applicability);
          case -1247940438: /*qualifier*/  return new Property("qualifier", "CodeableConcept", "Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).", 0, java.lang.Integer.MAX_VALUE, qualifier);
          case 111972721: /*value*/  return new Property("value", "Quantity", "The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1526770491: /*applicability*/ return this.applicability == null ? new Base[0] : new Base[] {this.applicability}; // CodeableConcept
        case -1247940438: /*qualifier*/ return this.qualifier == null ? new Base[0] : this.qualifier.toArray(new Base[this.qualifier.size()]); // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // Quantity
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1526770491: // applicability
          this.applicability = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1247940438: // qualifier
          this.getQualifier().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 111972721: // value
          this.value = TypeConvertor.castToQuantity(value); // Quantity
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("applicability")) {
          this.applicability = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("qualifier")) {
          this.getQualifier().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("value")) {
          this.value = TypeConvertor.castToQuantity(value); // Quantity
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case -1526770491:  return getApplicability();
        case -1247940438:  return addQualifier(); 
        case 111972721:  return getValue();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1526770491: /*applicability*/ return new String[] {"CodeableConcept"};
        case -1247940438: /*qualifier*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"Quantity"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("applicability")) {
          this.applicability = new CodeableConcept();
          return this.applicability;
        }
        else if (name.equals("qualifier")) {
          return addQualifier();
        }
        else if (name.equals("value")) {
          this.value = new Quantity();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public PlanBenefitCostComponent copy() {
        PlanBenefitCostComponent dst = new PlanBenefitCostComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(PlanBenefitCostComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.applicability = applicability == null ? null : applicability.copy();
        if (qualifier != null) {
          dst.qualifier = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : qualifier)
            dst.qualifier.add(i.copy());
        };
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof PlanBenefitCostComponent))
          return false;
        PlanBenefitCostComponent o = (PlanBenefitCostComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(applicability, o.applicability, true) && compareDeep(qualifier, o.qualifier, true)
           && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof PlanBenefitCostComponent))
          return false;
        PlanBenefitCostComponent o = (PlanBenefitCostComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, applicability, qualifier
          , value);
      }

  public String fhirType() {
    return "InsurancePlan.specificCost.benefit.cost";

  }

  }

    /**
     * Identifiers, such as the plan ID and/or group ID associated with the insurance plan.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Business Identifier for Plan", formalDefinition="Identifiers, such as the plan ID and/or group ID associated with the insurance plan." )
    protected List<Identifier> identifier;

    /**
     * Type of plan. For example, "Platinum" or "High Deductable".
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Classification of Plan", formalDefinition="Type of plan. For example, \"Platinum\" or \"High Deductable\"." )
    protected CodeableConcept type;

    /**
     * The product that this plan is available under.
     */
    @Child(name = "product", type = {InsuranceProduct.class}, order=2, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The product that this plan is available under", formalDefinition="The product that this plan is available under." )
    protected Reference product;

    /**
     * The geographic region in which a health insurance plan's benefits apply.
     */
    @Child(name = "coverageArea", type = {Location.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Where product-plan applies", formalDefinition="The geographic region in which a health insurance plan's benefits apply." )
    protected List<Reference> coverageArea;

    /**
     * Reference to the network that providing the type of coverage.
     */
    @Child(name = "network", type = {Organization.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="What networks provide coverage", formalDefinition="Reference to the network that providing the type of coverage." )
    protected List<Reference> network;

    /**
     * Overall costs associated with the plan.
     */
    @Child(name = "generalCost", type = {}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Overall costs", formalDefinition="Overall costs associated with the plan." )
    protected List<InsurancePlanGeneralCostComponent> generalCost;

    /**
     * Costs associated with the coverage provided by the product-plan.
     */
    @Child(name = "specificCost", type = {}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Individual cost elements", formalDefinition="Costs associated with the coverage provided by the product-plan." )
    protected List<InsurancePlanSpecificCostComponent> specificCost;

    private static final long serialVersionUID = 678689884L;

  /**
   * Constructor
   */
    public InsurancePlan() {
      super();
    }

    /**
     * @return {@link #identifier} (Identifiers, such as the plan ID and/or group ID associated with the insurance plan.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlan setIdentifier(List<Identifier> theIdentifier) { 
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

    public InsurancePlan addIdentifier(Identifier t) { //3
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
     * @return {@link #type} (Type of plan. For example, "Platinum" or "High Deductable".)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlan.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Type of plan. For example, "Platinum" or "High Deductable".)
     */
    public InsurancePlan setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #product} (The product that this plan is available under.)
     */
    public Reference getProduct() { 
      if (this.product == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsurancePlan.product");
        else if (Configuration.doAutoCreate())
          this.product = new Reference(); // cc
      return this.product;
    }

    public boolean hasProduct() { 
      return this.product != null && !this.product.isEmpty();
    }

    /**
     * @param value {@link #product} (The product that this plan is available under.)
     */
    public InsurancePlan setProduct(Reference value) { 
      this.product = value;
      return this;
    }

    /**
     * @return {@link #coverageArea} (The geographic region in which a health insurance plan's benefits apply.)
     */
    public List<Reference> getCoverageArea() { 
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      return this.coverageArea;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlan setCoverageArea(List<Reference> theCoverageArea) { 
      this.coverageArea = theCoverageArea;
      return this;
    }

    public boolean hasCoverageArea() { 
      if (this.coverageArea == null)
        return false;
      for (Reference item : this.coverageArea)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addCoverageArea() { //3
      Reference t = new Reference();
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      this.coverageArea.add(t);
      return t;
    }

    public InsurancePlan addCoverageArea(Reference t) { //3
      if (t == null)
        return this;
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      this.coverageArea.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #coverageArea}, creating it if it does not already exist {3}
     */
    public Reference getCoverageAreaFirstRep() { 
      if (getCoverageArea().isEmpty()) {
        addCoverageArea();
      }
      return getCoverageArea().get(0);
    }

    /**
     * @return {@link #network} (Reference to the network that providing the type of coverage.)
     */
    public List<Reference> getNetwork() { 
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      return this.network;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlan setNetwork(List<Reference> theNetwork) { 
      this.network = theNetwork;
      return this;
    }

    public boolean hasNetwork() { 
      if (this.network == null)
        return false;
      for (Reference item : this.network)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addNetwork() { //3
      Reference t = new Reference();
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      this.network.add(t);
      return t;
    }

    public InsurancePlan addNetwork(Reference t) { //3
      if (t == null)
        return this;
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      this.network.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #network}, creating it if it does not already exist {3}
     */
    public Reference getNetworkFirstRep() { 
      if (getNetwork().isEmpty()) {
        addNetwork();
      }
      return getNetwork().get(0);
    }

    /**
     * @return {@link #generalCost} (Overall costs associated with the plan.)
     */
    public List<InsurancePlanGeneralCostComponent> getGeneralCost() { 
      if (this.generalCost == null)
        this.generalCost = new ArrayList<InsurancePlanGeneralCostComponent>();
      return this.generalCost;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlan setGeneralCost(List<InsurancePlanGeneralCostComponent> theGeneralCost) { 
      this.generalCost = theGeneralCost;
      return this;
    }

    public boolean hasGeneralCost() { 
      if (this.generalCost == null)
        return false;
      for (InsurancePlanGeneralCostComponent item : this.generalCost)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsurancePlanGeneralCostComponent addGeneralCost() { //3
      InsurancePlanGeneralCostComponent t = new InsurancePlanGeneralCostComponent();
      if (this.generalCost == null)
        this.generalCost = new ArrayList<InsurancePlanGeneralCostComponent>();
      this.generalCost.add(t);
      return t;
    }

    public InsurancePlan addGeneralCost(InsurancePlanGeneralCostComponent t) { //3
      if (t == null)
        return this;
      if (this.generalCost == null)
        this.generalCost = new ArrayList<InsurancePlanGeneralCostComponent>();
      this.generalCost.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #generalCost}, creating it if it does not already exist {3}
     */
    public InsurancePlanGeneralCostComponent getGeneralCostFirstRep() { 
      if (getGeneralCost().isEmpty()) {
        addGeneralCost();
      }
      return getGeneralCost().get(0);
    }

    /**
     * @return {@link #specificCost} (Costs associated with the coverage provided by the product-plan.)
     */
    public List<InsurancePlanSpecificCostComponent> getSpecificCost() { 
      if (this.specificCost == null)
        this.specificCost = new ArrayList<InsurancePlanSpecificCostComponent>();
      return this.specificCost;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsurancePlan setSpecificCost(List<InsurancePlanSpecificCostComponent> theSpecificCost) { 
      this.specificCost = theSpecificCost;
      return this;
    }

    public boolean hasSpecificCost() { 
      if (this.specificCost == null)
        return false;
      for (InsurancePlanSpecificCostComponent item : this.specificCost)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsurancePlanSpecificCostComponent addSpecificCost() { //3
      InsurancePlanSpecificCostComponent t = new InsurancePlanSpecificCostComponent();
      if (this.specificCost == null)
        this.specificCost = new ArrayList<InsurancePlanSpecificCostComponent>();
      this.specificCost.add(t);
      return t;
    }

    public InsurancePlan addSpecificCost(InsurancePlanSpecificCostComponent t) { //3
      if (t == null)
        return this;
      if (this.specificCost == null)
        this.specificCost = new ArrayList<InsurancePlanSpecificCostComponent>();
      this.specificCost.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #specificCost}, creating it if it does not already exist {3}
     */
    public InsurancePlanSpecificCostComponent getSpecificCostFirstRep() { 
      if (getSpecificCost().isEmpty()) {
        addSpecificCost();
      }
      return getSpecificCost().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Identifiers, such as the plan ID and/or group ID associated with the insurance plan.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("type", "CodeableConcept", "Type of plan. For example, \"Platinum\" or \"High Deductable\".", 0, 1, type));
        children.add(new Property("product", "Reference(InsuranceProduct)", "The product that this plan is available under.", 0, 1, product));
        children.add(new Property("coverageArea", "Reference(Location)", "The geographic region in which a health insurance plan's benefits apply.", 0, java.lang.Integer.MAX_VALUE, coverageArea));
        children.add(new Property("network", "Reference(Organization)", "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network));
        children.add(new Property("generalCost", "", "Overall costs associated with the plan.", 0, java.lang.Integer.MAX_VALUE, generalCost));
        children.add(new Property("specificCost", "", "Costs associated with the coverage provided by the product-plan.", 0, java.lang.Integer.MAX_VALUE, specificCost));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Identifiers, such as the plan ID and/or group ID associated with the insurance plan.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of plan. For example, \"Platinum\" or \"High Deductable\".", 0, 1, type);
        case -309474065: /*product*/  return new Property("product", "Reference(InsuranceProduct)", "The product that this plan is available under.", 0, 1, product);
        case -1532328299: /*coverageArea*/  return new Property("coverageArea", "Reference(Location)", "The geographic region in which a health insurance plan's benefits apply.", 0, java.lang.Integer.MAX_VALUE, coverageArea);
        case 1843485230: /*network*/  return new Property("network", "Reference(Organization)", "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network);
        case 878344405: /*generalCost*/  return new Property("generalCost", "", "Overall costs associated with the plan.", 0, java.lang.Integer.MAX_VALUE, generalCost);
        case -1205656545: /*specificCost*/  return new Property("specificCost", "", "Costs associated with the coverage provided by the product-plan.", 0, java.lang.Integer.MAX_VALUE, specificCost);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -309474065: /*product*/ return this.product == null ? new Base[0] : new Base[] {this.product}; // Reference
        case -1532328299: /*coverageArea*/ return this.coverageArea == null ? new Base[0] : this.coverageArea.toArray(new Base[this.coverageArea.size()]); // Reference
        case 1843485230: /*network*/ return this.network == null ? new Base[0] : this.network.toArray(new Base[this.network.size()]); // Reference
        case 878344405: /*generalCost*/ return this.generalCost == null ? new Base[0] : this.generalCost.toArray(new Base[this.generalCost.size()]); // InsurancePlanGeneralCostComponent
        case -1205656545: /*specificCost*/ return this.specificCost == null ? new Base[0] : this.specificCost.toArray(new Base[this.specificCost.size()]); // InsurancePlanSpecificCostComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -309474065: // product
          this.product = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1532328299: // coverageArea
          this.getCoverageArea().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 1843485230: // network
          this.getNetwork().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 878344405: // generalCost
          this.getGeneralCost().add((InsurancePlanGeneralCostComponent) value); // InsurancePlanGeneralCostComponent
          return value;
        case -1205656545: // specificCost
          this.getSpecificCost().add((InsurancePlanSpecificCostComponent) value); // InsurancePlanSpecificCostComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("product")) {
          this.product = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("coverageArea")) {
          this.getCoverageArea().add(TypeConvertor.castToReference(value));
        } else if (name.equals("network")) {
          this.getNetwork().add(TypeConvertor.castToReference(value));
        } else if (name.equals("generalCost")) {
          this.getGeneralCost().add((InsurancePlanGeneralCostComponent) value);
        } else if (name.equals("specificCost")) {
          this.getSpecificCost().add((InsurancePlanSpecificCostComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case 3575610:  return getType();
        case -309474065:  return getProduct();
        case -1532328299:  return addCoverageArea(); 
        case 1843485230:  return addNetwork(); 
        case 878344405:  return addGeneralCost(); 
        case -1205656545:  return addSpecificCost(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -309474065: /*product*/ return new String[] {"Reference"};
        case -1532328299: /*coverageArea*/ return new String[] {"Reference"};
        case 1843485230: /*network*/ return new String[] {"Reference"};
        case 878344405: /*generalCost*/ return new String[] {};
        case -1205656545: /*specificCost*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("product")) {
          this.product = new Reference();
          return this.product;
        }
        else if (name.equals("coverageArea")) {
          return addCoverageArea();
        }
        else if (name.equals("network")) {
          return addNetwork();
        }
        else if (name.equals("generalCost")) {
          return addGeneralCost();
        }
        else if (name.equals("specificCost")) {
          return addSpecificCost();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "InsurancePlan";

  }

      public InsurancePlan copy() {
        InsurancePlan dst = new InsurancePlan();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsurancePlan dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.product = product == null ? null : product.copy();
        if (coverageArea != null) {
          dst.coverageArea = new ArrayList<Reference>();
          for (Reference i : coverageArea)
            dst.coverageArea.add(i.copy());
        };
        if (network != null) {
          dst.network = new ArrayList<Reference>();
          for (Reference i : network)
            dst.network.add(i.copy());
        };
        if (generalCost != null) {
          dst.generalCost = new ArrayList<InsurancePlanGeneralCostComponent>();
          for (InsurancePlanGeneralCostComponent i : generalCost)
            dst.generalCost.add(i.copy());
        };
        if (specificCost != null) {
          dst.specificCost = new ArrayList<InsurancePlanSpecificCostComponent>();
          for (InsurancePlanSpecificCostComponent i : specificCost)
            dst.specificCost.add(i.copy());
        };
      }

      protected InsurancePlan typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsurancePlan))
          return false;
        InsurancePlan o = (InsurancePlan) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(type, o.type, true) && compareDeep(product, o.product, true)
           && compareDeep(coverageArea, o.coverageArea, true) && compareDeep(network, o.network, true) && compareDeep(generalCost, o.generalCost, true)
           && compareDeep(specificCost, o.specificCost, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsurancePlan))
          return false;
        InsurancePlan o = (InsurancePlan) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, type, product
          , coverageArea, network, generalCost, specificCost);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.InsurancePlan;
   }

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>A code for the type of insurance plan</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="InsurancePlan.type", description="A code for the type of insurance plan", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>A code for the type of insurance plan</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);

 /**
   * Search parameter: <b>network</b>
   * <p>
   * Description: <b>The product this plan is available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.network</b><br>
   * </p>
   */
  @SearchParamDefinition(name="network", path="InsurancePlan.network", description="The product this plan is available to", type="reference", target={Organization.class } )
  public static final String SP_NETWORK = "network";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>network</b>
   * <p>
   * Description: <b>The product this plan is available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.network</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam NETWORK = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_NETWORK);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsurancePlan:network</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_NETWORK = new ca.uhn.fhir.model.api.Include("InsurancePlan:network").toLocked();

 /**
   * Search parameter: <b>product</b>
   * <p>
   * Description: <b>The product this plan is available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.product</b><br>
   * </p>
   */
  @SearchParamDefinition(name="product", path="InsurancePlan.product", description="The product this plan is available to", type="reference", target={InsuranceProduct.class } )
  public static final String SP_PRODUCT = "product";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>product</b>
   * <p>
   * Description: <b>The product this plan is available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.product</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PRODUCT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PRODUCT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsurancePlan:product</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PRODUCT = new ca.uhn.fhir.model.api.Include("InsurancePlan:product").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifiers for this item</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="InsurancePlan.identifier", description="External identifiers for this item", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifiers for this item</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsurancePlan.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>coverage-area</b>
   * <p>
   * Description: <b>Location(s) insurance product is intended for/available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.coverageArea</b><br>
   * </p>
   */
  @SearchParamDefinition(name="coverage-area", path="InsurancePlan.coverageArea", description="Location(s) insurance product is intended for/available to", type="reference", target={Location.class } )
  public static final String SP_COVERAGE_AREA = "coverage-area";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>coverage-area</b>
   * <p>
   * Description: <b>Location(s) insurance product is intended for/available to</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsurancePlan.coverageArea</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COVERAGE_AREA = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_COVERAGE_AREA);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsurancePlan:coverage-area</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COVERAGE_AREA = new ca.uhn.fhir.model.api.Include("InsurancePlan:coverage-area").toLocked();


}

