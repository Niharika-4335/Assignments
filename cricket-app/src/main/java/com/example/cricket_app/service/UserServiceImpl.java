package com.example.cricket_app.service;

import com.example.cricket_app.dto.UserRequestDto;
import com.example.cricket_app.dto.UserResponseDto;
import com.example.cricket_app.entity.Users;
import com.example.cricket_app.mapper.UserMapper;
import com.example.cricket_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto saveUser(UserRequestDto userRequestDto) {
        Users user =userMapper.toEntity(userRequestDto);
        //we are taking dto and converting into entity using mapper.
        //before updating to database we will change to entity product
        System.out.println(user.getEmail());
        System.out.println(user.getPasswordHash());
        System.out.println(user.getFullName());
        userRepository.save(user);
        return userMapper.toResponseDto(user);
    }



}
