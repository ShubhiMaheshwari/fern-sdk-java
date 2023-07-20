package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OfferDetailsOfferType {
  DISCOUNT("DISCOUNT"),

  CASHBACK("CASHBACK"),

  DISCOUNT_AND_CASHBACK("DISCOUNT_AND_CASHBACK"),

  NO_COST_EMI("NO_COST_EMI");

  private final String value;

  OfferDetailsOfferType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
