package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferValidations.Builder.class)
public final class OfferValidations {
  private final Optional<String> minAmount;

  private final OfferValidationsPaymentMethod paymentMethod;

  private final String maxAllowed;

  private int _cachedHashCode;

  OfferValidations(
      Optional<String> minAmount, OfferValidationsPaymentMethod paymentMethod, String maxAllowed) {
    this.minAmount = minAmount;
    this.paymentMethod = paymentMethod;
    this.maxAllowed = maxAllowed;
  }

  /**
   * @return Minimum Amount for Offer to be Applicable &lt;span style=&quot;white-space:
   *     nowrap&quot;&gt;<code>&lt;= 50 characters</code>&lt;/span&gt;
   */
  @JsonProperty("min_amount")
  public Optional<String> getMinAmount() {
    return minAmount;
  }

  @JsonProperty("payment_method")
  public OfferValidationsPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * @return Maximum amount of Offer that can be availed. &lt;span style=&quot;white-space:
   *     nowrap&quot;&gt;<code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("max_allowed")
  public String getMaxAllowed() {
    return maxAllowed;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferValidations && equalTo((OfferValidations) other);
  }

  private boolean equalTo(OfferValidations other) {
    return minAmount.equals(other.minAmount)
        && paymentMethod.equals(other.paymentMethod)
        && maxAllowed.equals(other.maxAllowed);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.minAmount, this.paymentMethod, this.maxAllowed);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferValidations{"
        + "minAmount: "
        + minAmount
        + ", paymentMethod: "
        + paymentMethod
        + ", maxAllowed: "
        + maxAllowed
        + "}";
  }

  public static PaymentMethodStage builder() {
    return new Builder();
  }

  public interface PaymentMethodStage {
    MaxAllowedStage paymentMethod(OfferValidationsPaymentMethod paymentMethod);

    Builder from(OfferValidations other);
  }

  public interface MaxAllowedStage {
    _FinalStage maxAllowed(String maxAllowed);
  }

  public interface _FinalStage {
    OfferValidations build();

    _FinalStage minAmount(Optional<String> minAmount);

    _FinalStage minAmount(String minAmount);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements PaymentMethodStage, MaxAllowedStage, _FinalStage {
    private OfferValidationsPaymentMethod paymentMethod;

    private String maxAllowed;

    private Optional<String> minAmount = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(OfferValidations other) {
      minAmount(other.getMinAmount());
      paymentMethod(other.getPaymentMethod());
      maxAllowed(other.getMaxAllowed());
      return this;
    }

    @Override
    @JsonSetter("payment_method")
    public MaxAllowedStage paymentMethod(OfferValidationsPaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Maximum amount of Offer that can be availed. &lt;span style=&quot;white-space:
     * nowrap&quot;&gt;<code>&lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("max_allowed")
    public _FinalStage maxAllowed(String maxAllowed) {
      this.maxAllowed = maxAllowed;
      return this;
    }

    /**
     * Minimum Amount for Offer to be Applicable &lt;span style=&quot;white-space: nowrap&quot;&gt;
     * <code>&lt;= 50 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage minAmount(String minAmount) {
      this.minAmount = Optional.of(minAmount);
      return this;
    }

    @Override
    @JsonSetter(value = "min_amount", nulls = Nulls.SKIP)
    public _FinalStage minAmount(Optional<String> minAmount) {
      this.minAmount = minAmount;
      return this;
    }

    @Override
    public OfferValidations build() {
      return new OfferValidations(minAmount, paymentMethod, maxAllowed);
    }
  }
}
