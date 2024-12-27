package com.walia.controller;

import com.walia.dto.UserDto;
import com.walia.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/create", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> create(@RequestBody UserDto req) {
        System.out.println("Create user initiated: "+req.getFirstName());
        userService.create(req);
        return  new ResponseEntity<UserDto>(req,HttpStatus.CREATED);
    }
}
