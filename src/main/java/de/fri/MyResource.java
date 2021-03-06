package de.fri;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;

public class MyResource implements MyResourceDoc {


  private MyService service; 
  
  @Inject
  MyResource(final MyService service){
    this.service = service;
    
  }
  @Override
  public Response createOrUpdate(String id, @NotNull
  @Valid
  TO to) {
    service.demo(to);
    return Response.ok("OK").build();
  }

}