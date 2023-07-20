package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = CardlessEmiPaymentMethod.Builder.class)
public final class CardlessEmiPaymentMethod {
  private final CardlessEmi cardlessEmi;

  private int _cachedHashCode;

  CardlessEmiPaymentMethod(CardlessEmi cardlessEmi) {
    this.cardlessEmi = cardlessEmi;
  }

  @JsonProperty("cardless_emi")
  public CardlessEmi getCardlessEmi() {
    return cardlessEmi;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardlessEmiPaymentMethod && equalTo((CardlessEmiPaymentMethod) other);
  }

  private boolean equalTo(CardlessEmiPaymentMethod other) {
    return cardlessEmi.equals(other.cardlessEmi);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.cardlessEmi);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardlessEmiPaymentMethod{" + "cardlessEmi: " + cardlessEmi + "}";
  }

  public static CardlessEmiStage builder() {
    return new Builder();
  }

  public interface CardlessEmiStage {
    _FinalStage cardlessEmi(CardlessEmi cardlessEmi);

    Builder from(CardlessEmiPaymentMethod other);
  }

  public interface _FinalStage {
    CardlessEmiPaymentMethod build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements CardlessEmiStage, _FinalStage {
    private CardlessEmi cardlessEmi;

    private Builder() {}

    @Override
    public Builder from(CardlessEmiPaymentMethod other) {
      cardlessEmi(other.getCardlessEmi());
      return this;
    }

    @Override
    @JsonSetter("cardless_emi")
    public _FinalStage cardlessEmi(CardlessEmi cardlessEmi) {
      this.cardlessEmi = cardlessEmi;
      return this;
    }

    @Override
    public CardlessEmiPaymentMethod build() {
      return new CardlessEmiPaymentMethod(cardlessEmi);
    }
  }
}
