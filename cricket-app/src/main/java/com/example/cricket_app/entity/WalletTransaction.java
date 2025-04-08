package com.example.cricket_app.entity;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "wallet_transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "transaction_type", referencedColumnName = "name", nullable = false)
    private WalletTransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

    @Column
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
