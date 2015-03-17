package com.aurora.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/")
@SessionAttributes({"User","University"})
public class ApplicationController {
	
	@RequestMapping("/")
	public String init(){
		return "Welcome";
	}
	
	@RequestMapping(value = {"/template"}, method = RequestMethod.GET)
	public String template(){
		return "Template";
	}
	
}
