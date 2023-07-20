package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LinkCustomerDetailsEntity.Builder.class)
public final class LinkCustomerDetailsEntity {
  private final String customerPhone;

  private final Optional<String> customerEmail;

  private final Optional<String> customerName;

  private int _cachedHashCode;

  LinkCustomerDetailsEntity(
      String customerPhone, Optional<String> customerEmail, Optional<String> customerName) {
    this.customerPhone = customerPhone;
    this.customerEmail = customerEmail;
    this.customerName = customerName;
  }

  /**
   * @return Customer phone number
   */
  @JsonProperty("customer_phone")
  public String getCustomerPhone() {
    return customerPhone;
  }

  /**
   * @return Customer email address
   */
  @JsonProperty("customer_email")
  public Optional<String> getCustomerEmail() {
    return customerEmail;
  }

  /**
   * @return Customer name
   */
  @JsonProperty("customer_name")
  public Optional<String> getCustomerName() {
    return customerName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LinkCustomerDetailsEntity && equalTo((LinkCustomerDetailsEntity) other);
  }

  private boolean equalTo(LinkCustomerDetailsEntity other) {
    return customerPhone.equals(other.customerPhone)
        && customerEmail.equals(other.customerEmail)
        && customerName.equals(other.customerName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerPhone, this.customerEmail, this.customerName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinkCustomerDetailsEntity{"
        + "customerPhone: "
        + customerPhone
        + ", customerEmail: "
        + customerEmail
        + ", customerName: "
        + customerName
        + "}";
  }

  public static CustomerPhoneStage builder() {
    return new Builder();
  }

  public interface CustomerPhoneStage {
    _FinalStage customerPhone(String customerPhone);

    Builder from(LinkCustomerDetailsEntity other);
  }

  public interface _FinalStage {
    LinkCustomerDetailsEntity build();

    _FinalStage customerEmail(Optional<String> customerEmail);

    _FinalStage customerEmail(String customerEmail);

    _FinalStage customerName(Optional<String> customerName);

    _FinalStage customerName(String customerName);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements CustomerPhoneStage, _FinalStage {
    private String customerPhone;

    private Optional<String> customerName = Optional.empty();

    private Optional<String> customerEmail = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(LinkCustomerDetailsEntity other) {
      customerPhone(other.getCustomerPhone());
      customerEmail(other.getCustomerEmail());
      customerName(other.getCustomerName());
      return this;
    }

    /**
     * Customer phone number
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("customer_phone")
    public _FinalStage customerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
      return this;
    }

    /**
     * Customer name
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customerName(String customerName) {
      this.customerName = Optional.of(customerName);
      return this;
    }

    @Override
    @JsonSetter(value = "customer_name", nulls = Nulls.SKIP)
    public _FinalStage customerName(Optional<String> customerName) {
      this.customerName = customerName;
      return this;
    }

    /**
     * Customer email address
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customerEmail(String customerEmail) {
      this.customerEmail = Optional.of(customerEmail);
      return this;
    }

    @Override
    @JsonSetter(value = "customer_email", nulls = Nulls.SKIP)
    public _FinalStage customerEmail(Optional<String> customerEmail) {
      this.customerEmail = customerEmail;
      return this;
    }

    @Override
    public LinkCustomerDetailsEntity build() {
      return new LinkCustomerDetailsEntity(customerPhone, customerEmail, customerName);
    }
  }
}
