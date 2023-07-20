package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CardEmi.Builder.class)
public final class CardEmi {
  private final Optional<String> channel;

  private final Optional<String> cardNumber;

  private final Optional<String> cardHolderName;

  private final Optional<String> cardExpiryMm;

  private final Optional<String> cardExpiryYy;

  private final Optional<String> cardCvv;

  private final Optional<String> cardAlias;

  private final Optional<CardEmiCardBankName> cardBankName;

  private final Optional<Integer> emiTenure;

  private int _cachedHashCode;

  CardEmi(
      Optional<String> channel,
      Optional<String> cardNumber,
      Optional<String> cardHolderName,
      Optional<String> cardExpiryMm,
      Optional<String> cardExpiryYy,
      Optional<String> cardCvv,
      Optional<String> cardAlias,
      Optional<CardEmiCardBankName> cardBankName,
      Optional<Integer> emiTenure) {
    this.channel = channel;
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    this.cardExpiryMm = cardExpiryMm;
    this.cardExpiryYy = cardExpiryYy;
    this.cardCvv = cardCvv;
    this.cardAlias = cardAlias;
    this.cardBankName = cardBankName;
    this.emiTenure = emiTenure;
  }

  /**
   * @return The channel for card payments will always be &quot;link&quot;
   */
  @JsonProperty("channel")
  public Optional<String> getChannel() {
    return channel;
  }

  /**
   * @return Customer card number.
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
   * @return Card expiry month.
   */
  @JsonProperty("card_expiry_mm")
  public Optional<String> getCardExpiryMm() {
    return cardExpiryMm;
  }

  /**
   * @return Card expiry year.
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
   * @return Card alias as returned by Cashfree Vault API
   */
  @JsonProperty("card_alias")
  public Optional<String> getCardAlias() {
    return cardAlias;
  }

  /**
   * @return Card bank name, required for EMI payments. This is the bank user has selected for EMI.
   *     One of [&quot;hdfc, &quot;kotak&quot;, &quot;icici&quot;, &quot;rbl&quot;, &quot;bob&quot;,
   *     &quot;standard chartered&quot;, &quot;axis&quot;, &quot;au&quot;, &quot;yes&quot;,
   *     &quot;sbi&quot;, &quot;fed&quot;, &quot;hsbc&quot;, &quot;citi&quot;, &quot;amex&quot;]
   */
  @JsonProperty("card_bank_name")
  public Optional<CardEmiCardBankName> getCardBankName() {
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
    return other instanceof CardEmi && equalTo((CardEmi) other);
  }

  private boolean equalTo(CardEmi other) {
    return channel.equals(other.channel)
        && cardNumber.equals(other.cardNumber)
        && cardHolderName.equals(other.cardHolderName)
        && cardExpiryMm.equals(other.cardExpiryMm)
        && cardExpiryYy.equals(other.cardExpiryYy)
        && cardCvv.equals(other.cardCvv)
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
              this.cardAlias,
              this.cardBankName,
              this.emiTenure);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardEmi{"
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
    private Optional<String> channel = Optional.empty();

    private Optional<String> cardNumber = Optional.empty();

    private Optional<String> cardHolderName = Optional.empty();

    private Optional<String> cardExpiryMm = Optional.empty();

    private Optional<String> cardExpiryYy = Optional.empty();

    private Optional<String> cardCvv = Optional.empty();

    private Optional<String> cardAlias = Optional.empty();

    private Optional<CardEmiCardBankName> cardBankName = Optional.empty();

    private Optional<Integer> emiTenure = Optional.empty();

    private Builder() {}

    public Builder from(CardEmi other) {
      channel(other.getChannel());
      cardNumber(other.getCardNumber());
      cardHolderName(other.getCardHolderName());
      cardExpiryMm(other.getCardExpiryMm());
      cardExpiryYy(other.getCardExpiryYy());
      cardCvv(other.getCardCvv());
      cardAlias(other.getCardAlias());
      cardBankName(other.getCardBankName());
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
    public Builder cardBankName(Optional<CardEmiCardBankName> cardBankName) {
      this.cardBankName = cardBankName;
      return this;
    }

    public Builder cardBankName(CardEmiCardBankName cardBankName) {
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

    public CardEmi build() {
      return new CardEmi(
          channel,
          cardNumber,
          cardHolderName,
          cardExpiryMm,
          cardExpiryYy,
          cardCvv,
          cardAlias,
          cardBankName,
          emiTenure);
    }
  }
}
