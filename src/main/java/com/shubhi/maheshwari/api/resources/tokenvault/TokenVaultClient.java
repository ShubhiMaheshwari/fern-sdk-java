package com.shubhi.maheshwari.api.resources.tokenvault;

import com.shubhi.maheshwari.api.resources.tokenvault.requests.FetchAllSavedInstrumentsRequest;
import com.shubhi.maheshwari.api.types.Cryptogram;
import com.shubhi.maheshwari.api.types.FetchAllSavedInstruments;
import java.util.List;

public interface TokenVaultClient {
  List<FetchAllSavedInstruments> fetchAllSavedInstruments(
      String customerId, FetchAllSavedInstrumentsRequest request);

  FetchAllSavedInstruments fetchSpecificSavedInstrument(String customerId, String instrumentId);

  FetchAllSavedInstruments deleteSpecificSavedInstrument(String customerId, String instrumentId);

  Cryptogram fetchCryptogram(String customerId, String instrumentId);
}
