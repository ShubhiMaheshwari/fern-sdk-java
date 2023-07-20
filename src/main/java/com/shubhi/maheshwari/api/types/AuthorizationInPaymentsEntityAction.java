package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuthorizationInPaymentsEntityAction {
  CAPTURE("CAPTURE"),

  VOID("VOID");

  private final String value;

  AuthorizationInPaymentsEntityAction(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
