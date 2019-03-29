package com.g3.bowlingapp.api;

import com.g3.bowlingapp.api.model.RollPost201ApplicationVndApiJson;
import com.g3.bowlingapp.api.model.RollPostApplicationVndApiJson;
import com.g3.bowlingapp.api.support.ResponseDelegate;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/roll")
public interface Roll {
  @POST
  @Produces("application/vnd.api+json")
  @Consumes("application/vnd.api+json")
  PostRollResponse postRoll(RollPostApplicationVndApiJson entity);

  class PostRollResponse extends ResponseDelegate {
    private PostRollResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostRollResponse(Response response) {
      super(response);
    }

    public static PostRollResponse respond201WithApplicationVndApiJson(
        RollPost201ApplicationVndApiJson entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/vnd.api+json");
      responseBuilder.entity(entity);
      return new PostRollResponse(responseBuilder.build(), entity);
    }
  }
}
