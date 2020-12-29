package com.exceptionhandling.exceptionhandling.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum ValidationError implements ErrorMessage {

    METHOD_ARGUMENT_NOT_VALID(1111, "method argument not valid"),
    CONSTRAINT_VIOLATION(2222, "constraint violation error");

    private int code;
    private String description;

    ValidationError(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static ValidationError decode(final int code) {
        return Stream
                .of(ValidationError.values()).filter(targetEnum -> targetEnum.code == code).findFirst()
                .orElse(null);
    }

    @Override
    @JsonValue
    public int getCode() {
        return code;
    }

    @Override
    @JsonValue
    public String getDescription() {
        return description;
    }
}
