package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorDaoImp implements InstructorDao {
    private EntityManager entityManager;

    @Autowired

    public InstructorDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public InstructorDetails findById(Integer id) {
       return  entityManager.find(InstructorDetails.class,id);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        InstructorDetails instructorDetails=entityManager.find(InstructorDetails.class,id);
        instructorDetails.getInstructor().setInstructorDetail(null);
        entityManager.remove(instructorDetails);
    }

//    @Override
//    @Transactional
//    public void save(Instructor instructor) {
//        entityManager.persist(instructor);
//    }
//
//    @Override
//    public Instructor findById(Integer id) {
//        return entityManager.find(Instructor.class,id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(Integer id) {
//        Instructor instructor=entityManager.find(Instructor.class,id);
//        entityManager.remove(instructor);
//    }
}
