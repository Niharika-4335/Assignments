package com.example1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${Student_id}")
    private Integer id;
    @Value("${Student_name}")
    private String Student_name;


    public Student(){
        System.out.println("hiiiii");
    }

//    public Student(int id, String Student_name) {
//        this.id=id;
//        this.Student_name=Student_name;
//    }

    public Integer getId() {
        return id;
    }

//    public void setStudent_name(String student_name) {
//        Student_name = student_name;
//    }

    public String getStudent_name() {
        return Student_name;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public void Studentabout(){
        System.out.println("printing student details");
    }
}
