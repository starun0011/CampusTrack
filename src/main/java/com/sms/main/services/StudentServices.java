package com.sms.main.services;

import com.sms.main.entity.Student;


import java.util.List;

public interface StudentServices {
    public List<Student> getAllStudents();
    public Student getStudentById(int id);
    public Student addStudent(Student std);
    Student updateStudent(int id, Student updated);
    public  void deleteStudent(int id);
}
