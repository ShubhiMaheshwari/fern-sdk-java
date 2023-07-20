package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = TerminalResponse.Builder.class)
public final class TerminalResponse {
  private final Optional<String> addedOn;

  private final Optional<String> cfTerminalId;

  private final Optional<String> lastUpdatedOn;

  private final Optional<String> terminalArea;

  private final Optional<String> teminalId;

  private final Optional<String> terminalName;

  private final Optional<String> terminalNote;

  private final Optional<String> terminalPhoneNo;

  private final Optional<String> terminalStatus;

  private int _cachedHashCode;

  TerminalResponse(
      Optional<String> addedOn,
      Optional<String> cfTerminalId,
      Optional<String> lastUpdatedOn,
      Optional<String> terminalArea,
      Optional<String> teminalId,
      Optional<String> terminalName,
      Optional<String> terminalNote,
      Optional<String> terminalPhoneNo,
      Optional<String> terminalStatus) {
    this.addedOn = addedOn;
    this.cfTerminalId = cfTerminalId;
    this.lastUpdatedOn = lastUpdatedOn;
    this.terminalArea = terminalArea;
    this.teminalId = teminalId;
    this.terminalName = terminalName;
    this.terminalNote = terminalNote;
    this.terminalPhoneNo = terminalPhoneNo;
    this.terminalStatus = terminalStatus;
  }

  @JsonProperty("added_on")
  public Optional<String> getAddedOn() {
    return addedOn;
  }

  @JsonProperty("cf_terminal_id")
  public Optional<String> getCfTerminalId() {
    return cfTerminalId;
  }

  @JsonProperty("last_updated_on")
  public Optional<String> getLastUpdatedOn() {
    return lastUpdatedOn;
  }

  @JsonProperty("terminal_area")
  public Optional<String> getTerminalArea() {
    return terminalArea;
  }

  @JsonProperty("teminal_id")
  public Optional<String> getTeminalId() {
    return teminalId;
  }

  @JsonProperty("terminal_name")
  public Optional<String> getTerminalName() {
    return terminalName;
  }

  @JsonProperty("terminal_note")
  public Optional<String> getTerminalNote() {
    return terminalNote;
  }

  @JsonProperty("terminal_phone_no")
  public Optional<String> getTerminalPhoneNo() {
    return terminalPhoneNo;
  }

  @JsonProperty("terminal_status")
  public Optional<String> getTerminalStatus() {
    return terminalStatus;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TerminalResponse && equalTo((TerminalResponse) other);
  }

  private boolean equalTo(TerminalResponse other) {
    return addedOn.equals(other.addedOn)
        && cfTerminalId.equals(other.cfTerminalId)
        && lastUpdatedOn.equals(other.lastUpdatedOn)
        && terminalArea.equals(other.terminalArea)
        && teminalId.equals(other.teminalId)
        && terminalName.equals(other.terminalName)
        && terminalNote.equals(other.terminalNote)
        && terminalPhoneNo.equals(other.terminalPhoneNo)
        && terminalStatus.equals(other.terminalStatus);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.addedOn,
              this.cfTerminalId,
              this.lastUpdatedOn,
              this.terminalArea,
              this.teminalId,
              this.terminalName,
              this.terminalNote,
              this.terminalPhoneNo,
              this.terminalStatus);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TerminalResponse{"
        + "addedOn: "
        + addedOn
        + ", cfTerminalId: "
        + cfTerminalId
        + ", lastUpdatedOn: "
        + lastUpdatedOn
        + ", terminalArea: "
        + terminalArea
        + ", teminalId: "
        + teminalId
        + ", terminalName: "
        + terminalName
        + ", terminalNote: "
        + terminalNote
        + ", terminalPhoneNo: "
        + terminalPhoneNo
        + ", terminalStatus: "
        + terminalStatus
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> addedOn = Optional.empty();

    private Optional<String> cfTerminalId = Optional.empty();

    private Optional<String> lastUpdatedOn = Optional.empty();

    private Optional<String> terminalArea = Optional.empty();

    private Optional<String> teminalId = Optional.empty();

    private Optional<String> terminalName = Optional.empty();

    private Optional<String> terminalNote = Optional.empty();

    private Optional<String> terminalPhoneNo = Optional.empty();

    private Optional<String> terminalStatus = Optional.empty();

    private Builder() {}

    public Builder from(TerminalResponse other) {
      addedOn(other.getAddedOn());
      cfTerminalId(other.getCfTerminalId());
      lastUpdatedOn(other.getLastUpdatedOn());
      terminalArea(other.getTerminalArea());
      teminalId(other.getTeminalId());
      terminalName(other.getTerminalName());
      terminalNote(other.getTerminalNote());
      terminalPhoneNo(other.getTerminalPhoneNo());
      terminalStatus(other.getTerminalStatus());
      return this;
    }

    @JsonSetter(value = "added_on", nulls = Nulls.SKIP)
    public Builder addedOn(Optional<String> addedOn) {
      this.addedOn = addedOn;
      return this;
    }

    public Builder addedOn(String addedOn) {
      this.addedOn = Optional.of(addedOn);
      return this;
    }

    @JsonSetter(value = "cf_terminal_id", nulls = Nulls.SKIP)
    public Builder cfTerminalId(Optional<String> cfTerminalId) {
      this.cfTerminalId = cfTerminalId;
      return this;
    }

    public Builder cfTerminalId(String cfTerminalId) {
      this.cfTerminalId = Optional.of(cfTerminalId);
      return this;
    }

    @JsonSetter(value = "last_updated_on", nulls = Nulls.SKIP)
    public Builder lastUpdatedOn(Optional<String> lastUpdatedOn) {
      this.lastUpdatedOn = lastUpdatedOn;
      return this;
    }

    public Builder lastUpdatedOn(String lastUpdatedOn) {
      this.lastUpdatedOn = Optional.of(lastUpdatedOn);
      return this;
    }

    @JsonSetter(value = "terminal_area", nulls = Nulls.SKIP)
    public Builder terminalArea(Optional<String> terminalArea) {
      this.terminalArea = terminalArea;
      return this;
    }

    public Builder terminalArea(String terminalArea) {
      this.terminalArea = Optional.of(terminalArea);
      return this;
    }

    @JsonSetter(value = "teminal_id", nulls = Nulls.SKIP)
    public Builder teminalId(Optional<String> teminalId) {
      this.teminalId = teminalId;
      return this;
    }

    public Builder teminalId(String teminalId) {
      this.teminalId = Optional.of(teminalId);
      return this;
    }

    @JsonSetter(value = "terminal_name", nulls = Nulls.SKIP)
    public Builder terminalName(Optional<String> terminalName) {
      this.terminalName = terminalName;
      return this;
    }

    public Builder terminalName(String terminalName) {
      this.terminalName = Optional.of(terminalName);
      return this;
    }

    @JsonSetter(value = "terminal_note", nulls = Nulls.SKIP)
    public Builder terminalNote(Optional<String> terminalNote) {
      this.terminalNote = terminalNote;
      return this;
    }

    public Builder terminalNote(String terminalNote) {
      this.terminalNote = Optional.of(terminalNote);
      return this;
    }

    @JsonSetter(value = "terminal_phone_no", nulls = Nulls.SKIP)
    public Builder terminalPhoneNo(Optional<String> terminalPhoneNo) {
      this.terminalPhoneNo = terminalPhoneNo;
      return this;
    }

    public Builder terminalPhoneNo(String terminalPhoneNo) {
      this.terminalPhoneNo = Optional.of(terminalPhoneNo);
      return this;
    }

    @JsonSetter(value = "terminal_status", nulls = Nulls.SKIP)
    public Builder terminalStatus(Optional<String> terminalStatus) {
      this.terminalStatus = terminalStatus;
      return this;
    }

    public Builder terminalStatus(String terminalStatus) {
      this.terminalStatus = Optional.of(terminalStatus);
      return this;
    }

    public TerminalResponse build() {
      return new TerminalResponse(
          addedOn,
          cfTerminalId,
          lastUpdatedOn,
          terminalArea,
          teminalId,
          terminalName,
          terminalNote,
          terminalPhoneNo,
          terminalStatus);
    }
  }
}
