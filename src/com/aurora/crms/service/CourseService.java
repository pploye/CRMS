package com.aurora.crms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurora.crms.domain.Course;

@Service
@Transactional
public class CourseService implements ICourse {

	@Override
	public boolean addCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addListofCourse(List<Course> courses) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeListOfCourses(List<Course> courses) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getAllCourses() {
		// TODO Auto-generated method stub

	}

}
