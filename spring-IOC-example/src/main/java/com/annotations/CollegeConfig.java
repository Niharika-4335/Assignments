package com.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//configuration tells just it is configured file.
@Configuration
@ComponentScan(basePackages = "com.annotations")
@PropertySource("classpath:Properties.college_information")
public class CollegeConfig {
//    @Bean
//    public Teacher MathTeacherBean(){
//        return  new MathTeacher();//interface reference creating object for class using an interface reference.
//    }
//
//    @Bean
//    public Principal principalBean(){
//        return new Principal();//principal bean is an object internally it creates//Principal principalBean=new Principal();
//    }
//    @Bean
//    public College collegeBean(){
//        College college=new College();
//        college.setPrincipal(principalBean());
//        college.setTeacher(MathTeacherBean());
//        return college;
//
//    }
}
