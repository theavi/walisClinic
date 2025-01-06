package com.walia.controller;

import com.walia.dto.RoleDto;
import com.walia.service.RoleService;
import com.walia.service.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/create")
    public String create(Model model){
        System.out.println("Role Name is: ");
        model.addAttribute("path","/role/createRole");
        model.addAttribute("fragmentName","createRole");
        return  "home";
    }

}
