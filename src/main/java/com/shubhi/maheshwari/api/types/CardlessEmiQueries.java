package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CardlessEmiQueries.Builder.class)
public final class CardlessEmiQueries {
  private final Optional<String> orderId;

  private final Optional<Double> amount;

  private final Optional<CustomerDetailsCardlessEmi> customerDetails;

  private int _cachedHashCode;

  CardlessEmiQueries(
      Optional<String> orderId,
      Optional<Double> amount,
      Optional<CustomerDetailsCardlessEmi> customerDetails) {
    this.orderId = orderId;
    this.amount = amount;
    this.customerDetails = customerDetails;
  }

  /**
   * @return OrderId of the order. Either of <code>order_id</code> or <code>amount</code> is
   *     mandatory. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters
   *     </code>&lt;/span&gt;
   */
  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  /**
   * @return Amount of the order. OrderId of the order. Either of <code>order_id</code> or <code>
   *     amount</code> is mandatory.
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @JsonProperty("customer_details")
  public Optional<CustomerDetailsCardlessEmi> getCustomerDetails() {
    return customerDetails;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardlessEmiQueries && equalTo((CardlessEmiQueries) other);
  }

  private boolean equalTo(CardlessEmiQueries other) {
    return orderId.equals(other.orderId)
        && amount.equals(other.amount)
        && customerDetails.equals(other.customerDetails);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.orderId, this.amount, this.customerDetails);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardlessEmiQueries{"
        + "orderId: "
        + orderId
        + ", amount: "
        + amount
        + ", customerDetails: "
        + customerDetails
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> orderId = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<CustomerDetailsCardlessEmi> customerDetails = Optional.empty();

    private Builder() {}

    public Builder from(CardlessEmiQueries other) {
      orderId(other.getOrderId());
      amount(other.getAmount());
      customerDetails(other.getCustomerDetails());
      return this;
    }

    @JsonSetter(value = "order_id", nulls = Nulls.SKIP)
    public Builder orderId(Optional<String> orderId) {
      this.orderId = orderId;
      return this;
    }

    public Builder orderId(String orderId) {
      this.orderId = Optional.of(orderId);
      return this;
    }

    @JsonSetter(value = "amount", nulls = Nulls.SKIP)
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(value = "customer_details", nulls = Nulls.SKIP)
    public Builder customerDetails(Optional<CustomerDetailsCardlessEmi> customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    public Builder customerDetails(CustomerDetailsCardlessEmi customerDetails) {
      this.customerDetails = Optional.of(customerDetails);
      return this;
    }

    public CardlessEmiQueries build() {
      return new CardlessEmiQueries(orderId, amount, customerDetails);
    }
  }
}
