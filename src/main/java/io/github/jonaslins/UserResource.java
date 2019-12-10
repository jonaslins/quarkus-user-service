package io.github.jonaslins;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @POST
    public User save(User user) {
        return userService.save(user);
    }

    @GET
    @Path("/{id}")
    public User getById(@PathParam(value = "id") String id){
        return userService.getById(id);
    }

    @DELETE
    @Path("/{id}")
    public void deleteById(@PathParam(value = "id") String id){
        userService.deleteById(id);
    }
}