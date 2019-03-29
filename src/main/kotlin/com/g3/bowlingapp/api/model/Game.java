package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;

@JsonDeserialize(
    as = GameImpl.class
)
public interface Game extends GameCreated {
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

  @JsonProperty("relationships")
  RelationshipsType getRelationships();

  @JsonProperty("relationships")
  void setRelationships(RelationshipsType relationships);

  @JsonDeserialize(
      as = GameImpl.RelationshipsTypeImpl.class
  )
  interface RelationshipsType {
    @JsonAnyGetter
    Map<String, Object> getAdditionalProperties();

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value);

    @JsonProperty("data")
    List<FrameCreated> getData();

    @JsonProperty("data")
    void setData(List<FrameCreated> data);
  }

  @JsonDeserialize(
      as = GameImpl.AttributesTypeImpl.class
  )
  interface AttributesType {
    @JsonAnyGetter
    Map<String, Object> getAdditionalProperties();

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value);

    @JsonProperty("total")
    int getTotal();

    @JsonProperty("total")
    void setTotal(int total);
  }
}
