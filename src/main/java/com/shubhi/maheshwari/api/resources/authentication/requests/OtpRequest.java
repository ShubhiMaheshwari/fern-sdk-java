package com.shubhi.maheshwari.api.resources.authentication.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.OtpRequestAction;
import java.util.Objects;

@JsonDeserialize(builder = OtpRequest.Builder.class)
public final class OtpRequest {
  private final String otp;

  private final OtpRequestAction action;

  private int _cachedHashCode;

  OtpRequest(String otp, OtpRequestAction action) {
    this.otp = otp;
    this.action = action;
  }

  /**
   * @return OTP to be submitted
   */
  @JsonProperty("otp")
  public String getOtp() {
    return otp;
  }

  /**
   * @return The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP
   */
  @JsonProperty("action")
  public OtpRequestAction getAction() {
    return action;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OtpRequest && equalTo((OtpRequest) other);
  }

  private boolean equalTo(OtpRequest other) {
    return otp.equals(other.otp) && action.equals(other.action);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.otp, this.action);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OtpRequest{" + "otp: " + otp + ", action: " + action + "}";
  }

  public static OtpStage builder() {
    return new Builder();
  }

  public interface OtpStage {
    ActionStage otp(String otp);

    Builder from(OtpRequest other);
  }

  public interface ActionStage {
    _FinalStage action(OtpRequestAction action);
  }

  public interface _FinalStage {
    OtpRequest build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements OtpStage, ActionStage, _FinalStage {
    private String otp;

    private OtpRequestAction action;

    private Builder() {}

    @Override
    public Builder from(OtpRequest other) {
      otp(other.getOtp());
      action(other.getAction());
      return this;
    }

    /**
     * OTP to be submitted
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("otp")
    public ActionStage otp(String otp) {
      this.otp = otp;
      return this;
    }

    /**
     * The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("action")
    public _FinalStage action(OtpRequestAction action) {
      this.action = action;
      return this;
    }

    @Override
    public OtpRequest build() {
      return new OtpRequest(otp, action);
    }
  }
}
