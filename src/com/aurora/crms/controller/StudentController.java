package com.aurora.crms.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.aurora.crms.domain.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value = {"/","/profile"}, method = RequestMethod.GET)
	public String displayProfile(@ModelAttribute("student") Student student) {
		return "studentprofile"; // This should match the tile definition name
	}

	@RequestMapping(value = {"/profile"}, method = RequestMethod.POST)
	public String updateProfile(@ModelAttribute("student") @Valid Student student, BindingResult result) {
		if (result.hasErrors())
			return "StudentForm";
		return "SuccessfulUpdate";

	}
}
