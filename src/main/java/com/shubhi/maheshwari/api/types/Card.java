package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = Card.Builder.class)
public final class Card {
  private final Optional<CardChannel> channel;

  private final Optional<String> cardNumber;

  private final Optional<String> cardHolderName;

  private final Optional<String> cardExpiryMm;

  private final Optional<String> cardExpiryYy;

  private final Optional<String> cardCvv;

  private final Optional<String> instrumentId;

  private final Optional<String> cryptogram;

  private final Optional<String> tokenRequestorId;

  private final Optional<String> cardDisplay;

  private final Optional<String> cardAlias;

  private final Optional<CardCardBankName> cardBankName;

  private final Optional<Integer> emiTenure;

  private int _cachedHashCode;

  Card(
      Optional<CardChannel> channel,
      Optional<String> cardNumber,
      Optional<String> cardHolderName,
      Optional<String> cardExpiryMm,
      Optional<String> cardExpiryYy,
      Optional<String> cardCvv,
      Optional<String> instrumentId,
      Optional<String> cryptogram,
      Optional<String> tokenRequestorId,
      Optional<String> cardDisplay,
      Optional<String> cardAlias,
      Optional<CardCardBankName> cardBankName,
      Optional<Integer> emiTenure) {
    this.channel = channel;
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    this.cardExpiryMm = cardExpiryMm;
    this.cardExpiryYy = cardExpiryYy;
    this.cardCvv = cardCvv;
    this.instrumentId = instrumentId;
    this.cryptogram = cryptogram;
    this.tokenRequestorId = tokenRequestorId;
    this.cardDisplay = cardDisplay;
    this.cardAlias = cardAlias;
    this.cardBankName = cardBankName;
    this.emiTenure = emiTenure;
  }

  /**
   * @return The channel for card payments can be &quot;link&quot; or &quot;post&quot;. Post is used
   *     for seamless OTP payments where merchant captures OTP on their own page.
   */
  @JsonProperty("channel")
  public Optional<CardChannel> getChannel() {
    return channel;
  }

  /**
   * @return Customer card number for plain card transactions. Token pan number for tokenized card
   *     transactions.
   */
  @JsonProperty("card_number")
  public Optional<String> getCardNumber() {
    return cardNumber;
  }

  /**
   * @return Customer name mentioned on the card.
   */
  @JsonProperty("card_holder_name")
  public Optional<String> getCardHolderName() {
    return cardHolderName;
  }

  /**
   * @return Card expiry month for plain card transactions. Token expiry month for tokenized card
   *     transactions.
   */
  @JsonProperty("card_expiry_mm")
  public Optional<String> getCardExpiryMm() {
    return cardExpiryMm;
  }

  /**
   * @return Card expiry year for plain card transactions. Token expiry year for tokenized card
   *     transactions.
   */
  @JsonProperty("card_expiry_yy")
  public Optional<String> getCardExpiryYy() {
    return cardExpiryYy;
  }

  /**
   * @return CVV mentioned on the card.
   */
  @JsonProperty("card_cvv")
  public Optional<String> getCardCvv() {
    return cardCvv;
  }

  /**
   * @return instrument id of saved card. Required only to make payment using saved instrument.
   */
  @JsonProperty("instrument_id")
  public Optional<String> getInstrumentId() {
    return instrumentId;
  }

  /**
   * @return cryptogram received from card network. Required only for tokenized card transactions.
   */
  @JsonProperty("cryptogram")
  public Optional<String> getCryptogram() {
    return cryptogram;
  }

  /**
   * @return TRID issued by card networks. Required only for tokenized card transactions.
   */
  @JsonProperty("token_requestor_id")
  public Optional<String> getTokenRequestorId() {
    return tokenRequestorId;
  }

  /**
   * @return last 4 digits of original card number. Required only for tokenized card transactions.
   */
  @JsonProperty("card_display")
  public Optional<String> getCardDisplay() {
    return cardDisplay;
  }

  /**
   * @return Card alias as returned by Cashfree Vault API.
   */
  @JsonProperty("card_alias")
  public Optional<String> getCardAlias() {
    return cardAlias;
  }

  /**
   * @return One of [&quot;Kotak&quot;, &quot;ICICI&quot;, &quot;RBL&quot;, &quot;BOB&quot;,
   *     &quot;Standard Chartered&quot;]. Card bank name, required for EMI payments. This is the
   *     bank user has selected for EMI
   */
  @JsonProperty("card_bank_name")
  public Optional<CardCardBankName> getCardBankName() {
    return cardBankName;
  }

  /**
   * @return EMI tenure selected by the user
   */
  @JsonProperty("emi_tenure")
  public Optional<Integer> getEmiTenure() {
    return emiTenure;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Card && equalTo((Card) other);
  }

  private boolean equalTo(Card other) {
    return channel.equals(other.channel)
        && cardNumber.equals(other.cardNumber)
        && cardHolderName.equals(other.cardHolderName)
        && cardExpiryMm.equals(other.cardExpiryMm)
        && cardExpiryYy.equals(other.cardExpiryYy)
        && cardCvv.equals(other.cardCvv)
        && instrumentId.equals(other.instrumentId)
        && cryptogram.equals(other.cryptogram)
        && tokenRequestorId.equals(other.tokenRequestorId)
        && cardDisplay.equals(other.cardDisplay)
        && cardAlias.equals(other.cardAlias)
        && cardBankName.equals(other.cardBankName)
        && emiTenure.equals(other.emiTenure);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.channel,
              this.cardNumber,
              this.cardHolderName,
              this.cardExpiryMm,
              this.cardExpiryYy,
              this.cardCvv,
              this.instrumentId,
              this.cryptogram,
              this.tokenRequestorId,
              this.cardDisplay,
              this.cardAlias,
              this.cardBankName,
              this.emiTenure);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Card{"
        + "channel: "
        + channel
        + ", cardNumber: "
        + cardNumber
        + ", cardHolderName: "
        + cardHolderName
        + ", cardExpiryMm: "
        + cardExpiryMm
        + ", cardExpiryYy: "
        + cardExpiryYy
        + ", cardCvv: "
        + cardCvv
        + ", instrumentId: "
        + instrumentId
        + ", cryptogram: "
        + cryptogram
        + ", tokenRequestorId: "
        + tokenRequestorId
        + ", cardDisplay: "
        + cardDisplay
        + ", cardAlias: "
        + cardAlias
        + ", cardBankName: "
        + cardBankName
        + ", emiTenure: "
        + emiTenure
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<CardChannel> channel = Optional.empty();

    private Optional<String> cardNumber = Optional.empty();

    private Optional<String> cardHolderName = Optional.empty();

    private Optional<String> cardExpiryMm = Optional.empty();

    private Optional<String> cardExpiryYy = Optional.empty();

    private Optional<String> cardCvv = Optional.empty();

    private Optional<String> instrumentId = Optional.empty();

    private Optional<String> cryptogram = Optional.empty();

    private Optional<String> tokenRequestorId = Optional.empty();

    private Optional<String> cardDisplay = Optional.empty();

    private Optional<String> cardAlias = Optional.empty();

    private Optional<CardCardBankName> cardBankName = Optional.empty();

    private Optional<Integer> emiTenure = Optional.empty();

    private Builder() {}

    public Builder from(Card other) {
      channel(other.getChannel());
      cardNumber(other.getCardNumber());
      cardHolderName(other.getCardHolderName());
      cardExpiryMm(other.getCardExpiryMm());
      cardExpiryYy(other.getCardExpiryYy());
      cardCvv(other.getCardCvv());
      instrumentId(other.getInstrumentId());
      cryptogram(other.getCryptogram());
      tokenRequestorId(other.getTokenRequestorId());
      cardDisplay(other.getCardDisplay());
      cardAlias(other.getCardAlias());
      cardBankName(other.getCardBankName());
      emiTenure(other.getEmiTenure());
      return this;
    }

    @JsonSetter(value = "channel", nulls = Nulls.SKIP)
    public Builder channel(Optional<CardChannel> channel) {
      this.channel = channel;
      return this;
    }

    public Builder channel(CardChannel channel) {
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

    @JsonSetter(value = "card_holder_name", nulls = Nulls.SKIP)
    public Builder cardHolderName(Optional<String> cardHolderName) {
      this.cardHolderName = cardHolderName;
      return this;
    }

    public Builder cardHolderName(String cardHolderName) {
      this.cardHolderName = Optional.of(cardHolderName);
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

    @JsonSetter(value = "card_cvv", nulls = Nulls.SKIP)
    public Builder cardCvv(Optional<String> cardCvv) {
      this.cardCvv = cardCvv;
      return this;
    }

    public Builder cardCvv(String cardCvv) {
      this.cardCvv = Optional.of(cardCvv);
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

    @JsonSetter(value = "cryptogram", nulls = Nulls.SKIP)
    public Builder cryptogram(Optional<String> cryptogram) {
      this.cryptogram = cryptogram;
      return this;
    }

    public Builder cryptogram(String cryptogram) {
      this.cryptogram = Optional.of(cryptogram);
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

    @JsonSetter(value = "card_display", nulls = Nulls.SKIP)
    public Builder cardDisplay(Optional<String> cardDisplay) {
      this.cardDisplay = cardDisplay;
      return this;
    }

    public Builder cardDisplay(String cardDisplay) {
      this.cardDisplay = Optional.of(cardDisplay);
      return this;
    }

    @JsonSetter(value = "card_alias", nulls = Nulls.SKIP)
    public Builder cardAlias(Optional<String> cardAlias) {
      this.cardAlias = cardAlias;
      return this;
    }

    public Builder cardAlias(String cardAlias) {
      this.cardAlias = Optional.of(cardAlias);
      return this;
    }

    @JsonSetter(value = "card_bank_name", nulls = Nulls.SKIP)
    public Builder cardBankName(Optional<CardCardBankName> cardBankName) {
      this.cardBankName = cardBankName;
      return this;
    }

    public Builder cardBankName(CardCardBankName cardBankName) {
      this.cardBankName = Optional.of(cardBankName);
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

    public Card build() {
      return new Card(
          channel,
          cardNumber,
          cardHolderName,
          cardExpiryMm,
          cardExpiryYy,
          cardCvv,
          instrumentId,
          cryptogram,
          tokenRequestorId,
          cardDisplay,
          cardAlias,
          cardBankName,
          emiTenure);
    }
  }
}
