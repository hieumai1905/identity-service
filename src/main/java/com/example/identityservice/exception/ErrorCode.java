package com.example.identityservice.exception;

import lombok.*;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNCATEGORIZED(9999, "Uncategorized"),
    USER_EXITED(1001, "User already existed"),
    INVALID_KEY(1002, "Invalid key"),
    USERNAME_INVALID(2001, "Username must be at least 3 characters long"),
    PASSWORD_INVALID(2002, "Password must be at least 8 characters long"),
    USER_DONT_EXIST(3001, "User doesn't exist"),
    UNAUTHENTICATED(3002, "User is not authenticated"),
    ;

    private int code;
    private String message;
}
