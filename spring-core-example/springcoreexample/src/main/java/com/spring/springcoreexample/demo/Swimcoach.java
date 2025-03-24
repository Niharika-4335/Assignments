package com.spring.springcoreexample.demo;

import org.springframework.stereotype.Component;


public class Swimcoach implements Coach{
    public Swimcoach() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public String run() {
        return "swim 1000 miles";
    }
}
