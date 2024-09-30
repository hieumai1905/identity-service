package com.example.identityservice.controller;

import com.example.identityservice.dto.ApiResponse;
import com.example.identityservice.dto.request.UserCreationRequest;
import com.example.identityservice.dto.request.UserUpdateRequest;
import com.example.identityservice.entity.User;
import com.example.identityservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@Valid @RequestBody UserCreationRequest user) {
        ApiResponse<User> response = new ApiResponse<>();

        response.setResult(userService.createUser(user));
        return response;
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("{id}")
    User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    @PutMapping("{id}")
    User updateUser(@PathVariable("id") String id, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(id, request);
    }

    @DeleteMapping("{id}")
    String deleteUser(@PathVariable("id") String id) {
        userService.deleteUser(id);
        return "User has been deleted";
    }
}
