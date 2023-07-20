package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = RefundUrlObject.Builder.class)
public final class RefundUrlObject {
  private final Optional<String> url;

  private int _cachedHashCode;

  RefundUrlObject(Optional<String> url) {
    this.url = url;
  }

  @JsonProperty("url")
  public Optional<String> getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RefundUrlObject && equalTo((RefundUrlObject) other);
  }

  private boolean equalTo(RefundUrlObject other) {
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
    return "RefundUrlObject{" + "url: " + url + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> url = Optional.empty();

    private Builder() {}

    public Builder from(RefundUrlObject other) {
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

    public RefundUrlObject build() {
      return new RefundUrlObject(url);
    }
  }
}
