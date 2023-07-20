package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = SettlementUrlObject.Builder.class)
public final class SettlementUrlObject {
  private final Optional<String> url;

  private int _cachedHashCode;

  SettlementUrlObject(Optional<String> url) {
    this.url = url;
  }

  @JsonProperty("url")
  public Optional<String> getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SettlementUrlObject && equalTo((SettlementUrlObject) other);
  }

  private boolean equalTo(SettlementUrlObject other) {
    return url.equals(other.url);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.url);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SettlementUrlObject{" + "url: " + url + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> url = Optional.empty();

    private Builder() {}

    public Builder from(SettlementUrlObject other) {
      url(other.getUrl());
      return this;
    }

    @JsonSetter(value = "url", nulls = Nulls.SKIP)
    public Builder url(Optional<String> url) {
      this.url = url;
      return this;
    }

    public Builder url(String url) {
      this.url = Optional.of(url);
      return this;
    }

    public SettlementUrlObject build() {
      return new SettlementUrlObject(url);
    }
  }
}
