package com.shubhi.maheshwari.api.resources.paymentlinks;

import com.shubhi.maheshwari.api.resources.paymentlinks.requests.CreateLinkRequest;
import com.shubhi.maheshwari.api.types.LinkCancelledResponse;
import com.shubhi.maheshwari.api.types.LinkOrdersResponse;
import com.shubhi.maheshwari.api.types.LinkResponse;
import java.util.List;

public interface PaymentLinksClient {
  LinkResponse createPaymentLink(CreateLinkRequest request);

  LinkResponse getPaymentLinkDetails(String linkId);

  List<LinkOrdersResponse> getPaymentLinkOrders(String linkId);

  LinkCancelledResponse cancelPaymentLink(String linkId);
}
