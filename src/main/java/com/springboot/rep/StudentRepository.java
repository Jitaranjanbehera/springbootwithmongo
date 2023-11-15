package com.springboot.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
