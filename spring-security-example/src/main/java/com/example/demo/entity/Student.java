package com.example.demo.entity;

import lombok.Data;

@Data
public class Student {
    Integer id;
    String name;
    Integer marks;

    public Student(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
