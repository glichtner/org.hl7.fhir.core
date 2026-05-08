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
 * Details of a Health Insurance product provided by an organization.
 */
@ResourceDef(name="InsuranceProduct", profile="http://hl7.org/fhir/StructureDefinition/InsuranceProduct")
public class InsuranceProduct extends DomainResource {

    @Block()
    public static class InsuranceProductCoverageComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of Coverage", formalDefinition="Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health)." )
        protected CodeableConcept type;

        /**
         * Reference to the network that providing the type of coverage.
         */
        @Child(name = "network", type = {Organization.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="What networks provide coverage", formalDefinition="Reference to the network that providing the type of coverage." )
        protected List<Reference> network;

        /**
         * Specific benefits under this type of coverage.
         */
        @Child(name = "benefit", type = {}, order=3, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="List of benefits", formalDefinition="Specific benefits under this type of coverage." )
        protected List<CoverageBenefitComponent> benefit;

        private static final long serialVersionUID = 79927205L;

    /**
     * Constructor
     */
      public InsuranceProductCoverageComponent() {
        super();
      }

    /**
     * Constructor
     */
      public InsuranceProductCoverageComponent(CodeableConcept type, CoverageBenefitComponent benefit) {
        super();
        this.setType(type);
        this.addBenefit(benefit);
      }

        /**
         * @return {@link #type} (Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceProductCoverageComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).)
         */
        public InsuranceProductCoverageComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
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
        public InsuranceProductCoverageComponent setNetwork(List<Reference> theNetwork) { 
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

        public InsuranceProductCoverageComponent addNetwork(Reference t) { //3
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
         * @return {@link #benefit} (Specific benefits under this type of coverage.)
         */
        public List<CoverageBenefitComponent> getBenefit() { 
          if (this.benefit == null)
            this.benefit = new ArrayList<CoverageBenefitComponent>();
          return this.benefit;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public InsuranceProductCoverageComponent setBenefit(List<CoverageBenefitComponent> theBenefit) { 
          this.benefit = theBenefit;
          return this;
        }

        public boolean hasBenefit() { 
          if (this.benefit == null)
            return false;
          for (CoverageBenefitComponent item : this.benefit)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CoverageBenefitComponent addBenefit() { //3
          CoverageBenefitComponent t = new CoverageBenefitComponent();
          if (this.benefit == null)
            this.benefit = new ArrayList<CoverageBenefitComponent>();
          this.benefit.add(t);
          return t;
        }

        public InsuranceProductCoverageComponent addBenefit(CoverageBenefitComponent t) { //3
          if (t == null)
            return this;
          if (this.benefit == null)
            this.benefit = new ArrayList<CoverageBenefitComponent>();
          this.benefit.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #benefit}, creating it if it does not already exist {3}
         */
        public CoverageBenefitComponent getBenefitFirstRep() { 
          if (getBenefit().isEmpty()) {
            addBenefit();
          }
          return getBenefit().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).", 0, 1, type));
          children.add(new Property("network", "Reference(Organization)", "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network));
          children.add(new Property("benefit", "", "Specific benefits under this type of coverage.", 0, java.lang.Integer.MAX_VALUE, benefit));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).", 0, 1, type);
          case 1843485230: /*network*/  return new Property("network", "Reference(Organization)", "Reference to the network that providing the type of coverage.", 0, java.lang.Integer.MAX_VALUE, network);
          case -222710633: /*benefit*/  return new Property("benefit", "", "Specific benefits under this type of coverage.", 0, java.lang.Integer.MAX_VALUE, benefit);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 1843485230: /*network*/ return this.network == null ? new Base[0] : this.network.toArray(new Base[this.network.size()]); // Reference
        case -222710633: /*benefit*/ return this.benefit == null ? new Base[0] : this.benefit.toArray(new Base[this.benefit.size()]); // CoverageBenefitComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1843485230: // network
          this.getNetwork().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -222710633: // benefit
          this.getBenefit().add((CoverageBenefitComponent) value); // CoverageBenefitComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("network")) {
          this.getNetwork().add(TypeConvertor.castToReference(value));
        } else if (name.equals("benefit")) {
          this.getBenefit().add((CoverageBenefitComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case 1843485230:  return addNetwork(); 
        case -222710633:  return addBenefit(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 1843485230: /*network*/ return new String[] {"Reference"};
        case -222710633: /*benefit*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("network")) {
          return addNetwork();
        }
        else if (name.equals("benefit")) {
          return addBenefit();
        }
        else
          return super.addChild(name);
      }

      public InsuranceProductCoverageComponent copy() {
        InsuranceProductCoverageComponent dst = new InsuranceProductCoverageComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsuranceProductCoverageComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        if (network != null) {
          dst.network = new ArrayList<Reference>();
          for (Reference i : network)
            dst.network.add(i.copy());
        };
        if (benefit != null) {
          dst.benefit = new ArrayList<CoverageBenefitComponent>();
          for (CoverageBenefitComponent i : benefit)
            dst.benefit.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsuranceProductCoverageComponent))
          return false;
        InsuranceProductCoverageComponent o = (InsuranceProductCoverageComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(network, o.network, true) && compareDeep(benefit, o.benefit, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsuranceProductCoverageComponent))
          return false;
        InsuranceProductCoverageComponent o = (InsuranceProductCoverageComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, network, benefit);
      }

  public String fhirType() {
    return "InsuranceProduct.coverage";

  }

  }

    @Block()
    public static class CoverageBenefitComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Type of benefit (primary care; specialty care; inpatient; outpatient).
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of benefit provided", formalDefinition="Type of benefit (primary care; specialty care; inpatient; outpatient)." )
        protected CodeableConcept type;

        /**
         * The referral requirements to have access/coverage for this benefit.
         */
        @Child(name = "requirement", type = {StringType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Referral requirements", formalDefinition="The referral requirements to have access/coverage for this benefit." )
        protected StringType requirement;

        /**
         * The specific limits on the benefit.
         */
        @Child(name = "limit", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Limits on the provided benefits", formalDefinition="The specific limits on the benefit." )
        protected List<CoverageBenefitLimitComponent> limit;

        private static final long serialVersionUID = -113658449L;

    /**
     * Constructor
     */
      public CoverageBenefitComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CoverageBenefitComponent(CodeableConcept type) {
        super();
        this.setType(type);
      }

        /**
         * @return {@link #type} (Type of benefit (primary care; specialty care; inpatient; outpatient).)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageBenefitComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Type of benefit (primary care; specialty care; inpatient; outpatient).)
         */
        public CoverageBenefitComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #requirement} (The referral requirements to have access/coverage for this benefit.). This is the underlying object with id, value and extensions. The accessor "getRequirement" gives direct access to the value
         */
        public StringType getRequirementElement() { 
          if (this.requirement == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageBenefitComponent.requirement");
            else if (Configuration.doAutoCreate())
              this.requirement = new StringType(); // bb
          return this.requirement;
        }

        public boolean hasRequirementElement() { 
          return this.requirement != null && !this.requirement.isEmpty();
        }

        public boolean hasRequirement() { 
          return this.requirement != null && !this.requirement.isEmpty();
        }

        /**
         * @param value {@link #requirement} (The referral requirements to have access/coverage for this benefit.). This is the underlying object with id, value and extensions. The accessor "getRequirement" gives direct access to the value
         */
        public CoverageBenefitComponent setRequirementElement(StringType value) { 
          this.requirement = value;
          return this;
        }

        /**
         * @return The referral requirements to have access/coverage for this benefit.
         */
        public String getRequirement() { 
          return this.requirement == null ? null : this.requirement.getValue();
        }

        /**
         * @param value The referral requirements to have access/coverage for this benefit.
         */
        public CoverageBenefitComponent setRequirement(String value) { 
          if (Utilities.noString(value))
            this.requirement = null;
          else {
            if (this.requirement == null)
              this.requirement = new StringType();
            this.requirement.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #limit} (The specific limits on the benefit.)
         */
        public List<CoverageBenefitLimitComponent> getLimit() { 
          if (this.limit == null)
            this.limit = new ArrayList<CoverageBenefitLimitComponent>();
          return this.limit;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CoverageBenefitComponent setLimit(List<CoverageBenefitLimitComponent> theLimit) { 
          this.limit = theLimit;
          return this;
        }

        public boolean hasLimit() { 
          if (this.limit == null)
            return false;
          for (CoverageBenefitLimitComponent item : this.limit)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CoverageBenefitLimitComponent addLimit() { //3
          CoverageBenefitLimitComponent t = new CoverageBenefitLimitComponent();
          if (this.limit == null)
            this.limit = new ArrayList<CoverageBenefitLimitComponent>();
          this.limit.add(t);
          return t;
        }

        public CoverageBenefitComponent addLimit(CoverageBenefitLimitComponent t) { //3
          if (t == null)
            return this;
          if (this.limit == null)
            this.limit = new ArrayList<CoverageBenefitLimitComponent>();
          this.limit.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #limit}, creating it if it does not already exist {3}
         */
        public CoverageBenefitLimitComponent getLimitFirstRep() { 
          if (getLimit().isEmpty()) {
            addLimit();
          }
          return getLimit().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "Type of benefit (primary care; specialty care; inpatient; outpatient).", 0, 1, type));
          children.add(new Property("requirement", "string", "The referral requirements to have access/coverage for this benefit.", 0, 1, requirement));
          children.add(new Property("limit", "", "The specific limits on the benefit.", 0, java.lang.Integer.MAX_VALUE, limit));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of benefit (primary care; specialty care; inpatient; outpatient).", 0, 1, type);
          case 363387971: /*requirement*/  return new Property("requirement", "string", "The referral requirements to have access/coverage for this benefit.", 0, 1, requirement);
          case 102976443: /*limit*/  return new Property("limit", "", "The specific limits on the benefit.", 0, java.lang.Integer.MAX_VALUE, limit);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 363387971: /*requirement*/ return this.requirement == null ? new Base[0] : new Base[] {this.requirement}; // StringType
        case 102976443: /*limit*/ return this.limit == null ? new Base[0] : this.limit.toArray(new Base[this.limit.size()]); // CoverageBenefitLimitComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 363387971: // requirement
          this.requirement = TypeConvertor.castToString(value); // StringType
          return value;
        case 102976443: // limit
          this.getLimit().add((CoverageBenefitLimitComponent) value); // CoverageBenefitLimitComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("requirement")) {
          this.requirement = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("limit")) {
          this.getLimit().add((CoverageBenefitLimitComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case 363387971:  return getRequirementElement();
        case 102976443:  return addLimit(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 363387971: /*requirement*/ return new String[] {"string"};
        case 102976443: /*limit*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("requirement")) {
          throw new FHIRException("Cannot call addChild on a singleton property InsuranceProduct.coverage.benefit.requirement");
        }
        else if (name.equals("limit")) {
          return addLimit();
        }
        else
          return super.addChild(name);
      }

      public CoverageBenefitComponent copy() {
        CoverageBenefitComponent dst = new CoverageBenefitComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CoverageBenefitComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.requirement = requirement == null ? null : requirement.copy();
        if (limit != null) {
          dst.limit = new ArrayList<CoverageBenefitLimitComponent>();
          for (CoverageBenefitLimitComponent i : limit)
            dst.limit.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CoverageBenefitComponent))
          return false;
        CoverageBenefitComponent o = (CoverageBenefitComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(requirement, o.requirement, true) && compareDeep(limit, o.limit, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CoverageBenefitComponent))
          return false;
        CoverageBenefitComponent o = (CoverageBenefitComponent) other_;
        return compareValues(requirement, o.requirement, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, requirement, limit
          );
      }

  public String fhirType() {
    return "InsuranceProduct.coverage.benefit";

  }

  }

    @Block()
    public static class CoverageBenefitLimitComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.
         */
        @Child(name = "value", type = {Quantity.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Maximum value allowed", formalDefinition="The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses." )
        protected Quantity value;

        /**
         * The specific limit on the benefit.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Benefit limit details", formalDefinition="The specific limit on the benefit." )
        protected CodeableConcept code;

        private static final long serialVersionUID = -304318128L;

    /**
     * Constructor
     */
      public CoverageBenefitLimitComponent() {
        super();
      }

        /**
         * @return {@link #value} (The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.)
         */
        public Quantity getValue() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageBenefitLimitComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new Quantity(); // cc
          return this.value;
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.)
         */
        public CoverageBenefitLimitComponent setValue(Quantity value) { 
          this.value = value;
          return this;
        }

        /**
         * @return {@link #code} (The specific limit on the benefit.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageBenefitLimitComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (The specific limit on the benefit.)
         */
        public CoverageBenefitLimitComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("value", "Quantity", "The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.", 0, 1, value));
          children.add(new Property("code", "CodeableConcept", "The specific limit on the benefit.", 0, 1, code));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 111972721: /*value*/  return new Property("value", "Quantity", "The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.", 0, 1, value);
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "The specific limit on the benefit.", 0, 1, code);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // Quantity
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 111972721: // value
          this.value = TypeConvertor.castToQuantity(value); // Quantity
          return value;
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("value")) {
          this.value = TypeConvertor.castToQuantity(value); // Quantity
        } else if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111972721:  return getValue();
        case 3059181:  return getCode();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111972721: /*value*/ return new String[] {"Quantity"};
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("value")) {
          this.value = new Quantity();
          return this.value;
        }
        else if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else
          return super.addChild(name);
      }

      public CoverageBenefitLimitComponent copy() {
        CoverageBenefitLimitComponent dst = new CoverageBenefitLimitComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CoverageBenefitLimitComponent dst) {
        super.copyValues(dst);
        dst.value = value == null ? null : value.copy();
        dst.code = code == null ? null : code.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CoverageBenefitLimitComponent))
          return false;
        CoverageBenefitLimitComponent o = (CoverageBenefitLimitComponent) other_;
        return compareDeep(value, o.value, true) && compareDeep(code, o.code, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CoverageBenefitLimitComponent))
          return false;
        CoverageBenefitLimitComponent o = (CoverageBenefitLimitComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(value, code);
      }

  public String fhirType() {
    return "InsuranceProduct.coverage.benefit.limit";

  }

  }

    @Block()
    public static class InsuranceProductRelatedComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The Related Product reference.
         */
        @Child(name = "product", type = {InsuranceProduct.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Related Product reference", formalDefinition="The Related Product reference." )
        protected Reference product;

        /**
         * The relationship of this product to the related product. an example would be 'sub-plan' where this product is a sub-plan of the related.product.
         */
        @Child(name = "relationship", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Relationship of this product to the related product", formalDefinition="The relationship of this product to the related product. an example would be 'sub-plan' where this product is a sub-plan of the related.product." )
        protected CodeableConcept relationship;

        /**
         * Period of time that the product relationship is valid. The start and/or end dates can be empty if this is an open ended relationship.
         */
        @Child(name = "period", type = {Period.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Period that this Relationship is valid", formalDefinition="Period of time that the product relationship is valid. The start and/or end dates can be empty if this is an open ended relationship." )
        protected Period period;

        private static final long serialVersionUID = -119273367L;

    /**
     * Constructor
     */
      public InsuranceProductRelatedComponent() {
        super();
      }

        /**
         * @return {@link #product} (The Related Product reference.)
         */
        public Reference getProduct() { 
          if (this.product == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceProductRelatedComponent.product");
            else if (Configuration.doAutoCreate())
              this.product = new Reference(); // cc
          return this.product;
        }

        public boolean hasProduct() { 
          return this.product != null && !this.product.isEmpty();
        }

        /**
         * @param value {@link #product} (The Related Product reference.)
         */
        public InsuranceProductRelatedComponent setProduct(Reference value) { 
          this.product = value;
          return this;
        }

        /**
         * @return {@link #relationship} (The relationship of this product to the related product. an example would be 'sub-plan' where this product is a sub-plan of the related.product.)
         */
        public CodeableConcept getRelationship() { 
          if (this.relationship == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceProductRelatedComponent.relationship");
            else if (Configuration.doAutoCreate())
              this.relationship = new CodeableConcept(); // cc
          return this.relationship;
        }

        public boolean hasRelationship() { 
          return this.relationship != null && !this.relationship.isEmpty();
        }

        /**
         * @param value {@link #relationship} (The relationship of this product to the related product. an example would be 'sub-plan' where this product is a sub-plan of the related.product.)
         */
        public InsuranceProductRelatedComponent setRelationship(CodeableConcept value) { 
          this.relationship = value;
          return this;
        }

        /**
         * @return {@link #period} (Period of time that the product relationship is valid. The start and/or end dates can be empty if this is an open ended relationship.)
         */
        public Period getPeriod() { 
          if (this.period == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceProductRelatedComponent.period");
            else if (Configuration.doAutoCreate())
              this.period = new Period(); // cc
          return this.period;
        }

        public boolean hasPeriod() { 
          return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (Period of time that the product relationship is valid. The start and/or end dates can be empty if this is an open ended relationship.)
         */
        public InsuranceProductRelatedComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("product", "Reference(InsuranceProduct)", "The Related Product reference.", 0, 1, product));
          children.add(new Property("relationship", "CodeableConcept", "The relationship of this product to the related product. an example would be 'sub-plan' where this product is a sub-plan of the related.product.", 0, 1, relationship));
          children.add(new Property("period", "Period", "Period of time that the product relationship is valid. The start and/or end dates can be empty if this is an open ended relationship.", 0, 1, period));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -309474065: /*product*/  return new Property("product", "Reference(InsuranceProduct)", "The Related Product reference.", 0, 1, product);
          case -261851592: /*relationship*/  return new Property("relationship", "CodeableConcept", "The relationship of this product to the related product. an example would be 'sub-plan' where this product is a sub-plan of the related.product.", 0, 1, relationship);
          case -991726143: /*period*/  return new Property("period", "Period", "Period of time that the product relationship is valid. The start and/or end dates can be empty if this is an open ended relationship.", 0, 1, period);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -309474065: /*product*/ return this.product == null ? new Base[0] : new Base[] {this.product}; // Reference
        case -261851592: /*relationship*/ return this.relationship == null ? new Base[0] : new Base[] {this.relationship}; // CodeableConcept
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -309474065: // product
          this.product = TypeConvertor.castToReference(value); // Reference
          return value;
        case -261851592: // relationship
          this.relationship = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("product")) {
          this.product = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("relationship")) {
          this.relationship = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -309474065:  return getProduct();
        case -261851592:  return getRelationship();
        case -991726143:  return getPeriod();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -309474065: /*product*/ return new String[] {"Reference"};
        case -261851592: /*relationship*/ return new String[] {"CodeableConcept"};
        case -991726143: /*period*/ return new String[] {"Period"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("product")) {
          this.product = new Reference();
          return this.product;
        }
        else if (name.equals("relationship")) {
          this.relationship = new CodeableConcept();
          return this.relationship;
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else
          return super.addChild(name);
      }

      public InsuranceProductRelatedComponent copy() {
        InsuranceProductRelatedComponent dst = new InsuranceProductRelatedComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsuranceProductRelatedComponent dst) {
        super.copyValues(dst);
        dst.product = product == null ? null : product.copy();
        dst.relationship = relationship == null ? null : relationship.copy();
        dst.period = period == null ? null : period.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsuranceProductRelatedComponent))
          return false;
        InsuranceProductRelatedComponent o = (InsuranceProductRelatedComponent) other_;
        return compareDeep(product, o.product, true) && compareDeep(relationship, o.relationship, true)
           && compareDeep(period, o.period, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsuranceProductRelatedComponent))
          return false;
        InsuranceProductRelatedComponent o = (InsuranceProductRelatedComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(product, relationship, period
          );
      }

  public String fhirType() {
    return "InsuranceProduct.related";

  }

  }

    /**
     * Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Business Identifier for Product", formalDefinition="Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server." )
    protected List<Identifier> identifier;

    /**
     * The current state of the health insurance product.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=0, max=1, modifier=true, summary=true)
    @Description(shortDefinition="draft | active | retired | unknown", formalDefinition="The current state of the health insurance product." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/publication-status")
    protected Enumeration<PublicationStatus> status;

    /**
     * The kind of health insurance product.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Kind of product", formalDefinition="The kind of health insurance product." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/insuranceproduct-type")
    protected List<CodeableConcept> type;

    /**
     * Official name of the health insurance product as designated by the owner.
     */
    @Child(name = "name", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Official name", formalDefinition="Official name of the health insurance product as designated by the owner." )
    protected StringType name;

    /**
     * A list of alternate names that the product is known as, or was known as in the past.
     */
    @Child(name = "alias", type = {StringType.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Alternate names", formalDefinition="A list of alternate names that the product is known as, or was known as in the past." )
    protected List<StringType> alias;

    /**
     * The period of time that the health insurance product is available.
     */
    @Child(name = "period", type = {Period.class}, order=5, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the product is available", formalDefinition="The period of time that the health insurance product is available." )
    protected Period period;

    /**
     * The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.
     */
    @Child(name = "ownedBy", type = {Organization.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Product issuer", formalDefinition="The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'." )
    protected Reference ownedBy;

    /**
     * An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.
     */
    @Child(name = "administeredBy", type = {Organization.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Product administrator", formalDefinition="An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner." )
    protected Reference administeredBy;

    /**
     * The geographic region in which a health insurance product's benefits apply.
     */
    @Child(name = "coverageArea", type = {Location.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Where product applies", formalDefinition="The geographic region in which a health insurance product's benefits apply." )
    protected List<Reference> coverageArea;

    /**
     * The contact details of communication devices available relevant to the specific Insurance Product. This can include addresses, phone numbers, fax numbers, mobile numbers, email addresses and web sites.
     */
    @Child(name = "contact", type = {ExtendedContactDetail.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Official contact details relevant to the health insurance product", formalDefinition="The contact details of communication devices available relevant to the specific Insurance Product. This can include addresses, phone numbers, fax numbers, mobile numbers, email addresses and web sites." )
    protected List<ExtendedContactDetail> contact;

    /**
     * The technical endpoints providing access to services operated for the health insurance product.
     */
    @Child(name = "endpoint", type = {Endpoint.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Technical endpoint", formalDefinition="The technical endpoints providing access to services operated for the health insurance product." )
    protected List<Reference> endpoint;

    /**
     * Reference to the network included in the health insurance product.
     */
    @Child(name = "network", type = {Organization.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="What networks are Included", formalDefinition="Reference to the network included in the health insurance product." )
    protected List<Reference> network;

    /**
     * Details about the coverage offered by the insurance product.
     */
    @Child(name = "coverage", type = {}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Coverage details", formalDefinition="Details about the coverage offered by the insurance product." )
    protected List<InsuranceProductCoverageComponent> coverage;

    /**
     * Another product that is related to this product. Often used to create relationships to parents or families of products.
     */
    @Child(name = "related", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Associated insurance product", formalDefinition="Another product that is related to this product. Often used to create relationships to parents or families of products." )
    protected List<InsuranceProductRelatedComponent> related;

    private static final long serialVersionUID = -1665860130L;

  /**
   * Constructor
   */
    public InsuranceProduct() {
      super();
    }

    /**
     * @return {@link #identifier} (Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setIdentifier(List<Identifier> theIdentifier) { 
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

    public InsuranceProduct addIdentifier(Identifier t) { //3
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
     * @return {@link #status} (The current state of the health insurance product.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsuranceProduct.status");
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
     * @param value {@link #status} (The current state of the health insurance product.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public InsuranceProduct setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The current state of the health insurance product.
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The current state of the health insurance product.
     */
    public InsuranceProduct setStatus(PublicationStatus value) { 
      if (value == null)
        this.status = null;
      else {
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #type} (The kind of health insurance product.)
     */
    public List<CodeableConcept> getType() { 
      if (this.type == null)
        this.type = new ArrayList<CodeableConcept>();
      return this.type;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setType(List<CodeableConcept> theType) { 
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

    public InsuranceProduct addType(CodeableConcept t) { //3
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
     * @return {@link #name} (Official name of the health insurance product as designated by the owner.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public StringType getNameElement() { 
      if (this.name == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsuranceProduct.name");
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
     * @param value {@link #name} (Official name of the health insurance product as designated by the owner.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
     */
    public InsuranceProduct setNameElement(StringType value) { 
      this.name = value;
      return this;
    }

    /**
     * @return Official name of the health insurance product as designated by the owner.
     */
    public String getName() { 
      return this.name == null ? null : this.name.getValue();
    }

    /**
     * @param value Official name of the health insurance product as designated by the owner.
     */
    public InsuranceProduct setName(String value) { 
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
     * @return {@link #alias} (A list of alternate names that the product is known as, or was known as in the past.)
     */
    public List<StringType> getAlias() { 
      if (this.alias == null)
        this.alias = new ArrayList<StringType>();
      return this.alias;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setAlias(List<StringType> theAlias) { 
      this.alias = theAlias;
      return this;
    }

    public boolean hasAlias() { 
      if (this.alias == null)
        return false;
      for (StringType item : this.alias)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #alias} (A list of alternate names that the product is known as, or was known as in the past.)
     */
    public StringType addAliasElement() {//2 
      StringType t = new StringType();
      if (this.alias == null)
        this.alias = new ArrayList<StringType>();
      this.alias.add(t);
      return t;
    }

    /**
     * @param value {@link #alias} (A list of alternate names that the product is known as, or was known as in the past.)
     */
    public InsuranceProduct addAlias(String value) { //1
      StringType t = new StringType();
      t.setValue(value);
      if (this.alias == null)
        this.alias = new ArrayList<StringType>();
      this.alias.add(t);
      return this;
    }

    /**
     * @param value {@link #alias} (A list of alternate names that the product is known as, or was known as in the past.)
     */
    public boolean hasAlias(String value) { 
      if (this.alias == null)
        return false;
      for (StringType v : this.alias)
        if (v.getValue().equals(value)) // string
          return true;
      return false;
    }

    /**
     * @return {@link #period} (The period of time that the health insurance product is available.)
     */
    public Period getPeriod() { 
      if (this.period == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsuranceProduct.period");
        else if (Configuration.doAutoCreate())
          this.period = new Period(); // cc
      return this.period;
    }

    public boolean hasPeriod() { 
      return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (The period of time that the health insurance product is available.)
     */
    public InsuranceProduct setPeriod(Period value) { 
      this.period = value;
      return this;
    }

    /**
     * @return {@link #ownedBy} (The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.)
     */
    public Reference getOwnedBy() { 
      if (this.ownedBy == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsuranceProduct.ownedBy");
        else if (Configuration.doAutoCreate())
          this.ownedBy = new Reference(); // cc
      return this.ownedBy;
    }

    public boolean hasOwnedBy() { 
      return this.ownedBy != null && !this.ownedBy.isEmpty();
    }

    /**
     * @param value {@link #ownedBy} (The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.)
     */
    public InsuranceProduct setOwnedBy(Reference value) { 
      this.ownedBy = value;
      return this;
    }

    /**
     * @return {@link #administeredBy} (An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.)
     */
    public Reference getAdministeredBy() { 
      if (this.administeredBy == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create InsuranceProduct.administeredBy");
        else if (Configuration.doAutoCreate())
          this.administeredBy = new Reference(); // cc
      return this.administeredBy;
    }

    public boolean hasAdministeredBy() { 
      return this.administeredBy != null && !this.administeredBy.isEmpty();
    }

    /**
     * @param value {@link #administeredBy} (An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.)
     */
    public InsuranceProduct setAdministeredBy(Reference value) { 
      this.administeredBy = value;
      return this;
    }

    /**
     * @return {@link #coverageArea} (The geographic region in which a health insurance product's benefits apply.)
     */
    public List<Reference> getCoverageArea() { 
      if (this.coverageArea == null)
        this.coverageArea = new ArrayList<Reference>();
      return this.coverageArea;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setCoverageArea(List<Reference> theCoverageArea) { 
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

    public InsuranceProduct addCoverageArea(Reference t) { //3
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
     * @return {@link #contact} (The contact details of communication devices available relevant to the specific Insurance Product. This can include addresses, phone numbers, fax numbers, mobile numbers, email addresses and web sites.)
     */
    public List<ExtendedContactDetail> getContact() { 
      if (this.contact == null)
        this.contact = new ArrayList<ExtendedContactDetail>();
      return this.contact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setContact(List<ExtendedContactDetail> theContact) { 
      this.contact = theContact;
      return this;
    }

    public boolean hasContact() { 
      if (this.contact == null)
        return false;
      for (ExtendedContactDetail item : this.contact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ExtendedContactDetail addContact() { //3
      ExtendedContactDetail t = new ExtendedContactDetail();
      if (this.contact == null)
        this.contact = new ArrayList<ExtendedContactDetail>();
      this.contact.add(t);
      return t;
    }

    public InsuranceProduct addContact(ExtendedContactDetail t) { //3
      if (t == null)
        return this;
      if (this.contact == null)
        this.contact = new ArrayList<ExtendedContactDetail>();
      this.contact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist {3}
     */
    public ExtendedContactDetail getContactFirstRep() { 
      if (getContact().isEmpty()) {
        addContact();
      }
      return getContact().get(0);
    }

    /**
     * @return {@link #endpoint} (The technical endpoints providing access to services operated for the health insurance product.)
     */
    public List<Reference> getEndpoint() { 
      if (this.endpoint == null)
        this.endpoint = new ArrayList<Reference>();
      return this.endpoint;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setEndpoint(List<Reference> theEndpoint) { 
      this.endpoint = theEndpoint;
      return this;
    }

    public boolean hasEndpoint() { 
      if (this.endpoint == null)
        return false;
      for (Reference item : this.endpoint)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addEndpoint() { //3
      Reference t = new Reference();
      if (this.endpoint == null)
        this.endpoint = new ArrayList<Reference>();
      this.endpoint.add(t);
      return t;
    }

    public InsuranceProduct addEndpoint(Reference t) { //3
      if (t == null)
        return this;
      if (this.endpoint == null)
        this.endpoint = new ArrayList<Reference>();
      this.endpoint.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #endpoint}, creating it if it does not already exist {3}
     */
    public Reference getEndpointFirstRep() { 
      if (getEndpoint().isEmpty()) {
        addEndpoint();
      }
      return getEndpoint().get(0);
    }

    /**
     * @return {@link #network} (Reference to the network included in the health insurance product.)
     */
    public List<Reference> getNetwork() { 
      if (this.network == null)
        this.network = new ArrayList<Reference>();
      return this.network;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setNetwork(List<Reference> theNetwork) { 
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

    public InsuranceProduct addNetwork(Reference t) { //3
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
     * @return {@link #coverage} (Details about the coverage offered by the insurance product.)
     */
    public List<InsuranceProductCoverageComponent> getCoverage() { 
      if (this.coverage == null)
        this.coverage = new ArrayList<InsuranceProductCoverageComponent>();
      return this.coverage;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setCoverage(List<InsuranceProductCoverageComponent> theCoverage) { 
      this.coverage = theCoverage;
      return this;
    }

    public boolean hasCoverage() { 
      if (this.coverage == null)
        return false;
      for (InsuranceProductCoverageComponent item : this.coverage)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsuranceProductCoverageComponent addCoverage() { //3
      InsuranceProductCoverageComponent t = new InsuranceProductCoverageComponent();
      if (this.coverage == null)
        this.coverage = new ArrayList<InsuranceProductCoverageComponent>();
      this.coverage.add(t);
      return t;
    }

    public InsuranceProduct addCoverage(InsuranceProductCoverageComponent t) { //3
      if (t == null)
        return this;
      if (this.coverage == null)
        this.coverage = new ArrayList<InsuranceProductCoverageComponent>();
      this.coverage.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #coverage}, creating it if it does not already exist {3}
     */
    public InsuranceProductCoverageComponent getCoverageFirstRep() { 
      if (getCoverage().isEmpty()) {
        addCoverage();
      }
      return getCoverage().get(0);
    }

    /**
     * @return {@link #related} (Another product that is related to this product. Often used to create relationships to parents or families of products.)
     */
    public List<InsuranceProductRelatedComponent> getRelated() { 
      if (this.related == null)
        this.related = new ArrayList<InsuranceProductRelatedComponent>();
      return this.related;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public InsuranceProduct setRelated(List<InsuranceProductRelatedComponent> theRelated) { 
      this.related = theRelated;
      return this;
    }

    public boolean hasRelated() { 
      if (this.related == null)
        return false;
      for (InsuranceProductRelatedComponent item : this.related)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsuranceProductRelatedComponent addRelated() { //3
      InsuranceProductRelatedComponent t = new InsuranceProductRelatedComponent();
      if (this.related == null)
        this.related = new ArrayList<InsuranceProductRelatedComponent>();
      this.related.add(t);
      return t;
    }

    public InsuranceProduct addRelated(InsuranceProductRelatedComponent t) { //3
      if (t == null)
        return this;
      if (this.related == null)
        this.related = new ArrayList<InsuranceProductRelatedComponent>();
      this.related.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #related}, creating it if it does not already exist {3}
     */
    public InsuranceProductRelatedComponent getRelatedFirstRep() { 
      if (getRelated().isEmpty()) {
        addRelated();
      }
      return getRelated().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The current state of the health insurance product.", 0, 1, status));
        children.add(new Property("type", "CodeableConcept", "The kind of health insurance product.", 0, java.lang.Integer.MAX_VALUE, type));
        children.add(new Property("name", "string", "Official name of the health insurance product as designated by the owner.", 0, 1, name));
        children.add(new Property("alias", "string", "A list of alternate names that the product is known as, or was known as in the past.", 0, java.lang.Integer.MAX_VALUE, alias));
        children.add(new Property("period", "Period", "The period of time that the health insurance product is available.", 0, 1, period));
        children.add(new Property("ownedBy", "Reference(Organization)", "The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.", 0, 1, ownedBy));
        children.add(new Property("administeredBy", "Reference(Organization)", "An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.", 0, 1, administeredBy));
        children.add(new Property("coverageArea", "Reference(Location)", "The geographic region in which a health insurance product's benefits apply.", 0, java.lang.Integer.MAX_VALUE, coverageArea));
        children.add(new Property("contact", "ExtendedContactDetail", "The contact details of communication devices available relevant to the specific Insurance Product. This can include addresses, phone numbers, fax numbers, mobile numbers, email addresses and web sites.", 0, java.lang.Integer.MAX_VALUE, contact));
        children.add(new Property("endpoint", "Reference(Endpoint)", "The technical endpoints providing access to services operated for the health insurance product.", 0, java.lang.Integer.MAX_VALUE, endpoint));
        children.add(new Property("network", "Reference(Organization)", "Reference to the network included in the health insurance product.", 0, java.lang.Integer.MAX_VALUE, network));
        children.add(new Property("coverage", "", "Details about the coverage offered by the insurance product.", 0, java.lang.Integer.MAX_VALUE, coverage));
        children.add(new Property("related", "", "Another product that is related to this product. Often used to create relationships to parents or families of products.", 0, java.lang.Integer.MAX_VALUE, related));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Business identifiers assigned to this health insurance product which remain constant as the resource is updated and propagates from server to server.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The current state of the health insurance product.", 0, 1, status);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The kind of health insurance product.", 0, java.lang.Integer.MAX_VALUE, type);
        case 3373707: /*name*/  return new Property("name", "string", "Official name of the health insurance product as designated by the owner.", 0, 1, name);
        case 92902992: /*alias*/  return new Property("alias", "string", "A list of alternate names that the product is known as, or was known as in the past.", 0, java.lang.Integer.MAX_VALUE, alias);
        case -991726143: /*period*/  return new Property("period", "Period", "The period of time that the health insurance product is available.", 0, 1, period);
        case -1054743076: /*ownedBy*/  return new Property("ownedBy", "Reference(Organization)", "The entity that is providing  the health insurance product and underwriting the risk.  This is typically an insurance carriers, other third-party payers, or health plan sponsors comonly referred to as 'payers'.", 0, 1, ownedBy);
        case 898770462: /*administeredBy*/  return new Property("administeredBy", "Reference(Organization)", "An organization which administer other services such as underwriting, customer service and/or claims processing on behalf of the health insurance product owner.", 0, 1, administeredBy);
        case -1532328299: /*coverageArea*/  return new Property("coverageArea", "Reference(Location)", "The geographic region in which a health insurance product's benefits apply.", 0, java.lang.Integer.MAX_VALUE, coverageArea);
        case 951526432: /*contact*/  return new Property("contact", "ExtendedContactDetail", "The contact details of communication devices available relevant to the specific Insurance Product. This can include addresses, phone numbers, fax numbers, mobile numbers, email addresses and web sites.", 0, java.lang.Integer.MAX_VALUE, contact);
        case 1741102485: /*endpoint*/  return new Property("endpoint", "Reference(Endpoint)", "The technical endpoints providing access to services operated for the health insurance product.", 0, java.lang.Integer.MAX_VALUE, endpoint);
        case 1843485230: /*network*/  return new Property("network", "Reference(Organization)", "Reference to the network included in the health insurance product.", 0, java.lang.Integer.MAX_VALUE, network);
        case -351767064: /*coverage*/  return new Property("coverage", "", "Details about the coverage offered by the insurance product.", 0, java.lang.Integer.MAX_VALUE, coverage);
        case 1090493483: /*related*/  return new Property("related", "", "Another product that is related to this product. Often used to create relationships to parents or families of products.", 0, java.lang.Integer.MAX_VALUE, related);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case 3575610: /*type*/ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 92902992: /*alias*/ return this.alias == null ? new Base[0] : this.alias.toArray(new Base[this.alias.size()]); // StringType
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case -1054743076: /*ownedBy*/ return this.ownedBy == null ? new Base[0] : new Base[] {this.ownedBy}; // Reference
        case 898770462: /*administeredBy*/ return this.administeredBy == null ? new Base[0] : new Base[] {this.administeredBy}; // Reference
        case -1532328299: /*coverageArea*/ return this.coverageArea == null ? new Base[0] : this.coverageArea.toArray(new Base[this.coverageArea.size()]); // Reference
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ExtendedContactDetail
        case 1741102485: /*endpoint*/ return this.endpoint == null ? new Base[0] : this.endpoint.toArray(new Base[this.endpoint.size()]); // Reference
        case 1843485230: /*network*/ return this.network == null ? new Base[0] : this.network.toArray(new Base[this.network.size()]); // Reference
        case -351767064: /*coverage*/ return this.coverage == null ? new Base[0] : this.coverage.toArray(new Base[this.coverage.size()]); // InsuranceProductCoverageComponent
        case 1090493483: /*related*/ return this.related == null ? new Base[0] : this.related.toArray(new Base[this.related.size()]); // InsuranceProductRelatedComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case 3575610: // type
          this.getType().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3373707: // name
          this.name = TypeConvertor.castToString(value); // StringType
          return value;
        case 92902992: // alias
          this.getAlias().add(TypeConvertor.castToString(value)); // StringType
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case -1054743076: // ownedBy
          this.ownedBy = TypeConvertor.castToReference(value); // Reference
          return value;
        case 898770462: // administeredBy
          this.administeredBy = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1532328299: // coverageArea
          this.getCoverageArea().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 951526432: // contact
          this.getContact().add(TypeConvertor.castToExtendedContactDetail(value)); // ExtendedContactDetail
          return value;
        case 1741102485: // endpoint
          this.getEndpoint().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 1843485230: // network
          this.getNetwork().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case -351767064: // coverage
          this.getCoverage().add((InsuranceProductCoverageComponent) value); // InsuranceProductCoverageComponent
          return value;
        case 1090493483: // related
          this.getRelated().add((InsuranceProductRelatedComponent) value); // InsuranceProductRelatedComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("type")) {
          this.getType().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("name")) {
          this.name = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("alias")) {
          this.getAlias().add(TypeConvertor.castToString(value));
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("ownedBy")) {
          this.ownedBy = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("administeredBy")) {
          this.administeredBy = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("coverageArea")) {
          this.getCoverageArea().add(TypeConvertor.castToReference(value));
        } else if (name.equals("contact")) {
          this.getContact().add(TypeConvertor.castToExtendedContactDetail(value));
        } else if (name.equals("endpoint")) {
          this.getEndpoint().add(TypeConvertor.castToReference(value));
        } else if (name.equals("network")) {
          this.getNetwork().add(TypeConvertor.castToReference(value));
        } else if (name.equals("coverage")) {
          this.getCoverage().add((InsuranceProductCoverageComponent) value);
        } else if (name.equals("related")) {
          this.getRelated().add((InsuranceProductRelatedComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case 3575610:  return addType(); 
        case 3373707:  return getNameElement();
        case 92902992:  return addAliasElement();
        case -991726143:  return getPeriod();
        case -1054743076:  return getOwnedBy();
        case 898770462:  return getAdministeredBy();
        case -1532328299:  return addCoverageArea(); 
        case 951526432:  return addContact(); 
        case 1741102485:  return addEndpoint(); 
        case 1843485230:  return addNetwork(); 
        case -351767064:  return addCoverage(); 
        case 1090493483:  return addRelated(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 3373707: /*name*/ return new String[] {"string"};
        case 92902992: /*alias*/ return new String[] {"string"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case -1054743076: /*ownedBy*/ return new String[] {"Reference"};
        case 898770462: /*administeredBy*/ return new String[] {"Reference"};
        case -1532328299: /*coverageArea*/ return new String[] {"Reference"};
        case 951526432: /*contact*/ return new String[] {"ExtendedContactDetail"};
        case 1741102485: /*endpoint*/ return new String[] {"Reference"};
        case 1843485230: /*network*/ return new String[] {"Reference"};
        case -351767064: /*coverage*/ return new String[] {};
        case 1090493483: /*related*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property InsuranceProduct.status");
        }
        else if (name.equals("type")) {
          return addType();
        }
        else if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a singleton property InsuranceProduct.name");
        }
        else if (name.equals("alias")) {
          throw new FHIRException("Cannot call addChild on a singleton property InsuranceProduct.alias");
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("ownedBy")) {
          this.ownedBy = new Reference();
          return this.ownedBy;
        }
        else if (name.equals("administeredBy")) {
          this.administeredBy = new Reference();
          return this.administeredBy;
        }
        else if (name.equals("coverageArea")) {
          return addCoverageArea();
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else if (name.equals("endpoint")) {
          return addEndpoint();
        }
        else if (name.equals("network")) {
          return addNetwork();
        }
        else if (name.equals("coverage")) {
          return addCoverage();
        }
        else if (name.equals("related")) {
          return addRelated();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "InsuranceProduct";

  }

      public InsuranceProduct copy() {
        InsuranceProduct dst = new InsuranceProduct();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsuranceProduct dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        if (type != null) {
          dst.type = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : type)
            dst.type.add(i.copy());
        };
        dst.name = name == null ? null : name.copy();
        if (alias != null) {
          dst.alias = new ArrayList<StringType>();
          for (StringType i : alias)
            dst.alias.add(i.copy());
        };
        dst.period = period == null ? null : period.copy();
        dst.ownedBy = ownedBy == null ? null : ownedBy.copy();
        dst.administeredBy = administeredBy == null ? null : administeredBy.copy();
        if (coverageArea != null) {
          dst.coverageArea = new ArrayList<Reference>();
          for (Reference i : coverageArea)
            dst.coverageArea.add(i.copy());
        };
        if (contact != null) {
          dst.contact = new ArrayList<ExtendedContactDetail>();
          for (ExtendedContactDetail i : contact)
            dst.contact.add(i.copy());
        };
        if (endpoint != null) {
          dst.endpoint = new ArrayList<Reference>();
          for (Reference i : endpoint)
            dst.endpoint.add(i.copy());
        };
        if (network != null) {
          dst.network = new ArrayList<Reference>();
          for (Reference i : network)
            dst.network.add(i.copy());
        };
        if (coverage != null) {
          dst.coverage = new ArrayList<InsuranceProductCoverageComponent>();
          for (InsuranceProductCoverageComponent i : coverage)
            dst.coverage.add(i.copy());
        };
        if (related != null) {
          dst.related = new ArrayList<InsuranceProductRelatedComponent>();
          for (InsuranceProductRelatedComponent i : related)
            dst.related.add(i.copy());
        };
      }

      protected InsuranceProduct typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsuranceProduct))
          return false;
        InsuranceProduct o = (InsuranceProduct) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(type, o.type, true)
           && compareDeep(name, o.name, true) && compareDeep(alias, o.alias, true) && compareDeep(period, o.period, true)
           && compareDeep(ownedBy, o.ownedBy, true) && compareDeep(administeredBy, o.administeredBy, true)
           && compareDeep(coverageArea, o.coverageArea, true) && compareDeep(contact, o.contact, true) && compareDeep(endpoint, o.endpoint, true)
           && compareDeep(network, o.network, true) && compareDeep(coverage, o.coverage, true) && compareDeep(related, o.related, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsuranceProduct))
          return false;
        InsuranceProduct o = (InsuranceProduct) other_;
        return compareValues(status, o.status, true) && compareValues(name, o.name, true) && compareValues(alias, o.alias, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, type
          , name, alias, period, ownedBy, administeredBy, coverageArea, contact, endpoint
          , network, coverage, related);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.InsuranceProduct;
   }

 /**
   * Search parameter: <b>name</b>
   * <p>
   * Description: <b>A portion of the insurance product's name or alias</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.name | InsuranceProduct.alias</b><br>
   * </p>
   */
  @SearchParamDefinition(name="name", path="InsuranceProduct.name | InsuranceProduct.alias", description="A portion of the insurance product's name or alias", type="string" )
  public static final String SP_NAME = "name";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>name</b>
   * <p>
   * Description: <b>A portion of the insurance product's name or alias</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.name | InsuranceProduct.alias</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam NAME = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_NAME);

 /**
   * Search parameter: <b>owned-by</b>
   * <p>
   * Description: <b>The issuer of the insurance product</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsuranceProduct.ownedBy</b><br>
   * </p>
   */
  @SearchParamDefinition(name="owned-by", path="InsuranceProduct.ownedBy", description="The issuer of the insurance product", type="reference", target={Organization.class } )
  public static final String SP_OWNED_BY = "owned-by";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>owned-by</b>
   * <p>
   * Description: <b>The issuer of the insurance product</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsuranceProduct.ownedBy</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam OWNED_BY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_OWNED_BY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsuranceProduct:owned-by</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_OWNED_BY = new ca.uhn.fhir.model.api.Include("InsuranceProduct:owned-by").toLocked();

 /**
   * Search parameter: <b>endpoint</b>
   * <p>
   * Description: <b>The endpoint(s) applicable to this product</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsuranceProduct.endpoint</b><br>
   * </p>
   */
  @SearchParamDefinition(name="endpoint", path="InsuranceProduct.endpoint", description="The endpoint(s) applicable to this product", type="reference", target={Endpoint.class } )
  public static final String SP_ENDPOINT = "endpoint";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>endpoint</b>
   * <p>
   * Description: <b>The endpoint(s) applicable to this product</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsuranceProduct.endpoint</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENDPOINT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENDPOINT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsuranceProduct:endpoint</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENDPOINT = new ca.uhn.fhir.model.api.Include("InsuranceProduct:endpoint").toLocked();

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>A code for the type of insurance product</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="InsuranceProduct.type", description="A code for the type of insurance product", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>A code for the type of insurance product</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);

 /**
   * Search parameter: <b>phonetic</b>
   * <p>
   * Description: <b>A portion of the product's name using some kind of phonetic matching algorithm</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.name</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phonetic", path="InsuranceProduct.name", description="A portion of the product's name using some kind of phonetic matching algorithm", type="string" )
  public static final String SP_PHONETIC = "phonetic";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
   * <p>
   * Description: <b>A portion of the product's name using some kind of phonetic matching algorithm</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.name</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam PHONETIC = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_PHONETIC);

 /**
   * Search parameter: <b>administered-by</b>
   * <p>
   * Description: <b>Product administrator</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsuranceProduct.administeredBy</b><br>
   * </p>
   */
  @SearchParamDefinition(name="administered-by", path="InsuranceProduct.administeredBy", description="Product administrator", type="reference", target={Organization.class } )
  public static final String SP_ADMINISTERED_BY = "administered-by";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>administered-by</b>
   * <p>
   * Description: <b>Product administrator</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>InsuranceProduct.administeredBy</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ADMINISTERED_BY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ADMINISTERED_BY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>InsuranceProduct:administered-by</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ADMINISTERED_BY = new ca.uhn.fhir.model.api.Include("InsuranceProduct:administered-by").toLocked();

 /**
   * Search parameter: <b>contact-address</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address</b><br>
   * </p>
   */
  @SearchParamDefinition(name="contact-address", path="InsuranceProduct.contact.address", description="A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text", type="string" )
  public static final String SP_CONTACT_ADDRESS = "contact-address";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>contact-address</b>
   * <p>
   * Description: <b>A server defined search that may match any of the string fields in the Address, including line, city, district, state, country, postalCode, and/or text</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam CONTACT_ADDRESS = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_CONTACT_ADDRESS);

 /**
   * Search parameter: <b>contact-address-city</b>
   * <p>
   * Description: <b>A city specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.city</b><br>
   * </p>
   */
  @SearchParamDefinition(name="contact-address-city", path="InsuranceProduct.contact.address.city", description="A city specified in an address", type="string" )
  public static final String SP_CONTACT_ADDRESS_CITY = "contact-address-city";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>contact-address-city</b>
   * <p>
   * Description: <b>A city specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.city</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam CONTACT_ADDRESS_CITY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_CONTACT_ADDRESS_CITY);

 /**
   * Search parameter: <b>contact-address-use</b>
   * <p>
   * Description: <b>A use code specified in an address</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.contact.address.use</b><br>
   * </p>
   */
  @SearchParamDefinition(name="contact-address-use", path="InsuranceProduct.contact.address.use", description="A use code specified in an address", type="token" )
  public static final String SP_CONTACT_ADDRESS_USE = "contact-address-use";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>contact-address-use</b>
   * <p>
   * Description: <b>A use code specified in an address</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.contact.address.use</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTACT_ADDRESS_USE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTACT_ADDRESS_USE);

 /**
   * Search parameter: <b>contact-address-country</b>
   * <p>
   * Description: <b>A country specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.country</b><br>
   * </p>
   */
  @SearchParamDefinition(name="contact-address-country", path="InsuranceProduct.contact.address.country", description="A country specified in an address", type="string" )
  public static final String SP_CONTACT_ADDRESS_COUNTRY = "contact-address-country";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>contact-address-country</b>
   * <p>
   * Description: <b>A country specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.country</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam CONTACT_ADDRESS_COUNTRY = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_CONTACT_ADDRESS_COUNTRY);

 /**
   * Search parameter: <b>contact-address-postalcode</b>
   * <p>
   * Description: <b>A postal code specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.postalCode</b><br>
   * </p>
   */
  @SearchParamDefinition(name="contact-address-postalcode", path="InsuranceProduct.contact.address.postalCode", description="A postal code specified in an address", type="string" )
  public static final String SP_CONTACT_ADDRESS_POSTALCODE = "contact-address-postalcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>contact-address-postalcode</b>
   * <p>
   * Description: <b>A postal code specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.postalCode</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam CONTACT_ADDRESS_POSTALCODE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_CONTACT_ADDRESS_POSTALCODE);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>Is the Product record active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="InsuranceProduct.status", description="Is the Product record active", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>Is the Product record active</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Any identifier for the product (not the accreditation issuer's identifier)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="InsuranceProduct.identifier", description="Any identifier for the product (not the accreditation issuer's identifier)", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Any identifier for the product (not the accreditation issuer's identifier)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>InsuranceProduct.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>contact-address-state</b>
   * <p>
   * Description: <b>A state specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.state</b><br>
   * </p>
   */
  @SearchParamDefinition(name="contact-address-state", path="InsuranceProduct.contact.address.state", description="A state specified in an address", type="string" )
  public static final String SP_CONTACT_ADDRESS_STATE = "contact-address-state";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>contact-address-state</b>
   * <p>
   * Description: <b>A state specified in an address</b><br>
   * Type: <b>string</b><br>
   * Path: <b>InsuranceProduct.contact.address.state</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam CONTACT_ADDRESS_STATE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_CONTACT_ADDRESS_STATE);


}

