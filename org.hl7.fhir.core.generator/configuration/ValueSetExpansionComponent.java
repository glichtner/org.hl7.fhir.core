  public boolean hasParameterValue(String name, String value) {
    for (ValueSetExpansionParameterComponent p : getParameter()) {
      if (name.equals(p.getName()) && p.hasValue() && value.equals(p.getValue().primitiveValue())) {
        return true;
      }
    }
    return false;
  }

  public void addParameter(String name, DataType value) {
    getParameter().add(new ValueSetExpansionParameterComponent(name).setValue(value));
  }
