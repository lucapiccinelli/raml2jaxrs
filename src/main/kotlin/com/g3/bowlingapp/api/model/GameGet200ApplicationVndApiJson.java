package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = GameGet200ApplicationVndApiJsonImpl.class
)
public interface GameGet200ApplicationVndApiJson {
  @JsonAnyGetter
  Map<String, Object> getAdditionalProperties();

  @JsonAnySetter
  void setAdditionalProperties(String key, Object value);

  @JsonProperty("data")
  Game getData();

  @JsonProperty("data")
  void setData(Game data);

  @JsonProperty("included")
  List<Frame> getIncluded();

  @JsonProperty("included")
  void setIncluded(List<Frame> included);
}
