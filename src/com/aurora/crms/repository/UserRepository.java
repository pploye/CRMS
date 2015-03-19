package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
