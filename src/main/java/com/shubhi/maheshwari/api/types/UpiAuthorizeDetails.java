package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = UpiAuthorizeDetails.Builder.class)
public final class UpiAuthorizeDetails {
  private final Optional<String> approveBy;

  private final Optional<String> startTime;

  private final Optional<String> endTime;

  private int _cachedHashCode;

  UpiAuthorizeDetails(
      Optional<String> approveBy, Optional<String> startTime, Optional<String> endTime) {
    this.approveBy = approveBy;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * @return Time by which this authorization should be approved by the customer.
   */
  @JsonProperty("approve_by")
  public Optional<String> getApproveBy() {
    return approveBy;
  }

  /**
   * @return This is the time when the UPI one time mandate will start
   */
  @JsonProperty("start_time")
  public Optional<String> getStartTime() {
    return startTime;
  }

  /**
   * @return This is the time when the UPI mandate will be over. If the mandate has not been
   *     executed by this time, the funds will be returned back to the customer after this time.
   */
  @JsonProperty("end_time")
  public Optional<String> getEndTime() {
    return endTime;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof UpiAuthorizeDetails && equalTo((UpiAuthorizeDetails) other);
  }

  private boolean equalTo(UpiAuthorizeDetails other) {
    return approveBy.equals(other.approveBy)
        && startTime.equals(other.startTime)
        && endTime.equals(other.endTime);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.approveBy, this.startTime, this.endTime);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "UpiAuthorizeDetails{"
        + "approveBy: "
        + approveBy
        + ", startTime: "
        + startTime
        + ", endTime: "
        + endTime
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> approveBy = Optional.empty();

    private Optional<String> startTime = Optional.empty();

    private Optional<String> endTime = Optional.empty();

    private Builder() {}

    public Builder from(UpiAuthorizeDetails other) {
      approveBy(other.getApproveBy());
      startTime(other.getStartTime());
      endTime(other.getEndTime());
      return this;
    }

    @JsonSetter(value = "approve_by", nulls = Nulls.SKIP)
    public Builder approveBy(Optional<String> approveBy) {
      this.approveBy = approveBy;
      return this;
    }

    public Builder approveBy(String approveBy) {
      this.approveBy = Optional.of(approveBy);
      return this;
    }

    @JsonSetter(value = "start_time", nulls = Nulls.SKIP)
    public Builder startTime(Optional<String> startTime) {
      this.startTime = startTime;
      return this;
    }

    public Builder startTime(String startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }

    @JsonSetter(value = "end_time", nulls = Nulls.SKIP)
    public Builder endTime(Optional<String> endTime) {
      this.endTime = endTime;
      return this;
    }

    public Builder endTime(String endTime) {
      this.endTime = Optional.of(endTime);
      return this;
    }

    public UpiAuthorizeDetails build() {
      return new UpiAuthorizeDetails(approveBy, startTime, endTime);
    }
  }
}
