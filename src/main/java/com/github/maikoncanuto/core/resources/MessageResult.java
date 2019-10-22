package com.github.maikoncanuto.core.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResult implements Serializable {

    private Integer statusCode;
    private Object object;

}
