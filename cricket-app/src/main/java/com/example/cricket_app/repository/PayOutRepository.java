package com.example.cricket_app.repository;

import com.example.cricket_app.entity.Payout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayOutRepository extends JpaRepository<Payout,Long> {
}
