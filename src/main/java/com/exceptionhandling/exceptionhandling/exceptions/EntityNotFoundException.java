package com.exceptionhandling.exceptionhandling.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 5467273153552791064L;

    private String message;
    private Object[] args;


}
