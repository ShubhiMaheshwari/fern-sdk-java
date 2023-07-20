package com.shubhi.maheshwari.api.resources.authentication;

import com.shubhi.maheshwari.api.resources.authentication.requests.OtpRequest;
import com.shubhi.maheshwari.api.types.OtpResponseEntity;

public interface AuthenticationClient {
  OtpResponseEntity otpRequest(String paymentId, OtpRequest request);
}
