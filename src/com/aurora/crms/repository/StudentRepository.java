package com.aurora.crms.repository;

import org.springframework.stereotype.Repository;

import com.aurora.crms.domain.Student;

@Repository
public class StudentRepository implements IStudentRepository{

	@Override
	public boolean updateProfile(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
