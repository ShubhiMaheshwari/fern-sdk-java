package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchSettlementReconRequestFilters.Builder.class)
public final class FetchSettlementReconRequestFilters {
  private final Optional<List<Integer>> cfSettlementIds;

  private final Optional<List<String>> settlementUtrs;

  private final Optional<String> startDate;

  private final Optional<String> endDate;

  private int _cachedHashCode;

  FetchSettlementReconRequestFilters(
      Optional<List<Integer>> cfSettlementIds,
      Optional<List<String>> settlementUtrs,
      Optional<String> startDate,
      Optional<String> endDate) {
    this.cfSettlementIds = cfSettlementIds;
    this.settlementUtrs = settlementUtrs;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  /**
   * @return List of settlement IDs for which you want the settlement reconciliation details.
   */
  @JsonProperty("cf_settlement_ids")
  public Optional<List<Integer>> getCfSettlementIds() {
    return cfSettlementIds;
  }

  /**
   * @return List of settlement UTRs for which you want the settlement reconciliation details.
   */
  @JsonProperty("settlement_utrs")
  public Optional<List<String>> getSettlementUtrs() {
    return settlementUtrs;
  }

  /**
   * @return Specify the start date from when you want the settlement reconciliation details.
   */
  @JsonProperty("start_date")
  public Optional<String> getStartDate() {
    return startDate;
  }

  /**
   * @return Specify the end date till when you want the settlement reconciliation details.
   */
  @JsonProperty("end_date")
  public Optional<String> getEndDate() {
    return endDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchSettlementReconRequestFilters
        && equalTo((FetchSettlementReconRequestFilters) other);
  }

  private boolean equalTo(FetchSettlementReconRequestFilters other) {
    return cfSettlementIds.equals(other.cfSettlementIds)
        && settlementUtrs.equals(other.settlementUtrs)
        && startDate.equals(other.startDate)
        && endDate.equals(other.endDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.cfSettlementIds, this.settlementUtrs, this.startDate, this.endDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchSettlementReconRequestFilters{"
        + "cfSettlementIds: "
        + cfSettlementIds
        + ", settlementUtrs: "
        + settlementUtrs
        + ", startDate: "
        + startDate
        + ", endDate: "
        + endDate
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<List<Integer>> cfSettlementIds = Optional.empty();

    private Optional<List<String>> settlementUtrs = Optional.empty();

    private Optional<String> startDate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Builder() {}

    public Builder from(FetchSettlementReconRequestFilters other) {
      cfSettlementIds(other.getCfSettlementIds());
      settlementUtrs(other.getSettlementUtrs());
      startDate(other.getStartDate());
      endDate(other.getEndDate());
      return this;
    }

    @JsonSetter(value = "cf_settlement_ids", nulls = Nulls.SKIP)
    public Builder cfSettlementIds(Optional<List<Integer>> cfSettlementIds) {
      this.cfSettlementIds = cfSettlementIds;
      return this;
    }

    public Builder cfSettlementIds(List<Integer> cfSettlementIds) {
      this.cfSettlementIds = Optional.of(cfSettlementIds);
      return this;
    }

    @JsonSetter(value = "settlement_utrs", nulls = Nulls.SKIP)
    public Builder settlementUtrs(Optional<List<String>> settlementUtrs) {
      this.settlementUtrs = settlementUtrs;
      return this;
    }

    public Builder settlementUtrs(List<String> settlementUtrs) {
      this.settlementUtrs = Optional.of(settlementUtrs);
      return this;
    }

    @JsonSetter(value = "start_date", nulls = Nulls.SKIP)
    public Builder startDate(Optional<String> startDate) {
      this.startDate = startDate;
      return this;
    }

    public Builder startDate(String startDate) {
      this.startDate = Optional.of(startDate);
      return this;
    }

    @JsonSetter(value = "end_date", nulls = Nulls.SKIP)
    public Builder endDate(Optional<String> endDate) {
      this.endDate = endDate;
      return this;
    }

    public Builder endDate(String endDate) {
      this.endDate = Optional.of(endDate);
      return this;
    }

    public FetchSettlementReconRequestFilters build() {
      return new FetchSettlementReconRequestFilters(
          cfSettlementIds, settlementUtrs, startDate, endDate);
    }
  }
}
