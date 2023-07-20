package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CashbackDetails.Builder.class)
public final class CashbackDetails {
  private final Optional<CashbackDetailsCashbackType> cashbackType;

  private final Optional<String> cashbackValue;

  private final String maxCashbackAmount;

  private int _cachedHashCode;

  CashbackDetails(
      Optional<CashbackDetailsCashbackType> cashbackType,
      Optional<String> cashbackValue,
      String maxCashbackAmount) {
    this.cashbackType = cashbackType;
    this.cashbackValue = cashbackValue;
    this.maxCashbackAmount = maxCashbackAmount;
  }

  /**
   * @return Type of discount
   */
  @JsonProperty("cashback_type")
  public Optional<CashbackDetailsCashbackType> getCashbackType() {
    return cashbackType;
  }

  /**
   * @return Value of Discount. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("cashback_value")
  public Optional<String> getCashbackValue() {
    return cashbackValue;
  }

  /**
   * @return Maximum Value of Cashback allowed. &lt;span style=&quot;white-space: nowrap&quot;&gt;
   *     <code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("max_cashback_amount")
  public String getMaxCashbackAmount() {
    return maxCashbackAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CashbackDetails && equalTo((CashbackDetails) other);
  }

  private boolean equalTo(CashbackDetails other) {
    return cashbackType.equals(other.cashbackType)
        && cashbackValue.equals(other.cashbackValue)
        && maxCashbackAmount.equals(other.maxCashbackAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.cashbackType, this.cashbackValue, this.maxCashbackAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CashbackDetails{"
        + "cashbackType: "
        + cashbackType
        + ", cashbackValue: "
        + cashbackValue
        + ", maxCashbackAmount: "
        + maxCashbackAmount
        + "}";
  }

  public static MaxCashbackAmountStage builder() {
    return new Builder();
  }

  public interface MaxCashbackAmountStage {
    _FinalStage maxCashbackAmount(String maxCashbackAmount);

    Builder from(CashbackDetails other);
  }

  public interface _FinalStage {
    CashbackDetails build();

    _FinalStage cashbackType(Optional<CashbackDetailsCashbackType> cashbackType);

    _FinalStage cashbackType(CashbackDetailsCashbackType cashbackType);

    _FinalStage cashbackValue(Optional<String> cashbackValue);

    _FinalStage cashbackValue(String cashbackValue);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements MaxCashbackAmountStage, _FinalStage {
    private String maxCashbackAmount;

    private Optional<String> cashbackValue = Optional.empty();

    private Optional<CashbackDetailsCashbackType> cashbackType = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(CashbackDetails other) {
      cashbackType(other.getCashbackType());
      cashbackValue(other.getCashbackValue());
      maxCashbackAmount(other.getMaxCashbackAmount());
      return this;
    }

    /**
     * Maximum Value of Cashback allowed. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("max_cashback_amount")
    public _FinalStage maxCashbackAmount(String maxCashbackAmount) {
      this.maxCashbackAmount = maxCashbackAmount;
      return this;
    }

    /**
     * Value of Discount. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cashbackValue(String cashbackValue) {
      this.cashbackValue = Optional.of(cashbackValue);
      return this;
    }

    @Override
    @JsonSetter(value = "cashback_value", nulls = Nulls.SKIP)
    public _FinalStage cashbackValue(Optional<String> cashbackValue) {
      this.cashbackValue = cashbackValue;
      return this;
    }

    /**
     * Type of discount
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cashbackType(CashbackDetailsCashbackType cashbackType) {
      this.cashbackType = Optional.of(cashbackType);
      return this;
    }

    @Override
    @JsonSetter(value = "cashback_type", nulls = Nulls.SKIP)
    public _FinalStage cashbackType(Optional<CashbackDetailsCashbackType> cashbackType) {
      this.cashbackType = cashbackType;
      return this;
    }

    @Override
    public CashbackDetails build() {
      return new CashbackDetails(cashbackType, cashbackValue, maxCashbackAmount);
    }
  }
}
