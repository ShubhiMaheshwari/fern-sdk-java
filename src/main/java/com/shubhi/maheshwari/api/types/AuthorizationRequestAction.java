package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AuthorizationRequestAction {
  CAPTURE("CAPTURE"),

  VOID("VOID");

  private final String value;

  AuthorizationRequestAction(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
