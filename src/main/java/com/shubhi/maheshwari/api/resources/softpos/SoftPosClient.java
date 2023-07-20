package com.shubhi.maheshwari.api.resources.softpos;

import com.shubhi.maheshwari.api.resources.softpos.requests.CreateTerminalRequest;
import com.shubhi.maheshwari.api.types.TerminalDetails;
import com.shubhi.maheshwari.api.types.TerminalResponse;

public interface SoftPosClient {
  TerminalResponse createTerminals(CreateTerminalRequest request);

  TerminalDetails getTerminalByMobileNumber(String terminalPhoneNo);
}
