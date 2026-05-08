package org.hl7.fhir.r6.utils.validation;

import org.hl7.fhir.r6.elementmodel.Element;
import org.hl7.fhir.r6.model.StructureDefinition;
import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;

@MarkedToMoveToAdjunctPackage
public interface IValidationProfileUsageTracker {
  void recordProfileUsage(StructureDefinition profile, Object appContext, Element element);
}
