package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AppProvider {
  GPAY("gpay"),

  PHONEPE("phonepe"),

  OLA("ola"),

  PAYTM("paytm"),

  AMAZON("amazon"),

  AIRTEL("airtel"),

  FREECHARGE("freecharge"),

  MOBIKWIK("mobikwik"),

  JIO("jio");

  private final String value;

  AppProvider(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
