package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonDeserialize(builder = OfferAll.Builder.class)
public final class OfferAll {
  private final Map<String, Object> all;

  private int _cachedHashCode;

  OfferAll(Map<String, Object> all) {
    this.all = all;
  }

  @JsonProperty("all")
  public Map<String, Object> getAll() {
    return all;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferAll && equalTo((OfferAll) other);
  }

  private boolean equalTo(OfferAll other) {
    return all.equals(other.all);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.all);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferAll{" + "all: " + all + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Map<String, Object> all = new LinkedHashMap<>();

    private Builder() {}

    public Builder from(OfferAll other) {
      all(other.getAll());
      return this;
    }

    @JsonSetter(value = "all", nulls = Nulls.SKIP)
    public Builder all(Map<String, Object> all) {
      this.all.clear();
      this.all.putAll(all);
      return this;
    }

    public Builder putAllAll(Map<String, Object> all) {
      this.all.putAll(all);
      return this;
    }

    public Builder all(String key, Object value) {
      this.all.put(key, value);
      return this;
    }

    public OfferAll build() {
      return new OfferAll(all);
    }
  }
}
