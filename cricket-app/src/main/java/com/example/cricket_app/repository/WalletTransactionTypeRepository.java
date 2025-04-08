package com.example.cricket_app.repository;

import com.example.cricket_app.entity.WalletTransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTransactionTypeRepository extends JpaRepository<WalletTransactionType,Long> {
}
