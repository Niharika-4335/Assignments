package com.example.cruddemo;

import com.example.cruddemo.dao.InstructorDao;
import com.example.cruddemo.entity.Course;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(InstructorDao instructorDao) {
        return runner ->
//                CreateInstructorWithCourse(instructorDao);
//                   FindInstructorWithCourse(instructorDao);
//        findCoursesWithInstructor(instructorDao);
//        findInstructorwithCoursesJoinFetch(instructorDao);
//        updateInstructor(instructorDao);
//        updateCourse(instructorDao);
        deleteInstructorById(instructorDao);



    }

    private void deleteInstructorById(InstructorDao instructorDao) {
         int id=1;
         instructorDao.delete(id);
    }

    private void updateCourse(InstructorDao instructorDao) {
        int id=10;
        Course course=instructorDao.findCourseById(id);
        course.setTitle("it ends with us");
        instructorDao.updateCourse(course);
    }

    private void findInstructorwithCoursesJoinFetch(InstructorDao instructorDao) {

       Instructor instructor= instructorDao.findInstructorByJoinFetch(1);
        System.out.println(instructor);
        System.out.println(instructor.getCourses());

    }

    private void findCoursesWithInstructor(InstructorDao instructorDao) {
        Instructor instructor=instructorDao.findById(1);
        System.out.println(instructor);//we have to know whether its prints...courses or not
//        System.out.println(instructor.getCourses());//gives exception
// here as we mentioned lazy loading courses won't get loaded only instructor will get printed..we are loading explictly
        //by writing query and setting them into instructor .
        List<Course> courses= instructorDao.findCourseByInstructorId(1);
        System.out.println(courses);
        instructor.setCourses(courses);
        System.out.println(instructor.getCourses());

    }


    private void FindInstructorWithCourse(InstructorDao instructorDao) {

        Instructor instructor=instructorDao.findById(1);
        System.out.println(instructor);
        System.out.println(instructor.getCourses());
    }

    private void CreateInstructorWithCourse(InstructorDao instructorDao) {
        Instructor instructor = new Instructor("anil", "britney", "honey@gmail.com");
        InstructorDetails instructorDetails = new InstructorDetails("honeydiaries.com", "writing");
        instructor.setInstructorDetail(instructorDetails);

		Course course1=new Course("java");
		Course course2=new Course("python");

		instructor.add(course1);
		instructor.add(course2);

		System.out.println(instructor);
		System.out.println(instructor.getCourses());
		instructorDao.save(instructor);


    }

    public void updateInstructor(InstructorDao instructorDao){
        int id=1;
        Instructor instructor=instructorDao.findById(id);
        instructor.setLastName("kulkarni");
        instructorDao.updateInstructor(instructor);
    }


}



