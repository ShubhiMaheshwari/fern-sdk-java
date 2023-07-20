package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CardEmiPaymentMethod.Builder.class)
public final class CardEmiPaymentMethod {
  private final Optional<CardEmi> emi;

  private int _cachedHashCode;

  CardEmiPaymentMethod(Optional<CardEmi> emi) {
    this.emi = emi;
  }

  @JsonProperty("emi")
  public Optional<CardEmi> getEmi() {
    return emi;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardEmiPaymentMethod && equalTo((CardEmiPaymentMethod) other);
  }

  private boolean equalTo(CardEmiPaymentMethod other) {
    return emi.equals(other.emi);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.emi);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardEmiPaymentMethod{" + "emi: " + emi + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<CardEmi> emi = Optional.empty();

    private Builder() {}

    public Builder from(CardEmiPaymentMethod other) {
      emi(other.getEmi());
      return this;
    }

    @JsonSetter(value = "emi", nulls = Nulls.SKIP)
    public Builder emi(Optional<CardEmi> emi) {
      this.emi = emi;
      return this;
    }

    public Builder emi(CardEmi emi) {
      this.emi = Optional.of(emi);
      return this;
    }

    public CardEmiPaymentMethod build() {
      return new CardEmiPaymentMethod(emi);
    }
  }
}
