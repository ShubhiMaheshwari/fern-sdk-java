package com.shubhi.maheshwari.api.resources.eligibilityapis.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.OfferFilters;
import com.shubhi.maheshwari.api.types.OfferQueries;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = EligibilityOffersRequest.Builder.class)
public final class EligibilityOffersRequest {
  private final OfferQueries queries;

  private final Optional<OfferFilters> filters;

  private int _cachedHashCode;

  EligibilityOffersRequest(OfferQueries queries, Optional<OfferFilters> filters) {
    this.queries = queries;
    this.filters = filters;
  }

  @JsonProperty("queries")
  public OfferQueries getQueries() {
    return queries;
  }

  @JsonProperty("filters")
  public Optional<OfferFilters> getFilters() {
    return filters;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EligibilityOffersRequest && equalTo((EligibilityOffersRequest) other);
  }

  private boolean equalTo(EligibilityOffersRequest other) {
    return queries.equals(other.queries) && filters.equals(other.filters);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.queries, this.filters);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EligibilityOffersRequest{" + "queries: " + queries + ", filters: " + filters + "}";
  }

  public static QueriesStage builder() {
    return new Builder();
  }

  public interface QueriesStage {
    _FinalStage queries(OfferQueries queries);

    Builder from(EligibilityOffersRequest other);
  }

  public interface _FinalStage {
    EligibilityOffersRequest build();

    _FinalStage filters(Optional<OfferFilters> filters);

    _FinalStage filters(OfferFilters filters);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements QueriesStage, _FinalStage {
    private OfferQueries queries;

    private Optional<OfferFilters> filters = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(EligibilityOffersRequest other) {
      queries(other.getQueries());
      filters(other.getFilters());
      return this;
    }

    @Override
    @JsonSetter("queries")
    public _FinalStage queries(OfferQueries queries) {
      this.queries = queries;
      return this;
    }

    @Override
    public _FinalStage filters(OfferFilters filters) {
      this.filters = Optional.of(filters);
      return this;
    }

    @Override
    @JsonSetter(value = "filters", nulls = Nulls.SKIP)
    public _FinalStage filters(Optional<OfferFilters> filters) {
      this.filters = filters;
      return this;
    }

    @Override
    public EligibilityOffersRequest build() {
      return new EligibilityOffersRequest(queries, filters);
    }
  }
}
