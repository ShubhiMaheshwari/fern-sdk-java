package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FetchAllSavedInstrumentsInstrumentStatus {
  ACTIVE("ACTIVE"),

  INACTIVE("INACTIVE");

  private final String value;

  FetchAllSavedInstrumentsInstrumentStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
