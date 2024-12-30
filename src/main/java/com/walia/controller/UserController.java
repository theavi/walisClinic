package com.walia.controller;

import com.walia.dto.UserDto;
import com.walia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> create(@RequestBody UserDto req) {
        System.out.println("Create user initiated: " + req.getFirstName());
        userService.create(req);
        return new ResponseEntity<UserDto>(req, HttpStatus.CREATED);
    }

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/create")
    public String create(ModelMap model) {
        model.addAttribute("path", "user/createUser");
        model.addAttribute("fragmentName", "createUser");
        return "home";
    }
}
