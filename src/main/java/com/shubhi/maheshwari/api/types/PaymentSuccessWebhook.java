package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaymentSuccessWebhook.Builder.class)
public final class PaymentSuccessWebhook {
  private final Optional<WHdata> data;

  private final Optional<String> eventTime;

  private final Optional<String> type;

  private int _cachedHashCode;

  PaymentSuccessWebhook(Optional<WHdata> data, Optional<String> eventTime, Optional<String> type) {
    this.data = data;
    this.eventTime = eventTime;
    this.type = type;
  }

  @JsonProperty("data")
  public Optional<WHdata> getData() {
    return data;
  }

  @JsonProperty("event_time")
  public Optional<String> getEventTime() {
    return eventTime;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentSuccessWebhook && equalTo((PaymentSuccessWebhook) other);
  }

  private boolean equalTo(PaymentSuccessWebhook other) {
    return data.equals(other.data) && eventTime.equals(other.eventTime) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.data, this.eventTime, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentSuccessWebhook{"
        + "data: "
        + data
        + ", eventTime: "
        + eventTime
        + ", type: "
        + type
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<WHdata> data = Optional.empty();

    private Optional<String> eventTime = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {}

    public Builder from(PaymentSuccessWebhook other) {
      data(other.getData());
      eventTime(other.getEventTime());
      type(other.getType());
      return this;
    }

    @JsonSetter(value = "data", nulls = Nulls.SKIP)
    public Builder data(Optional<WHdata> data) {
      this.data = data;
      return this;
    }

    public Builder data(WHdata data) {
      this.data = Optional.of(data);
      return this;
    }

    @JsonSetter(value = "event_time", nulls = Nulls.SKIP)
    public Builder eventTime(Optional<String> eventTime) {
      this.eventTime = eventTime;
      return this;
    }

    public Builder eventTime(String eventTime) {
      this.eventTime = Optional.of(eventTime);
      return this;
    }

    @JsonSetter(value = "type", nulls = Nulls.SKIP)
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    public PaymentSuccessWebhook build() {
      return new PaymentSuccessWebhook(data, eventTime, type);
    }
  }
}
