package com.shubhi.maheshwari.api.resources.payments;

import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.types.GetPaymentsfororderResponse;
import com.shubhi.maheshwari.api.types.PaymentsEntity;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public final class PaymentsClientImpl implements PaymentsClient {
  private final ClientOptions clientOptions;

  public PaymentsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public GetPaymentsfororderResponse getPaymentsfororder(String orderId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("orders")
                    .addPathSegment(orderId)
                    .addPathSegments("payments")
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), GetPaymentsfororderResponse.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public PaymentsEntity getPaymentbyId(String orderId, int cfPaymentId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("orders")
                    .addPathSegment(orderId)
                    .addPathSegments("payments")
                    .addPathSegment(Integer.toString(cfPaymentId))
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentsEntity.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
