package com.spring.springcoreexample.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Cricket implements  Coach {

    public Cricket() {
        System.out.println("cricket constructor");
    }

    @Override
    public String run() {
        return "run 5km daily";
    }

//@PostConstruct
//    public void init(){
//        System.out.println(getClass().getSimpleName());
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println(getClass().getSimpleName());
//    }

}
