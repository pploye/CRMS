package com.aurora.crms.service;

import java.util.List;

import com.aurora.crms.domain.Course;

public interface ICourseService {
	public boolean addCourse(Course course);
	public boolean removeCourse(Course course);
	public boolean addListofCourse(List <Course> courses);
	public boolean removeListOfCourses(List <Course> courses);
	public void getAllCourses();
	

}
