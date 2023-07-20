package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = VendorSplit.Builder.class)
public final class VendorSplit {
  private final Optional<String> vendorId;

  private final Optional<Double> amount;

  private final Optional<Double> percentage;

  private int _cachedHashCode;

  VendorSplit(Optional<String> vendorId, Optional<Double> amount, Optional<Double> percentage) {
    this.vendorId = vendorId;
    this.amount = amount;
    this.percentage = percentage;
  }

  /**
   * @return Vendor id created in Cashfree system
   */
  @JsonProperty("vendor_id")
  public Optional<String> getVendorId() {
    return vendorId;
  }

  /**
   * @return Amount which will be associated with this vendor
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  /**
   * @return Percentage of order amount which shall get added to vendor account
   */
  @JsonProperty("percentage")
  public Optional<Double> getPercentage() {
    return percentage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof VendorSplit && equalTo((VendorSplit) other);
  }

  private boolean equalTo(VendorSplit other) {
    return vendorId.equals(other.vendorId)
        && amount.equals(other.amount)
        && percentage.equals(other.percentage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.vendorId, this.amount, this.percentage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "VendorSplit{"
        + "vendorId: "
        + vendorId
        + ", amount: "
        + amount
        + ", percentage: "
        + percentage
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> vendorId = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<Double> percentage = Optional.empty();

    private Builder() {}

    public Builder from(VendorSplit other) {
      vendorId(other.getVendorId());
      amount(other.getAmount());
      percentage(other.getPercentage());
      return this;
    }

    @JsonSetter(value = "vendor_id", nulls = Nulls.SKIP)
    public Builder vendorId(Optional<String> vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    public Builder vendorId(String vendorId) {
      this.vendorId = Optional.of(vendorId);
      return this;
    }

    @JsonSetter(value = "amount", nulls = Nulls.SKIP)
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(value = "percentage", nulls = Nulls.SKIP)
    public Builder percentage(Optional<Double> percentage) {
      this.percentage = percentage;
      return this;
    }

    public Builder percentage(Double percentage) {
      this.percentage = Optional.of(percentage);
      return this;
    }

    public VendorSplit build() {
      return new VendorSplit(vendorId, amount, percentage);
    }
  }
}
