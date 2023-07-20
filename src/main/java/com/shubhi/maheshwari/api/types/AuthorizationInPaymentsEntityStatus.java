package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuthorizationInPaymentsEntityStatus {
  SUCCESS("SUCCESS"),

  PENDING("PENDING");

  private final String value;

  AuthorizationInPaymentsEntityStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
