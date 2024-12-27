package com.walia.service.impl;

import com.walia.dao.UserRepository;
import com.walia.dto.UserDto;
import com.walia.entity.User;
import com.walia.mapper.UserMapper;
import com.walia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDto create(UserDto dto) {
       User user= UserMapper.toUserEntity(dto);
        repository.save(user);
        return dto;
    }
}
