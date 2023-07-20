package com.shubhi.maheshwari.api;

import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.core.Suppliers;
import com.shubhi.maheshwari.api.requests.FetchPgReconRequest;
import com.shubhi.maheshwari.api.requests.PostSettlementReconRequest;
import com.shubhi.maheshwari.api.requests.PostSettlementsRequest;
import com.shubhi.maheshwari.api.resources.authentication.AuthenticationClient;
import com.shubhi.maheshwari.api.resources.authentication.AuthenticationClientImpl;
import com.shubhi.maheshwari.api.resources.eligibilityapis.EligibilityApIsClient;
import com.shubhi.maheshwari.api.resources.eligibilityapis.EligibilityApIsClientImpl;
import com.shubhi.maheshwari.api.resources.offers.OffersClient;
import com.shubhi.maheshwari.api.resources.offers.OffersClientImpl;
import com.shubhi.maheshwari.api.resources.orders.OrdersClient;
import com.shubhi.maheshwari.api.resources.orders.OrdersClientImpl;
import com.shubhi.maheshwari.api.resources.paymentlinks.PaymentLinksClient;
import com.shubhi.maheshwari.api.resources.paymentlinks.PaymentLinksClientImpl;
import com.shubhi.maheshwari.api.resources.payments.PaymentsClient;
import com.shubhi.maheshwari.api.resources.payments.PaymentsClientImpl;
import com.shubhi.maheshwari.api.resources.refunds.RefundsClient;
import com.shubhi.maheshwari.api.resources.refunds.RefundsClientImpl;
import com.shubhi.maheshwari.api.resources.settlements.SettlementsClient;
import com.shubhi.maheshwari.api.resources.settlements.SettlementsClientImpl;
import com.shubhi.maheshwari.api.resources.softpos.SoftPosClient;
import com.shubhi.maheshwari.api.resources.softpos.SoftPosClientImpl;
import com.shubhi.maheshwari.api.resources.tokenvault.TokenVaultClient;
import com.shubhi.maheshwari.api.resources.tokenvault.TokenVaultClientImpl;
import com.shubhi.maheshwari.api.types.FetchPgRecon;
import com.shubhi.maheshwari.api.types.FetchSettlement;
import com.shubhi.maheshwari.api.types.FetchSettlementRecon;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class ShubhiMaheshwariApiClientImpl implements ShubhiMaheshwariApiClient {
  private final ClientOptions clientOptions;

  private final Supplier<OrdersClient> ordersClient;

  private final Supplier<AuthenticationClient> authenticationClient;

  private final Supplier<PaymentsClient> paymentsClient;

  private final Supplier<OffersClient> offersClient;

  private final Supplier<EligibilityApIsClient> eligibilityApIsClient;

  private final Supplier<RefundsClient> refundsClient;

  private final Supplier<SettlementsClient> settlementsClient;

  private final Supplier<PaymentLinksClient> paymentLinksClient;

  private final Supplier<SoftPosClient> softPosClient;

  private final Supplier<TokenVaultClient> tokenVaultClient;

  public ShubhiMaheshwariApiClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.ordersClient = Suppliers.memoize(() -> new OrdersClientImpl(clientOptions));
    this.authenticationClient =
        Suppliers.memoize(() -> new AuthenticationClientImpl(clientOptions));
    this.paymentsClient = Suppliers.memoize(() -> new PaymentsClientImpl(clientOptions));
    this.offersClient = Suppliers.memoize(() -> new OffersClientImpl(clientOptions));
    this.eligibilityApIsClient =
        Suppliers.memoize(() -> new EligibilityApIsClientImpl(clientOptions));
    this.refundsClient = Suppliers.memoize(() -> new RefundsClientImpl(clientOptions));
    this.settlementsClient = Suppliers.memoize(() -> new SettlementsClientImpl(clientOptions));
    this.paymentLinksClient = Suppliers.memoize(() -> new PaymentLinksClientImpl(clientOptions));
    this.softPosClient = Suppliers.memoize(() -> new SoftPosClientImpl(clientOptions));
    this.tokenVaultClient = Suppliers.memoize(() -> new TokenVaultClientImpl(clientOptions));
  }

  @Override
  public FetchSettlement postSettlements(PostSettlementsRequest request) {
    RequestBody _requestBody;
    try {
      _requestBody =
          RequestBody.create(
              ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()),
              MediaType.parse("application/json"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    Request.Builder _requestBuilder =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("settlements")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    if (request.getAccept().isPresent()) {
      _requestBuilder.addHeader("Accept", request.getAccept().get());
    }
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), FetchSettlement.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public FetchSettlementRecon postSettlementRecon(PostSettlementReconRequest request) {
    RequestBody _requestBody;
    try {
      _requestBody =
          RequestBody.create(
              ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()),
              MediaType.parse("application/json"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    Request.Builder _requestBuilder =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("settlement/recon")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    if (request.getAccept().isPresent()) {
      _requestBuilder.addHeader("Accept", request.getAccept().get());
    }
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), FetchSettlementRecon.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public FetchPgRecon postRecon(FetchPgReconRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("pagination", request.getPagination());
    _requestBodyProperties.put("filters", request.getFilters());
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
                    .addPathSegments("recon")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    if (request.getAccept().isPresent()) {
      _requestBuilder.addHeader("Accept", request.getAccept().get());
    }
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), FetchPgRecon.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OrdersClient orders() {
    return this.ordersClient.get();
  }

  @Override
  public AuthenticationClient authentication() {
    return this.authenticationClient.get();
  }

  @Override
  public PaymentsClient payments() {
    return this.paymentsClient.get();
  }

  @Override
  public OffersClient offers() {
    return this.offersClient.get();
  }

  @Override
  public EligibilityApIsClient eligibilityApIs() {
    return this.eligibilityApIsClient.get();
  }

  @Override
  public RefundsClient refunds() {
    return this.refundsClient.get();
  }

  @Override
  public SettlementsClient settlements() {
    return this.settlementsClient.get();
  }

  @Override
  public PaymentLinksClient paymentLinks() {
    return this.paymentLinksClient.get();
  }

  @Override
  public SoftPosClient softPos() {
    return this.softPosClient.get();
  }

  @Override
  public TokenVaultClient tokenVault() {
    return this.tokenVaultClient.get();
  }
}
