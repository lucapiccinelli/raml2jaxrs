package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "attributes"
})
public class FrameImpl implements Frame {
  @JsonProperty("type")
  private String type;

  @JsonProperty("id")
  private Number id;

  @JsonProperty("attributes")
  private Frame.AttributesType attributes;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("type")
  public String getType() {
    return this.type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("id")
  public Number getId() {
    return this.id;
  }

  @JsonProperty("id")
  public void setId(Number id) {
    this.id = id;
  }

  @JsonProperty("attributes")
  public Frame.AttributesType getAttributes() {
    return this.attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Frame.AttributesType attributes) {
    this.attributes = attributes;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperties(String key, Object value) {
    this.additionalProperties.put(key, value);
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonPropertyOrder({
      "value",
      "rolls",
      "type"
  })
  public static class AttributesTypeImpl implements Frame.AttributesType {
    @JsonProperty("value")
    private int value;

    @JsonProperty("rolls")
    private List<Roll> rolls;

    @JsonProperty("type")
    private String type;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new ExcludingMap();

    @JsonProperty("value")
    public int getValue() {
      return this.value;
    }

    @JsonProperty("value")
    public void setValue(int value) {
      this.value = value;
    }

    @JsonProperty("rolls")
    public List<Roll> getRolls() {
      return this.rolls;
    }

    @JsonProperty("rolls")
    public void setRolls(List<Roll> rolls) {
      this.rolls = rolls;
    }

    @JsonProperty("type")
    public String getType() {
      return this.type;
    }

    @JsonProperty("type")
    public void setType(String type) {
      this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
      return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String key, Object value) {
      this.additionalProperties.put(key, value);
    }
  }
}
