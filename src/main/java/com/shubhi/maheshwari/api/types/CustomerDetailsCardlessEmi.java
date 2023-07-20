package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = CustomerDetailsCardlessEmi.Builder.class)
public final class CustomerDetailsCardlessEmi {
  private final String customerPhone;

  private int _cachedHashCode;

  CustomerDetailsCardlessEmi(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  /**
   * @return Phone Number of the customer &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 50 characters</code>&lt;/span&gt;
   */
  @JsonProperty("customer_phone")
  public String getCustomerPhone() {
    return customerPhone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CustomerDetailsCardlessEmi
        && equalTo((CustomerDetailsCardlessEmi) other);
  }

  private boolean equalTo(CustomerDetailsCardlessEmi other) {
    return customerPhone.equals(other.customerPhone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerPhone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CustomerDetailsCardlessEmi{" + "customerPhone: " + customerPhone + "}";
  }

  public static CustomerPhoneStage builder() {
    return new Builder();
  }

  public interface CustomerPhoneStage {
    _FinalStage customerPhone(String customerPhone);

    Builder from(CustomerDetailsCardlessEmi other);
  }

  public interface _FinalStage {
    CustomerDetailsCardlessEmi build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements CustomerPhoneStage, _FinalStage {
    private String customerPhone;

    private Builder() {}

    @Override
    public Builder from(CustomerDetailsCardlessEmi other) {
      customerPhone(other.getCustomerPhone());
      return this;
    }

    /**
     * Phone Number of the customer &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 50 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("customer_phone")
    public _FinalStage customerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
      return this;
    }

    @Override
    public CustomerDetailsCardlessEmi build() {
      return new CustomerDetailsCardlessEmi(customerPhone);
    }
  }
}
