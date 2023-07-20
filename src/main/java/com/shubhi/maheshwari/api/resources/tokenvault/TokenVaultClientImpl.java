package com.shubhi.maheshwari.api.resources.tokenvault;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.resources.tokenvault.requests.FetchAllSavedInstrumentsRequest;
import com.shubhi.maheshwari.api.types.Cryptogram;
import com.shubhi.maheshwari.api.types.FetchAllSavedInstruments;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class TokenVaultClientImpl implements TokenVaultClient {
  private final ClientOptions clientOptions;

  public TokenVaultClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<FetchAllSavedInstruments> fetchAllSavedInstruments(
      String customerId, FetchAllSavedInstrumentsRequest request) {
    HttpUrl.Builder _httpUrl =
        HttpUrl.parse(this.clientOptions.environment().getUrl())
            .newBuilder()
            .addPathSegments("customers")
            .addPathSegment(customerId)
            .addPathSegments("instruments");
    _httpUrl.addQueryParameter("instrument_type", request.getInstrumentType());
    RequestBody _requestBody = null;
    Request.Builder _requestBuilder =
        new Request.Builder()
            .url(_httpUrl.build())
            .method("GET", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), new TypeReference<List<FetchAllSavedInstruments>>() {});
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public FetchAllSavedInstruments fetchSpecificSavedInstrument(
      String customerId, String instrumentId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("customers")
                    .addPathSegment(customerId)
                    .addPathSegments("instruments")
                    .addPathSegment(instrumentId)
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), FetchAllSavedInstruments.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public FetchAllSavedInstruments deleteSpecificSavedInstrument(
      String customerId, String instrumentId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("customers")
                    .addPathSegment(customerId)
                    .addPathSegments("instruments")
                    .addPathSegment(instrumentId)
                    .build())
            .method("DELETE", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), FetchAllSavedInstruments.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Cryptogram fetchCryptogram(String customerId, String instrumentId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("customers")
                    .addPathSegment(customerId)
                    .addPathSegments("instruments")
                    .addPathSegment(instrumentId)
                    .addPathSegments("cryptogram")
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Cryptogram.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
