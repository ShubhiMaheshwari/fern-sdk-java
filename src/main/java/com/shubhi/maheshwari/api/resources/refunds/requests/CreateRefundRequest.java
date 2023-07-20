package com.shubhi.maheshwari.api.resources.refunds.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.CreateRefundRequestRefundSpeed;
import com.shubhi.maheshwari.api.types.VendorSplit;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CreateRefundRequest.Builder.class)
public final class CreateRefundRequest {
  private final double refundAmount;

  private final String refundId;

  private final Optional<String> refundNote;

  private final Optional<CreateRefundRequestRefundSpeed> refundSpeed;

  private final Optional<List<VendorSplit>> refundSplits;

  private int _cachedHashCode;

  CreateRefundRequest(
      double refundAmount,
      String refundId,
      Optional<String> refundNote,
      Optional<CreateRefundRequestRefundSpeed> refundSpeed,
      Optional<List<VendorSplit>> refundSplits) {
    this.refundAmount = refundAmount;
    this.refundId = refundId;
    this.refundNote = refundNote;
    this.refundSpeed = refundSpeed;
    this.refundSplits = refundSplits;
  }

  /**
   * @return Amount to be refunded. Should be lesser than or equal to the transaction amount.
   *     (Decimals allowed)
   */
  @JsonProperty("refund_amount")
  public double getRefundAmount() {
    return refundAmount;
  }

  /**
   * @return An unique ID to associate the refund with. Provie alphanumeric values &lt;span
   *     style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 40 characters</code>&lt;/span&gt;
   */
  @JsonProperty("refund_id")
  public String getRefundId() {
    return refundId;
  }

  /**
   * @return A refund note for your reference. &lt;span style=&quot;white-space: nowrap&quot;&gt;
   *     <code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("refund_note")
  public Optional<String> getRefundNote() {
    return refundNote;
  }

  /**
   * @return Speed at which the refund is processed. It's an optional field with default being
   *     STANDARD
   */
  @JsonProperty("refund_speed")
  public Optional<CreateRefundRequestRefundSpeed> getRefundSpeed() {
    return refundSpeed;
  }

  @JsonProperty("refund_splits")
  public Optional<List<VendorSplit>> getRefundSplits() {
    return refundSplits;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateRefundRequest && equalTo((CreateRefundRequest) other);
  }

  private boolean equalTo(CreateRefundRequest other) {
    return refundAmount == other.refundAmount
        && refundId.equals(other.refundId)
        && refundNote.equals(other.refundNote)
        && refundSpeed.equals(other.refundSpeed)
        && refundSplits.equals(other.refundSplits);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.refundAmount,
              this.refundId,
              this.refundNote,
              this.refundSpeed,
              this.refundSplits);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateRefundRequest{"
        + "refundAmount: "
        + refundAmount
        + ", refundId: "
        + refundId
        + ", refundNote: "
        + refundNote
        + ", refundSpeed: "
        + refundSpeed
        + ", refundSplits: "
        + refundSplits
        + "}";
  }

  public static RefundAmountStage builder() {
    return new Builder();
  }

  public interface RefundAmountStage {
    RefundIdStage refundAmount(double refundAmount);

    Builder from(CreateRefundRequest other);
  }

  public interface RefundIdStage {
    _FinalStage refundId(String refundId);
  }

  public interface _FinalStage {
    CreateRefundRequest build();

    _FinalStage refundNote(Optional<String> refundNote);

    _FinalStage refundNote(String refundNote);

    _FinalStage refundSpeed(Optional<CreateRefundRequestRefundSpeed> refundSpeed);

    _FinalStage refundSpeed(CreateRefundRequestRefundSpeed refundSpeed);

    _FinalStage refundSplits(Optional<List<VendorSplit>> refundSplits);

    _FinalStage refundSplits(List<VendorSplit> refundSplits);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements RefundAmountStage, RefundIdStage, _FinalStage {
    private double refundAmount;

    private String refundId;

    private Optional<List<VendorSplit>> refundSplits = Optional.empty();

    private Optional<CreateRefundRequestRefundSpeed> refundSpeed = Optional.empty();

    private Optional<String> refundNote = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(CreateRefundRequest other) {
      refundAmount(other.getRefundAmount());
      refundId(other.getRefundId());
      refundNote(other.getRefundNote());
      refundSpeed(other.getRefundSpeed());
      refundSplits(other.getRefundSplits());
      return this;
    }

    /**
     * Amount to be refunded. Should be lesser than or equal to the transaction amount. (Decimals
     * allowed)
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("refund_amount")
    public RefundIdStage refundAmount(double refundAmount) {
      this.refundAmount = refundAmount;
      return this;
    }

    /**
     * An unique ID to associate the refund with. Provie alphanumeric values &lt;span
     * style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 40 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("refund_id")
    public _FinalStage refundId(String refundId) {
      this.refundId = refundId;
      return this;
    }

    @Override
    public _FinalStage refundSplits(List<VendorSplit> refundSplits) {
      this.refundSplits = Optional.of(refundSplits);
      return this;
    }

    @Override
    @JsonSetter(value = "refund_splits", nulls = Nulls.SKIP)
    public _FinalStage refundSplits(Optional<List<VendorSplit>> refundSplits) {
      this.refundSplits = refundSplits;
      return this;
    }

    /**
     * Speed at which the refund is processed. It's an optional field with default being STANDARD
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage refundSpeed(CreateRefundRequestRefundSpeed refundSpeed) {
      this.refundSpeed = Optional.of(refundSpeed);
      return this;
    }

    @Override
    @JsonSetter(value = "refund_speed", nulls = Nulls.SKIP)
    public _FinalStage refundSpeed(Optional<CreateRefundRequestRefundSpeed> refundSpeed) {
      this.refundSpeed = refundSpeed;
      return this;
    }

    /**
     * A refund note for your reference. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage refundNote(String refundNote) {
      this.refundNote = Optional.of(refundNote);
      return this;
    }

    @Override
    @JsonSetter(value = "refund_note", nulls = Nulls.SKIP)
    public _FinalStage refundNote(Optional<String> refundNote) {
      this.refundNote = refundNote;
      return this;
    }

    @Override
    public CreateRefundRequest build() {
      return new CreateRefundRequest(refundAmount, refundId, refundNote, refundSpeed, refundSplits);
    }
  }
}
