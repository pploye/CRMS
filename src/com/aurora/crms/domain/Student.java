package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	@NotEmpty
	private String sId;
	@NotNull
	@Size(min=3, max=30, message="Your first name should be between {min} and {max} characters")
	@Pattern(regexp="[^0-9]*", message="Should not include digits")
	private String sFirstName;
	@Size(min=3, max=30)
	private String sLastName;
	private String gender;
	@Past
	private Date dateOfBirth;
	
	private Address address;
	
	private List <Course> registeredCourses;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(List<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
	public void setsId(String sId) {
		this.sId = sId;
	}
	
	public String getsFirstName() {
		return sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
}
