package com.shubhi.maheshwari.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;

@JsonDeserialize(builder = TerminalDetails.Builder.class)
public final class TerminalDetails {
  private final String terminalPhoneNo;

  private final String terminalId;

  private final String terminalType;

  private int _cachedHashCode;

  TerminalDetails(String terminalPhoneNo, String terminalId, String terminalType) {
    this.terminalPhoneNo = terminalPhoneNo;
    this.terminalId = terminalId;
    this.terminalType = terminalType;
  }

  /**
   * @return Phone no assigned to the terminal &lt;span style=&quot;white-space: nowrap&quot;&gt;
   *     <code>&lt;= 10 characters</code>&lt;/span&gt;
   */
  @JsonProperty("terminal_phone_no")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }

  /**
   * @return The internal id that you use to map the terminal in your internal system &lt;span
   *     style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 100 characters</code>&lt;/span&gt;
   */
  @JsonProperty("terminal_id")
  public String getTerminalId() {
    return terminalId;
  }

  /**
   * @return To identify the type of terminal product in use, in this case it is SPOS &lt;span
   *     style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 10 characters</code>&lt;/span&gt;
   */
  @JsonProperty("terminal_type")
  public String getTerminalType() {
    return terminalType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TerminalDetails && equalTo((TerminalDetails) other);
  }

  private boolean equalTo(TerminalDetails other) {
    return terminalPhoneNo.equals(other.terminalPhoneNo)
        && terminalId.equals(other.terminalId)
        && terminalType.equals(other.terminalType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.terminalPhoneNo, this.terminalId, this.terminalType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TerminalDetails{"
        + "terminalPhoneNo: "
        + terminalPhoneNo
        + ", terminalId: "
        + terminalId
        + ", terminalType: "
        + terminalType
        + "}";
  }

  public static TerminalPhoneNoStage builder() {
    return new Builder();
  }

  public interface TerminalPhoneNoStage {
    TerminalIdStage terminalPhoneNo(String terminalPhoneNo);

    Builder from(TerminalDetails other);
  }

  public interface TerminalIdStage {
    TerminalTypeStage terminalId(String terminalId);
  }

  public interface TerminalTypeStage {
    _FinalStage terminalType(String terminalType);
  }

  public interface _FinalStage {
    TerminalDetails build();
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder
      implements TerminalPhoneNoStage, TerminalIdStage, TerminalTypeStage, _FinalStage {
    private String terminalPhoneNo;

    private String terminalId;

    private String terminalType;

    private Builder() {}

    @Override
    public Builder from(TerminalDetails other) {
      terminalPhoneNo(other.getTerminalPhoneNo());
      terminalId(other.getTerminalId());
      terminalType(other.getTerminalType());
      return this;
    }

    /**
     * Phone no assigned to the terminal &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>
     * &lt;= 10 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("terminal_phone_no")
    public TerminalIdStage terminalPhoneNo(String terminalPhoneNo) {
      this.terminalPhoneNo = terminalPhoneNo;
      return this;
    }

    /**
     * The internal id that you use to map the terminal in your internal system &lt;span
     * style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 100 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("terminal_id")
    public TerminalTypeStage terminalId(String terminalId) {
      this.terminalId = terminalId;
      return this;
    }

    /**
     * To identify the type of terminal product in use, in this case it is SPOS &lt;span
     * style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 10 characters</code>&lt;/span&gt;
     *
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("terminal_type")
    public _FinalStage terminalType(String terminalType) {
      this.terminalType = terminalType;
      return this;
    }

    @Override
    public TerminalDetails build() {
      return new TerminalDetails(terminalPhoneNo, terminalId, terminalType);
    }
  }
}
