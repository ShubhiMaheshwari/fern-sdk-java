package com.shubhi.maheshwari.api.core;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import okhttp3.OkHttpClient;

public final class ClientOptions {
  private final Environment environment;

  private final Map<String, String> headers;

  private final Map<String, Supplier<String>> headerSuppliers;

  private final OkHttpClient httpClient;

  private ClientOptions(
      Environment environment,
      Map<String, String> headers,
      Map<String, Supplier<String>> headerSuppliers,
      OkHttpClient httpClient) {
    this.environment = environment;
    this.headers = headers;
    this.headerSuppliers = headerSuppliers;
    this.httpClient = httpClient;
  }

  public Environment environment() {
    return this.environment;
  }

  public Map<String, String> headers() {
    Map<String, String> values = new HashMap<>(this.headers);
    headerSuppliers.forEach(
        (key, supplier) -> {
          values.put(key, supplier.get());
        });
    return values;
  }

  public OkHttpClient httpClient() {
    return this.httpClient;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private Environment environment;

    private final Map<String, String> headers = new HashMap<>();

    private final Map<String, Supplier<String>> headerSuppliers = new HashMap<>();

    public Builder environment(Environment environment) {
      this.environment = environment;
      return this;
    }

    public Builder addHeader(String key, String value) {
      this.headers.put(key, value);
      return this;
    }

    public Builder addHeader(String key, Supplier<String> value) {
      this.headerSuppliers.put(key, value);
      return this;
    }

    public ClientOptions build() {
      return new ClientOptions(environment, headers, headerSuppliers, new OkHttpClient());
    }
  }
}
