package com.shubhi.maheshwari.api.resources.orders;

import com.shubhi.maheshwari.api.resources.orders.requests.AuthorizationRequest;
import com.shubhi.maheshwari.api.resources.orders.requests.CreateOrderBackendRequest;
import com.shubhi.maheshwari.api.resources.orders.requests.OrderPayRequest;
import com.shubhi.maheshwari.api.types.OrderPayResponse;
import com.shubhi.maheshwari.api.types.OrdersEntity;
import com.shubhi.maheshwari.api.types.PaymentsEntity;

public interface OrdersClient {
  OrdersEntity createOrder(CreateOrderBackendRequest request);

  OrderPayResponse orderPay(OrderPayRequest request);

  PaymentsEntity preauthorization(String orderId, AuthorizationRequest request);

  OrdersEntity getOrder(String orderId);
}
