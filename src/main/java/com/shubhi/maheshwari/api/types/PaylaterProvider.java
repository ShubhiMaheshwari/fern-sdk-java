package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaylaterProvider {
  KOTAK("kotak"),

  FLEXIPAY("flexipay"),

  ZESTMONEY("zestmoney"),

  LAZYPAY("lazypay"),

  OLAPOSTPAID("olapostpaid"),

  SIMPL("simpl"),

  FREECHARGEPAYLATER("freechargepaylater");

  private final String value;

  PaylaterProvider(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
