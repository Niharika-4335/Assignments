package com.selenuimexpress.dlo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        Student student=new Student();
//        MathCheat m=new MathCheat();
//        student.setMathCheat(m);
//        student.cheating();

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student a=context.getBean("student",Student.class);
        a.cheating();

//        AnotherStudent b=context.getBean("asu",AnotherStudent.class);
//        b.anotherCheating();



    }
}
