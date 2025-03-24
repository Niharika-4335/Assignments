package com.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.example1")
@PropertySource("classpath:Properties.School_information")
public class SchoolConfigfile {

//    @Autowired
//    private Student student;

    @Bean
    public School school() {
        // bean and component(automatically) are same.Hey, I am manually defining a School object.
        return new School();//creates a new instance of school and store it in application context.
        //that's why it is called java based configuration.

    }

//    @Bean
//    public List<Student> studentlist(){
//        return Arrays.asList(
//                new Student(2,"venkatesh"),
//                new Student(3,"niharika")
//
//        );
//    }
//
//    @Bean
//    public Student studentlists(){
//        student.setStudent_name("fsevdb");
//        student.setId(1);
//        return student;
//    }
//
//    @Bean
//    public List<Teacher> teacherlist(){
//        return Arrays.asList(
//                new Teacher("preethi"),
//                new Teacher("anil")
//
//        );
//    }

}
