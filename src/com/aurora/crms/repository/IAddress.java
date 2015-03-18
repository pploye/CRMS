package com.aurora.crms.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.aurora.crms.domain.Address;

public interface IAddress extends CrudRepository<Address, Long>{

}
