package com.walia.controller;

import com.walia.dto.RoleDto;
import com.walia.service.RoleService;
import com.walia.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping(value = "/create",consumes = "application/json")
    @ResponseBody
    public String create(@RequestBody RoleDto dto){
        System.out.println("Role Name is: "+ dto.getRoleName());
        roleService.create(dto);
        return "resource 1";
    }

}
