package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaylaterOffer.Builder.class)
public final class PaylaterOffer {
  private final Optional<String> provider;

  private int _cachedHashCode;

  PaylaterOffer(Optional<String> provider) {
    this.provider = provider;
  }

  @JsonProperty("provider")
  public Optional<String> getProvider() {
    return provider;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaylaterOffer && equalTo((PaylaterOffer) other);
  }

  private boolean equalTo(PaylaterOffer other) {
    return provider.equals(other.provider);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.provider);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaylaterOffer{" + "provider: " + provider + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> provider = Optional.empty();

    private Builder() {}

    public Builder from(PaylaterOffer other) {
      provider(other.getProvider());
      return this;
    }

    @JsonSetter(value = "provider", nulls = Nulls.SKIP)
    public Builder provider(Optional<String> provider) {
      this.provider = provider;
      return this;
    }

    public Builder provider(String provider) {
      this.provider = Optional.of(provider);
      return this;
    }

    public PaylaterOffer build() {
      return new PaylaterOffer(provider);
    }
  }
}
