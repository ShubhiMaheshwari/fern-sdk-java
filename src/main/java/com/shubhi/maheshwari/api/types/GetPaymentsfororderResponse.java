package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.shubhi.maheshwari.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = GetPaymentsfororderResponse.Deserializer.class)
public final class GetPaymentsfororderResponse {
  private final Object value;

  private final int type;

  private GetPaymentsfororderResponse(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if (this.type == 0) {
      return visitor.visit((PaymentsEntity) this.value);
    } else if (this.type == 1) {
      return visitor.visit((PaymentsEntity) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GetPaymentsfororderResponse
        && equalTo((GetPaymentsfororderResponse) other);
  }

  private boolean equalTo(GetPaymentsfororderResponse other) {
    return value.equals(other.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  @Override
  public String toString() {
    return this.value.toString();
  }

  public static GetPaymentsfororderResponse of(PaymentsEntity value) {
    return new GetPaymentsfororderResponse(value, 0);
  }

  public static GetPaymentsfororderResponse of(PaymentsEntity value) {
    return new GetPaymentsfororderResponse(value, 1);
  }

  public interface Visitor<T> {
    T visit(PaymentsEntity value);

    T visit(PaymentsEntity value);
  }

  static final class Deserializer extends StdDeserializer<GetPaymentsfororderResponse> {
    Deserializer() {
      super(GetPaymentsfororderResponse.class);
    }

    @Override
    public GetPaymentsfororderResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, PaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, PaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
