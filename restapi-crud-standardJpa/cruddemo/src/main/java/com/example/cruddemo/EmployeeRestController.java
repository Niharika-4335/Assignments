package com.example.cruddemo;

import com.example.cruddemo.dao.EmployeeDao;
import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    //for patch method we need object helper class
    private ObjectMapper objectMapper;

    @Autowired
    public EmployeeRestController(ObjectMapper objectMapper, EmployeeService employeeService) {
        this.objectMapper = objectMapper;
        this.employeeService = employeeService;
    }



    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{findbyid}")
    public Employee findEmployeeById(@PathVariable Integer findbyid ) {
        return employeeService.findById(findbyid);
    }



    @Transactional
    @PostMapping("/employees")
    public Employee createStudent(@RequestBody Employee emp){
          emp.setId(null);
          Employee emp1=employeeService.save(emp);
          return emp1;
    }


    @Transactional
    @PutMapping("/employees")
    public Employee updateStudent(@RequestBody Employee emp){
        Employee emp1=employeeService.save(emp);
        return emp1;
    }


    @Transactional
    @DeleteMapping("/employees/{deleteById}")
    public void deleteById(@PathVariable Integer deleteById) {
        employeeService.deleteById(deleteById);
    }
    //have to implement patch -for put all tye object is created again....
@Transactional
   @PatchMapping("/employees/{emp_id}")
    public Employee patchEmployee(@PathVariable Integer emp_id,@RequestBody Map<String,Object> patchLoad){

          Employee emp=employeeService.findById(emp_id);
          if(emp==null){
              throw new RuntimeException("emp is null");
          }
          if(patchLoad.containsKey("id")){
              throw new RuntimeException("id shouldnt be there");
          }
          Employee emp1=apply(patchLoad,emp);
          Employee dbemp=employeeService.save(emp1);
          return dbemp;


   }

    private Employee apply(Map<String, Object> patchLoad, Employee emp) {
        ObjectNode empNode=objectMapper.convertValue(emp, ObjectNode.class);
        ObjectNode patchNode=objectMapper.convertValue(patchLoad, ObjectNode.class);

        empNode.setAll(patchNode);

        return objectMapper.convertValue(empNode, Employee.class);
    }

}
