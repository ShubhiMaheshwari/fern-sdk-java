package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RefundsEntityRefundType {
  PAYMENT_AUTO_REFUND("PAYMENT_AUTO_REFUND"),

  MERCHANT_INITIATED("MERCHANT_INITIATED"),

  UNRECONCILED_AUTO_REFUND("UNRECONCILED_AUTO_REFUND");

  private final String value;

  RefundsEntityRefundType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
