package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderPayResponsePaymentMethod {
  NETBANKING("netbanking"),

  CARD("card"),

  UPI("upi"),

  APP("app"),

  CARDLESS_EMI("cardless_emi"),

  PAYLATER("paylater");

  private final String value;

  OrderPayResponsePaymentMethod(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
