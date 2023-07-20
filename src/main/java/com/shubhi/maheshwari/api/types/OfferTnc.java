package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = OfferTnc.Builder.class)
public final class OfferTnc {
  private final OfferTncOfferTncType offerTncType;

  private final String offerTncValue;

  private int _cachedHashCode;

  OfferTnc(OfferTncOfferTncType offerTncType, String offerTncValue) {
    this.offerTncType = offerTncType;
    this.offerTncValue = offerTncValue;
  }

  /**
   * @return TnC Type for the Offer. It can be either <code>text</code> or <code>link</code>
   */
  @JsonProperty("offer_tnc_type")
  public OfferTncOfferTncType getOfferTncType() {
    return offerTncType;
  }

  /**
   * @return TnC for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("offer_tnc_value")
  public String getOfferTncValue() {
    return offerTncValue;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferTnc && equalTo((OfferTnc) other);
  }

  private boolean equalTo(OfferTnc other) {
    return offerTncType.equals(other.offerTncType) && offerTncValue.equals(other.offerTncValue);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.offerTncType, this.offerTncValue);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferTnc{"
        + "offerTncType: "
        + offerTncType
        + ", offerTncValue: "
        + offerTncValue
        + "}";
  }

  public static OfferTncTypeStage builder() {
    return new Builder();
  }

  public interface OfferTncTypeStage {
    OfferTncValueStage offerTncType(OfferTncOfferTncType offerTncType);

    Builder from(OfferTnc other);
  }

  public interface OfferTncValueStage {
    _FinalStage offerTncValue(String offerTncValue);
  }

  public interface _FinalStage {
    OfferTnc build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements OfferTncTypeStage, OfferTncValueStage, _FinalStage {
    private OfferTncOfferTncType offerTncType;

    private String offerTncValue;

    private Builder() {}

    @Override
    public Builder from(OfferTnc other) {
      offerTncType(other.getOfferTncType());
      offerTncValue(other.getOfferTncValue());
      return this;
    }

    /**
     * TnC Type for the Offer. It can be either <code>text</code> or <code>link</code>
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_tnc_type")
    public OfferTncValueStage offerTncType(OfferTncOfferTncType offerTncType) {
      this.offerTncType = offerTncType;
      return this;
    }

    /**
     * TnC for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_tnc_value")
    public _FinalStage offerTncValue(String offerTncValue) {
      this.offerTncValue = offerTncValue;
      return this;
    }

    @Override
    public OfferTnc build() {
      return new OfferTnc(offerTncType, offerTncValue);
    }
  }
}
