package com.aurora.crms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurora.crms.domain.Student;
import com.aurora.crms.repository.IStudentRepository;


@Service
public class StudentService implements IStudentService{
/*
	@Autowired
	IStudentRepository studentrepository;*/
	
	@Override
	public boolean updateProfile(Student student) {
		/*if(studentrepository.updateProfile(student)){
			return true;
		}*/
		return false;
		
	}

}
