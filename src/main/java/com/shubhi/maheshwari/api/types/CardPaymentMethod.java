package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = CardPaymentMethod.Builder.class)
public final class CardPaymentMethod {
  private final Card card;

  private int _cachedHashCode;

  CardPaymentMethod(Card card) {
    this.card = card;
  }

  @JsonProperty("card")
  public Card getCard() {
    return card;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardPaymentMethod && equalTo((CardPaymentMethod) other);
  }

  private boolean equalTo(CardPaymentMethod other) {
    return card.equals(other.card);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.card);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardPaymentMethod{" + "card: " + card + "}";
  }

  public static CardStage builder() {
    return new Builder();
  }

  public interface CardStage {
    _FinalStage card(Card card);

    Builder from(CardPaymentMethod other);
  }

  public interface _FinalStage {
    CardPaymentMethod build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements CardStage, _FinalStage {
    private Card card;

    private Builder() {}

    @Override
    public Builder from(CardPaymentMethod other) {
      card(other.getCard());
      return this;
    }

    @Override
    @JsonSetter("card")
    public _FinalStage card(Card card) {
      this.card = card;
      return this;
    }

    @Override
    public CardPaymentMethod build() {
      return new CardPaymentMethod(card);
    }
  }
}
