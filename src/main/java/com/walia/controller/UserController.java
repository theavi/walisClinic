package com.walia.controller;

import com.walia.dto.UserDto;
import com.walia.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public ResponseEntity<UserDto> create() {
        System.out.println("Create user initiated:");
        return ResponseEntity.ok(new UserDto());
    }
}
