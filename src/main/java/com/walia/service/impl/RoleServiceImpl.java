package com.walia.service.impl;

import com.walia.dao.RoleRepository;
import com.walia.dto.RoleDto;
import com.walia.entity.Role;
import com.walia.entity.User;
import com.walia.mapper.RoleMapper;
import com.walia.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public String create(RoleDto dto) {
        System.out.println("I am in service");
        Role role= RoleMapper.toEntity(dto);
        repository.save(role);
        return "Success";
    }

}
