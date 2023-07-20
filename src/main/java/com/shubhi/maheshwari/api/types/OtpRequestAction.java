package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OtpRequestAction {
  SUBMIT_OTP("SUBMIT_OTP"),

  RESEND_OTP("RESEND_OTP");

  private final String value;

  OtpRequestAction(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
