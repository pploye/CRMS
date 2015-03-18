package com.aurora.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurora.crms.domain.Course;
import com.aurora.crms.domain.Department;
import com.aurora.crms.domain.Program;
import com.aurora.crms.domain.Student;

@Service
public class StudentService implements IStudentService{

	@Override
	public boolean updateProfile(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean displayDepartments() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean displayCourses(Department dept, Program program) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayAcademicYear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean signUp(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerStudent(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void drop(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getRegisteredCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getSignedUpCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getDroppedCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
