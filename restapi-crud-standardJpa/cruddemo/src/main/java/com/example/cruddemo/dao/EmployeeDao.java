package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();

    public Employee findById(Integer id);

    public Employee save(Employee emp);

    public void deleteById(Integer id);
}
