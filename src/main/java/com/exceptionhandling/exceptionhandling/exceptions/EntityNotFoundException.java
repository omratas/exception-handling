package com.exceptionhandling.exceptionhandling.exceptions;

import lombok.Getter;

@Getter
public class EntityNotFoundException extends ExpectedError {

    private static final long serialVersionUID = 5467273153552791064L;

    private Object[] args;


    public EntityNotFoundException(String code, String message) {
        super(code, message);
    }

    public EntityNotFoundException(String code, String message, Object[] args) {
        super(code, message);
        this.args = args;
    }
}
