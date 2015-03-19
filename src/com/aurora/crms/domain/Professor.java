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
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity(name = "Professor")
public class Professor {
	
	@Id @NotNull @Column(name="Professor_Code")
	private String professorCode;
	
	@Column(name="First_Name") @Size(min=3, max=30) 
	private String firstName;
	
	@Size(min=3, max=30) @Column(name= "Last_Name")
	private String lastName;
	
	@Size(min=1) @Column(name ="Gender")
	private String gender;
	
	@Column(name="Date_Of_Birth")
	private Date dateOfBirth;
	
	@Null @Column(name = "Title")
	private String title;
	
	@Null @Size(min=3, max=100) @Column(name = "Education_Level")
	private String educationLevel;
	
	@Column(name ="Is_Trashed")
	private boolean isTrashed;
	
	@NotNull @Column(name ="Trashed_Date")
	private Date trashedDate;
	
	@Column(name = "Is_Active")
	private boolean isActive;
	
	@Column(name ="Active_Date")
	private Date activeDate;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Professor_Address", joinColumns = { @JoinColumn(name = "Professor_Code") }, inverseJoinColumns = { @JoinColumn(name = "Address_Code")})
	private Set<Address> address;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Professor_Course", joinColumns = { @JoinColumn(name = "Professor_Code") }, inverseJoinColumns = { @JoinColumn(name = "Course_Code")})
	private Set<Course> courses;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_Name")
	private User user;

	public String getProfessorCode() {
		return professorCode;
	}

	public void setProfessorCode(String professorCode) {
		this.professorCode = professorCode;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean getIsTrashed() {
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

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
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