package com.github.maikoncanuto.core.handlers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageError implements Serializable {

    private Integer code;
    private String message;

}
