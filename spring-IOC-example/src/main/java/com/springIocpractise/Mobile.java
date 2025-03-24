package com.springIocpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
//        Sim sim=new Airtel();
//        sim.calling();
//        sim.data();//interface reference //but still we have to change code of the class.
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        //here spring framework is taking control instead of us.so its inverse process right.
        //i:e its called inversion of control.
        System.out.println("config loaded");
       Airtel a= (Airtel) applicationContext.getBean("airtel");
       a.calling();
//       a.data();
//        Vodafone v= applicationContext.getBean("vodafone", Vodafone.class);
//        v.calling();
//        v.data();
        Sim sim=applicationContext.getBean("sim",Sim.class);
        sim.calling();
        sim.data();
    }
}
