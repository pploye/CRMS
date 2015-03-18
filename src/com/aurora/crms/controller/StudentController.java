package com.aurora.crms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aurora.crms.domain.Student;
import com.aurora.crms.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired IStudentService studentservice;

<<<<<<< HEAD
	@RequestMapping(value = {"/","/profile" }, method = RequestMethod.GET)
	public String displayProfile(@ModelAttribute Student student) {
=======
	@RequestMapping(value = {"/","/profile"}, method = RequestMethod.GET)
	public String displayProfile(@ModelAttribute("student") Student student) {
>>>>>>> b2f6d366858c39c19fb9a60f00600d39b5abb5a4
		return "studentprofile"; // This should match the tile definition name
	}

	@RequestMapping(value = {"/profile" }, method = RequestMethod.POST)
<<<<<<< HEAD
	public String updateProfile(@Valid @ModelAttribute (value="studentInfo")Student student, BindingResult result) {
=======
	public String updateProfile(@Valid Student student, BindingResult result) {
>>>>>>> b2f6d366858c39c19fb9a60f00600d39b5abb5a4
		if (result.hasErrors())
			return "studentprofile";
		return "studentdetail";
	}
	
	@RequestMapping(value = {"/list" }, method = RequestMethod.GET)
<<<<<<< HEAD
	public String listStudent( Model model) {
		model.addAttribute("studentslist", studentservice.getAllStudents());
=======
	public String listStudent() {
>>>>>>> b2f6d366858c39c19fb9a60f00600d39b5abb5a4
		return "studentlist";
	}
	
	@RequestMapping(value = {"/detail","/detail/{id}" }, method = RequestMethod.GET)
<<<<<<< HEAD
	public String listStudent(@PathVariable String id, Model model) {
		if(id.length() <= 0){
			model.addAttribute("student", studentservice.getStudentById(id));
=======
	public String listStudent(@PathVariable String id) {
		if(id.length() <= 0){
>>>>>>> b2f6d366858c39c19fb9a60f00600d39b5abb5a4
			// You have to fetch student with id from the repository using the student service
		}
		return "studentdetail";
	}
}
