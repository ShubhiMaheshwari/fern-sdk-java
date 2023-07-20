package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferQueries.Builder.class)
public final class OfferQueries {
  private final Optional<String> orderId;

  private final Optional<Double> amount;

  private int _cachedHashCode;

  OfferQueries(Optional<String> orderId, Optional<Double> amount) {
    this.orderId = orderId;
    this.amount = amount;
  }

  /**
   * @return OrderId of the order. Either of <code>order_id</code> or <code>order_amount</code> is
   *     mandatory. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters
   *     </code>&lt;/span&gt;
   */
  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  /**
   * @return Amount of the order. OrderId of the order. Either of <code>order_id</code> or <code>
   *     order_amount</code> is mandatory.
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferQueries && equalTo((OfferQueries) other);
  }

  private boolean equalTo(OfferQueries other) {
    return orderId.equals(other.orderId) && amount.equals(other.amount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.orderId, this.amount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferQueries{" + "orderId: " + orderId + ", amount: " + amount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> orderId = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Builder() {}

    public Builder from(OfferQueries other) {
      orderId(other.getOrderId());
      amount(other.getAmount());
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

    public OfferQueries build() {
      return new OfferQueries(orderId, amount);
    }
  }
}
