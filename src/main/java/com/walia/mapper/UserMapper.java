package com.walia.mapper;

import com.walia.dto.UserDto;
import com.walia.entity.User;


public class UserMapper {

    public static User toUserEntity(UserDto dto) {
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setAddress(dto.getAddress());
        return user;
    }
}
