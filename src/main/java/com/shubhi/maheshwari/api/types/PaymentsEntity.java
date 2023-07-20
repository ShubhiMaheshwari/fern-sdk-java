package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaymentsEntity.Builder.class)
public final class PaymentsEntity {
  private final Optional<Integer> cfPaymentId;

  private final Optional<String> orderId;

  private final Optional<String> entity;

  private final Optional<ErrorDetailsInPaymentsEntity> errorDetails;

  private final Optional<Boolean> isCaptured;

  private final Optional<Double> orderAmount;

  private final Optional<String> paymentGroup;

  private final Optional<String> paymentCurrency;

  private final Optional<Double> paymentAmount;

  private final Optional<String> paymentTime;

  private final Optional<String> paymentCompletionTime;

  private final Optional<PaymentsEntityPaymentStatus> paymentStatus;

  private final Optional<String> paymentMessage;

  private final Optional<String> bankReference;

  private final Optional<String> authId;

  private final Optional<AuthorizationInPaymentsEntity> authorization;

  private final Optional<PaymentMethodInPaymentsEntity> paymentMethod;

  private int _cachedHashCode;

  PaymentsEntity(
      Optional<Integer> cfPaymentId,
      Optional<String> orderId,
      Optional<String> entity,
      Optional<ErrorDetailsInPaymentsEntity> errorDetails,
      Optional<Boolean> isCaptured,
      Optional<Double> orderAmount,
      Optional<String> paymentGroup,
      Optional<String> paymentCurrency,
      Optional<Double> paymentAmount,
      Optional<String> paymentTime,
      Optional<String> paymentCompletionTime,
      Optional<PaymentsEntityPaymentStatus> paymentStatus,
      Optional<String> paymentMessage,
      Optional<String> bankReference,
      Optional<String> authId,
      Optional<AuthorizationInPaymentsEntity> authorization,
      Optional<PaymentMethodInPaymentsEntity> paymentMethod) {
    this.cfPaymentId = cfPaymentId;
    this.orderId = orderId;
    this.entity = entity;
    this.errorDetails = errorDetails;
    this.isCaptured = isCaptured;
    this.orderAmount = orderAmount;
    this.paymentGroup = paymentGroup;
    this.paymentCurrency = paymentCurrency;
    this.paymentAmount = paymentAmount;
    this.paymentTime = paymentTime;
    this.paymentCompletionTime = paymentCompletionTime;
    this.paymentStatus = paymentStatus;
    this.paymentMessage = paymentMessage;
    this.bankReference = bankReference;
    this.authId = authId;
    this.authorization = authorization;
    this.paymentMethod = paymentMethod;
  }

  @JsonProperty("cf_payment_id")
  public Optional<Integer> getCfPaymentId() {
    return cfPaymentId;
  }

  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  @JsonProperty("entity")
  public Optional<String> getEntity() {
    return entity;
  }

  @JsonProperty("error_details")
  public Optional<ErrorDetailsInPaymentsEntity> getErrorDetails() {
    return errorDetails;
  }

  @JsonProperty("is_captured")
  public Optional<Boolean> getIsCaptured() {
    return isCaptured;
  }

  /**
   * @return Order amount can be different from payment amount if you collect service fee from the
   *     customer
   */
  @JsonProperty("order_amount")
  public Optional<Double> getOrderAmount() {
    return orderAmount;
  }

  /**
   * @return Type of payment group. One of ['upi', 'card', 'app', 'netbanking', 'paylater',
   *     'cardless_emi']
   */
  @JsonProperty("payment_group")
  public Optional<String> getPaymentGroup() {
    return paymentGroup;
  }

  @JsonProperty("payment_currency")
  public Optional<String> getPaymentCurrency() {
    return paymentCurrency;
  }

  @JsonProperty("payment_amount")
  public Optional<Double> getPaymentAmount() {
    return paymentAmount;
  }

  /**
   * @return This is the time when the payment was initiated
   */
  @JsonProperty("payment_time")
  public Optional<String> getPaymentTime() {
    return paymentTime;
  }

  /**
   * @return This is the time when the payment reaches its terminal state
   */
  @JsonProperty("payment_completion_time")
  public Optional<String> getPaymentCompletionTime() {
    return paymentCompletionTime;
  }

  /**
   * @return The transaction status can be one of [&quot;SUCCESS&quot;, &quot;NOT_ATTEMPTED&quot;,
   *     &quot;FAILED&quot;, &quot;USER_DROPPED&quot;, &quot;VOID&quot;, &quot;CANCELLED&quot;,
   *     &quot;PENDING&quot;]
   */
  @JsonProperty("payment_status")
  public Optional<PaymentsEntityPaymentStatus> getPaymentStatus() {
    return paymentStatus;
  }

  @JsonProperty("payment_message")
  public Optional<String> getPaymentMessage() {
    return paymentMessage;
  }

  @JsonProperty("bank_reference")
  public Optional<String> getBankReference() {
    return bankReference;
  }

  @JsonProperty("auth_id")
  public Optional<String> getAuthId() {
    return authId;
  }

  @JsonProperty("authorization")
  public Optional<AuthorizationInPaymentsEntity> getAuthorization() {
    return authorization;
  }

  @JsonProperty("payment_method")
  public Optional<PaymentMethodInPaymentsEntity> getPaymentMethod() {
    return paymentMethod;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentsEntity && equalTo((PaymentsEntity) other);
  }

  private boolean equalTo(PaymentsEntity other) {
    return cfPaymentId.equals(other.cfPaymentId)
        && orderId.equals(other.orderId)
        && entity.equals(other.entity)
        && errorDetails.equals(other.errorDetails)
        && isCaptured.equals(other.isCaptured)
        && orderAmount.equals(other.orderAmount)
        && paymentGroup.equals(other.paymentGroup)
        && paymentCurrency.equals(other.paymentCurrency)
        && paymentAmount.equals(other.paymentAmount)
        && paymentTime.equals(other.paymentTime)
        && paymentCompletionTime.equals(other.paymentCompletionTime)
        && paymentStatus.equals(other.paymentStatus)
        && paymentMessage.equals(other.paymentMessage)
        && bankReference.equals(other.bankReference)
        && authId.equals(other.authId)
        && authorization.equals(other.authorization)
        && paymentMethod.equals(other.paymentMethod);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cfPaymentId,
              this.orderId,
              this.entity,
              this.errorDetails,
              this.isCaptured,
              this.orderAmount,
              this.paymentGroup,
              this.paymentCurrency,
              this.paymentAmount,
              this.paymentTime,
              this.paymentCompletionTime,
              this.paymentStatus,
              this.paymentMessage,
              this.bankReference,
              this.authId,
              this.authorization,
              this.paymentMethod);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentsEntity{"
        + "cfPaymentId: "
        + cfPaymentId
        + ", orderId: "
        + orderId
        + ", entity: "
        + entity
        + ", errorDetails: "
        + errorDetails
        + ", isCaptured: "
        + isCaptured
        + ", orderAmount: "
        + orderAmount
        + ", paymentGroup: "
        + paymentGroup
        + ", paymentCurrency: "
        + paymentCurrency
        + ", paymentAmount: "
        + paymentAmount
        + ", paymentTime: "
        + paymentTime
        + ", paymentCompletionTime: "
        + paymentCompletionTime
        + ", paymentStatus: "
        + paymentStatus
        + ", paymentMessage: "
        + paymentMessage
        + ", bankReference: "
        + bankReference
        + ", authId: "
        + authId
        + ", authorization: "
        + authorization
        + ", paymentMethod: "
        + paymentMethod
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> cfPaymentId = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Optional<String> entity = Optional.empty();

    private Optional<ErrorDetailsInPaymentsEntity> errorDetails = Optional.empty();

    private Optional<Boolean> isCaptured = Optional.empty();

    private Optional<Double> orderAmount = Optional.empty();

    private Optional<String> paymentGroup = Optional.empty();

    private Optional<String> paymentCurrency = Optional.empty();

    private Optional<Double> paymentAmount = Optional.empty();

    private Optional<String> paymentTime = Optional.empty();

    private Optional<String> paymentCompletionTime = Optional.empty();

    private Optional<PaymentsEntityPaymentStatus> paymentStatus = Optional.empty();

    private Optional<String> paymentMessage = Optional.empty();

    private Optional<String> bankReference = Optional.empty();

    private Optional<String> authId = Optional.empty();

    private Optional<AuthorizationInPaymentsEntity> authorization = Optional.empty();

    private Optional<PaymentMethodInPaymentsEntity> paymentMethod = Optional.empty();

    private Builder() {}

    public Builder from(PaymentsEntity other) {
      cfPaymentId(other.getCfPaymentId());
      orderId(other.getOrderId());
      entity(other.getEntity());
      errorDetails(other.getErrorDetails());
      isCaptured(other.getIsCaptured());
      orderAmount(other.getOrderAmount());
      paymentGroup(other.getPaymentGroup());
      paymentCurrency(other.getPaymentCurrency());
      paymentAmount(other.getPaymentAmount());
      paymentTime(other.getPaymentTime());
      paymentCompletionTime(other.getPaymentCompletionTime());
      paymentStatus(other.getPaymentStatus());
      paymentMessage(other.getPaymentMessage());
      bankReference(other.getBankReference());
      authId(other.getAuthId());
      authorization(other.getAuthorization());
      paymentMethod(other.getPaymentMethod());
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

    @JsonSetter(value = "order_id", nulls = Nulls.SKIP)
    public Builder orderId(Optional<String> orderId) {
      this.orderId = orderId;
      return this;
    }

    public Builder orderId(String orderId) {
      this.orderId = Optional.of(orderId);
      return this;
    }

    @JsonSetter(value = "entity", nulls = Nulls.SKIP)
    public Builder entity(Optional<String> entity) {
      this.entity = entity;
      return this;
    }

    public Builder entity(String entity) {
      this.entity = Optional.of(entity);
      return this;
    }

    @JsonSetter(value = "error_details", nulls = Nulls.SKIP)
    public Builder errorDetails(Optional<ErrorDetailsInPaymentsEntity> errorDetails) {
      this.errorDetails = errorDetails;
      return this;
    }

    public Builder errorDetails(ErrorDetailsInPaymentsEntity errorDetails) {
      this.errorDetails = Optional.of(errorDetails);
      return this;
    }

    @JsonSetter(value = "is_captured", nulls = Nulls.SKIP)
    public Builder isCaptured(Optional<Boolean> isCaptured) {
      this.isCaptured = isCaptured;
      return this;
    }

    public Builder isCaptured(Boolean isCaptured) {
      this.isCaptured = Optional.of(isCaptured);
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

    @JsonSetter(value = "payment_group", nulls = Nulls.SKIP)
    public Builder paymentGroup(Optional<String> paymentGroup) {
      this.paymentGroup = paymentGroup;
      return this;
    }

    public Builder paymentGroup(String paymentGroup) {
      this.paymentGroup = Optional.of(paymentGroup);
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

    @JsonSetter(value = "payment_amount", nulls = Nulls.SKIP)
    public Builder paymentAmount(Optional<Double> paymentAmount) {
      this.paymentAmount = paymentAmount;
      return this;
    }

    public Builder paymentAmount(Double paymentAmount) {
      this.paymentAmount = Optional.of(paymentAmount);
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

    @JsonSetter(value = "payment_completion_time", nulls = Nulls.SKIP)
    public Builder paymentCompletionTime(Optional<String> paymentCompletionTime) {
      this.paymentCompletionTime = paymentCompletionTime;
      return this;
    }

    public Builder paymentCompletionTime(String paymentCompletionTime) {
      this.paymentCompletionTime = Optional.of(paymentCompletionTime);
      return this;
    }

    @JsonSetter(value = "payment_status", nulls = Nulls.SKIP)
    public Builder paymentStatus(Optional<PaymentsEntityPaymentStatus> paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
    }

    public Builder paymentStatus(PaymentsEntityPaymentStatus paymentStatus) {
      this.paymentStatus = Optional.of(paymentStatus);
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

    @JsonSetter(value = "authorization", nulls = Nulls.SKIP)
    public Builder authorization(Optional<AuthorizationInPaymentsEntity> authorization) {
      this.authorization = authorization;
      return this;
    }

    public Builder authorization(AuthorizationInPaymentsEntity authorization) {
      this.authorization = Optional.of(authorization);
      return this;
    }

    @JsonSetter(value = "payment_method", nulls = Nulls.SKIP)
    public Builder paymentMethod(Optional<PaymentMethodInPaymentsEntity> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(PaymentMethodInPaymentsEntity paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    public PaymentsEntity build() {
      return new PaymentsEntity(
          cfPaymentId,
          orderId,
          entity,
          errorDetails,
          isCaptured,
          orderAmount,
          paymentGroup,
          paymentCurrency,
          paymentAmount,
          paymentTime,
          paymentCompletionTime,
          paymentStatus,
          paymentMessage,
          bankReference,
          authId,
          authorization,
          paymentMethod);
    }
  }
}
