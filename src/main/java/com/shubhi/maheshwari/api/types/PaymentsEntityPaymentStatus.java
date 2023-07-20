package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentsEntityPaymentStatus {
  SUCCESS("SUCCESS"),

  NOT_ATTEMPTED("NOT_ATTEMPTED"),

  FAILED("FAILED"),

  USER_DROPPED("USER_DROPPED"),

  VOID("VOID"),

  CANCELLED("CANCELLED"),

  PENDING("PENDING");

  private final String value;

  PaymentsEntityPaymentStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
