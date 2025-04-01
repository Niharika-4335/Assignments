package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Course;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorDaoImp implements InstructorDao {
    private EntityManager entityManager;

    @Autowired
    public InstructorDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findById(Integer id) {
        Instructor instructor = entityManager.find(Instructor.class, id);
        return instructor;
    }


    @Override
    public List<Course> findCourseByInstructorId(Integer id) {
        TypedQuery<Course> typedQuery = entityManager.createQuery("from Course where instructor.id= :data", Course.class);
        typedQuery.setParameter("data", id);
        return typedQuery.getResultList();


    }
    //to simplify above method as we wrote two queries findbyid and for courses another one..
    //so we wrote another one query which gives both courses and instructor .

    //SELECT * FROM instructor WHERE id = 1;
    //SELECT * FROM course WHERE instructor_id = 1; without join fetch it will get two queries executed.
    @Override
    public Instructor findInstructorByJoinFetch(Integer id) {
        TypedQuery<Instructor> query = entityManager.createQuery(
                "select i from Instructor i " +
                        "join fetch i.courses " +
                        "join fetch i.instructorDetail " +
                        "where i.id = :data",
                Instructor.class);
        query.setParameter("data", id);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public void updateInstructor(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    @Transactional
    public void updateCourse(Course course) {
        entityManager.merge(course);
    }

    @Override
    public Course findCourseById(Integer id) {
        Course course =entityManager.find(Course.class, id);
        return course;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Instructor instructor=entityManager.find(Instructor.class,id);
        List<Course> courses=instructor.getCourses();
        //actually this will shoe session error as in find case but here @transactional makes restore session.
        //we break the associations of all instructor
        for(Course c:courses){
            c.setInstructor(null);
        }
        entityManager.remove(instructor);
    }


}