package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = WHcard.Builder.class)
public final class WHcard {
  private final Optional<String> channel;

  private final Optional<String> cardNumber;

  private final Optional<String> cardNetwork;

  private final Optional<String> cardType;

  private final Optional<String> cardCounty;

  private final Optional<String> cardBankName;

  private int _cachedHashCode;

  WHcard(
      Optional<String> channel,
      Optional<String> cardNumber,
      Optional<String> cardNetwork,
      Optional<String> cardType,
      Optional<String> cardCounty,
      Optional<String> cardBankName) {
    this.channel = channel;
    this.cardNumber = cardNumber;
    this.cardNetwork = cardNetwork;
    this.cardType = cardType;
    this.cardCounty = cardCounty;
    this.cardBankName = cardBankName;
  }

  @JsonProperty("channel")
  public Optional<String> getChannel() {
    return channel;
  }

  @JsonProperty("card_number")
  public Optional<String> getCardNumber() {
    return cardNumber;
  }

  @JsonProperty("card_network")
  public Optional<String> getCardNetwork() {
    return cardNetwork;
  }

  @JsonProperty("card_type")
  public Optional<String> getCardType() {
    return cardType;
  }

  @JsonProperty("card_county")
  public Optional<String> getCardCounty() {
    return cardCounty;
  }

  @JsonProperty("card_bank_name")
  public Optional<String> getCardBankName() {
    return cardBankName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof WHcard && equalTo((WHcard) other);
  }

  private boolean equalTo(WHcard other) {
    return channel.equals(other.channel)
        && cardNumber.equals(other.cardNumber)
        && cardNetwork.equals(other.cardNetwork)
        && cardType.equals(other.cardType)
        && cardCounty.equals(other.cardCounty)
        && cardBankName.equals(other.cardBankName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.channel,
              this.cardNumber,
              this.cardNetwork,
              this.cardType,
              this.cardCounty,
              this.cardBankName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "WHcard{"
        + "channel: "
        + channel
        + ", cardNumber: "
        + cardNumber
        + ", cardNetwork: "
        + cardNetwork
        + ", cardType: "
        + cardType
        + ", cardCounty: "
        + cardCounty
        + ", cardBankName: "
        + cardBankName
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> channel = Optional.empty();

    private Optional<String> cardNumber = Optional.empty();

    private Optional<String> cardNetwork = Optional.empty();

    private Optional<String> cardType = Optional.empty();

    private Optional<String> cardCounty = Optional.empty();

    private Optional<String> cardBankName = Optional.empty();

    private Builder() {}

    public Builder from(WHcard other) {
      channel(other.getChannel());
      cardNumber(other.getCardNumber());
      cardNetwork(other.getCardNetwork());
      cardType(other.getCardType());
      cardCounty(other.getCardCounty());
      cardBankName(other.getCardBankName());
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

    @JsonSetter(value = "card_number", nulls = Nulls.SKIP)
    public Builder cardNumber(Optional<String> cardNumber) {
      this.cardNumber = cardNumber;
      return this;
    }

    public Builder cardNumber(String cardNumber) {
      this.cardNumber = Optional.of(cardNumber);
      return this;
    }

    @JsonSetter(value = "card_network", nulls = Nulls.SKIP)
    public Builder cardNetwork(Optional<String> cardNetwork) {
      this.cardNetwork = cardNetwork;
      return this;
    }

    public Builder cardNetwork(String cardNetwork) {
      this.cardNetwork = Optional.of(cardNetwork);
      return this;
    }

    @JsonSetter(value = "card_type", nulls = Nulls.SKIP)
    public Builder cardType(Optional<String> cardType) {
      this.cardType = cardType;
      return this;
    }

    public Builder cardType(String cardType) {
      this.cardType = Optional.of(cardType);
      return this;
    }

    @JsonSetter(value = "card_county", nulls = Nulls.SKIP)
    public Builder cardCounty(Optional<String> cardCounty) {
      this.cardCounty = cardCounty;
      return this;
    }

    public Builder cardCounty(String cardCounty) {
      this.cardCounty = Optional.of(cardCounty);
      return this;
    }

    @JsonSetter(value = "card_bank_name", nulls = Nulls.SKIP)
    public Builder cardBankName(Optional<String> cardBankName) {
      this.cardBankName = cardBankName;
      return this;
    }

    public Builder cardBankName(String cardBankName) {
      this.cardBankName = Optional.of(cardBankName);
      return this;
    }

    public WHcard build() {
      return new WHcard(channel, cardNumber, cardNetwork, cardType, cardCounty, cardBankName);
    }
  }
}
