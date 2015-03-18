package com.aurora.crms.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name = "Program")
public class Program {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String programId;
	@Column(name = "Name")
	private String programTitle;
	private String description;

	@OneToMany(mappedBy = "program")
	List<Student> student;

	@ManyToMany()
	@JoinTable(name = "PROGRAM_ACCADEMICYEAR", joinColumns = { @JoinColumn(name = "PROGRAM_ID") }, inverseJoinColumns = { @JoinColumn(name = "ACCADEMICYEAR_ID") })
	private List<AccademicYear> accademicYears;

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}

	public String getProgramTitle() {
		return programTitle;
	}

	public void setProgramTitle(String programTitle) {
		this.programTitle = programTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<AccademicYear> getAccademicYears() {
		return accademicYears;
	}

	public void setAccademicYears(List<AccademicYear> accademicYears) {
		this.accademicYears = accademicYears;
	}
}