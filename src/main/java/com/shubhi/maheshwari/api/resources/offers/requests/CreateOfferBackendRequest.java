package com.shubhi.maheshwari.api.resources.offers.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.OfferDetails;
import com.shubhi.maheshwari.api.types.OfferMeta;
import com.shubhi.maheshwari.api.types.OfferTnc;
import com.shubhi.maheshwari.api.types.OfferValidations;
import java.util.Objects;

@JsonDeserialize(builder = CreateOfferBackendRequest.Builder.class)
public final class CreateOfferBackendRequest {
  private final OfferMeta offerMeta;

  private final OfferTnc offerTnc;

  private final OfferDetails offerDetails;

  private final OfferValidations offerValidations;

  private int _cachedHashCode;

  CreateOfferBackendRequest(
      OfferMeta offerMeta,
      OfferTnc offerTnc,
      OfferDetails offerDetails,
      OfferValidations offerValidations) {
    this.offerMeta = offerMeta;
    this.offerTnc = offerTnc;
    this.offerDetails = offerDetails;
    this.offerValidations = offerValidations;
  }

  @JsonProperty("offer_meta")
  public OfferMeta getOfferMeta() {
    return offerMeta;
  }

  @JsonProperty("offer_tnc")
  public OfferTnc getOfferTnc() {
    return offerTnc;
  }

  @JsonProperty("offer_details")
  public OfferDetails getOfferDetails() {
    return offerDetails;
  }

  @JsonProperty("offer_validations")
  public OfferValidations getOfferValidations() {
    return offerValidations;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateOfferBackendRequest && equalTo((CreateOfferBackendRequest) other);
  }

  private boolean equalTo(CreateOfferBackendRequest other) {
    return offerMeta.equals(other.offerMeta)
        && offerTnc.equals(other.offerTnc)
        && offerDetails.equals(other.offerDetails)
        && offerValidations.equals(other.offerValidations);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.offerMeta, this.offerTnc, this.offerDetails, this.offerValidations);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateOfferBackendRequest{"
        + "offerMeta: "
        + offerMeta
        + ", offerTnc: "
        + offerTnc
        + ", offerDetails: "
        + offerDetails
        + ", offerValidations: "
        + offerValidations
        + "}";
  }

  public static OfferMetaStage builder() {
    return new Builder();
  }

  public interface OfferMetaStage {
    OfferTncStage offerMeta(OfferMeta offerMeta);

    Builder from(CreateOfferBackendRequest other);
  }

  public interface OfferTncStage {
    OfferDetailsStage offerTnc(OfferTnc offerTnc);
  }

  public interface OfferDetailsStage {
    OfferValidationsStage offerDetails(OfferDetails offerDetails);
  }

  public interface OfferValidationsStage {
    _FinalStage offerValidations(OfferValidations offerValidations);
  }

  public interface _FinalStage {
    CreateOfferBackendRequest build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements OfferMetaStage,
          OfferTncStage,
          OfferDetailsStage,
          OfferValidationsStage,
          _FinalStage {
    private OfferMeta offerMeta;

    private OfferTnc offerTnc;

    private OfferDetails offerDetails;

    private OfferValidations offerValidations;

    private Builder() {}

    @Override
    public Builder from(CreateOfferBackendRequest other) {
      offerMeta(other.getOfferMeta());
      offerTnc(other.getOfferTnc());
      offerDetails(other.getOfferDetails());
      offerValidations(other.getOfferValidations());
      return this;
    }

    @Override
    @JsonSetter("offer_meta")
    public OfferTncStage offerMeta(OfferMeta offerMeta) {
      this.offerMeta = offerMeta;
      return this;
    }

    @Override
    @JsonSetter("offer_tnc")
    public OfferDetailsStage offerTnc(OfferTnc offerTnc) {
      this.offerTnc = offerTnc;
      return this;
    }

    @Override
    @JsonSetter("offer_details")
    public OfferValidationsStage offerDetails(OfferDetails offerDetails) {
      this.offerDetails = offerDetails;
      return this;
    }

    @Override
    @JsonSetter("offer_validations")
    public _FinalStage offerValidations(OfferValidations offerValidations) {
      this.offerValidations = offerValidations;
      return this;
    }

    @Override
    public CreateOfferBackendRequest build() {
      return new CreateOfferBackendRequest(offerMeta, offerTnc, offerDetails, offerValidations);
    }
  }
}
