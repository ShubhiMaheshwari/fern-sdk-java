package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UpiChannel {
  LINK("link"),

  COLLECT("collect"),

  QRCODE("qrcode");

  private final String value;

  UpiChannel(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
