package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;

import com.aurora.crms.domain.Student;

public interface IStudentRepository extends CrudRepository<Student, String>{

}
