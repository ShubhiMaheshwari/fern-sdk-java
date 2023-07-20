package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = FetchSettlementReconRequest.Builder.class)
public final class FetchSettlementReconRequest {
  private final FetchSettlementReconRequestPagination pagination;

  private final FetchSettlementReconRequestFilters filters;

  private int _cachedHashCode;

  FetchSettlementReconRequest(
      FetchSettlementReconRequestPagination pagination,
      FetchSettlementReconRequestFilters filters) {
    this.pagination = pagination;
    this.filters = filters;
  }

  /**
   * @return To fetch the next set of settlements, pass the cursor received in the response to the
   *     next API call. To receive the data for the first time, pass the cursor as null. Limit would
   *     be number of settlements that you want to receive.
   */
  @JsonProperty("pagination")
  public FetchSettlementReconRequestPagination getPagination() {
    return pagination;
  }

  /**
   * @return Specify either the Settlement ID, Settlement UTR, or start date and end date to fetch
   *     the settlement details.
   */
  @JsonProperty("filters")
  public FetchSettlementReconRequestFilters getFilters() {
    return filters;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchSettlementReconRequest
        && equalTo((FetchSettlementReconRequest) other);
  }

  private boolean equalTo(FetchSettlementReconRequest other) {
    return pagination.equals(other.pagination) && filters.equals(other.filters);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.pagination, this.filters);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchSettlementReconRequest{"
        + "pagination: "
        + pagination
        + ", filters: "
        + filters
        + "}";
  }

  public static PaginationStage builder() {
    return new Builder();
  }

  public interface PaginationStage {
    FiltersStage pagination(FetchSettlementReconRequestPagination pagination);

    Builder from(FetchSettlementReconRequest other);
  }

  public interface FiltersStage {
    _FinalStage filters(FetchSettlementReconRequestFilters filters);
  }

  public interface _FinalStage {
    FetchSettlementReconRequest build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements PaginationStage, FiltersStage, _FinalStage {
    private FetchSettlementReconRequestPagination pagination;

    private FetchSettlementReconRequestFilters filters;

    private Builder() {}

    @Override
    public Builder from(FetchSettlementReconRequest other) {
      pagination(other.getPagination());
      filters(other.getFilters());
      return this;
    }

    /**
     * To fetch the next set of settlements, pass the cursor received in the response to the next
     * API call. To receive the data for the first time, pass the cursor as null. Limit would be
     * number of settlements that you want to receive.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("pagination")
    public FiltersStage pagination(FetchSettlementReconRequestPagination pagination) {
      this.pagination = pagination;
      return this;
    }

    /**
     * Specify either the Settlement ID, Settlement UTR, or start date and end date to fetch the
     * settlement details.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("filters")
    public _FinalStage filters(FetchSettlementReconRequestFilters filters) {
      this.filters = filters;
      return this;
    }

    @Override
    public FetchSettlementReconRequest build() {
      return new FetchSettlementReconRequest(pagination, filters);
    }
  }
}
