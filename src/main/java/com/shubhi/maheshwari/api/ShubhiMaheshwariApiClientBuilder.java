package com.shubhi.maheshwari.api;

import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.Environment;

public final class ShubhiMaheshwariApiClientBuilder {
  private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

  private Environment environment;

  public ShubhiMaheshwariApiClientBuilder clientId(String clientId) {
    this.clientOptionsBuilder.addHeader("x-client-id", clientId);
    return this;
  }

  public ShubhiMaheshwariApiClientBuilder clientSecret(String clientSecret) {
    this.clientOptionsBuilder.addHeader("x-client-secret", clientSecret);
    return this;
  }

  public ShubhiMaheshwariApiClientBuilder apiVersion(String apiVersion) {
    this.clientOptionsBuilder.addHeader("x-api-version", apiVersion);
    return this;
  }

  public ShubhiMaheshwariApiClientBuilder url(String url) {
    this.environment = Environment.custom(url);
    return this;
  }

  public ShubhiMaheshwariApiClient build() {
    clientOptionsBuilder.environment(this.environment);
    return new ShubhiMaheshwariApiClientImpl(clientOptionsBuilder.build());
  }
}
