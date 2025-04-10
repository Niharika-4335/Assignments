package com.example.demo_cricket.repository;

import com.example.demo_cricket.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByEmail(String email);
    Boolean existsByEmail(String email);

}
