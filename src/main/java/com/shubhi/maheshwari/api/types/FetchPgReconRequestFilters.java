package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = FetchPgReconRequestFilters.Builder.class)
public final class FetchPgReconRequestFilters {
  private final String startDate;

  private final String endDate;

  private int _cachedHashCode;

  FetchPgReconRequestFilters(String startDate, String endDate) {
    this.startDate = startDate;
    this.endDate = endDate;
  }

  /**
   * @return Specify the start date from when you want the settlement reconciliation details.
   */
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  /**
   * @return Specify the end date till when you want the settlement reconciliation details.
   */
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchPgReconRequestFilters
        && equalTo((FetchPgReconRequestFilters) other);
  }

  private boolean equalTo(FetchPgReconRequestFilters other) {
    return startDate.equals(other.startDate) && endDate.equals(other.endDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.startDate, this.endDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchPgReconRequestFilters{"
        + "startDate: "
        + startDate
        + ", endDate: "
        + endDate
        + "}";
  }

  public static StartDateStage builder() {
    return new Builder();
  }

  public interface StartDateStage {
    EndDateStage startDate(String startDate);

    Builder from(FetchPgReconRequestFilters other);
  }

  public interface EndDateStage {
    _FinalStage endDate(String endDate);
  }

  public interface _FinalStage {
    FetchPgReconRequestFilters build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements StartDateStage, EndDateStage, _FinalStage {
    private String startDate;

    private String endDate;

    private Builder() {}

    @Override
    public Builder from(FetchPgReconRequestFilters other) {
      startDate(other.getStartDate());
      endDate(other.getEndDate());
      return this;
    }

    /**
     * Specify the start date from when you want the settlement reconciliation details.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("start_date")
    public EndDateStage startDate(String startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * Specify the end date till when you want the settlement reconciliation details.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("end_date")
    public _FinalStage endDate(String endDate) {
      this.endDate = endDate;
      return this;
    }

    @Override
    public FetchPgReconRequestFilters build() {
      return new FetchPgReconRequestFilters(startDate, endDate);
    }
  }
}
