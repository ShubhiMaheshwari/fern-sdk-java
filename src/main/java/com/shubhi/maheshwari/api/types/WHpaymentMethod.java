package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WHpaymentMethod.Builder.class)
public final class WHpaymentMethod {
  private final Optional<WHcard> card;

  private int _cachedHashCode;

  WHpaymentMethod(Optional<WHcard> card) {
    this.card = card;
  }

  @JsonProperty("card")
  public Optional<WHcard> getCard() {
    return card;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WHpaymentMethod && equalTo((WHpaymentMethod) other);
  }

  private boolean equalTo(WHpaymentMethod other) {
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
    return "WHpaymentMethod{" + "card: " + card + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<WHcard> card = Optional.empty();

    private Builder() {}

    public Builder from(WHpaymentMethod other) {
      card(other.getCard());
      return this;
    }

    @JsonSetter(value = "card", nulls = Nulls.SKIP)
    public Builder card(Optional<WHcard> card) {
      this.card = card;
      return this;
    }

    public Builder card(WHcard card) {
      this.card = Optional.of(card);
      return this;
    }

    public WHpaymentMethod build() {
      return new WHpaymentMethod(card);
    }
  }
}
