package com.github.maikoncanuto.core.handlers.mapper;

import com.github.maikoncanuto.core.handlers.exceptions.BusinessException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException> {

    @Override
    public Response toResponse(BusinessException exception) {
        return toError(Response.Status.BAD_REQUEST, exception);
    }

}
