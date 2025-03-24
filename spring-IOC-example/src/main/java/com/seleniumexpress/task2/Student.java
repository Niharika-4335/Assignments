package com.seleniumexpress.task2;

public class Student {
    private String name;
    private Integer rollno;
    private Subject subject;

    public Student(String name, Integer rollno, Subject subject) {
        this.name = name;
        this.rollno = rollno;
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public Integer getRollno() {
        return rollno;
    }
}
