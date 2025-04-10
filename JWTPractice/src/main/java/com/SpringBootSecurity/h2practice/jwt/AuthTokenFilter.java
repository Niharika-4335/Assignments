package com.SpringBootSecurity.h2practice.jwt;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
   //once per request is to intercept the incoming request and sending it to the
    @Component
    public class AuthTokenFilter extends OncePerRequestFilter {

     //autowiring the util classes
        @Autowired
        private JWTUtils jwtUtils;

        @Autowired
        private UserDetailsService userDetailsService;

        private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);

        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
                throws ServletException, IOException {
            logger.debug("AuthTokenFilter called for URI: {}", request.getRequestURI());
            try {
                //extract the jwt token 
                String jwt = parseJwt(request);

                // this condition checks for the weather the token is validated i.e user credentials can have authorization
                //or not and the jwt is can not be null
                if (jwt != null && jwtUtils.validateJwtToken(jwt)) {
                    String username = jwtUtils.getUserNameFromJwtToken(jwt);
                    //extracts the username
                    UserDetails userDetails = userDetailsService.loadUserByUsername(username);//loads the user details from the database.


                    //authentication token can have what can user access with the token
                    //suppose a user can not access the admin
                    //suppose in my pass team everyone can not have access to the production deployment
                    UsernamePasswordAuthenticationToken authentication =
                            new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    logger.debug("Roles from JWT: {}", userDetails.getAuthorities());


                    //making the token more strong by adding the current session details request info etc..
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    SecurityContextHolder.getContext().setAuthentication(authentication);//Stores the fully authenticated user inside the SecurityContextHolder.
                }
            } catch (Exception e) {
                logger.error("Cannot set user authentication: {}", e);
            }

            filterChain.doFilter(request, response);//Allows the request to proceed to the next filter.
        }


        // this method extracts the token from the users http request
        private String parseJwt(HttpServletRequest request) {
            String jwt = jwtUtils.getJwtFromHeader(request);
            logger.debug("AuthTokenFilter.java: {}", jwt);
            return jwt;
        }
}
