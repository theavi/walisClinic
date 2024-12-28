package com.walia.controller;

import com.walia.dto.UserDto;
import com.walia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/create")
    public String create() {
        return "default";
    }
}
