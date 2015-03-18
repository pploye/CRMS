package com.aurora.crms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity(name = "Professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String professorId;
	@Size(min=3, max=30) 
	private String firstName;
	@Size(min=3, max=30) 
	private String lastName;
	@Size(min=1)
	private String gender;
	@Size(min=3, max=100) 
	private String educationLevel;
	
	@ManyToOne 
	@JoinColumn(name="DEPT_ID")
	private Department department;

	public String getProfessorId() {
		return professorId;
	}

	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
