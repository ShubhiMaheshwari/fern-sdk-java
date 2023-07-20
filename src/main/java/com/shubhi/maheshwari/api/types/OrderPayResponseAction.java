package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderPayResponseAction {
  LINK("link"),

  CUSTOM("custom"),

  FORM("form");

  private final String value;

  OrderPayResponseAction(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
