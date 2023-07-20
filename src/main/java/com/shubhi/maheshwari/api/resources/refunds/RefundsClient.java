package com.shubhi.maheshwari.api.resources.refunds;

import com.shubhi.maheshwari.api.resources.refunds.requests.CreateRefundRequest;
import com.shubhi.maheshwari.api.types.RefundsEntity;
import java.util.List;

public interface RefundsClient {
  List<RefundsEntity> getallrefundsfororder(String orderId);

  RefundsEntity createrefund(String orderId, CreateRefundRequest request);

  RefundsEntity getRefund(String orderId, String refundId);
}
