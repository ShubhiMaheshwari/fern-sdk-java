package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = PaymentMethodNetBankingInPaymentsEntity.Builder.class)
public final class PaymentMethodNetBankingInPaymentsEntity {
  private final String channel;

  private final String netbankingBankCode;

  private final String netbankingBankName;

  private int _cachedHashCode;

  PaymentMethodNetBankingInPaymentsEntity(
      String channel, String netbankingBankCode, String netbankingBankName) {
    this.channel = channel;
    this.netbankingBankCode = netbankingBankCode;
    this.netbankingBankName = netbankingBankName;
  }

  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  @JsonProperty("netbanking_bank_code")
  public String getNetbankingBankCode() {
    return netbankingBankCode;
  }

  @JsonProperty("netbanking_bank_name")
  public String getNetbankingBankName() {
    return netbankingBankName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodNetBankingInPaymentsEntity
        && equalTo((PaymentMethodNetBankingInPaymentsEntity) other);
  }

  private boolean equalTo(PaymentMethodNetBankingInPaymentsEntity other) {
    return channel.equals(other.channel)
        && netbankingBankCode.equals(other.netbankingBankCode)
        && netbankingBankName.equals(other.netbankingBankName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(this.channel, this.netbankingBankCode, this.netbankingBankName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodNetBankingInPaymentsEntity{"
        + "channel: "
        + channel
        + ", netbankingBankCode: "
        + netbankingBankCode
        + ", netbankingBankName: "
        + netbankingBankName
        + "}";
  }

  public static ChannelStage builder() {
    return new Builder();
  }

  public interface ChannelStage {
    NetbankingBankCodeStage channel(String channel);

    Builder from(PaymentMethodNetBankingInPaymentsEntity other);
  }

  public interface NetbankingBankCodeStage {
    NetbankingBankNameStage netbankingBankCode(String netbankingBankCode);
  }

  public interface NetbankingBankNameStage {
    _FinalStage netbankingBankName(String netbankingBankName);
  }

  public interface _FinalStage {
    PaymentMethodNetBankingInPaymentsEntity build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements ChannelStage, NetbankingBankCodeStage, NetbankingBankNameStage, _FinalStage {
    private String channel;

    private String netbankingBankCode;

    private String netbankingBankName;

    private Builder() {}

    @Override
    public Builder from(PaymentMethodNetBankingInPaymentsEntity other) {
      channel(other.getChannel());
      netbankingBankCode(other.getNetbankingBankCode());
      netbankingBankName(other.getNetbankingBankName());
      return this;
    }

    @Override
    @JsonSetter("channel")
    public NetbankingBankCodeStage channel(String channel) {
      this.channel = channel;
      return this;
    }

    @Override
    @JsonSetter("netbanking_bank_code")
    public NetbankingBankNameStage netbankingBankCode(String netbankingBankCode) {
      this.netbankingBankCode = netbankingBankCode;
      return this;
    }

    @Override
    @JsonSetter("netbanking_bank_name")
    public _FinalStage netbankingBankName(String netbankingBankName) {
      this.netbankingBankName = netbankingBankName;
      return this;
    }

    @Override
    public PaymentMethodNetBankingInPaymentsEntity build() {
      return new PaymentMethodNetBankingInPaymentsEntity(
          channel, netbankingBankCode, netbankingBankName);
    }
  }
}
