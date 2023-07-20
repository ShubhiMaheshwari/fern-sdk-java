package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferEntity.Builder.class)
public final class OfferEntity {
  private final Optional<Integer> offerId;

  private final Optional<String> offerStatus;

  private final Optional<OfferMeta> offerMeta;

  private final Optional<OfferTnc> offerTnc;

  private final Optional<OfferDetails> offerDetails;

  private final Optional<OfferValidations> offerValidations;

  private int _cachedHashCode;

  OfferEntity(
      Optional<Integer> offerId,
      Optional<String> offerStatus,
      Optional<OfferMeta> offerMeta,
      Optional<OfferTnc> offerTnc,
      Optional<OfferDetails> offerDetails,
      Optional<OfferValidations> offerValidations) {
    this.offerId = offerId;
    this.offerStatus = offerStatus;
    this.offerMeta = offerMeta;
    this.offerTnc = offerTnc;
    this.offerDetails = offerDetails;
    this.offerValidations = offerValidations;
  }

  @JsonProperty("offer_id")
  public Optional<Integer> getOfferId() {
    return offerId;
  }

  @JsonProperty("offer_status")
  public Optional<String> getOfferStatus() {
    return offerStatus;
  }

  @JsonProperty("offer_meta")
  public Optional<OfferMeta> getOfferMeta() {
    return offerMeta;
  }

  @JsonProperty("offer_tnc")
  public Optional<OfferTnc> getOfferTnc() {
    return offerTnc;
  }

  @JsonProperty("offer_details")
  public Optional<OfferDetails> getOfferDetails() {
    return offerDetails;
  }

  @JsonProperty("offer_validations")
  public Optional<OfferValidations> getOfferValidations() {
    return offerValidations;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferEntity && equalTo((OfferEntity) other);
  }

  private boolean equalTo(OfferEntity other) {
    return offerId.equals(other.offerId)
        && offerStatus.equals(other.offerStatus)
        && offerMeta.equals(other.offerMeta)
        && offerTnc.equals(other.offerTnc)
        && offerDetails.equals(other.offerDetails)
        && offerValidations.equals(other.offerValidations);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.offerId,
              this.offerStatus,
              this.offerMeta,
              this.offerTnc,
              this.offerDetails,
              this.offerValidations);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferEntity{"
        + "offerId: "
        + offerId
        + ", offerStatus: "
        + offerStatus
        + ", offerMeta: "
        + offerMeta
        + ", offerTnc: "
        + offerTnc
        + ", offerDetails: "
        + offerDetails
        + ", offerValidations: "
        + offerValidations
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Integer> offerId = Optional.empty();

    private Optional<String> offerStatus = Optional.empty();

    private Optional<OfferMeta> offerMeta = Optional.empty();

    private Optional<OfferTnc> offerTnc = Optional.empty();

    private Optional<OfferDetails> offerDetails = Optional.empty();

    private Optional<OfferValidations> offerValidations = Optional.empty();

    private Builder() {}

    public Builder from(OfferEntity other) {
      offerId(other.getOfferId());
      offerStatus(other.getOfferStatus());
      offerMeta(other.getOfferMeta());
      offerTnc(other.getOfferTnc());
      offerDetails(other.getOfferDetails());
      offerValidations(other.getOfferValidations());
      return this;
    }

    @JsonSetter(value = "offer_id", nulls = Nulls.SKIP)
    public Builder offerId(Optional<Integer> offerId) {
      this.offerId = offerId;
      return this;
    }

    public Builder offerId(Integer offerId) {
      this.offerId = Optional.of(offerId);
      return this;
    }

    @JsonSetter(value = "offer_status", nulls = Nulls.SKIP)
    public Builder offerStatus(Optional<String> offerStatus) {
      this.offerStatus = offerStatus;
      return this;
    }

    public Builder offerStatus(String offerStatus) {
      this.offerStatus = Optional.of(offerStatus);
      return this;
    }

    @JsonSetter(value = "offer_meta", nulls = Nulls.SKIP)
    public Builder offerMeta(Optional<OfferMeta> offerMeta) {
      this.offerMeta = offerMeta;
      return this;
    }

    public Builder offerMeta(OfferMeta offerMeta) {
      this.offerMeta = Optional.of(offerMeta);
      return this;
    }

    @JsonSetter(value = "offer_tnc", nulls = Nulls.SKIP)
    public Builder offerTnc(Optional<OfferTnc> offerTnc) {
      this.offerTnc = offerTnc;
      return this;
    }

    public Builder offerTnc(OfferTnc offerTnc) {
      this.offerTnc = Optional.of(offerTnc);
      return this;
    }

    @JsonSetter(value = "offer_details", nulls = Nulls.SKIP)
    public Builder offerDetails(Optional<OfferDetails> offerDetails) {
      this.offerDetails = offerDetails;
      return this;
    }

    public Builder offerDetails(OfferDetails offerDetails) {
      this.offerDetails = Optional.of(offerDetails);
      return this;
    }

    @JsonSetter(value = "offer_validations", nulls = Nulls.SKIP)
    public Builder offerValidations(Optional<OfferValidations> offerValidations) {
      this.offerValidations = offerValidations;
      return this;
    }

    public Builder offerValidations(OfferValidations offerValidations) {
      this.offerValidations = Optional.of(offerValidations);
      return this;
    }

    public OfferEntity build() {
      return new OfferEntity(
          offerId, offerStatus, offerMeta, offerTnc, offerDetails, offerValidations);
    }
  }
}
