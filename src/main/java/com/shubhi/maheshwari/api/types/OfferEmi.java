package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = OfferEmi.Builder.class)
public final class OfferEmi {
  private final EmiOffer emi;

  private int _cachedHashCode;

  OfferEmi(EmiOffer emi) {
    this.emi = emi;
  }

  @JsonProperty("emi")
  public EmiOffer getEmi() {
    return emi;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferEmi && equalTo((OfferEmi) other);
  }

  private boolean equalTo(OfferEmi other) {
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
    return "OfferEmi{" + "emi: " + emi + "}";
  }

  public static EmiStage builder() {
    return new Builder();
  }

  public interface EmiStage {
    _FinalStage emi(EmiOffer emi);

    Builder from(OfferEmi other);
  }

  public interface _FinalStage {
    OfferEmi build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements EmiStage, _FinalStage {
    private EmiOffer emi;

    private Builder() {}

    @Override
    public Builder from(OfferEmi other) {
      emi(other.getEmi());
      return this;
    }

    @Override
    @JsonSetter("emi")
    public _FinalStage emi(EmiOffer emi) {
      this.emi = emi;
      return this;
    }

    @Override
    public OfferEmi build() {
      return new OfferEmi(emi);
    }
  }
}
