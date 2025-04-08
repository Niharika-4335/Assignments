package com.example.cricket_app.service;

import com.example.cricket_app.dto.UserRequestDto;
import com.example.cricket_app.dto.UserResponseDto;

public interface UserService {
    public UserResponseDto saveUser(UserRequestDto userRequestDto);
}
