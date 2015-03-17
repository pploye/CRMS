package com.aurora.crms.domain;

import java.util.List;

import javax.persistence.OneToMany;

public class Program {
	
	
	private String name;
	private String description;
	@OneToMany(mappedBy="program")
	List <Student> student;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
