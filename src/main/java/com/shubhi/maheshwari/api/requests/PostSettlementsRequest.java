package com.shubhi.maheshwari.api.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shubhi.maheshwari.api.types.FetchSettlementReconRequest;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = PostSettlementsRequest.Builder.class)
public final class PostSettlementsRequest {
  private final Optional<String> accept;

  private final FetchSettlementReconRequest body;

  private int _cachedHashCode;

  PostSettlementsRequest(Optional<String> accept, FetchSettlementReconRequest body) {
    this.accept = accept;
    this.body = body;
  }

  /**
   * @return application/json
   */
  @JsonProperty("Accept")
  public Optional<String> getAccept() {
    return accept;
  }

  @JsonProperty("body")
  public FetchSettlementReconRequest getBody() {
    return body;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PostSettlementsRequest && equalTo((PostSettlementsRequest) other);
  }

  private boolean equalTo(PostSettlementsRequest other) {
    return accept.equals(other.accept) && body.equals(other.body);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accept, this.body);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PostSettlementsRequest{" + "accept: " + accept + ", body: " + body + "}";
  }

  public static BodyStage builder() {
    return new Builder();
  }

  public interface BodyStage {
    _FinalStage body(FetchSettlementReconRequest body);

    Builder from(PostSettlementsRequest other);
  }

  public interface _FinalStage {
    PostSettlementsRequest build();

    _FinalStage accept(Optional<String> accept);

    _FinalStage accept(String accept);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements BodyStage, _FinalStage {
    private FetchSettlementReconRequest body;

    private Optional<String> accept = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(PostSettlementsRequest other) {
      accept(other.getAccept());
      body(other.getBody());
      return this;
    }

    @Override
    @JsonSetter("body")
    public _FinalStage body(FetchSettlementReconRequest body) {
      this.body = body;
      return this;
    }

    /**
     * application/json
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accept(String accept) {
      this.accept = Optional.of(accept);
      return this;
    }

    @Override
    @JsonSetter(value = "Accept", nulls = Nulls.SKIP)
    public _FinalStage accept(Optional<String> accept) {
      this.accept = accept;
      return this;
    }

    @Override
    public PostSettlementsRequest build() {
      return new PostSettlementsRequest(accept, body);
    }
  }
}
