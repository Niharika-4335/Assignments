package com.seleniumexpress.properties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${Student_name}")
    private String name;
    private String course;
    private String hobbie;
    public String getName() {
        return name;
    }
//    @Value("${Student_name}")
    public void setName(String name) {
        this.name = name;
        System.out.println("setter method is calling");
    }

    public String getCourse() {
        return course;
    }
  @Value("${Student_course}")
    public void setCourse(String course) {
        this.course = course;
      System.out.println("s");
    }

    public String getHobbie() {
        return hobbie;
    }
    @Value("${Student_hobbie}")
    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
        System.out.println("s");
    }

    public void display_details(){
        System.out.println(name + " interested in learning "+course+" and has "+hobbie);
    }
}
