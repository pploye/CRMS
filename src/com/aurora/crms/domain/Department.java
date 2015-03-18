package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany(mappedBy = "department")
	private List<Student> students;

	@OneToMany(mappedBy = "department")
	private List<Professor> professors;

	public String getDepartmentId() {
		return departmentCode;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentCode = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return description;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.description = departmentDescription;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}
}