package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = RefundSpeed.Builder.class)
public final class RefundSpeed {
  private final Optional<String> requested;

  private final Optional<String> accepted;

  private final Optional<String> processed;

  private final Optional<String> message;

  private int _cachedHashCode;

  RefundSpeed(
      Optional<String> requested,
      Optional<String> accepted,
      Optional<String> processed,
      Optional<String> message) {
    this.requested = requested;
    this.accepted = accepted;
    this.processed = processed;
    this.message = message;
  }

  /**
   * @return Requested speed of refund.
   */
  @JsonProperty("requested")
  public Optional<String> getRequested() {
    return requested;
  }

  /**
   * @return Accepted speed of refund.
   */
  @JsonProperty("accepted")
  public Optional<String> getAccepted() {
    return accepted;
  }

  /**
   * @return Processed speed of refund.
   */
  @JsonProperty("processed")
  public Optional<String> getProcessed() {
    return processed;
  }

  /**
   * @return Error message, if any for refund_speed request
   */
  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RefundSpeed && equalTo((RefundSpeed) other);
  }

  private boolean equalTo(RefundSpeed other) {
    return requested.equals(other.requested)
        && accepted.equals(other.accepted)
        && processed.equals(other.processed)
        && message.equals(other.message);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.requested, this.accepted, this.processed, this.message);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RefundSpeed{"
        + "requested: "
        + requested
        + ", accepted: "
        + accepted
        + ", processed: "
        + processed
        + ", message: "
        + message
        + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<String> requested = Optional.empty();

    private Optional<String> accepted = Optional.empty();

    private Optional<String> processed = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Builder() {}

    public Builder from(RefundSpeed other) {
      requested(other.getRequested());
      accepted(other.getAccepted());
      processed(other.getProcessed());
      message(other.getMessage());
      return this;
    }

    @JsonSetter(value = "requested", nulls = Nulls.SKIP)
    public Builder requested(Optional<String> requested) {
      this.requested = requested;
      return this;
    }

    public Builder requested(String requested) {
      this.requested = Optional.of(requested);
      return this;
    }

    @JsonSetter(value = "accepted", nulls = Nulls.SKIP)
    public Builder accepted(Optional<String> accepted) {
      this.accepted = accepted;
      return this;
    }

    public Builder accepted(String accepted) {
      this.accepted = Optional.of(accepted);
      return this;
    }

    @JsonSetter(value = "processed", nulls = Nulls.SKIP)
    public Builder processed(Optional<String> processed) {
      this.processed = processed;
      return this;
    }

    public Builder processed(String processed) {
      this.processed = Optional.of(processed);
      return this;
    }

    @JsonSetter(value = "message", nulls = Nulls.SKIP)
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    public RefundSpeed build() {
      return new RefundSpeed(requested, accepted, processed, message);
    }
  }
}
