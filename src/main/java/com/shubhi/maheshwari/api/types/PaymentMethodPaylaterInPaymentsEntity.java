package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaymentMethodPaylaterInPaymentsEntity.Builder.class)
public final class PaymentMethodPaylaterInPaymentsEntity {
  private final Optional<String> channel;

  private final Optional<String> provider;

  private final Optional<String> phone;

  private int _cachedHashCode;

  PaymentMethodPaylaterInPaymentsEntity(
      Optional<String> channel, Optional<String> provider, Optional<String> phone) {
    this.channel = channel;
    this.provider = provider;
    this.phone = phone;
  }

  @JsonProperty("channel")
  public Optional<String> getChannel() {
    return channel;
  }

  @JsonProperty("provider")
  public Optional<String> getProvider() {
    return provider;
  }

  @JsonProperty("phone")
  public Optional<String> getPhone() {
    return phone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodPaylaterInPaymentsEntity
        && equalTo((PaymentMethodPaylaterInPaymentsEntity) other);
  }

  private boolean equalTo(PaymentMethodPaylaterInPaymentsEntity other) {
    return channel.equals(other.channel)
        && provider.equals(other.provider)
        && phone.equals(other.phone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.channel, this.provider, this.phone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodPaylaterInPaymentsEntity{"
        + "channel: "
        + channel
        + ", provider: "
        + provider
        + ", phone: "
        + phone
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> channel = Optional.empty();

    private Optional<String> provider = Optional.empty();

    private Optional<String> phone = Optional.empty();

    private Builder() {}

    public Builder from(PaymentMethodPaylaterInPaymentsEntity other) {
      channel(other.getChannel());
      provider(other.getProvider());
      phone(other.getPhone());
      return this;
    }

    @JsonSetter(value = "channel", nulls = Nulls.SKIP)
    public Builder channel(Optional<String> channel) {
      this.channel = channel;
      return this;
    }

    public Builder channel(String channel) {
      this.channel = Optional.of(channel);
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

    @JsonSetter(value = "phone", nulls = Nulls.SKIP)
    public Builder phone(Optional<String> phone) {
      this.phone = phone;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = Optional.of(phone);
      return this;
    }

    public PaymentMethodPaylaterInPaymentsEntity build() {
      return new PaymentMethodPaylaterInPaymentsEntity(channel, provider, phone);
    }
  }
}
