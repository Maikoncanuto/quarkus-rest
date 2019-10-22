package com.github.maikoncanuto.resources;

import com.github.maikoncanuto.core.base.BaseResource;
import com.github.maikoncanuto.models.User;
import com.github.maikoncanuto.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.CREATED;
import static javax.ws.rs.core.Response.Status.OK;

@Path("/usuarios")
public class UserResource implements BaseResource {

    @Inject
    UserService userService;

    @GET
    public Response getAll() {
        return toResponse(OK, userService.getAll());
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") final Integer id) {
        return toResponse(OK, userService.findById(id));
    }

    @POST
    public Response save(final User user) {
        return toResponse(CREATED, userService.save(user));
    }
}
