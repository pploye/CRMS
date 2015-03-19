package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Department;

@Repository
public interface IDepartmentRepository extends CrudRepository<Department, String>{

}
