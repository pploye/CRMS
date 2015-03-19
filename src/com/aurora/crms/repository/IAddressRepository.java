package com.aurora.crms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Address;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Long>{

}
