package com.SpringBootSecurity.h2practice.Controller;

import com.SpringBootSecurity.h2practice.jwt.JWTUtils;

import com.SpringBootSecurity.h2practice.jwt.LoginRequest;
import com.SpringBootSecurity.h2practice.jwt.LoginResponse;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//marks this as a Rest api controller
// used to communicate  with other apis

@RestController
public class Greet {
    // injecting the JWT utils to manage tthe jwt methods for it
    @Autowired
    private JWTUtils jwtUtils;

    //it stores the authenticated  use details  -> create the object to store the authenticated usr details
     Authentication authentication;

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
    @PostMapping("/signin")
    //takes the login request as input that is user credentials  and returns a response
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) throws AuthenticationException {
      //authenticates the user by the given username and the password
        authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
         //get the authenticated user and sets the  authentication in the security context
          //so that it will be accesses anywhere in the program.
        SecurityContextHolder.getContext().setAuthentication(authentication);
        // gets the authenticated user details
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
       //generate the jwt token based on the username provided
        String jwtToken = jwtUtils.generateTokenFromUsername(userDetails);

        //extracts the roles
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        LoginResponse response = new LoginResponse(userDetails.getUsername(), roles, jwtToken);

        return ResponseEntity.ok(response);
    }
}
