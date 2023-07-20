package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = Netbanking.Builder.class)
public final class Netbanking {
  private final String channel;

  private final int netbankingBankCode;

  private int _cachedHashCode;

  Netbanking(String channel, int netbankingBankCode) {
    this.channel = channel;
    this.netbankingBankCode = netbankingBankCode;
  }

  /**
   * @return The channel for netbanking will always be <code>link</code>
   */
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  /**
   * @return Bank code
   */
  @JsonProperty("netbanking_bank_code")
  public int getNetbankingBankCode() {
    return netbankingBankCode;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Netbanking && equalTo((Netbanking) other);
  }

  private boolean equalTo(Netbanking other) {
    return channel.equals(other.channel) && netbankingBankCode == other.netbankingBankCode;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.channel, this.netbankingBankCode);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Netbanking{"
        + "channel: "
        + channel
        + ", netbankingBankCode: "
        + netbankingBankCode
        + "}";
  }

  public static ChannelStage builder() {
    return new Builder();
  }

  public interface ChannelStage {
    NetbankingBankCodeStage channel(String channel);

    Builder from(Netbanking other);
  }

  public interface NetbankingBankCodeStage {
    _FinalStage netbankingBankCode(int netbankingBankCode);
  }

  public interface _FinalStage {
    Netbanking build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements ChannelStage, NetbankingBankCodeStage, _FinalStage {
    private String channel;

    private int netbankingBankCode;

    private Builder() {}

    @Override
    public Builder from(Netbanking other) {
      channel(other.getChannel());
      netbankingBankCode(other.getNetbankingBankCode());
      return this;
    }

    /**
     * The channel for netbanking will always be <code>link</code>
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("channel")
    public NetbankingBankCodeStage channel(String channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Bank code
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("netbanking_bank_code")
    public _FinalStage netbankingBankCode(int netbankingBankCode) {
      this.netbankingBankCode = netbankingBankCode;
      return this;
    }

    @Override
    public Netbanking build() {
      return new Netbanking(channel, netbankingBankCode);
    }
  }
}
