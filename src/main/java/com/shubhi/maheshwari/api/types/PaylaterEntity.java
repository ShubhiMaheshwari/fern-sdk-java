package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaylaterEntity.Builder.class)
public final class PaylaterEntity {
  private final Optional<String> paymentMethod;

  private int _cachedHashCode;

  PaylaterEntity(Optional<String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @JsonProperty("payment_method")
  public Optional<String> getPaymentMethod() {
    return paymentMethod;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaylaterEntity && equalTo((PaylaterEntity) other);
  }

  private boolean equalTo(PaylaterEntity other) {
    return paymentMethod.equals(other.paymentMethod);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paymentMethod);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaylaterEntity{" + "paymentMethod: " + paymentMethod + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> paymentMethod = Optional.empty();

    private Builder() {}

    public Builder from(PaylaterEntity other) {
      paymentMethod(other.getPaymentMethod());
      return this;
    }

    @JsonSetter(value = "payment_method", nulls = Nulls.SKIP)
    public Builder paymentMethod(Optional<String> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    public PaylaterEntity build() {
      return new PaylaterEntity(paymentMethod);
    }
  }
}
