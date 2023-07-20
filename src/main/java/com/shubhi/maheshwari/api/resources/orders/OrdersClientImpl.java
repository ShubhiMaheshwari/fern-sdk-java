package com.shubhi.maheshwari.api.resources.orders;

import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.resources.orders.requests.AuthorizationRequest;
import com.shubhi.maheshwari.api.resources.orders.requests.CreateOrderBackendRequest;
import com.shubhi.maheshwari.api.resources.orders.requests.OrderPayRequest;
import com.shubhi.maheshwari.api.types.OrderPayResponse;
import com.shubhi.maheshwari.api.types.OrdersEntity;
import com.shubhi.maheshwari.api.types.PaymentsEntity;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class OrdersClientImpl implements OrdersClient {
  private final ClientOptions clientOptions;

  public OrdersClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public OrdersEntity createOrder(CreateOrderBackendRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("order_id", request.getOrderId());
    _requestBodyProperties.put("order_amount", request.getOrderAmount());
    _requestBodyProperties.put("order_currency", request.getOrderCurrency());
    _requestBodyProperties.put("customer_details", request.getCustomerDetails());
    _requestBodyProperties.put("terminal", request.getTerminal());
    _requestBodyProperties.put("order_meta", request.getOrderMeta());
    _requestBodyProperties.put("order_expiry_time", request.getOrderExpiryTime());
    _requestBodyProperties.put("order_note", request.getOrderNote());
    _requestBodyProperties.put("order_tags", request.getOrderTags());
    _requestBodyProperties.put("order_splits", request.getOrderSplits());
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
                    .addPathSegments("orders")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), OrdersEntity.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OrderPayResponse orderPay(OrderPayRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("payment_session_id", request.getPaymentSessionId());
    _requestBodyProperties.put("payment_method", request.getPaymentMethod());
    _requestBodyProperties.put("save_instrument", request.getSaveInstrument());
    _requestBodyProperties.put("offer_id", request.getOfferId());
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
                    .addPathSegments("orders/sessions")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), OrderPayResponse.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public PaymentsEntity preauthorization(String orderId, AuthorizationRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("action", request.getAction());
    _requestBodyProperties.put("amount", request.getAmount());
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
                    .addPathSegments("orders")
                    .addPathSegment(orderId)
                    .addPathSegments("authorization")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
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

  @Override
  public OrdersEntity getOrder(String orderId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("orders")
                    .addPathSegment(orderId)
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), OrdersEntity.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
