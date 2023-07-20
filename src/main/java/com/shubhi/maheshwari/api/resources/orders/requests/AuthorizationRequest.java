package com.shubhi.maheshwari.api.resources.orders.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.AuthorizationRequestAction;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AuthorizationRequest.Builder.class)
public final class AuthorizationRequest {
  private final Optional<AuthorizationRequestAction> action;

  private final Optional<Double> amount;

  private int _cachedHashCode;

  AuthorizationRequest(Optional<AuthorizationRequestAction> action, Optional<Double> amount) {
    this.action = action;
    this.amount = amount;
  }

  /**
   * @return Type of authorization to run. Can be one of 'CAPTURE' , 'VOID'
   */
  @JsonProperty("action")
  public Optional<AuthorizationRequestAction> getAction() {
    return action;
  }

  /**
   * @return The amount if you are running a 'CAPTURE'
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AuthorizationRequest && equalTo((AuthorizationRequest) other);
  }

  private boolean equalTo(AuthorizationRequest other) {
    return action.equals(other.action) && amount.equals(other.amount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.action, this.amount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AuthorizationRequest{" + "action: " + action + ", amount: " + amount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<AuthorizationRequestAction> action = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Builder() {}

    public Builder from(AuthorizationRequest other) {
      action(other.getAction());
      amount(other.getAmount());
      return this;
    }

    @JsonSetter(value = "action", nulls = Nulls.SKIP)
    public Builder action(Optional<AuthorizationRequestAction> action) {
      this.action = action;
      return this;
    }

    public Builder action(AuthorizationRequestAction action) {
      this.action = Optional.of(action);
      return this;
    }

    @JsonSetter(value = "amount", nulls = Nulls.SKIP)
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    public AuthorizationRequest build() {
      return new AuthorizationRequest(action, amount);
    }
  }
}
