package com.aurora.crms.service;

import java.util.List;

import com.aurora.crms.domain.Course;
import com.aurora.crms.domain.Department;
import com.aurora.crms.domain.Program;
import com.aurora.crms.domain.Student;

public interface IStudentService {
	
	public boolean updateProfile(Student student);
	public boolean displayDepartments();
	public boolean displayCourses(Department dept, Program program);
	public void displayAcademicYear();
	public boolean signUp(Course course);
	public boolean registerStudent(Course course);
	public void drop(Course course);
	public List <Course> getRegisteredCourses();
	public List <Course> getSignedUpCourses();
	public List <Course> getDroppedCourses();

}
