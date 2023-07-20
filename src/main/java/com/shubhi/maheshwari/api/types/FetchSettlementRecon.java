package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchSettlementRecon.Builder.class)
public final class FetchSettlementRecon {
  private final Optional<String> cursor;

  private final Optional<Integer> limit;

  private final Optional<List<FetchSettlementReconDataItem>> data;

  private int _cachedHashCode;

  FetchSettlementRecon(
      Optional<String> cursor,
      Optional<Integer> limit,
      Optional<List<FetchSettlementReconDataItem>> data) {
    this.cursor = cursor;
    this.limit = limit;
    this.data = data;
  }

  /**
   * @return Specifies from where the next set of settlement details should be fetched.
   */
  @JsonProperty("cursor")
  public Optional<String> getCursor() {
    return cursor;
  }

  /**
   * @return Number of settlements you want to fetch in the next iteration.
   */
  @JsonProperty("limit")
  public Optional<Integer> getLimit() {
    return limit;
  }

  @JsonProperty("data")
  public Optional<List<FetchSettlementReconDataItem>> getData() {
    return data;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchSettlementRecon && equalTo((FetchSettlementRecon) other);
  }

  private boolean equalTo(FetchSettlementRecon other) {
    return cursor.equals(other.cursor) && limit.equals(other.limit) && data.equals(other.data);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.cursor, this.limit, this.data);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "FetchSettlementRecon{"
        + "cursor: "
        + cursor
        + ", limit: "
        + limit
        + ", data: "
        + data
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> cursor = Optional.empty();

    private Optional<Integer> limit = Optional.empty();

    private Optional<List<FetchSettlementReconDataItem>> data = Optional.empty();

    private Builder() {}

    public Builder from(FetchSettlementRecon other) {
      cursor(other.getCursor());
      limit(other.getLimit());
      data(other.getData());
      return this;
    }

    @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
    public Builder cursor(Optional<String> cursor) {
      this.cursor = cursor;
      return this;
    }

    public Builder cursor(String cursor) {
      this.cursor = Optional.of(cursor);
      return this;
    }

    @JsonSetter(value = "limit", nulls = Nulls.SKIP)
    public Builder limit(Optional<Integer> limit) {
      this.limit = limit;
      return this;
    }

    public Builder limit(Integer limit) {
      this.limit = Optional.of(limit);
      return this;
    }

    @JsonSetter(value = "data", nulls = Nulls.SKIP)
    public Builder data(Optional<List<FetchSettlementReconDataItem>> data) {
      this.data = data;
      return this;
    }

    public Builder data(List<FetchSettlementReconDataItem> data) {
      this.data = Optional.of(data);
      return this;
    }

    public FetchSettlementRecon build() {
      return new FetchSettlementRecon(cursor, limit, data);
    }
  }
}
