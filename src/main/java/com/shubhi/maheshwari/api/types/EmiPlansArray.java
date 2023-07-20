package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = EmiPlansArray.Builder.class)
public final class EmiPlansArray {
  private final Optional<Integer> tenure;

  private final Optional<Integer> interestRate;

  private final Optional<String> currency;

  private final Optional<Integer> emi;

  private final Optional<Integer> totalInterest;

  private final Optional<Integer> totalAmount;

  private int _cachedHashCode;

  EmiPlansArray(
      Optional<Integer> tenure,
      Optional<Integer> interestRate,
      Optional<String> currency,
      Optional<Integer> emi,
      Optional<Integer> totalInterest,
      Optional<Integer> totalAmount) {
    this.tenure = tenure;
    this.interestRate = interestRate;
    this.currency = currency;
    this.emi = emi;
    this.totalInterest = totalInterest;
    this.totalAmount = totalAmount;
  }

  @JsonProperty("tenure")
  public Optional<Integer> getTenure() {
    return tenure;
  }

  @JsonProperty("interest_rate")
  public Optional<Integer> getInterestRate() {
    return interestRate;
  }

  /**
   * @return &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 50 characters</code>
   *     &lt;/span&gt;
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  @JsonProperty("emi")
  public Optional<Integer> getEmi() {
    return emi;
  }

  @JsonProperty("total_interest")
  public Optional<Integer> getTotalInterest() {
    return totalInterest;
  }

  @JsonProperty("total_amount")
  public Optional<Integer> getTotalAmount() {
    return totalAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmiPlansArray && equalTo((EmiPlansArray) other);
  }

  private boolean equalTo(EmiPlansArray other) {
    return tenure.equals(other.tenure)
        && interestRate.equals(other.interestRate)
        && currency.equals(other.currency)
        && emi.equals(other.emi)
        && totalInterest.equals(other.totalInterest)
        && totalAmount.equals(other.totalAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.tenure,
              this.interestRate,
              this.currency,
              this.emi,
              this.totalInterest,
              this.totalAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmiPlansArray{"
        + "tenure: "
        + tenure
        + ", interestRate: "
        + interestRate
        + ", currency: "
        + currency
        + ", emi: "
        + emi
        + ", totalInterest: "
        + totalInterest
        + ", totalAmount: "
        + totalAmount
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> tenure = Optional.empty();

    private Optional<Integer> interestRate = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<Integer> emi = Optional.empty();

    private Optional<Integer> totalInterest = Optional.empty();

    private Optional<Integer> totalAmount = Optional.empty();

    private Builder() {}

    public Builder from(EmiPlansArray other) {
      tenure(other.getTenure());
      interestRate(other.getInterestRate());
      currency(other.getCurrency());
      emi(other.getEmi());
      totalInterest(other.getTotalInterest());
      totalAmount(other.getTotalAmount());
      return this;
    }

    @JsonSetter(value = "tenure", nulls = Nulls.SKIP)
    public Builder tenure(Optional<Integer> tenure) {
      this.tenure = tenure;
      return this;
    }

    public Builder tenure(Integer tenure) {
      this.tenure = Optional.of(tenure);
      return this;
    }

    @JsonSetter(value = "interest_rate", nulls = Nulls.SKIP)
    public Builder interestRate(Optional<Integer> interestRate) {
      this.interestRate = interestRate;
      return this;
    }

    public Builder interestRate(Integer interestRate) {
      this.interestRate = Optional.of(interestRate);
      return this;
    }

    @JsonSetter(value = "currency", nulls = Nulls.SKIP)
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(value = "emi", nulls = Nulls.SKIP)
    public Builder emi(Optional<Integer> emi) {
      this.emi = emi;
      return this;
    }

    public Builder emi(Integer emi) {
      this.emi = Optional.of(emi);
      return this;
    }

    @JsonSetter(value = "total_interest", nulls = Nulls.SKIP)
    public Builder totalInterest(Optional<Integer> totalInterest) {
      this.totalInterest = totalInterest;
      return this;
    }

    public Builder totalInterest(Integer totalInterest) {
      this.totalInterest = Optional.of(totalInterest);
      return this;
    }

    @JsonSetter(value = "total_amount", nulls = Nulls.SKIP)
    public Builder totalAmount(Optional<Integer> totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    public Builder totalAmount(Integer totalAmount) {
      this.totalAmount = Optional.of(totalAmount);
      return this;
    }

    public EmiPlansArray build() {
      return new EmiPlansArray(tenure, interestRate, currency, emi, totalInterest, totalAmount);
    }
  }
}
