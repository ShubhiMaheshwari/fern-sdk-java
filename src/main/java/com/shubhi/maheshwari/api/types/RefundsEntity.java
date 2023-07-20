package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = RefundsEntity.Builder.class)
public final class RefundsEntity {
  private final Optional<Integer> cfPaymentId;

  private final Optional<String> cfRefundId;

  private final Optional<String> orderId;

  private final Optional<String> refundId;

  private final Optional<String> entity;

  private final Optional<Double> refundAmount;

  private final Optional<String> refundCurrency;

  private final Optional<String> refundNote;

  private final Optional<RefundsEntityRefundStatus> refundStatus;

  private final Optional<String> refundArn;

  private final Optional<Double> refundCharge;

  private final Optional<String> statusDescription;

  private final Optional<Map<String, Object>> metadata;

  private final Optional<List<VendorSplit>> refundSplits;

  private final Optional<RefundsEntityRefundType> refundType;

  private final Optional<RefundsEntityRefundMode> refundMode;

  private final Optional<String> createdAt;

  private final Optional<String> processedAt;

  private final Optional<RefundSpeed> refundSpeed;

  private int _cachedHashCode;

  RefundsEntity(
      Optional<Integer> cfPaymentId,
      Optional<String> cfRefundId,
      Optional<String> orderId,
      Optional<String> refundId,
      Optional<String> entity,
      Optional<Double> refundAmount,
      Optional<String> refundCurrency,
      Optional<String> refundNote,
      Optional<RefundsEntityRefundStatus> refundStatus,
      Optional<String> refundArn,
      Optional<Double> refundCharge,
      Optional<String> statusDescription,
      Optional<Map<String, Object>> metadata,
      Optional<List<VendorSplit>> refundSplits,
      Optional<RefundsEntityRefundType> refundType,
      Optional<RefundsEntityRefundMode> refundMode,
      Optional<String> createdAt,
      Optional<String> processedAt,
      Optional<RefundSpeed> refundSpeed) {
    this.cfPaymentId = cfPaymentId;
    this.cfRefundId = cfRefundId;
    this.orderId = orderId;
    this.refundId = refundId;
    this.entity = entity;
    this.refundAmount = refundAmount;
    this.refundCurrency = refundCurrency;
    this.refundNote = refundNote;
    this.refundStatus = refundStatus;
    this.refundArn = refundArn;
    this.refundCharge = refundCharge;
    this.statusDescription = statusDescription;
    this.metadata = metadata;
    this.refundSplits = refundSplits;
    this.refundType = refundType;
    this.refundMode = refundMode;
    this.createdAt = createdAt;
    this.processedAt = processedAt;
    this.refundSpeed = refundSpeed;
  }

  /**
   * @return Cashfree Payments ID of the payment for which refund is initiated
   */
  @JsonProperty("cf_payment_id")
  public Optional<Integer> getCfPaymentId() {
    return cfPaymentId;
  }

  /**
   * @return Cashfree Payments ID for a refund
   */
  @JsonProperty("cf_refund_id")
  public Optional<String> getCfRefundId() {
    return cfRefundId;
  }

  /**
   * @return Merchant’s order Id of the order for which refund is initiated
   */
  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  /**
   * @return Merchant’s refund ID of the refund
   */
  @JsonProperty("refund_id")
  public Optional<String> getRefundId() {
    return refundId;
  }

  @JsonProperty("entity")
  public Optional<String> getEntity() {
    return entity;
  }

  /**
   * @return Amount that is refunded
   */
  @JsonProperty("refund_amount")
  public Optional<Double> getRefundAmount() {
    return refundAmount;
  }

  /**
   * @return Currency of the refund amount
   */
  @JsonProperty("refund_currency")
  public Optional<String> getRefundCurrency() {
    return refundCurrency;
  }

  /**
   * @return Note added by merchant for the refund
   */
  @JsonProperty("refund_note")
  public Optional<String> getRefundNote() {
    return refundNote;
  }

  /**
   * @return This can be one of [&quot;SUCCESS&quot;, &quot;PENDING&quot;, &quot;CANCELLED&quot;,
   *     &quot;ONHOLD&quot;, &quot;FAILED&quot;]
   */
  @JsonProperty("refund_status")
  public Optional<RefundsEntityRefundStatus> getRefundStatus() {
    return refundStatus;
  }

  /**
   * @return The bank reference number for refund
   */
  @JsonProperty("refund_arn")
  public Optional<String> getRefundArn() {
    return refundArn;
  }

  /**
   * @return Charges in INR for processing refund
   */
  @JsonProperty("refund_charge")
  public Optional<Double> getRefundCharge() {
    return refundCharge;
  }

  /**
   * @return Description of refund status
   */
  @JsonProperty("status_description")
  public Optional<String> getStatusDescription() {
    return statusDescription;
  }

  /**
   * @return Key-value pair that can be used to store additional information about the entity.
   *     Maximum 5 key-value pairs
   */
  @JsonProperty("metadata")
  public Optional<Map<String, Object>> getMetadata() {
    return metadata;
  }

  @JsonProperty("refund_splits")
  public Optional<List<VendorSplit>> getRefundSplits() {
    return refundSplits;
  }

  /**
   * @return This can be one of [&quot;PAYMENT_AUTO_REFUND&quot;, &quot;MERCHANT_INITIATED&quot;,
   *     &quot;UNRECONCILED_AUTO_REFUND&quot;]
   */
  @JsonProperty("refund_type")
  public Optional<RefundsEntityRefundType> getRefundType() {
    return refundType;
  }

  /**
   * @return Method or speed of processing refund
   */
  @JsonProperty("refund_mode")
  public Optional<RefundsEntityRefundMode> getRefundMode() {
    return refundMode;
  }

  /**
   * @return Time of refund creation
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Time when refund was processed successfully
   */
  @JsonProperty("processed_at")
  public Optional<String> getProcessedAt() {
    return processedAt;
  }

  @JsonProperty("refund_speed")
  public Optional<RefundSpeed> getRefundSpeed() {
    return refundSpeed;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RefundsEntity && equalTo((RefundsEntity) other);
  }

  private boolean equalTo(RefundsEntity other) {
    return cfPaymentId.equals(other.cfPaymentId)
        && cfRefundId.equals(other.cfRefundId)
        && orderId.equals(other.orderId)
        && refundId.equals(other.refundId)
        && entity.equals(other.entity)
        && refundAmount.equals(other.refundAmount)
        && refundCurrency.equals(other.refundCurrency)
        && refundNote.equals(other.refundNote)
        && refundStatus.equals(other.refundStatus)
        && refundArn.equals(other.refundArn)
        && refundCharge.equals(other.refundCharge)
        && statusDescription.equals(other.statusDescription)
        && metadata.equals(other.metadata)
        && refundSplits.equals(other.refundSplits)
        && refundType.equals(other.refundType)
        && refundMode.equals(other.refundMode)
        && createdAt.equals(other.createdAt)
        && processedAt.equals(other.processedAt)
        && refundSpeed.equals(other.refundSpeed);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cfPaymentId,
              this.cfRefundId,
              this.orderId,
              this.refundId,
              this.entity,
              this.refundAmount,
              this.refundCurrency,
              this.refundNote,
              this.refundStatus,
              this.refundArn,
              this.refundCharge,
              this.statusDescription,
              this.metadata,
              this.refundSplits,
              this.refundType,
              this.refundMode,
              this.createdAt,
              this.processedAt,
              this.refundSpeed);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RefundsEntity{"
        + "cfPaymentId: "
        + cfPaymentId
        + ", cfRefundId: "
        + cfRefundId
        + ", orderId: "
        + orderId
        + ", refundId: "
        + refundId
        + ", entity: "
        + entity
        + ", refundAmount: "
        + refundAmount
        + ", refundCurrency: "
        + refundCurrency
        + ", refundNote: "
        + refundNote
        + ", refundStatus: "
        + refundStatus
        + ", refundArn: "
        + refundArn
        + ", refundCharge: "
        + refundCharge
        + ", statusDescription: "
        + statusDescription
        + ", metadata: "
        + metadata
        + ", refundSplits: "
        + refundSplits
        + ", refundType: "
        + refundType
        + ", refundMode: "
        + refundMode
        + ", createdAt: "
        + createdAt
        + ", processedAt: "
        + processedAt
        + ", refundSpeed: "
        + refundSpeed
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> cfPaymentId = Optional.empty();

    private Optional<String> cfRefundId = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Optional<String> refundId = Optional.empty();

    private Optional<String> entity = Optional.empty();

    private Optional<Double> refundAmount = Optional.empty();

    private Optional<String> refundCurrency = Optional.empty();

    private Optional<String> refundNote = Optional.empty();

    private Optional<RefundsEntityRefundStatus> refundStatus = Optional.empty();

    private Optional<String> refundArn = Optional.empty();

    private Optional<Double> refundCharge = Optional.empty();

    private Optional<String> statusDescription = Optional.empty();

    private Optional<Map<String, Object>> metadata = Optional.empty();

    private Optional<List<VendorSplit>> refundSplits = Optional.empty();

    private Optional<RefundsEntityRefundType> refundType = Optional.empty();

    private Optional<RefundsEntityRefundMode> refundMode = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> processedAt = Optional.empty();

    private Optional<RefundSpeed> refundSpeed = Optional.empty();

    private Builder() {}

    public Builder from(RefundsEntity other) {
      cfPaymentId(other.getCfPaymentId());
      cfRefundId(other.getCfRefundId());
      orderId(other.getOrderId());
      refundId(other.getRefundId());
      entity(other.getEntity());
      refundAmount(other.getRefundAmount());
      refundCurrency(other.getRefundCurrency());
      refundNote(other.getRefundNote());
      refundStatus(other.getRefundStatus());
      refundArn(other.getRefundArn());
      refundCharge(other.getRefundCharge());
      statusDescription(other.getStatusDescription());
      metadata(other.getMetadata());
      refundSplits(other.getRefundSplits());
      refundType(other.getRefundType());
      refundMode(other.getRefundMode());
      createdAt(other.getCreatedAt());
      processedAt(other.getProcessedAt());
      refundSpeed(other.getRefundSpeed());
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

    @JsonSetter(value = "cf_refund_id", nulls = Nulls.SKIP)
    public Builder cfRefundId(Optional<String> cfRefundId) {
      this.cfRefundId = cfRefundId;
      return this;
    }

    public Builder cfRefundId(String cfRefundId) {
      this.cfRefundId = Optional.of(cfRefundId);
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

    @JsonSetter(value = "refund_id", nulls = Nulls.SKIP)
    public Builder refundId(Optional<String> refundId) {
      this.refundId = refundId;
      return this;
    }

    public Builder refundId(String refundId) {
      this.refundId = Optional.of(refundId);
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

    @JsonSetter(value = "refund_amount", nulls = Nulls.SKIP)
    public Builder refundAmount(Optional<Double> refundAmount) {
      this.refundAmount = refundAmount;
      return this;
    }

    public Builder refundAmount(Double refundAmount) {
      this.refundAmount = Optional.of(refundAmount);
      return this;
    }

    @JsonSetter(value = "refund_currency", nulls = Nulls.SKIP)
    public Builder refundCurrency(Optional<String> refundCurrency) {
      this.refundCurrency = refundCurrency;
      return this;
    }

    public Builder refundCurrency(String refundCurrency) {
      this.refundCurrency = Optional.of(refundCurrency);
      return this;
    }

    @JsonSetter(value = "refund_note", nulls = Nulls.SKIP)
    public Builder refundNote(Optional<String> refundNote) {
      this.refundNote = refundNote;
      return this;
    }

    public Builder refundNote(String refundNote) {
      this.refundNote = Optional.of(refundNote);
      return this;
    }

    @JsonSetter(value = "refund_status", nulls = Nulls.SKIP)
    public Builder refundStatus(Optional<RefundsEntityRefundStatus> refundStatus) {
      this.refundStatus = refundStatus;
      return this;
    }

    public Builder refundStatus(RefundsEntityRefundStatus refundStatus) {
      this.refundStatus = Optional.of(refundStatus);
      return this;
    }

    @JsonSetter(value = "refund_arn", nulls = Nulls.SKIP)
    public Builder refundArn(Optional<String> refundArn) {
      this.refundArn = refundArn;
      return this;
    }

    public Builder refundArn(String refundArn) {
      this.refundArn = Optional.of(refundArn);
      return this;
    }

    @JsonSetter(value = "refund_charge", nulls = Nulls.SKIP)
    public Builder refundCharge(Optional<Double> refundCharge) {
      this.refundCharge = refundCharge;
      return this;
    }

    public Builder refundCharge(Double refundCharge) {
      this.refundCharge = Optional.of(refundCharge);
      return this;
    }

    @JsonSetter(value = "status_description", nulls = Nulls.SKIP)
    public Builder statusDescription(Optional<String> statusDescription) {
      this.statusDescription = statusDescription;
      return this;
    }

    public Builder statusDescription(String statusDescription) {
      this.statusDescription = Optional.of(statusDescription);
      return this;
    }

    @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
    public Builder metadata(Optional<Map<String, Object>> metadata) {
      this.metadata = metadata;
      return this;
    }

    public Builder metadata(Map<String, Object> metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }

    @JsonSetter(value = "refund_splits", nulls = Nulls.SKIP)
    public Builder refundSplits(Optional<List<VendorSplit>> refundSplits) {
      this.refundSplits = refundSplits;
      return this;
    }

    public Builder refundSplits(List<VendorSplit> refundSplits) {
      this.refundSplits = Optional.of(refundSplits);
      return this;
    }

    @JsonSetter(value = "refund_type", nulls = Nulls.SKIP)
    public Builder refundType(Optional<RefundsEntityRefundType> refundType) {
      this.refundType = refundType;
      return this;
    }

    public Builder refundType(RefundsEntityRefundType refundType) {
      this.refundType = Optional.of(refundType);
      return this;
    }

    @JsonSetter(value = "refund_mode", nulls = Nulls.SKIP)
    public Builder refundMode(Optional<RefundsEntityRefundMode> refundMode) {
      this.refundMode = refundMode;
      return this;
    }

    public Builder refundMode(RefundsEntityRefundMode refundMode) {
      this.refundMode = Optional.of(refundMode);
      return this;
    }

    @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @JsonSetter(value = "processed_at", nulls = Nulls.SKIP)
    public Builder processedAt(Optional<String> processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    public Builder processedAt(String processedAt) {
      this.processedAt = Optional.of(processedAt);
      return this;
    }

    @JsonSetter(value = "refund_speed", nulls = Nulls.SKIP)
    public Builder refundSpeed(Optional<RefundSpeed> refundSpeed) {
      this.refundSpeed = refundSpeed;
      return this;
    }

    public Builder refundSpeed(RefundSpeed refundSpeed) {
      this.refundSpeed = Optional.of(refundSpeed);
      return this;
    }

    public RefundsEntity build() {
      return new RefundsEntity(
          cfPaymentId,
          cfRefundId,
          orderId,
          refundId,
          entity,
          refundAmount,
          refundCurrency,
          refundNote,
          refundStatus,
          refundArn,
          refundCharge,
          statusDescription,
          metadata,
          refundSplits,
          refundType,
          refundMode,
          createdAt,
          processedAt,
          refundSpeed);
    }
  }
}
