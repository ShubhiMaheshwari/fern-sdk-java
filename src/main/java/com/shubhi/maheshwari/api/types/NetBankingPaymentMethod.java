package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = NetBankingPaymentMethod.Builder.class)
public final class NetBankingPaymentMethod {
  private final Netbanking netbanking;

  private int _cachedHashCode;

  NetBankingPaymentMethod(Netbanking netbanking) {
    this.netbanking = netbanking;
  }

  @JsonProperty("netbanking")
  public Netbanking getNetbanking() {
    return netbanking;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NetBankingPaymentMethod && equalTo((NetBankingPaymentMethod) other);
  }

  private boolean equalTo(NetBankingPaymentMethod other) {
    return netbanking.equals(other.netbanking);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.netbanking);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NetBankingPaymentMethod{" + "netbanking: " + netbanking + "}";
  }

  public static NetbankingStage builder() {
    return new Builder();
  }

  public interface NetbankingStage {
    _FinalStage netbanking(Netbanking netbanking);

    Builder from(NetBankingPaymentMethod other);
  }

  public interface _FinalStage {
    NetBankingPaymentMethod build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements NetbankingStage, _FinalStage {
    private Netbanking netbanking;

    private Builder() {}

    @Override
    public Builder from(NetBankingPaymentMethod other) {
      netbanking(other.getNetbanking());
      return this;
    }

    @Override
    @JsonSetter("netbanking")
    public _FinalStage netbanking(Netbanking netbanking) {
      this.netbanking = netbanking;
      return this;
    }

    @Override
    public NetBankingPaymentMethod build() {
      return new NetBankingPaymentMethod(netbanking);
    }
  }
}
