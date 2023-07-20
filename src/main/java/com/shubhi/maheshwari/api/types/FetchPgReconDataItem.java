package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchPgReconDataItem.Builder.class)
public final class FetchPgReconDataItem {
  private final Optional<String> eventId;

  private final Optional<String> eventType;

  private final Optional<Double> eventSettlementAmount;

  private final Optional<Double> eventAmount;

  private final Optional<String> saleType;

  private final Optional<String> eventStatus;

  private final Optional<String> entity;

  private final Optional<String> eventTime;

  private final Optional<String> eventCurrency;

  private final Optional<String> orderId;

  private final Optional<Double> orderAmount;

  private final Optional<String> customerPhone;

  private final Optional<String> customerEmail;

  private final Optional<String> customerName;

  private final Optional<Double> paymentAmount;

  private final Optional<String> paymentUtr;

  private final Optional<String> paymentTime;

  private final Optional<Double> paymentServiceCharge;

  private final Optional<Double> paymentServiceTax;

  private final Optional<Integer> cfPaymentId;

  private final Optional<Integer> cfSettlementId;

  private final Optional<String> settlementDate;

  private final Optional<String> settlementUtr;

  private final Optional<Double> splitServiceCharge;

  private final Optional<Double> splitServiceTax;

  private final Optional<Double> vendorCommission;

  private final Optional<String> closedInFavorOf;

  private final Optional<String> disputeResolvedOn;

  private final Optional<String> disputeCategory;

  private final Optional<String> disputeNote;

  private final Optional<String> refundProcessedAt;

  private final Optional<String> refundArn;

  private final Optional<String> refundNote;

  private final Optional<String> refundId;

  private final Optional<String> adjustmentRemarks;

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

  FetchPgReconDataItem(
      Optional<String> eventId,
      Optional<String> eventType,
      Optional<Double> eventSettlementAmount,
      Optional<Double> eventAmount,
      Optional<String> saleType,
      Optional<String> eventStatus,
      Optional<String> entity,
      Optional<String> eventTime,
      Optional<String> eventCurrency,
      Optional<String> orderId,
      Optional<Double> orderAmount,
      Optional<String> customerPhone,
      Optional<String> customerEmail,
      Optional<String> customerName,
      Optional<Double> paymentAmount,
      Optional<String> paymentUtr,
      Optional<String> paymentTime,
      Optional<Double> paymentServiceCharge,
      Optional<Double> paymentServiceTax,
      Optional<Integer> cfPaymentId,
      Optional<Integer> cfSettlementId,
      Optional<String> settlementDate,
      Optional<String> settlementUtr,
      Optional<Double> splitServiceCharge,
      Optional<Double> splitServiceTax,
      Optional<Double> vendorCommission,
      Optional<String> closedInFavorOf,
      Optional<String> disputeResolvedOn,
      Optional<String> disputeCategory,
      Optional<String> disputeNote,
      Optional<String> refundProcessedAt,
      Optional<String> refundArn,
      Optional<String> refundNote,
      Optional<String> refundId,
      Optional<String> adjustmentRemarks,
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
    this.eventId = eventId;
    this.eventType = eventType;
    this.eventSettlementAmount = eventSettlementAmount;
    this.eventAmount = eventAmount;
    this.saleType = saleType;
    this.eventStatus = eventStatus;
    this.entity = entity;
    this.eventTime = eventTime;
    this.eventCurrency = eventCurrency;
    this.orderId = orderId;
    this.orderAmount = orderAmount;
    this.customerPhone = customerPhone;
    this.customerEmail = customerEmail;
    this.customerName = customerName;
    this.paymentAmount = paymentAmount;
    this.paymentUtr = paymentUtr;
    this.paymentTime = paymentTime;
    this.paymentServiceCharge = paymentServiceCharge;
    this.paymentServiceTax = paymentServiceTax;
    this.cfPaymentId = cfPaymentId;
    this.cfSettlementId = cfSettlementId;
    this.settlementDate = settlementDate;
    this.settlementUtr = settlementUtr;
    this.splitServiceCharge = splitServiceCharge;
    this.splitServiceTax = splitServiceTax;
    this.vendorCommission = vendorCommission;
    this.closedInFavorOf = closedInFavorOf;
    this.disputeResolvedOn = disputeResolvedOn;
    this.disputeCategory = disputeCategory;
    this.disputeNote = disputeNote;
    this.refundProcessedAt = refundProcessedAt;
    this.refundArn = refundArn;
    this.refundNote = refundNote;
    this.refundId = refundId;
    this.adjustmentRemarks = adjustmentRemarks;
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
   * @return Unique ID associated with the event.
   */
  @JsonProperty("event_id")
  public Optional<String> getEventId() {
    return eventId;
  }

  /**
   * @return The event type can be SETTLEMENT, PAYMENT, REFUND, REFUND_REVERSAL, DISPUTE,
   *     DISPUTE_REVERSAL, CHARGEBACK, CHARGEBACK_REVERSAL, OTHER_ADJUSTMENT.
   */
  @JsonProperty("event_type")
  public Optional<String> getEventType() {
    return eventType;
  }

  /**
   * @return Amount that is part of the settlement corresponding to the event.
   */
  @JsonProperty("event_settlement_amount")
  public Optional<Double> getEventSettlementAmount() {
    return eventSettlementAmount;
  }

  /**
   * @return Amount of the event. Example, refund amount, dispute amount, payment amount, etc.
   */
  @JsonProperty("event_amount")
  public Optional<Double> getEventAmount() {
    return eventAmount;
  }

  /**
   * @return Indicates if it is CREDIT/DEBIT sale.
   */
  @JsonProperty("sale_type")
  public Optional<String> getSaleType() {
    return saleType;
  }

  /**
   * @return Status of the event. Example - SUCCESS, FAILED, PENDING, CANCELLED.
   */
  @JsonProperty("event_status")
  public Optional<String> getEventStatus() {
    return eventStatus;
  }

  /**
   * @return Recon
   */
  @JsonProperty("entity")
  public Optional<String> getEntity() {
    return entity;
  }

  /**
   * @return Time associated with the event. Example, transaction time, dispute initiation time
   */
  @JsonProperty("event_time")
  public Optional<String> getEventTime() {
    return eventTime;
  }

  /**
   * @return Curreny type - INR.
   */
  @JsonProperty("event_currency")
  public Optional<String> getEventCurrency() {
    return eventCurrency;
  }

  /**
   * @return Unique order ID. Alphanumeric and only '-' and '_' allowed.
   */
  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  /**
   * @return The amount which was passed at the order creation time.
   */
  @JsonProperty("order_amount")
  public Optional<Double> getOrderAmount() {
    return orderAmount;
  }

  /**
   * @return Customer phone number.
   */
  @JsonProperty("customer_phone")
  public Optional<String> getCustomerPhone() {
    return customerPhone;
  }

  /**
   * @return Customer email.
   */
  @JsonProperty("customer_email")
  public Optional<String> getCustomerEmail() {
    return customerEmail;
  }

  /**
   * @return Customer name.
   */
  @JsonProperty("customer_name")
  public Optional<String> getCustomerName() {
    return customerName;
  }

  /**
   * @return Payment amount captured.
   */
  @JsonProperty("payment_amount")
  public Optional<Double> getPaymentAmount() {
    return paymentAmount;
  }

  /**
   * @return Unique transaction reference number of the payment.
   */
  @JsonProperty("payment_utr")
  public Optional<String> getPaymentUtr() {
    return paymentUtr;
  }

  /**
   * @return Date and time when the payment was initiated.
   */
  @JsonProperty("payment_time")
  public Optional<String> getPaymentTime() {
    return paymentTime;
  }

  /**
   * @return Service charge applicable for the payment.
   */
  @JsonProperty("payment_service_charge")
  public Optional<Double> getPaymentServiceCharge() {
    return paymentServiceCharge;
  }

  /**
   * @return Service tax applicable on the payment.
   */
  @JsonProperty("payment_service_tax")
  public Optional<Double> getPaymentServiceTax() {
    return paymentServiceTax;
  }

  /**
   * @return Cashfree Payments unique ID to identify a payment.
   */
  @JsonProperty("cf_payment_id")
  public Optional<Integer> getCfPaymentId() {
    return cfPaymentId;
  }

  /**
   * @return Unique ID to identify the settlement.
   */
  @JsonProperty("cf_settlement_id")
  public Optional<Integer> getCfSettlementId() {
    return cfSettlementId;
  }

  /**
   * @return Date and time when the settlement was processed.
   */
  @JsonProperty("settlement_date")
  public Optional<String> getSettlementDate() {
    return settlementDate;
  }

  /**
   * @return Unique transaction reference number of the settlement.
   */
  @JsonProperty("settlement_utr")
  public Optional<String> getSettlementUtr() {
    return settlementUtr;
  }

  /**
   * @return Service charge that is applicable for splitting the payment.
   */
  @JsonProperty("split_service_charge")
  public Optional<Double> getSplitServiceCharge() {
    return splitServiceCharge;
  }

  /**
   * @return Service tax applicable for splitting the amount to vendors.
   */
  @JsonProperty("split_service_tax")
  public Optional<Double> getSplitServiceTax() {
    return splitServiceTax;
  }

  /**
   * @return Vendor commission applicable for this transaction.
   */
  @JsonProperty("vendor_commission")
  public Optional<Double> getVendorCommission() {
    return vendorCommission;
  }

  /**
   * @return Specifies whether the dispute was closed in favor of the merchant or customer. /n
   *     Possible values - Merchant, Customer
   */
  @JsonProperty("closed_in_favor_of")
  public Optional<String> getClosedInFavorOf() {
    return closedInFavorOf;
  }

  /**
   * @return Date and time when the dispute was resolved.
   */
  @JsonProperty("dispute_resolved_on")
  public Optional<String> getDisputeResolvedOn() {
    return disputeResolvedOn;
  }

  /**
   * @return Category of the dispute - Dispute code and the reason for dispute is shown.
   */
  @JsonProperty("dispute_category")
  public Optional<String> getDisputeCategory() {
    return disputeCategory;
  }

  /**
   * @return Note regarding the dispute.
   */
  @JsonProperty("dispute_note")
  public Optional<String> getDisputeNote() {
    return disputeNote;
  }

  /**
   * @return Date and time when the refund was processed.
   */
  @JsonProperty("refund_processed_at")
  public Optional<String> getRefundProcessedAt() {
    return refundProcessedAt;
  }

  /**
   * @return The bank reference number for the refund.
   */
  @JsonProperty("refund_arn")
  public Optional<String> getRefundArn() {
    return refundArn;
  }

  /**
   * @return A refund note for your reference.
   */
  @JsonProperty("refund_note")
  public Optional<String> getRefundNote() {
    return refundNote;
  }

  /**
   * @return An unique ID to associate the refund with.
   */
  @JsonProperty("refund_id")
  public Optional<String> getRefundId() {
    return refundId;
  }

  /**
   * @return Other adjustment remarks.
   */
  @JsonProperty("adjustment_remarks")
  public Optional<String> getAdjustmentRemarks() {
    return adjustmentRemarks;
  }

  /**
   * @return Amount that is adjusted from the settlement amount because of any credit/debit event
   *     such as refund, refund_reverse etc.
   */
  @JsonProperty("adjustment")
  public Optional<Double> getAdjustment() {
    return adjustment;
  }

  /**
   * @return Service tax applicable on the settlement amount.
   */
  @JsonProperty("service_tax")
  public Optional<Double> getServiceTax() {
    return serviceTax;
  }

  /**
   * @return Service charge applicable on the settlement amount.
   */
  @JsonProperty("service_charge")
  public Optional<Double> getServiceCharge() {
    return serviceCharge;
  }

  /**
   * @return Net amount that is settled after considering the adjustments, settlement charge and
   *     tax.
   */
  @JsonProperty("amount_settled")
  public Optional<Double> getAmountSettled() {
    return amountSettled;
  }

  /**
   * @return The start time of the time range of the payments considered for the settlement.
   */
  @JsonProperty("payment_from")
  public Optional<String> getPaymentFrom() {
    return paymentFrom;
  }

  /**
   * @return The end time of time range of the payments considered for the settlement.
   */
  @JsonProperty("payment_till")
  public Optional<String> getPaymentTill() {
    return paymentTill;
  }

  /**
   * @return Reason for settlement failure.
   */
  @JsonProperty("reason")
  public Optional<String> getReason() {
    return reason;
  }

  /**
   * @return Date and time when the settlement was initiated.
   */
  @JsonProperty("settlement_initiated_on")
  public Optional<String> getSettlementInitiatedOn() {
    return settlementInitiatedOn;
  }

  /**
   * @return Type of settlement. Possible values - Standard, Instant, On demand.
   */
  @JsonProperty("settlement_type")
  public Optional<String> getSettlementType() {
    return settlementType;
  }

  /**
   * @return Settlement charges applicable on the settlement.
   */
  @JsonProperty("settlement_charge")
  public Optional<Double> getSettlementCharge() {
    return settlementCharge;
  }

  /**
   * @return Settlement tax applicable on the settlement.
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
    return other instanceof FetchPgReconDataItem && equalTo((FetchPgReconDataItem) other);
  }

  private boolean equalTo(FetchPgReconDataItem other) {
    return eventId.equals(other.eventId)
        && eventType.equals(other.eventType)
        && eventSettlementAmount.equals(other.eventSettlementAmount)
        && eventAmount.equals(other.eventAmount)
        && saleType.equals(other.saleType)
        && eventStatus.equals(other.eventStatus)
        && entity.equals(other.entity)
        && eventTime.equals(other.eventTime)
        && eventCurrency.equals(other.eventCurrency)
        && orderId.equals(other.orderId)
        && orderAmount.equals(other.orderAmount)
        && customerPhone.equals(other.customerPhone)
        && customerEmail.equals(other.customerEmail)
        && customerName.equals(other.customerName)
        && paymentAmount.equals(other.paymentAmount)
        && paymentUtr.equals(other.paymentUtr)
        && paymentTime.equals(other.paymentTime)
        && paymentServiceCharge.equals(other.paymentServiceCharge)
        && paymentServiceTax.equals(other.paymentServiceTax)
        && cfPaymentId.equals(other.cfPaymentId)
        && cfSettlementId.equals(other.cfSettlementId)
        && settlementDate.equals(other.settlementDate)
        && settlementUtr.equals(other.settlementUtr)
        && splitServiceCharge.equals(other.splitServiceCharge)
        && splitServiceTax.equals(other.splitServiceTax)
        && vendorCommission.equals(other.vendorCommission)
        && closedInFavorOf.equals(other.closedInFavorOf)
        && disputeResolvedOn.equals(other.disputeResolvedOn)
        && disputeCategory.equals(other.disputeCategory)
        && disputeNote.equals(other.disputeNote)
        && refundProcessedAt.equals(other.refundProcessedAt)
        && refundArn.equals(other.refundArn)
        && refundNote.equals(other.refundNote)
        && refundId.equals(other.refundId)
        && adjustmentRemarks.equals(other.adjustmentRemarks)
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
              this.eventId,
              this.eventType,
              this.eventSettlementAmount,
              this.eventAmount,
              this.saleType,
              this.eventStatus,
              this.entity,
              this.eventTime,
              this.eventCurrency,
              this.orderId,
              this.orderAmount,
              this.customerPhone,
              this.customerEmail,
              this.customerName,
              this.paymentAmount,
              this.paymentUtr,
              this.paymentTime,
              this.paymentServiceCharge,
              this.paymentServiceTax,
              this.cfPaymentId,
              this.cfSettlementId,
              this.settlementDate,
              this.settlementUtr,
              this.splitServiceCharge,
              this.splitServiceTax,
              this.vendorCommission,
              this.closedInFavorOf,
              this.disputeResolvedOn,
              this.disputeCategory,
              this.disputeNote,
              this.refundProcessedAt,
              this.refundArn,
              this.refundNote,
              this.refundId,
              this.adjustmentRemarks,
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
    return "FetchPgReconDataItem{"
        + "eventId: "
        + eventId
        + ", eventType: "
        + eventType
        + ", eventSettlementAmount: "
        + eventSettlementAmount
        + ", eventAmount: "
        + eventAmount
        + ", saleType: "
        + saleType
        + ", eventStatus: "
        + eventStatus
        + ", entity: "
        + entity
        + ", eventTime: "
        + eventTime
        + ", eventCurrency: "
        + eventCurrency
        + ", orderId: "
        + orderId
        + ", orderAmount: "
        + orderAmount
        + ", customerPhone: "
        + customerPhone
        + ", customerEmail: "
        + customerEmail
        + ", customerName: "
        + customerName
        + ", paymentAmount: "
        + paymentAmount
        + ", paymentUtr: "
        + paymentUtr
        + ", paymentTime: "
        + paymentTime
        + ", paymentServiceCharge: "
        + paymentServiceCharge
        + ", paymentServiceTax: "
        + paymentServiceTax
        + ", cfPaymentId: "
        + cfPaymentId
        + ", cfSettlementId: "
        + cfSettlementId
        + ", settlementDate: "
        + settlementDate
        + ", settlementUtr: "
        + settlementUtr
        + ", splitServiceCharge: "
        + splitServiceCharge
        + ", splitServiceTax: "
        + splitServiceTax
        + ", vendorCommission: "
        + vendorCommission
        + ", closedInFavorOf: "
        + closedInFavorOf
        + ", disputeResolvedOn: "
        + disputeResolvedOn
        + ", disputeCategory: "
        + disputeCategory
        + ", disputeNote: "
        + disputeNote
        + ", refundProcessedAt: "
        + refundProcessedAt
        + ", refundArn: "
        + refundArn
        + ", refundNote: "
        + refundNote
        + ", refundId: "
        + refundId
        + ", adjustmentRemarks: "
        + adjustmentRemarks
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
    private Optional<String> eventId = Optional.empty();

    private Optional<String> eventType = Optional.empty();

    private Optional<Double> eventSettlementAmount = Optional.empty();

    private Optional<Double> eventAmount = Optional.empty();

    private Optional<String> saleType = Optional.empty();

    private Optional<String> eventStatus = Optional.empty();

    private Optional<String> entity = Optional.empty();

    private Optional<String> eventTime = Optional.empty();

    private Optional<String> eventCurrency = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Optional<Double> orderAmount = Optional.empty();

    private Optional<String> customerPhone = Optional.empty();

    private Optional<String> customerEmail = Optional.empty();

    private Optional<String> customerName = Optional.empty();

    private Optional<Double> paymentAmount = Optional.empty();

    private Optional<String> paymentUtr = Optional.empty();

    private Optional<String> paymentTime = Optional.empty();

    private Optional<Double> paymentServiceCharge = Optional.empty();

    private Optional<Double> paymentServiceTax = Optional.empty();

    private Optional<Integer> cfPaymentId = Optional.empty();

    private Optional<Integer> cfSettlementId = Optional.empty();

    private Optional<String> settlementDate = Optional.empty();

    private Optional<String> settlementUtr = Optional.empty();

    private Optional<Double> splitServiceCharge = Optional.empty();

    private Optional<Double> splitServiceTax = Optional.empty();

    private Optional<Double> vendorCommission = Optional.empty();

    private Optional<String> closedInFavorOf = Optional.empty();

    private Optional<String> disputeResolvedOn = Optional.empty();

    private Optional<String> disputeCategory = Optional.empty();

    private Optional<String> disputeNote = Optional.empty();

    private Optional<String> refundProcessedAt = Optional.empty();

    private Optional<String> refundArn = Optional.empty();

    private Optional<String> refundNote = Optional.empty();

    private Optional<String> refundId = Optional.empty();

    private Optional<String> adjustmentRemarks = Optional.empty();

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

    public Builder from(FetchPgReconDataItem other) {
      eventId(other.getEventId());
      eventType(other.getEventType());
      eventSettlementAmount(other.getEventSettlementAmount());
      eventAmount(other.getEventAmount());
      saleType(other.getSaleType());
      eventStatus(other.getEventStatus());
      entity(other.getEntity());
      eventTime(other.getEventTime());
      eventCurrency(other.getEventCurrency());
      orderId(other.getOrderId());
      orderAmount(other.getOrderAmount());
      customerPhone(other.getCustomerPhone());
      customerEmail(other.getCustomerEmail());
      customerName(other.getCustomerName());
      paymentAmount(other.getPaymentAmount());
      paymentUtr(other.getPaymentUtr());
      paymentTime(other.getPaymentTime());
      paymentServiceCharge(other.getPaymentServiceCharge());
      paymentServiceTax(other.getPaymentServiceTax());
      cfPaymentId(other.getCfPaymentId());
      cfSettlementId(other.getCfSettlementId());
      settlementDate(other.getSettlementDate());
      settlementUtr(other.getSettlementUtr());
      splitServiceCharge(other.getSplitServiceCharge());
      splitServiceTax(other.getSplitServiceTax());
      vendorCommission(other.getVendorCommission());
      closedInFavorOf(other.getClosedInFavorOf());
      disputeResolvedOn(other.getDisputeResolvedOn());
      disputeCategory(other.getDisputeCategory());
      disputeNote(other.getDisputeNote());
      refundProcessedAt(other.getRefundProcessedAt());
      refundArn(other.getRefundArn());
      refundNote(other.getRefundNote());
      refundId(other.getRefundId());
      adjustmentRemarks(other.getAdjustmentRemarks());
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

    @JsonSetter(value = "event_id", nulls = Nulls.SKIP)
    public Builder eventId(Optional<String> eventId) {
      this.eventId = eventId;
      return this;
    }

    public Builder eventId(String eventId) {
      this.eventId = Optional.of(eventId);
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

    @JsonSetter(value = "event_settlement_amount", nulls = Nulls.SKIP)
    public Builder eventSettlementAmount(Optional<Double> eventSettlementAmount) {
      this.eventSettlementAmount = eventSettlementAmount;
      return this;
    }

    public Builder eventSettlementAmount(Double eventSettlementAmount) {
      this.eventSettlementAmount = Optional.of(eventSettlementAmount);
      return this;
    }

    @JsonSetter(value = "event_amount", nulls = Nulls.SKIP)
    public Builder eventAmount(Optional<Double> eventAmount) {
      this.eventAmount = eventAmount;
      return this;
    }

    public Builder eventAmount(Double eventAmount) {
      this.eventAmount = Optional.of(eventAmount);
      return this;
    }

    @JsonSetter(value = "sale_type", nulls = Nulls.SKIP)
    public Builder saleType(Optional<String> saleType) {
      this.saleType = saleType;
      return this;
    }

    public Builder saleType(String saleType) {
      this.saleType = Optional.of(saleType);
      return this;
    }

    @JsonSetter(value = "event_status", nulls = Nulls.SKIP)
    public Builder eventStatus(Optional<String> eventStatus) {
      this.eventStatus = eventStatus;
      return this;
    }

    public Builder eventStatus(String eventStatus) {
      this.eventStatus = Optional.of(eventStatus);
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

    @JsonSetter(value = "event_time", nulls = Nulls.SKIP)
    public Builder eventTime(Optional<String> eventTime) {
      this.eventTime = eventTime;
      return this;
    }

    public Builder eventTime(String eventTime) {
      this.eventTime = Optional.of(eventTime);
      return this;
    }

    @JsonSetter(value = "event_currency", nulls = Nulls.SKIP)
    public Builder eventCurrency(Optional<String> eventCurrency) {
      this.eventCurrency = eventCurrency;
      return this;
    }

    public Builder eventCurrency(String eventCurrency) {
      this.eventCurrency = Optional.of(eventCurrency);
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

    @JsonSetter(value = "order_amount", nulls = Nulls.SKIP)
    public Builder orderAmount(Optional<Double> orderAmount) {
      this.orderAmount = orderAmount;
      return this;
    }

    public Builder orderAmount(Double orderAmount) {
      this.orderAmount = Optional.of(orderAmount);
      return this;
    }

    @JsonSetter(value = "customer_phone", nulls = Nulls.SKIP)
    public Builder customerPhone(Optional<String> customerPhone) {
      this.customerPhone = customerPhone;
      return this;
    }

    public Builder customerPhone(String customerPhone) {
      this.customerPhone = Optional.of(customerPhone);
      return this;
    }

    @JsonSetter(value = "customer_email", nulls = Nulls.SKIP)
    public Builder customerEmail(Optional<String> customerEmail) {
      this.customerEmail = customerEmail;
      return this;
    }

    public Builder customerEmail(String customerEmail) {
      this.customerEmail = Optional.of(customerEmail);
      return this;
    }

    @JsonSetter(value = "customer_name", nulls = Nulls.SKIP)
    public Builder customerName(Optional<String> customerName) {
      this.customerName = customerName;
      return this;
    }

    public Builder customerName(String customerName) {
      this.customerName = Optional.of(customerName);
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

    @JsonSetter(value = "payment_utr", nulls = Nulls.SKIP)
    public Builder paymentUtr(Optional<String> paymentUtr) {
      this.paymentUtr = paymentUtr;
      return this;
    }

    public Builder paymentUtr(String paymentUtr) {
      this.paymentUtr = Optional.of(paymentUtr);
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

    @JsonSetter(value = "payment_service_charge", nulls = Nulls.SKIP)
    public Builder paymentServiceCharge(Optional<Double> paymentServiceCharge) {
      this.paymentServiceCharge = paymentServiceCharge;
      return this;
    }

    public Builder paymentServiceCharge(Double paymentServiceCharge) {
      this.paymentServiceCharge = Optional.of(paymentServiceCharge);
      return this;
    }

    @JsonSetter(value = "payment_service_tax", nulls = Nulls.SKIP)
    public Builder paymentServiceTax(Optional<Double> paymentServiceTax) {
      this.paymentServiceTax = paymentServiceTax;
      return this;
    }

    public Builder paymentServiceTax(Double paymentServiceTax) {
      this.paymentServiceTax = Optional.of(paymentServiceTax);
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

    @JsonSetter(value = "cf_settlement_id", nulls = Nulls.SKIP)
    public Builder cfSettlementId(Optional<Integer> cfSettlementId) {
      this.cfSettlementId = cfSettlementId;
      return this;
    }

    public Builder cfSettlementId(Integer cfSettlementId) {
      this.cfSettlementId = Optional.of(cfSettlementId);
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

    @JsonSetter(value = "settlement_utr", nulls = Nulls.SKIP)
    public Builder settlementUtr(Optional<String> settlementUtr) {
      this.settlementUtr = settlementUtr;
      return this;
    }

    public Builder settlementUtr(String settlementUtr) {
      this.settlementUtr = Optional.of(settlementUtr);
      return this;
    }

    @JsonSetter(value = "split_service_charge", nulls = Nulls.SKIP)
    public Builder splitServiceCharge(Optional<Double> splitServiceCharge) {
      this.splitServiceCharge = splitServiceCharge;
      return this;
    }

    public Builder splitServiceCharge(Double splitServiceCharge) {
      this.splitServiceCharge = Optional.of(splitServiceCharge);
      return this;
    }

    @JsonSetter(value = "split_service_tax", nulls = Nulls.SKIP)
    public Builder splitServiceTax(Optional<Double> splitServiceTax) {
      this.splitServiceTax = splitServiceTax;
      return this;
    }

    public Builder splitServiceTax(Double splitServiceTax) {
      this.splitServiceTax = Optional.of(splitServiceTax);
      return this;
    }

    @JsonSetter(value = "vendor_commission", nulls = Nulls.SKIP)
    public Builder vendorCommission(Optional<Double> vendorCommission) {
      this.vendorCommission = vendorCommission;
      return this;
    }

    public Builder vendorCommission(Double vendorCommission) {
      this.vendorCommission = Optional.of(vendorCommission);
      return this;
    }

    @JsonSetter(value = "closed_in_favor_of", nulls = Nulls.SKIP)
    public Builder closedInFavorOf(Optional<String> closedInFavorOf) {
      this.closedInFavorOf = closedInFavorOf;
      return this;
    }

    public Builder closedInFavorOf(String closedInFavorOf) {
      this.closedInFavorOf = Optional.of(closedInFavorOf);
      return this;
    }

    @JsonSetter(value = "dispute_resolved_on", nulls = Nulls.SKIP)
    public Builder disputeResolvedOn(Optional<String> disputeResolvedOn) {
      this.disputeResolvedOn = disputeResolvedOn;
      return this;
    }

    public Builder disputeResolvedOn(String disputeResolvedOn) {
      this.disputeResolvedOn = Optional.of(disputeResolvedOn);
      return this;
    }

    @JsonSetter(value = "dispute_category", nulls = Nulls.SKIP)
    public Builder disputeCategory(Optional<String> disputeCategory) {
      this.disputeCategory = disputeCategory;
      return this;
    }

    public Builder disputeCategory(String disputeCategory) {
      this.disputeCategory = Optional.of(disputeCategory);
      return this;
    }

    @JsonSetter(value = "dispute_note", nulls = Nulls.SKIP)
    public Builder disputeNote(Optional<String> disputeNote) {
      this.disputeNote = disputeNote;
      return this;
    }

    public Builder disputeNote(String disputeNote) {
      this.disputeNote = Optional.of(disputeNote);
      return this;
    }

    @JsonSetter(value = "refund_processed_at", nulls = Nulls.SKIP)
    public Builder refundProcessedAt(Optional<String> refundProcessedAt) {
      this.refundProcessedAt = refundProcessedAt;
      return this;
    }

    public Builder refundProcessedAt(String refundProcessedAt) {
      this.refundProcessedAt = Optional.of(refundProcessedAt);
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

    @JsonSetter(value = "refund_note", nulls = Nulls.SKIP)
    public Builder refundNote(Optional<String> refundNote) {
      this.refundNote = refundNote;
      return this;
    }

    public Builder refundNote(String refundNote) {
      this.refundNote = Optional.of(refundNote);
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

    @JsonSetter(value = "adjustment_remarks", nulls = Nulls.SKIP)
    public Builder adjustmentRemarks(Optional<String> adjustmentRemarks) {
      this.adjustmentRemarks = adjustmentRemarks;
      return this;
    }

    public Builder adjustmentRemarks(String adjustmentRemarks) {
      this.adjustmentRemarks = Optional.of(adjustmentRemarks);
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

    public FetchPgReconDataItem build() {
      return new FetchPgReconDataItem(
          eventId,
          eventType,
          eventSettlementAmount,
          eventAmount,
          saleType,
          eventStatus,
          entity,
          eventTime,
          eventCurrency,
          orderId,
          orderAmount,
          customerPhone,
          customerEmail,
          customerName,
          paymentAmount,
          paymentUtr,
          paymentTime,
          paymentServiceCharge,
          paymentServiceTax,
          cfPaymentId,
          cfSettlementId,
          settlementDate,
          settlementUtr,
          splitServiceCharge,
          splitServiceTax,
          vendorCommission,
          closedInFavorOf,
          disputeResolvedOn,
          disputeCategory,
          disputeNote,
          refundProcessedAt,
          refundArn,
          refundNote,
          refundId,
          adjustmentRemarks,
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
