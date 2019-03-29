package com.g3.bowlingapp.api;

import com.g3.bowlingapp.api.model.GameGet200ApplicationVndApiJson;
import com.g3.bowlingapp.api.model.GamePost201ApplicationVndApiJson;
import com.g3.bowlingapp.api.support.ResponseDelegate;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/game")
public interface Game {
  @POST
  @Produces("application/vnd.api+json")
  PostGameResponse postGame();

  @GET
  @Produces("application/vnd.api+json")
  GetGameResponse getGame(@QueryParam("include") String include);

  class PostGameResponse extends ResponseDelegate {
    private PostGameResponse(Response response, Object entity) {
      super(response, entity);
    }

    private PostGameResponse(Response response) {
      super(response);
    }

    public static PostGameResponse respond201WithApplicationVndApiJson(
        GamePost201ApplicationVndApiJson entity) {
      Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/vnd.api+json");
      responseBuilder.entity(entity);
      return new PostGameResponse(responseBuilder.build(), entity);
    }
  }

  class GetGameResponse extends ResponseDelegate {
    private GetGameResponse(Response response, Object entity) {
      super(response, entity);
    }

    private GetGameResponse(Response response) {
      super(response);
    }

    public static GetGameResponse respond200WithApplicationVndApiJson(
        GameGet200ApplicationVndApiJson entity) {
      Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/vnd.api+json");
      responseBuilder.entity(entity);
      return new GetGameResponse(responseBuilder.build(), entity);
    }

    public static GetGameResponse respond204() {
      Response.ResponseBuilder responseBuilder = Response.status(204);
      return new GetGameResponse(responseBuilder.build());
    }
  }
}
