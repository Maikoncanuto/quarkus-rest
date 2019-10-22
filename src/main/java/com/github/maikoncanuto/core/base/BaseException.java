package com.github.maikoncanuto.core.base;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseException extends Throwable implements Serializable {

}
