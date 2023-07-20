package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LinkMetaEntity.Builder.class)
public final class LinkMetaEntity {
  private final Optional<String> notifyUrl;

  private final Optional<Boolean> upiIntent;

  private final Optional<String> returnUrl;

  private final Optional<String> paymentMethods;

  private int _cachedHashCode;

  LinkMetaEntity(
      Optional<String> notifyUrl,
      Optional<Boolean> upiIntent,
      Optional<String> returnUrl,
      Optional<String> paymentMethods) {
    this.notifyUrl = notifyUrl;
    this.upiIntent = upiIntent;
    this.returnUrl = returnUrl;
    this.paymentMethods = paymentMethods;
  }

  /**
   * @return Notification URL for server-server communication. It should be an https URL.
   */
  @JsonProperty("notify_url")
  public Optional<String> getNotifyUrl() {
    return notifyUrl;
  }

  /**
   * @return If &quot;true&quot;, link will directly open UPI Intent flow on mobile, and normal link
   *     flow elsewhere
   */
  @JsonProperty("upi_intent")
  public Optional<Boolean> getUpiIntent() {
    return upiIntent;
  }

  /**
   * @return The URL to which user will be redirected to after the payment is done on the link.
   *     Maximum length: 250.
   */
  @JsonProperty("return_url")
  public Optional<String> getReturnUrl() {
    return returnUrl;
  }

  /**
   * @return Allowed payment modes for this link. Pass comma-separated values among following
   *     options - &quot;cc&quot;, &quot;dc&quot;, &quot;ccc&quot;, &quot;ppc&quot;, &quot;nb&quot;,
   *     &quot;upi&quot;, &quot;paypal&quot;, &quot;app&quot;. Leave it blank to show all available
   *     payment methods
   */
  @JsonProperty("payment_methods")
  public Optional<String> getPaymentMethods() {
    return paymentMethods;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LinkMetaEntity && equalTo((LinkMetaEntity) other);
  }

  private boolean equalTo(LinkMetaEntity other) {
    return notifyUrl.equals(other.notifyUrl)
        && upiIntent.equals(other.upiIntent)
        && returnUrl.equals(other.returnUrl)
        && paymentMethods.equals(other.paymentMethods);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.notifyUrl, this.upiIntent, this.returnUrl, this.paymentMethods);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinkMetaEntity{"
        + "notifyUrl: "
        + notifyUrl
        + ", upiIntent: "
        + upiIntent
        + ", returnUrl: "
        + returnUrl
        + ", paymentMethods: "
        + paymentMethods
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> notifyUrl = Optional.empty();

    private Optional<Boolean> upiIntent = Optional.empty();

    private Optional<String> returnUrl = Optional.empty();

    private Optional<String> paymentMethods = Optional.empty();

    private Builder() {}

    public Builder from(LinkMetaEntity other) {
      notifyUrl(other.getNotifyUrl());
      upiIntent(other.getUpiIntent());
      returnUrl(other.getReturnUrl());
      paymentMethods(other.getPaymentMethods());
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

    @JsonSetter(value = "upi_intent", nulls = Nulls.SKIP)
    public Builder upiIntent(Optional<Boolean> upiIntent) {
      this.upiIntent = upiIntent;
      return this;
    }

    public Builder upiIntent(Boolean upiIntent) {
      this.upiIntent = Optional.of(upiIntent);
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

    @JsonSetter(value = "payment_methods", nulls = Nulls.SKIP)
    public Builder paymentMethods(Optional<String> paymentMethods) {
      this.paymentMethods = paymentMethods;
      return this;
    }

    public Builder paymentMethods(String paymentMethods) {
      this.paymentMethods = Optional.of(paymentMethods);
      return this;
    }

    public LinkMetaEntity build() {
      return new LinkMetaEntity(notifyUrl, upiIntent, returnUrl, paymentMethods);
    }
  }
}
