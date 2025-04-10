package com.example.demo_cricket.service;

import com.example.demo_cricket.UserDetails.UserDetailsImpl;
import com.example.demo_cricket.dto.AuthResponse;
import com.example.demo_cricket.dto.LoginRequest;
import com.example.demo_cricket.dto.SignUpRequest;
import com.example.demo_cricket.entity.Role;
import com.example.demo_cricket.entity.Users;
import com.example.demo_cricket.entity.Wallet;
import com.example.demo_cricket.jwt.JwtUtils;
import com.example.demo_cricket.repository.UserRepository;
import com.example.demo_cricket.repository.WalletRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
        private final UserRepository userRepository;
        private final WalletRepository walletRepository;
        private final PasswordEncoder passwordEncoder;
        private final AuthenticationManager authenticationManager;
        private final JwtUtils jwtUtils;


        @Autowired
        public AuthService(UserRepository userRepository, WalletRepository walletRepository,
                           PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager,
                           JwtUtils jwtUtils) {
            this.userRepository = userRepository;
            this.walletRepository = walletRepository;
            this.passwordEncoder = passwordEncoder;
            this.authenticationManager = authenticationManager;
            this.jwtUtils = jwtUtils;
        }

        @Transactional
        public AuthResponse registerUser(SignUpRequest signUpRequest) {
            if (userRepository.existsByEmail(signUpRequest.getEmail())) {
                throw new RuntimeException("Error: Email is already in use!");
            }

            // Create new user
            Users user = new Users();
            user.setFullName(signUpRequest.getFullName());
            user.setEmail(signUpRequest.getEmail());
            user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
            user.setRole(Role.PLAYER);

            Users savedUser = userRepository.save(user);

            // Create wallet for user
            Wallet wallet = new Wallet();
            wallet.setUser(savedUser);
            wallet.setBalance(0.0);
            walletRepository.save(wallet);

            // Generate JWT token
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            signUpRequest.getEmail(),
                            signUpRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);

            return new AuthResponse(jwt, savedUser.getRole().name());
        }

        public AuthResponse authenticateUser(LoginRequest loginRequest) {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getEmail(),
                            loginRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtUtils.generateJwtToken(authentication);

            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            String role = userDetails.getAuthorities().stream()
                    .findFirst()
                    .map(GrantedAuthority::getAuthority)
                    .orElse("");

            return new AuthResponse(jwt, role);
        }
    }
