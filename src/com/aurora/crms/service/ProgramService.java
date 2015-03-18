package com.aurora.crms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurora.crms.repository.IProgramRepository;

@Service
@Transactional
public class ProgramService implements IProgramService {
	
	@Autowired
	IProgramRepository programRepository;
	@Override
	public void saveProgram() {
	
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

}
