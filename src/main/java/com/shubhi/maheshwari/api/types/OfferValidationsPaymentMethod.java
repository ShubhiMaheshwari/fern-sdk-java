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

@JsonDeserialize(using = OfferValidationsPaymentMethod.Deserializer.class)
public final class OfferValidationsPaymentMethod {
  private final Object value;

  private final int type;

  private OfferValidationsPaymentMethod(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if (this.type == 0) {
      return visitor.visit((OfferAll) this.value);
    } else if (this.type == 1) {
      return visitor.visit((OfferCard) this.value);
    } else if (this.type == 2) {
      return visitor.visit((OfferNb) this.value);
    } else if (this.type == 3) {
      return visitor.visit((OfferWallet) this.value);
    } else if (this.type == 4) {
      return visitor.visit((OfferUpi) this.value);
    } else if (this.type == 5) {
      return visitor.visit((OfferPaylater) this.value);
    } else if (this.type == 6) {
      return visitor.visit((OfferEmi) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OfferValidationsPaymentMethod
        && equalTo((OfferValidationsPaymentMethod) other);
  }

  private boolean equalTo(OfferValidationsPaymentMethod other) {
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

  public static OfferValidationsPaymentMethod of(OfferAll value) {
    return new OfferValidationsPaymentMethod(value, 0);
  }

  public static OfferValidationsPaymentMethod of(OfferCard value) {
    return new OfferValidationsPaymentMethod(value, 1);
  }

  public static OfferValidationsPaymentMethod of(OfferNb value) {
    return new OfferValidationsPaymentMethod(value, 2);
  }

  public static OfferValidationsPaymentMethod of(OfferWallet value) {
    return new OfferValidationsPaymentMethod(value, 3);
  }

  public static OfferValidationsPaymentMethod of(OfferUpi value) {
    return new OfferValidationsPaymentMethod(value, 4);
  }

  public static OfferValidationsPaymentMethod of(OfferPaylater value) {
    return new OfferValidationsPaymentMethod(value, 5);
  }

  public static OfferValidationsPaymentMethod of(OfferEmi value) {
    return new OfferValidationsPaymentMethod(value, 6);
  }

  public interface Visitor<T> {
    T visit(OfferAll value);

    T visit(OfferCard value);

    T visit(OfferNb value);

    T visit(OfferWallet value);

    T visit(OfferUpi value);

    T visit(OfferPaylater value);

    T visit(OfferEmi value);
  }

  static final class Deserializer extends StdDeserializer<OfferValidationsPaymentMethod> {
    Deserializer() {
      super(OfferValidationsPaymentMethod.class);
    }

    @Override
    public OfferValidationsPaymentMethod deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferAll.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferCard.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferNb.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferWallet.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferUpi.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferPaylater.class));
      } catch (IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, OfferEmi.class));
      } catch (IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
