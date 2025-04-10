package com.example.demo.service;

import com.example.demo.entity.UserPrincipal;
import com.example.demo.entity.Users;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyService implements UserDetailsService {


    private UserRepo userrepo;

    private JwtService jwtService;


    private AuthenticationManager authenticationManager;

    @Autowired
    public MyService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Autowired
    public MyService(UserRepo userrepo, AuthenticationManager authenticationManager) {
        this.userrepo = userrepo;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userrepo.findByUsername(username);
        if (user == null) {
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("user not found");
        }
        return new UserPrincipal(user);
    }

    public Users saveUser(Users user){
         return userrepo.save(user);
    }


    public String verify(Users user) {
        Authentication authentication= authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername());
        }
        return "fail";
    }




}
