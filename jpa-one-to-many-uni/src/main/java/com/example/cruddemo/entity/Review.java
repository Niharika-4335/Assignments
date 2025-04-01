package com.example.cruddemo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="review")

public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @Column(name="comment")
    String comment;

    @Column(name="course_id")
    String course_id;



    public Review() {
    }

    public Review( String comment) {

        this.comment = comment;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", course_id='" + course_id + '\'' +
                '}';
    }
}
