package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Program;

@Repository
public interface IProgramRepository extends  CrudRepository<Program, Long>  {


}
