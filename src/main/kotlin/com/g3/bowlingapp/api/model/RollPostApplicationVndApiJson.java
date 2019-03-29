package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;

@JsonDeserialize(
    as = RollPostApplicationVndApiJsonImpl.class
)
public interface RollPostApplicationVndApiJson extends GameCreated {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("type")
  String getType();

  @JsonProperty("type")
  void setType(String type);

  @JsonProperty("id")
  Number getId();

  @JsonProperty("id")
  void setId(Number id);

  @JsonProperty("attributes")
  AttributesType getAttributes();

  @JsonProperty("attributes")
  void setAttributes(AttributesType attributes);

  @JsonDeserialize(
      as = RollPostApplicationVndApiJsonImpl.AttributesTypeImpl.class
  )
  interface AttributesType {
    @JsonAnyGetter
    Map<String, Object> getAdditionalProperties();

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value);

    @JsonProperty("rollValue")
    int getRollValue();

    @JsonProperty("rollValue")
    void setRollValue(int rollValue);
  }
}
