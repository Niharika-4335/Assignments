package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


public interface InstructorDao {
//    public void save(Instructor instructor);
//    public Instructor findById(Integer id);
//    public void deleteById(Integer id);

    public InstructorDetails findById(Integer id);

    public  void deleteById(Integer id);








}
