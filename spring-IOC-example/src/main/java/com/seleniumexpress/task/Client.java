package com.seleniumexpress.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Airtel a=context.getBean("airtel",Airtel.class);
        a.wantedServices();

    }
}
