package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "Student")
public class Student {
	@NotEmpty
	@Id @Column(name="Student_Code")
	@NotNull
	private String studentId;
	
	@NotNull
	@Size(min = 3, max = 50, message = "Your first name should be between {min} and {max} characters")
	@Pattern(regexp = "[^0-9]*", message = "Should not include digits")
	@Column(name="First_Name")
	private String firstName;
	
	@NotNull
	@Size(min = 3, max = 50)
	@Column(name="Last_Name")
	private String lastName;
	
	@Size(min = 1)
	@NotNull
	@Column(name="Gender")
	private String gender;
	
	@Past
	@NotNull
	@Column(name="Date_Of_Birth")
	private Date dateOfBirth;
	
	@ManyToOne
	@JoinColumn(name = "PROGRAM_ID")
	private Program program;
	
	@OneToMany(mappedBy = "student")
	private List<Address> addresses;
	
	@ManyToOne
	@JoinColumn(name = "DEPT_ID")
	private Department department;
	
	@Column(name="Is_Trashed")
	private boolean isTrashed;
	
	@NotNull
	@Column(name="Trashed_Date")
	private Date trashedDate;
	
	@Column(name="Is_Active")
	private boolean isActive;
	
	@Column(name="Active_Date")
	private Date activeDate;
	

	@ManyToMany
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
	private List<Course> registeredCourses;


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
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


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Program getProgram() {
		return program;
	}


	public void setProgram(Program program) {
		this.program = program;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public boolean isTrashed() {
		return isTrashed;
	}


	public void setTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}


	public Date getTrashedDate() {
		return trashedDate;
	}


	public void setTrashedDate(Date trashedDate) {
		this.trashedDate = trashedDate;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public Date getActiveDate() {
		return activeDate;
	}


	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}


	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}


	public void setRegisteredCourses(List<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}

	
}
