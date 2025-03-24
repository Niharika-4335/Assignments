package com.spring.springcoreexample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Lazy

public class Democontroller {
//    @Autowired
    private Coach coach;
//    private Coach mycoach;

    @Autowired
    public Democontroller(
            @Qualifier("water") Coach coach) {
//        System.out.println("demo controller");
        this.coach = coach;
//        this.mycoach=mycoach;
    }

    @GetMapping("/coach")
    public String printSomething(){
        return coach.run();
    }

//    @GetMapping("/check")
//    public String checkEquality(){
//        return String.valueOf(coach==mycoach);
//    }





}
