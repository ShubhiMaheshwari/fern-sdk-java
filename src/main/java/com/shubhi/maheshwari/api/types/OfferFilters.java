package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferFilters.Builder.class)
public final class OfferFilters {
  private final Optional<List<OfferType>> offerType;

  private int _cachedHashCode;

  OfferFilters(Optional<List<OfferType>> offerType) {
    this.offerType = offerType;
  }

  /**
   * @return Array of offer_type to be filtered.
   */
  @JsonProperty("offer_type")
  public Optional<List<OfferType>> getOfferType() {
    return offerType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferFilters && equalTo((OfferFilters) other);
  }

  private boolean equalTo(OfferFilters other) {
    return offerType.equals(other.offerType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.offerType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferFilters{" + "offerType: " + offerType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<List<OfferType>> offerType = Optional.empty();

    private Builder() {}

    public Builder from(OfferFilters other) {
      offerType(other.getOfferType());
      return this;
    }

    @JsonSetter(value = "offer_type", nulls = Nulls.SKIP)
    public Builder offerType(Optional<List<OfferType>> offerType) {
      this.offerType = offerType;
      return this;
    }

    public Builder offerType(List<OfferType> offerType) {
      this.offerType = Optional.of(offerType);
      return this;
    }

    public OfferFilters build() {
      return new OfferFilters(offerType);
    }
  }
}
