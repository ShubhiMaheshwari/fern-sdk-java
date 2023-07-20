package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchAllSavedInstruments.Builder.class)
public final class FetchAllSavedInstruments {
  private final Optional<String> customerId;

  private final Optional<Integer> afaReference;

  private final Optional<String> instrumentId;

  private final Optional<String> instrumentType;

  private final Optional<String> instrumentUid;

  private final Optional<String> instrumentDisplay;

  private final Optional<FetchAllSavedInstrumentsInstrumentStatus> instrumentStatus;

  private final Optional<String> createdAt;

  private final Optional<SavedInstrumentMeta> instrumentMeta;

  private int _cachedHashCode;

  FetchAllSavedInstruments(
      Optional<String> customerId,
      Optional<Integer> afaReference,
      Optional<String> instrumentId,
      Optional<String> instrumentType,
      Optional<String> instrumentUid,
      Optional<String> instrumentDisplay,
      Optional<FetchAllSavedInstrumentsInstrumentStatus> instrumentStatus,
      Optional<String> createdAt,
      Optional<SavedInstrumentMeta> instrumentMeta) {
    this.customerId = customerId;
    this.afaReference = afaReference;
    this.instrumentId = instrumentId;
    this.instrumentType = instrumentType;
    this.instrumentUid = instrumentUid;
    this.instrumentDisplay = instrumentDisplay;
    this.instrumentStatus = instrumentStatus;
    this.createdAt = createdAt;
    this.instrumentMeta = instrumentMeta;
  }

  /**
   * @return customer_id for which the instrument was saved
   */
  @JsonProperty("customer_id")
  public Optional<String> getCustomerId() {
    return customerId;
  }

  /**
   * @return cf_payment_id of the successful transaction done while saving instrument
   */
  @JsonProperty("afa_reference")
  public Optional<Integer> getAfaReference() {
    return afaReference;
  }

  /**
   * @return saved instrument id
   */
  @JsonProperty("instrument_id")
  public Optional<String> getInstrumentId() {
    return instrumentId;
  }

  @JsonProperty("instrument_type")
  public Optional<String> getInstrumentType() {
    return instrumentType;
  }

  /**
   * @return Unique id for the saved instrument
   */
  @JsonProperty("instrument_uid")
  public Optional<String> getInstrumentUid() {
    return instrumentUid;
  }

  /**
   * @return masked card number displayed to the customer
   */
  @JsonProperty("instrument_display")
  public Optional<String> getInstrumentDisplay() {
    return instrumentDisplay;
  }

  /**
   * @return Status of the saved instrument.
   */
  @JsonProperty("instrument_status")
  public Optional<FetchAllSavedInstrumentsInstrumentStatus> getInstrumentStatus() {
    return instrumentStatus;
  }

  /**
   * @return Timestamp at which instrument was saved.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("instrument_meta")
  public Optional<SavedInstrumentMeta> getInstrumentMeta() {
    return instrumentMeta;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchAllSavedInstruments && equalTo((FetchAllSavedInstruments) other);
  }

  private boolean equalTo(FetchAllSavedInstruments other) {
    return customerId.equals(other.customerId)
        && afaReference.equals(other.afaReference)
        && instrumentId.equals(other.instrumentId)
        && instrumentType.equals(other.instrumentType)
        && instrumentUid.equals(other.instrumentUid)
        && instrumentDisplay.equals(other.instrumentDisplay)
        && instrumentStatus.equals(other.instrumentStatus)
        && createdAt.equals(other.createdAt)
        && instrumentMeta.equals(other.instrumentMeta);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.customerId,
              this.afaReference,
              this.instrumentId,
              this.instrumentType,
              this.instrumentUid,
              this.instrumentDisplay,
              this.instrumentStatus,
              this.createdAt,
              this.instrumentMeta);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchAllSavedInstruments{"
        + "customerId: "
        + customerId
        + ", afaReference: "
        + afaReference
        + ", instrumentId: "
        + instrumentId
        + ", instrumentType: "
        + instrumentType
        + ", instrumentUid: "
        + instrumentUid
        + ", instrumentDisplay: "
        + instrumentDisplay
        + ", instrumentStatus: "
        + instrumentStatus
        + ", createdAt: "
        + createdAt
        + ", instrumentMeta: "
        + instrumentMeta
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> customerId = Optional.empty();

    private Optional<Integer> afaReference = Optional.empty();

    private Optional<String> instrumentId = Optional.empty();

    private Optional<String> instrumentType = Optional.empty();

    private Optional<String> instrumentUid = Optional.empty();

    private Optional<String> instrumentDisplay = Optional.empty();

    private Optional<FetchAllSavedInstrumentsInstrumentStatus> instrumentStatus = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<SavedInstrumentMeta> instrumentMeta = Optional.empty();

    private Builder() {}

    public Builder from(FetchAllSavedInstruments other) {
      customerId(other.getCustomerId());
      afaReference(other.getAfaReference());
      instrumentId(other.getInstrumentId());
      instrumentType(other.getInstrumentType());
      instrumentUid(other.getInstrumentUid());
      instrumentDisplay(other.getInstrumentDisplay());
      instrumentStatus(other.getInstrumentStatus());
      createdAt(other.getCreatedAt());
      instrumentMeta(other.getInstrumentMeta());
      return this;
    }

    @JsonSetter(value = "customer_id", nulls = Nulls.SKIP)
    public Builder customerId(Optional<String> customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder customerId(String customerId) {
      this.customerId = Optional.of(customerId);
      return this;
    }

    @JsonSetter(value = "afa_reference", nulls = Nulls.SKIP)
    public Builder afaReference(Optional<Integer> afaReference) {
      this.afaReference = afaReference;
      return this;
    }

    public Builder afaReference(Integer afaReference) {
      this.afaReference = Optional.of(afaReference);
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

    @JsonSetter(value = "instrument_type", nulls = Nulls.SKIP)
    public Builder instrumentType(Optional<String> instrumentType) {
      this.instrumentType = instrumentType;
      return this;
    }

    public Builder instrumentType(String instrumentType) {
      this.instrumentType = Optional.of(instrumentType);
      return this;
    }

    @JsonSetter(value = "instrument_uid", nulls = Nulls.SKIP)
    public Builder instrumentUid(Optional<String> instrumentUid) {
      this.instrumentUid = instrumentUid;
      return this;
    }

    public Builder instrumentUid(String instrumentUid) {
      this.instrumentUid = Optional.of(instrumentUid);
      return this;
    }

    @JsonSetter(value = "instrument_display", nulls = Nulls.SKIP)
    public Builder instrumentDisplay(Optional<String> instrumentDisplay) {
      this.instrumentDisplay = instrumentDisplay;
      return this;
    }

    public Builder instrumentDisplay(String instrumentDisplay) {
      this.instrumentDisplay = Optional.of(instrumentDisplay);
      return this;
    }

    @JsonSetter(value = "instrument_status", nulls = Nulls.SKIP)
    public Builder instrumentStatus(
        Optional<FetchAllSavedInstrumentsInstrumentStatus> instrumentStatus) {
      this.instrumentStatus = instrumentStatus;
      return this;
    }

    public Builder instrumentStatus(FetchAllSavedInstrumentsInstrumentStatus instrumentStatus) {
      this.instrumentStatus = Optional.of(instrumentStatus);
      return this;
    }

    @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @JsonSetter(value = "instrument_meta", nulls = Nulls.SKIP)
    public Builder instrumentMeta(Optional<SavedInstrumentMeta> instrumentMeta) {
      this.instrumentMeta = instrumentMeta;
      return this;
    }

    public Builder instrumentMeta(SavedInstrumentMeta instrumentMeta) {
      this.instrumentMeta = Optional.of(instrumentMeta);
      return this;
    }

    public FetchAllSavedInstruments build() {
      return new FetchAllSavedInstruments(
          customerId,
          afaReference,
          instrumentId,
          instrumentType,
          instrumentUid,
          instrumentDisplay,
          instrumentStatus,
          createdAt,
          instrumentMeta);
    }
  }
}
