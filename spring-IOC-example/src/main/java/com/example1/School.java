package com.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
public class School {
//    @Autowired
//    private List<Student> student;
//
//    @Autowired
//    private List<Teacher> teacher;
    @Autowired
    private Student student;

//    public void print_details() {
//        for (Student i : student) {
//            System.out.println(i.getId() + " " + i.getStudent_name());
//        }
//        for (Teacher i : teacher) {
//            System.out.println(i.getT_name());
//        }
//
//
//    }
    public void printDeatils(){
        System.out.println(student.getId() + " " +student.getStudent_name());
    }

}
