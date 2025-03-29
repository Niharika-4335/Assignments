package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product") // Maps to the 'product' table in the DB
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long id;

    @Column()
    private String name;

    @Column()
    private String category;

    @Column()
    private double price;

    @Column(name = "stock_quantity")
    private int stockQuantity;

    @Column(name = "created_at") // Auto-generated time
    private LocalDateTime createdAt = LocalDateTime.now();

}
