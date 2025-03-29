package com.example.demo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductRequestDto {
    @NotBlank(message = "Product name is required")
    private String name;
    @NotBlank(message = "category cant be empty")
    private String category;
    @Positive(message = "Price must be greater than zero")
    private double price;
    @Min(value = 0, message = "Stock quantity cannot be negative")
    @Max(value=99,message = "Stock quantity cannot exceed 99")
    private int stockQuantity;
}
