package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(builder = CardOffer.Builder.class)
public final class CardOffer {
  private final List<String> type;

  private final String bankName;

  private final List<String> schemeName;

  private int _cachedHashCode;

  CardOffer(List<String> type, String bankName, List<String> schemeName) {
    this.type = type;
    this.bankName = bankName;
    this.schemeName = schemeName;
  }

  @JsonProperty("type")
  public List<String> getType() {
    return type;
  }

  /**
   * @return Bank Name of Card. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("bank_name")
  public String getBankName() {
    return bankName;
  }

  @JsonProperty("scheme_name")
  public List<String> getSchemeName() {
    return schemeName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CardOffer && equalTo((CardOffer) other);
  }

  private boolean equalTo(CardOffer other) {
    return type.equals(other.type)
        && bankName.equals(other.bankName)
        && schemeName.equals(other.schemeName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.bankName, this.schemeName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CardOffer{"
        + "type: "
        + type
        + ", bankName: "
        + bankName
        + ", schemeName: "
        + schemeName
        + "}";
  }

  public static BankNameStage builder() {
    return new Builder();
  }

  public interface BankNameStage {
    _FinalStage bankName(String bankName);

    Builder from(CardOffer other);
  }

  public interface _FinalStage {
    CardOffer build();

    _FinalStage type(List<String> type);

    _FinalStage addType(String type);

    _FinalStage addAllType(List<String> type);

    _FinalStage schemeName(List<String> schemeName);

    _FinalStage addSchemeName(String schemeName);

    _FinalStage addAllSchemeName(List<String> schemeName);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements BankNameStage, _FinalStage {
    private String bankName;

    private List<String> schemeName = new ArrayList<>();

    private List<String> type = new ArrayList<>();

    private Builder() {}

    @Override
    public Builder from(CardOffer other) {
      type(other.getType());
      bankName(other.getBankName());
      schemeName(other.getSchemeName());
      return this;
    }

    /**
     * Bank Name of Card. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
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
    public _FinalStage addAllSchemeName(List<String> schemeName) {
      this.schemeName.addAll(schemeName);
      return this;
    }

    @Override
    public _FinalStage addSchemeName(String schemeName) {
      this.schemeName.add(schemeName);
      return this;
    }

    @Override
    @JsonSetter(value = "scheme_name", nulls = Nulls.SKIP)
    public _FinalStage schemeName(List<String> schemeName) {
      this.schemeName.clear();
      this.schemeName.addAll(schemeName);
      return this;
    }

    @Override
    public _FinalStage addAllType(List<String> type) {
      this.type.addAll(type);
      return this;
    }

    @Override
    public _FinalStage addType(String type) {
      this.type.add(type);
      return this;
    }

    @Override
    @JsonSetter(value = "type", nulls = Nulls.SKIP)
    public _FinalStage type(List<String> type) {
      this.type.clear();
      this.type.addAll(type);
      return this;
    }

    @Override
    public CardOffer build() {
      return new CardOffer(type, bankName, schemeName);
    }
  }
}
