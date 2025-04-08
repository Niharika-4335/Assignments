package com.example.cricket_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "wallet_transaction_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletTransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private String description;

    // Predefined transaction types as constants
    public static final String BET_PLACED = "BET_PLACED";
    public static final String WIN_CREDIT = "WIN_CREDIT";
    public static final String ADMIN_CREDIT = "ADMIN_CREDIT";
}
