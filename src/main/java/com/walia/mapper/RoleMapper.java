package com.walia.mapper;

import com.walia.dto.RoleDto;
import com.walia.entity.Role;

public class RoleMapper {

    public static Role toEntity(RoleDto dto) {
        Role role = new Role();
        role.setRoleName(dto.getRoleName());
        return role;
    }
}
