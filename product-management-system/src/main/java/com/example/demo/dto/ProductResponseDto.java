package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductResponseDto {

    private Long id;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;
    private LocalDateTime createdAt;
}
