package com.example.demo.controller;

import com.example.demo.jwt.JwtUtils;
import com.example.demo.jwt.LoginRequest;
import com.example.demo.jwt.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class JwtController {
    @Autowired
    private JwtUtils jwtUtils;

    //it stores the authenticated  use details  -> create the object to store the authenticated usr details
//    @Autowired
//    Authentication authentication;

    //authentication manager is used to injected to manage the Authentication
    @Autowired
    private AuthenticationManager authenticationManager;


    @GetMapping("/hello")

    //this is a one end point accessed by any one
    public String greeting(){
        return "hello anil kumar ";
    }

    // this end point can be used by the roles with  USER only
    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String userEndPoint(){
        return "user!!!!!!";
    }
    //this end point is only accessed by role with the admin only

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String adminEndPoint(){
        return "Admin!!!!!!";
    }

    //it handles the user sign in  takes the user
    //takes the login request as input that is user credentials  and returns a response
    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        try {
            // Authenticate the user
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
            );

            System.out.println("Login attempt: " + loginRequest.getUsername());

            // Set authentication in the security context
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // Get authenticated user details
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();

            // Generate JWT token using above authenticated users details. it sings the token using secret key.
            String jwtToken = jwtUtils.generateTokenFromUsername(userDetails);

            // Extract roles
            List<String> roles = userDetails.getAuthorities().stream()
                    .map(item -> item.getAuthority())
                    .collect(Collectors.toList());

            // Build response
            LoginResponse response = new LoginResponse(userDetails.getUsername(), roles, jwtToken);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }

}
