package com.example.megaflats.controllers;

import com.example.megaflats.service.UsersService;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/saveuser")
    public void saveUser(@RequestParam Long phone){
        usersService.saveUser(phone);
    }
}
