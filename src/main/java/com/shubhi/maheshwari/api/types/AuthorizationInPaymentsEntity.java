package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AuthorizationInPaymentsEntity.Builder.class)
public final class AuthorizationInPaymentsEntity {
  private final Optional<AuthorizationInPaymentsEntityAction> action;

  private final Optional<AuthorizationInPaymentsEntityStatus> status;

  private final Optional<Double> capturedAmount;

  private final Optional<String> startTime;

  private final Optional<String> endTime;

  private final Optional<String> approveBy;

  private final Optional<String> actionReference;

  private final Optional<String> actionTime;

  private int _cachedHashCode;

  AuthorizationInPaymentsEntity(
      Optional<AuthorizationInPaymentsEntityAction> action,
      Optional<AuthorizationInPaymentsEntityStatus> status,
      Optional<Double> capturedAmount,
      Optional<String> startTime,
      Optional<String> endTime,
      Optional<String> approveBy,
      Optional<String> actionReference,
      Optional<String> actionTime) {
    this.action = action;
    this.status = status;
    this.capturedAmount = capturedAmount;
    this.startTime = startTime;
    this.endTime = endTime;
    this.approveBy = approveBy;
    this.actionReference = actionReference;
    this.actionTime = actionTime;
  }

  /**
   * @return One of CAPTURE or VOID
   */
  @JsonProperty("action")
  public Optional<AuthorizationInPaymentsEntityAction> getAction() {
    return action;
  }

  /**
   * @return One of SUCCESS or PENDING
   */
  @JsonProperty("status")
  public Optional<AuthorizationInPaymentsEntityStatus> getStatus() {
    return status;
  }

  /**
   * @return The captured amount for this authorization request
   */
  @JsonProperty("captured_amount")
  public Optional<Double> getCapturedAmount() {
    return capturedAmount;
  }

  /**
   * @return Start time of this authorization hold (only for UPI)
   */
  @JsonProperty("start_time")
  public Optional<String> getStartTime() {
    return startTime;
  }

  /**
   * @return End time of this authorization hold (only for UPI)
   */
  @JsonProperty("end_time")
  public Optional<String> getEndTime() {
    return endTime;
  }

  /**
   * @return Approve by time as passed in the authorization request (only for UPI)
   */
  @JsonProperty("approve_by")
  public Optional<String> getApproveBy() {
    return approveBy;
  }

  /**
   * @return CAPTURE or VOID reference number based on action
   */
  @JsonProperty("action_reference")
  public Optional<String> getActionReference() {
    return actionReference;
  }

  /**
   * @return Time of action (CAPTURE or VOID)
   */
  @JsonProperty("action_time")
  public Optional<String> getActionTime() {
    return actionTime;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AuthorizationInPaymentsEntity
        && equalTo((AuthorizationInPaymentsEntity) other);
  }

  private boolean equalTo(AuthorizationInPaymentsEntity other) {
    return action.equals(other.action)
        && status.equals(other.status)
        && capturedAmount.equals(other.capturedAmount)
        && startTime.equals(other.startTime)
        && endTime.equals(other.endTime)
        && approveBy.equals(other.approveBy)
        && actionReference.equals(other.actionReference)
        && actionTime.equals(other.actionTime);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.action,
              this.status,
              this.capturedAmount,
              this.startTime,
              this.endTime,
              this.approveBy,
              this.actionReference,
              this.actionTime);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AuthorizationInPaymentsEntity{"
        + "action: "
        + action
        + ", status: "
        + status
        + ", capturedAmount: "
        + capturedAmount
        + ", startTime: "
        + startTime
        + ", endTime: "
        + endTime
        + ", approveBy: "
        + approveBy
        + ", actionReference: "
        + actionReference
        + ", actionTime: "
        + actionTime
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<AuthorizationInPaymentsEntityAction> action = Optional.empty();

    private Optional<AuthorizationInPaymentsEntityStatus> status = Optional.empty();

    private Optional<Double> capturedAmount = Optional.empty();

    private Optional<String> startTime = Optional.empty();

    private Optional<String> endTime = Optional.empty();

    private Optional<String> approveBy = Optional.empty();

    private Optional<String> actionReference = Optional.empty();

    private Optional<String> actionTime = Optional.empty();

    private Builder() {}

    public Builder from(AuthorizationInPaymentsEntity other) {
      action(other.getAction());
      status(other.getStatus());
      capturedAmount(other.getCapturedAmount());
      startTime(other.getStartTime());
      endTime(other.getEndTime());
      approveBy(other.getApproveBy());
      actionReference(other.getActionReference());
      actionTime(other.getActionTime());
      return this;
    }

    @JsonSetter(value = "action", nulls = Nulls.SKIP)
    public Builder action(Optional<AuthorizationInPaymentsEntityAction> action) {
      this.action = action;
      return this;
    }

    public Builder action(AuthorizationInPaymentsEntityAction action) {
      this.action = Optional.of(action);
      return this;
    }

    @JsonSetter(value = "status", nulls = Nulls.SKIP)
    public Builder status(Optional<AuthorizationInPaymentsEntityStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(AuthorizationInPaymentsEntityStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(value = "captured_amount", nulls = Nulls.SKIP)
    public Builder capturedAmount(Optional<Double> capturedAmount) {
      this.capturedAmount = capturedAmount;
      return this;
    }

    public Builder capturedAmount(Double capturedAmount) {
      this.capturedAmount = Optional.of(capturedAmount);
      return this;
    }

    @JsonSetter(value = "start_time", nulls = Nulls.SKIP)
    public Builder startTime(Optional<String> startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }

    @JsonSetter(value = "end_time", nulls = Nulls.SKIP)
    public Builder endTime(Optional<String> endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = Optional.of(endTime);
      return this;
    }

    @JsonSetter(value = "approve_by", nulls = Nulls.SKIP)
    public Builder approveBy(Optional<String> approveBy) {
      this.approveBy = approveBy;
      return this;
    }

    public Builder approveBy(String approveBy) {
      this.approveBy = Optional.of(approveBy);
      return this;
    }

    @JsonSetter(value = "action_reference", nulls = Nulls.SKIP)
    public Builder actionReference(Optional<String> actionReference) {
      this.actionReference = actionReference;
      return this;
    }

    public Builder actionReference(String actionReference) {
      this.actionReference = Optional.of(actionReference);
      return this;
    }

    @JsonSetter(value = "action_time", nulls = Nulls.SKIP)
    public Builder actionTime(Optional<String> actionTime) {
      this.actionTime = actionTime;
      return this;
    }

    public Builder actionTime(String actionTime) {
      this.actionTime = Optional.of(actionTime);
      return this;
    }

    public AuthorizationInPaymentsEntity build() {
      return new AuthorizationInPaymentsEntity(
          action,
          status,
          capturedAmount,
          startTime,
          endTime,
          approveBy,
          actionReference,
          actionTime);
    }
  }
}
