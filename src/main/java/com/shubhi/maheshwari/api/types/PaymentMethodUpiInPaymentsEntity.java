package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaymentMethodUpiInPaymentsEntity.Builder.class)
public final class PaymentMethodUpiInPaymentsEntity {
  private final String channel;

  private final Optional<String> upiId;

  private int _cachedHashCode;

  PaymentMethodUpiInPaymentsEntity(String channel, Optional<String> upiId) {
    this.channel = channel;
    this.upiId = upiId;
  }

  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  @JsonProperty("upi_id")
  public Optional<String> getUpiId() {
    return upiId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodUpiInPaymentsEntity
        && equalTo((PaymentMethodUpiInPaymentsEntity) other);
  }

  private boolean equalTo(PaymentMethodUpiInPaymentsEntity other) {
    return channel.equals(other.channel) && upiId.equals(other.upiId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.channel, this.upiId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodUpiInPaymentsEntity{" + "channel: " + channel + ", upiId: " + upiId + "}";
  }

  public static ChannelStage builder() {
    return new Builder();
  }

  public interface ChannelStage {
    _FinalStage channel(String channel);

    Builder from(PaymentMethodUpiInPaymentsEntity other);
  }

  public interface _FinalStage {
    PaymentMethodUpiInPaymentsEntity build();

    _FinalStage upiId(Optional<String> upiId);

    _FinalStage upiId(String upiId);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements ChannelStage, _FinalStage {
    private String channel;

    private Optional<String> upiId = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(PaymentMethodUpiInPaymentsEntity other) {
      channel(other.getChannel());
      upiId(other.getUpiId());
      return this;
    }

    @Override
    @JsonSetter("channel")
    public _FinalStage channel(String channel) {
      this.channel = channel;
      return this;
    }

    @Override
    public _FinalStage upiId(String upiId) {
      this.upiId = Optional.of(upiId);
      return this;
    }

    @Override
    @JsonSetter(value = "upi_id", nulls = Nulls.SKIP)
    public _FinalStage upiId(Optional<String> upiId) {
      this.upiId = upiId;
      return this;
    }

    @Override
    public PaymentMethodUpiInPaymentsEntity build() {
      return new PaymentMethodUpiInPaymentsEntity(channel, upiId);
    }
  }
}
