package com.walia.controller;

import com.walia.dto.UserDto;
import com.walia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public String create(Model model) {
        UserDto userObj = new UserDto();
        model.addAttribute("userObj", userObj);
        model.addAttribute("path", "user/createUser");
        model.addAttribute("fragmentName", "createUser");
        return "home";
    }

    @PostMapping(path = "/create")
    public String create(Model model, @ModelAttribute("userObj") UserDto dto) {
        System.out.println("Create user initiated: " + dto.getFirstName());
        userService.create(dto);
        return "home";
    }

    @GetMapping("/home")
    public String home() {

        return "home";
    }


    @GetMapping("/update")
    public String updateUser(ModelMap model) {
        model.addAttribute("path", "user/updateUser");
        model.addAttribute("fragmentName", "updateUser");
        return "home";
    }
}
