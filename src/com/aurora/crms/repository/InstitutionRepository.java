package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Institution;

@Repository
public interface InstitutionRepository extends CrudRepository<Institution, String> {

}
