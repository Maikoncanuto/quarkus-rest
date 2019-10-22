package com.github.maikoncanuto.core.handlers.mapper;

import com.github.maikoncanuto.core.handlers.exceptions.MessageError;

import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.status;

public interface ExceptionMapper<E extends Throwable> {

    Response toResponse(E exception);

    default Response toError(final Response.Status responseStatus, final E throwable) {
        return status(responseStatus.getStatusCode())
                .entity(new MessageError(responseStatus.getStatusCode(), throwable.getMessage()))
                .build();
    }

}
