package com.aurora.crms.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
	
	@Column(name="Is_Trashed")
	private boolean isTrashed;
	
	@NotNull
	@Column(name="Trashed_Date")
	private Date trashedDate;
	
	@Column(name="Is_Active")
	private boolean isActive;
	
	@Column(name="Active_Date")
	private Date activeDate;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Address", joinColumns = { @JoinColumn(name = "Student_Code") }, inverseJoinColumns = { @JoinColumn(name = "Address_Code")})
	private Set<Address> addresses;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course", joinColumns = { @JoinColumn(name = "Student_Code") }, inverseJoinColumns = { @JoinColumn(name = "Course_Code")})
	private Set<Course> courses;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_Name")
	private User user;

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

	public boolean getIsTrashed() {
		return isTrashed;
	}

	public void setIsTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}

	public Date getTrashedDate() {
		return trashedDate;
	}

	public void setTrashedDate(Date trashedDate) {
		this.trashedDate = trashedDate;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
