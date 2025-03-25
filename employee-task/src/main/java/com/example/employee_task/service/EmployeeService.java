package com.example.employee_task.service;

import com.example.employee_task.DTO.EmployeeDto;
import com.example.employee_task.entity.Employee;
import com.example.employee_task.exception.EmployeeNotFoundException;
import com.example.employee_task.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    //apply all crud operations and exceptions in only service layer

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmpById(Integer id) {
        Optional<Employee> emp = employeeRepository.findById(id);
        if (!emp.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found with id" + id);
        }
        return emp.orElse(null);

    }

    public void deleteEmpById(Integer id) {
        Optional<Employee> emp = employeeRepository.findById(id);
        if (!emp.isPresent()) {
            throw new EmployeeNotFoundException("Employee not found with id" + id);
        }
        employeeRepository.delete(emp.get());
    }

    public EmployeeDto createEmployee(EmployeeDto emp) {
        Employee employee = new Employee();
        employee.setFirstname(emp.getFirstname());
        employee.setLastname(emp.getLastname());
        employee.setEmail(emp.getEmail());
        employee.setStatus(emp.getStatus());
        Employee dbEmployee = employeeRepository.save(employee);

        EmployeeDto responseDto = new EmployeeDto();
        responseDto.setId(dbEmployee.getId());
        responseDto.setFullName(dbEmployee.getFirstname() + " " + dbEmployee.getLastname());
        responseDto.setEmail(dbEmployee.getEmail());
        responseDto.setStatus(dbEmployee.getStatus());
        return responseDto;

    }

    public EmployeeDto UpdateEmployee(Integer id, EmployeeDto emp1) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() ->
                new EmployeeNotFoundException("Employee not found with id" + id));
        if (emp1.getFirstname() != null) {
            existingEmployee.setFirstname(emp1.getFirstname());
        }
        if (emp1.getLastname() != null) {
            existingEmployee.setLastname(emp1.getLastname());
        }
        if (emp1.getEmail() != null) {
            existingEmployee.setEmail(emp1.getEmail());
        }
        if (emp1.getStatus() != null) {
            existingEmployee.setStatus(emp1.getStatus());
        }

        Employee dbEmployee = employeeRepository.save(existingEmployee);
        EmployeeDto responseDto = new EmployeeDto();
        responseDto.setId(dbEmployee.getId());
        responseDto.setFullName(dbEmployee.getFirstname() + " " + dbEmployee.getLastname());
        responseDto.setEmail(dbEmployee.getEmail());
        responseDto.setStatus(dbEmployee.getStatus());
        return responseDto;


    }

    public List<Employee> getEmployeeByStatus(String status_name) {
        return employeeRepository.findByStatus(status_name);
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }
}
