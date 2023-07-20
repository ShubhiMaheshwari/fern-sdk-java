package com.shubhi.maheshwari.api.resources.paymentlinks.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.LinkCustomerDetailsEntity;
import com.shubhi.maheshwari.api.types.LinkMetaEntity;
import com.shubhi.maheshwari.api.types.LinkNotifyEntity;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CreateLinkRequest.Builder.class)
public final class CreateLinkRequest {
  private final String linkId;

  private final double linkAmount;

  private final String linkCurrency;

  private final String linkPurpose;

  private final LinkCustomerDetailsEntity customerDetails;

  private final Optional<Boolean> linkPartialPayments;

  private final Optional<Double> linkMinimumPartialAmount;

  private final Optional<String> linkExpiryTime;

  private final Optional<LinkNotifyEntity> linkNotify;

  private final Optional<Boolean> linkAutoReminders;

  private final Optional<Map<String, String>> linkNotes;

  private final Optional<LinkMetaEntity> linkMeta;

  private int _cachedHashCode;

  CreateLinkRequest(
      String linkId,
      double linkAmount,
      String linkCurrency,
      String linkPurpose,
      LinkCustomerDetailsEntity customerDetails,
      Optional<Boolean> linkPartialPayments,
      Optional<Double> linkMinimumPartialAmount,
      Optional<String> linkExpiryTime,
      Optional<LinkNotifyEntity> linkNotify,
      Optional<Boolean> linkAutoReminders,
      Optional<Map<String, String>> linkNotes,
      Optional<LinkMetaEntity> linkMeta) {
    this.linkId = linkId;
    this.linkAmount = linkAmount;
    this.linkCurrency = linkCurrency;
    this.linkPurpose = linkPurpose;
    this.customerDetails = customerDetails;
    this.linkPartialPayments = linkPartialPayments;
    this.linkMinimumPartialAmount = linkMinimumPartialAmount;
    this.linkExpiryTime = linkExpiryTime;
    this.linkNotify = linkNotify;
    this.linkAutoReminders = linkAutoReminders;
    this.linkNotes = linkNotes;
    this.linkMeta = linkMeta;
  }

  /**
   * @return Unique Identifier (provided by merchant) for the Link. Alphanumeric and only - and _
   *     allowed (50 character limit). Use this for other link-related APIs. &lt;span
   *     style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
   */
  @JsonProperty("link_id")
  public String getLinkId() {
    return linkId;
  }

  /**
   * @return Amount to be collected using this link. Provide upto two decimals for paise.
   */
  @JsonProperty("link_amount")
  public double getLinkAmount() {
    return linkAmount;
  }

  /**
   * @return Currency for the payment link. Default is INR. Contact care@cashfree.com to enable new
   *     currencies. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 3 characters
   *     </code>&lt;/span&gt;
   */
  @JsonProperty("link_currency")
  public String getLinkCurrency() {
    return linkCurrency;
  }

  /**
   * @return A brief description for which payment must be collected. This is shown to the customer.
   *     &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 500 characters</code>
   *     &lt;/span&gt;
   */
  @JsonProperty("link_purpose")
  public String getLinkPurpose() {
    return linkPurpose;
  }

  @JsonProperty("customer_details")
  public LinkCustomerDetailsEntity getCustomerDetails() {
    return customerDetails;
  }

  /**
   * @return If &quot;true&quot;, customer can make partial payments for the link.
   */
  @JsonProperty("link_partial_payments")
  public Optional<Boolean> getLinkPartialPayments() {
    return linkPartialPayments;
  }

  /**
   * @return Minimum amount in first installment that needs to be paid by the customer if partial
   *     payments are enabled. This should be less than the link_amount.
   */
  @JsonProperty("link_minimum_partial_amount")
  public Optional<Double> getLinkMinimumPartialAmount() {
    return linkMinimumPartialAmount;
  }

  /**
   * @return Time after which the link expires. Customers will not be able to make the payment
   *     beyond the time specified here. You can provide them in a valid ISO 8601 time format.
   *     Default is 30 days.
   */
  @JsonProperty("link_expiry_time")
  public Optional<String> getLinkExpiryTime() {
    return linkExpiryTime;
  }

  @JsonProperty("link_notify")
  public Optional<LinkNotifyEntity> getLinkNotify() {
    return linkNotify;
  }

  /**
   * @return If &quot;true&quot;, reminders will be sent to customers for collecting payments.
   */
  @JsonProperty("link_auto_reminders")
  public Optional<Boolean> getLinkAutoReminders() {
    return linkAutoReminders;
  }

  @JsonProperty("link_notes")
  public Optional<Map<String, String>> getLinkNotes() {
    return linkNotes;
  }

  @JsonProperty("link_meta")
  public Optional<LinkMetaEntity> getLinkMeta() {
    return linkMeta;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateLinkRequest && equalTo((CreateLinkRequest) other);
  }

  private boolean equalTo(CreateLinkRequest other) {
    return linkId.equals(other.linkId)
        && linkAmount == other.linkAmount
        && linkCurrency.equals(other.linkCurrency)
        && linkPurpose.equals(other.linkPurpose)
        && customerDetails.equals(other.customerDetails)
        && linkPartialPayments.equals(other.linkPartialPayments)
        && linkMinimumPartialAmount.equals(other.linkMinimumPartialAmount)
        && linkExpiryTime.equals(other.linkExpiryTime)
        && linkNotify.equals(other.linkNotify)
        && linkAutoReminders.equals(other.linkAutoReminders)
        && linkNotes.equals(other.linkNotes)
        && linkMeta.equals(other.linkMeta);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.linkId,
              this.linkAmount,
              this.linkCurrency,
              this.linkPurpose,
              this.customerDetails,
              this.linkPartialPayments,
              this.linkMinimumPartialAmount,
              this.linkExpiryTime,
              this.linkNotify,
              this.linkAutoReminders,
              this.linkNotes,
              this.linkMeta);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateLinkRequest{"
        + "linkId: "
        + linkId
        + ", linkAmount: "
        + linkAmount
        + ", linkCurrency: "
        + linkCurrency
        + ", linkPurpose: "
        + linkPurpose
        + ", customerDetails: "
        + customerDetails
        + ", linkPartialPayments: "
        + linkPartialPayments
        + ", linkMinimumPartialAmount: "
        + linkMinimumPartialAmount
        + ", linkExpiryTime: "
        + linkExpiryTime
        + ", linkNotify: "
        + linkNotify
        + ", linkAutoReminders: "
        + linkAutoReminders
        + ", linkNotes: "
        + linkNotes
        + ", linkMeta: "
        + linkMeta
        + "}";
  }

  public static LinkIdStage builder() {
    return new Builder();
  }

  public interface LinkIdStage {
    LinkAmountStage linkId(String linkId);

    Builder from(CreateLinkRequest other);
  }

  public interface LinkAmountStage {
    LinkCurrencyStage linkAmount(double linkAmount);
  }

  public interface LinkCurrencyStage {
    LinkPurposeStage linkCurrency(String linkCurrency);
  }

  public interface LinkPurposeStage {
    CustomerDetailsStage linkPurpose(String linkPurpose);
  }

  public interface CustomerDetailsStage {
    _FinalStage customerDetails(LinkCustomerDetailsEntity customerDetails);
  }

  public interface _FinalStage {
    CreateLinkRequest build();

    _FinalStage linkPartialPayments(Optional<Boolean> linkPartialPayments);

    _FinalStage linkPartialPayments(Boolean linkPartialPayments);

    _FinalStage linkMinimumPartialAmount(Optional<Double> linkMinimumPartialAmount);

    _FinalStage linkMinimumPartialAmount(Double linkMinimumPartialAmount);

    _FinalStage linkExpiryTime(Optional<String> linkExpiryTime);

    _FinalStage linkExpiryTime(String linkExpiryTime);

    _FinalStage linkNotify(Optional<LinkNotifyEntity> linkNotify);

    _FinalStage linkNotify(LinkNotifyEntity linkNotify);

    _FinalStage linkAutoReminders(Optional<Boolean> linkAutoReminders);

    _FinalStage linkAutoReminders(Boolean linkAutoReminders);

    _FinalStage linkNotes(Optional<Map<String, String>> linkNotes);

    _FinalStage linkNotes(Map<String, String> linkNotes);

    _FinalStage linkMeta(Optional<LinkMetaEntity> linkMeta);

    _FinalStage linkMeta(LinkMetaEntity linkMeta);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements LinkIdStage,
          LinkAmountStage,
          LinkCurrencyStage,
          LinkPurposeStage,
          CustomerDetailsStage,
          _FinalStage {
    private String linkId;

    private double linkAmount;

    private String linkCurrency;

    private String linkPurpose;

    private LinkCustomerDetailsEntity customerDetails;

    private Optional<LinkMetaEntity> linkMeta = Optional.empty();

    private Optional<Map<String, String>> linkNotes = Optional.empty();

    private Optional<Boolean> linkAutoReminders = Optional.empty();

    private Optional<LinkNotifyEntity> linkNotify = Optional.empty();

    private Optional<String> linkExpiryTime = Optional.empty();

    private Optional<Double> linkMinimumPartialAmount = Optional.empty();

    private Optional<Boolean> linkPartialPayments = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(CreateLinkRequest other) {
      linkId(other.getLinkId());
      linkAmount(other.getLinkAmount());
      linkCurrency(other.getLinkCurrency());
      linkPurpose(other.getLinkPurpose());
      customerDetails(other.getCustomerDetails());
      linkPartialPayments(other.getLinkPartialPayments());
      linkMinimumPartialAmount(other.getLinkMinimumPartialAmount());
      linkExpiryTime(other.getLinkExpiryTime());
      linkNotify(other.getLinkNotify());
      linkAutoReminders(other.getLinkAutoReminders());
      linkNotes(other.getLinkNotes());
      linkMeta(other.getLinkMeta());
      return this;
    }

    /**
     * Unique Identifier (provided by merchant) for the Link. Alphanumeric and only - and _ allowed
     * (50 character limit). Use this for other link-related APIs. &lt;span style=&quot;white-space:
     * nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link_id")
    public LinkAmountStage linkId(String linkId) {
      this.linkId = linkId;
      return this;
    }

    /**
     * Amount to be collected using this link. Provide upto two decimals for paise.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link_amount")
    public LinkCurrencyStage linkAmount(double linkAmount) {
      this.linkAmount = linkAmount;
      return this;
    }

    /**
     * Currency for the payment link. Default is INR. Contact care@cashfree.com to enable new
     * currencies. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 3 characters</code>
     * &lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link_currency")
    public LinkPurposeStage linkCurrency(String linkCurrency) {
      this.linkCurrency = linkCurrency;
      return this;
    }

    /**
     * A brief description for which payment must be collected. This is shown to the customer.
     * &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 500 characters</code>
     * &lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link_purpose")
    public CustomerDetailsStage linkPurpose(String linkPurpose) {
      this.linkPurpose = linkPurpose;
      return this;
    }

    @Override
    @JsonSetter("customer_details")
    public _FinalStage customerDetails(LinkCustomerDetailsEntity customerDetails) {
      this.customerDetails = customerDetails;
      return this;
    }

    @Override
    public _FinalStage linkMeta(LinkMetaEntity linkMeta) {
      this.linkMeta = Optional.of(linkMeta);
      return this;
    }

    @Override
    @JsonSetter(value = "link_meta", nulls = Nulls.SKIP)
    public _FinalStage linkMeta(Optional<LinkMetaEntity> linkMeta) {
      this.linkMeta = linkMeta;
      return this;
    }

    @Override
    public _FinalStage linkNotes(Map<String, String> linkNotes) {
      this.linkNotes = Optional.of(linkNotes);
      return this;
    }

    @Override
    @JsonSetter(value = "link_notes", nulls = Nulls.SKIP)
    public _FinalStage linkNotes(Optional<Map<String, String>> linkNotes) {
      this.linkNotes = linkNotes;
      return this;
    }

    /**
     * If &quot;true&quot;, reminders will be sent to customers for collecting payments.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage linkAutoReminders(Boolean linkAutoReminders) {
      this.linkAutoReminders = Optional.of(linkAutoReminders);
      return this;
    }

    @Override
    @JsonSetter(value = "link_auto_reminders", nulls = Nulls.SKIP)
    public _FinalStage linkAutoReminders(Optional<Boolean> linkAutoReminders) {
      this.linkAutoReminders = linkAutoReminders;
      return this;
    }

    @Override
    public _FinalStage linkNotify(LinkNotifyEntity linkNotify) {
      this.linkNotify = Optional.of(linkNotify);
      return this;
    }

    @Override
    @JsonSetter(value = "link_notify", nulls = Nulls.SKIP)
    public _FinalStage linkNotify(Optional<LinkNotifyEntity> linkNotify) {
      this.linkNotify = linkNotify;
      return this;
    }

    /**
     * Time after which the link expires. Customers will not be able to make the payment beyond the
     * time specified here. You can provide them in a valid ISO 8601 time format. Default is 30
     * days.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage linkExpiryTime(String linkExpiryTime) {
      this.linkExpiryTime = Optional.of(linkExpiryTime);
      return this;
    }

    @Override
    @JsonSetter(value = "link_expiry_time", nulls = Nulls.SKIP)
    public _FinalStage linkExpiryTime(Optional<String> linkExpiryTime) {
      this.linkExpiryTime = linkExpiryTime;
      return this;
    }

    /**
     * Minimum amount in first installment that needs to be paid by the customer if partial payments
     * are enabled. This should be less than the link_amount.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage linkMinimumPartialAmount(Double linkMinimumPartialAmount) {
      this.linkMinimumPartialAmount = Optional.of(linkMinimumPartialAmount);
      return this;
    }

    @Override
    @JsonSetter(value = "link_minimum_partial_amount", nulls = Nulls.SKIP)
    public _FinalStage linkMinimumPartialAmount(Optional<Double> linkMinimumPartialAmount) {
      this.linkMinimumPartialAmount = linkMinimumPartialAmount;
      return this;
    }

    /**
     * If &quot;true&quot;, customer can make partial payments for the link.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage linkPartialPayments(Boolean linkPartialPayments) {
      this.linkPartialPayments = Optional.of(linkPartialPayments);
      return this;
    }

    @Override
    @JsonSetter(value = "link_partial_payments", nulls = Nulls.SKIP)
    public _FinalStage linkPartialPayments(Optional<Boolean> linkPartialPayments) {
      this.linkPartialPayments = linkPartialPayments;
      return this;
    }

    @Override
    public CreateLinkRequest build() {
      return new CreateLinkRequest(
          linkId,
          linkAmount,
          linkCurrency,
          linkPurpose,
          customerDetails,
          linkPartialPayments,
          linkMinimumPartialAmount,
          linkExpiryTime,
          linkNotify,
          linkAutoReminders,
          linkNotes,
          linkMeta);
    }
  }
}
