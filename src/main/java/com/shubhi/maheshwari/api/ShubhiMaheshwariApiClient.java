package com.shubhi.maheshwari.api;

import com.shubhi.maheshwari.api.requests.FetchPgReconRequest;
import com.shubhi.maheshwari.api.requests.PostSettlementReconRequest;
import com.shubhi.maheshwari.api.requests.PostSettlementsRequest;
import com.shubhi.maheshwari.api.resources.authentication.AuthenticationClient;
import com.shubhi.maheshwari.api.resources.eligibilityapis.EligibilityApIsClient;
import com.shubhi.maheshwari.api.resources.offers.OffersClient;
import com.shubhi.maheshwari.api.resources.orders.OrdersClient;
import com.shubhi.maheshwari.api.resources.paymentlinks.PaymentLinksClient;
import com.shubhi.maheshwari.api.resources.payments.PaymentsClient;
import com.shubhi.maheshwari.api.resources.refunds.RefundsClient;
import com.shubhi.maheshwari.api.resources.settlements.SettlementsClient;
import com.shubhi.maheshwari.api.resources.softpos.SoftPosClient;
import com.shubhi.maheshwari.api.resources.tokenvault.TokenVaultClient;
import com.shubhi.maheshwari.api.types.FetchPgRecon;
import com.shubhi.maheshwari.api.types.FetchSettlement;
import com.shubhi.maheshwari.api.types.FetchSettlementRecon;

public interface ShubhiMaheshwariApiClient {
  FetchSettlement postSettlements(PostSettlementsRequest request);

  FetchSettlementRecon postSettlementRecon(PostSettlementReconRequest request);

  FetchPgRecon postRecon(FetchPgReconRequest request);

  OrdersClient orders();

  AuthenticationClient authentication();

  PaymentsClient payments();

  OffersClient offers();

  EligibilityApIsClient eligibilityApIs();

  RefundsClient refunds();

  SettlementsClient settlements();

  PaymentLinksClient paymentLinks();

  SoftPosClient softPos();

  TokenVaultClient tokenVault();

  static ShubhiMaheshwariApiClientBuilder builder() {
    return new ShubhiMaheshwariApiClientBuilder();
  }
}
