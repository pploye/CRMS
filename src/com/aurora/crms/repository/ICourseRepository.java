package com.aurora.crms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aurora.crms.domain.Course;

public interface ICourseRepository extends CrudRepository<Course, String>{

	
}