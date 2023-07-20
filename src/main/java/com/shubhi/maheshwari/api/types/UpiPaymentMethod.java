package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = UpiPaymentMethod.Builder.class)
public final class UpiPaymentMethod {
  private final Upi upi;

  private int _cachedHashCode;

  UpiPaymentMethod(Upi upi) {
    this.upi = upi;
  }

  @JsonProperty("upi")
  public Upi getUpi() {
    return upi;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof UpiPaymentMethod && equalTo((UpiPaymentMethod) other);
  }

  private boolean equalTo(UpiPaymentMethod other) {
    return upi.equals(other.upi);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.upi);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "UpiPaymentMethod{" + "upi: " + upi + "}";
  }

  public static UpiStage builder() {
    return new Builder();
  }

  public interface UpiStage {
    _FinalStage upi(Upi upi);

    Builder from(UpiPaymentMethod other);
  }

  public interface _FinalStage {
    UpiPaymentMethod build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements UpiStage, _FinalStage {
    private Upi upi;

    private Builder() {}

    @Override
    public Builder from(UpiPaymentMethod other) {
      upi(other.getUpi());
      return this;
    }

    @Override
    @JsonSetter("upi")
    public _FinalStage upi(Upi upi) {
      this.upi = upi;
      return this;
    }

    @Override
    public UpiPaymentMethod build() {
      return new UpiPaymentMethod(upi);
    }
  }
}
