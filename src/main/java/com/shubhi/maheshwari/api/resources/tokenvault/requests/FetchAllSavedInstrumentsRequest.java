package com.shubhi.maheshwari.api.resources.tokenvault.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = FetchAllSavedInstrumentsRequest.Builder.class)
public final class FetchAllSavedInstrumentsRequest {
  private final String instrumentType;

  private int _cachedHashCode;

  FetchAllSavedInstrumentsRequest(String instrumentType) {
    this.instrumentType = instrumentType;
  }

  @JsonProperty("instrument_type")
  public String getInstrumentType() {
    return instrumentType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchAllSavedInstrumentsRequest
        && equalTo((FetchAllSavedInstrumentsRequest) other);
  }

  private boolean equalTo(FetchAllSavedInstrumentsRequest other) {
    return instrumentType.equals(other.instrumentType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.instrumentType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchAllSavedInstrumentsRequest{" + "instrumentType: " + instrumentType + "}";
  }

  public static InstrumentTypeStage builder() {
    return new Builder();
  }

  public interface InstrumentTypeStage {
    _FinalStage instrumentType(String instrumentType);

    Builder from(FetchAllSavedInstrumentsRequest other);
  }

  public interface _FinalStage {
    FetchAllSavedInstrumentsRequest build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements InstrumentTypeStage, _FinalStage {
    private String instrumentType;

    private Builder() {}

    @Override
    public Builder from(FetchAllSavedInstrumentsRequest other) {
      instrumentType(other.getInstrumentType());
      return this;
    }

    @Override
    @JsonSetter("instrument_type")
    public _FinalStage instrumentType(String instrumentType) {
      this.instrumentType = instrumentType;
      return this;
    }

    @Override
    public FetchAllSavedInstrumentsRequest build() {
      return new FetchAllSavedInstrumentsRequest(instrumentType);
    }
  }
}
