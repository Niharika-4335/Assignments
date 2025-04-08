package com.example.cricket_app.repository;

import com.example.cricket_app.entity.MatchPayoutStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchPayoutRepository extends JpaRepository<MatchPayoutStatus,Long> {
}
