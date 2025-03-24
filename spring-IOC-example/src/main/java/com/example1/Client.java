package com.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SchoolConfigfile.class);
        School school=context.getBean(School.class);
        System.out.println("hi");
        school.printDeatils();

    }
}
