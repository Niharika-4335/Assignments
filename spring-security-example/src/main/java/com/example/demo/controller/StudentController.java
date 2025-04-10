package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"niharika",29),
            new Student(2,"durga",80)

    ));

    @GetMapping("/students")
    public List<Student> getListOfStudents(){
        return students;
    }


//    @GetMapping("/csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request){
//        return (CsrfToken) request.getAttribute("_csrf");
//    }
    @PostMapping()
    public Student addStudent(@RequestBody  Student student){
        students.add(student);
        return student;
    }
}
