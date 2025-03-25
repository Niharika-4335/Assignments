package com.example.employee_task.controller;

import com.example.employee_task.DTO.EmployeeDto;
import com.example.employee_task.repository.EmployeeRepository;
import com.example.employee_task.entity.Employee;
import com.example.employee_task.exception.EmployeeNotFoundException;
import com.example.employee_task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmpById(id);
    }


    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.createEmployee(employeeDto);
    }


    @PutMapping("/{id}")
    public EmployeeDto updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDto employeeDto) {
        return employeeService.UpdateEmployee(id, employeeDto);
    }


    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmpById(id);
    }

    @GetMapping("/status/{status}")
    public List<Employee> getEmployeesByStatus(@PathVariable String status) {
        return employeeService.getEmployeeByStatus(status);
    }


    @GetMapping("/email/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email) {
        return employeeService.getEmployeeByEmail(email);
    }
}
