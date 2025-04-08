package com.example.cricket_app.repository;

import com.example.cricket_app.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
