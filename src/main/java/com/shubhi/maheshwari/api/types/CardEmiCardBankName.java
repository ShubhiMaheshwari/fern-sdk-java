package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CardEmiCardBankName {
  HDFC("hdfc"),

  KOTAK("kotak"),

  ICICI("icici"),

  RBL("rbl"),

  BOB("bob"),

  STANDARD_CHARTERED("standard chartered"),

  AXIS("axis"),

  AU("au"),

  YES("yes"),

  SBI("sbi"),

  FED("fed"),

  HSBC("hsbc"),

  CITI("citi"),

  AMEX("amex");

  private final String value;

  CardEmiCardBankName(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
