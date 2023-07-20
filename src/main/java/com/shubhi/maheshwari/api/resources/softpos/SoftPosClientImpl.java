package com.shubhi.maheshwari.api.resources.softpos;

import com.shubhi.maheshwari.api.core.ClientOptions;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import com.shubhi.maheshwari.api.resources.softpos.requests.CreateTerminalRequest;
import com.shubhi.maheshwari.api.types.TerminalDetails;
import com.shubhi.maheshwari.api.types.TerminalResponse;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class SoftPosClientImpl implements SoftPosClient {
  private final ClientOptions clientOptions;

  public SoftPosClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public TerminalResponse createTerminals(CreateTerminalRequest request) {
    Map<String, Object> _requestBodyProperties = new HashMap<>();
    _requestBodyProperties.put("terminal_id", request.getTerminalId());
    _requestBodyProperties.put("terminal_name", request.getTerminalName());
    _requestBodyProperties.put("terminal_phone_no", request.getTerminalPhoneNo());
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
                    .addPathSegments("terminal")
                    .build())
            .method("POST", _requestBody)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json");
    Request _request = _requestBuilder.build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), TerminalResponse.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public TerminalDetails getTerminalByMobileNumber(String terminalPhoneNo) {
    Request _request =
        new Request.Builder()
            .url(
                HttpUrl.parse(this.clientOptions.environment().getUrl())
                    .newBuilder()
                    .addPathSegments("terminal")
                    .addPathSegment(terminalPhoneNo)
                    .build())
            .method("GET", null)
            .headers(Headers.of(clientOptions.headers()))
            .addHeader("Content-Type", "application/json")
            .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(
            _response.body().string(), TerminalDetails.class);
      }
      throw new RuntimeException();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
