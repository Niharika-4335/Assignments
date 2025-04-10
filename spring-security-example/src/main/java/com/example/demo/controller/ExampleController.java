package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/home")
    public String display(){
        return "hi this is home page";
    }
    @GetMapping("/session")
    public void getSessionId(HttpServletRequest httpServletRequest){
        System.out.println(httpServletRequest.getSession().getId());
    }
}
