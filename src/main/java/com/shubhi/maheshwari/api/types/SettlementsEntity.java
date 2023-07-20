package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = SettlementsEntity.Builder.class)
public final class SettlementsEntity {
  private final Optional<String> cfPaymentId;

  private final Optional<String> cfSettlementId;

  private final Optional<String> settlementCurrency;

  private final Optional<String> orderId;

  private final Optional<String> entity;

  private final Optional<Double> orderAmount;

  private final Optional<String> paymentTime;

  private final Optional<Double> serviceCharge;

  private final Optional<Double> serviceTax;

  private final Optional<Double> settlementAmount;

  private final Optional<Integer> settlementId;

  private final Optional<Integer> transferId;

  private final Optional<String> transferTime;

  private final Optional<String> transferUtr;

  private int _cachedHashCode;

  SettlementsEntity(
      Optional<String> cfPaymentId,
      Optional<String> cfSettlementId,
      Optional<String> settlementCurrency,
      Optional<String> orderId,
      Optional<String> entity,
      Optional<Double> orderAmount,
      Optional<String> paymentTime,
      Optional<Double> serviceCharge,
      Optional<Double> serviceTax,
      Optional<Double> settlementAmount,
      Optional<Integer> settlementId,
      Optional<Integer> transferId,
      Optional<String> transferTime,
      Optional<String> transferUtr) {
    this.cfPaymentId = cfPaymentId;
    this.cfSettlementId = cfSettlementId;
    this.settlementCurrency = settlementCurrency;
    this.orderId = orderId;
    this.entity = entity;
    this.orderAmount = orderAmount;
    this.paymentTime = paymentTime;
    this.serviceCharge = serviceCharge;
    this.serviceTax = serviceTax;
    this.settlementAmount = settlementAmount;
    this.settlementId = settlementId;
    this.transferId = transferId;
    this.transferTime = transferTime;
    this.transferUtr = transferUtr;
  }

  @JsonProperty("cf_payment_id")
  public Optional<String> getCfPaymentId() {
    return cfPaymentId;
  }

  @JsonProperty("cf_settlement_id")
  public Optional<String> getCfSettlementId() {
    return cfSettlementId;
  }

  @JsonProperty("settlement_currency")
  public Optional<String> getSettlementCurrency() {
    return settlementCurrency;
  }

  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  @JsonProperty("entity")
  public Optional<String> getEntity() {
    return entity;
  }

  @JsonProperty("order_amount")
  public Optional<Double> getOrderAmount() {
    return orderAmount;
  }

  @JsonProperty("payment_time")
  public Optional<String> getPaymentTime() {
    return paymentTime;
  }

  @JsonProperty("service_charge")
  public Optional<Double> getServiceCharge() {
    return serviceCharge;
  }

  @JsonProperty("service_tax")
  public Optional<Double> getServiceTax() {
    return serviceTax;
  }

  @JsonProperty("settlement_amount")
  public Optional<Double> getSettlementAmount() {
    return settlementAmount;
  }

  @JsonProperty("settlement_id")
  public Optional<Integer> getSettlementId() {
    return settlementId;
  }

  @JsonProperty("transfer_id")
  public Optional<Integer> getTransferId() {
    return transferId;
  }

  @JsonProperty("transfer_time")
  public Optional<String> getTransferTime() {
    return transferTime;
  }

  @JsonProperty("transfer_utr")
  public Optional<String> getTransferUtr() {
    return transferUtr;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SettlementsEntity && equalTo((SettlementsEntity) other);
  }

  private boolean equalTo(SettlementsEntity other) {
    return cfPaymentId.equals(other.cfPaymentId)
        && cfSettlementId.equals(other.cfSettlementId)
        && settlementCurrency.equals(other.settlementCurrency)
        && orderId.equals(other.orderId)
        && entity.equals(other.entity)
        && orderAmount.equals(other.orderAmount)
        && paymentTime.equals(other.paymentTime)
        && serviceCharge.equals(other.serviceCharge)
        && serviceTax.equals(other.serviceTax)
        && settlementAmount.equals(other.settlementAmount)
        && settlementId.equals(other.settlementId)
        && transferId.equals(other.transferId)
        && transferTime.equals(other.transferTime)
        && transferUtr.equals(other.transferUtr);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cfPaymentId,
              this.cfSettlementId,
              this.settlementCurrency,
              this.orderId,
              this.entity,
              this.orderAmount,
              this.paymentTime,
              this.serviceCharge,
              this.serviceTax,
              this.settlementAmount,
              this.settlementId,
              this.transferId,
              this.transferTime,
              this.transferUtr);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SettlementsEntity{"
        + "cfPaymentId: "
        + cfPaymentId
        + ", cfSettlementId: "
        + cfSettlementId
        + ", settlementCurrency: "
        + settlementCurrency
        + ", orderId: "
        + orderId
        + ", entity: "
        + entity
        + ", orderAmount: "
        + orderAmount
        + ", paymentTime: "
        + paymentTime
        + ", serviceCharge: "
        + serviceCharge
        + ", serviceTax: "
        + serviceTax
        + ", settlementAmount: "
        + settlementAmount
        + ", settlementId: "
        + settlementId
        + ", transferId: "
        + transferId
        + ", transferTime: "
        + transferTime
        + ", transferUtr: "
        + transferUtr
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> cfPaymentId = Optional.empty();

    private Optional<String> cfSettlementId = Optional.empty();

    private Optional<String> settlementCurrency = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Optional<String> entity = Optional.empty();

    private Optional<Double> orderAmount = Optional.empty();

    private Optional<String> paymentTime = Optional.empty();

    private Optional<Double> serviceCharge = Optional.empty();

    private Optional<Double> serviceTax = Optional.empty();

    private Optional<Double> settlementAmount = Optional.empty();

    private Optional<Integer> settlementId = Optional.empty();

    private Optional<Integer> transferId = Optional.empty();

    private Optional<String> transferTime = Optional.empty();

    private Optional<String> transferUtr = Optional.empty();

    private Builder() {}

    public Builder from(SettlementsEntity other) {
      cfPaymentId(other.getCfPaymentId());
      cfSettlementId(other.getCfSettlementId());
      settlementCurrency(other.getSettlementCurrency());
      orderId(other.getOrderId());
      entity(other.getEntity());
      orderAmount(other.getOrderAmount());
      paymentTime(other.getPaymentTime());
      serviceCharge(other.getServiceCharge());
      serviceTax(other.getServiceTax());
      settlementAmount(other.getSettlementAmount());
      settlementId(other.getSettlementId());
      transferId(other.getTransferId());
      transferTime(other.getTransferTime());
      transferUtr(other.getTransferUtr());
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

    @JsonSetter(value = "cf_settlement_id", nulls = Nulls.SKIP)
    public Builder cfSettlementId(Optional<String> cfSettlementId) {
      this.cfSettlementId = cfSettlementId;
      return this;
    }

    public Builder cfSettlementId(String cfSettlementId) {
      this.cfSettlementId = Optional.of(cfSettlementId);
      return this;
    }

    @JsonSetter(value = "settlement_currency", nulls = Nulls.SKIP)
    public Builder settlementCurrency(Optional<String> settlementCurrency) {
      this.settlementCurrency = settlementCurrency;
      return this;
    }

    public Builder settlementCurrency(String settlementCurrency) {
      this.settlementCurrency = Optional.of(settlementCurrency);
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

    @JsonSetter(value = "order_amount", nulls = Nulls.SKIP)
    public Builder orderAmount(Optional<Double> orderAmount) {
      this.orderAmount = orderAmount;
      return this;
    }

    public Builder orderAmount(Double orderAmount) {
      this.orderAmount = Optional.of(orderAmount);
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

    @JsonSetter(value = "service_charge", nulls = Nulls.SKIP)
    public Builder serviceCharge(Optional<Double> serviceCharge) {
      this.serviceCharge = serviceCharge;
      return this;
    }

    public Builder serviceCharge(Double serviceCharge) {
      this.serviceCharge = Optional.of(serviceCharge);
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

    @JsonSetter(value = "settlement_amount", nulls = Nulls.SKIP)
    public Builder settlementAmount(Optional<Double> settlementAmount) {
      this.settlementAmount = settlementAmount;
      return this;
    }

    public Builder settlementAmount(Double settlementAmount) {
      this.settlementAmount = Optional.of(settlementAmount);
      return this;
    }

    @JsonSetter(value = "settlement_id", nulls = Nulls.SKIP)
    public Builder settlementId(Optional<Integer> settlementId) {
      this.settlementId = settlementId;
      return this;
    }

    public Builder settlementId(Integer settlementId) {
      this.settlementId = Optional.of(settlementId);
      return this;
    }

    @JsonSetter(value = "transfer_id", nulls = Nulls.SKIP)
    public Builder transferId(Optional<Integer> transferId) {
      this.transferId = transferId;
      return this;
    }

    public Builder transferId(Integer transferId) {
      this.transferId = Optional.of(transferId);
      return this;
    }

    @JsonSetter(value = "transfer_time", nulls = Nulls.SKIP)
    public Builder transferTime(Optional<String> transferTime) {
      this.transferTime = transferTime;
      return this;
    }

    public Builder transferTime(String transferTime) {
      this.transferTime = Optional.of(transferTime);
      return this;
    }

    @JsonSetter(value = "transfer_utr", nulls = Nulls.SKIP)
    public Builder transferUtr(Optional<String> transferUtr) {
      this.transferUtr = transferUtr;
      return this;
    }

    public Builder transferUtr(String transferUtr) {
      this.transferUtr = Optional.of(transferUtr);
      return this;
    }

    public SettlementsEntity build() {
      return new SettlementsEntity(
          cfPaymentId,
          cfSettlementId,
          settlementCurrency,
          orderId,
          entity,
          orderAmount,
          paymentTime,
          serviceCharge,
          serviceTax,
          settlementAmount,
          settlementId,
          transferId,
          transferTime,
          transferUtr);
    }
  }
}
