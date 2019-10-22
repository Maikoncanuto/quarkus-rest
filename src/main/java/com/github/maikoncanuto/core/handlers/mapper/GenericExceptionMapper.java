package com.github.maikoncanuto.core.handlers.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper {

    @Override
    public Response toResponse(Throwable exception) {
        return toError(Response.Status.INTERNAL_SERVER_ERROR, exception);
    }
}
