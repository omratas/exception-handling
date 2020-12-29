package com.exceptionhandling.exceptionhandling.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RestException extends RuntimeException {
    private static final long serialVersionUID = 7774150744324470713L;

    private String message;
    private Object[] args;
}