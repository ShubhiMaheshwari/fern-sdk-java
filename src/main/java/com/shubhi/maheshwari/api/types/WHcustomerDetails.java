package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WHcustomerDetails.Builder.class)
public final class WHcustomerDetails {
  private final Optional<String> customerName;

  private final Optional<String> customerId;

  private final Optional<String> customerEmail;

  private final Optional<String> customerPhone;

  private int _cachedHashCode;

  WHcustomerDetails(
      Optional<String> customerName,
      Optional<String> customerId,
      Optional<String> customerEmail,
      Optional<String> customerPhone) {
    this.customerName = customerName;
    this.customerId = customerId;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;
  }

  @JsonProperty("customer_name")
  public Optional<String> getCustomerName() {
    return customerName;
  }

  @JsonProperty("customer_id")
  public Optional<String> getCustomerId() {
    return customerId;
  }

  @JsonProperty("customer_email")
  public Optional<String> getCustomerEmail() {
    return customerEmail;
  }

  @JsonProperty("customer_phone")
  public Optional<String> getCustomerPhone() {
    return customerPhone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WHcustomerDetails && equalTo((WHcustomerDetails) other);
  }

  private boolean equalTo(WHcustomerDetails other) {
    return customerName.equals(other.customerName)
        && customerId.equals(other.customerId)
        && customerEmail.equals(other.customerEmail)
        && customerPhone.equals(other.customerPhone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.customerName, this.customerId, this.customerEmail, this.customerPhone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WHcustomerDetails{"
        + "customerName: "
        + customerName
        + ", customerId: "
        + customerId
        + ", customerEmail: "
        + customerEmail
        + ", customerPhone: "
        + customerPhone
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> customerName = Optional.empty();

    private Optional<String> customerId = Optional.empty();

    private Optional<String> customerEmail = Optional.empty();

    private Optional<String> customerPhone = Optional.empty();

    private Builder() {}

    public Builder from(WHcustomerDetails other) {
      customerName(other.getCustomerName());
      customerId(other.getCustomerId());
      customerEmail(other.getCustomerEmail());
      customerPhone(other.getCustomerPhone());
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

    @JsonSetter(value = "customer_id", nulls = Nulls.SKIP)
    public Builder customerId(Optional<String> customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder customerId(String customerId) {
      this.customerId = Optional.of(customerId);
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

    @JsonSetter(value = "customer_phone", nulls = Nulls.SKIP)
    public Builder customerPhone(Optional<String> customerPhone) {
      this.customerPhone = customerPhone;
      return this;
    }

    public Builder customerPhone(String customerPhone) {
      this.customerPhone = Optional.of(customerPhone);
      return this;
    }

    public WHcustomerDetails build() {
      return new WHcustomerDetails(customerName, customerId, customerEmail, customerPhone);
    }
  }
}
