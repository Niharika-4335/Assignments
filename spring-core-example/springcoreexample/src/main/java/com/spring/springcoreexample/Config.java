package com.spring.springcoreexample;

import com.spring.springcoreexample.demo.Coach;
import com.spring.springcoreexample.demo.Swimcoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("water")
    public Coach swimcoach(){
        return new Swimcoach();
    }
}
