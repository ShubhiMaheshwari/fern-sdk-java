package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferDetails.Builder.class)
public final class OfferDetails {
  private final OfferDetailsOfferType offerType;

  private final Optional<DiscountDetails> discountDetails;

  private final Optional<CashbackDetails> cashbackDetails;

  private int _cachedHashCode;

  OfferDetails(
      OfferDetailsOfferType offerType,
      Optional<DiscountDetails> discountDetails,
      Optional<CashbackDetails> cashbackDetails) {
    this.offerType = offerType;
    this.discountDetails = discountDetails;
    this.cashbackDetails = cashbackDetails;
  }

  /**
   * @return Offer Type for the Offer.
   */
  @JsonProperty("offer_type")
  public OfferDetailsOfferType getOfferType() {
    return offerType;
  }

  @JsonProperty("discount_details")
  public Optional<DiscountDetails> getDiscountDetails() {
    return discountDetails;
  }

  @JsonProperty("cashback_details")
  public Optional<CashbackDetails> getCashbackDetails() {
    return cashbackDetails;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferDetails && equalTo((OfferDetails) other);
  }

  private boolean equalTo(OfferDetails other) {
    return offerType.equals(other.offerType)
        && discountDetails.equals(other.discountDetails)
        && cashbackDetails.equals(other.cashbackDetails);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.offerType, this.discountDetails, this.cashbackDetails);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferDetails{"
        + "offerType: "
        + offerType
        + ", discountDetails: "
        + discountDetails
        + ", cashbackDetails: "
        + cashbackDetails
        + "}";
  }

  public static OfferTypeStage builder() {
    return new Builder();
  }

  public interface OfferTypeStage {
    _FinalStage offerType(OfferDetailsOfferType offerType);

    Builder from(OfferDetails other);
  }

  public interface _FinalStage {
    OfferDetails build();

    _FinalStage discountDetails(Optional<DiscountDetails> discountDetails);

    _FinalStage discountDetails(DiscountDetails discountDetails);

    _FinalStage cashbackDetails(Optional<CashbackDetails> cashbackDetails);

    _FinalStage cashbackDetails(CashbackDetails cashbackDetails);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements OfferTypeStage, _FinalStage {
    private OfferDetailsOfferType offerType;

    private Optional<CashbackDetails> cashbackDetails = Optional.empty();

    private Optional<DiscountDetails> discountDetails = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(OfferDetails other) {
      offerType(other.getOfferType());
      discountDetails(other.getDiscountDetails());
      cashbackDetails(other.getCashbackDetails());
      return this;
    }

    /**
     * Offer Type for the Offer.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_type")
    public _FinalStage offerType(OfferDetailsOfferType offerType) {
      this.offerType = offerType;
      return this;
    }

    @Override
    public _FinalStage cashbackDetails(CashbackDetails cashbackDetails) {
      this.cashbackDetails = Optional.of(cashbackDetails);
      return this;
    }

    @Override
    @JsonSetter(value = "cashback_details", nulls = Nulls.SKIP)
    public _FinalStage cashbackDetails(Optional<CashbackDetails> cashbackDetails) {
      this.cashbackDetails = cashbackDetails;
      return this;
    }

    @Override
    public _FinalStage discountDetails(DiscountDetails discountDetails) {
      this.discountDetails = Optional.of(discountDetails);
      return this;
    }

    @Override
    @JsonSetter(value = "discount_details", nulls = Nulls.SKIP)
    public _FinalStage discountDetails(Optional<DiscountDetails> discountDetails) {
      this.discountDetails = discountDetails;
      return this;
    }

    @Override
    public OfferDetails build() {
      return new OfferDetails(offerType, discountDetails, cashbackDetails);
    }
  }
}
