package com.example.employee_task.repository;

import com.example.employee_task.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee  e where e.status= :status")
    List<Employee> findByStatus(@Param("status") String status);

    Employee findByEmail(String email);


//     @Query("SELECT CONCAT(e.firstname, ' ', e.lastname) FROM Employee e")
//     List<String> getFullName();

    //List<Employee> findByStatus(String status);we can also give like this
}
