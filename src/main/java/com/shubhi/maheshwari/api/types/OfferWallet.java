package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = OfferWallet.Builder.class)
public final class OfferWallet {
  private final Optional<WalletOffer> app;

  private int _cachedHashCode;

  OfferWallet(Optional<WalletOffer> app) {
    this.app = app;
  }

  @JsonProperty("app")
  public Optional<WalletOffer> getApp() {
    return app;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferWallet && equalTo((OfferWallet) other);
  }

  private boolean equalTo(OfferWallet other) {
    return app.equals(other.app);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.app);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferWallet{" + "app: " + app + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<WalletOffer> app = Optional.empty();

    private Builder() {}

    public Builder from(OfferWallet other) {
      app(other.getApp());
      return this;
    }

    @JsonSetter(value = "app", nulls = Nulls.SKIP)
    public Builder app(Optional<WalletOffer> app) {
      this.app = app;
      return this;
    }

    public Builder app(WalletOffer app) {
      this.app = Optional.of(app);
      return this;
    }

    public OfferWallet build() {
      return new OfferWallet(app);
    }
  }
}
