package com.example.identityservice.dto.request;

import java.time.LocalDate;

public class UserCreationRequest {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        return dob;
    }
}
