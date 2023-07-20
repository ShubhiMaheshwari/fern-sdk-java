package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DiscountDetailsDiscountType {
  FLAT("flat"),

  PERCENTAGE("percentage");

  private final String value;

  DiscountDetailsDiscountType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
