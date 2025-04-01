package com.example.cruddemo;

import com.example.cruddemo.dao.InstructorDao;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(InstructorDao instructorDao){
		return runner->CreateInstructor(instructorDao);
	}

	private void deleteInstructorById(InstructorDao instructorDao) {
		instructorDao.deleteById(1);
	}

	private void findInstructorById(InstructorDao instructorDao) {
		int id=1;
		Instructor instructor =instructorDao.findById(id);
		System.out.println(instructor);
		System.out.println(instructor.getInstructorDetail());

	}

	private void CreateInstructor(InstructorDao instructorDao) {
		Instructor instructor = new Instructor("honey", "britney", "honey@gmail.com");
		InstructorDetails instructorDetails = new InstructorDetails("honeydiaries.com", "writing");
		instructor.setInstructorDetail(instructorDetails);
		System.out.println(instructor);
		instructorDao.save(instructor);

		System.out.println(instructor);
	}




}



