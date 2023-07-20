package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = NbOffer.Builder.class)
public final class NbOffer {
  private final String bankName;

  private int _cachedHashCode;

  NbOffer(String bankName) {
    this.bankName = bankName;
  }

  @JsonProperty("bank_name")
  public String getBankName() {
    return bankName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NbOffer && equalTo((NbOffer) other);
  }

  private boolean equalTo(NbOffer other) {
    return bankName.equals(other.bankName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.bankName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NbOffer{" + "bankName: " + bankName + "}";
  }

  public static BankNameStage builder() {
    return new Builder();
  }

  public interface BankNameStage {
    _FinalStage bankName(String bankName);

    Builder from(NbOffer other);
  }

  public interface _FinalStage {
    NbOffer build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements BankNameStage, _FinalStage {
    private String bankName;

    private Builder() {}

    @Override
    public Builder from(NbOffer other) {
      bankName(other.getBankName());
      return this;
    }

    @Override
    @JsonSetter("bank_name")
    public _FinalStage bankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    @Override
    public NbOffer build() {
      return new NbOffer(bankName);
    }
  }
}
