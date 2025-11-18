package com.sms.main.controllers;

import com.sms.main.entity.Student;
import com.sms.main.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {


    @Autowired
    StudentServices service;

    @GetMapping("/students")
    public List<Student> getAll(){
       return service.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentByID(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping("/students/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student std){
       return service.addStudent(std);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updated){
        return service.updateStudent(id,updated);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }
}
