package com.example.cruddemo.service;

import com.example.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    public Employee findById(Integer id);

    public Employee save(Employee emp);

    public void deleteById(Integer id);
}
