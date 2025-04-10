package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private MyService myService;

    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return myService.saveUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){

        return myService.verify(user);
    }
}
