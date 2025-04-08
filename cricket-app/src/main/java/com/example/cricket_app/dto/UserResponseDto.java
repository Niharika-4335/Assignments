package com.example.cricket_app.dto;

import com.example.cricket_app.entity.Users;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String email;
    private String fullName;
    private Users.UserRole role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
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
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }
}
