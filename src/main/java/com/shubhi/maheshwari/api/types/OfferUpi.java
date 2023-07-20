package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonDeserialize(builder = OfferUpi.Builder.class)
public final class OfferUpi {
  private final Map<String, Object> upi;

  private int _cachedHashCode;

  OfferUpi(Map<String, Object> upi) {
    this.upi = upi;
  }

  @JsonProperty("upi")
  public Map<String, Object> getUpi() {
    return upi;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferUpi && equalTo((OfferUpi) other);
  }

  private boolean equalTo(OfferUpi other) {
    return upi.equals(other.upi);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.upi);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferUpi{" + "upi: " + upi + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Map<String, Object> upi = new LinkedHashMap<>();

    private Builder() {}

    public Builder from(OfferUpi other) {
      upi(other.getUpi());
      return this;
    }

    @JsonSetter(value = "upi", nulls = Nulls.SKIP)
    public Builder upi(Map<String, Object> upi) {
      this.upi.clear();
      this.upi.putAll(upi);
      return this;
    }

    public Builder putAllUpi(Map<String, Object> upi) {
      this.upi.putAll(upi);
      return this;
    }

    public Builder upi(String key, Object value) {
      this.upi.put(key, value);
      return this;
    }

    public OfferUpi build() {
      return new OfferUpi(upi);
    }
  }
}
