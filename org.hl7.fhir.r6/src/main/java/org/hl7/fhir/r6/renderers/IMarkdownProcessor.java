package org.hl7.fhir.r6.renderers;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r6.model.PrimitiveType;
import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;

@MarkedToMoveToAdjunctPackage
public interface IMarkdownProcessor {

  @SuppressWarnings("rawtypes")
  public String processMarkdown(String location, PrimitiveType md) throws FHIRException;
  
  public String processMarkdown(String location, String text) throws FHIRException;

}
