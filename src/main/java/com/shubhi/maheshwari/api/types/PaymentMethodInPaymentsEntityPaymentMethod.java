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

@JsonDeserialize(using = PaymentMethodInPaymentsEntityPaymentMethod.Deserializer.class)
public final class PaymentMethodInPaymentsEntityPaymentMethod {
  private final Object value;

  private final int type;

  private PaymentMethodInPaymentsEntityPaymentMethod(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if (this.type == 0) {
      return visitor.visit((PaymentMethodCardInPaymentsEntity) this.value);
    } else if (this.type == 1) {
      return visitor.visit((PaymentMethodNetBankingInPaymentsEntity) this.value);
    } else if (this.type == 2) {
      return visitor.visit((PaymentMethodUpiInPaymentsEntity) this.value);
    } else if (this.type == 3) {
      return visitor.visit((PaymentMethodAppInPaymentsEntity) this.value);
    } else if (this.type == 4) {
      return visitor.visit((PaymentMethodCardlessEmiInPaymentsEntity) this.value);
    } else if (this.type == 5) {
      return visitor.visit((PaymentMethodPaylaterInPaymentsEntity) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodInPaymentsEntityPaymentMethod
        && equalTo((PaymentMethodInPaymentsEntityPaymentMethod) other);
  }

  private boolean equalTo(PaymentMethodInPaymentsEntityPaymentMethod other) {
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

  public static PaymentMethodInPaymentsEntityPaymentMethod of(
      PaymentMethodCardInPaymentsEntity value) {
    return new PaymentMethodInPaymentsEntityPaymentMethod(value, 0);
  }

  public static PaymentMethodInPaymentsEntityPaymentMethod of(
      PaymentMethodNetBankingInPaymentsEntity value) {
    return new PaymentMethodInPaymentsEntityPaymentMethod(value, 1);
  }

  public static PaymentMethodInPaymentsEntityPaymentMethod of(
      PaymentMethodUpiInPaymentsEntity value) {
    return new PaymentMethodInPaymentsEntityPaymentMethod(value, 2);
  }

  public static PaymentMethodInPaymentsEntityPaymentMethod of(
      PaymentMethodAppInPaymentsEntity value) {
    return new PaymentMethodInPaymentsEntityPaymentMethod(value, 3);
  }

  public static PaymentMethodInPaymentsEntityPaymentMethod of(
      PaymentMethodCardlessEmiInPaymentsEntity value) {
    return new PaymentMethodInPaymentsEntityPaymentMethod(value, 4);
  }

  public static PaymentMethodInPaymentsEntityPaymentMethod of(
      PaymentMethodPaylaterInPaymentsEntity value) {
    return new PaymentMethodInPaymentsEntityPaymentMethod(value, 5);
  }

  public interface Visitor<T> {
    T visit(PaymentMethodCardInPaymentsEntity value);

    T visit(PaymentMethodNetBankingInPaymentsEntity value);

    T visit(PaymentMethodUpiInPaymentsEntity value);

    T visit(PaymentMethodAppInPaymentsEntity value);

    T visit(PaymentMethodCardlessEmiInPaymentsEntity value);

    T visit(PaymentMethodPaylaterInPaymentsEntity value);
  }

  static final class Deserializer
      extends StdDeserializer<PaymentMethodInPaymentsEntityPaymentMethod> {
    Deserializer() {
      super(PaymentMethodInPaymentsEntityPaymentMethod.class);
    }

    @Override
    public PaymentMethodInPaymentsEntityPaymentMethod deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(
            ObjectMappers.JSON_MAPPER.convertValue(value, PaymentMethodCardInPaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(
            ObjectMappers.JSON_MAPPER.convertValue(
                value, PaymentMethodNetBankingInPaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(
            ObjectMappers.JSON_MAPPER.convertValue(value, PaymentMethodUpiInPaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(
            ObjectMappers.JSON_MAPPER.convertValue(value, PaymentMethodAppInPaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(
            ObjectMappers.JSON_MAPPER.convertValue(
                value, PaymentMethodCardlessEmiInPaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(
            ObjectMappers.JSON_MAPPER.convertValue(
                value, PaymentMethodPaylaterInPaymentsEntity.class));
      } catch (IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
