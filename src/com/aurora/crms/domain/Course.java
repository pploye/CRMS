package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "Course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	
	@NotNull
	@Size(min=3, max=30) 
	private String name;
	

	private String description;
	
	@Future
	private Date startDate;
	
	@Future
	private Date endDate;

	@ManyToMany()
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
	private List<Course> courses;

	@ManyToMany()
	@JoinTable(name = "COURSE_PROGRAM", joinColumns = { @JoinColumn(name = "COURSE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PROGRAM_ID") })
	private Set<Program> programs;

	@ManyToMany()
	@JoinTable(name = "COURSE_PROFESSOR", joinColumns = { @JoinColumn(name = "COURSE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PROFESSOR_ID") })
	private List<Professor> professors;

	public Set<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public int getCourseId() {

		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
