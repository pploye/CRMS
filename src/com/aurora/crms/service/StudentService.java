package com.aurora.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurora.crms.domain.Course;
import com.aurora.crms.domain.Department;
import com.aurora.crms.domain.Program;
import com.aurora.crms.domain.Student;

@Service
@Transactional
public class StudentService implements IStudent {

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

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
