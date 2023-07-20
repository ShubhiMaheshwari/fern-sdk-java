package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RefundsEntityRefundStatus {
  SUCCESS("SUCCESS"),

  PENDING("PENDING"),

  CANCELLED("CANCELLED"),

  ONHOLD("ONHOLD");

  private final String value;

  RefundsEntityRefundStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
