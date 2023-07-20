package com.shubhi.maheshwari.api.resources.offers;

import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.resources.offers.requests.CreateOfferBackendRequest;
import com.shubhi.maheshwari.api.types.OfferEntity;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class OffersClientImpl implements OffersClient {
  private final ClientOptions clientOptions;

  public OffersClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public OfferEntity createOffer(CreateOfferBackendRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("offer_meta", request.getOfferMeta());
    _requestBodyProperties.put("offer_tnc", request.getOfferTnc());
    _requestBodyProperties.put("offer_details", request.getOfferDetails());
    _requestBodyProperties.put("offer_validations", request.getOfferValidations());
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
                    .addPathSegments("offers")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), OfferEntity.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OfferEntity getOffer(String offerId) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("offers")
                    .addPathSegment(offerId)
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), OfferEntity.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
