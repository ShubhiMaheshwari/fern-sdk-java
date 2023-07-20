package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = OfferPaylater.Builder.class)
public final class OfferPaylater {
  private final PaylaterOffer paylater;

  private int _cachedHashCode;

  OfferPaylater(PaylaterOffer paylater) {
    this.paylater = paylater;
  }

  @JsonProperty("paylater")
  public PaylaterOffer getPaylater() {
    return paylater;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferPaylater && equalTo((OfferPaylater) other);
  }

  private boolean equalTo(OfferPaylater other) {
    return paylater.equals(other.paylater);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paylater);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferPaylater{" + "paylater: " + paylater + "}";
  }

  public static PaylaterStage builder() {
    return new Builder();
  }

  public interface PaylaterStage {
    _FinalStage paylater(PaylaterOffer paylater);

    Builder from(OfferPaylater other);
  }

  public interface _FinalStage {
    OfferPaylater build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements PaylaterStage, _FinalStage {
    private PaylaterOffer paylater;

    private Builder() {}

    @Override
    public Builder from(OfferPaylater other) {
      paylater(other.getPaylater());
      return this;
    }

    @Override
    @JsonSetter("paylater")
    public _FinalStage paylater(PaylaterOffer paylater) {
      this.paylater = paylater;
      return this;
    }

    @Override
    public OfferPaylater build() {
      return new OfferPaylater(paylater);
    }
  }
}
