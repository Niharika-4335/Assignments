package com.example.cricket_app.repository;

import com.example.cricket_app.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet,Long> {
}
