package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = ErrorDetailsInPaymentsEntity.Builder.class)
public final class ErrorDetailsInPaymentsEntity {
  private final Optional<String> errorCode;

  private final Optional<String> errorDescription;

  private final Optional<String> errorReason;

  private final Optional<String> errorSource;

  private int _cachedHashCode;

  ErrorDetailsInPaymentsEntity(
      Optional<String> errorCode,
      Optional<String> errorDescription,
      Optional<String> errorReason,
      Optional<String> errorSource) {
    this.errorCode = errorCode;
    this.errorDescription = errorDescription;
    this.errorReason = errorReason;
    this.errorSource = errorSource;
  }

  @JsonProperty("error_code")
  public Optional<String> getErrorCode() {
    return errorCode;
  }

  @JsonProperty("error_description")
  public Optional<String> getErrorDescription() {
    return errorDescription;
  }

  @JsonProperty("error_reason")
  public Optional<String> getErrorReason() {
    return errorReason;
  }

  @JsonProperty("error_source")
  public Optional<String> getErrorSource() {
    return errorSource;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ErrorDetailsInPaymentsEntity
        && equalTo((ErrorDetailsInPaymentsEntity) other);
  }

  private boolean equalTo(ErrorDetailsInPaymentsEntity other) {
    return errorCode.equals(other.errorCode)
        && errorDescription.equals(other.errorDescription)
        && errorReason.equals(other.errorReason)
        && errorSource.equals(other.errorSource);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.errorCode, this.errorDescription, this.errorReason, this.errorSource);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ErrorDetailsInPaymentsEntity{"
        + "errorCode: "
        + errorCode
        + ", errorDescription: "
        + errorDescription
        + ", errorReason: "
        + errorReason
        + ", errorSource: "
        + errorSource
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> errorCode = Optional.empty();

    private Optional<String> errorDescription = Optional.empty();

    private Optional<String> errorReason = Optional.empty();

    private Optional<String> errorSource = Optional.empty();

    private Builder() {}

    public Builder from(ErrorDetailsInPaymentsEntity other) {
      errorCode(other.getErrorCode());
      errorDescription(other.getErrorDescription());
      errorReason(other.getErrorReason());
      errorSource(other.getErrorSource());
      return this;
    }

    @JsonSetter(value = "error_code", nulls = Nulls.SKIP)
    public Builder errorCode(Optional<String> errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder errorCode(String errorCode) {
      this.errorCode = Optional.of(errorCode);
      return this;
    }

    @JsonSetter(value = "error_description", nulls = Nulls.SKIP)
    public Builder errorDescription(Optional<String> errorDescription) {
      this.errorDescription = errorDescription;
      return this;
    }

    public Builder errorDescription(String errorDescription) {
      this.errorDescription = Optional.of(errorDescription);
      return this;
    }

    @JsonSetter(value = "error_reason", nulls = Nulls.SKIP)
    public Builder errorReason(Optional<String> errorReason) {
      this.errorReason = errorReason;
      return this;
    }

    public Builder errorReason(String errorReason) {
      this.errorReason = Optional.of(errorReason);
      return this;
    }

    @JsonSetter(value = "error_source", nulls = Nulls.SKIP)
    public Builder errorSource(Optional<String> errorSource) {
      this.errorSource = errorSource;
      return this;
    }

    public Builder errorSource(String errorSource) {
      this.errorSource = Optional.of(errorSource);
      return this;
    }

    public ErrorDetailsInPaymentsEntity build() {
      return new ErrorDetailsInPaymentsEntity(
          errorCode, errorDescription, errorReason, errorSource);
    }
  }
}
