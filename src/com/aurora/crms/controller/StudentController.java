package com.aurora.crms.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aurora.crms.domain.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value = {"/","/profile" }, method = RequestMethod.GET)
	public String displayProfile(@ModelAttribute Student student) {
		return "studentprofile"; // This should match the tile definition name
	}

	@RequestMapping(value = {"/profile" }, method = RequestMethod.POST)
	public String updateProfile(@Valid Student student, BindingResult result) {
		if (result.hasErrors())
			return "studentprofile";
		return "studentdetail";
	}
	
	@RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	public String listStudent() {
		return "studentlist";
	}
	
	@RequestMapping(value = {"/detail","/detail/{id}" }, method = RequestMethod.GET)
	public String listStudent(@PathVariable String id) {
		if(id.length() <= 0){
			// You have to fetch student with id from the repository using the student service
		}
		return "studentdetail";
	}
}
