package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = Upi.Builder.class)
public final class Upi {
  private final UpiChannel channel;

  private final Optional<String> upiId;

  private final Optional<Double> upiExpiryMinutes;

  private final Optional<Boolean> authorizeOnly;

  private final Optional<UpiAuthorizeDetails> authorization;

  private int _cachedHashCode;

  Upi(
      UpiChannel channel,
      Optional<String> upiId,
      Optional<Double> upiExpiryMinutes,
      Optional<Boolean> authorizeOnly,
      Optional<UpiAuthorizeDetails> authorization) {
    this.channel = channel;
    this.upiId = upiId;
    this.upiExpiryMinutes = upiExpiryMinutes;
    this.authorizeOnly = authorizeOnly;
    this.authorization = authorization;
  }

  /**
   * @return Specify the channel through which the payment must be processed. Can be one of
   *     [&quot;link&quot;, &quot;collect&quot;, &quot;qrcode&quot;]
   */
  @JsonProperty("channel")
  public UpiChannel getChannel() {
    return channel;
  }

  /**
   * @return Customer UPI VPA to process payment.
   */
  @JsonProperty("upi_id")
  public Optional<String> getUpiId() {
    return upiId;
  }

  /**
   * @return The UPI request will be valid for this expiry minutes. This parameter is only
   *     applicable for a UPI collect payment. The default value is 5 minutes. You should keep the
   *     minimum as 5 minutes, and maximum as 15 minutes
   */
  @JsonProperty("upi_expiry_minutes")
  public Optional<Double> getUpiExpiryMinutes() {
    return upiExpiryMinutes;
  }

  /**
   * @return For one time mandate on UPI. Set this as authorize_only = true. Please note that you
   *     can only use the &quot;collect&quot; channel if you are sending a one time mandate request
   */
  @JsonProperty("authorize_only")
  public Optional<Boolean> getAuthorizeOnly() {
    return authorizeOnly;
  }

  @JsonProperty("authorization")
  public Optional<UpiAuthorizeDetails> getAuthorization() {
    return authorization;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Upi && equalTo((Upi) other);
  }

  private boolean equalTo(Upi other) {
    return channel.equals(other.channel)
        && upiId.equals(other.upiId)
        && upiExpiryMinutes.equals(other.upiExpiryMinutes)
        && authorizeOnly.equals(other.authorizeOnly)
        && authorization.equals(other.authorization);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.channel,
              this.upiId,
              this.upiExpiryMinutes,
              this.authorizeOnly,
              this.authorization);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Upi{"
        + "channel: "
        + channel
        + ", upiId: "
        + upiId
        + ", upiExpiryMinutes: "
        + upiExpiryMinutes
        + ", authorizeOnly: "
        + authorizeOnly
        + ", authorization: "
        + authorization
        + "}";
  }

  public static ChannelStage builder() {
    return new Builder();
  }

  public interface ChannelStage {
    _FinalStage channel(UpiChannel channel);

    Builder from(Upi other);
  }

  public interface _FinalStage {
    Upi build();

    _FinalStage upiId(Optional<String> upiId);

    _FinalStage upiId(String upiId);

    _FinalStage upiExpiryMinutes(Optional<Double> upiExpiryMinutes);

    _FinalStage upiExpiryMinutes(Double upiExpiryMinutes);

    _FinalStage authorizeOnly(Optional<Boolean> authorizeOnly);

    _FinalStage authorizeOnly(Boolean authorizeOnly);

    _FinalStage authorization(Optional<UpiAuthorizeDetails> authorization);

    _FinalStage authorization(UpiAuthorizeDetails authorization);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements ChannelStage, _FinalStage {
    private UpiChannel channel;

    private Optional<UpiAuthorizeDetails> authorization = Optional.empty();

    private Optional<Boolean> authorizeOnly = Optional.empty();

    private Optional<Double> upiExpiryMinutes = Optional.empty();

    private Optional<String> upiId = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(Upi other) {
      channel(other.getChannel());
      upiId(other.getUpiId());
      upiExpiryMinutes(other.getUpiExpiryMinutes());
      authorizeOnly(other.getAuthorizeOnly());
      authorization(other.getAuthorization());
      return this;
    }

    /**
     * Specify the channel through which the payment must be processed. Can be one of
     * [&quot;link&quot;, &quot;collect&quot;, &quot;qrcode&quot;]
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("channel")
    public _FinalStage channel(UpiChannel channel) {
      this.channel = channel;
      return this;
    }

    @Override
    public _FinalStage authorization(UpiAuthorizeDetails authorization) {
      this.authorization = Optional.of(authorization);
      return this;
    }

    @Override
    @JsonSetter(value = "authorization", nulls = Nulls.SKIP)
    public _FinalStage authorization(Optional<UpiAuthorizeDetails> authorization) {
      this.authorization = authorization;
      return this;
    }

    /**
     * For one time mandate on UPI. Set this as authorize_only = true. Please note that you can only
     * use the &quot;collect&quot; channel if you are sending a one time mandate request
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage authorizeOnly(Boolean authorizeOnly) {
      this.authorizeOnly = Optional.of(authorizeOnly);
      return this;
    }

    @Override
    @JsonSetter(value = "authorize_only", nulls = Nulls.SKIP)
    public _FinalStage authorizeOnly(Optional<Boolean> authorizeOnly) {
      this.authorizeOnly = authorizeOnly;
      return this;
    }

    /**
     * The UPI request will be valid for this expiry minutes. This parameter is only applicable for
     * a UPI collect payment. The default value is 5 minutes. You should keep the minimum as 5
     * minutes, and maximum as 15 minutes
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage upiExpiryMinutes(Double upiExpiryMinutes) {
      this.upiExpiryMinutes = Optional.of(upiExpiryMinutes);
      return this;
    }

    @Override
    @JsonSetter(value = "upi_expiry_minutes", nulls = Nulls.SKIP)
    public _FinalStage upiExpiryMinutes(Optional<Double> upiExpiryMinutes) {
      this.upiExpiryMinutes = upiExpiryMinutes;
      return this;
    }

    /**
     * Customer UPI VPA to process payment.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage upiId(String upiId) {
      this.upiId = Optional.of(upiId);
      return this;
    }

    @Override
    @JsonSetter(value = "upi_id", nulls = Nulls.SKIP)
    public _FinalStage upiId(Optional<String> upiId) {
      this.upiId = upiId;
      return this;
    }

    @Override
    public Upi build() {
      return new Upi(channel, upiId, upiExpiryMinutes, authorizeOnly, authorization);
    }
  }
}
