package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Course;
import com.example.cruddemo.entity.Instructor;

import java.util.List;


public interface InstructorDao {
    public void save(Instructor instructor);

    public Instructor findById(Integer id);

    public List<Course> findCourseByInstructorId(Integer id);//writing query and explicitly adding courses to instructor
    //n+1 problem of queries.

    public Instructor findInstructorByJoinFetch(Integer id);
    //join fetch internally uses joins and reduces n+1 problem.


    public void updateInstructor(Instructor instructor);

    public void updateCourse(Course course);


    Course findCourseById(Integer id);//to update the courses we need th method

    void delete(Integer id);








}
