package com.seleniumexpress.task2;

public class Subject {
    String subname;
    Integer marks;

    public Subject(String subname, Integer marks) {
        this.subname = subname;
        this.marks = marks;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
    public String toString(){
        return subname+" "+marks;
    }
}
