package com.aurora.crms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aurora.crms.domain.Program;
import com.aurora.crms.service.IProgram;

@Controller
@RequestMapping("/program")
public class ProgramController {
	@Autowired
	IProgram program;
	
	@RequestMapping(value = {"/","/addProgram"} , method = RequestMethod.GET)
	public String getProgramForm(@ModelAttribute("newProgram") Program NewProgram, Model model){
		return "addProgram";
	}
	
	
	@RequestMapping( value = "/addProgram" , method = RequestMethod.POST)
	public String saveProgram(@Valid @ModelAttribute("newProgram") Program NewProgram ,BindingResult result){
		if(result.hasErrors()){
			return "addProgram";
		}
		
	this.program.saveProgram(NewProgram);
		return "redirect : /ProgramDetail";
	}

}
