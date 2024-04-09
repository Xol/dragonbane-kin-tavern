package de.andrerother.api;

import de.andrerother.core.kin.Human;
import de.andrerother.core.kin.Kin;
import de.andrerother.core.PlayerCharacter;
import de.andrerother.service.CharakterService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    private CharakterService charakterService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/pc")
    public String helloChar() {
        return charakterService.createDummyCharakter().toString();
    }
}
