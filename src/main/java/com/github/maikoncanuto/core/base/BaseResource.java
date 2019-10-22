package com.github.maikoncanuto.core.base;

import com.github.maikoncanuto.core.interceptors.annotations.Log;
import com.github.maikoncanuto.core.resources.MessageResult;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.status;

@Log
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface BaseResource {

    default Response toResponse(final Response.Status responseStatus, final Object object) {
        return status(responseStatus.getStatusCode())
                .entity(new MessageResult(responseStatus.getStatusCode(), object))
                .build();
    }

}
