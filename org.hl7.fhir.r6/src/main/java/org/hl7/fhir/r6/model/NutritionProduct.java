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
 * A food or supplement that is consumed by patients.
 */
@ResourceDef(name="NutritionProduct", profile="http://hl7.org/fhir/StructureDefinition/NutritionProduct")
public class NutritionProduct extends DomainResource {

    public enum NutritionProductStatus {
        /**
         * The product can be used.
         */
        ACTIVE, 
        /**
         * The product is not expected or allowed to be used.
         */
        INACTIVE, 
        /**
         * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).
         */
        ENTEREDINERROR, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static NutritionProductStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("inactive".equals(codeString))
          return INACTIVE;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown NutritionProductStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case INACTIVE: return "inactive";
            case ENTEREDINERROR: return "entered-in-error";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACTIVE: return "http://hl7.org/fhir/nutritionproduct-status";
            case INACTIVE: return "http://hl7.org/fhir/nutritionproduct-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/nutritionproduct-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "The product can be used.";
            case INACTIVE: return "The product is not expected or allowed to be used.";
            case ENTEREDINERROR: return "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case INACTIVE: return "Inactive";
            case ENTEREDINERROR: return "Entered in Error";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class NutritionProductStatusEnumFactory implements EnumFactory<NutritionProductStatus> {
    public NutritionProductStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return NutritionProductStatus.ACTIVE;
        if ("inactive".equals(codeString))
          return NutritionProductStatus.INACTIVE;
        if ("entered-in-error".equals(codeString))
          return NutritionProductStatus.ENTEREDINERROR;
        throw new IllegalArgumentException("Unknown NutritionProductStatus code '"+codeString+"'");
        }
        public Enumeration<NutritionProductStatus> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<NutritionProductStatus>(this, NutritionProductStatus.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<NutritionProductStatus>(this, NutritionProductStatus.NULL, code);
        if ("active".equals(codeString))
          return new Enumeration<NutritionProductStatus>(this, NutritionProductStatus.ACTIVE, code);
        if ("inactive".equals(codeString))
          return new Enumeration<NutritionProductStatus>(this, NutritionProductStatus.INACTIVE, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<NutritionProductStatus>(this, NutritionProductStatus.ENTEREDINERROR, code);
        throw new FHIRException("Unknown NutritionProductStatus code '"+codeString+"'");
        }
    public String toCode(NutritionProductStatus code) {
      if (code == NutritionProductStatus.ACTIVE)
        return "active";
      if (code == NutritionProductStatus.INACTIVE)
        return "inactive";
      if (code == NutritionProductStatus.ENTEREDINERROR)
        return "entered-in-error";
      return "?";
      }
    public String toSystem(NutritionProductStatus code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class NutritionProductNutrientComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The (relevant) nutrients in the product.
         */
        @Child(name = "item", type = {CodeableReference.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The (relevant) nutrients in the product", formalDefinition="The (relevant) nutrients in the product." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/nutrient-code")
        protected CodeableReference item;

        /**
         * The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.
         */
        @Child(name = "amount", type = {Ratio.class, Quantity.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The amount of nutrient present in the product", formalDefinition="The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount." )
        protected DataType amount;

        private static final long serialVersionUID = -347556307L;

    /**
     * Constructor
     */
      public NutritionProductNutrientComponent() {
        super();
      }

    /**
     * Constructor
     */
      public NutritionProductNutrientComponent(CodeableReference item) {
        super();
        this.setItem(item);
      }

        /**
         * @return {@link #item} (The (relevant) nutrients in the product.)
         */
        public CodeableReference getItem() { 
          if (this.item == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductNutrientComponent.item");
            else if (Configuration.doAutoCreate())
              this.item = new CodeableReference(); // cc
          return this.item;
        }

        public boolean hasItem() { 
          return this.item != null && !this.item.isEmpty();
        }

        /**
         * @param value {@link #item} (The (relevant) nutrients in the product.)
         */
        public NutritionProductNutrientComponent setItem(CodeableReference value) { 
          this.item = value;
          return this;
        }

        /**
         * @return {@link #amount} (The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.)
         */
        public DataType getAmount() { 
          return this.amount;
        }

        /**
         * @return {@link #amount} (The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.)
         */
        public Ratio getAmountRatio() throws FHIRException { 
          if (this.amount == null)
            this.amount = new Ratio();
          if (!(this.amount instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but "+this.amount.getClass().getName()+" was encountered");
          return (Ratio) this.amount;
        }

        public boolean hasAmountRatio() { 
          return this.amount != null && this.amount instanceof Ratio;
        }

        /**
         * @return {@link #amount} (The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.)
         */
        public Quantity getAmountQuantity() throws FHIRException { 
          if (this.amount == null)
            this.amount = new Quantity();
          if (!(this.amount instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.amount.getClass().getName()+" was encountered");
          return (Quantity) this.amount;
        }

        public boolean hasAmountQuantity() { 
          return this.amount != null && this.amount instanceof Quantity;
        }

        public boolean hasAmount() { 
          return this.amount != null && !this.amount.isEmpty();
        }

        /**
         * @param value {@link #amount} (The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.)
         */
        public NutritionProductNutrientComponent setAmount(DataType value) { 
          if (value != null && !(value instanceof Ratio || value instanceof Quantity))
            throw new FHIRException("Not the right type for NutritionProduct.nutrient.amount[x]: "+value.fhirType());
          this.amount = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("item", "CodeableReference(SubstanceDefinition)", "The (relevant) nutrients in the product.", 0, 1, item));
          children.add(new Property("amount[x]", "Ratio|Quantity", "The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.", 0, 1, amount));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3242771: /*item*/  return new Property("item", "CodeableReference(SubstanceDefinition)", "The (relevant) nutrients in the product.", 0, 1, item);
          case 646780200: /*amount[x]*/  return new Property("amount[x]", "Ratio|Quantity", "The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.", 0, 1, amount);
          case -1413853096: /*amount*/  return new Property("amount[x]", "Ratio|Quantity", "The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.", 0, 1, amount);
          case -1223457133: /*amountRatio*/  return new Property("amount[x]", "Ratio", "The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.", 0, 1, amount);
          case 1664303363: /*amountQuantity*/  return new Property("amount[x]", "Quantity", "The amount of nutrient expressed in one or more units, either X per pack / per serving / per dose or X amount.", 0, 1, amount);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3242771: /*item*/ return this.item == null ? new Base[0] : new Base[] {this.item}; // CodeableReference
        case -1413853096: /*amount*/ return this.amount == null ? new Base[0] : new Base[] {this.amount}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3242771: // item
          this.item = TypeConvertor.castToCodeableReference(value); // CodeableReference
          return value;
        case -1413853096: // amount
          this.amount = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("item")) {
          this.item = TypeConvertor.castToCodeableReference(value); // CodeableReference
        } else if (name.equals("amount[x]")) {
          this.amount = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3242771:  return getItem();
        case 646780200:  return getAmount();
        case -1413853096:  return getAmount();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3242771: /*item*/ return new String[] {"CodeableReference"};
        case -1413853096: /*amount*/ return new String[] {"Ratio", "Quantity"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("item")) {
          this.item = new CodeableReference();
          return this.item;
        }
        else if (name.equals("amountRatio")) {
          this.amount = new Ratio();
          return this.amount;
        }
        else if (name.equals("amountQuantity")) {
          this.amount = new Quantity();
          return this.amount;
        }
        else
          return super.addChild(name);
      }

      public NutritionProductNutrientComponent copy() {
        NutritionProductNutrientComponent dst = new NutritionProductNutrientComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(NutritionProductNutrientComponent dst) {
        super.copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.amount = amount == null ? null : amount.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof NutritionProductNutrientComponent))
          return false;
        NutritionProductNutrientComponent o = (NutritionProductNutrientComponent) other_;
        return compareDeep(item, o.item, true) && compareDeep(amount, o.amount, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof NutritionProductNutrientComponent))
          return false;
        NutritionProductNutrientComponent o = (NutritionProductNutrientComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(item, amount);
      }

  public String fhirType() {
    return "NutritionProduct.nutrient";

  }

  }

    @Block()
    public static class NutritionProductIngredientComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The ingredient contained in the product.
         */
        @Child(name = "item", type = {CodeableReference.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The ingredient contained in the product", formalDefinition="The ingredient contained in the product." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/edible-substance-type")
        protected CodeableReference item;

        /**
         * The amount of ingredient that is in the product.
         */
        @Child(name = "amount", type = {Ratio.class, Quantity.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The amount of ingredient that is in the product", formalDefinition="The amount of ingredient that is in the product." )
        protected DataType amount;

        /**
         * A known or suspected allergenic and/or substance that is associated with an intolerance.
         */
        @Child(name = "allergen", type = {BooleanType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="A known or suspected allergenic and/or substance that is associated with an intolerance", formalDefinition="A known or suspected allergenic and/or substance that is associated with an intolerance." )
        protected BooleanType allergen;

        private static final long serialVersionUID = -887224423L;

    /**
     * Constructor
     */
      public NutritionProductIngredientComponent() {
        super();
      }

    /**
     * Constructor
     */
      public NutritionProductIngredientComponent(CodeableReference item) {
        super();
        this.setItem(item);
      }

        /**
         * @return {@link #item} (The ingredient contained in the product.)
         */
        public CodeableReference getItem() { 
          if (this.item == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductIngredientComponent.item");
            else if (Configuration.doAutoCreate())
              this.item = new CodeableReference(); // cc
          return this.item;
        }

        public boolean hasItem() { 
          return this.item != null && !this.item.isEmpty();
        }

        /**
         * @param value {@link #item} (The ingredient contained in the product.)
         */
        public NutritionProductIngredientComponent setItem(CodeableReference value) { 
          this.item = value;
          return this;
        }

        /**
         * @return {@link #amount} (The amount of ingredient that is in the product.)
         */
        public DataType getAmount() { 
          return this.amount;
        }

        /**
         * @return {@link #amount} (The amount of ingredient that is in the product.)
         */
        public Ratio getAmountRatio() throws FHIRException { 
          if (this.amount == null)
            this.amount = new Ratio();
          if (!(this.amount instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but "+this.amount.getClass().getName()+" was encountered");
          return (Ratio) this.amount;
        }

        public boolean hasAmountRatio() { 
          return this.amount != null && this.amount instanceof Ratio;
        }

        /**
         * @return {@link #amount} (The amount of ingredient that is in the product.)
         */
        public Quantity getAmountQuantity() throws FHIRException { 
          if (this.amount == null)
            this.amount = new Quantity();
          if (!(this.amount instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.amount.getClass().getName()+" was encountered");
          return (Quantity) this.amount;
        }

        public boolean hasAmountQuantity() { 
          return this.amount != null && this.amount instanceof Quantity;
        }

        public boolean hasAmount() { 
          return this.amount != null && !this.amount.isEmpty();
        }

        /**
         * @param value {@link #amount} (The amount of ingredient that is in the product.)
         */
        public NutritionProductIngredientComponent setAmount(DataType value) { 
          if (value != null && !(value instanceof Ratio || value instanceof Quantity))
            throw new FHIRException("Not the right type for NutritionProduct.ingredient.amount[x]: "+value.fhirType());
          this.amount = value;
          return this;
        }

        /**
         * @return {@link #allergen} (A known or suspected allergenic and/or substance that is associated with an intolerance.). This is the underlying object with id, value and extensions. The accessor "getAllergen" gives direct access to the value
         */
        public BooleanType getAllergenElement() { 
          if (this.allergen == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductIngredientComponent.allergen");
            else if (Configuration.doAutoCreate())
              this.allergen = new BooleanType(); // bb
          return this.allergen;
        }

        public boolean hasAllergenElement() { 
          return this.allergen != null && !this.allergen.isEmpty();
        }

        public boolean hasAllergen() { 
          return this.allergen != null && !this.allergen.isEmpty();
        }

        /**
         * @param value {@link #allergen} (A known or suspected allergenic and/or substance that is associated with an intolerance.). This is the underlying object with id, value and extensions. The accessor "getAllergen" gives direct access to the value
         */
        public NutritionProductIngredientComponent setAllergenElement(BooleanType value) { 
          this.allergen = value;
          return this;
        }

        /**
         * @return A known or suspected allergenic and/or substance that is associated with an intolerance.
         */
        public boolean getAllergen() { 
          return this.allergen == null || this.allergen.isEmpty() ? false : this.allergen.getValue();
        }

        /**
         * @param value A known or suspected allergenic and/or substance that is associated with an intolerance.
         */
        public NutritionProductIngredientComponent setAllergen(boolean value) { 
            if (this.allergen == null)
              this.allergen = new BooleanType();
            this.allergen.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("item", "CodeableReference(NutritionProduct)", "The ingredient contained in the product.", 0, 1, item));
          children.add(new Property("amount[x]", "Ratio|Quantity", "The amount of ingredient that is in the product.", 0, 1, amount));
          children.add(new Property("allergen", "boolean", "A known or suspected allergenic and/or substance that is associated with an intolerance.", 0, 1, allergen));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3242771: /*item*/  return new Property("item", "CodeableReference(NutritionProduct)", "The ingredient contained in the product.", 0, 1, item);
          case 646780200: /*amount[x]*/  return new Property("amount[x]", "Ratio|Quantity", "The amount of ingredient that is in the product.", 0, 1, amount);
          case -1413853096: /*amount*/  return new Property("amount[x]", "Ratio|Quantity", "The amount of ingredient that is in the product.", 0, 1, amount);
          case -1223457133: /*amountRatio*/  return new Property("amount[x]", "Ratio", "The amount of ingredient that is in the product.", 0, 1, amount);
          case 1664303363: /*amountQuantity*/  return new Property("amount[x]", "Quantity", "The amount of ingredient that is in the product.", 0, 1, amount);
          case 1803750018: /*allergen*/  return new Property("allergen", "boolean", "A known or suspected allergenic and/or substance that is associated with an intolerance.", 0, 1, allergen);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3242771: /*item*/ return this.item == null ? new Base[0] : new Base[] {this.item}; // CodeableReference
        case -1413853096: /*amount*/ return this.amount == null ? new Base[0] : new Base[] {this.amount}; // DataType
        case 1803750018: /*allergen*/ return this.allergen == null ? new Base[0] : new Base[] {this.allergen}; // BooleanType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3242771: // item
          this.item = TypeConvertor.castToCodeableReference(value); // CodeableReference
          return value;
        case -1413853096: // amount
          this.amount = TypeConvertor.castToType(value); // DataType
          return value;
        case 1803750018: // allergen
          this.allergen = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("item")) {
          this.item = TypeConvertor.castToCodeableReference(value); // CodeableReference
        } else if (name.equals("amount[x]")) {
          this.amount = TypeConvertor.castToType(value); // DataType
        } else if (name.equals("allergen")) {
          this.allergen = TypeConvertor.castToBoolean(value); // BooleanType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3242771:  return getItem();
        case 646780200:  return getAmount();
        case -1413853096:  return getAmount();
        case 1803750018:  return getAllergenElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3242771: /*item*/ return new String[] {"CodeableReference"};
        case -1413853096: /*amount*/ return new String[] {"Ratio", "Quantity"};
        case 1803750018: /*allergen*/ return new String[] {"boolean"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("item")) {
          this.item = new CodeableReference();
          return this.item;
        }
        else if (name.equals("amountRatio")) {
          this.amount = new Ratio();
          return this.amount;
        }
        else if (name.equals("amountQuantity")) {
          this.amount = new Quantity();
          return this.amount;
        }
        else if (name.equals("allergen")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.ingredient.allergen");
        }
        else
          return super.addChild(name);
      }

      public NutritionProductIngredientComponent copy() {
        NutritionProductIngredientComponent dst = new NutritionProductIngredientComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(NutritionProductIngredientComponent dst) {
        super.copyValues(dst);
        dst.item = item == null ? null : item.copy();
        dst.amount = amount == null ? null : amount.copy();
        dst.allergen = allergen == null ? null : allergen.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof NutritionProductIngredientComponent))
          return false;
        NutritionProductIngredientComponent o = (NutritionProductIngredientComponent) other_;
        return compareDeep(item, o.item, true) && compareDeep(amount, o.amount, true) && compareDeep(allergen, o.allergen, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof NutritionProductIngredientComponent))
          return false;
        NutritionProductIngredientComponent o = (NutritionProductIngredientComponent) other_;
        return compareValues(allergen, o.allergen, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(item, amount, allergen);
      }

  public String fhirType() {
    return "NutritionProduct.ingredient";

  }

  }

    @Block()
    public static class NutritionProductCharacteristicComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A code specifying which characteristic of the product is being described (for example, colour, shape).
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Code specifying the type of characteristic", formalDefinition="A code specifying which characteristic of the product is being described (for example, colour, shape)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/measurement-property")
        protected CodeableConcept type;

        /**
         * The actual characteristic value corresponding to the type.
         */
        @Child(name = "value", type = {CodeableConcept.class, StringType.class, Quantity.class, Base64BinaryType.class, Attachment.class, BooleanType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The value of the characteristic", formalDefinition="The actual characteristic value corresponding to the type." )
        protected DataType value;

        private static final long serialVersionUID = -1659186716L;

    /**
     * Constructor
     */
      public NutritionProductCharacteristicComponent() {
        super();
      }

    /**
     * Constructor
     */
      public NutritionProductCharacteristicComponent(CodeableConcept type, DataType value) {
        super();
        this.setType(type);
        this.setValue(value);
      }

        /**
         * @return {@link #type} (A code specifying which characteristic of the product is being described (for example, colour, shape).)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductCharacteristicComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (A code specifying which characteristic of the product is being described (for example, colour, shape).)
         */
        public NutritionProductCharacteristicComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public DataType getValue() { 
          return this.value;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public CodeableConcept getValueCodeableConcept() throws FHIRException { 
          if (this.value == null)
            this.value = new CodeableConcept();
          if (!(this.value instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.value.getClass().getName()+" was encountered");
          return (CodeableConcept) this.value;
        }

        public boolean hasValueCodeableConcept() { 
          return this.value != null && this.value instanceof CodeableConcept;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public StringType getValueStringType() throws FHIRException { 
          if (this.value == null)
            this.value = new StringType();
          if (!(this.value instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (StringType) this.value;
        }

        public boolean hasValueStringType() { 
          return this.value != null && this.value instanceof StringType;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public Quantity getValueQuantity() throws FHIRException { 
          if (this.value == null)
            this.value = new Quantity();
          if (!(this.value instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Quantity) this.value;
        }

        public boolean hasValueQuantity() { 
          return this.value != null && this.value instanceof Quantity;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public Base64BinaryType getValueBase64BinaryType() throws FHIRException { 
          if (this.value == null)
            this.value = new Base64BinaryType();
          if (!(this.value instanceof Base64BinaryType))
            throw new FHIRException("Type mismatch: the type Base64BinaryType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Base64BinaryType) this.value;
        }

        public boolean hasValueBase64BinaryType() { 
          return this.value != null && this.value instanceof Base64BinaryType;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public Attachment getValueAttachment() throws FHIRException { 
          if (this.value == null)
            this.value = new Attachment();
          if (!(this.value instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but "+this.value.getClass().getName()+" was encountered");
          return (Attachment) this.value;
        }

        public boolean hasValueAttachment() { 
          return this.value != null && this.value instanceof Attachment;
        }

        /**
         * @return {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public BooleanType getValueBooleanType() throws FHIRException { 
          if (this.value == null)
            this.value = new BooleanType();
          if (!(this.value instanceof BooleanType))
            throw new FHIRException("Type mismatch: the type BooleanType was expected, but "+this.value.getClass().getName()+" was encountered");
          return (BooleanType) this.value;
        }

        public boolean hasValueBooleanType() { 
          return this.value != null && this.value instanceof BooleanType;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The actual characteristic value corresponding to the type.)
         */
        public NutritionProductCharacteristicComponent setValue(DataType value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof StringType || value instanceof Quantity || value instanceof Base64BinaryType || value instanceof Attachment || value instanceof BooleanType))
            throw new FHIRException("Not the right type for NutritionProduct.characteristic.value[x]: "+value.fhirType());
          this.value = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "A code specifying which characteristic of the product is being described (for example, colour, shape).", 0, 1, type));
          children.add(new Property("value[x]", "CodeableConcept|string|Quantity|base64Binary|Attachment|boolean", "The actual characteristic value corresponding to the type.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "A code specifying which characteristic of the product is being described (for example, colour, shape).", 0, 1, type);
          case -1410166417: /*value[x]*/  return new Property("value[x]", "CodeableConcept|string|Quantity|base64Binary|Attachment|boolean", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case 111972721: /*value*/  return new Property("value[x]", "CodeableConcept|string|Quantity|base64Binary|Attachment|boolean", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case 924902896: /*valueCodeableConcept*/  return new Property("value[x]", "CodeableConcept", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case -1424603934: /*valueString*/  return new Property("value[x]", "string", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case -2029823716: /*valueQuantity*/  return new Property("value[x]", "Quantity", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case -1535024575: /*valueBase64Binary*/  return new Property("value[x]", "base64Binary", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case -475566732: /*valueAttachment*/  return new Property("value[x]", "Attachment", "The actual characteristic value corresponding to the type.", 0, 1, value);
          case 733421943: /*valueBoolean*/  return new Property("value[x]", "boolean", "The actual characteristic value corresponding to the type.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DataType
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
          this.value = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("value[x]")) {
          this.value = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case -1410166417:  return getValue();
        case 111972721:  return getValue();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 111972721: /*value*/ return new String[] {"CodeableConcept", "string", "Quantity", "base64Binary", "Attachment", "boolean"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("valueCodeableConcept")) {
          this.value = new CodeableConcept();
          return this.value;
        }
        else if (name.equals("valueString")) {
          this.value = new StringType();
          return this.value;
        }
        else if (name.equals("valueQuantity")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("valueBase64Binary")) {
          this.value = new Base64BinaryType();
          return this.value;
        }
        else if (name.equals("valueAttachment")) {
          this.value = new Attachment();
          return this.value;
        }
        else if (name.equals("valueBoolean")) {
          this.value = new BooleanType();
          return this.value;
        }
        else
          return super.addChild(name);
      }

      public NutritionProductCharacteristicComponent copy() {
        NutritionProductCharacteristicComponent dst = new NutritionProductCharacteristicComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(NutritionProductCharacteristicComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof NutritionProductCharacteristicComponent))
          return false;
        NutritionProductCharacteristicComponent o = (NutritionProductCharacteristicComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof NutritionProductCharacteristicComponent))
          return false;
        NutritionProductCharacteristicComponent o = (NutritionProductCharacteristicComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, value);
      }

  public String fhirType() {
    return "NutritionProduct.characteristic";

  }

  }

    @Block()
    public static class NutritionProductInstanceComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.
         */
        @Child(name = "quantity", type = {Quantity.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The amount of items or instances", formalDefinition="The amount of items or instances that the resource considers, for instance when referring to 2 identical units together." )
        protected Quantity quantity;

        /**
         * The identifier for the physical instance, typically a serial number or manufacturer number.
         */
        @Child(name = "identifier", type = {Identifier.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="The identifier for the physical instance, typically a serial number or manufacturer number", formalDefinition="The identifier for the physical instance, typically a serial number or manufacturer number." )
        protected List<Identifier> identifier;

        /**
         * The name or brand for the specific product.
         */
        @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The name or brand for the specific product", formalDefinition="The name or brand for the specific product." )
        protected StringType name;

        /**
         * The identification of the batch or lot of the product.
         */
        @Child(name = "lotNumber", type = {StringType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The identification of the batch or lot of the product", formalDefinition="The identification of the batch or lot of the product." )
        protected StringType lotNumber;

        /**
         * The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
         */
        @Child(name = "expiry", type = {DateTimeType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The expiry date or date and time for the product", formalDefinition="The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed." )
        protected DateTimeType expiry;

        /**
         * The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
         */
        @Child(name = "useBy", type = {DateTimeType.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The date until which the product is expected to be good for consumption", formalDefinition="The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed." )
        protected DateTimeType useBy;

        /**
         * An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived.
         */
        @Child(name = "biologicalSourceEvent", type = {Identifier.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived", formalDefinition="An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived." )
        protected Identifier biologicalSourceEvent;

        private static final long serialVersionUID = -954985011L;

    /**
     * Constructor
     */
      public NutritionProductInstanceComponent() {
        super();
      }

        /**
         * @return {@link #quantity} (The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.)
         */
        public Quantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductInstanceComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new Quantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.)
         */
        public NutritionProductInstanceComponent setQuantity(Quantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #identifier} (The identifier for the physical instance, typically a serial number or manufacturer number.)
         */
        public List<Identifier> getIdentifier() { 
          if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
          return this.identifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public NutritionProductInstanceComponent setIdentifier(List<Identifier> theIdentifier) { 
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

        public NutritionProductInstanceComponent addIdentifier(Identifier t) { //3
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
         * @return {@link #name} (The name or brand for the specific product.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductInstanceComponent.name");
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
         * @param value {@link #name} (The name or brand for the specific product.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public NutritionProductInstanceComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return The name or brand for the specific product.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value The name or brand for the specific product.
         */
        public NutritionProductInstanceComponent setName(String value) { 
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
         * @return {@link #lotNumber} (The identification of the batch or lot of the product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
         */
        public StringType getLotNumberElement() { 
          if (this.lotNumber == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductInstanceComponent.lotNumber");
            else if (Configuration.doAutoCreate())
              this.lotNumber = new StringType(); // bb
          return this.lotNumber;
        }

        public boolean hasLotNumberElement() { 
          return this.lotNumber != null && !this.lotNumber.isEmpty();
        }

        public boolean hasLotNumber() { 
          return this.lotNumber != null && !this.lotNumber.isEmpty();
        }

        /**
         * @param value {@link #lotNumber} (The identification of the batch or lot of the product.). This is the underlying object with id, value and extensions. The accessor "getLotNumber" gives direct access to the value
         */
        public NutritionProductInstanceComponent setLotNumberElement(StringType value) { 
          this.lotNumber = value;
          return this;
        }

        /**
         * @return The identification of the batch or lot of the product.
         */
        public String getLotNumber() { 
          return this.lotNumber == null ? null : this.lotNumber.getValue();
        }

        /**
         * @param value The identification of the batch or lot of the product.
         */
        public NutritionProductInstanceComponent setLotNumber(String value) { 
          if (Utilities.noString(value))
            this.lotNumber = null;
          else {
            if (this.lotNumber == null)
              this.lotNumber = new StringType();
            this.lotNumber.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #expiry} (The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
         */
        public DateTimeType getExpiryElement() { 
          if (this.expiry == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductInstanceComponent.expiry");
            else if (Configuration.doAutoCreate())
              this.expiry = new DateTimeType(); // bb
          return this.expiry;
        }

        public boolean hasExpiryElement() { 
          return this.expiry != null && !this.expiry.isEmpty();
        }

        public boolean hasExpiry() { 
          return this.expiry != null && !this.expiry.isEmpty();
        }

        /**
         * @param value {@link #expiry} (The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.). This is the underlying object with id, value and extensions. The accessor "getExpiry" gives direct access to the value
         */
        public NutritionProductInstanceComponent setExpiryElement(DateTimeType value) { 
          this.expiry = value;
          return this;
        }

        /**
         * @return The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
         */
        public Date getExpiry() { 
          return this.expiry == null ? null : this.expiry.getValue();
        }

        /**
         * @param value The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
         */
        public NutritionProductInstanceComponent setExpiry(Date value) { 
          if (value == null)
            this.expiry = null;
          else {
            if (this.expiry == null)
              this.expiry = new DateTimeType();
            this.expiry.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #useBy} (The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.). This is the underlying object with id, value and extensions. The accessor "getUseBy" gives direct access to the value
         */
        public DateTimeType getUseByElement() { 
          if (this.useBy == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductInstanceComponent.useBy");
            else if (Configuration.doAutoCreate())
              this.useBy = new DateTimeType(); // bb
          return this.useBy;
        }

        public boolean hasUseByElement() { 
          return this.useBy != null && !this.useBy.isEmpty();
        }

        public boolean hasUseBy() { 
          return this.useBy != null && !this.useBy.isEmpty();
        }

        /**
         * @param value {@link #useBy} (The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.). This is the underlying object with id, value and extensions. The accessor "getUseBy" gives direct access to the value
         */
        public NutritionProductInstanceComponent setUseByElement(DateTimeType value) { 
          this.useBy = value;
          return this;
        }

        /**
         * @return The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
         */
        public Date getUseBy() { 
          return this.useBy == null ? null : this.useBy.getValue();
        }

        /**
         * @param value The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.
         */
        public NutritionProductInstanceComponent setUseBy(Date value) { 
          if (value == null)
            this.useBy = null;
          else {
            if (this.useBy == null)
              this.useBy = new DateTimeType();
            this.useBy.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #biologicalSourceEvent} (An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived.)
         */
        public Identifier getBiologicalSourceEvent() { 
          if (this.biologicalSourceEvent == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create NutritionProductInstanceComponent.biologicalSourceEvent");
            else if (Configuration.doAutoCreate())
              this.biologicalSourceEvent = new Identifier(); // cc
          return this.biologicalSourceEvent;
        }

        public boolean hasBiologicalSourceEvent() { 
          return this.biologicalSourceEvent != null && !this.biologicalSourceEvent.isEmpty();
        }

        /**
         * @param value {@link #biologicalSourceEvent} (An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived.)
         */
        public NutritionProductInstanceComponent setBiologicalSourceEvent(Identifier value) { 
          this.biologicalSourceEvent = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("quantity", "Quantity", "The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.", 0, 1, quantity));
          children.add(new Property("identifier", "Identifier", "The identifier for the physical instance, typically a serial number or manufacturer number.", 0, java.lang.Integer.MAX_VALUE, identifier));
          children.add(new Property("name", "string", "The name or brand for the specific product.", 0, 1, name));
          children.add(new Property("lotNumber", "string", "The identification of the batch or lot of the product.", 0, 1, lotNumber));
          children.add(new Property("expiry", "dateTime", "The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.", 0, 1, expiry));
          children.add(new Property("useBy", "dateTime", "The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.", 0, 1, useBy));
          children.add(new Property("biologicalSourceEvent", "Identifier", "An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived.", 0, 1, biologicalSourceEvent));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1285004149: /*quantity*/  return new Property("quantity", "Quantity", "The amount of items or instances that the resource considers, for instance when referring to 2 identical units together.", 0, 1, quantity);
          case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "The identifier for the physical instance, typically a serial number or manufacturer number.", 0, java.lang.Integer.MAX_VALUE, identifier);
          case 3373707: /*name*/  return new Property("name", "string", "The name or brand for the specific product.", 0, 1, name);
          case 462547450: /*lotNumber*/  return new Property("lotNumber", "string", "The identification of the batch or lot of the product.", 0, 1, lotNumber);
          case -1289159373: /*expiry*/  return new Property("expiry", "dateTime", "The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.", 0, 1, expiry);
          case 111577150: /*useBy*/  return new Property("useBy", "dateTime", "The time after which the product is no longer expected to be in proper condition, or its use is not advised or not allowed.", 0, 1, useBy);
          case -654468482: /*biologicalSourceEvent*/  return new Property("biologicalSourceEvent", "Identifier", "An identifier of the donation, collection, or pooling event from which biological material in this nutrition product was derived.", 0, 1, biologicalSourceEvent);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // Quantity
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 462547450: /*lotNumber*/ return this.lotNumber == null ? new Base[0] : new Base[] {this.lotNumber}; // StringType
        case -1289159373: /*expiry*/ return this.expiry == null ? new Base[0] : new Base[] {this.expiry}; // DateTimeType
        case 111577150: /*useBy*/ return this.useBy == null ? new Base[0] : new Base[] {this.useBy}; // DateTimeType
        case -654468482: /*biologicalSourceEvent*/ return this.biologicalSourceEvent == null ? new Base[0] : new Base[] {this.biologicalSourceEvent}; // Identifier
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1285004149: // quantity
          this.quantity = TypeConvertor.castToQuantity(value); // Quantity
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 462547450: // lotNumber
          this.lotNumber = TypeConvertor.castToString(value); // StringType
          return value;
        case -1289159373: // expiry
          this.expiry = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 111577150: // useBy
          this.useBy = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -654468482: // biologicalSourceEvent
          this.biologicalSourceEvent = TypeConvertor.castToIdentifier(value); // Identifier
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("quantity")) {
          this.quantity = TypeConvertor.castToQuantity(value); // Quantity
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("lotNumber")) {
          this.lotNumber = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("expiry")) {
          this.expiry = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("useBy")) {
          this.useBy = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("biologicalSourceEvent")) {
          this.biologicalSourceEvent = TypeConvertor.castToIdentifier(value); // Identifier
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1285004149:  return getQuantity();
        case -1618432855:  return addIdentifier(); 
        case 3373707:  return getNameElement();
        case 462547450:  return getLotNumberElement();
        case -1289159373:  return getExpiryElement();
        case 111577150:  return getUseByElement();
        case -654468482:  return getBiologicalSourceEvent();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1285004149: /*quantity*/ return new String[] {"Quantity"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 3373707: /*name*/ return new String[] {"string"};
        case 462547450: /*lotNumber*/ return new String[] {"string"};
        case -1289159373: /*expiry*/ return new String[] {"dateTime"};
        case 111577150: /*useBy*/ return new String[] {"dateTime"};
        case -654468482: /*biologicalSourceEvent*/ return new String[] {"Identifier"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("quantity")) {
          this.quantity = new Quantity();
          return this.quantity;
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.instance.name");
        }
        else if (name.equals("lotNumber")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.instance.lotNumber");
        }
        else if (name.equals("expiry")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.instance.expiry");
        }
        else if (name.equals("useBy")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.instance.useBy");
        }
        else if (name.equals("biologicalSourceEvent")) {
          this.biologicalSourceEvent = new Identifier();
          return this.biologicalSourceEvent;
        }
        else
          return super.addChild(name);
      }

      public NutritionProductInstanceComponent copy() {
        NutritionProductInstanceComponent dst = new NutritionProductInstanceComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(NutritionProductInstanceComponent dst) {
        super.copyValues(dst);
        dst.quantity = quantity == null ? null : quantity.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.name = name == null ? null : name.copy();
        dst.lotNumber = lotNumber == null ? null : lotNumber.copy();
        dst.expiry = expiry == null ? null : expiry.copy();
        dst.useBy = useBy == null ? null : useBy.copy();
        dst.biologicalSourceEvent = biologicalSourceEvent == null ? null : biologicalSourceEvent.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof NutritionProductInstanceComponent))
          return false;
        NutritionProductInstanceComponent o = (NutritionProductInstanceComponent) other_;
        return compareDeep(quantity, o.quantity, true) && compareDeep(identifier, o.identifier, true) && compareDeep(name, o.name, true)
           && compareDeep(lotNumber, o.lotNumber, true) && compareDeep(expiry, o.expiry, true) && compareDeep(useBy, o.useBy, true)
           && compareDeep(biologicalSourceEvent, o.biologicalSourceEvent, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof NutritionProductInstanceComponent))
          return false;
        NutritionProductInstanceComponent o = (NutritionProductInstanceComponent) other_;
        return compareValues(name, o.name, true) && compareValues(lotNumber, o.lotNumber, true) && compareValues(expiry, o.expiry, true)
           && compareValues(useBy, o.useBy, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(quantity, identifier, name
          , lotNumber, expiry, useBy, biologicalSourceEvent);
      }

  public String fhirType() {
    return "NutritionProduct.instance";

  }

  }

    /**
     * A code that specifies the product or a textual description if no code is available. This could be such codes as a USDA Branded Food Products Database number, a USDA Food Data Central (FDC) ID number, Universal Product Code (UPC), a Langual code, or a country specific food database code.
     */
    @Child(name = "code", type = {CodeableConcept.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="A code that can identify the product", formalDefinition="A code that specifies the product or a textual description if no code is available. This could be such codes as a USDA Branded Food Products Database number, a USDA Food Data Central (FDC) ID number, Universal Product Code (UPC), a Langual code, or a country specific food database code." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/edible-substance-type")
    protected CodeableConcept code;

    /**
     * The current state of the product.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | inactive | entered-in-error", formalDefinition="The current state of the product." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/nutritionproduct-status")
    protected Enumeration<NutritionProductStatus> status;

    /**
     * Nutrition products fall into various categories based on their composition (e.g., Fruit and Grain, Vegetables) or form (e.g., Beverages).
     */
    @Child(name = "category", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Broad product groups, like Fruit, Grain, Beverages, or Vegetables Products", formalDefinition="Nutrition products fall into various categories based on their composition (e.g., Fruit and Grain, Vegetables) or form (e.g., Beverages)." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/nutrition-product-category")
    protected List<CodeableConcept> category;

    /**
     * The organisation (manufacturer, representative or legal authorization holder) or person that is responsible for nutrition product.
     */
    @Child(name = "manufacturer", type = {Organization.class, RelatedPerson.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Manufacturer, representative or person officially responsible for the product", formalDefinition="The organisation (manufacturer, representative or legal authorization holder) or person that is responsible for nutrition product." )
    protected List<Reference> manufacturer;

    /**
     * The product's nutritional information expressed by the nutrients.
     */
    @Child(name = "nutrient", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The product's nutritional information expressed by the nutrients", formalDefinition="The product's nutritional information expressed by the nutrients." )
    protected List<NutritionProductNutrientComponent> nutrient;

    /**
     * The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.
     */
    @Child(name = "ingredientSummary", type = {MarkdownType.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Textual description of product ingredients", formalDefinition="The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'." )
    protected MarkdownType ingredientSummary;

    /**
     * Ingredients contained in this product.
     */
    @Child(name = "ingredient", type = {}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Ingredients contained in this product", formalDefinition="Ingredients contained in this product." )
    protected List<NutritionProductIngredientComponent> ingredient;

    /**
     * The amount of energy present in the product expressed in kilocalories or kilojoules.
     */
    @Child(name = "energy", type = {Quantity.class}, order=7, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The amount of energy present in the product expressed in kilocalories or kilojoules", formalDefinition="The amount of energy present in the product expressed in kilocalories or kilojoules." )
    protected Quantity energy;

    /**
     * Specifies descriptive properties of the nutrition product.
     */
    @Child(name = "characteristic", type = {}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Specifies descriptive properties of the nutrition product", formalDefinition="Specifies descriptive properties of the nutrition product." )
    protected List<NutritionProductCharacteristicComponent> characteristic;

    /**
     * Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product.
     */
    @Child(name = "instance", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="One or several physical instances or occurrences of the nutrition product", formalDefinition="Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product." )
    protected List<NutritionProductInstanceComponent> instance;

    /**
     * Comments made about the product.
     */
    @Child(name = "note", type = {Annotation.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Comments made about the product", formalDefinition="Comments made about the product." )
    protected List<Annotation> note;

    private static final long serialVersionUID = -39678103L;

  /**
   * Constructor
   */
    public NutritionProduct() {
      super();
    }

  /**
   * Constructor
   */
    public NutritionProduct(NutritionProductStatus status) {
      super();
      this.setStatus(status);
    }

    /**
     * @return {@link #code} (A code that specifies the product or a textual description if no code is available. This could be such codes as a USDA Branded Food Products Database number, a USDA Food Data Central (FDC) ID number, Universal Product Code (UPC), a Langual code, or a country specific food database code.)
     */
    public CodeableConcept getCode() { 
      if (this.code == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create NutritionProduct.code");
        else if (Configuration.doAutoCreate())
          this.code = new CodeableConcept(); // cc
      return this.code;
    }

    public boolean hasCode() { 
      return this.code != null && !this.code.isEmpty();
    }

    /**
     * @param value {@link #code} (A code that specifies the product or a textual description if no code is available. This could be such codes as a USDA Branded Food Products Database number, a USDA Food Data Central (FDC) ID number, Universal Product Code (UPC), a Langual code, or a country specific food database code.)
     */
    public NutritionProduct setCode(CodeableConcept value) { 
      this.code = value;
      return this;
    }

    /**
     * @return {@link #status} (The current state of the product.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<NutritionProductStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create NutritionProduct.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<NutritionProductStatus>(new NutritionProductStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The current state of the product.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public NutritionProduct setStatusElement(Enumeration<NutritionProductStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The current state of the product.
     */
    public NutritionProductStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The current state of the product.
     */
    public NutritionProduct setStatus(NutritionProductStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<NutritionProductStatus>(new NutritionProductStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #category} (Nutrition products fall into various categories based on their composition (e.g., Fruit and Grain, Vegetables) or form (e.g., Beverages).)
     */
    public List<CodeableConcept> getCategory() { 
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      return this.category;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setCategory(List<CodeableConcept> theCategory) { 
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

    public NutritionProduct addCategory(CodeableConcept t) { //3
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
     * @return {@link #manufacturer} (The organisation (manufacturer, representative or legal authorization holder) or person that is responsible for nutrition product.)
     */
    public List<Reference> getManufacturer() { 
      if (this.manufacturer == null)
        this.manufacturer = new ArrayList<Reference>();
      return this.manufacturer;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setManufacturer(List<Reference> theManufacturer) { 
      this.manufacturer = theManufacturer;
      return this;
    }

    public boolean hasManufacturer() { 
      if (this.manufacturer == null)
        return false;
      for (Reference item : this.manufacturer)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addManufacturer() { //3
      Reference t = new Reference();
      if (this.manufacturer == null)
        this.manufacturer = new ArrayList<Reference>();
      this.manufacturer.add(t);
      return t;
    }

    public NutritionProduct addManufacturer(Reference t) { //3
      if (t == null)
        return this;
      if (this.manufacturer == null)
        this.manufacturer = new ArrayList<Reference>();
      this.manufacturer.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #manufacturer}, creating it if it does not already exist {3}
     */
    public Reference getManufacturerFirstRep() { 
      if (getManufacturer().isEmpty()) {
        addManufacturer();
      }
      return getManufacturer().get(0);
    }

    /**
     * @return {@link #nutrient} (The product's nutritional information expressed by the nutrients.)
     */
    public List<NutritionProductNutrientComponent> getNutrient() { 
      if (this.nutrient == null)
        this.nutrient = new ArrayList<NutritionProductNutrientComponent>();
      return this.nutrient;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setNutrient(List<NutritionProductNutrientComponent> theNutrient) { 
      this.nutrient = theNutrient;
      return this;
    }

    public boolean hasNutrient() { 
      if (this.nutrient == null)
        return false;
      for (NutritionProductNutrientComponent item : this.nutrient)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public NutritionProductNutrientComponent addNutrient() { //3
      NutritionProductNutrientComponent t = new NutritionProductNutrientComponent();
      if (this.nutrient == null)
        this.nutrient = new ArrayList<NutritionProductNutrientComponent>();
      this.nutrient.add(t);
      return t;
    }

    public NutritionProduct addNutrient(NutritionProductNutrientComponent t) { //3
      if (t == null)
        return this;
      if (this.nutrient == null)
        this.nutrient = new ArrayList<NutritionProductNutrientComponent>();
      this.nutrient.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #nutrient}, creating it if it does not already exist {3}
     */
    public NutritionProductNutrientComponent getNutrientFirstRep() { 
      if (getNutrient().isEmpty()) {
        addNutrient();
      }
      return getNutrient().get(0);
    }

    /**
     * @return {@link #ingredientSummary} (The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.). This is the underlying object with id, value and extensions. The accessor "getIngredientSummary" gives direct access to the value
     */
    public MarkdownType getIngredientSummaryElement() { 
      if (this.ingredientSummary == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create NutritionProduct.ingredientSummary");
        else if (Configuration.doAutoCreate())
          this.ingredientSummary = new MarkdownType(); // bb
      return this.ingredientSummary;
    }

    public boolean hasIngredientSummaryElement() { 
      return this.ingredientSummary != null && !this.ingredientSummary.isEmpty();
    }

    public boolean hasIngredientSummary() { 
      return this.ingredientSummary != null && !this.ingredientSummary.isEmpty();
    }

    /**
     * @param value {@link #ingredientSummary} (The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.). This is the underlying object with id, value and extensions. The accessor "getIngredientSummary" gives direct access to the value
     */
    public NutritionProduct setIngredientSummaryElement(MarkdownType value) { 
      this.ingredientSummary = value;
      return this;
    }

    /**
     * @return The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.
     */
    public String getIngredientSummary() { 
      return this.ingredientSummary == null ? null : this.ingredientSummary.getValue();
    }

    /**
     * @param value The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.
     */
    public NutritionProduct setIngredientSummary(String value) { 
      if (Utilities.noString(value))
        this.ingredientSummary = null;
      else {
        if (this.ingredientSummary == null)
          this.ingredientSummary = new MarkdownType();
        this.ingredientSummary.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #ingredient} (Ingredients contained in this product.)
     */
    public List<NutritionProductIngredientComponent> getIngredient() { 
      if (this.ingredient == null)
        this.ingredient = new ArrayList<NutritionProductIngredientComponent>();
      return this.ingredient;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setIngredient(List<NutritionProductIngredientComponent> theIngredient) { 
      this.ingredient = theIngredient;
      return this;
    }

    public boolean hasIngredient() { 
      if (this.ingredient == null)
        return false;
      for (NutritionProductIngredientComponent item : this.ingredient)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public NutritionProductIngredientComponent addIngredient() { //3
      NutritionProductIngredientComponent t = new NutritionProductIngredientComponent();
      if (this.ingredient == null)
        this.ingredient = new ArrayList<NutritionProductIngredientComponent>();
      this.ingredient.add(t);
      return t;
    }

    public NutritionProduct addIngredient(NutritionProductIngredientComponent t) { //3
      if (t == null)
        return this;
      if (this.ingredient == null)
        this.ingredient = new ArrayList<NutritionProductIngredientComponent>();
      this.ingredient.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #ingredient}, creating it if it does not already exist {3}
     */
    public NutritionProductIngredientComponent getIngredientFirstRep() { 
      if (getIngredient().isEmpty()) {
        addIngredient();
      }
      return getIngredient().get(0);
    }

    /**
     * @return {@link #energy} (The amount of energy present in the product expressed in kilocalories or kilojoules.)
     */
    public Quantity getEnergy() { 
      if (this.energy == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create NutritionProduct.energy");
        else if (Configuration.doAutoCreate())
          this.energy = new Quantity(); // cc
      return this.energy;
    }

    public boolean hasEnergy() { 
      return this.energy != null && !this.energy.isEmpty();
    }

    /**
     * @param value {@link #energy} (The amount of energy present in the product expressed in kilocalories or kilojoules.)
     */
    public NutritionProduct setEnergy(Quantity value) { 
      this.energy = value;
      return this;
    }

    /**
     * @return {@link #characteristic} (Specifies descriptive properties of the nutrition product.)
     */
    public List<NutritionProductCharacteristicComponent> getCharacteristic() { 
      if (this.characteristic == null)
        this.characteristic = new ArrayList<NutritionProductCharacteristicComponent>();
      return this.characteristic;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setCharacteristic(List<NutritionProductCharacteristicComponent> theCharacteristic) { 
      this.characteristic = theCharacteristic;
      return this;
    }

    public boolean hasCharacteristic() { 
      if (this.characteristic == null)
        return false;
      for (NutritionProductCharacteristicComponent item : this.characteristic)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public NutritionProductCharacteristicComponent addCharacteristic() { //3
      NutritionProductCharacteristicComponent t = new NutritionProductCharacteristicComponent();
      if (this.characteristic == null)
        this.characteristic = new ArrayList<NutritionProductCharacteristicComponent>();
      this.characteristic.add(t);
      return t;
    }

    public NutritionProduct addCharacteristic(NutritionProductCharacteristicComponent t) { //3
      if (t == null)
        return this;
      if (this.characteristic == null)
        this.characteristic = new ArrayList<NutritionProductCharacteristicComponent>();
      this.characteristic.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #characteristic}, creating it if it does not already exist {3}
     */
    public NutritionProductCharacteristicComponent getCharacteristicFirstRep() { 
      if (getCharacteristic().isEmpty()) {
        addCharacteristic();
      }
      return getCharacteristic().get(0);
    }

    /**
     * @return {@link #instance} (Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product.)
     */
    public List<NutritionProductInstanceComponent> getInstance() { 
      if (this.instance == null)
        this.instance = new ArrayList<NutritionProductInstanceComponent>();
      return this.instance;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setInstance(List<NutritionProductInstanceComponent> theInstance) { 
      this.instance = theInstance;
      return this;
    }

    public boolean hasInstance() { 
      if (this.instance == null)
        return false;
      for (NutritionProductInstanceComponent item : this.instance)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public NutritionProductInstanceComponent addInstance() { //3
      NutritionProductInstanceComponent t = new NutritionProductInstanceComponent();
      if (this.instance == null)
        this.instance = new ArrayList<NutritionProductInstanceComponent>();
      this.instance.add(t);
      return t;
    }

    public NutritionProduct addInstance(NutritionProductInstanceComponent t) { //3
      if (t == null)
        return this;
      if (this.instance == null)
        this.instance = new ArrayList<NutritionProductInstanceComponent>();
      this.instance.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #instance}, creating it if it does not already exist {3}
     */
    public NutritionProductInstanceComponent getInstanceFirstRep() { 
      if (getInstance().isEmpty()) {
        addInstance();
      }
      return getInstance().get(0);
    }

    /**
     * @return {@link #note} (Comments made about the product.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public NutritionProduct setNote(List<Annotation> theNote) { 
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

    public NutritionProduct addNote(Annotation t) { //3
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

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("code", "CodeableConcept", "A code that specifies the product or a textual description if no code is available. This could be such codes as a USDA Branded Food Products Database number, a USDA Food Data Central (FDC) ID number, Universal Product Code (UPC), a Langual code, or a country specific food database code.", 0, 1, code));
        children.add(new Property("status", "code", "The current state of the product.", 0, 1, status));
        children.add(new Property("category", "CodeableConcept", "Nutrition products fall into various categories based on their composition (e.g., Fruit and Grain, Vegetables) or form (e.g., Beverages).", 0, java.lang.Integer.MAX_VALUE, category));
        children.add(new Property("manufacturer", "Reference(Organization|RelatedPerson)", "The organisation (manufacturer, representative or legal authorization holder) or person that is responsible for nutrition product.", 0, java.lang.Integer.MAX_VALUE, manufacturer));
        children.add(new Property("nutrient", "", "The product's nutritional information expressed by the nutrients.", 0, java.lang.Integer.MAX_VALUE, nutrient));
        children.add(new Property("ingredientSummary", "markdown", "The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.", 0, 1, ingredientSummary));
        children.add(new Property("ingredient", "", "Ingredients contained in this product.", 0, java.lang.Integer.MAX_VALUE, ingredient));
        children.add(new Property("energy", "Quantity", "The amount of energy present in the product expressed in kilocalories or kilojoules.", 0, 1, energy));
        children.add(new Property("characteristic", "", "Specifies descriptive properties of the nutrition product.", 0, java.lang.Integer.MAX_VALUE, characteristic));
        children.add(new Property("instance", "", "Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product.", 0, java.lang.Integer.MAX_VALUE, instance));
        children.add(new Property("note", "Annotation", "Comments made about the product.", 0, java.lang.Integer.MAX_VALUE, note));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 3059181: /*code*/  return new Property("code", "CodeableConcept", "A code that specifies the product or a textual description if no code is available. This could be such codes as a USDA Branded Food Products Database number, a USDA Food Data Central (FDC) ID number, Universal Product Code (UPC), a Langual code, or a country specific food database code.", 0, 1, code);
        case -892481550: /*status*/  return new Property("status", "code", "The current state of the product.", 0, 1, status);
        case 50511102: /*category*/  return new Property("category", "CodeableConcept", "Nutrition products fall into various categories based on their composition (e.g., Fruit and Grain, Vegetables) or form (e.g., Beverages).", 0, java.lang.Integer.MAX_VALUE, category);
        case -1969347631: /*manufacturer*/  return new Property("manufacturer", "Reference(Organization|RelatedPerson)", "The organisation (manufacturer, representative or legal authorization holder) or person that is responsible for nutrition product.", 0, java.lang.Integer.MAX_VALUE, manufacturer);
        case -1671151641: /*nutrient*/  return new Property("nutrient", "", "The product's nutritional information expressed by the nutrients.", 0, java.lang.Integer.MAX_VALUE, nutrient);
        case 137449621: /*ingredientSummary*/  return new Property("ingredientSummary", "markdown", "The textual description of the ingredients in the product.  For example, the following is a concatenated list of the ingredients for a peanut butter would read 'ROASTED PEANUTS, SUGAR, HYDROGENATED VEGETABLE OIL (COTTONSEED, SOYBEAN AND RAPESEED OIL) TO PREVENT SEPARATION, SALT'.", 0, 1, ingredientSummary);
        case -206409263: /*ingredient*/  return new Property("ingredient", "", "Ingredients contained in this product.", 0, java.lang.Integer.MAX_VALUE, ingredient);
        case -1298713976: /*energy*/  return new Property("energy", "Quantity", "The amount of energy present in the product expressed in kilocalories or kilojoules.", 0, 1, energy);
        case 366313883: /*characteristic*/  return new Property("characteristic", "", "Specifies descriptive properties of the nutrition product.", 0, java.lang.Integer.MAX_VALUE, characteristic);
        case 555127957: /*instance*/  return new Property("instance", "", "Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product.", 0, java.lang.Integer.MAX_VALUE, instance);
        case 3387378: /*note*/  return new Property("note", "Annotation", "Comments made about the product.", 0, java.lang.Integer.MAX_VALUE, note);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<NutritionProductStatus>
        case 50511102: /*category*/ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
        case -1969347631: /*manufacturer*/ return this.manufacturer == null ? new Base[0] : this.manufacturer.toArray(new Base[this.manufacturer.size()]); // Reference
        case -1671151641: /*nutrient*/ return this.nutrient == null ? new Base[0] : this.nutrient.toArray(new Base[this.nutrient.size()]); // NutritionProductNutrientComponent
        case 137449621: /*ingredientSummary*/ return this.ingredientSummary == null ? new Base[0] : new Base[] {this.ingredientSummary}; // MarkdownType
        case -206409263: /*ingredient*/ return this.ingredient == null ? new Base[0] : this.ingredient.toArray(new Base[this.ingredient.size()]); // NutritionProductIngredientComponent
        case -1298713976: /*energy*/ return this.energy == null ? new Base[0] : new Base[] {this.energy}; // Quantity
        case 366313883: /*characteristic*/ return this.characteristic == null ? new Base[0] : this.characteristic.toArray(new Base[this.characteristic.size()]); // NutritionProductCharacteristicComponent
        case 555127957: /*instance*/ return this.instance == null ? new Base[0] : this.instance.toArray(new Base[this.instance.size()]); // NutritionProductInstanceComponent
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -892481550: // status
          value = new NutritionProductStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<NutritionProductStatus>
          return value;
        case 50511102: // category
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1969347631: // manufacturer
          this.getManufacturer().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -1671151641: // nutrient
          this.getNutrient().add((NutritionProductNutrientComponent) value); // NutritionProductNutrientComponent
          return value;
        case 137449621: // ingredientSummary
          this.ingredientSummary = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -206409263: // ingredient
          this.getIngredient().add((NutritionProductIngredientComponent) value); // NutritionProductIngredientComponent
          return value;
        case -1298713976: // energy
          this.energy = TypeConvertor.castToQuantity(value); // Quantity
          return value;
        case 366313883: // characteristic
          this.getCharacteristic().add((NutritionProductCharacteristicComponent) value); // NutritionProductCharacteristicComponent
          return value;
        case 555127957: // instance
          this.getInstance().add((NutritionProductInstanceComponent) value); // NutritionProductInstanceComponent
          return value;
        case 3387378: // note
          this.getNote().add(TypeConvertor.castToAnnotation(value)); // Annotation
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("status")) {
          value = new NutritionProductStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<NutritionProductStatus>
        } else if (name.equals("category")) {
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("manufacturer")) {
          this.getManufacturer().add(TypeConvertor.castToReference(value));
        } else if (name.equals("nutrient")) {
          this.getNutrient().add((NutritionProductNutrientComponent) value);
        } else if (name.equals("ingredientSummary")) {
          this.ingredientSummary = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("ingredient")) {
          this.getIngredient().add((NutritionProductIngredientComponent) value);
        } else if (name.equals("energy")) {
          this.energy = TypeConvertor.castToQuantity(value); // Quantity
        } else if (name.equals("characteristic")) {
          this.getCharacteristic().add((NutritionProductCharacteristicComponent) value);
        } else if (name.equals("instance")) {
          this.getInstance().add((NutritionProductInstanceComponent) value);
        } else if (name.equals("note")) {
          this.getNote().add(TypeConvertor.castToAnnotation(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode();
        case -892481550:  return getStatusElement();
        case 50511102:  return addCategory(); 
        case -1969347631:  return addManufacturer(); 
        case -1671151641:  return addNutrient(); 
        case 137449621:  return getIngredientSummaryElement();
        case -206409263:  return addIngredient(); 
        case -1298713976:  return getEnergy();
        case 366313883:  return addCharacteristic(); 
        case 555127957:  return addInstance(); 
        case 3387378:  return addNote(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case -1969347631: /*manufacturer*/ return new String[] {"Reference"};
        case -1671151641: /*nutrient*/ return new String[] {};
        case 137449621: /*ingredientSummary*/ return new String[] {"markdown"};
        case -206409263: /*ingredient*/ return new String[] {};
        case -1298713976: /*energy*/ return new String[] {"Quantity"};
        case 366313883: /*characteristic*/ return new String[] {};
        case 555127957: /*instance*/ return new String[] {};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.status");
        }
        else if (name.equals("category")) {
          return addCategory();
        }
        else if (name.equals("manufacturer")) {
          return addManufacturer();
        }
        else if (name.equals("nutrient")) {
          return addNutrient();
        }
        else if (name.equals("ingredientSummary")) {
          throw new FHIRException("Cannot call addChild on a singleton property NutritionProduct.ingredientSummary");
        }
        else if (name.equals("ingredient")) {
          return addIngredient();
        }
        else if (name.equals("energy")) {
          this.energy = new Quantity();
          return this.energy;
        }
        else if (name.equals("characteristic")) {
          return addCharacteristic();
        }
        else if (name.equals("instance")) {
          return addInstance();
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "NutritionProduct";

  }

      public NutritionProduct copy() {
        NutritionProduct dst = new NutritionProduct();
        copyValues(dst);
        return dst;
      }

      public void copyValues(NutritionProduct dst) {
        super.copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.status = status == null ? null : status.copy();
        if (category != null) {
          dst.category = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : category)
            dst.category.add(i.copy());
        };
        if (manufacturer != null) {
          dst.manufacturer = new ArrayList<Reference>();
          for (Reference i : manufacturer)
            dst.manufacturer.add(i.copy());
        };
        if (nutrient != null) {
          dst.nutrient = new ArrayList<NutritionProductNutrientComponent>();
          for (NutritionProductNutrientComponent i : nutrient)
            dst.nutrient.add(i.copy());
        };
        dst.ingredientSummary = ingredientSummary == null ? null : ingredientSummary.copy();
        if (ingredient != null) {
          dst.ingredient = new ArrayList<NutritionProductIngredientComponent>();
          for (NutritionProductIngredientComponent i : ingredient)
            dst.ingredient.add(i.copy());
        };
        dst.energy = energy == null ? null : energy.copy();
        if (characteristic != null) {
          dst.characteristic = new ArrayList<NutritionProductCharacteristicComponent>();
          for (NutritionProductCharacteristicComponent i : characteristic)
            dst.characteristic.add(i.copy());
        };
        if (instance != null) {
          dst.instance = new ArrayList<NutritionProductInstanceComponent>();
          for (NutritionProductInstanceComponent i : instance)
            dst.instance.add(i.copy());
        };
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
      }

      protected NutritionProduct typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof NutritionProduct))
          return false;
        NutritionProduct o = (NutritionProduct) other_;
        return compareDeep(code, o.code, true) && compareDeep(status, o.status, true) && compareDeep(category, o.category, true)
           && compareDeep(manufacturer, o.manufacturer, true) && compareDeep(nutrient, o.nutrient, true) && compareDeep(ingredientSummary, o.ingredientSummary, true)
           && compareDeep(ingredient, o.ingredient, true) && compareDeep(energy, o.energy, true) && compareDeep(characteristic, o.characteristic, true)
           && compareDeep(instance, o.instance, true) && compareDeep(note, o.note, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof NutritionProduct))
          return false;
        NutritionProduct o = (NutritionProduct) other_;
        return compareValues(status, o.status, true) && compareValues(ingredientSummary, o.ingredientSummary, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, status, category, manufacturer
          , nutrient, ingredientSummary, ingredient, energy, characteristic, instance, note
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.NutritionProduct;
   }

 /**
   * Search parameter: <b>lot-number</b>
   * <p>
   * Description: <b>The lot number</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.instance.lotNumber</b><br>
   * </p>
   */
  @SearchParamDefinition(name="lot-number", path="NutritionProduct.instance.lotNumber", description="The lot number", type="token" )
  public static final String SP_LOT_NUMBER = "lot-number";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>lot-number</b>
   * <p>
   * Description: <b>The lot number</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.instance.lotNumber</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam LOT_NUMBER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_LOT_NUMBER);

 /**
   * Search parameter: <b>ingredient-item</b>
   * <p>
   * Description: <b>The specific ingredient</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.ingredient.item.concept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="ingredient-item", path="NutritionProduct.ingredient.item.concept", description="The specific ingredient", type="token" )
  public static final String SP_INGREDIENT_ITEM = "ingredient-item";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>ingredient-item</b>
   * <p>
   * Description: <b>The specific ingredient</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.ingredient.item.concept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam INGREDIENT_ITEM = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_INGREDIENT_ITEM);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The broad product group or category of the nutrition product</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="NutritionProduct.category", description="The broad product group or category of the nutrition product", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The broad product group or category of the nutrition product</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>code</b>
   * <p>
   * Description: <b>The code identifying a specific nutrition product</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="code", path="NutritionProduct.code", description="The code identifying a specific nutrition product", type="token" )
  public static final String SP_CODE = "code";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>code</b>
   * <p>
   * Description: <b>The code identifying a specific nutrition product</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CODE);

 /**
   * Search parameter: <b>expiration-date</b>
   * <p>
   * Description: <b>When the product expired (or is expected to expire)</b><br>
   * Type: <b>date</b><br>
   * Path: <b>NutritionProduct.instance.expiry</b><br>
   * </p>
   */
  @SearchParamDefinition(name="expiration-date", path="NutritionProduct.instance.expiry", description="When the product expired (or is expected to expire)", type="date" )
  public static final String SP_EXPIRATION_DATE = "expiration-date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>expiration-date</b>
   * <p>
   * Description: <b>When the product expired (or is expected to expire)</b><br>
   * Type: <b>date</b><br>
   * Path: <b>NutritionProduct.instance.expiry</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam EXPIRATION_DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_EXPIRATION_DATE);

 /**
   * Search parameter: <b>serial-number</b>
   * <p>
   * Description: <b>The serial number</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.instance.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="serial-number", path="NutritionProduct.instance.identifier", description="The serial number", type="token" )
  public static final String SP_SERIAL_NUMBER = "serial-number";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>serial-number</b>
   * <p>
   * Description: <b>The serial number</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.instance.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SERIAL_NUMBER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_SERIAL_NUMBER);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The identifier for the physical instance, typically a serial number</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.instance.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="NutritionProduct.instance.identifier", description="The identifier for the physical instance, typically a serial number", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The identifier for the physical instance, typically a serial number</b><br>
   * Type: <b>token</b><br>
   * Path: <b>NutritionProduct.instance.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);


}

