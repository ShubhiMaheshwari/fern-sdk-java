package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = DiscountDetails.Builder.class)
public final class DiscountDetails {
  private final DiscountDetailsDiscountType discountType;

  private final String discountValue;

  private final String maxDiscountAmount;

  private int _cachedHashCode;

  DiscountDetails(
      DiscountDetailsDiscountType discountType, String discountValue, String maxDiscountAmount) {
    this.discountType = discountType;
    this.discountValue = discountValue;
    this.maxDiscountAmount = maxDiscountAmount;
  }

  /**
   * @return Type of discount
   */
  @JsonProperty("discount_type")
  public DiscountDetailsDiscountType getDiscountType() {
    return discountType;
  }

  /**
   * @return Value of Discount. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("discount_value")
  public String getDiscountValue() {
    return discountValue;
  }

  /**
   * @return Maximum Value of Discount allowed. &lt;span style=&quot;white-space: nowrap&quot;&gt;
   *     <code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("max_discount_amount")
  public String getMaxDiscountAmount() {
    return maxDiscountAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DiscountDetails && equalTo((DiscountDetails) other);
  }

  private boolean equalTo(DiscountDetails other) {
    return discountType.equals(other.discountType)
        && discountValue.equals(other.discountValue)
        && maxDiscountAmount.equals(other.maxDiscountAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.discountType, this.discountValue, this.maxDiscountAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DiscountDetails{"
        + "discountType: "
        + discountType
        + ", discountValue: "
        + discountValue
        + ", maxDiscountAmount: "
        + maxDiscountAmount
        + "}";
  }

  public static DiscountTypeStage builder() {
    return new Builder();
  }

  public interface DiscountTypeStage {
    DiscountValueStage discountType(DiscountDetailsDiscountType discountType);

    Builder from(DiscountDetails other);
  }

  public interface DiscountValueStage {
    MaxDiscountAmountStage discountValue(String discountValue);
  }

  public interface MaxDiscountAmountStage {
    _FinalStage maxDiscountAmount(String maxDiscountAmount);
  }

  public interface _FinalStage {
    DiscountDetails build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements DiscountTypeStage, DiscountValueStage, MaxDiscountAmountStage, _FinalStage {
    private DiscountDetailsDiscountType discountType;

    private String discountValue;

    private String maxDiscountAmount;

    private Builder() {}

    @Override
    public Builder from(DiscountDetails other) {
      discountType(other.getDiscountType());
      discountValue(other.getDiscountValue());
      maxDiscountAmount(other.getMaxDiscountAmount());
      return this;
    }

    /**
     * Type of discount
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("discount_type")
    public DiscountValueStage discountType(DiscountDetailsDiscountType discountType) {
      this.discountType = discountType;
      return this;
    }

    /**
     * Value of Discount. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("discount_value")
    public MaxDiscountAmountStage discountValue(String discountValue) {
      this.discountValue = discountValue;
      return this;
    }

    /**
     * Maximum Value of Discount allowed. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("max_discount_amount")
    public _FinalStage maxDiscountAmount(String maxDiscountAmount) {
      this.maxDiscountAmount = maxDiscountAmount;
      return this;
    }

    @Override
    public DiscountDetails build() {
      return new DiscountDetails(discountType, discountValue, maxDiscountAmount);
    }
  }
}
