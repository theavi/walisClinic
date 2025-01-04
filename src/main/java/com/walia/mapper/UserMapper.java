package com.walia.mapper;

import com.walia.dto.UserDto;
import com.walia.entity.User;


public class UserMapper {

    public static User toUserEntity(UserDto dto) {
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setAddress(dto.getAddress());
        user.setPassword(dto.getPassword());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setContact(dto.getContact());
        return user;
    }
}
