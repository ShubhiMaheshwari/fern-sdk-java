package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CardCardBankName {
  KOTAK("Kotak"),

  ICICI("ICICI"),

  RBL("RBL"),

  BOB("BOB"),

  STANDARD_CHARTERED("Standard Chartered");

  private final String value;

  CardCardBankName(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
