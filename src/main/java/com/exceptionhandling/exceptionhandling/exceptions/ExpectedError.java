package com.exceptionhandling.exceptionhandling.exceptions;

import lombok.Getter;

@Getter
public class ExpectedError extends RuntimeException {

    private final String code;

    public ExpectedError(String code, String message) {
        super(message);
        this.code = code;
    }
}
