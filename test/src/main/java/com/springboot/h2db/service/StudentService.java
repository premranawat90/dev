package com.springboot.h2db.service;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.h2db.model.Student;
import com.springboot.h2db.repository.StudentRepository;
 
@Service
public class StudentService {
 
    // @Autowired annotation provides the automatic dependency injection.
    @Autowired
    StudentRepository repository;
 
    // Save student entity in the h2 database.
    public void save(final Student student) {
        repository.save(student);
    }
 
    // Get all students from the h2 database.
    public List<Student> getAll() {
        final List<Student> students = new ArrayList<>();
        repository.findAll().forEach(student -> students.add(student));
        return students;
    }
}