package com.shubhi.maheshwari.api.resources.softpos.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = CreateTerminalRequest.Builder.class)
public final class CreateTerminalRequest {
  private final Optional<String> terminalId;

  private final String terminalName;

  private final String terminalPhoneNo;

  private int _cachedHashCode;

  CreateTerminalRequest(Optional<String> terminalId, String terminalName, String terminalPhoneNo) {
    this.terminalId = terminalId;
    this.terminalName = terminalName;
    this.terminalPhoneNo = terminalPhoneNo;
  }

  /**
   * @return merchant’s internal terminal id &lt;span style=&quot;white-space: nowrap&quot;&gt;
   *     <code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("terminal_id")
  public Optional<String> getTerminalId() {
    return terminalId;
  }

  /**
   * @return terminal name to be assigned by merchants &lt;span style=&quot;white-space:
   *     nowrap&quot;&gt;<code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("terminal_name")
  public String getTerminalName() {
    return terminalName;
  }

  /**
   * @return phone number assigned to the terminal &lt;span style=&quot;white-space:
   *     nowrap&quot;&gt;<code>&lt;= 10 characters</code>&lt;/span&gt;
   */
  @JsonProperty("terminal_phone_no")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateTerminalRequest && equalTo((CreateTerminalRequest) other);
  }

  private boolean equalTo(CreateTerminalRequest other) {
    return terminalId.equals(other.terminalId)
        && terminalName.equals(other.terminalName)
        && terminalPhoneNo.equals(other.terminalPhoneNo);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.terminalId, this.terminalName, this.terminalPhoneNo);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateTerminalRequest{"
        + "terminalId: "
        + terminalId
        + ", terminalName: "
        + terminalName
        + ", terminalPhoneNo: "
        + terminalPhoneNo
        + "}";
  }

  public static TerminalNameStage builder() {
    return new Builder();
  }

  public interface TerminalNameStage {
    TerminalPhoneNoStage terminalName(String terminalName);

    Builder from(CreateTerminalRequest other);
  }

  public interface TerminalPhoneNoStage {
    _FinalStage terminalPhoneNo(String terminalPhoneNo);
  }

  public interface _FinalStage {
    CreateTerminalRequest build();

    _FinalStage terminalId(Optional<String> terminalId);

    _FinalStage terminalId(String terminalId);
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements TerminalNameStage, TerminalPhoneNoStage, _FinalStage {
    private String terminalName;

    private String terminalPhoneNo;

    private Optional<String> terminalId = Optional.empty();

    private Builder() {}

    @Override
    public Builder from(CreateTerminalRequest other) {
      terminalId(other.getTerminalId());
      terminalName(other.getTerminalName());
      terminalPhoneNo(other.getTerminalPhoneNo());
      return this;
    }

    /**
     * terminal name to be assigned by merchants &lt;span style=&quot;white-space: nowrap&quot;&gt;
     * <code>&lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("terminal_name")
    public TerminalPhoneNoStage terminalName(String terminalName) {
      this.terminalName = terminalName;
      return this;
    }

    /**
     * phone number assigned to the terminal &lt;span style=&quot;white-space: nowrap&quot;&gt;
     * <code>&lt;= 10 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("terminal_phone_no")
    public _FinalStage terminalPhoneNo(String terminalPhoneNo) {
      this.terminalPhoneNo = terminalPhoneNo;
      return this;
    }

    /**
     * merchant’s internal terminal id &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage terminalId(String terminalId) {
      this.terminalId = Optional.of(terminalId);
      return this;
    }

    @Override
    @JsonSetter(value = "terminal_id", nulls = Nulls.SKIP)
    public _FinalStage terminalId(Optional<String> terminalId) {
      this.terminalId = terminalId;
      return this;
    }

    @Override
    public CreateTerminalRequest build() {
      return new CreateTerminalRequest(terminalId, terminalName, terminalPhoneNo);
    }
  }
}
