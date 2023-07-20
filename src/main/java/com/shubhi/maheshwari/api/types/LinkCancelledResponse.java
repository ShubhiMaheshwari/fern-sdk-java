package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LinkCancelledResponse.Builder.class)
public final class LinkCancelledResponse {
  private final Optional<Integer> cfLinkId;

  private final Optional<String> linkId;

  private final Optional<String> linkStatus;

  private final Optional<String> linkCurrency;

  private final Optional<Double> linkAmount;

  private final Optional<Double> linkAmountPaid;

  private final Optional<Boolean> linkPartialPayments;

  private final Optional<Double> linkMinimumPartialAmount;

  private final Optional<String> linkPurpose;

  private final Optional<String> linkCreatedAt;

  private final Optional<LinkCustomerDetailsEntity> customerDetails;

  private final Optional<LinkMetaEntity> linkMeta;

  private final Optional<String> linkUrl;

  private final Optional<String> linkExpiryTime;

  private final Optional<Map<String, String>> linkNotes;

  private final Optional<Boolean> linkAutoReminders;

  private final Optional<LinkNotifyEntity> linkNotify;

  private int _cachedHashCode;

  LinkCancelledResponse(
      Optional<Integer> cfLinkId,
      Optional<String> linkId,
      Optional<String> linkStatus,
      Optional<String> linkCurrency,
      Optional<Double> linkAmount,
      Optional<Double> linkAmountPaid,
      Optional<Boolean> linkPartialPayments,
      Optional<Double> linkMinimumPartialAmount,
      Optional<String> linkPurpose,
      Optional<String> linkCreatedAt,
      Optional<LinkCustomerDetailsEntity> customerDetails,
      Optional<LinkMetaEntity> linkMeta,
      Optional<String> linkUrl,
      Optional<String> linkExpiryTime,
      Optional<Map<String, String>> linkNotes,
      Optional<Boolean> linkAutoReminders,
      Optional<LinkNotifyEntity> linkNotify) {
    this.cfLinkId = cfLinkId;
    this.linkId = linkId;
    this.linkStatus = linkStatus;
    this.linkCurrency = linkCurrency;
    this.linkAmount = linkAmount;
    this.linkAmountPaid = linkAmountPaid;
    this.linkPartialPayments = linkPartialPayments;
    this.linkMinimumPartialAmount = linkMinimumPartialAmount;
    this.linkPurpose = linkPurpose;
    this.linkCreatedAt = linkCreatedAt;
    this.customerDetails = customerDetails;
    this.linkMeta = linkMeta;
    this.linkUrl = linkUrl;
    this.linkExpiryTime = linkExpiryTime;
    this.linkNotes = linkNotes;
    this.linkAutoReminders = linkAutoReminders;
    this.linkNotify = linkNotify;
  }

  @JsonProperty("cf_link_id")
  public Optional<Integer> getCfLinkId() {
    return cfLinkId;
  }

  @JsonProperty("link_id")
  public Optional<String> getLinkId() {
    return linkId;
  }

  @JsonProperty("link_status")
  public Optional<String> getLinkStatus() {
    return linkStatus;
  }

  @JsonProperty("link_currency")
  public Optional<String> getLinkCurrency() {
    return linkCurrency;
  }

  @JsonProperty("link_amount")
  public Optional<Double> getLinkAmount() {
    return linkAmount;
  }

  @JsonProperty("link_amount_paid")
  public Optional<Double> getLinkAmountPaid() {
    return linkAmountPaid;
  }

  @JsonProperty("link_partial_payments")
  public Optional<Boolean> getLinkPartialPayments() {
    return linkPartialPayments;
  }

  @JsonProperty("link_minimum_partial_amount")
  public Optional<Double> getLinkMinimumPartialAmount() {
    return linkMinimumPartialAmount;
  }

  @JsonProperty("link_purpose")
  public Optional<String> getLinkPurpose() {
    return linkPurpose;
  }

  @JsonProperty("link_created_at")
  public Optional<String> getLinkCreatedAt() {
    return linkCreatedAt;
  }

  @JsonProperty("customer_details")
  public Optional<LinkCustomerDetailsEntity> getCustomerDetails() {
    return customerDetails;
  }

  @JsonProperty("link_meta")
  public Optional<LinkMetaEntity> getLinkMeta() {
    return linkMeta;
  }

  @JsonProperty("link_url")
  public Optional<String> getLinkUrl() {
    return linkUrl;
  }

  @JsonProperty("link_expiry_time")
  public Optional<String> getLinkExpiryTime() {
    return linkExpiryTime;
  }

  @JsonProperty("link_notes")
  public Optional<Map<String, String>> getLinkNotes() {
    return linkNotes;
  }

  @JsonProperty("link_auto_reminders")
  public Optional<Boolean> getLinkAutoReminders() {
    return linkAutoReminders;
  }

  @JsonProperty("link_notify")
  public Optional<LinkNotifyEntity> getLinkNotify() {
    return linkNotify;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LinkCancelledResponse && equalTo((LinkCancelledResponse) other);
  }

  private boolean equalTo(LinkCancelledResponse other) {
    return cfLinkId.equals(other.cfLinkId)
        && linkId.equals(other.linkId)
        && linkStatus.equals(other.linkStatus)
        && linkCurrency.equals(other.linkCurrency)
        && linkAmount.equals(other.linkAmount)
        && linkAmountPaid.equals(other.linkAmountPaid)
        && linkPartialPayments.equals(other.linkPartialPayments)
        && linkMinimumPartialAmount.equals(other.linkMinimumPartialAmount)
        && linkPurpose.equals(other.linkPurpose)
        && linkCreatedAt.equals(other.linkCreatedAt)
        && customerDetails.equals(other.customerDetails)
        && linkMeta.equals(other.linkMeta)
        && linkUrl.equals(other.linkUrl)
        && linkExpiryTime.equals(other.linkExpiryTime)
        && linkNotes.equals(other.linkNotes)
        && linkAutoReminders.equals(other.linkAutoReminders)
        && linkNotify.equals(other.linkNotify);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cfLinkId,
              this.linkId,
              this.linkStatus,
              this.linkCurrency,
              this.linkAmount,
              this.linkAmountPaid,
              this.linkPartialPayments,
              this.linkMinimumPartialAmount,
              this.linkPurpose,
              this.linkCreatedAt,
              this.customerDetails,
              this.linkMeta,
              this.linkUrl,
              this.linkExpiryTime,
              this.linkNotes,
              this.linkAutoReminders,
              this.linkNotify);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinkCancelledResponse{"
        + "cfLinkId: "
        + cfLinkId
        + ", linkId: "
        + linkId
        + ", linkStatus: "
        + linkStatus
        + ", linkCurrency: "
        + linkCurrency
        + ", linkAmount: "
        + linkAmount
        + ", linkAmountPaid: "
        + linkAmountPaid
        + ", linkPartialPayments: "
        + linkPartialPayments
        + ", linkMinimumPartialAmount: "
        + linkMinimumPartialAmount
        + ", linkPurpose: "
        + linkPurpose
        + ", linkCreatedAt: "
        + linkCreatedAt
        + ", customerDetails: "
        + customerDetails
        + ", linkMeta: "
        + linkMeta
        + ", linkUrl: "
        + linkUrl
        + ", linkExpiryTime: "
        + linkExpiryTime
        + ", linkNotes: "
        + linkNotes
        + ", linkAutoReminders: "
        + linkAutoReminders
        + ", linkNotify: "
        + linkNotify
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> cfLinkId = Optional.empty();

    private Optional<String> linkId = Optional.empty();

    private Optional<String> linkStatus = Optional.empty();

    private Optional<String> linkCurrency = Optional.empty();

    private Optional<Double> linkAmount = Optional.empty();

    private Optional<Double> linkAmountPaid = Optional.empty();

    private Optional<Boolean> linkPartialPayments = Optional.empty();

    private Optional<Double> linkMinimumPartialAmount = Optional.empty();

    private Optional<String> linkPurpose = Optional.empty();

    private Optional<String> linkCreatedAt = Optional.empty();

    private Optional<LinkCustomerDetailsEntity> customerDetails = Optional.empty();

    private Optional<LinkMetaEntity> linkMeta = Optional.empty();

    private Optional<String> linkUrl = Optional.empty();

    private Optional<String> linkExpiryTime = Optional.empty();

    private Optional<Map<String, String>> linkNotes = Optional.empty();

    private Optional<Boolean> linkAutoReminders = Optional.empty();

    private Optional<LinkNotifyEntity> linkNotify = Optional.empty();

    private Builder() {}

    public Builder from(LinkCancelledResponse other) {
      cfLinkId(other.getCfLinkId());
      linkId(other.getLinkId());
      linkStatus(other.getLinkStatus());
      linkCurrency(other.getLinkCurrency());
      linkAmount(other.getLinkAmount());
      linkAmountPaid(other.getLinkAmountPaid());
      linkPartialPayments(other.getLinkPartialPayments());
      linkMinimumPartialAmount(other.getLinkMinimumPartialAmount());
      linkPurpose(other.getLinkPurpose());
      linkCreatedAt(other.getLinkCreatedAt());
      customerDetails(other.getCustomerDetails());
      linkMeta(other.getLinkMeta());
      linkUrl(other.getLinkUrl());
      linkExpiryTime(other.getLinkExpiryTime());
      linkNotes(other.getLinkNotes());
      linkAutoReminders(other.getLinkAutoReminders());
      linkNotify(other.getLinkNotify());
      return this;
    }

    @JsonSetter(value = "cf_link_id", nulls = Nulls.SKIP)
    public Builder cfLinkId(Optional<Integer> cfLinkId) {
      this.cfLinkId = cfLinkId;
      return this;
    }

    public Builder cfLinkId(Integer cfLinkId) {
      this.cfLinkId = Optional.of(cfLinkId);
      return this;
    }

    @JsonSetter(value = "link_id", nulls = Nulls.SKIP)
    public Builder linkId(Optional<String> linkId) {
      this.linkId = linkId;
      return this;
    }

    public Builder linkId(String linkId) {
      this.linkId = Optional.of(linkId);
      return this;
    }

    @JsonSetter(value = "link_status", nulls = Nulls.SKIP)
    public Builder linkStatus(Optional<String> linkStatus) {
      this.linkStatus = linkStatus;
      return this;
    }

    public Builder linkStatus(String linkStatus) {
      this.linkStatus = Optional.of(linkStatus);
      return this;
    }

    @JsonSetter(value = "link_currency", nulls = Nulls.SKIP)
    public Builder linkCurrency(Optional<String> linkCurrency) {
      this.linkCurrency = linkCurrency;
      return this;
    }

    public Builder linkCurrency(String linkCurrency) {
      this.linkCurrency = Optional.of(linkCurrency);
      return this;
    }

    @JsonSetter(value = "link_amount", nulls = Nulls.SKIP)
    public Builder linkAmount(Optional<Double> linkAmount) {
      this.linkAmount = linkAmount;
      return this;
    }

    public Builder linkAmount(Double linkAmount) {
      this.linkAmount = Optional.of(linkAmount);
      return this;
    }

    @JsonSetter(value = "link_amount_paid", nulls = Nulls.SKIP)
    public Builder linkAmountPaid(Optional<Double> linkAmountPaid) {
      this.linkAmountPaid = linkAmountPaid;
      return this;
    }

    public Builder linkAmountPaid(Double linkAmountPaid) {
      this.linkAmountPaid = Optional.of(linkAmountPaid);
      return this;
    }

    @JsonSetter(value = "link_partial_payments", nulls = Nulls.SKIP)
    public Builder linkPartialPayments(Optional<Boolean> linkPartialPayments) {
      this.linkPartialPayments = linkPartialPayments;
      return this;
    }

    public Builder linkPartialPayments(Boolean linkPartialPayments) {
      this.linkPartialPayments = Optional.of(linkPartialPayments);
      return this;
    }

    @JsonSetter(value = "link_minimum_partial_amount", nulls = Nulls.SKIP)
    public Builder linkMinimumPartialAmount(Optional<Double> linkMinimumPartialAmount) {
      this.linkMinimumPartialAmount = linkMinimumPartialAmount;
      return this;
    }

    public Builder linkMinimumPartialAmount(Double linkMinimumPartialAmount) {
      this.linkMinimumPartialAmount = Optional.of(linkMinimumPartialAmount);
      return this;
    }

    @JsonSetter(value = "link_purpose", nulls = Nulls.SKIP)
    public Builder linkPurpose(Optional<String> linkPurpose) {
      this.linkPurpose = linkPurpose;
      return this;
    }

    public Builder linkPurpose(String linkPurpose) {
      this.linkPurpose = Optional.of(linkPurpose);
      return this;
    }

    @JsonSetter(value = "link_created_at", nulls = Nulls.SKIP)
    public Builder linkCreatedAt(Optional<String> linkCreatedAt) {
      this.linkCreatedAt = linkCreatedAt;
      return this;
    }

    public Builder linkCreatedAt(String linkCreatedAt) {
      this.linkCreatedAt = Optional.of(linkCreatedAt);
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

    @JsonSetter(value = "link_meta", nulls = Nulls.SKIP)
    public Builder linkMeta(Optional<LinkMetaEntity> linkMeta) {
      this.linkMeta = linkMeta;
      return this;
    }

    public Builder linkMeta(LinkMetaEntity linkMeta) {
      this.linkMeta = Optional.of(linkMeta);
      return this;
    }

    @JsonSetter(value = "link_url", nulls = Nulls.SKIP)
    public Builder linkUrl(Optional<String> linkUrl) {
      this.linkUrl = linkUrl;
      return this;
    }

    public Builder linkUrl(String linkUrl) {
      this.linkUrl = Optional.of(linkUrl);
      return this;
    }

    @JsonSetter(value = "link_expiry_time", nulls = Nulls.SKIP)
    public Builder linkExpiryTime(Optional<String> linkExpiryTime) {
      this.linkExpiryTime = linkExpiryTime;
      return this;
    }

    public Builder linkExpiryTime(String linkExpiryTime) {
      this.linkExpiryTime = Optional.of(linkExpiryTime);
      return this;
    }

    @JsonSetter(value = "link_notes", nulls = Nulls.SKIP)
    public Builder linkNotes(Optional<Map<String, String>> linkNotes) {
      this.linkNotes = linkNotes;
      return this;
    }

    public Builder linkNotes(Map<String, String> linkNotes) {
      this.linkNotes = Optional.of(linkNotes);
      return this;
    }

    @JsonSetter(value = "link_auto_reminders", nulls = Nulls.SKIP)
    public Builder linkAutoReminders(Optional<Boolean> linkAutoReminders) {
      this.linkAutoReminders = linkAutoReminders;
      return this;
    }

    public Builder linkAutoReminders(Boolean linkAutoReminders) {
      this.linkAutoReminders = Optional.of(linkAutoReminders);
      return this;
    }

    @JsonSetter(value = "link_notify", nulls = Nulls.SKIP)
    public Builder linkNotify(Optional<LinkNotifyEntity> linkNotify) {
      this.linkNotify = linkNotify;
      return this;
    }

    public Builder linkNotify(LinkNotifyEntity linkNotify) {
      this.linkNotify = Optional.of(linkNotify);
      return this;
    }

    public LinkCancelledResponse build() {
      return new LinkCancelledResponse(
          cfLinkId,
          linkId,
          linkStatus,
          linkCurrency,
          linkAmount,
          linkAmountPaid,
          linkPartialPayments,
          linkMinimumPartialAmount,
          linkPurpose,
          linkCreatedAt,
          customerDetails,
          linkMeta,
          linkUrl,
          linkExpiryTime,
          linkNotes,
          linkAutoReminders,
          linkNotify);
    }
  }
}
