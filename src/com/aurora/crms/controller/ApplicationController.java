package com.aurora.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/")
@SessionAttributes("User")
public class ApplicationController {
	
	@RequestMapping("/")
	public String init(){
		return "Welcome";
	}
	
}
