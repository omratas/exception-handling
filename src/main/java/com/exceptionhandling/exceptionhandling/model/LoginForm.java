package com.exceptionhandling.exceptionhandling.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class LoginForm {

    @NotEmpty(message = "{email.not.empty}")
    @Email
    private String email;
    @NotNull(message = "{password.not.empty}")
    private String password;
}
