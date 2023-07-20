package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferNb.Builder.class)
public final class OfferNb {
  private final Optional<NbOffer> netbanking;

  private int _cachedHashCode;

  OfferNb(Optional<NbOffer> netbanking) {
    this.netbanking = netbanking;
  }

  @JsonProperty("netbanking")
  public Optional<NbOffer> getNetbanking() {
    return netbanking;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferNb && equalTo((OfferNb) other);
  }

  private boolean equalTo(OfferNb other) {
    return netbanking.equals(other.netbanking);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.netbanking);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferNb{" + "netbanking: " + netbanking + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<NbOffer> netbanking = Optional.empty();

    private Builder() {}

    public Builder from(OfferNb other) {
      netbanking(other.getNetbanking());
      return this;
    }

    @JsonSetter(value = "netbanking", nulls = Nulls.SKIP)
    public Builder netbanking(Optional<NbOffer> netbanking) {
      this.netbanking = netbanking;
      return this;
    }

    public Builder netbanking(NbOffer netbanking) {
      this.netbanking = Optional.of(netbanking);
      return this;
    }

    public OfferNb build() {
      return new OfferNb(netbanking);
    }
  }
}
