package com.exceptionhandling.exceptionhandling.exceptions;

import lombok.Getter;

@Getter
public class RestException extends ExpectedError {
    private static final long serialVersionUID = 7774150744324470713L;

    private String message;
    private Object[] args;

    public RestException(String code, String message) {
        super(code, message);
    }

    public RestException(String code, String message, Object[] args) {
        super(code, message);
        this.args = args;
    }
}