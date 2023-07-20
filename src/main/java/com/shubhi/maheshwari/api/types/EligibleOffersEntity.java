package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = EligibleOffersEntity.Builder.class)
public final class EligibleOffersEntity {
  private final Optional<String> eligibility;

  private final Optional<String> entityType;

  private final Optional<String> entityValue;

  private final Optional<OfferEntity> entityDetails;

  private int _cachedHashCode;

  EligibleOffersEntity(
      Optional<String> eligibility,
      Optional<String> entityType,
      Optional<String> entityValue,
      Optional<OfferEntity> entityDetails) {
    this.eligibility = eligibility;
    this.entityType = entityType;
    this.entityValue = entityValue;
    this.entityDetails = entityDetails;
  }

  @JsonProperty("eligibility")
  public Optional<String> getEligibility() {
    return eligibility;
  }

  @JsonProperty("entity_type")
  public Optional<String> getEntityType() {
    return entityType;
  }

  @JsonProperty("entity_value")
  public Optional<String> getEntityValue() {
    return entityValue;
  }

  @JsonProperty("entity_details")
  public Optional<OfferEntity> getEntityDetails() {
    return entityDetails;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EligibleOffersEntity && equalTo((EligibleOffersEntity) other);
  }

  private boolean equalTo(EligibleOffersEntity other) {
    return eligibility.equals(other.eligibility)
        && entityType.equals(other.entityType)
        && entityValue.equals(other.entityValue)
        && entityDetails.equals(other.entityDetails);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.eligibility, this.entityType, this.entityValue, this.entityDetails);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EligibleOffersEntity{"
        + "eligibility: "
        + eligibility
        + ", entityType: "
        + entityType
        + ", entityValue: "
        + entityValue
        + ", entityDetails: "
        + entityDetails
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> eligibility = Optional.empty();

    private Optional<String> entityType = Optional.empty();

    private Optional<String> entityValue = Optional.empty();

    private Optional<OfferEntity> entityDetails = Optional.empty();

    private Builder() {}

    public Builder from(EligibleOffersEntity other) {
      eligibility(other.getEligibility());
      entityType(other.getEntityType());
      entityValue(other.getEntityValue());
      entityDetails(other.getEntityDetails());
      return this;
    }

    @JsonSetter(value = "eligibility", nulls = Nulls.SKIP)
    public Builder eligibility(Optional<String> eligibility) {
      this.eligibility = eligibility;
      return this;
    }

    public Builder eligibility(String eligibility) {
      this.eligibility = Optional.of(eligibility);
      return this;
    }

    @JsonSetter(value = "entity_type", nulls = Nulls.SKIP)
    public Builder entityType(Optional<String> entityType) {
      this.entityType = entityType;
      return this;
    }

    public Builder entityType(String entityType) {
      this.entityType = Optional.of(entityType);
      return this;
    }

    @JsonSetter(value = "entity_value", nulls = Nulls.SKIP)
    public Builder entityValue(Optional<String> entityValue) {
      this.entityValue = entityValue;
      return this;
    }

    public Builder entityValue(String entityValue) {
      this.entityValue = Optional.of(entityValue);
      return this;
    }

    @JsonSetter(value = "entity_details", nulls = Nulls.SKIP)
    public Builder entityDetails(Optional<OfferEntity> entityDetails) {
      this.entityDetails = entityDetails;
      return this;
    }

    public Builder entityDetails(OfferEntity entityDetails) {
      this.entityDetails = Optional.of(entityDetails);
      return this;
    }

    public EligibleOffersEntity build() {
      return new EligibleOffersEntity(eligibility, entityType, entityValue, entityDetails);
    }
  }
}
