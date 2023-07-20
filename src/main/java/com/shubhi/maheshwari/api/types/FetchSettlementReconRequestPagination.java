package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchSettlementReconRequestPagination.Builder.class)
public final class FetchSettlementReconRequestPagination {
  private final int limit;

  private final Optional<String> cursor;

  private int _cachedHashCode;

  FetchSettlementReconRequestPagination(int limit, Optional<String> cursor) {
    this.limit = limit;
    this.cursor = cursor;
  }

  /**
   * @return The number of settlements you want to fetch. Maximum limit is 1000, default value is
   *     10.
   */
  @JsonProperty("limit")
  public int getLimit() {
    return limit;
  }

  /**
   * @return Specifies from where the next set of settlement details should be fetched.
   */
  @JsonProperty("cursor")
  public Optional<String> getCursor() {
    return cursor;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchSettlementReconRequestPagination
        && equalTo((FetchSettlementReconRequestPagination) other);
  }

  private boolean equalTo(FetchSettlementReconRequestPagination other) {
    return limit == other.limit && cursor.equals(other.cursor);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.limit, this.cursor);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchSettlementReconRequestPagination{"
        + "limit: "
        + limit
        + ", cursor: "
        + cursor
        + "}";
  }

  public static LimitStage builder() {
    return new Builder();
  }

  public interface LimitStage {
    _FinalStage limit(int limit);

    Builder from(FetchSettlementReconRequestPagination other);
  }

  public interface _FinalStage {
    FetchSettlementReconRequestPagination build();

    _FinalStage cursor(Optional<String> cursor);

    _FinalStage cursor(String cursor);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements LimitStage, _FinalStage {
    private int limit;

    private Optional<String> cursor = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(FetchSettlementReconRequestPagination other) {
      limit(other.getLimit());
      cursor(other.getCursor());
      return this;
    }

    /**
     * The number of settlements you want to fetch. Maximum limit is 1000, default value is 10.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("limit")
    public _FinalStage limit(int limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Specifies from where the next set of settlement details should be fetched.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cursor(String cursor) {
      this.cursor = Optional.of(cursor);
      return this;
    }

    @Override
    @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
    public _FinalStage cursor(Optional<String> cursor) {
      this.cursor = cursor;
      return this;
    }

    @Override
    public FetchSettlementReconRequestPagination build() {
      return new FetchSettlementReconRequestPagination(limit, cursor);
    }
  }
}
