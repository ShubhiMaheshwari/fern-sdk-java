package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = OfferMeta.Builder.class)
public final class OfferMeta {
  private final String offerTitle;

  private final String offerDescription;

  private final String offerCode;

  private final String offerStartTime;

  private final String offerEndTime;

  private int _cachedHashCode;

  OfferMeta(
      String offerTitle,
      String offerDescription,
      String offerCode,
      String offerStartTime,
      String offerEndTime) {
    this.offerTitle = offerTitle;
    this.offerDescription = offerDescription;
    this.offerCode = offerCode;
    this.offerStartTime = offerStartTime;
    this.offerEndTime = offerEndTime;
  }

  /**
   * @return Title for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 50 characters</code>&lt;/span&gt;
   */
  @JsonProperty("offer_title")
  public String getOfferTitle() {
    return offerTitle;
  }

  /**
   * @return Description for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("offer_description")
  public String getOfferDescription() {
    return offerDescription;
  }

  /**
   * @return Unique identifier for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;
   *     <code>&lt;= 10 characters</code>&lt;/span&gt;
   */
  @JsonProperty("offer_code")
  public String getOfferCode() {
    return offerCode;
  }

  /**
   * @return Start Time for the Offer &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
   *     &lt;= 20 characters</code>&lt;/span&gt;
   */
  @JsonProperty("offer_start_time")
  public String getOfferStartTime() {
    return offerStartTime;
  }

  /**
   * @return Expiry Time for the Offer
   */
  @JsonProperty("offer_end_time")
  public String getOfferEndTime() {
    return offerEndTime;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferMeta && equalTo((OfferMeta) other);
  }

  private boolean equalTo(OfferMeta other) {
    return offerTitle.equals(other.offerTitle)
        && offerDescription.equals(other.offerDescription)
        && offerCode.equals(other.offerCode)
        && offerStartTime.equals(other.offerStartTime)
        && offerEndTime.equals(other.offerEndTime);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode =
          Objects.hash(
              this.offerTitle,
              this.offerDescription,
              this.offerCode,
              this.offerStartTime,
              this.offerEndTime);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "OfferMeta{"
        + "offerTitle: "
        + offerTitle
        + ", offerDescription: "
        + offerDescription
        + ", offerCode: "
        + offerCode
        + ", offerStartTime: "
        + offerStartTime
        + ", offerEndTime: "
        + offerEndTime
        + "}";
  }

  public static OfferTitleStage builder() {
    return new Builder();
  }

  public interface OfferTitleStage {
    OfferDescriptionStage offerTitle(String offerTitle);

    Builder from(OfferMeta other);
  }

  public interface OfferDescriptionStage {
    OfferCodeStage offerDescription(String offerDescription);
  }

  public interface OfferCodeStage {
    OfferStartTimeStage offerCode(String offerCode);
  }

  public interface OfferStartTimeStage {
    OfferEndTimeStage offerStartTime(String offerStartTime);
  }

  public interface OfferEndTimeStage {
    _FinalStage offerEndTime(String offerEndTime);
  }

  public interface _FinalStage {
    OfferMeta build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements OfferTitleStage,
          OfferDescriptionStage,
          OfferCodeStage,
          OfferStartTimeStage,
          OfferEndTimeStage,
          _FinalStage {
    private String offerTitle;

    private String offerDescription;

    private String offerCode;

    private String offerStartTime;

    private String offerEndTime;

    private Builder() {}

    @Override
    public Builder from(OfferMeta other) {
      offerTitle(other.getOfferTitle());
      offerDescription(other.getOfferDescription());
      offerCode(other.getOfferCode());
      offerStartTime(other.getOfferStartTime());
      offerEndTime(other.getOfferEndTime());
      return this;
    }

    /**
     * Title for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 50 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_title")
    public OfferDescriptionStage offerTitle(String offerTitle) {
      this.offerTitle = offerTitle;
      return this;
    }

    /**
     * Description for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_description")
    public OfferCodeStage offerDescription(String offerDescription) {
      this.offerDescription = offerDescription;
      return this;
    }

    /**
     * Unique identifier for the Offer. &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 10 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_code")
    public OfferStartTimeStage offerCode(String offerCode) {
      this.offerCode = offerCode;
      return this;
    }

    /**
     * Start Time for the Offer &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 20 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_start_time")
    public OfferEndTimeStage offerStartTime(String offerStartTime) {
      this.offerStartTime = offerStartTime;
      return this;
    }

    /**
     * Expiry Time for the Offer
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("offer_end_time")
    public _FinalStage offerEndTime(String offerEndTime) {
      this.offerEndTime = offerEndTime;
      return this;
    }

    @Override
    public OfferMeta build() {
      return new OfferMeta(offerTitle, offerDescription, offerCode, offerStartTime, offerEndTime);
    }
  }
}
