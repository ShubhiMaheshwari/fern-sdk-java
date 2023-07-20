package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OrderPayData.Builder.class)
public final class OrderPayData {
  private final Optional<String> url;

  private final Optional<Map<String, Object>> payload;

  private final Optional<String> contentType;

  private final Optional<String> method;

  private int _cachedHashCode;

  OrderPayData(
      Optional<String> url,
      Optional<Map<String, Object>> payload,
      Optional<String> contentType,
      Optional<String> method) {
    this.url = url;
    this.payload = payload;
    this.contentType = contentType;
    this.method = method;
  }

  @JsonProperty("url")
  public Optional<String> getUrl() {
    return url;
  }

  @JsonProperty("payload")
  public Optional<Map<String, Object>> getPayload() {
    return payload;
  }

  @JsonProperty("content_type")
  public Optional<String> getContentType() {
    return contentType;
  }

  @JsonProperty("method")
  public Optional<String> getMethod() {
    return method;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrderPayData && equalTo((OrderPayData) other);
  }

  private boolean equalTo(OrderPayData other) {
    return url.equals(other.url)
        && payload.equals(other.payload)
        && contentType.equals(other.contentType)
        && method.equals(other.method);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.url, this.payload, this.contentType, this.method);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OrderPayData{"
        + "url: "
        + url
        + ", payload: "
        + payload
        + ", contentType: "
        + contentType
        + ", method: "
        + method
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> url = Optional.empty();

    private Optional<Map<String, Object>> payload = Optional.empty();

    private Optional<String> contentType = Optional.empty();

    private Optional<String> method = Optional.empty();

    private Builder() {}

    public Builder from(OrderPayData other) {
      url(other.getUrl());
      payload(other.getPayload());
      contentType(other.getContentType());
      method(other.getMethod());
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

    @JsonSetter(value = "payload", nulls = Nulls.SKIP)
    public Builder payload(Optional<Map<String, Object>> payload) {
      this.payload = payload;
      return this;
    }

    public Builder payload(Map<String, Object> payload) {
      this.payload = Optional.of(payload);
      return this;
    }

    @JsonSetter(value = "content_type", nulls = Nulls.SKIP)
    public Builder contentType(Optional<String> contentType) {
      this.contentType = contentType;
      return this;
    }

    public Builder contentType(String contentType) {
      this.contentType = Optional.of(contentType);
      return this;
    }

    @JsonSetter(value = "method", nulls = Nulls.SKIP)
    public Builder method(Optional<String> method) {
      this.method = method;
      return this;
    }

    public Builder method(String method) {
      this.method = Optional.of(method);
      return this;
    }

    public OrderPayData build() {
      return new OrderPayData(url, payload, contentType, method);
    }
  }
}
