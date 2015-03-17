package com.aurora.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/insistiution")
public class InsistiutionController {
	
	@RequestMapping("/")
	public String institutionForm(){
		return "";
	}

}
