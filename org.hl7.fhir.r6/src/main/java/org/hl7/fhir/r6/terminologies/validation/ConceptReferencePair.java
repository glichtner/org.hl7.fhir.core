package org.hl7.fhir.r6.terminologies.validation;

import org.hl7.fhir.r6.model.ValueSet;
import org.hl7.fhir.r6.model.ValueSet.ConceptReferenceComponent;
import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;

@MarkedToMoveToAdjunctPackage
public class ConceptReferencePair {

  private ValueSet valueset;
  private ConceptReferenceComponent cc;

  public ConceptReferencePair(ValueSet valueset, ConceptReferenceComponent cc) {
    this.valueset = valueset;
    this.cc = cc;
  }

  public ValueSet getValueset() {
    return valueset;
  }

  public ConceptReferenceComponent getCc() {
    return cc;
  }

}