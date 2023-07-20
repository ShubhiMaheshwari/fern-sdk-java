package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CardlessEmiEntity.Builder.class)
public final class CardlessEmiEntity {
  private final Optional<String> paymentMethod;

  private final Optional<List<EmiPlansArray>> emiPlans;

  private int _cachedHashCode;

  CardlessEmiEntity(Optional<String> paymentMethod, Optional<List<EmiPlansArray>> emiPlans) {
    this.paymentMethod = paymentMethod;
    this.emiPlans = emiPlans;
  }

  /**
   * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>
   *     &lt;/span&gt;
   */
  @JsonProperty("payment_method")
  public Optional<String> getPaymentMethod() {
    return paymentMethod;
  }

  @JsonProperty("emi_plans")
  public Optional<List<EmiPlansArray>> getEmiPlans() {
    return emiPlans;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardlessEmiEntity && equalTo((CardlessEmiEntity) other);
  }

  private boolean equalTo(CardlessEmiEntity other) {
    return paymentMethod.equals(other.paymentMethod) && emiPlans.equals(other.emiPlans);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paymentMethod, this.emiPlans);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardlessEmiEntity{"
        + "paymentMethod: "
        + paymentMethod
        + ", emiPlans: "
        + emiPlans
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> paymentMethod = Optional.empty();

    private Optional<List<EmiPlansArray>> emiPlans = Optional.empty();

    private Builder() {}

    public Builder from(CardlessEmiEntity other) {
      paymentMethod(other.getPaymentMethod());
      emiPlans(other.getEmiPlans());
      return this;
    }

    @JsonSetter(value = "payment_method", nulls = Nulls.SKIP)
    public Builder paymentMethod(Optional<String> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    @JsonSetter(value = "emi_plans", nulls = Nulls.SKIP)
    public Builder emiPlans(Optional<List<EmiPlansArray>> emiPlans) {
      this.emiPlans = emiPlans;
      return this;
    }

    public Builder emiPlans(List<EmiPlansArray> emiPlans) {
      this.emiPlans = Optional.of(emiPlans);
      return this;
    }

    public CardlessEmiEntity build() {
      return new CardlessEmiEntity(paymentMethod, emiPlans);
    }
  }
}
