package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PaymentMethodCardInPaymentsEntity.Builder.class)
public final class PaymentMethodCardInPaymentsEntity {
  private final Optional<String> channel;

  private final Optional<String> cardNumber;

  private final Optional<String> cardNetwork;

  private final Optional<String> cardType;

  private final Optional<String> cardCountry;

  private final Optional<String> cardBankName;

  private final Optional<String> cardNetworkReferenceId;

  private int _cachedHashCode;

  PaymentMethodCardInPaymentsEntity(
      Optional<String> channel,
      Optional<String> cardNumber,
      Optional<String> cardNetwork,
      Optional<String> cardType,
      Optional<String> cardCountry,
      Optional<String> cardBankName,
      Optional<String> cardNetworkReferenceId) {
    this.channel = channel;
    this.cardNumber = cardNumber;
    this.cardNetwork = cardNetwork;
    this.cardType = cardType;
    this.cardCountry = cardCountry;
    this.cardBankName = cardBankName;
    this.cardNetworkReferenceId = cardNetworkReferenceId;
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

  @JsonProperty("card_country")
  public Optional<String> getCardCountry() {
    return cardCountry;
  }

  @JsonProperty("card_bank_name")
  public Optional<String> getCardBankName() {
    return cardBankName;
  }

  @JsonProperty("card_network_reference_id")
  public Optional<String> getCardNetworkReferenceId() {
    return cardNetworkReferenceId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodCardInPaymentsEntity
        && equalTo((PaymentMethodCardInPaymentsEntity) other);
  }

  private boolean equalTo(PaymentMethodCardInPaymentsEntity other) {
    return channel.equals(other.channel)
        && cardNumber.equals(other.cardNumber)
        && cardNetwork.equals(other.cardNetwork)
        && cardType.equals(other.cardType)
        && cardCountry.equals(other.cardCountry)
        && cardBankName.equals(other.cardBankName)
        && cardNetworkReferenceId.equals(other.cardNetworkReferenceId);
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
              this.cardCountry,
              this.cardBankName,
              this.cardNetworkReferenceId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodCardInPaymentsEntity{"
        + "channel: "
        + channel
        + ", cardNumber: "
        + cardNumber
        + ", cardNetwork: "
        + cardNetwork
        + ", cardType: "
        + cardType
        + ", cardCountry: "
        + cardCountry
        + ", cardBankName: "
        + cardBankName
        + ", cardNetworkReferenceId: "
        + cardNetworkReferenceId
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

    private Optional<String> cardCountry = Optional.empty();

    private Optional<String> cardBankName = Optional.empty();

    private Optional<String> cardNetworkReferenceId = Optional.empty();

    private Builder() {}

    public Builder from(PaymentMethodCardInPaymentsEntity other) {
      channel(other.getChannel());
      cardNumber(other.getCardNumber());
      cardNetwork(other.getCardNetwork());
      cardType(other.getCardType());
      cardCountry(other.getCardCountry());
      cardBankName(other.getCardBankName());
      cardNetworkReferenceId(other.getCardNetworkReferenceId());
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

    @JsonSetter(value = "card_country", nulls = Nulls.SKIP)
    public Builder cardCountry(Optional<String> cardCountry) {
      this.cardCountry = cardCountry;
      return this;
    }

    public Builder cardCountry(String cardCountry) {
      this.cardCountry = Optional.of(cardCountry);
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

    @JsonSetter(value = "card_network_reference_id", nulls = Nulls.SKIP)
    public Builder cardNetworkReferenceId(Optional<String> cardNetworkReferenceId) {
      this.cardNetworkReferenceId = cardNetworkReferenceId;
      return this;
    }

    public Builder cardNetworkReferenceId(String cardNetworkReferenceId) {
      this.cardNetworkReferenceId = Optional.of(cardNetworkReferenceId);
      return this;
    }

    public PaymentMethodCardInPaymentsEntity build() {
      return new PaymentMethodCardInPaymentsEntity(
          channel,
          cardNumber,
          cardNetwork,
          cardType,
          cardCountry,
          cardBankName,
          cardNetworkReferenceId);
    }
  }
}
