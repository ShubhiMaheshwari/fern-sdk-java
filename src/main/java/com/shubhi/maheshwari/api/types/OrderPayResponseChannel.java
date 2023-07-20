package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderPayResponseChannel {
  LINK("link"),

  COLLECT("collect"),

  QRCODE("qrcode");

  private final String value;

  OrderPayResponseChannel(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
