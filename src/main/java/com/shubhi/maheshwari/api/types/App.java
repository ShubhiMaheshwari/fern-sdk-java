package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = App.Builder.class)
public final class App {
  private final String channel;

  private final AppProvider provider;

  private final String phone;

  private int _cachedHashCode;

  App(String channel, AppProvider provider, String phone) {
    this.channel = channel;
    this.provider = provider;
    this.phone = phone;
  }

  /**
   * @return Specify the channel through which the payment must be processed.
   */
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  /**
   * @return Specify the provider through which the payment must be processed.
   */
  @JsonProperty("provider")
  public AppProvider getProvider() {
    return provider;
  }

  /**
   * @return Customer phone number associated with a wallet for payment.
   */
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof App && equalTo((App) other);
  }

  private boolean equalTo(App other) {
    return channel.equals(other.channel)
        && provider.equals(other.provider)
        && phone.equals(other.phone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.channel, this.provider, this.phone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "App{" + "channel: " + channel + ", provider: " + provider + ", phone: " + phone + "}";
  }

  public static ChannelStage builder() {
    return new Builder();
  }

  public interface ChannelStage {
    ProviderStage channel(String channel);

    Builder from(App other);
  }

  public interface ProviderStage {
    PhoneStage provider(AppProvider provider);
  }

  public interface PhoneStage {
    _FinalStage phone(String phone);
  }

  public interface _FinalStage {
    App build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements ChannelStage, ProviderStage, PhoneStage, _FinalStage {
    private String channel;

    private AppProvider provider;

    private String phone;

    private Builder() {}

    @Override
    public Builder from(App other) {
      channel(other.getChannel());
      provider(other.getProvider());
      phone(other.getPhone());
      return this;
    }

    /**
     * Specify the channel through which the payment must be processed.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("channel")
    public ProviderStage channel(String channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Specify the provider through which the payment must be processed.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("provider")
    public PhoneStage provider(AppProvider provider) {
      this.provider = provider;
      return this;
    }

    /**
     * Customer phone number associated with a wallet for payment.
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("phone")
    public _FinalStage phone(String phone) {
      this.phone = phone;
      return this;
    }

    @Override
    public App build() {
      return new App(channel, provider, phone);
    }
  }
}
