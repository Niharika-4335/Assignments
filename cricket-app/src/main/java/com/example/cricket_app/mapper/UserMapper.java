package com.example.cricket_app.mapper;

import com.example.cricket_app.dto.UserRequestDto;
import com.example.cricket_app.dto.UserResponseDto;
import com.example.cricket_app.entity.Users;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
    Users toEntity(UserRequestDto userRequestDto);

    //dto to entity conversion to save into database.
    UserResponseDto toResponseDto(Users users);
    //entity to dto to give to client.
}
