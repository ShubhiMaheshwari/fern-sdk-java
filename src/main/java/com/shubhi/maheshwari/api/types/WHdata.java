package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WHdata.Builder.class)
public final class WHdata {
  private final Optional<WHorder> order;

  private final Optional<WHpayment> payment;

  private final Optional<WHcustomerDetails> customerDetails;

  private int _cachedHashCode;

  WHdata(
      Optional<WHorder> order,
      Optional<WHpayment> payment,
      Optional<WHcustomerDetails> customerDetails) {
    this.order = order;
    this.payment = payment;
    this.customerDetails = customerDetails;
  }

  @JsonProperty("order")
  public Optional<WHorder> getOrder() {
    return order;
  }

  @JsonProperty("payment")
  public Optional<WHpayment> getPayment() {
    return payment;
  }

  @JsonProperty("customer_details")
  public Optional<WHcustomerDetails> getCustomerDetails() {
    return customerDetails;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WHdata && equalTo((WHdata) other);
  }

  private boolean equalTo(WHdata other) {
    return order.equals(other.order)
        && payment.equals(other.payment)
        && customerDetails.equals(other.customerDetails);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.order, this.payment, this.customerDetails);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WHdata{"
        + "order: "
        + order
        + ", payment: "
        + payment
        + ", customerDetails: "
        + customerDetails
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<WHorder> order = Optional.empty();

    private Optional<WHpayment> payment = Optional.empty();

    private Optional<WHcustomerDetails> customerDetails = Optional.empty();

    private Builder() {}

    public Builder from(WHdata other) {
      order(other.getOrder());
      payment(other.getPayment());
      customerDetails(other.getCustomerDetails());
      return this;
    }

    @JsonSetter(value = "order", nulls = Nulls.SKIP)
    public Builder order(Optional<WHorder> order) {
      this.order = order;
      return this;
    }

    public Builder order(WHorder order) {
      this.order = Optional.of(order);
      return this;
    }

    @JsonSetter(value = "payment", nulls = Nulls.SKIP)
    public Builder payment(Optional<WHpayment> payment) {
      this.payment = payment;
      return this;
    }

    public Builder payment(WHpayment payment) {
      this.payment = Optional.of(payment);
      return this;
    }

    @JsonSetter(value = "customer_details", nulls = Nulls.SKIP)
    public Builder customerDetails(Optional<WHcustomerDetails> customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    public Builder customerDetails(WHcustomerDetails customerDetails) {
      this.customerDetails = Optional.of(customerDetails);
      return this;
    }

    public WHdata build() {
      return new WHdata(order, payment, customerDetails);
    }
  }
}
