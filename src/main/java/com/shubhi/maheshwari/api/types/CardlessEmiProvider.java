package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CardlessEmiProvider {
  FLEXMONEY("flexmoney"),

  ZESTMONEY("zestmoney"),

  HDFC("hdfc"),

  ICICI("icici"),

  CASHE("cashe"),

  IDFC("idfc"),

  KOTAK("kotak");

  private final String value;

  CardlessEmiProvider(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
