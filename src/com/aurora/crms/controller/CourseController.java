package com.aurora.crms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aurora.crms.domain.Course;
import com.aurora.crms.service.ICourse;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	ICourse courseService;
	
	@RequestMapping(value = { "/", "/add" }, method = RequestMethod.GET)
	public String addCourse(@ModelAttribute Course course) {
		return "addcoursetile"; // This should match the tile definition name
	}

	@RequestMapping(value = { "/edit" }, method = RequestMethod.POST)
	public String editCourse(@Valid Course course, BindingResult result) {
		if (result.hasErrors())
			return "editcoursetile";
		return "coursedetailtile";
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String listStudent() {
		return "courselisttile";
	}

	@RequestMapping(value = { "/detail", "/detail/{id}" }, method = RequestMethod.GET)
	public String listStudent(@PathVariable String id) {
		if (id.length() <= 0) {
			// You have to fetch student with id from the repository using the
			// student service
		}
		return "coursedetailtile";
	}

}
