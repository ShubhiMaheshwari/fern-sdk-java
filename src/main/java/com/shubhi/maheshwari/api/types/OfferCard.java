package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = OfferCard.Builder.class)
public final class OfferCard {
  private final CardOffer card;

  private int _cachedHashCode;

  OfferCard(CardOffer card) {
    this.card = card;
  }

  @JsonProperty("card")
  public CardOffer getCard() {
    return card;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferCard && equalTo((OfferCard) other);
  }

  private boolean equalTo(OfferCard other) {
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
    return "OfferCard{" + "card: " + card + "}";
  }

  public static CardStage builder() {
    return new Builder();
  }

  public interface CardStage {
    _FinalStage card(CardOffer card);

    Builder from(OfferCard other);
  }

  public interface _FinalStage {
    OfferCard build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements CardStage, _FinalStage {
    private CardOffer card;

    private Builder() {}

    @Override
    public Builder from(OfferCard other) {
      card(other.getCard());
      return this;
    }

    @Override
    @JsonSetter("card")
    public _FinalStage card(CardOffer card) {
      this.card = card;
      return this;
    }

    @Override
    public OfferCard build() {
      return new OfferCard(card);
    }
  }
}
