package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = AppPaymentMethod.Builder.class)
public final class AppPaymentMethod {
  private final App app;

  private int _cachedHashCode;

  AppPaymentMethod(App app) {
    this.app = app;
  }

  @JsonProperty("app")
  public App getApp() {
    return app;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AppPaymentMethod && equalTo((AppPaymentMethod) other);
  }

  private boolean equalTo(AppPaymentMethod other) {
    return app.equals(other.app);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.app);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AppPaymentMethod{" + "app: " + app + "}";
  }

  public static AppStage builder() {
    return new Builder();
  }

  public interface AppStage {
    _FinalStage app(App app);

    Builder from(AppPaymentMethod other);
  }

  public interface _FinalStage {
    AppPaymentMethod build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder implements AppStage, _FinalStage {
    private App app;

    private Builder() {}

    @Override
    public Builder from(AppPaymentMethod other) {
      app(other.getApp());
      return this;
    }

    @Override
    @JsonSetter("app")
    public _FinalStage app(App app) {
      this.app = app;
      return this;
    }

    @Override
    public AppPaymentMethod build() {
      return new AppPaymentMethod(app);
    }
  }
}
