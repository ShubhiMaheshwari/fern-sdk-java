package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaymentMethodInPaymentsEntity.Builder.class)
public final class PaymentMethodInPaymentsEntity {
  private final Optional<PaymentMethodInPaymentsEntityPaymentMethod> paymentMethod;

  private int _cachedHashCode;

  PaymentMethodInPaymentsEntity(
      Optional<PaymentMethodInPaymentsEntityPaymentMethod> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @JsonProperty("payment_method")
  public Optional<PaymentMethodInPaymentsEntityPaymentMethod> getPaymentMethod() {
    return paymentMethod;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodInPaymentsEntity
        && equalTo((PaymentMethodInPaymentsEntity) other);
  }

  private boolean equalTo(PaymentMethodInPaymentsEntity other) {
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
    return "PaymentMethodInPaymentsEntity{" + "paymentMethod: " + paymentMethod + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<PaymentMethodInPaymentsEntityPaymentMethod> paymentMethod = Optional.empty();

    private Builder() {}

    public Builder from(PaymentMethodInPaymentsEntity other) {
      paymentMethod(other.getPaymentMethod());
      return this;
    }

    @JsonSetter(value = "payment_method", nulls = Nulls.SKIP)
    public Builder paymentMethod(
        Optional<PaymentMethodInPaymentsEntityPaymentMethod> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(PaymentMethodInPaymentsEntityPaymentMethod paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    public PaymentMethodInPaymentsEntity build() {
      return new PaymentMethodInPaymentsEntity(paymentMethod);
    }
  }
}
