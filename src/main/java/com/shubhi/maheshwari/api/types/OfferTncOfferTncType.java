package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OfferTncOfferTncType {
  LINK("link"),

  POST("post");

  private final String value;

  OfferTncOfferTncType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
