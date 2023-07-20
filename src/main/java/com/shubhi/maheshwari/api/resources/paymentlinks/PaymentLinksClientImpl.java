package com.shubhi.maheshwari.api.resources.paymentlinks;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.resources.paymentlinks.requests.CreateLinkRequest;
import com.shubhi.maheshwari.api.types.LinkCancelledResponse;
import com.shubhi.maheshwari.api.types.LinkOrdersResponse;
import com.shubhi.maheshwari.api.types.LinkResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class PaymentLinksClientImpl implements PaymentLinksClient {
  private final ClientOptions clientOptions;

  public PaymentLinksClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public LinkResponse createPaymentLink(CreateLinkRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("link_id", request.getLinkId());
    _requestBodyProperties.put("link_amount", request.getLinkAmount());
    _requestBodyProperties.put("link_currency", request.getLinkCurrency());
    _requestBodyProperties.put("link_purpose", request.getLinkPurpose());
    _requestBodyProperties.put("customer_details", request.getCustomerDetails());
    _requestBodyProperties.put("link_partial_payments", request.getLinkPartialPayments());
    _requestBodyProperties.put(
        "link_minimum_partial_amount", request.getLinkMinimumPartialAmount());
    _requestBodyProperties.put("link_expiry_time", request.getLinkExpiryTime());
    _requestBodyProperties.put("link_notify", request.getLinkNotify());
    _requestBodyProperties.put("link_auto_reminders", request.getLinkAutoReminders());
    _requestBodyProperties.put("link_notes", request.getLinkNotes());
    _requestBodyProperties.put("link_meta", request.getLinkMeta());
    RequestBody _requestBody;
    try {
      _requestBody =
          RequestBody.create(
              ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties),
              MediaType.parse("application/json"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    Request.Builder _requestBuilder =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("links")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), LinkResponse.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public LinkResponse getPaymentLinkDetails(String linkId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("links")
                    .addPathSegment(linkId)
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), LinkResponse.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<LinkOrdersResponse> getPaymentLinkOrders(String linkId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("links")
                    .addPathSegment(linkId)
                    .addPathSegments("orders")
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), new TypeReference<List<LinkOrdersResponse>>() {});
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public LinkCancelledResponse cancelPaymentLink(String linkId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("links")
                    .addPathSegment(linkId)
                    .addPathSegments("cancel")
                    .build())
            .method("POST", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), LinkCancelledResponse.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
