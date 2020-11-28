package com.springboot.h2db.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.springboot.h2db.model.Student;
 
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
 
}