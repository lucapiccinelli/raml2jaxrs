package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "attributes"
})
public class RollPostApplicationVndApiJsonImpl implements RollPostApplicationVndApiJson {
  @JsonProperty("type")
  private String type;

  @JsonProperty("id")
  private Number id;

  @JsonProperty("attributes")
  private RollPostApplicationVndApiJson.AttributesType attributes;

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
  public RollPostApplicationVndApiJson.AttributesType getAttributes() {
    return this.attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(RollPostApplicationVndApiJson.AttributesType attributes) {
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
  @JsonPropertyOrder("rollValue")
  public static class AttributesTypeImpl implements RollPostApplicationVndApiJson.AttributesType {
    @JsonProperty("rollValue")
    private int rollValue;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new ExcludingMap();

    @JsonProperty("rollValue")
    public int getRollValue() {
      return this.rollValue;
    }

    @JsonProperty("rollValue")
    public void setRollValue(int rollValue) {
      this.rollValue = rollValue;
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
