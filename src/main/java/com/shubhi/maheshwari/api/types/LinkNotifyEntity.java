package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = LinkNotifyEntity.Builder.class)
public final class LinkNotifyEntity {
  private final Optional<Boolean> sendSms;

  private final Optional<Boolean> sendEmail;

  private int _cachedHashCode;

  LinkNotifyEntity(Optional<Boolean> sendSms, Optional<Boolean> sendEmail) {
    this.sendSms = sendSms;
    this.sendEmail = sendEmail;
  }

  /**
   * @return If &quot;true&quot;, Cashfree will send sms on customer_phone
   */
  @JsonProperty("send_sms")
  public Optional<Boolean> getSendSms() {
    return sendSms;
  }

  /**
   * @return If &quot;true&quot;, Cashfree will send email on customer_email
   */
  @JsonProperty("send_email")
  public Optional<Boolean> getSendEmail() {
    return sendEmail;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LinkNotifyEntity && equalTo((LinkNotifyEntity) other);
  }

  private boolean equalTo(LinkNotifyEntity other) {
    return sendSms.equals(other.sendSms) && sendEmail.equals(other.sendEmail);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.sendSms, this.sendEmail);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinkNotifyEntity{" + "sendSms: " + sendSms + ", sendEmail: " + sendEmail + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private Optional<Boolean> sendSms = Optional.empty();

    private Optional<Boolean> sendEmail = Optional.empty();

    private Builder() {}

    public Builder from(LinkNotifyEntity other) {
      sendSms(other.getSendSms());
      sendEmail(other.getSendEmail());
      return this;
    }

    @JsonSetter(value = "send_sms", nulls = Nulls.SKIP)
    public Builder sendSms(Optional<Boolean> sendSms) {
      this.sendSms = sendSms;
      return this;
    }

    public Builder sendSms(Boolean sendSms) {
      this.sendSms = Optional.of(sendSms);
      return this;
    }

    @JsonSetter(value = "send_email", nulls = Nulls.SKIP)
    public Builder sendEmail(Optional<Boolean> sendEmail) {
      this.sendEmail = sendEmail;
      return this;
    }

    public Builder sendEmail(Boolean sendEmail) {
      this.sendEmail = Optional.of(sendEmail);
      return this;
    }

    public LinkNotifyEntity build() {
      return new LinkNotifyEntity(sendSms, sendEmail);
    }
  }
}
