package org.hl7.fhir.r6.utils.structuremap;

import org.hl7.fhir.utilities.MarkedToMoveToAdjunctPackage;

@MarkedToMoveToAdjunctPackage
public class TransformContext {
  private Object appInfo;

  public TransformContext(Object appInfo) {
    super();
    this.appInfo = appInfo;
  }

  public Object getAppInfo() {
    return appInfo;
  }

}
