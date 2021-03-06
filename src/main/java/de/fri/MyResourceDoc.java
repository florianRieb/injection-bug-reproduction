package de.fri;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.headers.Header;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

@Path("/xxx")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public interface MyResourceDoc {

  @Path("/{id}")
  @PUT
  @APIResponses({
      @APIResponse(
          responseCode = "201",
          description = "",
          headers = @Header(name = "Location", description = ""),
          content = @Content(
              schema = @Schema(
                  type = SchemaType.OBJECT,
                  implementation = TO.class))),
      @APIResponse(responseCode = "204", description = ""),
      @APIResponse(
          responseCode = "400",
          description = "",
          content = @Content(
              schema = @Schema(
                  type = SchemaType.OBJECT,
                  implementation = ErrorTO.class))) })
  public Response createOrUpdate(@PathParam("id")
  final String id,
      @NotNull
      @Valid
      final TO to);

  
}
