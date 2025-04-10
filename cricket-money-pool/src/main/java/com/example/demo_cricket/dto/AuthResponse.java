package com.example.demo_cricket.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String role;
}
