package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = EmiOffer.Builder.class)
public final class EmiOffer {
  private final String type;

  private final String bankName;

  private final Optional<List<Integer>> tenures;

  private int _cachedHashCode;

  EmiOffer(String type, String bankName, Optional<List<Integer>> tenures) {
    this.type = type;
    this.bankName = bankName;
    this.tenures = tenures;
  }

  /**
   * @return Type of emi offer. Possible values are <code>credit_card_emi</code>, <code>
   *     debit_card_emi</code>, <code>cardless_emi</code> &lt;span style=&quot;white-space:
   *     nowrap&quot;&gt;<code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return Bank Name &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 100 characters
   *     </code>&lt;/span&gt;
   */
  @JsonProperty("bank_name")
  public String getBankName() {
    return bankName;
  }

  @JsonProperty("tenures")
  public Optional<List<Integer>> getTenures() {
    return tenures;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmiOffer && equalTo((EmiOffer) other);
  }

  private boolean equalTo(EmiOffer other) {
    return type.equals(other.type)
        && bankName.equals(other.bankName)
        && tenures.equals(other.tenures);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.bankName, this.tenures);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmiOffer{"
        + "type: "
        + type
        + ", bankName: "
        + bankName
        + ", tenures: "
        + tenures
        + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    BankNameStage type(String type);

    Builder from(EmiOffer other);
  }

  public interface BankNameStage {
    _FinalStage bankName(String bankName);
  }

  public interface _FinalStage {
    EmiOffer build();

    _FinalStage tenures(Optional<List<Integer>> tenures);

    _FinalStage tenures(List<Integer> tenures);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements TypeStage, BankNameStage, _FinalStage {
    private String type;

    private String bankName;

    private Optional<List<Integer>> tenures = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(EmiOffer other) {
      type(other.getType());
      bankName(other.getBankName());
      tenures(other.getTenures());
      return this;
    }

    /**
     * Type of emi offer. Possible values are <code>credit_card_emi</code>, <code>debit_card_emi
     * </code>, <code>cardless_emi</code> &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public BankNameStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Bank Name &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 100 characters</code>
     * &lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("bank_name")
    public _FinalStage bankName(String bankName) {
      this.bankName = bankName;
      return this;
    }

    @Override
    public _FinalStage tenures(List<Integer> tenures) {
      this.tenures = Optional.of(tenures);
      return this;
    }

    @Override
    @JsonSetter(value = "tenures", nulls = Nulls.SKIP)
    public _FinalStage tenures(Optional<List<Integer>> tenures) {
      this.tenures = tenures;
      return this;
    }

    @Override
    public EmiOffer build() {
      return new EmiOffer(type, bankName, tenures);
    }
  }
}
