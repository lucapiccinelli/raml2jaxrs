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
    "data",
    "included"
})
public class GameGet200ApplicationVndApiJsonImpl implements GameGet200ApplicationVndApiJson {
  @JsonProperty("data")
  private Game data;

  @JsonProperty("included")
  private List<Frame> included;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new ExcludingMap();

  @JsonProperty("data")
  public Game getData() {
    return this.data;
  }

  @JsonProperty("data")
  public void setData(Game data) {
    this.data = data;
  }

  @JsonProperty("included")
  public List<Frame> getIncluded() {
    return this.included;
  }

  @JsonProperty("included")
  public void setIncluded(List<Frame> included) {
    this.included = included;
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
