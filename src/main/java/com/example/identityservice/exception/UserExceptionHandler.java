package com.example.identityservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserExceptionHandler extends RuntimeException {
    public UserExceptionHandler(String message) {
        super(message);
    }
}
