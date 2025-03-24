package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImp implements EmployeeDao {


    private EntityManager entityManager;


    public EmployeeDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);

        return query.getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        Employee emp = entityManager.find(Employee.class, id);
        if(emp==null){
            throw new RuntimeException("record not found with an id"+ id);
        }
        return emp;
    }



    @Override
    public  Employee save(Employee emp) {
         Employee newemp=entityManager.merge(emp);
         return newemp;
    }


    @Override
    public void deleteById(Integer id) {
        Employee emp = entityManager.find(Employee.class, id);
        entityManager.remove(emp);
    }
}
