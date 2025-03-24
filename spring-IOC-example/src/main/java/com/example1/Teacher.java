package com.example1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Teacher {
//    @Value("${Teacher_name}")
    private String t_name;

    public Teacher(String t_name) {
        this.t_name = t_name;
    }

    public String getT_name() {
        return t_name;
    }

    public void Teacherabout() {
        System.out.println("printing teacher details");
    }
}
