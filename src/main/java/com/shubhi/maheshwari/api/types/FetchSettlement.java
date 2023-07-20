package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = FetchSettlement.Builder.class)
public final class FetchSettlement {
  private final Optional<String> cursor;

  private final Optional<Integer> limit;

  private final Optional<List<FetchSettlementDataItem>> data;

  private int _cachedHashCode;

  FetchSettlement(
      Optional<String> cursor,
      Optional<Integer> limit,
      Optional<List<FetchSettlementDataItem>> data) {
    this.cursor = cursor;
    this.limit = limit;
    this.data = data;
  }

  /**
   * @return Specify a value from where you want to fetch the settlement details in the API call.
   */
  @JsonProperty("cursor")
  public Optional<String> getCursor() {
    return cursor;
  }

  /**
   * @return Specify the number of settlements you want to fetch in the API call.
   */
  @JsonProperty("limit")
  public Optional<Integer> getLimit() {
    return limit;
  }

  @JsonProperty("data")
  public Optional<List<FetchSettlementDataItem>> getData() {
    return data;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof FetchSettlement && equalTo((FetchSettlement) other);
  }

  private boolean equalTo(FetchSettlement other) {
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
    return "FetchSettlement{" + "cursor: " + cursor + ", limit: " + limit + ", data: " + data + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> cursor = Optional.empty();

    private Optional<Integer> limit = Optional.empty();

    private Optional<List<FetchSettlementDataItem>> data = Optional.empty();

    private Builder() {}

    public Builder from(FetchSettlement other) {
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
    public Builder data(Optional<List<FetchSettlementDataItem>> data) {
      this.data = data;
      return this;
    }

    public Builder data(List<FetchSettlementDataItem> data) {
      this.data = Optional.of(data);
      return this;
    }

    public FetchSettlement build() {
      return new FetchSettlement(cursor, limit, data);
    }
  }
}
