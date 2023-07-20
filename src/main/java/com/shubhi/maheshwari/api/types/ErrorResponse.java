package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ErrorResponse.Builder.class)
public final class ErrorResponse {
  private final Optional<String> message;

  private final Optional<String> code;

  private final Optional<ErrorResponseType> type;

  private int _cachedHashCode;

  ErrorResponse(Optional<String> message, Optional<String> code, Optional<ErrorResponseType> type) {
    this.message = message;
    this.code = code;
    this.type = type;
  }

  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  /**
   * @return One of [&quot;invalid_request_error&quot;, &quot;authentication_error&quot;,
   *     &quot;rate_limit_error&quot;, &quot;validation_error&quot;, &quot;api_error&quot;]
   */
  @JsonProperty("type")
  public Optional<ErrorResponseType> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ErrorResponse && equalTo((ErrorResponse) other);
  }

  private boolean equalTo(ErrorResponse other) {
    return message.equals(other.message) && code.equals(other.code) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.message, this.code, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ErrorResponse{" + "message: " + message + ", code: " + code + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> message = Optional.empty();

    private Optional<String> code = Optional.empty();

    private Optional<ErrorResponseType> type = Optional.empty();

    private Builder() {}

    public Builder from(ErrorResponse other) {
      message(other.getMessage());
      code(other.getCode());
      type(other.getType());
      return this;
    }

    @JsonSetter(value = "message", nulls = Nulls.SKIP)
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    @JsonSetter(value = "code", nulls = Nulls.SKIP)
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(value = "type", nulls = Nulls.SKIP)
    public Builder type(Optional<ErrorResponseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(ErrorResponseType type) {
      this.type = Optional.of(type);
      return this;
    }

    public ErrorResponse build() {
      return new ErrorResponse(message, code, type);
    }
  }
}
