package com.example.identityservice.exception;

public enum ErrorCode {
    UNCATEGORIZED(9999, "Uncategorized"),
    USER_EXITED(1001, "User already existed"),
    INVALID_KEY(1002, "Invalid key"),
    USERNAME_INVALID(2001, "Username must be at least 3 characters long"),
    PASSWORD_INVALID(2002, "Password must be at least 8 characters long"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
