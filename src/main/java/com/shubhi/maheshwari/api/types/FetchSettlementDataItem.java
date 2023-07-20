package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchSettlementDataItem.Builder.class)
public final class FetchSettlementDataItem {
  private final Optional<String> eventType;

  private final Optional<Integer> cfSettlementId;

  private final Optional<String> status;

  private final Optional<String> settlementDate;

  private final Optional<Double> paymentAmount;

  private final Optional<String> settlementUtr;

  private final Optional<Double> adjustment;

  private final Optional<Double> serviceTax;

  private final Optional<Double> serviceCharge;

  private final Optional<Double> amountSettled;

  private final Optional<String> paymentFrom;

  private final Optional<String> paymentTill;

  private final Optional<String> reason;

  private final Optional<String> settlementInitiatedOn;

  private final Optional<String> settlementType;

  private final Optional<Double> settlementCharge;

  private final Optional<Double> settlementTax;

  private final Optional<String> remarks;

  private int _cachedHashCode;

  FetchSettlementDataItem(
      Optional<String> eventType,
      Optional<Integer> cfSettlementId,
      Optional<String> status,
      Optional<String> settlementDate,
      Optional<Double> paymentAmount,
      Optional<String> settlementUtr,
      Optional<Double> adjustment,
      Optional<Double> serviceTax,
      Optional<Double> serviceCharge,
      Optional<Double> amountSettled,
      Optional<String> paymentFrom,
      Optional<String> paymentTill,
      Optional<String> reason,
      Optional<String> settlementInitiatedOn,
      Optional<String> settlementType,
      Optional<Double> settlementCharge,
      Optional<Double> settlementTax,
      Optional<String> remarks) {
    this.eventType = eventType;
    this.cfSettlementId = cfSettlementId;
    this.status = status;
    this.settlementDate = settlementDate;
    this.paymentAmount = paymentAmount;
    this.settlementUtr = settlementUtr;
    this.adjustment = adjustment;
    this.serviceTax = serviceTax;
    this.serviceCharge = serviceCharge;
    this.amountSettled = amountSettled;
    this.paymentFrom = paymentFrom;
    this.paymentTill = paymentTill;
    this.reason = reason;
    this.settlementInitiatedOn = settlementInitiatedOn;
    this.settlementType = settlementType;
    this.settlementCharge = settlementCharge;
    this.settlementTax = settlementTax;
    this.remarks = remarks;
  }

  /**
   * @return Event type is SETTLEMENT.
   */
  @JsonProperty("event_type")
  public Optional<String> getEventType() {
    return eventType;
  }

  /**
   * @return Unique ID to identify the settlement.
   */
  @JsonProperty("cf_settlement_id")
  public Optional<Integer> getCfSettlementId() {
    return cfSettlementId;
  }

  /**
   * @return Status of the settlement.
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  /**
   * @return Date and time when the settlement was processed.
   */
  @JsonProperty("settlement_date")
  public Optional<String> getSettlementDate() {
    return settlementDate;
  }

  /**
   * @return Amount captured.
   */
  @JsonProperty("payment_amount")
  public Optional<Double> getPaymentAmount() {
    return paymentAmount;
  }

  /**
   * @return Unique transaction reference number of the payment.
   */
  @JsonProperty("settlement_utr")
  public Optional<String> getSettlementUtr() {
    return settlementUtr;
  }

  /**
   * @return Amount that is adjusted from the settlement amount.
   */
  @JsonProperty("adjustment")
  public Optional<Double> getAdjustment() {
    return adjustment;
  }

  /**
   * @return Service tax applicable on settlement.
   */
  @JsonProperty("service_tax")
  public Optional<Double> getServiceTax() {
    return serviceTax;
  }

  /**
   * @return Service charge applicable on settlement.
   */
  @JsonProperty("service_charge")
  public Optional<Double> getServiceCharge() {
    return serviceCharge;
  }

  /**
   * @return Net amount that is settled after deducting the settlement charges and tax. (Settlement
   *     charges and tax is applicable for instant and on demand settlements.)
   */
  @JsonProperty("amount_settled")
  public Optional<Double> getAmountSettled() {
    return amountSettled;
  }

  /**
   * @return The start time of time range of settlement.
   */
  @JsonProperty("payment_from")
  public Optional<String> getPaymentFrom() {
    return paymentFrom;
  }

  /**
   * @return The end time of time range of settlement
   */
  @JsonProperty("payment_till")
  public Optional<String> getPaymentTill() {
    return paymentTill;
  }

  /**
   * @return Reason for failure.
   */
  @JsonProperty("reason")
  public Optional<String> getReason() {
    return reason;
  }

  /**
   * @return Settlement initiation time.
   */
  @JsonProperty("settlement_initiated_on")
  public Optional<String> getSettlementInitiatedOn() {
    return settlementInitiatedOn;
  }

  /**
   * @return Settlement type.
   */
  @JsonProperty("settlement_type")
  public Optional<String> getSettlementType() {
    return settlementType;
  }

  /**
   * @return Settlement tax applicable on settlement.
   */
  @JsonProperty("settlement_charge")
  public Optional<Double> getSettlementCharge() {
    return settlementCharge;
  }

  /**
   * @return Settlement charge applicable on settlement.
   */
  @JsonProperty("settlement_tax")
  public Optional<Double> getSettlementTax() {
    return settlementTax;
  }

  /**
   * @return Remarks on the settlement.
   */
  @JsonProperty("remarks")
  public Optional<String> getRemarks() {
    return remarks;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchSettlementDataItem && equalTo((FetchSettlementDataItem) other);
  }

  private boolean equalTo(FetchSettlementDataItem other) {
    return eventType.equals(other.eventType)
        && cfSettlementId.equals(other.cfSettlementId)
        && status.equals(other.status)
        && settlementDate.equals(other.settlementDate)
        && paymentAmount.equals(other.paymentAmount)
        && settlementUtr.equals(other.settlementUtr)
        && adjustment.equals(other.adjustment)
        && serviceTax.equals(other.serviceTax)
        && serviceCharge.equals(other.serviceCharge)
        && amountSettled.equals(other.amountSettled)
        && paymentFrom.equals(other.paymentFrom)
        && paymentTill.equals(other.paymentTill)
        && reason.equals(other.reason)
        && settlementInitiatedOn.equals(other.settlementInitiatedOn)
        && settlementType.equals(other.settlementType)
        && settlementCharge.equals(other.settlementCharge)
        && settlementTax.equals(other.settlementTax)
        && remarks.equals(other.remarks);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.eventType,
              this.cfSettlementId,
              this.status,
              this.settlementDate,
              this.paymentAmount,
              this.settlementUtr,
              this.adjustment,
              this.serviceTax,
              this.serviceCharge,
              this.amountSettled,
              this.paymentFrom,
              this.paymentTill,
              this.reason,
              this.settlementInitiatedOn,
              this.settlementType,
              this.settlementCharge,
              this.settlementTax,
              this.remarks);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchSettlementDataItem{"
        + "eventType: "
        + eventType
        + ", cfSettlementId: "
        + cfSettlementId
        + ", status: "
        + status
        + ", settlementDate: "
        + settlementDate
        + ", paymentAmount: "
        + paymentAmount
        + ", settlementUtr: "
        + settlementUtr
        + ", adjustment: "
        + adjustment
        + ", serviceTax: "
        + serviceTax
        + ", serviceCharge: "
        + serviceCharge
        + ", amountSettled: "
        + amountSettled
        + ", paymentFrom: "
        + paymentFrom
        + ", paymentTill: "
        + paymentTill
        + ", reason: "
        + reason
        + ", settlementInitiatedOn: "
        + settlementInitiatedOn
        + ", settlementType: "
        + settlementType
        + ", settlementCharge: "
        + settlementCharge
        + ", settlementTax: "
        + settlementTax
        + ", remarks: "
        + remarks
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> eventType = Optional.empty();

    private Optional<Integer> cfSettlementId = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> settlementDate = Optional.empty();

    private Optional<Double> paymentAmount = Optional.empty();

    private Optional<String> settlementUtr = Optional.empty();

    private Optional<Double> adjustment = Optional.empty();

    private Optional<Double> serviceTax = Optional.empty();

    private Optional<Double> serviceCharge = Optional.empty();

    private Optional<Double> amountSettled = Optional.empty();

    private Optional<String> paymentFrom = Optional.empty();

    private Optional<String> paymentTill = Optional.empty();

    private Optional<String> reason = Optional.empty();

    private Optional<String> settlementInitiatedOn = Optional.empty();

    private Optional<String> settlementType = Optional.empty();

    private Optional<Double> settlementCharge = Optional.empty();

    private Optional<Double> settlementTax = Optional.empty();

    private Optional<String> remarks = Optional.empty();

    private Builder() {}

    public Builder from(FetchSettlementDataItem other) {
      eventType(other.getEventType());
      cfSettlementId(other.getCfSettlementId());
      status(other.getStatus());
      settlementDate(other.getSettlementDate());
      paymentAmount(other.getPaymentAmount());
      settlementUtr(other.getSettlementUtr());
      adjustment(other.getAdjustment());
      serviceTax(other.getServiceTax());
      serviceCharge(other.getServiceCharge());
      amountSettled(other.getAmountSettled());
      paymentFrom(other.getPaymentFrom());
      paymentTill(other.getPaymentTill());
      reason(other.getReason());
      settlementInitiatedOn(other.getSettlementInitiatedOn());
      settlementType(other.getSettlementType());
      settlementCharge(other.getSettlementCharge());
      settlementTax(other.getSettlementTax());
      remarks(other.getRemarks());
      return this;
    }

    @JsonSetter(value = "event_type", nulls = Nulls.SKIP)
    public Builder eventType(Optional<String> eventType) {
      this.eventType = eventType;
      return this;
    }

    public Builder eventType(String eventType) {
      this.eventType = Optional.of(eventType);
      return this;
    }

    @JsonSetter(value = "cf_settlement_id", nulls = Nulls.SKIP)
    public Builder cfSettlementId(Optional<Integer> cfSettlementId) {
      this.cfSettlementId = cfSettlementId;
      return this;
    }

    public Builder cfSettlementId(Integer cfSettlementId) {
      this.cfSettlementId = Optional.of(cfSettlementId);
      return this;
    }

    @JsonSetter(value = "status", nulls = Nulls.SKIP)
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(value = "settlement_date", nulls = Nulls.SKIP)
    public Builder settlementDate(Optional<String> settlementDate) {
      this.settlementDate = settlementDate;
      return this;
    }

    public Builder settlementDate(String settlementDate) {
      this.settlementDate = Optional.of(settlementDate);
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

    @JsonSetter(value = "settlement_utr", nulls = Nulls.SKIP)
    public Builder settlementUtr(Optional<String> settlementUtr) {
      this.settlementUtr = settlementUtr;
      return this;
    }

    public Builder settlementUtr(String settlementUtr) {
      this.settlementUtr = Optional.of(settlementUtr);
      return this;
    }

    @JsonSetter(value = "adjustment", nulls = Nulls.SKIP)
    public Builder adjustment(Optional<Double> adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    public Builder adjustment(Double adjustment) {
      this.adjustment = Optional.of(adjustment);
      return this;
    }

    @JsonSetter(value = "service_tax", nulls = Nulls.SKIP)
    public Builder serviceTax(Optional<Double> serviceTax) {
      this.serviceTax = serviceTax;
      return this;
    }

    public Builder serviceTax(Double serviceTax) {
      this.serviceTax = Optional.of(serviceTax);
      return this;
    }

    @JsonSetter(value = "service_charge", nulls = Nulls.SKIP)
    public Builder serviceCharge(Optional<Double> serviceCharge) {
      this.serviceCharge = serviceCharge;
      return this;
    }

    public Builder serviceCharge(Double serviceCharge) {
      this.serviceCharge = Optional.of(serviceCharge);
      return this;
    }

    @JsonSetter(value = "amount_settled", nulls = Nulls.SKIP)
    public Builder amountSettled(Optional<Double> amountSettled) {
      this.amountSettled = amountSettled;
      return this;
    }

    public Builder amountSettled(Double amountSettled) {
      this.amountSettled = Optional.of(amountSettled);
      return this;
    }

    @JsonSetter(value = "payment_from", nulls = Nulls.SKIP)
    public Builder paymentFrom(Optional<String> paymentFrom) {
      this.paymentFrom = paymentFrom;
      return this;
    }

    public Builder paymentFrom(String paymentFrom) {
      this.paymentFrom = Optional.of(paymentFrom);
      return this;
    }

    @JsonSetter(value = "payment_till", nulls = Nulls.SKIP)
    public Builder paymentTill(Optional<String> paymentTill) {
      this.paymentTill = paymentTill;
      return this;
    }

    public Builder paymentTill(String paymentTill) {
      this.paymentTill = Optional.of(paymentTill);
      return this;
    }

    @JsonSetter(value = "reason", nulls = Nulls.SKIP)
    public Builder reason(Optional<String> reason) {
      this.reason = reason;
      return this;
    }

    public Builder reason(String reason) {
      this.reason = Optional.of(reason);
      return this;
    }

    @JsonSetter(value = "settlement_initiated_on", nulls = Nulls.SKIP)
    public Builder settlementInitiatedOn(Optional<String> settlementInitiatedOn) {
      this.settlementInitiatedOn = settlementInitiatedOn;
      return this;
    }

    public Builder settlementInitiatedOn(String settlementInitiatedOn) {
      this.settlementInitiatedOn = Optional.of(settlementInitiatedOn);
      return this;
    }

    @JsonSetter(value = "settlement_type", nulls = Nulls.SKIP)
    public Builder settlementType(Optional<String> settlementType) {
      this.settlementType = settlementType;
      return this;
    }

    public Builder settlementType(String settlementType) {
      this.settlementType = Optional.of(settlementType);
      return this;
    }

    @JsonSetter(value = "settlement_charge", nulls = Nulls.SKIP)
    public Builder settlementCharge(Optional<Double> settlementCharge) {
      this.settlementCharge = settlementCharge;
      return this;
    }

    public Builder settlementCharge(Double settlementCharge) {
      this.settlementCharge = Optional.of(settlementCharge);
      return this;
    }

    @JsonSetter(value = "settlement_tax", nulls = Nulls.SKIP)
    public Builder settlementTax(Optional<Double> settlementTax) {
      this.settlementTax = settlementTax;
      return this;
    }

    public Builder settlementTax(Double settlementTax) {
      this.settlementTax = Optional.of(settlementTax);
      return this;
    }

    @JsonSetter(value = "remarks", nulls = Nulls.SKIP)
    public Builder remarks(Optional<String> remarks) {
      this.remarks = remarks;
      return this;
    }

    public Builder remarks(String remarks) {
      this.remarks = Optional.of(remarks);
      return this;
    }

    public FetchSettlementDataItem build() {
      return new FetchSettlementDataItem(
          eventType,
          cfSettlementId,
          status,
          settlementDate,
          paymentAmount,
          settlementUtr,
          adjustment,
          serviceTax,
          serviceCharge,
          amountSettled,
          paymentFrom,
          paymentTill,
          reason,
          settlementInitiatedOn,
          settlementType,
          settlementCharge,
          settlementTax,
          remarks);
    }
  }
}
