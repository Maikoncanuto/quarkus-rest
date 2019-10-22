package com.github.maikoncanuto.core.base;

import com.github.maikoncanuto.core.interceptors.annotations.Log;
import com.github.maikoncanuto.core.resources.MessageResult;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import static javax.ws.rs.core.Response.status;

@Log
public interface BaseResource {

    default Response toResponse(final Status responseStatus, final Object object) {
        return status(responseStatus.getStatusCode())
                .entity(new MessageResult(responseStatus.getStatusCode(), object))
                .build();
    }

}
