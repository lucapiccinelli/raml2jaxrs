package com.g3.bowlingapp.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GameGetInclude {
  @JsonProperty("frames")
  FRAMES("frames");

  private String name;

  GameGetInclude(String name) {
    this.name = name;
  }
}
