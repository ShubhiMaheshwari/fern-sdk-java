package com.shubhi.maheshwari.api.resources.payments;

import com.shubhi.maheshwari.api.types.GetPaymentsfororderResponse;
import com.shubhi.maheshwari.api.types.PaymentsEntity;

public interface PaymentsClient {
  GetPaymentsfororderResponse getPaymentsfororder(String orderId);

  PaymentsEntity getPaymentbyId(String orderId, int cfPaymentId);
}
