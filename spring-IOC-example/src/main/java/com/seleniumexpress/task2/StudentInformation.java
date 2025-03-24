package com.seleniumexpress.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentInformation {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Student details= context.getBean("student",Student.class);
        System.out.println(details.getName()+" got marks "+details.getSubject().marks);


    }
}
