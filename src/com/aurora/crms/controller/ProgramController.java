package com.aurora.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/program")
public class ProgramController {
	@Autowired
	
	
	@RequestMapping("/program_form")
	public String getProgramForm(){
		return "ProgramForm";
	}
	
	
	@RequestMapping("/save_program")
	public String saveProgram(){
		return "ProgramDetail";
	}

}
