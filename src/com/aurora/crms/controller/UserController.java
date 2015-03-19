package com.aurora.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aurora.crms.service.IUser;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUser userService;

}
