package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Student {
	
	@NotEmpty
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
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
	@ManyToOne@JoinColumn(name="PROGRAM_ID")
	private Program program;
	@Email
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(mappedBy="student")
	private List <Address> addresses;
	
	@ManyToOne 
	@JoinColumn(name="DEPT_ID")
	private Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private List <Course> registeredCourses;
	

	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
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
