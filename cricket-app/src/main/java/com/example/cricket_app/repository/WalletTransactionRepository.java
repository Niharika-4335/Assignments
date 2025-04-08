package com.example.cricket_app.repository;

import com.example.cricket_app.entity.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {
}
