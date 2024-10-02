package com.example.identityservice.mapper;

import com.example.identityservice.dto.request.UserCreationRequest;
import com.example.identityservice.dto.request.UserUpdateRequest;
import com.example.identityservice.dto.response.UserResponse;
import com.example.identityservice.entity.Role;
import com.example.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void userUpdateRequestToUser(UserUpdateRequest request, @MappingTarget User user);
}
