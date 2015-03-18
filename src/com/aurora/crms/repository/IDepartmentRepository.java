package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;

import com.aurora.crms.domain.Department;

public interface IDepartmentRepository extends CrudRepository<Department, String>{

}
