package com.exceptionhandling.exceptionhandling.controller;

import com.exceptionhandling.exceptionhandling.exceptions.EntityNotFoundException;
import com.exceptionhandling.exceptionhandling.exceptions.RestException;
import com.exceptionhandling.exceptionhandling.model.LoginForm;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping
    public String getMessage() {
        throw new RestException("OTP-101", "default.message", new Object[]{"Omer", "Atas"});
    }

    @GetMapping(value = "/{id}")
    public String getEntity(@PathVariable(name = "id") Long id) {
        throw new EntityNotFoundException("OTP-102", "entity.not.found", new Object[]{String.valueOf(id)});
    }

    @GetMapping(value = "/name/{name}")
    public String getEntity(@PathVariable(name = "name") String name) {
        throw new EntityNotFoundException("OTP-203", "entity.not.found", new Object[]{name});
    }

    @PostMapping
    public String postMessage(@RequestParam(name = "name") String name, @Valid @RequestBody LoginForm loginForm) {
        return "Hi";
    }
}
