package com.shubhi.maheshwari.api.resources.eligibilityapis;

import com.shubhi.maheshwari.api.resources.eligibilityapis.requests.EligibilityOffersRequest;
import com.shubhi.maheshwari.api.types.EligibilityCardlessEmiRequest;
import com.shubhi.maheshwari.api.types.EligibleCardlessEmiEntity;
import com.shubhi.maheshwari.api.types.EligibleOffersEntity;
import com.shubhi.maheshwari.api.types.EligiblePaylater;
import java.util.List;

public interface EligibilityApIsClient {
  List<EligibleOffersEntity> eligibilityOffer(EligibilityOffersRequest request);

  List<EligibleCardlessEmiEntity> eligibilityCardlessEmi(EligibilityCardlessEmiRequest request);

  List<EligiblePaylater> eligibilityPaylater(EligibilityCardlessEmiRequest request);
}
