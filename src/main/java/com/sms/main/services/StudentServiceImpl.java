package com.sms.main.services;

import com.sms.main.entity.Student;
import com.sms.main.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentServices {


    public final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo){
        this.repo = repo;
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("No student found with this id"));
    }

    @Override
    public Student addStudent(Student std) {
        return repo.save(std);
    }

    @Override
    public Student updateStudent(int id, Student updated) {
        Student std = repo.findById(id).orElseThrow(()->new RuntimeException("Student Not Found"));
        std.setName(updated.getName());
        std.setPhoneNo(updated.getPhoneNo());
        std.setBranch(updated.getBranch());
        return repo.save(std);
    }

    @Override
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
