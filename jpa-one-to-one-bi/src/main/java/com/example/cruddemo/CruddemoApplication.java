package com.example.cruddemo;

import com.example.cruddemo.dao.InstructorDao;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetails;
import jakarta.transaction.Transactional;
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
		return runner->
//				findInstructorDetailsById(instructorDao);
				deleteInstructorDetailsById(instructorDao);
	}
	private void deleteInstructorDetailsById(InstructorDao instructorDao) {

		instructorDao.deleteById(3);
	}

	private void findInstructorDetailsById(InstructorDao instructorDao) {
		Integer id = 2;
		InstructorDetails instructorDetails = instructorDao.findById(2);
		System.out.println(instructorDetails);
		System.out.println(instructorDetails.getInstructor());

	}

}



