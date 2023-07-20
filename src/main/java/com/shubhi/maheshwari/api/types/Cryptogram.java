package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = Cryptogram.Builder.class)
public final class Cryptogram {
  private final Optional<String> instrumentId;

  private final Optional<String> tokenRequestorId;

  private final Optional<String> cardNumber;

  private final Optional<String> cardExpiryMm;

  private final Optional<String> cardExpiryYy;

  private final Optional<String> cryptogram;

  private final Optional<String> cardDisplay;

  private int _cachedHashCode;

  Cryptogram(
      Optional<String> instrumentId,
      Optional<String> tokenRequestorId,
      Optional<String> cardNumber,
      Optional<String> cardExpiryMm,
      Optional<String> cardExpiryYy,
      Optional<String> cryptogram,
      Optional<String> cardDisplay) {
    this.instrumentId = instrumentId;
    this.tokenRequestorId = tokenRequestorId;
    this.cardNumber = cardNumber;
    this.cardExpiryMm = cardExpiryMm;
    this.cardExpiryYy = cardExpiryYy;
    this.cryptogram = cryptogram;
    this.cardDisplay = cardDisplay;
  }

  /**
   * @return instrument_id of saved instrument
   */
  @JsonProperty("instrument_id")
  public Optional<String> getInstrumentId() {
    return instrumentId;
  }

  /**
   * @return TRID issued by card networks
   */
  @JsonProperty("token_requestor_id")
  public Optional<String> getTokenRequestorId() {
    return tokenRequestorId;
  }

  /**
   * @return token pan number
   */
  @JsonProperty("card_number")
  public Optional<String> getCardNumber() {
    return cardNumber;
  }

  /**
   * @return token pan expiry month
   */
  @JsonProperty("card_expiry_mm")
  public Optional<String> getCardExpiryMm() {
    return cardExpiryMm;
  }

  /**
   * @return token pan expiry year
   */
  @JsonProperty("card_expiry_yy")
  public Optional<String> getCardExpiryYy() {
    return cardExpiryYy;
  }

  /**
   * @return cryptogram
   */
  @JsonProperty("cryptogram")
  public Optional<String> getCryptogram() {
    return cryptogram;
  }

  /**
   * @return last 4 digits of original card number
   */
  @JsonProperty("card_display")
  public Optional<String> getCardDisplay() {
    return cardDisplay;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Cryptogram && equalTo((Cryptogram) other);
  }

  private boolean equalTo(Cryptogram other) {
    return instrumentId.equals(other.instrumentId)
        && tokenRequestorId.equals(other.tokenRequestorId)
        && cardNumber.equals(other.cardNumber)
        && cardExpiryMm.equals(other.cardExpiryMm)
        && cardExpiryYy.equals(other.cardExpiryYy)
        && cryptogram.equals(other.cryptogram)
        && cardDisplay.equals(other.cardDisplay);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.instrumentId,
              this.tokenRequestorId,
              this.cardNumber,
              this.cardExpiryMm,
              this.cardExpiryYy,
              this.cryptogram,
              this.cardDisplay);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Cryptogram{"
        + "instrumentId: "
        + instrumentId
        + ", tokenRequestorId: "
        + tokenRequestorId
        + ", cardNumber: "
        + cardNumber
        + ", cardExpiryMm: "
        + cardExpiryMm
        + ", cardExpiryYy: "
        + cardExpiryYy
        + ", cryptogram: "
        + cryptogram
        + ", cardDisplay: "
        + cardDisplay
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> instrumentId = Optional.empty();

    private Optional<String> tokenRequestorId = Optional.empty();

    private Optional<String> cardNumber = Optional.empty();

    private Optional<String> cardExpiryMm = Optional.empty();

    private Optional<String> cardExpiryYy = Optional.empty();

    private Optional<String> cryptogram = Optional.empty();

    private Optional<String> cardDisplay = Optional.empty();

    private Builder() {}

    public Builder from(Cryptogram other) {
      instrumentId(other.getInstrumentId());
      tokenRequestorId(other.getTokenRequestorId());
      cardNumber(other.getCardNumber());
      cardExpiryMm(other.getCardExpiryMm());
      cardExpiryYy(other.getCardExpiryYy());
      cryptogram(other.getCryptogram());
      cardDisplay(other.getCardDisplay());
      return this;
    }

    @JsonSetter(value = "instrument_id", nulls = Nulls.SKIP)
    public Builder instrumentId(Optional<String> instrumentId) {
      this.instrumentId = instrumentId;
      return this;
    }

    public Builder instrumentId(String instrumentId) {
      this.instrumentId = Optional.of(instrumentId);
      return this;
    }

    @JsonSetter(value = "token_requestor_id", nulls = Nulls.SKIP)
    public Builder tokenRequestorId(Optional<String> tokenRequestorId) {
      this.tokenRequestorId = tokenRequestorId;
      return this;
    }

    public Builder tokenRequestorId(String tokenRequestorId) {
      this.tokenRequestorId = Optional.of(tokenRequestorId);
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

    @JsonSetter(value = "card_expiry_mm", nulls = Nulls.SKIP)
    public Builder cardExpiryMm(Optional<String> cardExpiryMm) {
      this.cardExpiryMm = cardExpiryMm;
      return this;
    }

    public Builder cardExpiryMm(String cardExpiryMm) {
      this.cardExpiryMm = Optional.of(cardExpiryMm);
      return this;
    }

    @JsonSetter(value = "card_expiry_yy", nulls = Nulls.SKIP)
    public Builder cardExpiryYy(Optional<String> cardExpiryYy) {
      this.cardExpiryYy = cardExpiryYy;
      return this;
    }

    public Builder cardExpiryYy(String cardExpiryYy) {
      this.cardExpiryYy = Optional.of(cardExpiryYy);
      return this;
    }

    @JsonSetter(value = "cryptogram", nulls = Nulls.SKIP)
    public Builder cryptogram(Optional<String> cryptogram) {
      this.cryptogram = cryptogram;
      return this;
    }

    public Builder cryptogram(String cryptogram) {
      this.cryptogram = Optional.of(cryptogram);
      return this;
    }

    @JsonSetter(value = "card_display", nulls = Nulls.SKIP)
    public Builder cardDisplay(Optional<String> cardDisplay) {
      this.cardDisplay = cardDisplay;
      return this;
    }

    public Builder cardDisplay(String cardDisplay) {
      this.cardDisplay = Optional.of(cardDisplay);
      return this;
    }

    public Cryptogram build() {
      return new Cryptogram(
          instrumentId,
          tokenRequestorId,
          cardNumber,
          cardExpiryMm,
          cardExpiryYy,
          cryptogram,
          cardDisplay);
    }
  }
}
