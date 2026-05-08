  public String getTranslation(String l) throws org.hl7.fhir.exceptions.FHIRException {
    for (Extension e : getExtension()) {
      if (e.getUrl().equals(ExtensionDefinitions.EXT_TRANSLATION)) {
        String lang = ExtensionUtilities.readStringExtension(e, "lang");
        if (lang != null && lang.equals(l))
          return e.getExtensionString("content");
      }
    }
    return primitiveValue();
  }

  public boolean isTranslatable() {
    return false;
  }
