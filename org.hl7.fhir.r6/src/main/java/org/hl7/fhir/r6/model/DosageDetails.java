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
import org.hl7.fhir.r6.model.Enumerations.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.instance.model.api.IBaseDatatypeElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * DosageDetails Type: Indicates how the medication is/was taken or should be taken by the patient.
 */
@DatatypeDef(name="DosageDetails")
public class DosageDetails extends BackboneType implements ICompositeType {

    @Block()
    public static class DosageDetailsStepComponent extends Element implements IBaseDatatypeElement {
        /**
         * When the step starts. In the absence of a linked event, the step is assumed to start immediately (or after the previous step).
         */
        @Child(name = "start", type = {RelativeTime.class}, order=1, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="When the step starts", formalDefinition="When the step starts. In the absence of a linked event, the step is assumed to start immediately (or after the previous step)." )
        protected RelativeTime start;

        /**
         * When the step ends. In the absence of a linked event, the step is assumed to end when the internal timing schedule termnates.
         */
        @Child(name = "end", type = {RelativeTime.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="When the step ends", formalDefinition="When the step ends. In the absence of a linked event, the step is assumed to end when the internal timing schedule termnates." )
        protected RelativeTime end;

        /**
         * How many times to do this step (if not 1).
         */
        @Child(name = "count", type = {IntegerType.class}, order=3, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="How many times to do this step (if not 1)", formalDefinition="How many times to do this step (if not 1)." )
        protected IntegerType count;

        /**
         * A dosage details that is part of this step.
         */
        @Child(name = "component", type = {Dosage.class}, order=4, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="A dosage details that is part of this step", formalDefinition="A dosage details that is part of this step." )
        protected List<Dosage> component;

        /**
         * Safety Information about this step of the dose course.
         */
        @Child(name = "safety", type = {DosageSafety.class}, order=5, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Safety Information about this step of the dose course", formalDefinition="Safety Information about this step of the dose course." )
        protected DosageSafety safety;

        private static final long serialVersionUID = -1628524329L;

    /**
     * Constructor
     */
      public DosageDetailsStepComponent() {
        super();
      }

    /**
     * Constructor
     */
      public DosageDetailsStepComponent(Dosage component) {
        super();
        this.addComponent(component);
      }

        /**
         * @return {@link #start} (When the step starts. In the absence of a linked event, the step is assumed to start immediately (or after the previous step).)
         */
        public RelativeTime getStart() { 
          if (this.start == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DosageDetailsStepComponent.start");
            else if (Configuration.doAutoCreate())
              this.start = new RelativeTime(); // cc
          return this.start;
        }

        public boolean hasStart() { 
          return this.start != null && !this.start.isEmpty();
        }

        /**
         * @param value {@link #start} (When the step starts. In the absence of a linked event, the step is assumed to start immediately (or after the previous step).)
         */
        public DosageDetailsStepComponent setStart(RelativeTime value) { 
          this.start = value;
          return this;
        }

        /**
         * @return {@link #end} (When the step ends. In the absence of a linked event, the step is assumed to end when the internal timing schedule termnates.)
         */
        public RelativeTime getEnd() { 
          if (this.end == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DosageDetailsStepComponent.end");
            else if (Configuration.doAutoCreate())
              this.end = new RelativeTime(); // cc
          return this.end;
        }

        public boolean hasEnd() { 
          return this.end != null && !this.end.isEmpty();
        }

        /**
         * @param value {@link #end} (When the step ends. In the absence of a linked event, the step is assumed to end when the internal timing schedule termnates.)
         */
        public DosageDetailsStepComponent setEnd(RelativeTime value) { 
          this.end = value;
          return this;
        }

        /**
         * @return {@link #count} (How many times to do this step (if not 1).). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public IntegerType getCountElement() { 
          if (this.count == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DosageDetailsStepComponent.count");
            else if (Configuration.doAutoCreate())
              this.count = new IntegerType(); // bb
          return this.count;
        }

        public boolean hasCountElement() { 
          return this.count != null && !this.count.isEmpty();
        }

        public boolean hasCount() { 
          return this.count != null && !this.count.isEmpty();
        }

        /**
         * @param value {@link #count} (How many times to do this step (if not 1).). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public DosageDetailsStepComponent setCountElement(IntegerType value) { 
          this.count = value;
          return this;
        }

        /**
         * @return How many times to do this step (if not 1).
         */
        public int getCount() { 
          return this.count == null || this.count.isEmpty() ? 0 : this.count.getValue();
        }

        /**
         * @param value How many times to do this step (if not 1).
         */
        public DosageDetailsStepComponent setCount(int value) { 
            if (this.count == null)
              this.count = new IntegerType();
            this.count.setValue(value);
          return this;
        }

        /**
         * @return {@link #component} (A dosage details that is part of this step.)
         */
        public List<Dosage> getComponent() { 
          if (this.component == null)
            this.component = new ArrayList<Dosage>();
          return this.component;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DosageDetailsStepComponent setComponent(List<Dosage> theComponent) { 
          this.component = theComponent;
          return this;
        }

        public boolean hasComponent() { 
          if (this.component == null)
            return false;
          for (Dosage item : this.component)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Dosage addComponent() { //3
          Dosage t = new Dosage();
          if (this.component == null)
            this.component = new ArrayList<Dosage>();
          this.component.add(t);
          return t;
        }

        public DosageDetailsStepComponent addComponent(Dosage t) { //3
          if (t == null)
            return this;
          if (this.component == null)
            this.component = new ArrayList<Dosage>();
          this.component.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #component}, creating it if it does not already exist {3}
         */
        public Dosage getComponentFirstRep() { 
          if (getComponent().isEmpty()) {
            addComponent();
          }
          return getComponent().get(0);
        }

        /**
         * @return {@link #safety} (Safety Information about this step of the dose course.)
         */
        public DosageSafety getSafety() { 
          if (this.safety == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DosageDetailsStepComponent.safety");
            else if (Configuration.doAutoCreate())
              this.safety = new DosageSafety(); // cc
          return this.safety;
        }

        public boolean hasSafety() { 
          return this.safety != null && !this.safety.isEmpty();
        }

        /**
         * @param value {@link #safety} (Safety Information about this step of the dose course.)
         */
        public DosageDetailsStepComponent setSafety(DosageSafety value) { 
          this.safety = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("start", "RelativeTime", "When the step starts. In the absence of a linked event, the step is assumed to start immediately (or after the previous step).", 0, 1, start));
          children.add(new Property("end", "RelativeTime", "When the step ends. In the absence of a linked event, the step is assumed to end when the internal timing schedule termnates.", 0, 1, end));
          children.add(new Property("count", "integer", "How many times to do this step (if not 1).", 0, 1, count));
          children.add(new Property("component", "Dosage", "A dosage details that is part of this step.", 0, java.lang.Integer.MAX_VALUE, component));
          children.add(new Property("safety", "DosageSafety", "Safety Information about this step of the dose course.", 0, 1, safety));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 109757538: /*start*/  return new Property("start", "RelativeTime", "When the step starts. In the absence of a linked event, the step is assumed to start immediately (or after the previous step).", 0, 1, start);
          case 100571: /*end*/  return new Property("end", "RelativeTime", "When the step ends. In the absence of a linked event, the step is assumed to end when the internal timing schedule termnates.", 0, 1, end);
          case 94851343: /*count*/  return new Property("count", "integer", "How many times to do this step (if not 1).", 0, 1, count);
          case -1399907075: /*component*/  return new Property("component", "Dosage", "A dosage details that is part of this step.", 0, java.lang.Integer.MAX_VALUE, component);
          case -909893934: /*safety*/  return new Property("safety", "DosageSafety", "Safety Information about this step of the dose course.", 0, 1, safety);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 109757538: /*start*/ return this.start == null ? new Base[0] : new Base[] {this.start}; // RelativeTime
        case 100571: /*end*/ return this.end == null ? new Base[0] : new Base[] {this.end}; // RelativeTime
        case 94851343: /*count*/ return this.count == null ? new Base[0] : new Base[] {this.count}; // IntegerType
        case -1399907075: /*component*/ return this.component == null ? new Base[0] : this.component.toArray(new Base[this.component.size()]); // Dosage
        case -909893934: /*safety*/ return this.safety == null ? new Base[0] : new Base[] {this.safety}; // DosageSafety
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 109757538: // start
          this.start = TypeConvertor.castToRelativeTime(value); // RelativeTime
          return value;
        case 100571: // end
          this.end = TypeConvertor.castToRelativeTime(value); // RelativeTime
          return value;
        case 94851343: // count
          this.count = TypeConvertor.castToInteger(value); // IntegerType
          return value;
        case -1399907075: // component
          this.getComponent().add(TypeConvertor.castToDosage(value)); // Dosage
          return value;
        case -909893934: // safety
          this.safety = TypeConvertor.castToDosageSafety(value); // DosageSafety
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("start")) {
          this.start = TypeConvertor.castToRelativeTime(value); // RelativeTime
        } else if (name.equals("end")) {
          this.end = TypeConvertor.castToRelativeTime(value); // RelativeTime
        } else if (name.equals("count")) {
          this.count = TypeConvertor.castToInteger(value); // IntegerType
        } else if (name.equals("component")) {
          this.getComponent().add(TypeConvertor.castToDosage(value));
        } else if (name.equals("safety")) {
          this.safety = TypeConvertor.castToDosageSafety(value); // DosageSafety
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109757538:  return getStart();
        case 100571:  return getEnd();
        case 94851343:  return getCountElement();
        case -1399907075:  return addComponent(); 
        case -909893934:  return getSafety();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109757538: /*start*/ return new String[] {"RelativeTime"};
        case 100571: /*end*/ return new String[] {"RelativeTime"};
        case 94851343: /*count*/ return new String[] {"integer"};
        case -1399907075: /*component*/ return new String[] {"Dosage"};
        case -909893934: /*safety*/ return new String[] {"DosageSafety"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("start")) {
          this.start = new RelativeTime();
          return this.start;
        }
        else if (name.equals("end")) {
          this.end = new RelativeTime();
          return this.end;
        }
        else if (name.equals("count")) {
          throw new FHIRException("Cannot call addChild on a singleton property DosageDetails.step.count");
        }
        else if (name.equals("component")) {
          return addComponent();
        }
        else if (name.equals("safety")) {
          this.safety = new DosageSafety();
          return this.safety;
        }
        else
          return super.addChild(name);
      }

      public DosageDetailsStepComponent copy() {
        DosageDetailsStepComponent dst = new DosageDetailsStepComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DosageDetailsStepComponent dst) {
        super.copyValues(dst);
        dst.start = start == null ? null : start.copy();
        dst.end = end == null ? null : end.copy();
        dst.count = count == null ? null : count.copy();
        if (component != null) {
          dst.component = new ArrayList<Dosage>();
          for (Dosage i : component)
            dst.component.add(i.copy());
        };
        dst.safety = safety == null ? null : safety.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DosageDetailsStepComponent))
          return false;
        DosageDetailsStepComponent o = (DosageDetailsStepComponent) other_;
        return compareDeep(start, o.start, true) && compareDeep(end, o.end, true) && compareDeep(count, o.count, true)
           && compareDeep(component, o.component, true) && compareDeep(safety, o.safety, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DosageDetailsStepComponent))
          return false;
        DosageDetailsStepComponent o = (DosageDetailsStepComponent) other_;
        return compareValues(count, o.count, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(start, end, count, component
          , safety);
      }

  public String fhirType() {
    return "DosageDetails.step";

  }

  }

    /**
     * The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.
     */
    @Child(name = "renderedInstruction", type = {MarkdownType.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Full representation of the dosage instructions", formalDefinition="The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses." )
    protected MarkdownType renderedInstruction;

    /**
     * Dosage details if it is a simple dose - a single dosage regime with no dependencies or multiple steps.
     */
    @Child(name = "simple", type = {Dosage.class}, order=1, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Dosage details if it is a simple dose", formalDefinition="Dosage details if it is a simple dose - a single dosage regime with no dependencies or multiple steps." )
    protected Dosage simple;

    /**
     * One step in a sequence of steps that comprise the dosage course.
     */
    @Child(name = "step", type = {}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="One step in a sequence of steps that comprise the dosage course", formalDefinition="One step in a sequence of steps that comprise the dosage course." )
    protected List<DosageDetailsStepComponent> step;

    /**
     * Safety Information about the combined dose course.
     */
    @Child(name = "safety", type = {DosageSafety.class}, order=3, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Safety Information about the combined dose course", formalDefinition="Safety Information about the combined dose course." )
    protected DosageSafety safety;

    private static final long serialVersionUID = 1704789484L;

  /**
   * Constructor
   */
    public DosageDetails() {
      super();
    }

    /**
     * @return {@link #renderedInstruction} (The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.). This is the underlying object with id, value and extensions. The accessor "getRenderedInstruction" gives direct access to the value
     */
    public MarkdownType getRenderedInstructionElement() { 
      if (this.renderedInstruction == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DosageDetails.renderedInstruction");
        else if (Configuration.doAutoCreate())
          this.renderedInstruction = new MarkdownType(); // bb
      return this.renderedInstruction;
    }

    public boolean hasRenderedInstructionElement() { 
      return this.renderedInstruction != null && !this.renderedInstruction.isEmpty();
    }

    public boolean hasRenderedInstruction() { 
      return this.renderedInstruction != null && !this.renderedInstruction.isEmpty();
    }

    /**
     * @param value {@link #renderedInstruction} (The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.). This is the underlying object with id, value and extensions. The accessor "getRenderedInstruction" gives direct access to the value
     */
    public DosageDetails setRenderedInstructionElement(MarkdownType value) { 
      this.renderedInstruction = value;
      return this;
    }

    /**
     * @return The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.
     */
    public String getRenderedInstruction() { 
      return this.renderedInstruction == null ? null : this.renderedInstruction.getValue();
    }

    /**
     * @param value The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.
     */
    public DosageDetails setRenderedInstruction(String value) { 
      if (Utilities.noString(value))
        this.renderedInstruction = null;
      else {
        if (this.renderedInstruction == null)
          this.renderedInstruction = new MarkdownType();
        this.renderedInstruction.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #simple} (Dosage details if it is a simple dose - a single dosage regime with no dependencies or multiple steps.)
     */
    public Dosage getSimple() { 
      if (this.simple == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DosageDetails.simple");
        else if (Configuration.doAutoCreate())
          this.simple = new Dosage(); // cc
      return this.simple;
    }

    public boolean hasSimple() { 
      return this.simple != null && !this.simple.isEmpty();
    }

    /**
     * @param value {@link #simple} (Dosage details if it is a simple dose - a single dosage regime with no dependencies or multiple steps.)
     */
    public DosageDetails setSimple(Dosage value) { 
      this.simple = value;
      return this;
    }

    /**
     * @return {@link #step} (One step in a sequence of steps that comprise the dosage course.)
     */
    public List<DosageDetailsStepComponent> getStep() { 
      if (this.step == null)
        this.step = new ArrayList<DosageDetailsStepComponent>();
      return this.step;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public DosageDetails setStep(List<DosageDetailsStepComponent> theStep) { 
      this.step = theStep;
      return this;
    }

    public boolean hasStep() { 
      if (this.step == null)
        return false;
      for (DosageDetailsStepComponent item : this.step)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DosageDetailsStepComponent addStep() { //3
      DosageDetailsStepComponent t = new DosageDetailsStepComponent();
      if (this.step == null)
        this.step = new ArrayList<DosageDetailsStepComponent>();
      this.step.add(t);
      return t;
    }

    public DosageDetails addStep(DosageDetailsStepComponent t) { //3
      if (t == null)
        return this;
      if (this.step == null)
        this.step = new ArrayList<DosageDetailsStepComponent>();
      this.step.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #step}, creating it if it does not already exist {3}
     */
    public DosageDetailsStepComponent getStepFirstRep() { 
      if (getStep().isEmpty()) {
        addStep();
      }
      return getStep().get(0);
    }

    /**
     * @return {@link #safety} (Safety Information about the combined dose course.)
     */
    public DosageSafety getSafety() { 
      if (this.safety == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DosageDetails.safety");
        else if (Configuration.doAutoCreate())
          this.safety = new DosageSafety(); // cc
      return this.safety;
    }

    public boolean hasSafety() { 
      return this.safety != null && !this.safety.isEmpty();
    }

    /**
     * @param value {@link #safety} (Safety Information about the combined dose course.)
     */
    public DosageDetails setSafety(DosageSafety value) { 
      this.safety = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("renderedInstruction", "markdown", "The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.", 0, 1, renderedInstruction));
        children.add(new Property("simple", "Dosage", "Dosage details if it is a simple dose - a single dosage regime with no dependencies or multiple steps.", 0, 1, simple));
        children.add(new Property("step", "", "One step in a sequence of steps that comprise the dosage course.", 0, java.lang.Integer.MAX_VALUE, step));
        children.add(new Property("safety", "DosageSafety", "Safety Information about the combined dose course.", 0, 1, safety));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -2110570343: /*renderedInstruction*/  return new Property("renderedInstruction", "markdown", "The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.", 0, 1, renderedInstruction);
        case -902286926: /*simple*/  return new Property("simple", "Dosage", "Dosage details if it is a simple dose - a single dosage regime with no dependencies or multiple steps.", 0, 1, simple);
        case 3540684: /*step*/  return new Property("step", "", "One step in a sequence of steps that comprise the dosage course.", 0, java.lang.Integer.MAX_VALUE, step);
        case -909893934: /*safety*/  return new Property("safety", "DosageSafety", "Safety Information about the combined dose course.", 0, 1, safety);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -2110570343: /*renderedInstruction*/ return this.renderedInstruction == null ? new Base[0] : new Base[] {this.renderedInstruction}; // MarkdownType
        case -902286926: /*simple*/ return this.simple == null ? new Base[0] : new Base[] {this.simple}; // Dosage
        case 3540684: /*step*/ return this.step == null ? new Base[0] : this.step.toArray(new Base[this.step.size()]); // DosageDetailsStepComponent
        case -909893934: /*safety*/ return this.safety == null ? new Base[0] : new Base[] {this.safety}; // DosageSafety
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -2110570343: // renderedInstruction
          this.renderedInstruction = TypeConvertor.castToMarkdown(value); // MarkdownType
          return value;
        case -902286926: // simple
          this.simple = TypeConvertor.castToDosage(value); // Dosage
          return value;
        case 3540684: // step
          this.getStep().add((DosageDetailsStepComponent) value); // DosageDetailsStepComponent
          return value;
        case -909893934: // safety
          this.safety = TypeConvertor.castToDosageSafety(value); // DosageSafety
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("renderedInstruction")) {
          this.renderedInstruction = TypeConvertor.castToMarkdown(value); // MarkdownType
        } else if (name.equals("simple")) {
          this.simple = TypeConvertor.castToDosage(value); // Dosage
        } else if (name.equals("step")) {
          this.getStep().add((DosageDetailsStepComponent) value);
        } else if (name.equals("safety")) {
          this.safety = TypeConvertor.castToDosageSafety(value); // DosageSafety
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -2110570343:  return getRenderedInstructionElement();
        case -902286926:  return getSimple();
        case 3540684:  return addStep(); 
        case -909893934:  return getSafety();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -2110570343: /*renderedInstruction*/ return new String[] {"markdown"};
        case -902286926: /*simple*/ return new String[] {"Dosage"};
        case 3540684: /*step*/ return new String[] {};
        case -909893934: /*safety*/ return new String[] {"DosageSafety"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("renderedInstruction")) {
          throw new FHIRException("Cannot call addChild on a singleton property DosageDetails.renderedInstruction");
        }
        else if (name.equals("simple")) {
          this.simple = new Dosage();
          return this.simple;
        }
        else if (name.equals("step")) {
          return addStep();
        }
        else if (name.equals("safety")) {
          this.safety = new DosageSafety();
          return this.safety;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "DosageDetails";

  }

      public DosageDetails copy() {
        DosageDetails dst = new DosageDetails();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DosageDetails dst) {
        super.copyValues(dst);
        dst.renderedInstruction = renderedInstruction == null ? null : renderedInstruction.copy();
        dst.simple = simple == null ? null : simple.copy();
        if (step != null) {
          dst.step = new ArrayList<DosageDetailsStepComponent>();
          for (DosageDetailsStepComponent i : step)
            dst.step.add(i.copy());
        };
        dst.safety = safety == null ? null : safety.copy();
      }

      protected DosageDetails typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DosageDetails))
          return false;
        DosageDetails o = (DosageDetails) other_;
        return compareDeep(renderedInstruction, o.renderedInstruction, true) && compareDeep(simple, o.simple, true)
           && compareDeep(step, o.step, true) && compareDeep(safety, o.safety, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DosageDetails))
          return false;
        DosageDetails o = (DosageDetails) other_;
        return compareValues(renderedInstruction, o.renderedInstruction, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(renderedInstruction, simple
          , step, safety);
      }


}

