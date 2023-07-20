package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LinkOrdersResponse.Builder.class)
public final class LinkOrdersResponse {
  private final Optional<Integer> cfOrderId;

  private final Optional<String> orderId;

  private final Optional<String> entity;

  private final Optional<String> orderCurrency;

  private final Optional<Double> orderAmount;

  private final Optional<String> orderStatus;

  private final Optional<String> orderToken;

  private final Optional<String> orderExpiryTime;

  private final Optional<String> orderNote;

  private final Optional<LinkCustomerDetailsEntity> customerDetails;

  private final Optional<PaymentUrlObject> payments;

  private final Optional<SettlementUrlObject> settlements;

  private final Optional<RefundUrlObject> refunds;

  private int _cachedHashCode;

  LinkOrdersResponse(
      Optional<Integer> cfOrderId,
      Optional<String> orderId,
      Optional<String> entity,
      Optional<String> orderCurrency,
      Optional<Double> orderAmount,
      Optional<String> orderStatus,
      Optional<String> orderToken,
      Optional<String> orderExpiryTime,
      Optional<String> orderNote,
      Optional<LinkCustomerDetailsEntity> customerDetails,
      Optional<PaymentUrlObject> payments,
      Optional<SettlementUrlObject> settlements,
      Optional<RefundUrlObject> refunds) {
    this.cfOrderId = cfOrderId;
    this.orderId = orderId;
    this.entity = entity;
    this.orderCurrency = orderCurrency;
    this.orderAmount = orderAmount;
    this.orderStatus = orderStatus;
    this.orderToken = orderToken;
    this.orderExpiryTime = orderExpiryTime;
    this.orderNote = orderNote;
    this.customerDetails = customerDetails;
    this.payments = payments;
    this.settlements = settlements;
    this.refunds = refunds;
  }

  @JsonProperty("cf_order_id")
  public Optional<Integer> getCfOrderId() {
    return cfOrderId;
  }

  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  @JsonProperty("entity")
  public Optional<String> getEntity() {
    return entity;
  }

  @JsonProperty("order_currency")
  public Optional<String> getOrderCurrency() {
    return orderCurrency;
  }

  @JsonProperty("order_amount")
  public Optional<Double> getOrderAmount() {
    return orderAmount;
  }

  @JsonProperty("order_status")
  public Optional<String> getOrderStatus() {
    return orderStatus;
  }

  @JsonProperty("order_token")
  public Optional<String> getOrderToken() {
    return orderToken;
  }

  @JsonProperty("order_expiry_time")
  public Optional<String> getOrderExpiryTime() {
    return orderExpiryTime;
  }

  @JsonProperty("order_note")
  public Optional<String> getOrderNote() {
    return orderNote;
  }

  @JsonProperty("customer_details")
  public Optional<LinkCustomerDetailsEntity> getCustomerDetails() {
    return customerDetails;
  }

  @JsonProperty("payments")
  public Optional<PaymentUrlObject> getPayments() {
    return payments;
  }

  @JsonProperty("settlements")
  public Optional<SettlementUrlObject> getSettlements() {
    return settlements;
  }

  @JsonProperty("refunds")
  public Optional<RefundUrlObject> getRefunds() {
    return refunds;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LinkOrdersResponse && equalTo((LinkOrdersResponse) other);
  }

  private boolean equalTo(LinkOrdersResponse other) {
    return cfOrderId.equals(other.cfOrderId)
        && orderId.equals(other.orderId)
        && entity.equals(other.entity)
        && orderCurrency.equals(other.orderCurrency)
        && orderAmount.equals(other.orderAmount)
        && orderStatus.equals(other.orderStatus)
        && orderToken.equals(other.orderToken)
        && orderExpiryTime.equals(other.orderExpiryTime)
        && orderNote.equals(other.orderNote)
        && customerDetails.equals(other.customerDetails)
        && payments.equals(other.payments)
        && settlements.equals(other.settlements)
        && refunds.equals(other.refunds);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cfOrderId,
              this.orderId,
              this.entity,
              this.orderCurrency,
              this.orderAmount,
              this.orderStatus,
              this.orderToken,
              this.orderExpiryTime,
              this.orderNote,
              this.customerDetails,
              this.payments,
              this.settlements,
              this.refunds);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinkOrdersResponse{"
        + "cfOrderId: "
        + cfOrderId
        + ", orderId: "
        + orderId
        + ", entity: "
        + entity
        + ", orderCurrency: "
        + orderCurrency
        + ", orderAmount: "
        + orderAmount
        + ", orderStatus: "
        + orderStatus
        + ", orderToken: "
        + orderToken
        + ", orderExpiryTime: "
        + orderExpiryTime
        + ", orderNote: "
        + orderNote
        + ", customerDetails: "
        + customerDetails
        + ", payments: "
        + payments
        + ", settlements: "
        + settlements
        + ", refunds: "
        + refunds
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> cfOrderId = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Optional<String> entity = Optional.empty();

    private Optional<String> orderCurrency = Optional.empty();

    private Optional<Double> orderAmount = Optional.empty();

    private Optional<String> orderStatus = Optional.empty();

    private Optional<String> orderToken = Optional.empty();

    private Optional<String> orderExpiryTime = Optional.empty();

    private Optional<String> orderNote = Optional.empty();

    private Optional<LinkCustomerDetailsEntity> customerDetails = Optional.empty();

    private Optional<PaymentUrlObject> payments = Optional.empty();

    private Optional<SettlementUrlObject> settlements = Optional.empty();

    private Optional<RefundUrlObject> refunds = Optional.empty();

    private Builder() {}

    public Builder from(LinkOrdersResponse other) {
      cfOrderId(other.getCfOrderId());
      orderId(other.getOrderId());
      entity(other.getEntity());
      orderCurrency(other.getOrderCurrency());
      orderAmount(other.getOrderAmount());
      orderStatus(other.getOrderStatus());
      orderToken(other.getOrderToken());
      orderExpiryTime(other.getOrderExpiryTime());
      orderNote(other.getOrderNote());
      customerDetails(other.getCustomerDetails());
      payments(other.getPayments());
      settlements(other.getSettlements());
      refunds(other.getRefunds());
      return this;
    }

    @JsonSetter(value = "cf_order_id", nulls = Nulls.SKIP)
    public Builder cfOrderId(Optional<Integer> cfOrderId) {
      this.cfOrderId = cfOrderId;
      return this;
    }

    public Builder cfOrderId(Integer cfOrderId) {
      this.cfOrderId = Optional.of(cfOrderId);
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

    @JsonSetter(value = "order_currency", nulls = Nulls.SKIP)
    public Builder orderCurrency(Optional<String> orderCurrency) {
      this.orderCurrency = orderCurrency;
      return this;
    }

    public Builder orderCurrency(String orderCurrency) {
      this.orderCurrency = Optional.of(orderCurrency);
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

    @JsonSetter(value = "order_status", nulls = Nulls.SKIP)
    public Builder orderStatus(Optional<String> orderStatus) {
      this.orderStatus = orderStatus;
      return this;
    }

    public Builder orderStatus(String orderStatus) {
      this.orderStatus = Optional.of(orderStatus);
      return this;
    }

    @JsonSetter(value = "order_token", nulls = Nulls.SKIP)
    public Builder orderToken(Optional<String> orderToken) {
      this.orderToken = orderToken;
      return this;
    }

    public Builder orderToken(String orderToken) {
      this.orderToken = Optional.of(orderToken);
      return this;
    }

    @JsonSetter(value = "order_expiry_time", nulls = Nulls.SKIP)
    public Builder orderExpiryTime(Optional<String> orderExpiryTime) {
      this.orderExpiryTime = orderExpiryTime;
      return this;
    }

    public Builder orderExpiryTime(String orderExpiryTime) {
      this.orderExpiryTime = Optional.of(orderExpiryTime);
      return this;
    }

    @JsonSetter(value = "order_note", nulls = Nulls.SKIP)
    public Builder orderNote(Optional<String> orderNote) {
      this.orderNote = orderNote;
      return this;
    }

    public Builder orderNote(String orderNote) {
      this.orderNote = Optional.of(orderNote);
      return this;
    }

    @JsonSetter(value = "customer_details", nulls = Nulls.SKIP)
    public Builder customerDetails(Optional<LinkCustomerDetailsEntity> customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    public Builder customerDetails(LinkCustomerDetailsEntity customerDetails) {
      this.customerDetails = Optional.of(customerDetails);
      return this;
    }

    @JsonSetter(value = "payments", nulls = Nulls.SKIP)
    public Builder payments(Optional<PaymentUrlObject> payments) {
      this.payments = payments;
      return this;
    }

    public Builder payments(PaymentUrlObject payments) {
      this.payments = Optional.of(payments);
      return this;
    }

    @JsonSetter(value = "settlements", nulls = Nulls.SKIP)
    public Builder settlements(Optional<SettlementUrlObject> settlements) {
      this.settlements = settlements;
      return this;
    }

    public Builder settlements(SettlementUrlObject settlements) {
      this.settlements = Optional.of(settlements);
      return this;
    }

    @JsonSetter(value = "refunds", nulls = Nulls.SKIP)
    public Builder refunds(Optional<RefundUrlObject> refunds) {
      this.refunds = refunds;
      return this;
    }

    public Builder refunds(RefundUrlObject refunds) {
      this.refunds = Optional.of(refunds);
      return this;
    }

    public LinkOrdersResponse build() {
      return new LinkOrdersResponse(
          cfOrderId,
          orderId,
          entity,
          orderCurrency,
          orderAmount,
          orderStatus,
          orderToken,
          orderExpiryTime,
          orderNote,
          customerDetails,
          payments,
          settlements,
          refunds);
    }
  }
}
