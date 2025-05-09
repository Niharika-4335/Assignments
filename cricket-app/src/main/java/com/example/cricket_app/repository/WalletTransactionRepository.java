package com.example.cricket_app.repository;

import com.example.cricket_app.entity.Wallet;
import com.example.cricket_app.entity.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WalletTransactionRepository extends JpaRepository<WalletTransaction, Long> {


    List<WalletTransaction> findByWallet(Wallet wallet);

}
