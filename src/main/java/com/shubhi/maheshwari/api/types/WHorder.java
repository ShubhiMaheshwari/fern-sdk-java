package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WHorder.Builder.class)
public final class WHorder {
  private final Optional<String> orderId;

  private final Optional<Double> orderAmount;

  private final Optional<String> orderCurrency;

  private final Optional<String> orderTags;

  private int _cachedHashCode;

  WHorder(
      Optional<String> orderId,
      Optional<Double> orderAmount,
      Optional<String> orderCurrency,
      Optional<String> orderTags) {
    this.orderId = orderId;
    this.orderAmount = orderAmount;
    this.orderCurrency = orderCurrency;
    this.orderTags = orderTags;
  }

  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  @JsonProperty("order_amount")
  public Optional<Double> getOrderAmount() {
    return orderAmount;
  }

  @JsonProperty("order_currency")
  public Optional<String> getOrderCurrency() {
    return orderCurrency;
  }

  @JsonProperty("order_tags")
  public Optional<String> getOrderTags() {
    return orderTags;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WHorder && equalTo((WHorder) other);
  }

  private boolean equalTo(WHorder other) {
    return orderId.equals(other.orderId)
        && orderAmount.equals(other.orderAmount)
        && orderCurrency.equals(other.orderCurrency)
        && orderTags.equals(other.orderTags);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.orderId, this.orderAmount, this.orderCurrency, this.orderTags);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WHorder{"
        + "orderId: "
        + orderId
        + ", orderAmount: "
        + orderAmount
        + ", orderCurrency: "
        + orderCurrency
        + ", orderTags: "
        + orderTags
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> orderId = Optional.empty();

    private Optional<Double> orderAmount = Optional.empty();

    private Optional<String> orderCurrency = Optional.empty();

    private Optional<String> orderTags = Optional.empty();

    private Builder() {}

    public Builder from(WHorder other) {
      orderId(other.getOrderId());
      orderAmount(other.getOrderAmount());
      orderCurrency(other.getOrderCurrency());
      orderTags(other.getOrderTags());
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

    @JsonSetter(value = "order_amount", nulls = Nulls.SKIP)
    public Builder orderAmount(Optional<Double> orderAmount) {
      this.orderAmount = orderAmount;
      return this;
    }

    public Builder orderAmount(Double orderAmount) {
      this.orderAmount = Optional.of(orderAmount);
      return this;
    }

    @JsonSetter(value = "order_currency", nulls = Nulls.SKIP)
    public Builder orderCurrency(Optional<String> orderCurrency) {
      this.orderCurrency = orderCurrency;
      return this;
    }

    public Builder orderCurrency(String orderCurrency) {
      this.orderCurrency = Optional.of(orderCurrency);
      return this;
    }

    @JsonSetter(value = "order_tags", nulls = Nulls.SKIP)
    public Builder orderTags(Optional<String> orderTags) {
      this.orderTags = orderTags;
      return this;
    }

    public Builder orderTags(String orderTags) {
      this.orderTags = Optional.of(orderTags);
      return this;
    }

    public WHorder build() {
      return new WHorder(orderId, orderAmount, orderCurrency, orderTags);
    }
  }
}
