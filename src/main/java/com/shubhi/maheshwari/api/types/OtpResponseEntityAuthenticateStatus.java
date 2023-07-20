package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OtpResponseEntityAuthenticateStatus {
  FAILED("FAILED"),

  SUCCESS("SUCCESS");

  private final String value;

  OtpResponseEntityAuthenticateStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
