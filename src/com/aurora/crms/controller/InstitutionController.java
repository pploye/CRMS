package com.aurora.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aurora.crms.service.IInstitution;

@Controller
@RequestMapping("/insistiution")
public class InstitutionController{
	
	@Autowired
	IInstitution institutionService;
	
	@RequestMapping("/institution_form")
	public String getInstitutionForm(){
		return "InstitutionForm";
	}
	
	@RequestMapping("/save_institution")
	public String saveInstitute(){
		return "InstitutionDetail";
	}
}
