package com.example.demo.service;

import io.jsonwebtoken.Jwts;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.jsonwebtoken.Jwts.claims;

@Service
public class JwtService {

    public String generateToken(String username) {

//        Map<String,Object> claims=new HashMap<>();
//        return Jwts.builder()
//                .setClaims(claims)
//                .addClaims(claims)
//                .setSubject(username)
//                .setIssuedAt(new Date(System.currentTimeMillis()).
//
//
//    }
        return null;
    }
}
