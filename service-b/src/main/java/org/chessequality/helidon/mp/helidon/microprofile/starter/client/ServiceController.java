package org.chessequality.helidon.mp.helidon.microprofile.starter.client;

import javax.annotation.security.PermitAll;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/client/service")
public class ServiceController {

    @GET
    @Path("/{parameter}")
    
    @PermitAll
    
    public String doSomething(@PathParam("parameter") String parameter) {
        return String.format("Processed parameter value '%s'", parameter);
    }
}
