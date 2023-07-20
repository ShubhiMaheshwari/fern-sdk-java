package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = EligibilityCardlessEmiRequest.Builder.class)
public final class EligibilityCardlessEmiRequest {
  private final CardlessEmiQueries queries;

  private int _cachedHashCode;

  EligibilityCardlessEmiRequest(CardlessEmiQueries queries) {
    this.queries = queries;
  }

  @JsonProperty("queries")
  public CardlessEmiQueries getQueries() {
    return queries;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EligibilityCardlessEmiRequest
        && equalTo((EligibilityCardlessEmiRequest) other);
  }

  private boolean equalTo(EligibilityCardlessEmiRequest other) {
    return queries.equals(other.queries);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.queries);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EligibilityCardlessEmiRequest{" + "queries: " + queries + "}";
  }

  public static QueriesStage builder() {
    return new Builder();
  }

  public interface QueriesStage {
    _FinalStage queries(CardlessEmiQueries queries);

    Builder from(EligibilityCardlessEmiRequest other);
  }

  public interface _FinalStage {
    EligibilityCardlessEmiRequest build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements QueriesStage, _FinalStage {
    private CardlessEmiQueries queries;

    private Builder() {}

    @Override
    public Builder from(EligibilityCardlessEmiRequest other) {
      queries(other.getQueries());
      return this;
    }

    @Override
    @JsonSetter("queries")
    public _FinalStage queries(CardlessEmiQueries queries) {
      this.queries = queries;
      return this;
    }

    @Override
    public EligibilityCardlessEmiRequest build() {
      return new EligibilityCardlessEmiRequest(queries);
    }
  }
}
