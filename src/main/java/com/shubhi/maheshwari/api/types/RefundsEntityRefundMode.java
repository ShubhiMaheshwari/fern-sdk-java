package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RefundsEntityRefundMode {
  STANDARD("STANDARD"),

  INSTANT("INSTANT");

  private final String value;

  RefundsEntityRefundMode(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
