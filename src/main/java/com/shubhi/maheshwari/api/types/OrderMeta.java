package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OrderMeta.Builder.class)
public final class OrderMeta {
  private final Optional<String> returnUrl;

  private final Optional<String> notifyUrl;

  private final Optional<String> paymentMethods;

  private int _cachedHashCode;

  OrderMeta(
      Optional<String> returnUrl, Optional<String> notifyUrl, Optional<String> paymentMethods) {
    this.returnUrl = returnUrl;
    this.notifyUrl = notifyUrl;
    this.paymentMethods = paymentMethods;
  }

  /**
   * @return The URL to which user will be redirected to after the payment on bank OTP page. Maximum
   *     length: 250. The return_url must contain placeholder {order_id}. When redirecting the
   *     customer back to the return url from the bank’s OTP page, Cashfree will replace this
   *     placeholder with the actual value for that order.
   */
  @JsonProperty("return_url")
  public Optional<String> getReturnUrl() {
    return returnUrl;
  }

  /**
   * @return Notification URL for server-server communication. Useful when user's connection drops
   *     while re-directing. NotifyUrl should be an https URL. Maximum length: 250.
   */
  @JsonProperty("notify_url")
  public Optional<String> getNotifyUrl() {
    return notifyUrl;
  }

  /**
   * @return Allowed payment modes for this order. Pass comma-separated values among following
   *     options - &quot;cc&quot;, &quot;dc&quot;, &quot;ccc&quot;,
   *     &quot;ppc&quot;,&quot;nb&quot;,&quot;upi&quot;,&quot;paypal&quot;,&quot;app&quot;,&quot;paylater&quot;,&quot;cardlessemi&quot;,&quot;dcemi&quot;,&quot;ccemi&quot;,&quot;banktransfer&quot;.
   *     Leave it blank to show all available payment methods
   */
  @JsonProperty("payment_methods")
  public Optional<String> getPaymentMethods() {
    return paymentMethods;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrderMeta && equalTo((OrderMeta) other);
  }

  private boolean equalTo(OrderMeta other) {
    return returnUrl.equals(other.returnUrl)
        && notifyUrl.equals(other.notifyUrl)
        && paymentMethods.equals(other.paymentMethods);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.returnUrl, this.notifyUrl, this.paymentMethods);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OrderMeta{"
        + "returnUrl: "
        + returnUrl
        + ", notifyUrl: "
        + notifyUrl
        + ", paymentMethods: "
        + paymentMethods
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> returnUrl = Optional.empty();

    private Optional<String> notifyUrl = Optional.empty();

    private Optional<String> paymentMethods = Optional.empty();

    private Builder() {}

    public Builder from(OrderMeta other) {
      returnUrl(other.getReturnUrl());
      notifyUrl(other.getNotifyUrl());
      paymentMethods(other.getPaymentMethods());
      return this;
    }

    @JsonSetter(value = "return_url", nulls = Nulls.SKIP)
    public Builder returnUrl(Optional<String> returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    public Builder returnUrl(String returnUrl) {
      this.returnUrl = Optional.of(returnUrl);
      return this;
    }

    @JsonSetter(value = "notify_url", nulls = Nulls.SKIP)
    public Builder notifyUrl(Optional<String> notifyUrl) {
      this.notifyUrl = notifyUrl;
      return this;
    }

    public Builder notifyUrl(String notifyUrl) {
      this.notifyUrl = Optional.of(notifyUrl);
      return this;
    }

    @JsonSetter(value = "payment_methods", nulls = Nulls.SKIP)
    public Builder paymentMethods(Optional<String> paymentMethods) {
      this.paymentMethods = paymentMethods;
      return this;
    }

    public Builder paymentMethods(String paymentMethods) {
      this.paymentMethods = Optional.of(paymentMethods);
      return this;
    }

    public OrderMeta build() {
      return new OrderMeta(returnUrl, notifyUrl, paymentMethods);
    }
  }
}
