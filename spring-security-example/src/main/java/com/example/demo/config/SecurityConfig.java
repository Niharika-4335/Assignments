package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
//it says that don't follow default security process instead i want to customize.
public class SecurityConfig {

    private UserDetailsService userDetailsService;

    @Autowired
    public SecurityConfig( @Lazy  UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        //this removes csrf.this is lambda expression  of csrf configurer and http security
        //internally we have to implement the interface implement the method and pass it as object.


        //this says that every request should be authenticated.

        //to solve csrf we always generate session ids.
        return httpSecurity
                .csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request ->request
                        .requestMatchers("register","login")
                        .permitAll()
                        .anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();

    }
    //in  InMemoryUserDetailsManager we have constructors to get users.

//    @Bean
//    public UserDetailsService userDetailsService(){
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        UserDetails user1=User
//                .withDefaultPasswordEncoder()
//                .username("abc")
//                .password("N@123")
//                .roles("admin")
//                .build();
//
//        UserDetails user2=User
//                .withDefaultPasswordEncoder()
//                .username("anil")
//                .password("A@123")
//                .roles("user")
//                .build();
//        UserDetails user3=User
//                .withDefaultPasswordEncoder()
//                .username("sunil")
//                .password("A@1234")
//                .roles("user")
//                .build();
//
//
//
//        return  new InMemoryUserDetailsManager(user1,user2,user3);
//    }
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        //providing our authentication provider
        daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        //our own user details service
        return daoAuthenticationProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
