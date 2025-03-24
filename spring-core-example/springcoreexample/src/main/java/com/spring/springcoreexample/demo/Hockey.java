package com.spring.springcoreexample.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Hockey implements Coach{
    public Hockey() {
        System.out.println("hockey constructor");
    }

    @Override
    public String run() {
        return "game is hockey";
    }
}
