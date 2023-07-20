package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreateRefundRequestRefundSpeed {
  STANDARD("STANDARD"),

  INSTANT("INSTANT");

  private final String value;

  CreateRefundRequestRefundSpeed(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
