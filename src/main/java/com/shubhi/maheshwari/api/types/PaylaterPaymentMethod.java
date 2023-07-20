package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = PaylaterPaymentMethod.Builder.class)
public final class PaylaterPaymentMethod {
  private final Paylater paylater;

  private int _cachedHashCode;

  PaylaterPaymentMethod(Paylater paylater) {
    this.paylater = paylater;
  }

  @JsonProperty("paylater")
  public Paylater getPaylater() {
    return paylater;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaylaterPaymentMethod && equalTo((PaylaterPaymentMethod) other);
  }

  private boolean equalTo(PaylaterPaymentMethod other) {
    return paylater.equals(other.paylater);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paylater);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaylaterPaymentMethod{" + "paylater: " + paylater + "}";
  }

  public static PaylaterStage builder() {
    return new Builder();
  }

  public interface PaylaterStage {
    _FinalStage paylater(Paylater paylater);

    Builder from(PaylaterPaymentMethod other);
  }

  public interface _FinalStage {
    PaylaterPaymentMethod build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements PaylaterStage, _FinalStage {
    private Paylater paylater;

    private Builder() {}

    @Override
    public Builder from(PaylaterPaymentMethod other) {
      paylater(other.getPaylater());
      return this;
    }

    @Override
    @JsonSetter("paylater")
    public _FinalStage paylater(Paylater paylater) {
      this.paylater = paylater;
      return this;
    }

    @Override
    public PaylaterPaymentMethod build() {
      return new PaylaterPaymentMethod(paylater);
    }
  }
}
