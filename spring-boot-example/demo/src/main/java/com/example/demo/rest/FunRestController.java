package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${student_name}")
    private String name;
    @Value("${student_id}")
    private String id;

    @GetMapping("/stu")
   public String getDetails(){
        return id + " "+name;
    }

    @GetMapping("/")
    public String sayHello(){
        return "hello hi niharika";
    }
    @GetMapping("/ab")
    public String sayHi(){
        return "hey";
    }

    @GetMapping("/abc")
    public String handleGet() {
        return "This is a GET request!";
    }

    @PostMapping("/abc")
    public String handlePost() {
        return "This is a POST request!";
    }


}
