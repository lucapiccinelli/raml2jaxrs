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
    "attributes",
    "relationships"
})
public class GameImpl implements Game {
  @JsonProperty("type")
  private String type;

  @JsonProperty("id")
  private Number id;

  @JsonProperty("attributes")
  private Game.AttributesType attributes;

  @JsonProperty("relationships")
  private Game.RelationshipsType relationships;

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
  public Game.AttributesType getAttributes() {
    return this.attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(Game.AttributesType attributes) {
    this.attributes = attributes;
  }

  @JsonProperty("relationships")
  public Game.RelationshipsType getRelationships() {
    return this.relationships;
  }

  @JsonProperty("relationships")
  public void setRelationships(Game.RelationshipsType relationships) {
    this.relationships = relationships;
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
  @JsonPropertyOrder("data")
  public static class RelationshipsTypeImpl implements Game.RelationshipsType {
    @JsonProperty("data")
    private List<FrameCreated> data;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new ExcludingMap();

    @JsonProperty("data")
    public List<FrameCreated> getData() {
      return this.data;
    }

    @JsonProperty("data")
    public void setData(List<FrameCreated> data) {
      this.data = data;
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

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonPropertyOrder("total")
  public static class AttributesTypeImpl implements Game.AttributesType {
    @JsonProperty("total")
    private int total;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new ExcludingMap();

    @JsonProperty("total")
    public int getTotal() {
      return this.total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
      this.total = total;
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
