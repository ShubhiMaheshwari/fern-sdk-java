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

@JsonDeserialize(using = OrderPayRequestPaymentMethod.Deserializer.class)
public final class OrderPayRequestPaymentMethod {
  private final Object value;

  private final int type;

  private OrderPayRequestPaymentMethod(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if (this.type == 0) {
      return visitor.visit((CardPaymentMethod) this.value);
    } else if (this.type == 1) {
      return visitor.visit((UpiPaymentMethod) this.value);
    } else if (this.type == 2) {
      return visitor.visit((NetBankingPaymentMethod) this.value);
    } else if (this.type == 3) {
      return visitor.visit((AppPaymentMethod) this.value);
    } else if (this.type == 4) {
      return visitor.visit((CardEmiPaymentMethod) this.value);
    } else if (this.type == 5) {
      return visitor.visit((CardlessEmiPaymentMethod) this.value);
    } else if (this.type == 6) {
      return visitor.visit((PaylaterPaymentMethod) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OrderPayRequestPaymentMethod
        && equalTo((OrderPayRequestPaymentMethod) other);
  }

  private boolean equalTo(OrderPayRequestPaymentMethod other) {
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

  public static OrderPayRequestPaymentMethod of(CardPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 0);
  }

  public static OrderPayRequestPaymentMethod of(UpiPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 1);
  }

  public static OrderPayRequestPaymentMethod of(NetBankingPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 2);
  }

  public static OrderPayRequestPaymentMethod of(AppPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 3);
  }

  public static OrderPayRequestPaymentMethod of(CardEmiPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 4);
  }

  public static OrderPayRequestPaymentMethod of(CardlessEmiPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 5);
  }

  public static OrderPayRequestPaymentMethod of(PaylaterPaymentMethod value) {
    return new OrderPayRequestPaymentMethod(value, 6);
  }

  public interface Visitor<T> {
    T visit(CardPaymentMethod value);

    T visit(UpiPaymentMethod value);

    T visit(NetBankingPaymentMethod value);

    T visit(AppPaymentMethod value);

    T visit(CardEmiPaymentMethod value);

    T visit(CardlessEmiPaymentMethod value);

    T visit(PaylaterPaymentMethod value);
  }

  static final class Deserializer extends StdDeserializer<OrderPayRequestPaymentMethod> {
    Deserializer() {
      super(OrderPayRequestPaymentMethod.class);
    }

    @Override
    public OrderPayRequestPaymentMethod deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, CardPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, UpiPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NetBankingPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, AppPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, CardEmiPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, CardlessEmiPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, PaylaterPaymentMethod.class));
      } catch (IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
