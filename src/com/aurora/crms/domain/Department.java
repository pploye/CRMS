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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "Department")
public class Department {

	@Id
	@NotNull
	@Column(name = "Department_Code")
	private String departmentCode;

	@Size(min = 3, max = 30)
	@Column(name = "Department_Name")
	private String departmentName;

	@Column(name = "Description")
	private String description;

	@Column(name = "Is_Trashed")
	private boolean isTrashed;

	@Column(name = "Trashed_Date")
	private Date Trashed_Date;

	@Column(name = "Is_Active")
	private boolean isActive;

	@Column(name = "Active_Date")
	private Date activeDate;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Department_Student", joinColumns = { @JoinColumn(name = "Department_Code") }, inverseJoinColumns = { @JoinColumn(name = "Student_Code")})
	private Set<Student> students;
    
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Department_Professor", joinColumns = { @JoinColumn(name = "Department_Code") }, inverseJoinColumns = { @JoinColumn(name = "Professor_Code")})
	private Set<Professor> professors;
    
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Department_Course", joinColumns = { @JoinColumn(name = "Department_Code") }, inverseJoinColumns = { @JoinColumn(name = "Course_Code")})
	private Set<Course> courses;

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getIsTrashed() {
		return isTrashed;
	}

	public void setIsTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}

	public Date getTrashed_Date() {
		return Trashed_Date;
	}

	public void setTrashed_Date(Date trashed_Date) {
		Trashed_Date = trashed_Date;
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

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(Set<Professor> professors) {
		this.professors = professors;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
}
