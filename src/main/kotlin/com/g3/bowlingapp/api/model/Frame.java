package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = FrameImpl.class
)
public interface Frame extends FrameCreated {
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
      as = FrameImpl.AttributesTypeImpl.class
  )
  interface AttributesType {
    @JsonAnyGetter
    Map<String, Object> getAdditionalProperties();

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value);

    @JsonProperty("value")
    int getValue();

    @JsonProperty("value")
    void setValue(int value);

    @JsonProperty("rolls")
    List<Roll> getRolls();

    @JsonProperty("rolls")
    void setRolls(List<Roll> rolls);

    @JsonProperty("type")
    String getType();

    @JsonProperty("type")
    void setType(String type);
  }
}
