package com.shubhi.maheshwari.api.resources.orders.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.CustomerDetails;
import com.shubhi.maheshwari.api.types.OrderMeta;
import com.shubhi.maheshwari.api.types.TerminalDetails;
import com.shubhi.maheshwari.api.types.VendorSplit;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CreateOrderBackendRequest.Builder.class)
public final class CreateOrderBackendRequest {
  private final Optional<String> orderId;

  private final double orderAmount;

  private final String orderCurrency;

  private final CustomerDetails customerDetails;

  private final Optional<TerminalDetails> terminal;

  private final Optional<OrderMeta> orderMeta;

  private final Optional<String> orderExpiryTime;

  private final Optional<String> orderNote;

  private final Optional<Map<String, String>> orderTags;

  private final Optional<List<VendorSplit>> orderSplits;

  private int _cachedHashCode;

  CreateOrderBackendRequest(
      Optional<String> orderId,
      double orderAmount,
      String orderCurrency,
      CustomerDetails customerDetails,
      Optional<TerminalDetails> terminal,
      Optional<OrderMeta> orderMeta,
      Optional<String> orderExpiryTime,
      Optional<String> orderNote,
      Optional<Map<String, String>> orderTags,
      Optional<List<VendorSplit>> orderSplits) {
    this.orderId = orderId;
    this.orderAmount = orderAmount;
    this.orderCurrency = orderCurrency;
    this.customerDetails = customerDetails;
    this.terminal = terminal;
    this.orderMeta = orderMeta;
    this.orderExpiryTime = orderExpiryTime;
    this.orderNote = orderNote;
    this.orderTags = orderTags;
    this.orderSplits = orderSplits;
  }

  /**
   * @return Order identifier present in your system. Alphanumeric and only - and _ allowed.
   *     &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 45 characters</code>
   *     &lt;/span&gt;
   */
  @JsonProperty("order_id")
  public Optional<String> getOrderId() {
    return orderId;
  }

  /**
   * @return Bill amount for the order. Provide upto two decimals. 10.15 means Rs 10 and 15 paisa
   */
  @JsonProperty("order_amount")
  public double getOrderAmount() {
    return orderAmount;
  }

  /**
   * @return Currency for the order. INR if left empty. Contact care@cashfree.com to enable new
   *     currencies.
   */
  @JsonProperty("order_currency")
  public String getOrderCurrency() {
    return orderCurrency;
  }

  @JsonProperty("customer_details")
  public CustomerDetails getCustomerDetails() {
    return customerDetails;
  }

  @JsonProperty("terminal")
  public Optional<TerminalDetails> getTerminal() {
    return terminal;
  }

  @JsonProperty("order_meta")
  public Optional<OrderMeta> getOrderMeta() {
    return orderMeta;
  }

  /**
   * @return Time after which the order expires. Customers will not be able to make the payment
   *     beyond the time specified here. We store timestamps in IST, but you can provide them in a
   *     valid ISO 8601 time format.
   */
  @JsonProperty("order_expiry_time")
  public Optional<String> getOrderExpiryTime() {
    return orderExpiryTime;
  }

  /**
   * @return Order note for reference. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 200 characters</code>&lt;/span&gt;
   */
  @JsonProperty("order_note")
  public Optional<String> getOrderNote() {
    return orderNote;
  }

  /**
   * @return Custom Tags which can be passed for an order. A maximum of 6 tags can be added
   */
  @JsonProperty("order_tags")
  public Optional<Map<String, String>> getOrderTags() {
    return orderTags;
  }

  @JsonProperty("order_splits")
  public Optional<List<VendorSplit>> getOrderSplits() {
    return orderSplits;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateOrderBackendRequest && equalTo((CreateOrderBackendRequest) other);
  }

  private boolean equalTo(CreateOrderBackendRequest other) {
    return orderId.equals(other.orderId)
        && orderAmount == other.orderAmount
        && orderCurrency.equals(other.orderCurrency)
        && customerDetails.equals(other.customerDetails)
        && terminal.equals(other.terminal)
        && orderMeta.equals(other.orderMeta)
        && orderExpiryTime.equals(other.orderExpiryTime)
        && orderNote.equals(other.orderNote)
        && orderTags.equals(other.orderTags)
        && orderSplits.equals(other.orderSplits);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.orderId,
              this.orderAmount,
              this.orderCurrency,
              this.customerDetails,
              this.terminal,
              this.orderMeta,
              this.orderExpiryTime,
              this.orderNote,
              this.orderTags,
              this.orderSplits);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateOrderBackendRequest{"
        + "orderId: "
        + orderId
        + ", orderAmount: "
        + orderAmount
        + ", orderCurrency: "
        + orderCurrency
        + ", customerDetails: "
        + customerDetails
        + ", terminal: "
        + terminal
        + ", orderMeta: "
        + orderMeta
        + ", orderExpiryTime: "
        + orderExpiryTime
        + ", orderNote: "
        + orderNote
        + ", orderTags: "
        + orderTags
        + ", orderSplits: "
        + orderSplits
        + "}";
  }

  public static OrderAmountStage builder() {
    return new Builder();
  }

  public interface OrderAmountStage {
    OrderCurrencyStage orderAmount(double orderAmount);

    Builder from(CreateOrderBackendRequest other);
  }

  public interface OrderCurrencyStage {
    CustomerDetailsStage orderCurrency(String orderCurrency);
  }

  public interface CustomerDetailsStage {
    _FinalStage customerDetails(CustomerDetails customerDetails);
  }

  public interface _FinalStage {
    CreateOrderBackendRequest build();

    _FinalStage orderId(Optional<String> orderId);

    _FinalStage orderId(String orderId);

    _FinalStage terminal(Optional<TerminalDetails> terminal);

    _FinalStage terminal(TerminalDetails terminal);

    _FinalStage orderMeta(Optional<OrderMeta> orderMeta);

    _FinalStage orderMeta(OrderMeta orderMeta);

    _FinalStage orderExpiryTime(Optional<String> orderExpiryTime);

    _FinalStage orderExpiryTime(String orderExpiryTime);

    _FinalStage orderNote(Optional<String> orderNote);

    _FinalStage orderNote(String orderNote);

    _FinalStage orderTags(Optional<Map<String, String>> orderTags);

    _FinalStage orderTags(Map<String, String> orderTags);

    _FinalStage orderSplits(Optional<List<VendorSplit>> orderSplits);

    _FinalStage orderSplits(List<VendorSplit> orderSplits);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements OrderAmountStage, OrderCurrencyStage, CustomerDetailsStage, _FinalStage {
    private double orderAmount;

    private String orderCurrency;

    private CustomerDetails customerDetails;

    private Optional<List<VendorSplit>> orderSplits = Optional.empty();

    private Optional<Map<String, String>> orderTags = Optional.empty();

    private Optional<String> orderNote = Optional.empty();

    private Optional<String> orderExpiryTime = Optional.empty();

    private Optional<OrderMeta> orderMeta = Optional.empty();

    private Optional<TerminalDetails> terminal = Optional.empty();

    private Optional<String> orderId = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(CreateOrderBackendRequest other) {
      orderId(other.getOrderId());
      orderAmount(other.getOrderAmount());
      orderCurrency(other.getOrderCurrency());
      customerDetails(other.getCustomerDetails());
      terminal(other.getTerminal());
      orderMeta(other.getOrderMeta());
      orderExpiryTime(other.getOrderExpiryTime());
      orderNote(other.getOrderNote());
      orderTags(other.getOrderTags());
      orderSplits(other.getOrderSplits());
      return this;
    }

    /**
     * Bill amount for the order. Provide upto two decimals. 10.15 means Rs 10 and 15 paisa
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("order_amount")
    public OrderCurrencyStage orderAmount(double orderAmount) {
      this.orderAmount = orderAmount;
      return this;
    }

    /**
     * Currency for the order. INR if left empty. Contact care@cashfree.com to enable new
     * currencies.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("order_currency")
    public CustomerDetailsStage orderCurrency(String orderCurrency) {
      this.orderCurrency = orderCurrency;
      return this;
    }

    @Override
    @JsonSetter("customer_details")
    public _FinalStage customerDetails(CustomerDetails customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    @Override
    public _FinalStage orderSplits(List<VendorSplit> orderSplits) {
      this.orderSplits = Optional.of(orderSplits);
      return this;
    }

    @Override
    @JsonSetter(value = "order_splits", nulls = Nulls.SKIP)
    public _FinalStage orderSplits(Optional<List<VendorSplit>> orderSplits) {
      this.orderSplits = orderSplits;
      return this;
    }

    /**
     * Custom Tags which can be passed for an order. A maximum of 6 tags can be added
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage orderTags(Map<String, String> orderTags) {
      this.orderTags = Optional.of(orderTags);
      return this;
    }

    @Override
    @JsonSetter(value = "order_tags", nulls = Nulls.SKIP)
    public _FinalStage orderTags(Optional<Map<String, String>> orderTags) {
      this.orderTags = orderTags;
      return this;
    }

    /**
     * Order note for reference. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 200 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage orderNote(String orderNote) {
      this.orderNote = Optional.of(orderNote);
      return this;
    }

    @Override
    @JsonSetter(value = "order_note", nulls = Nulls.SKIP)
    public _FinalStage orderNote(Optional<String> orderNote) {
      this.orderNote = orderNote;
      return this;
    }

    /**
     * Time after which the order expires. Customers will not be able to make the payment beyond the
     * time specified here. We store timestamps in IST, but you can provide them in a valid ISO 8601
     * time format.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage orderExpiryTime(String orderExpiryTime) {
      this.orderExpiryTime = Optional.of(orderExpiryTime);
      return this;
    }

    @Override
    @JsonSetter(value = "order_expiry_time", nulls = Nulls.SKIP)
    public _FinalStage orderExpiryTime(Optional<String> orderExpiryTime) {
      this.orderExpiryTime = orderExpiryTime;
      return this;
    }

    @Override
    public _FinalStage orderMeta(OrderMeta orderMeta) {
      this.orderMeta = Optional.of(orderMeta);
      return this;
    }

    @Override
    @JsonSetter(value = "order_meta", nulls = Nulls.SKIP)
    public _FinalStage orderMeta(Optional<OrderMeta> orderMeta) {
      this.orderMeta = orderMeta;
      return this;
    }

    @Override
    public _FinalStage terminal(TerminalDetails terminal) {
      this.terminal = Optional.of(terminal);
      return this;
    }

    @Override
    @JsonSetter(value = "terminal", nulls = Nulls.SKIP)
    public _FinalStage terminal(Optional<TerminalDetails> terminal) {
      this.terminal = terminal;
      return this;
    }

    /**
     * Order identifier present in your system. Alphanumeric and only - and _ allowed. &lt;span
     * style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 45 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage orderId(String orderId) {
      this.orderId = Optional.of(orderId);
      return this;
    }

    @Override
    @JsonSetter(value = "order_id", nulls = Nulls.SKIP)
    public _FinalStage orderId(Optional<String> orderId) {
      this.orderId = orderId;
      return this;
    }

    @Override
    public CreateOrderBackendRequest build() {
      return new CreateOrderBackendRequest(
          orderId,
          orderAmount,
          orderCurrency,
          customerDetails,
          terminal,
          orderMeta,
          orderExpiryTime,
          orderNote,
          orderTags,
          orderSplits);
    }
  }
}
