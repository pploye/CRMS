package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Course;

@Repository
public interface ICourseRepository extends CrudRepository<Course, String>{

	
}
