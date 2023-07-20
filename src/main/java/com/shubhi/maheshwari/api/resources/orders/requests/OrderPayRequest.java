package com.shubhi.maheshwari.api.resources.orders.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.OrderPayRequestPaymentMethod;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OrderPayRequest.Builder.class)
public final class OrderPayRequest {
  private final String paymentSessionId;

  private final OrderPayRequestPaymentMethod paymentMethod;

  private final Optional<Boolean> saveInstrument;

  private final Optional<String> offerId;

  private int _cachedHashCode;

  OrderPayRequest(
      String paymentSessionId,
      OrderPayRequestPaymentMethod paymentMethod,
      Optional<Boolean> saveInstrument,
      Optional<String> offerId) {
    this.paymentSessionId = paymentSessionId;
    this.paymentMethod = paymentMethod;
    this.saveInstrument = saveInstrument;
    this.offerId = offerId;
  }

  @JsonProperty("payment_session_id")
  public String getPaymentSessionId() {
    return paymentSessionId;
  }

  @JsonProperty("payment_method")
  public OrderPayRequestPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  @JsonProperty("save_instrument")
  public Optional<Boolean> getSaveInstrument() {
    return saveInstrument;
  }

  /**
   * @return This is required if any offers needs to be applied to the order.
   */
  @JsonProperty("offer_id")
  public Optional<String> getOfferId() {
    return offerId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrderPayRequest && equalTo((OrderPayRequest) other);
  }

  private boolean equalTo(OrderPayRequest other) {
    return paymentSessionId.equals(other.paymentSessionId)
        && paymentMethod.equals(other.paymentMethod)
        && saveInstrument.equals(other.saveInstrument)
        && offerId.equals(other.offerId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.paymentSessionId, this.paymentMethod, this.saveInstrument, this.offerId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OrderPayRequest{"
        + "paymentSessionId: "
        + paymentSessionId
        + ", paymentMethod: "
        + paymentMethod
        + ", saveInstrument: "
        + saveInstrument
        + ", offerId: "
        + offerId
        + "}";
  }

  public static PaymentSessionIdStage builder() {
    return new Builder();
  }

  public interface PaymentSessionIdStage {
    PaymentMethodStage paymentSessionId(String paymentSessionId);

    Builder from(OrderPayRequest other);
  }

  public interface PaymentMethodStage {
    _FinalStage paymentMethod(OrderPayRequestPaymentMethod paymentMethod);
  }

  public interface _FinalStage {
    OrderPayRequest build();

    _FinalStage saveInstrument(Optional<Boolean> saveInstrument);

    _FinalStage saveInstrument(Boolean saveInstrument);

    _FinalStage offerId(Optional<String> offerId);

    _FinalStage offerId(String offerId);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements PaymentSessionIdStage, PaymentMethodStage, _FinalStage {
    private String paymentSessionId;

    private OrderPayRequestPaymentMethod paymentMethod;

    private Optional<String> offerId = Optional.empty();

    private Optional<Boolean> saveInstrument = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(OrderPayRequest other) {
      paymentSessionId(other.getPaymentSessionId());
      paymentMethod(other.getPaymentMethod());
      saveInstrument(other.getSaveInstrument());
      offerId(other.getOfferId());
      return this;
    }

    @Override
    @JsonSetter("payment_session_id")
    public PaymentMethodStage paymentSessionId(String paymentSessionId) {
      this.paymentSessionId = paymentSessionId;
      return this;
    }

    @Override
    @JsonSetter("payment_method")
    public _FinalStage paymentMethod(OrderPayRequestPaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * This is required if any offers needs to be applied to the order.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage offerId(String offerId) {
      this.offerId = Optional.of(offerId);
      return this;
    }

    @Override
    @JsonSetter(value = "offer_id", nulls = Nulls.SKIP)
    public _FinalStage offerId(Optional<String> offerId) {
      this.offerId = offerId;
      return this;
    }

    @Override
    public _FinalStage saveInstrument(Boolean saveInstrument) {
      this.saveInstrument = Optional.of(saveInstrument);
      return this;
    }

    @Override
    @JsonSetter(value = "save_instrument", nulls = Nulls.SKIP)
    public _FinalStage saveInstrument(Optional<Boolean> saveInstrument) {
      this.saveInstrument = saveInstrument;
      return this;
    }

    @Override
    public OrderPayRequest build() {
      return new OrderPayRequest(paymentSessionId, paymentMethod, saveInstrument, offerId);
    }
  }
}
