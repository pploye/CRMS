package com.aurora.crms.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity(name = "Department")
public class Department {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Size(min=3, max=30) 
	private String name;
	private String description;

	@OneToMany(mappedBy = "department")
	private List<Student> students;
	
	@OneToMany(mappedBy = "department")
	private List <Professor> professors;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
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
