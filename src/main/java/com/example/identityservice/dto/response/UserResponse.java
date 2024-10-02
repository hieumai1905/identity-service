package com.example.identityservice.dto.response;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class UserResponse {
    String id;

    String username;

    String firstName;

    String lastName;

    LocalDate dob;

    Set<RoleResponse> roles;
}
