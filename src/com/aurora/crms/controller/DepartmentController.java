package com.aurora.crms.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aurora.crms.domain.Course;
import com.aurora.crms.domain.Department;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	@RequestMapping(value = {"/","/add" }, method = RequestMethod.GET)
	public String addDepartment(@ModelAttribute Department department	) {
		return "addDepartmentTile"; // This should match the tile definition name
	}

	@RequestMapping(value = {"/edit" }, method = RequestMethod.POST)
	public String editDepartment(@Valid Department department, BindingResult result) {
		if (result.hasErrors())
			return "editDepartmentTile";
		return "departmentDetailTile";
	}
	
	@RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	public String listStudent() {
		return "departmentListTile";
	}
	
	@RequestMapping(value = {"/detail","/detail/{id}" }, method = RequestMethod.GET)
	public String listStudent(@PathVariable String id) {
		if(id.length() <= 0){
			// You have to fetch student with id from the repository using the student service
		}
		return "departmentDetailTile";
	}
}
