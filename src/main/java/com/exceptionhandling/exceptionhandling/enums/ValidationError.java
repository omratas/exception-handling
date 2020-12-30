package com.exceptionhandling.exceptionhandling.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum ValidationError implements ErrorMessage {

    METHOD_ARGUMENT_NOT_VALID("1111", "method argument not valid"),
    CONSTRAINT_VIOLATION("2222", "constraint violation error");

    private String code;
    private String description;

    ValidationError(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonCreator
    public static ValidationError decode(final String code) {
        return Stream
                .of(ValidationError.values())
                .filter(targetEnum -> targetEnum.code.equals(code)).findFirst().orElse(null);
    }

    @Override
    @JsonValue
    public String getCode() {
        return code;
    }

    @Override
    @JsonValue
    public String getDescription() {
        return description;
    }
}
