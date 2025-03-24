package com.seleniuexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired
    @Qualifier("heartobjects")
    private Heart heart;
//    public Human(){
//
//    }
//    public Human(Heart heart) {
//        this.heart = heart;
//        System.out.println("constructor is called");
//    }
//@Autowired
//@Qualifier("heartobjects")

//    public void setHeart(Heart heart) {
//        this.heart = heart;
//    System.out.println("setter method is called");
//    }

    public void pumps(){
        heart.pumping();
    }

//if we write annotations before the class type we don't need setter methods and constructors.it directly refers to it.
    // autowiring works first by -bytype and then -byname
    //autowiring by using constructor-first it checks for default constructor.
}
