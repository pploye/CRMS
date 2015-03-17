package com.aurora.crms.domain;

import java.util.List;

import javax.persistence.OneToMany;

public class Department {
	
	private String name;
	private String description;
	@OneToMany(mappedBy="department")
	private List <Student> students;
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
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
