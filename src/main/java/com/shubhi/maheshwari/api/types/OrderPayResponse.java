package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OrderPayResponse.Builder.class)
public final class OrderPayResponse {
  private final Optional<Integer> cfPaymentId;

  private final Optional<OrderPayResponsePaymentMethod> paymentMethod;

  private final Optional<OrderPayResponseChannel> channel;

  private final Optional<OrderPayResponseAction> action;

  private final Optional<OrderPayData> data;

  private int _cachedHashCode;

  OrderPayResponse(
      Optional<Integer> cfPaymentId,
      Optional<OrderPayResponsePaymentMethod> paymentMethod,
      Optional<OrderPayResponseChannel> channel,
      Optional<OrderPayResponseAction> action,
      Optional<OrderPayData> data) {
    this.cfPaymentId = cfPaymentId;
    this.paymentMethod = paymentMethod;
    this.channel = channel;
    this.action = action;
    this.data = data;
  }

  /**
   * @return Payment identifier created by Cashfree
   */
  @JsonProperty("cf_payment_id")
  public Optional<Integer> getCfPaymentId() {
    return cfPaymentId;
  }

  /**
   * @return One of [&quot;upi&quot;, &quot;netbanking&quot;, &quot;card&quot;, &quot;app&quot;,
   *     &quot;cardless_emi&quot;, &quot;paylater&quot;]
   */
  @JsonProperty("payment_method")
  public Optional<OrderPayResponsePaymentMethod> getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * @return One of [&quot;link&quot;, &quot;collect&quot;, &quot;qrcode&quot;]. In an older version
   *     we used to support different channels like 'gpay', 'phonepe' etc. However, we now support
   *     only the following channels - link, collect and qrcode. To process payments using gpay, you
   *     will have to provide channel as 'link' and provider as 'gpay'
   */
  @JsonProperty("channel")
  public Optional<OrderPayResponseChannel> getChannel() {
    return channel;
  }

  /**
   * @return One of [&quot;link&quot;, &quot;custom&quot;, &quot;form&quot;]
   */
  @JsonProperty("action")
  public Optional<OrderPayResponseAction> getAction() {
    return action;
  }

  @JsonProperty("data")
  public Optional<OrderPayData> getData() {
    return data;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrderPayResponse && equalTo((OrderPayResponse) other);
  }

  private boolean equalTo(OrderPayResponse other) {
    return cfPaymentId.equals(other.cfPaymentId)
        && paymentMethod.equals(other.paymentMethod)
        && channel.equals(other.channel)
        && action.equals(other.action)
        && data.equals(other.data);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.cfPaymentId, this.paymentMethod, this.channel, this.action, this.data);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OrderPayResponse{"
        + "cfPaymentId: "
        + cfPaymentId
        + ", paymentMethod: "
        + paymentMethod
        + ", channel: "
        + channel
        + ", action: "
        + action
        + ", data: "
        + data
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> cfPaymentId = Optional.empty();

    private Optional<OrderPayResponsePaymentMethod> paymentMethod = Optional.empty();

    private Optional<OrderPayResponseChannel> channel = Optional.empty();

    private Optional<OrderPayResponseAction> action = Optional.empty();

    private Optional<OrderPayData> data = Optional.empty();

    private Builder() {}

    public Builder from(OrderPayResponse other) {
      cfPaymentId(other.getCfPaymentId());
      paymentMethod(other.getPaymentMethod());
      channel(other.getChannel());
      action(other.getAction());
      data(other.getData());
      return this;
    }

    @JsonSetter(value = "cf_payment_id", nulls = Nulls.SKIP)
    public Builder cfPaymentId(Optional<Integer> cfPaymentId) {
      this.cfPaymentId = cfPaymentId;
      return this;
    }

    public Builder cfPaymentId(Integer cfPaymentId) {
      this.cfPaymentId = Optional.of(cfPaymentId);
      return this;
    }

    @JsonSetter(value = "payment_method", nulls = Nulls.SKIP)
    public Builder paymentMethod(Optional<OrderPayResponsePaymentMethod> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(OrderPayResponsePaymentMethod paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    @JsonSetter(value = "channel", nulls = Nulls.SKIP)
    public Builder channel(Optional<OrderPayResponseChannel> channel) {
      this.channel = channel;
      return this;
    }

    public Builder channel(OrderPayResponseChannel channel) {
      this.channel = Optional.of(channel);
      return this;
    }

    @JsonSetter(value = "action", nulls = Nulls.SKIP)
    public Builder action(Optional<OrderPayResponseAction> action) {
      this.action = action;
      return this;
    }

    public Builder action(OrderPayResponseAction action) {
      this.action = Optional.of(action);
      return this;
    }

    @JsonSetter(value = "data", nulls = Nulls.SKIP)
    public Builder data(Optional<OrderPayData> data) {
      this.data = data;
      return this;
    }

    public Builder data(OrderPayData data) {
      this.data = Optional.of(data);
      return this;
    }

    public OrderPayResponse build() {
      return new OrderPayResponse(cfPaymentId, paymentMethod, channel, action, data);
    }
  }
}
