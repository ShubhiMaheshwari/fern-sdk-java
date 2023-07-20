package com.shubhi.maheshwari.api.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.FetchPgReconRequestFilters;
import com.shubhi.maheshwari.api.types.FetchPgReconRequestPagination;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchPgReconRequest.Builder.class)
public final class FetchPgReconRequest {
  private final Optional<String> accept;

  private final FetchPgReconRequestPagination pagination;

  private final FetchPgReconRequestFilters filters;

  private int _cachedHashCode;

  FetchPgReconRequest(
      Optional<String> accept,
      FetchPgReconRequestPagination pagination,
      FetchPgReconRequestFilters filters) {
    this.accept = accept;
    this.pagination = pagination;
    this.filters = filters;
  }

  /**
   * @return application/json
   */
  @JsonProperty("Accept")
  public Optional<String> getAccept() {
    return accept;
  }

  /**
   * @return To fetch the next set of settlements, pass the cursor received in the response to the
   *     next API call. To receive the data for the first time, pass the cursor as null. Limit would
   *     be number of settlements that you want to receive.
   */
  @JsonProperty("pagination")
  public FetchPgReconRequestPagination getPagination() {
    return pagination;
  }

  @JsonProperty("filters")
  public FetchPgReconRequestFilters getFilters() {
    return filters;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchPgReconRequest && equalTo((FetchPgReconRequest) other);
  }

  private boolean equalTo(FetchPgReconRequest other) {
    return accept.equals(other.accept)
        && pagination.equals(other.pagination)
        && filters.equals(other.filters);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accept, this.pagination, this.filters);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchPgReconRequest{"
        + "accept: "
        + accept
        + ", pagination: "
        + pagination
        + ", filters: "
        + filters
        + "}";
  }

  public static PaginationStage builder() {
    return new Builder();
  }

  public interface PaginationStage {
    FiltersStage pagination(FetchPgReconRequestPagination pagination);

    Builder from(FetchPgReconRequest other);
  }

  public interface FiltersStage {
    _FinalStage filters(FetchPgReconRequestFilters filters);
  }

  public interface _FinalStage {
    FetchPgReconRequest build();

    _FinalStage accept(Optional<String> accept);

    _FinalStage accept(String accept);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements PaginationStage, FiltersStage, _FinalStage {
    private FetchPgReconRequestPagination pagination;

    private FetchPgReconRequestFilters filters;

    private Optional<String> accept = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(FetchPgReconRequest other) {
      accept(other.getAccept());
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
    public FiltersStage pagination(FetchPgReconRequestPagination pagination) {
      this.pagination = pagination;
      return this;
    }

    @Override
    @JsonSetter("filters")
    public _FinalStage filters(FetchPgReconRequestFilters filters) {
      this.filters = filters;
      return this;
    }

    /**
     * application/json
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accept(String accept) {
      this.accept = Optional.of(accept);
      return this;
    }

    @Override
    @JsonSetter(value = "Accept", nulls = Nulls.SKIP)
    public _FinalStage accept(Optional<String> accept) {
      this.accept = accept;
      return this;
    }

    @Override
    public FetchPgReconRequest build() {
      return new FetchPgReconRequest(accept, pagination, filters);
    }
  }
}
