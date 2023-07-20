package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OtpResponseEntity.Builder.class)
public final class OtpResponseEntity {
  private final Optional<Double> cfPaymentId;

  private final Optional<OtpResponseEntityAction> action;

  private final Optional<OtpResponseEntityAuthenticateStatus> authenticateStatus;

  private final Optional<String> paymentMessage;

  private int _cachedHashCode;

  OtpResponseEntity(
      Optional<Double> cfPaymentId,
      Optional<OtpResponseEntityAction> action,
      Optional<OtpResponseEntityAuthenticateStatus> authenticateStatus,
      Optional<String> paymentMessage) {
    this.cfPaymentId = cfPaymentId;
    this.action = action;
    this.authenticateStatus = authenticateStatus;
    this.paymentMessage = paymentMessage;
  }

  /**
   * @return The payment id for which this request was sent
   */
  @JsonProperty("cf_payment_id")
  public Optional<Double> getCfPaymentId() {
    return cfPaymentId;
  }

  /**
   * @return The action that was invoked for this request.
   */
  @JsonProperty("action")
  public Optional<OtpResponseEntityAction> getAction() {
    return action;
  }

  /**
   * @return Status of the is action. Will be either failed or successful. If the action is
   *     successful, you should still call the authorization status to verify the final payment
   *     status.
   */
  @JsonProperty("authenticate_status")
  public Optional<OtpResponseEntityAuthenticateStatus> getAuthenticateStatus() {
    return authenticateStatus;
  }

  /**
   * @return Human readable message which describes the status in more detail
   */
  @JsonProperty("payment_message")
  public Optional<String> getPaymentMessage() {
    return paymentMessage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OtpResponseEntity && equalTo((OtpResponseEntity) other);
  }

  private boolean equalTo(OtpResponseEntity other) {
    return cfPaymentId.equals(other.cfPaymentId)
        && action.equals(other.action)
        && authenticateStatus.equals(other.authenticateStatus)
        && paymentMessage.equals(other.paymentMessage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.cfPaymentId, this.action, this.authenticateStatus, this.paymentMessage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OtpResponseEntity{"
        + "cfPaymentId: "
        + cfPaymentId
        + ", action: "
        + action
        + ", authenticateStatus: "
        + authenticateStatus
        + ", paymentMessage: "
        + paymentMessage
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Double> cfPaymentId = Optional.empty();

    private Optional<OtpResponseEntityAction> action = Optional.empty();

    private Optional<OtpResponseEntityAuthenticateStatus> authenticateStatus = Optional.empty();

    private Optional<String> paymentMessage = Optional.empty();

    private Builder() {}

    public Builder from(OtpResponseEntity other) {
      cfPaymentId(other.getCfPaymentId());
      action(other.getAction());
      authenticateStatus(other.getAuthenticateStatus());
      paymentMessage(other.getPaymentMessage());
      return this;
    }

    @JsonSetter(value = "cf_payment_id", nulls = Nulls.SKIP)
    public Builder cfPaymentId(Optional<Double> cfPaymentId) {
      this.cfPaymentId = cfPaymentId;
      return this;
    }

    public Builder cfPaymentId(Double cfPaymentId) {
      this.cfPaymentId = Optional.of(cfPaymentId);
      return this;
    }

    @JsonSetter(value = "action", nulls = Nulls.SKIP)
    public Builder action(Optional<OtpResponseEntityAction> action) {
      this.action = action;
      return this;
    }

    public Builder action(OtpResponseEntityAction action) {
      this.action = Optional.of(action);
      return this;
    }

    @JsonSetter(value = "authenticate_status", nulls = Nulls.SKIP)
    public Builder authenticateStatus(
        Optional<OtpResponseEntityAuthenticateStatus> authenticateStatus) {
      this.authenticateStatus = authenticateStatus;
      return this;
    }

    public Builder authenticateStatus(OtpResponseEntityAuthenticateStatus authenticateStatus) {
      this.authenticateStatus = Optional.of(authenticateStatus);
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

    public OtpResponseEntity build() {
      return new OtpResponseEntity(cfPaymentId, action, authenticateStatus, paymentMessage);
    }
  }
}
