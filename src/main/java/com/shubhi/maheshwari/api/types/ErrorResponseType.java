package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorResponseType {
  INVALID_REQUEST_ERROR("invalid_request_error"),

  AUTHENTICATION_ERROR("authentication_error"),

  RATE_LIMIT_ERROR("rate_limit_error"),

  VALIDATION_ERROR("validation_error"),

  API_ERROR("api_error");

  private final String value;

  ErrorResponseType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
