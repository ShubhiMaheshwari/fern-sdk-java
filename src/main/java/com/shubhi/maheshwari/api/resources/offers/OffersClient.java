package com.shubhi.maheshwari.api.resources.offers;

import com.shubhi.maheshwari.api.resources.offers.requests.CreateOfferBackendRequest;
import com.shubhi.maheshwari.api.types.OfferEntity;

public interface OffersClient {
  OfferEntity createOffer(CreateOfferBackendRequest request);

  OfferEntity getOffer(String offerId);
}
