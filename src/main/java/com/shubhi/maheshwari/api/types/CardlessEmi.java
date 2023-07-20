package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CardlessEmi.Builder.class)
public final class CardlessEmi {
  private final Optional<String> channel;

  private final Optional<CardlessEmiProvider> provider;

  private final Optional<String> phone;

  private final Optional<Integer> emiTenure;

  private int _cachedHashCode;

  CardlessEmi(
      Optional<String> channel,
      Optional<CardlessEmiProvider> provider,
      Optional<String> phone,
      Optional<Integer> emiTenure) {
    this.channel = channel;
    this.provider = provider;
    this.phone = phone;
    this.emiTenure = emiTenure;
  }

  /**
   * @return The channel for cardless EMI is always <code>link</code>
   */
  @JsonProperty("channel")
  public Optional<String> getChannel() {
    return channel;
  }

  /**
   * @return One of [<code>flexmoney</code>, <code>zestmoney</code>, <code>hdfc</code>, <code>icici
   *     </code>, <code>cashe</code>, <code>idfc</code>, <code>kotak</code>]
   */
  @JsonProperty("provider")
  public Optional<CardlessEmiProvider> getProvider() {
    return provider;
  }

  /**
   * @return Customers phone number for this payment instrument. If the customer is not eligible you
   *     will receive a 400 error with type as 'invalid_request_error' and code as
   *     'invalid_request_error'
   */
  @JsonProperty("phone")
  public Optional<String> getPhone() {
    return phone;
  }

  /**
   * @return EMI tenure for the selected provider. This is mandatory when provider is one of [<code>
   *     hdfc</code>, <code>icici</code>, <code>cashe</code>, <code>idfc</code>, <code>kotak</code>]
   */
  @JsonProperty("emi_tenure")
  public Optional<Integer> getEmiTenure() {
    return emiTenure;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardlessEmi && equalTo((CardlessEmi) other);
  }

  private boolean equalTo(CardlessEmi other) {
    return channel.equals(other.channel)
        && provider.equals(other.provider)
        && phone.equals(other.phone)
        && emiTenure.equals(other.emiTenure);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.channel, this.provider, this.phone, this.emiTenure);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardlessEmi{"
        + "channel: "
        + channel
        + ", provider: "
        + provider
        + ", phone: "
        + phone
        + ", emiTenure: "
        + emiTenure
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> channel = Optional.empty();

    private Optional<CardlessEmiProvider> provider = Optional.empty();

    private Optional<String> phone = Optional.empty();

    private Optional<Integer> emiTenure = Optional.empty();

    private Builder() {}

    public Builder from(CardlessEmi other) {
      channel(other.getChannel());
      provider(other.getProvider());
      phone(other.getPhone());
      emiTenure(other.getEmiTenure());
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
    public Builder provider(Optional<CardlessEmiProvider> provider) {
      this.provider = provider;
      return this;
    }

    public Builder provider(CardlessEmiProvider provider) {
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

    @JsonSetter(value = "emi_tenure", nulls = Nulls.SKIP)
    public Builder emiTenure(Optional<Integer> emiTenure) {
      this.emiTenure = emiTenure;
      return this;
    }

    public Builder emiTenure(Integer emiTenure) {
      this.emiTenure = Optional.of(emiTenure);
      return this;
    }

    public CardlessEmi build() {
      return new CardlessEmi(channel, provider, phone, emiTenure);
    }
  }
}
