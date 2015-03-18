package com.aurora.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/insistiution")
public class InsistiutionController {
	
	@RequestMapping("/institution_form")
	public String getInstitutionForm(){
		return "InstitutionForm";
	}
	
	
	@RequestMapping("/save_institution")
	public String saveInstitute(){
		return "InstitutionDetail";
	}

}
