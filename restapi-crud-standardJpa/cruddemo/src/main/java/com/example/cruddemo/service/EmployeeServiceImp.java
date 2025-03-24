package com.example.cruddemo.service;

import com.example.cruddemo.dao.EmployeeDao;
import com.example.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeServiceImp implements EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeServiceImp(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDao.findById(id);
    }

    @Override
    public Employee save(Employee emp) {
        return employeeDao.save(emp);
    }

    @Override
    public void deleteById(Integer id) {
        employeeDao.deleteById(id);
    }
}
