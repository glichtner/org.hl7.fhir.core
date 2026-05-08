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
 * A record of association of a device.
 */
@ResourceDef(name="DeviceAssociation", profile="http://hl7.org/fhir/StructureDefinition/DeviceAssociation")
public class DeviceAssociation extends DomainResource {

    public enum DeviceAssociationCodes {
        /**
         * The DeviceAssociation record is active.
         */
        ACTIVE, 
        /**
         * The DeviceAssociation record is no longer active.
         */
        INACTIVE, 
        /**
         * The DeviceAssociation record was entered in error.
         */
        ENTEREDINERROR, 
        /**
         * The status of the DeviceAssociation record is unknown.
         */
        UNKNOWN, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static DeviceAssociationCodes fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return ACTIVE;
        if ("inactive".equals(codeString))
          return INACTIVE;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown DeviceAssociationCodes code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ACTIVE: return "active";
            case INACTIVE: return "inactive";
            case ENTEREDINERROR: return "entered-in-error";
            case UNKNOWN: return "unknown";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ACTIVE: return "http://hl7.org/fhir/deviceassociation-status";
            case INACTIVE: return "http://hl7.org/fhir/deviceassociation-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/deviceassociation-status";
            case UNKNOWN: return "http://hl7.org/fhir/deviceassociation-status";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ACTIVE: return "The DeviceAssociation record is active.";
            case INACTIVE: return "The DeviceAssociation record is no longer active.";
            case ENTEREDINERROR: return "The DeviceAssociation record was entered in error.";
            case UNKNOWN: return "The status of the DeviceAssociation record is unknown.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ACTIVE: return "Active";
            case INACTIVE: return "Inactive";
            case ENTEREDINERROR: return "Entered in Error";
            case UNKNOWN: return "Unknown";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class DeviceAssociationCodesEnumFactory implements EnumFactory<DeviceAssociationCodes> {
    public DeviceAssociationCodes fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("active".equals(codeString))
          return DeviceAssociationCodes.ACTIVE;
        if ("inactive".equals(codeString))
          return DeviceAssociationCodes.INACTIVE;
        if ("entered-in-error".equals(codeString))
          return DeviceAssociationCodes.ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return DeviceAssociationCodes.UNKNOWN;
        throw new IllegalArgumentException("Unknown DeviceAssociationCodes code '"+codeString+"'");
        }
        public Enumeration<DeviceAssociationCodes> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<DeviceAssociationCodes>(this, DeviceAssociationCodes.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<DeviceAssociationCodes>(this, DeviceAssociationCodes.NULL, code);
        if ("active".equals(codeString))
          return new Enumeration<DeviceAssociationCodes>(this, DeviceAssociationCodes.ACTIVE, code);
        if ("inactive".equals(codeString))
          return new Enumeration<DeviceAssociationCodes>(this, DeviceAssociationCodes.INACTIVE, code);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<DeviceAssociationCodes>(this, DeviceAssociationCodes.ENTEREDINERROR, code);
        if ("unknown".equals(codeString))
          return new Enumeration<DeviceAssociationCodes>(this, DeviceAssociationCodes.UNKNOWN, code);
        throw new FHIRException("Unknown DeviceAssociationCodes code '"+codeString+"'");
        }
    public String toCode(DeviceAssociationCodes code) {
      if (code == DeviceAssociationCodes.ACTIVE)
        return "active";
      if (code == DeviceAssociationCodes.INACTIVE)
        return "inactive";
      if (code == DeviceAssociationCodes.ENTEREDINERROR)
        return "entered-in-error";
      if (code == DeviceAssociationCodes.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(DeviceAssociationCodes code) {
      return code.getSystem();
      }
    }

    /**
     * Instance identifier.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Instance identifier", formalDefinition="Instance identifier." )
    protected List<Identifier> identifier;

    /**
     * Reference to the device that is being associated.
     */
    @Child(name = "device", type = {Device.class}, order=1, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Reference to the device that is being associated", formalDefinition="Reference to the device that is being associated." )
    protected Reference device;

    /**
     * Describes the relationship between the device and subject.
     */
    @Child(name = "relationship", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Describes the relationship between the device and subject", formalDefinition="Describes the relationship between the device and subject." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/deviceassociation-relationship")
    protected List<CodeableConcept> relationship;

    /**
     * Indicates the state of the Device association.
     */
    @Child(name = "status", type = {CodeType.class}, order=3, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="active | inactive | entered-in-error | unknown", formalDefinition="Indicates the state of the Device association." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/deviceassociation-status")
    protected Enumeration<DeviceAssociationCodes> status;

    /**
     * The reasons given for the current association status.
     */
    @Child(name = "statusReason", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The reasons given for the current association status", formalDefinition="The reasons given for the current association status." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/deviceassociation-status-reason")
    protected List<CodeableConcept> statusReason;

    /**
     * State of the device’s association (e.g., implanted, attached, on, off, standby, defective).
     */
    @Child(name = "associationStatus", type = {CodeableConcept.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="State of the device’s association", formalDefinition="State of the device’s association (e.g., implanted, attached, on, off, standby, defective)." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/deviceassociation-association-status")
    protected CodeableConcept associationStatus;

    /**
     * The individual, group of individuals or device that the device is on or associated with.
     */
    @Child(name = "subject", type = {BiologicallyDerivedProduct.class, CareTeam.class, Device.class, Group.class, Location.class, Medication.class, NutritionProduct.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Specimen.class, Substance.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The entity(ies) that the device is on or associated with", formalDefinition="The individual, group of individuals or device that the device is on or associated with." )
    protected Reference subject;

    /**
     * The entity for which the device is being used, benefitting from the device, or which the device is being operated upon, which is usually distinct from the association subject, such as an operator or similar.
     */
    @Child(name = "focus", type = {BiologicallyDerivedProduct.class, CareTeam.class, Device.class, Group.class, Location.class, Medication.class, NutritionProduct.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Specimen.class, Substance.class}, order=7, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The target of the association", formalDefinition="The entity for which the device is being used, benefitting from the device, or which the device is being operated upon, which is usually distinct from the association subject, such as an operator or similar." )
    protected Reference focus;

    /**
     * Current anatomical location of the device in/on subject.
     */
    @Child(name = "bodyStructure", type = {BodyStructure.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Current anatomical location of the device in/on subject", formalDefinition="Current anatomical location of the device in/on subject." )
    protected Reference bodyStructure;

    /**
     * Begin and end dates and times for the device association.
     */
    @Child(name = "period", type = {Period.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Begin and end dates and times for the device association", formalDefinition="Begin and end dates and times for the device association." )
    protected Period period;

    private static final long serialVersionUID = -1124728553L;

  /**
   * Constructor
   */
    public DeviceAssociation() {
      super();
    }

  /**
   * Constructor
   */
    public DeviceAssociation(Reference device, DeviceAssociationCodes status) {
      super();
      this.setDevice(device);
      this.setStatus(status);
    }

    /**
     * @return {@link #identifier} (Instance identifier.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAssociation setIdentifier(List<Identifier> theIdentifier) { 
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

    public DeviceAssociation addIdentifier(Identifier t) { //3
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
     * @return {@link #device} (Reference to the device that is being associated.)
     */
    public Reference getDevice() { 
      if (this.device == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.device");
        else if (Configuration.doAutoCreate())
          this.device = new Reference(); // cc
      return this.device;
    }

    public boolean hasDevice() { 
      return this.device != null && !this.device.isEmpty();
    }

    /**
     * @param value {@link #device} (Reference to the device that is being associated.)
     */
    public DeviceAssociation setDevice(Reference value) { 
      this.device = value;
      return this;
    }

    /**
     * @return {@link #relationship} (Describes the relationship between the device and subject.)
     */
    public List<CodeableConcept> getRelationship() { 
      if (this.relationship == null)
        this.relationship = new ArrayList<CodeableConcept>();
      return this.relationship;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAssociation setRelationship(List<CodeableConcept> theRelationship) { 
      this.relationship = theRelationship;
      return this;
    }

    public boolean hasRelationship() { 
      if (this.relationship == null)
        return false;
      for (CodeableConcept item : this.relationship)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addRelationship() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.relationship == null)
        this.relationship = new ArrayList<CodeableConcept>();
      this.relationship.add(t);
      return t;
    }

    public DeviceAssociation addRelationship(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.relationship == null)
        this.relationship = new ArrayList<CodeableConcept>();
      this.relationship.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relationship}, creating it if it does not already exist {3}
     */
    public CodeableConcept getRelationshipFirstRep() { 
      if (getRelationship().isEmpty()) {
        addRelationship();
      }
      return getRelationship().get(0);
    }

    /**
     * @return {@link #status} (Indicates the state of the Device association.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DeviceAssociationCodes> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<DeviceAssociationCodes>(new DeviceAssociationCodesEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (Indicates the state of the Device association.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DeviceAssociation setStatusElement(Enumeration<DeviceAssociationCodes> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return Indicates the state of the Device association.
     */
    public DeviceAssociationCodes getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value Indicates the state of the Device association.
     */
    public DeviceAssociation setStatus(DeviceAssociationCodes value) { 
        if (this.status == null)
          this.status = new Enumeration<DeviceAssociationCodes>(new DeviceAssociationCodesEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #statusReason} (The reasons given for the current association status.)
     */
    public List<CodeableConcept> getStatusReason() { 
      if (this.statusReason == null)
        this.statusReason = new ArrayList<CodeableConcept>();
      return this.statusReason;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DeviceAssociation setStatusReason(List<CodeableConcept> theStatusReason) { 
      this.statusReason = theStatusReason;
      return this;
    }

    public boolean hasStatusReason() { 
      if (this.statusReason == null)
        return false;
      for (CodeableConcept item : this.statusReason)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addStatusReason() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.statusReason == null)
        this.statusReason = new ArrayList<CodeableConcept>();
      this.statusReason.add(t);
      return t;
    }

    public DeviceAssociation addStatusReason(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.statusReason == null)
        this.statusReason = new ArrayList<CodeableConcept>();
      this.statusReason.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #statusReason}, creating it if it does not already exist {3}
     */
    public CodeableConcept getStatusReasonFirstRep() { 
      if (getStatusReason().isEmpty()) {
        addStatusReason();
      }
      return getStatusReason().get(0);
    }

    /**
     * @return {@link #associationStatus} (State of the device’s association (e.g., implanted, attached, on, off, standby, defective).)
     */
    public CodeableConcept getAssociationStatus() { 
      if (this.associationStatus == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.associationStatus");
        else if (Configuration.doAutoCreate())
          this.associationStatus = new CodeableConcept(); // cc
      return this.associationStatus;
    }

    public boolean hasAssociationStatus() { 
      return this.associationStatus != null && !this.associationStatus.isEmpty();
    }

    /**
     * @param value {@link #associationStatus} (State of the device’s association (e.g., implanted, attached, on, off, standby, defective).)
     */
    public DeviceAssociation setAssociationStatus(CodeableConcept value) { 
      this.associationStatus = value;
      return this;
    }

    /**
     * @return {@link #subject} (The individual, group of individuals or device that the device is on or associated with.)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference(); // cc
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The individual, group of individuals or device that the device is on or associated with.)
     */
    public DeviceAssociation setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #focus} (The entity for which the device is being used, benefitting from the device, or which the device is being operated upon, which is usually distinct from the association subject, such as an operator or similar.)
     */
    public Reference getFocus() { 
      if (this.focus == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.focus");
        else if (Configuration.doAutoCreate())
          this.focus = new Reference(); // cc
      return this.focus;
    }

    public boolean hasFocus() { 
      return this.focus != null && !this.focus.isEmpty();
    }

    /**
     * @param value {@link #focus} (The entity for which the device is being used, benefitting from the device, or which the device is being operated upon, which is usually distinct from the association subject, such as an operator or similar.)
     */
    public DeviceAssociation setFocus(Reference value) { 
      this.focus = value;
      return this;
    }

    /**
     * @return {@link #bodyStructure} (Current anatomical location of the device in/on subject.)
     */
    public Reference getBodyStructure() { 
      if (this.bodyStructure == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.bodyStructure");
        else if (Configuration.doAutoCreate())
          this.bodyStructure = new Reference(); // cc
      return this.bodyStructure;
    }

    public boolean hasBodyStructure() { 
      return this.bodyStructure != null && !this.bodyStructure.isEmpty();
    }

    /**
     * @param value {@link #bodyStructure} (Current anatomical location of the device in/on subject.)
     */
    public DeviceAssociation setBodyStructure(Reference value) { 
      this.bodyStructure = value;
      return this;
    }

    /**
     * @return {@link #period} (Begin and end dates and times for the device association.)
     */
    public Period getPeriod() { 
      if (this.period == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceAssociation.period");
        else if (Configuration.doAutoCreate())
          this.period = new Period(); // cc
      return this.period;
    }

    public boolean hasPeriod() { 
      return this.period != null && !this.period.isEmpty();
    }

    /**
     * @param value {@link #period} (Begin and end dates and times for the device association.)
     */
    public DeviceAssociation setPeriod(Period value) { 
      this.period = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Instance identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("device", "Reference(Device)", "Reference to the device that is being associated.", 0, 1, device));
        children.add(new Property("relationship", "CodeableConcept", "Describes the relationship between the device and subject.", 0, java.lang.Integer.MAX_VALUE, relationship));
        children.add(new Property("status", "code", "Indicates the state of the Device association.", 0, 1, status));
        children.add(new Property("statusReason", "CodeableConcept", "The reasons given for the current association status.", 0, java.lang.Integer.MAX_VALUE, statusReason));
        children.add(new Property("associationStatus", "CodeableConcept", "State of the device’s association (e.g., implanted, attached, on, off, standby, defective).", 0, 1, associationStatus));
        children.add(new Property("subject", "Reference(BiologicallyDerivedProduct|CareTeam|Device|Group|Location|Medication|NutritionProduct|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson|Specimen|Substance)", "The individual, group of individuals or device that the device is on or associated with.", 0, 1, subject));
        children.add(new Property("focus", "Reference(BiologicallyDerivedProduct|CareTeam|Device|Group|Location|Medication|NutritionProduct|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson|Specimen|Substance)", "The entity for which the device is being used, benefitting from the device, or which the device is being operated upon, which is usually distinct from the association subject, such as an operator or similar.", 0, 1, focus));
        children.add(new Property("bodyStructure", "Reference(BodyStructure)", "Current anatomical location of the device in/on subject.", 0, 1, bodyStructure));
        children.add(new Property("period", "Period", "Begin and end dates and times for the device association.", 0, 1, period));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Instance identifier.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -1335157162: /*device*/  return new Property("device", "Reference(Device)", "Reference to the device that is being associated.", 0, 1, device);
        case -261851592: /*relationship*/  return new Property("relationship", "CodeableConcept", "Describes the relationship between the device and subject.", 0, java.lang.Integer.MAX_VALUE, relationship);
        case -892481550: /*status*/  return new Property("status", "code", "Indicates the state of the Device association.", 0, 1, status);
        case 2051346646: /*statusReason*/  return new Property("statusReason", "CodeableConcept", "The reasons given for the current association status.", 0, java.lang.Integer.MAX_VALUE, statusReason);
        case -605391917: /*associationStatus*/  return new Property("associationStatus", "CodeableConcept", "State of the device’s association (e.g., implanted, attached, on, off, standby, defective).", 0, 1, associationStatus);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(BiologicallyDerivedProduct|CareTeam|Device|Group|Location|Medication|NutritionProduct|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson|Specimen|Substance)", "The individual, group of individuals or device that the device is on or associated with.", 0, 1, subject);
        case 97604824: /*focus*/  return new Property("focus", "Reference(BiologicallyDerivedProduct|CareTeam|Device|Group|Location|Medication|NutritionProduct|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson|Specimen|Substance)", "The entity for which the device is being used, benefitting from the device, or which the device is being operated upon, which is usually distinct from the association subject, such as an operator or similar.", 0, 1, focus);
        case -1001731599: /*bodyStructure*/  return new Property("bodyStructure", "Reference(BodyStructure)", "Current anatomical location of the device in/on subject.", 0, 1, bodyStructure);
        case -991726143: /*period*/  return new Property("period", "Period", "Begin and end dates and times for the device association.", 0, 1, period);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -1335157162: /*device*/ return this.device == null ? new Base[0] : new Base[] {this.device}; // Reference
        case -261851592: /*relationship*/ return this.relationship == null ? new Base[0] : this.relationship.toArray(new Base[this.relationship.size()]); // CodeableConcept
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<DeviceAssociationCodes>
        case 2051346646: /*statusReason*/ return this.statusReason == null ? new Base[0] : this.statusReason.toArray(new Base[this.statusReason.size()]); // CodeableConcept
        case -605391917: /*associationStatus*/ return this.associationStatus == null ? new Base[0] : new Base[] {this.associationStatus}; // CodeableConcept
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : new Base[] {this.subject}; // Reference
        case 97604824: /*focus*/ return this.focus == null ? new Base[0] : new Base[] {this.focus}; // Reference
        case -1001731599: /*bodyStructure*/ return this.bodyStructure == null ? new Base[0] : new Base[] {this.bodyStructure}; // Reference
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -1335157162: // device
          this.device = TypeConvertor.castToReference(value); // Reference
          return value;
        case -261851592: // relationship
          this.getRelationship().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -892481550: // status
          value = new DeviceAssociationCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<DeviceAssociationCodes>
          return value;
        case 2051346646: // statusReason
          this.getStatusReason().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -605391917: // associationStatus
          this.associationStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1867885268: // subject
          this.subject = TypeConvertor.castToReference(value); // Reference
          return value;
        case 97604824: // focus
          this.focus = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1001731599: // bodyStructure
          this.bodyStructure = TypeConvertor.castToReference(value); // Reference
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("device")) {
          this.device = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("relationship")) {
          this.getRelationship().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("status")) {
          value = new DeviceAssociationCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<DeviceAssociationCodes>
        } else if (name.equals("statusReason")) {
          this.getStatusReason().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("associationStatus")) {
          this.associationStatus = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("subject")) {
          this.subject = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("focus")) {
          this.focus = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("bodyStructure")) {
          this.bodyStructure = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -1335157162:  return getDevice();
        case -261851592:  return addRelationship(); 
        case -892481550:  return getStatusElement();
        case 2051346646:  return addStatusReason(); 
        case -605391917:  return getAssociationStatus();
        case -1867885268:  return getSubject();
        case 97604824:  return getFocus();
        case -1001731599:  return getBodyStructure();
        case -991726143:  return getPeriod();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -1335157162: /*device*/ return new String[] {"Reference"};
        case -261851592: /*relationship*/ return new String[] {"CodeableConcept"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 2051346646: /*statusReason*/ return new String[] {"CodeableConcept"};
        case -605391917: /*associationStatus*/ return new String[] {"CodeableConcept"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 97604824: /*focus*/ return new String[] {"Reference"};
        case -1001731599: /*bodyStructure*/ return new String[] {"Reference"};
        case -991726143: /*period*/ return new String[] {"Period"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("device")) {
          this.device = new Reference();
          return this.device;
        }
        else if (name.equals("relationship")) {
          return addRelationship();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property DeviceAssociation.status");
        }
        else if (name.equals("statusReason")) {
          return addStatusReason();
        }
        else if (name.equals("associationStatus")) {
          this.associationStatus = new CodeableConcept();
          return this.associationStatus;
        }
        else if (name.equals("subject")) {
          this.subject = new Reference();
          return this.subject;
        }
        else if (name.equals("focus")) {
          this.focus = new Reference();
          return this.focus;
        }
        else if (name.equals("bodyStructure")) {
          this.bodyStructure = new Reference();
          return this.bodyStructure;
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "DeviceAssociation";

  }

      public DeviceAssociation copy() {
        DeviceAssociation dst = new DeviceAssociation();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DeviceAssociation dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.device = device == null ? null : device.copy();
        if (relationship != null) {
          dst.relationship = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : relationship)
            dst.relationship.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        if (statusReason != null) {
          dst.statusReason = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : statusReason)
            dst.statusReason.add(i.copy());
        };
        dst.associationStatus = associationStatus == null ? null : associationStatus.copy();
        dst.subject = subject == null ? null : subject.copy();
        dst.focus = focus == null ? null : focus.copy();
        dst.bodyStructure = bodyStructure == null ? null : bodyStructure.copy();
        dst.period = period == null ? null : period.copy();
      }

      protected DeviceAssociation typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DeviceAssociation))
          return false;
        DeviceAssociation o = (DeviceAssociation) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(device, o.device, true) && compareDeep(relationship, o.relationship, true)
           && compareDeep(status, o.status, true) && compareDeep(statusReason, o.statusReason, true) && compareDeep(associationStatus, o.associationStatus, true)
           && compareDeep(subject, o.subject, true) && compareDeep(focus, o.focus, true) && compareDeep(bodyStructure, o.bodyStructure, true)
           && compareDeep(period, o.period, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DeviceAssociation))
          return false;
        DeviceAssociation o = (DeviceAssociation) other_;
        return compareValues(status, o.status, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, device, relationship
          , status, statusReason, associationStatus, subject, focus, bodyStructure, period
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DeviceAssociation;
   }

 /**
   * Search parameter: <b>relationship</b>
   * <p>
   * Description: <b>Search for specific device association relationships</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAssociation.relationship</b><br>
   * </p>
   */
  @SearchParamDefinition(name="relationship", path="DeviceAssociation.relationship", description="Search for specific device association relationships", type="token" )
  public static final String SP_RELATIONSHIP = "relationship";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>relationship</b>
   * <p>
   * Description: <b>Search for specific device association relationships</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAssociation.relationship</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam RELATIONSHIP = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_RELATIONSHIP);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the device associations</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAssociation.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="DeviceAssociation.status", description="The status of the device associations", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the device associations</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAssociation.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>The identity of the individual(s) or entity for whom to list associations</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAssociation.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="DeviceAssociation.subject", description="The identity of the individual(s) or entity for whom to list associations", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Group"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={BiologicallyDerivedProduct.class, CareTeam.class, Device.class, Group.class, Location.class, Medication.class, NutritionProduct.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Specimen.class, Substance.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>The identity of the individual(s) or entity for whom to list associations</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAssociation.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAssociation:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("DeviceAssociation:subject").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>The identifier of the device association</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAssociation.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="DeviceAssociation.identifier", description="The identifier of the device association", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>The identifier of the device association</b><br>
   * Type: <b>token</b><br>
   * Path: <b>DeviceAssociation.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>focus</b>
   * <p>
   * Description: <b>The focus of an association.</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAssociation.focus</b><br>
   * </p>
   */
  @SearchParamDefinition(name="focus", path="DeviceAssociation.focus", description="The focus of an association.", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Group"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={BiologicallyDerivedProduct.class, CareTeam.class, Device.class, Group.class, Location.class, Medication.class, NutritionProduct.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Specimen.class, Substance.class } )
  public static final String SP_FOCUS = "focus";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>focus</b>
   * <p>
   * Description: <b>The focus of an association.</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAssociation.focus</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam FOCUS = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_FOCUS);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAssociation:focus</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_FOCUS = new ca.uhn.fhir.model.api.Include("DeviceAssociation:focus").toLocked();

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
  @SearchParamDefinition(name="patient", path="Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BiologicallyDerivedProduct.collection.sourcePatient | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | Claim.subject.where(resolve() is Patient) | Claim.item.subject.where(resolve() is Patient) | ClaimResponse.subject.where(resolve() is Patient) | ClaimResponse.addItem.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceAssociation.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate.where(resolve() is Patient) | EpisodeOfCare.subject.where(resolve() is Patient) | ExplanationOfBenefit.subject.where(resolve() is Patient) | ExplanationOfBenefit.item.subject.where(resolve() is Patient) | ExplanationOfBenefit.addItem.subject.where(resolve() is Patient) | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | Task.for.where(resolve() is Patient) | VisionPrescription.patient", description="Multiple Resources: \r\n\r\n* [Account](account.html): The entity that caused the expenses\r\n* [AdverseEvent](adverseevent.html): Subject impacted by event\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [Appointment](appointment.html): One of the individuals of the appointment is this patient\r\n* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient\r\n* [AuditEvent](auditevent.html): Where the activity involved patient data\r\n* [Basic](basic.html): Identifies the focus of this resource\r\n* [BiologicallyDerivedProduct](biologicallyderivedproduct.html): The patient who underwent the procedure to collect the product\r\n* [BodyStructure](bodystructure.html): Who this is about\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [Claim](claim.html): Patient receiving the products or services\r\n* [ClaimResponse](claimresponse.html): The subject of care\r\n* [Communication](communication.html): Focus of message\r\n* [CommunicationRequest](communicationrequest.html): Focus of message\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [Contract](contract.html): The identity of the subject of the contract (if a patient)\r\n* [Coverage](coverage.html): Retrieve coverages for a patient\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceAssociation](deviceassociation.html): The patient associated with the device\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient present at the encounter\r\n* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results\r\n* [ImagingSelection](imagingselection.html): Who the study is about\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [Invoice](invoice.html): Recipient(s) of goods and services\r\n* [List](list.html): If all resources have the same subject\r\n* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.\r\n* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Person](person.html): The Person links to this Patient\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [Provenance](provenance.html): Where the activity involved patient data\r\n* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response\r\n* [RelatedPerson](relatedperson.html): The patient this related person is related to\r\n* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations\r\n* [ResearchSubject](researchsubject.html): Who or what is part of study\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [Specimen](specimen.html): The patient the specimen comes from\r\n* [Task](task.html): Search by patient\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={Patient.class } )
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
   * the path value of "<b>DeviceAssociation:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("DeviceAssociation:patient").toLocked();

 /**
   * Search parameter: <b>device</b>
   * <p>
   * Description: <b>Search for products that match this code</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAssociation.device</b><br>
   * </p>
   */
  @SearchParamDefinition(name="device", path="DeviceAssociation.device", description="Search for products that match this code", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device") }, target={Device.class } )
  public static final String SP_DEVICE = "device";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>device</b>
   * <p>
   * Description: <b>Search for products that match this code</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>DeviceAssociation.device</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam DEVICE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_DEVICE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>DeviceAssociation:device</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_DEVICE = new ca.uhn.fhir.model.api.Include("DeviceAssociation:device").toLocked();

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>Search for associations at or within specific times</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DeviceAssociation.period</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="DeviceAssociation.period", description="Search for associations at or within specific times", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>Search for associations at or within specific times</b><br>
   * Type: <b>date</b><br>
   * Path: <b>DeviceAssociation.period</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);


}

