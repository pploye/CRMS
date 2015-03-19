package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student, String>{

}
