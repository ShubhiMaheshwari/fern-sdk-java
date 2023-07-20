package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CustomerDetails.Builder.class)
public final class CustomerDetails {
  private final String customerId;

  private final Optional<String> customerEmail;

  private final String customerPhone;

  private final Optional<String> customerBankAccountNumber;

  private final Optional<String> customerBankIfsc;

  private final Optional<String> customerBankCode;

  private int _cachedHashCode;

  CustomerDetails(
      String customerId,
      Optional<String> customerEmail,
      String customerPhone,
      Optional<String> customerBankAccountNumber,
      Optional<String> customerBankIfsc,
      Optional<String> customerBankCode) {
    this.customerId = customerId;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;
    this.customerBankAccountNumber = customerBankAccountNumber;
    this.customerBankIfsc = customerBankIfsc;
    this.customerBankCode = customerBankCode;
  }

  /**
   * @return A unique identifier for the customer. Use alphanumeric values only. &lt;span
   *     style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
   */
  @JsonProperty("customer_id")
  public String getCustomerId() {
    return customerId;
  }

  /**
   * @return Customer email address. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("customer_email")
  public Optional<String> getCustomerEmail() {
    return customerEmail;
  }

  /**
   * @return Customer phone number. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 10 characters</code>&lt;/span&gt;
   */
  @JsonProperty("customer_phone")
  public String getCustomerPhone() {
    return customerPhone;
  }

  /**
   * @return Customer bank account. Required if you want to do a bank account check (TPV) &lt;span
   *     style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 20 characters</code>&lt;/span&gt;
   */
  @JsonProperty("customer_bank_account_number")
  public Optional<String> getCustomerBankAccountNumber() {
    return customerBankAccountNumber;
  }

  /**
   * @return Customer bank IFSC. Required if you want to do a bank account check (TPV)
   */
  @JsonProperty("customer_bank_ifsc")
  public Optional<String> getCustomerBankIfsc() {
    return customerBankIfsc;
  }

  /**
   * @return Customer bank code. Required for net banking payments, if you want to do a bank account
   *     check (TPV)
   */
  @JsonProperty("customer_bank_code")
  public Optional<String> getCustomerBankCode() {
    return customerBankCode;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CustomerDetails && equalTo((CustomerDetails) other);
  }

  private boolean equalTo(CustomerDetails other) {
    return customerId.equals(other.customerId)
        && customerEmail.equals(other.customerEmail)
        && customerPhone.equals(other.customerPhone)
        && customerBankAccountNumber.equals(other.customerBankAccountNumber)
        && customerBankIfsc.equals(other.customerBankIfsc)
        && customerBankCode.equals(other.customerBankCode);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.customerId,
              this.customerEmail,
              this.customerPhone,
              this.customerBankAccountNumber,
              this.customerBankIfsc,
              this.customerBankCode);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CustomerDetails{"
        + "customerId: "
        + customerId
        + ", customerEmail: "
        + customerEmail
        + ", customerPhone: "
        + customerPhone
        + ", customerBankAccountNumber: "
        + customerBankAccountNumber
        + ", customerBankIfsc: "
        + customerBankIfsc
        + ", customerBankCode: "
        + customerBankCode
        + "}";
  }

  public static CustomerIdStage builder() {
    return new Builder();
  }

  public interface CustomerIdStage {
    CustomerPhoneStage customerId(String customerId);

    Builder from(CustomerDetails other);
  }

  public interface CustomerPhoneStage {
    _FinalStage customerPhone(String customerPhone);
  }

  public interface _FinalStage {
    CustomerDetails build();

    _FinalStage customerEmail(Optional<String> customerEmail);

    _FinalStage customerEmail(String customerEmail);

    _FinalStage customerBankAccountNumber(Optional<String> customerBankAccountNumber);

    _FinalStage customerBankAccountNumber(String customerBankAccountNumber);

    _FinalStage customerBankIfsc(Optional<String> customerBankIfsc);

    _FinalStage customerBankIfsc(String customerBankIfsc);

    _FinalStage customerBankCode(Optional<String> customerBankCode);

    _FinalStage customerBankCode(String customerBankCode);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements CustomerIdStage, CustomerPhoneStage, _FinalStage {
    private String customerId;

    private String customerPhone;

    private Optional<String> customerBankCode = Optional.empty();

    private Optional<String> customerBankIfsc = Optional.empty();

    private Optional<String> customerBankAccountNumber = Optional.empty();

    private Optional<String> customerEmail = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(CustomerDetails other) {
      customerId(other.getCustomerId());
      customerEmail(other.getCustomerEmail());
      customerPhone(other.getCustomerPhone());
      customerBankAccountNumber(other.getCustomerBankAccountNumber());
      customerBankIfsc(other.getCustomerBankIfsc());
      customerBankCode(other.getCustomerBankCode());
      return this;
    }

    /**
     * A unique identifier for the customer. Use alphanumeric values only. &lt;span
     * style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("customer_id")
    public CustomerPhoneStage customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * Customer phone number. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 10 characters</code>&lt;/span&gt;
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
     * Customer bank code. Required for net banking payments, if you want to do a bank account check
     * (TPV)
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customerBankCode(String customerBankCode) {
      this.customerBankCode = Optional.of(customerBankCode);
      return this;
    }

    @Override
    @JsonSetter(value = "customer_bank_code", nulls = Nulls.SKIP)
    public _FinalStage customerBankCode(Optional<String> customerBankCode) {
      this.customerBankCode = customerBankCode;
      return this;
    }

    /**
     * Customer bank IFSC. Required if you want to do a bank account check (TPV)
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customerBankIfsc(String customerBankIfsc) {
      this.customerBankIfsc = Optional.of(customerBankIfsc);
      return this;
    }

    @Override
    @JsonSetter(value = "customer_bank_ifsc", nulls = Nulls.SKIP)
    public _FinalStage customerBankIfsc(Optional<String> customerBankIfsc) {
      this.customerBankIfsc = customerBankIfsc;
      return this;
    }

    /**
     * Customer bank account. Required if you want to do a bank account check (TPV) &lt;span
     * style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 20 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customerBankAccountNumber(String customerBankAccountNumber) {
      this.customerBankAccountNumber = Optional.of(customerBankAccountNumber);
      return this;
    }

    @Override
    @JsonSetter(value = "customer_bank_account_number", nulls = Nulls.SKIP)
    public _FinalStage customerBankAccountNumber(Optional<String> customerBankAccountNumber) {
      this.customerBankAccountNumber = customerBankAccountNumber;
      return this;
    }

    /**
     * Customer email address. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
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
    public CustomerDetails build() {
      return new CustomerDetails(
          customerId,
          customerEmail,
          customerPhone,
          customerBankAccountNumber,
          customerBankIfsc,
          customerBankCode);
    }
  }
}
