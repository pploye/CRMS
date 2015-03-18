package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@Id
	private String studentId;
	
	@NotNull
	@Size(min = 3, max = 30, message = "Your first name should be between {min} and {max} characters")
	@Pattern(regexp = "[^0-9]*", message = "Should not include digits")
	private String firstName;
	
	@Size(min = 3, max = 30)
	private String lastName;
	
	@Size(min = 1)
	private String gender;
	
	@Past
	@NotNull
	private Date dateOfBirth;
	
	@ManyToOne
	@JoinColumn(name = "PROGRAM_ID")
	private Program program;
	
	@OneToMany(mappedBy = "student")
	private List<Address> addresses;
	
	@ManyToOne
	@JoinColumn(name = "DEPT_ID")
	private Department department;
	
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

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
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

	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(List<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
}
