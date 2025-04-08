package com.example.cricket_app.dto;

import com.example.cricket_app.entity.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class UserRequestDto {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    private String passwordHash;

    @NotBlank(message = "Full name is required")
    private String fullName;

    private Users.UserRole role = Users.UserRole.PLAYER;

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPasswordHash() {
//        return passwordHash;
//    }
//
//    public void setPasswordHash(String passwordHash) {
//        this.passwordHash = passwordHash;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public Users.UserRole getRole() {
//        return role;
//    }
//
//    public void setRole(Users.UserRole role) {
//        this.role = role;
//    }
}
