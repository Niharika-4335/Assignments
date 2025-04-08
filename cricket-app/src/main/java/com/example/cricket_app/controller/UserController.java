package com.example.cricket_app.controller;

import com.example.cricket_app.dto.UserRequestDto;
import com.example.cricket_app.dto.UserResponseDto;
import com.example.cricket_app.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    @Transactional
    public UserResponseDto CreateUser( @Valid @RequestBody UserRequestDto userRequestDto){
        return userService.saveUser(userRequestDto);
    }
}
