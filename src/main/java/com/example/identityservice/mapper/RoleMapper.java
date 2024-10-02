package com.example.identityservice.mapper;

import com.example.identityservice.dto.request.RoleRequest;
import com.example.identityservice.dto.response.RoleResponse;
import com.example.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
