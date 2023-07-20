package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = SavedInstrumentMeta.Builder.class)
public final class SavedInstrumentMeta {
  private final Optional<String> cardNetwork;

  private final Optional<String> cardBankName;

  private final Optional<String> cardCountry;

  private final Optional<String> cardType;

  private final Optional<Map<String, Object>> cardTokenDetails;

  private int _cachedHashCode;

  SavedInstrumentMeta(
      Optional<String> cardNetwork,
      Optional<String> cardBankName,
      Optional<String> cardCountry,
      Optional<String> cardType,
      Optional<Map<String, Object>> cardTokenDetails) {
    this.cardNetwork = cardNetwork;
    this.cardBankName = cardBankName;
    this.cardCountry = cardCountry;
    this.cardType = cardType;
    this.cardTokenDetails = cardTokenDetails;
  }

  /**
   * @return card scheme/network of the saved card
   */
  @JsonProperty("card_network")
  public Optional<String> getCardNetwork() {
    return cardNetwork;
  }

  /**
   * @return Issuing bank name of saved card
   */
  @JsonProperty("card_bank_name")
  public Optional<String> getCardBankName() {
    return cardBankName;
  }

  /**
   * @return Issuing country of saved card
   */
  @JsonProperty("card_country")
  public Optional<String> getCardCountry() {
    return cardCountry;
  }

  /**
   * @return Type of saved card
   */
  @JsonProperty("card_type")
  public Optional<String> getCardType() {
    return cardType;
  }

  @JsonProperty("card_token_details")
  public Optional<Map<String, Object>> getCardTokenDetails() {
    return cardTokenDetails;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SavedInstrumentMeta && equalTo((SavedInstrumentMeta) other);
  }

  private boolean equalTo(SavedInstrumentMeta other) {
    return cardNetwork.equals(other.cardNetwork)
        && cardBankName.equals(other.cardBankName)
        && cardCountry.equals(other.cardCountry)
        && cardType.equals(other.cardType)
        && cardTokenDetails.equals(other.cardTokenDetails);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.cardNetwork,
              this.cardBankName,
              this.cardCountry,
              this.cardType,
              this.cardTokenDetails);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SavedInstrumentMeta{"
        + "cardNetwork: "
        + cardNetwork
        + ", cardBankName: "
        + cardBankName
        + ", cardCountry: "
        + cardCountry
        + ", cardType: "
        + cardType
        + ", cardTokenDetails: "
        + cardTokenDetails
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> cardNetwork = Optional.empty();

    private Optional<String> cardBankName = Optional.empty();

    private Optional<String> cardCountry = Optional.empty();

    private Optional<String> cardType = Optional.empty();

    private Optional<Map<String, Object>> cardTokenDetails = Optional.empty();

    private Builder() {}

    public Builder from(SavedInstrumentMeta other) {
      cardNetwork(other.getCardNetwork());
      cardBankName(other.getCardBankName());
      cardCountry(other.getCardCountry());
      cardType(other.getCardType());
      cardTokenDetails(other.getCardTokenDetails());
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

    @JsonSetter(value = "card_bank_name", nulls = Nulls.SKIP)
    public Builder cardBankName(Optional<String> cardBankName) {
      this.cardBankName = cardBankName;
      return this;
    }

    public Builder cardBankName(String cardBankName) {
      this.cardBankName = Optional.of(cardBankName);
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

    @JsonSetter(value = "card_type", nulls = Nulls.SKIP)
    public Builder cardType(Optional<String> cardType) {
      this.cardType = cardType;
      return this;
    }

    public Builder cardType(String cardType) {
      this.cardType = Optional.of(cardType);
      return this;
    }

    @JsonSetter(value = "card_token_details", nulls = Nulls.SKIP)
    public Builder cardTokenDetails(Optional<Map<String, Object>> cardTokenDetails) {
      this.cardTokenDetails = cardTokenDetails;
      return this;
    }

    public Builder cardTokenDetails(Map<String, Object> cardTokenDetails) {
      this.cardTokenDetails = Optional.of(cardTokenDetails);
      return this;
    }

    public SavedInstrumentMeta build() {
      return new SavedInstrumentMeta(
          cardNetwork, cardBankName, cardCountry, cardType, cardTokenDetails);
    }
  }
}
