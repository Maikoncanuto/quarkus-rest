package com.github.maikoncanuto.core.resources;

import lombok.Data;

import java.io.Serializable;

@Data
public class MessageResult implements Serializable {

    private Integer statusCode;
    private Object result;

    public MessageResult(final Integer statusCode, final Object result) {
        this.statusCode = statusCode;
        this.result = result;
    }
}
