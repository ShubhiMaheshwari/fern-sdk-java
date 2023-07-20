package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WHpayment.Builder.class)
public final class WHpayment {
  private final Optional<String> cfPaymentId;

  private final Optional<String> paymentStatus;

  private final Optional<Double> paymentAmount;

  private final Optional<String> paymentCurrency;

  private final Optional<String> paymentMessage;

  private final Optional<String> paymentTime;

  private final Optional<String> bankReference;

  private final Optional<String> authId;

  private final Optional<WHpaymentMethod> paymentMethod;

  private final Optional<String> paymentGroup;

  private int _cachedHashCode;

  WHpayment(
      Optional<String> cfPaymentId,
      Optional<String> paymentStatus,
      Optional<Double> paymentAmount,
      Optional<String> paymentCurrency,
      Optional<String> paymentMessage,
      Optional<String> paymentTime,
      Optional<String> bankReference,
      Optional<String> authId,
      Optional<WHpaymentMethod> paymentMethod,
      Optional<String> paymentGroup) {
    this.cfPaymentId = cfPaymentId;
    this.paymentStatus = paymentStatus;
    this.paymentAmount = paymentAmount;
    this.paymentCurrency = paymentCurrency;
    this.paymentMessage = paymentMessage;
    this.paymentTime = paymentTime;
    this.bankReference = bankReference;
    this.authId = authId;
    this.paymentMethod = paymentMethod;
    this.paymentGroup = paymentGroup;
  }

  @JsonProperty("cf_payment_id")
  public Optional<String> getCfPaymentId() {
    return cfPaymentId;
  }

  @JsonProperty("payment_status")
  public Optional<String> getPaymentStatus() {
    return paymentStatus;
  }

  @JsonProperty("payment_amount")
  public Optional<Double> getPaymentAmount() {
    return paymentAmount;
  }

  @JsonProperty("payment_currency")
  public Optional<String> getPaymentCurrency() {
    return paymentCurrency;
  }

  @JsonProperty("payment_message")
  public Optional<String> getPaymentMessage() {
    return paymentMessage;
  }

  @JsonProperty("payment_time")
  public Optional<String> getPaymentTime() {
    return paymentTime;
  }

  @JsonProperty("bank_reference")
  public Optional<String> getBankReference() {
    return bankReference;
  }

  @JsonProperty("auth_id")
  public Optional<String> getAuthId() {
    return authId;
  }

  @JsonProperty("payment_method")
  public Optional<WHpaymentMethod> getPaymentMethod() {
    return paymentMethod;
  }

  @JsonProperty("payment_group")
  public Optional<String> getPaymentGroup() {
    return paymentGroup;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WHpayment && equalTo((WHpayment) other);
  }

  private boolean equalTo(WHpayment other) {
    return cfPaymentId.equals(other.cfPaymentId)
        && paymentStatus.equals(other.paymentStatus)
        && paymentAmount.equals(other.paymentAmount)
        && paymentCurrency.equals(other.paymentCurrency)
        && paymentMessage.equals(other.paymentMessage)
        && paymentTime.equals(other.paymentTime)
        && bankReference.equals(other.bankReference)
        && authId.equals(other.authId)
        && paymentMethod.equals(other.paymentMethod)
        && paymentGroup.equals(other.paymentGroup);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cfPaymentId,
              this.paymentStatus,
              this.paymentAmount,
              this.paymentCurrency,
              this.paymentMessage,
              this.paymentTime,
              this.bankReference,
              this.authId,
              this.paymentMethod,
              this.paymentGroup);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WHpayment{"
        + "cfPaymentId: "
        + cfPaymentId
        + ", paymentStatus: "
        + paymentStatus
        + ", paymentAmount: "
        + paymentAmount
        + ", paymentCurrency: "
        + paymentCurrency
        + ", paymentMessage: "
        + paymentMessage
        + ", paymentTime: "
        + paymentTime
        + ", bankReference: "
        + bankReference
        + ", authId: "
        + authId
        + ", paymentMethod: "
        + paymentMethod
        + ", paymentGroup: "
        + paymentGroup
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> cfPaymentId = Optional.empty();

    private Optional<String> paymentStatus = Optional.empty();

    private Optional<Double> paymentAmount = Optional.empty();

    private Optional<String> paymentCurrency = Optional.empty();

    private Optional<String> paymentMessage = Optional.empty();

    private Optional<String> paymentTime = Optional.empty();

    private Optional<String> bankReference = Optional.empty();

    private Optional<String> authId = Optional.empty();

    private Optional<WHpaymentMethod> paymentMethod = Optional.empty();

    private Optional<String> paymentGroup = Optional.empty();

    private Builder() {}

    public Builder from(WHpayment other) {
      cfPaymentId(other.getCfPaymentId());
      paymentStatus(other.getPaymentStatus());
      paymentAmount(other.getPaymentAmount());
      paymentCurrency(other.getPaymentCurrency());
      paymentMessage(other.getPaymentMessage());
      paymentTime(other.getPaymentTime());
      bankReference(other.getBankReference());
      authId(other.getAuthId());
      paymentMethod(other.getPaymentMethod());
      paymentGroup(other.getPaymentGroup());
      return this;
    }

    @JsonSetter(value = "cf_payment_id", nulls = Nulls.SKIP)
    public Builder cfPaymentId(Optional<String> cfPaymentId) {
      this.cfPaymentId = cfPaymentId;
      return this;
    }

    public Builder cfPaymentId(String cfPaymentId) {
      this.cfPaymentId = Optional.of(cfPaymentId);
      return this;
    }

    @JsonSetter(value = "payment_status", nulls = Nulls.SKIP)
    public Builder paymentStatus(Optional<String> paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
    }

    public Builder paymentStatus(String paymentStatus) {
      this.paymentStatus = Optional.of(paymentStatus);
      return this;
    }

    @JsonSetter(value = "payment_amount", nulls = Nulls.SKIP)
    public Builder paymentAmount(Optional<Double> paymentAmount) {
      this.paymentAmount = paymentAmount;
      return this;
    }

    public Builder paymentAmount(Double paymentAmount) {
      this.paymentAmount = Optional.of(paymentAmount);
      return this;
    }

    @JsonSetter(value = "payment_currency", nulls = Nulls.SKIP)
    public Builder paymentCurrency(Optional<String> paymentCurrency) {
      this.paymentCurrency = paymentCurrency;
      return this;
    }

    public Builder paymentCurrency(String paymentCurrency) {
      this.paymentCurrency = Optional.of(paymentCurrency);
      return this;
    }

    @JsonSetter(value = "payment_message", nulls = Nulls.SKIP)
    public Builder paymentMessage(Optional<String> paymentMessage) {
      this.paymentMessage = paymentMessage;
      return this;
    }

    public Builder paymentMessage(String paymentMessage) {
      this.paymentMessage = Optional.of(paymentMessage);
      return this;
    }

    @JsonSetter(value = "payment_time", nulls = Nulls.SKIP)
    public Builder paymentTime(Optional<String> paymentTime) {
      this.paymentTime = paymentTime;
      return this;
    }

    public Builder paymentTime(String paymentTime) {
      this.paymentTime = Optional.of(paymentTime);
      return this;
    }

    @JsonSetter(value = "bank_reference", nulls = Nulls.SKIP)
    public Builder bankReference(Optional<String> bankReference) {
      this.bankReference = bankReference;
      return this;
    }

    public Builder bankReference(String bankReference) {
      this.bankReference = Optional.of(bankReference);
      return this;
    }

    @JsonSetter(value = "auth_id", nulls = Nulls.SKIP)
    public Builder authId(Optional<String> authId) {
      this.authId = authId;
      return this;
    }

    public Builder authId(String authId) {
      this.authId = Optional.of(authId);
      return this;
    }

    @JsonSetter(value = "payment_method", nulls = Nulls.SKIP)
    public Builder paymentMethod(Optional<WHpaymentMethod> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(WHpaymentMethod paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    @JsonSetter(value = "payment_group", nulls = Nulls.SKIP)
    public Builder paymentGroup(Optional<String> paymentGroup) {
      this.paymentGroup = paymentGroup;
      return this;
    }

    public Builder paymentGroup(String paymentGroup) {
      this.paymentGroup = Optional.of(paymentGroup);
      return this;
    }

    public WHpayment build() {
      return new WHpayment(
          cfPaymentId,
          paymentStatus,
          paymentAmount,
          paymentCurrency,
          paymentMessage,
          paymentTime,
          bankReference,
          authId,
          paymentMethod,
          paymentGroup);
    }
  }
}
