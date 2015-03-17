package com.aurora.crms.domain;

import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "Program")
public class Program {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String description;

	@OneToMany(mappedBy = "program")
	List<Student> student;

	@ManyToMany()
	@JoinTable(name = "PROGRAM_ACCADEMICYEAR", joinColumns = { @JoinColumn(name = "PROGRAM_ID") }, inverseJoinColumns = { @JoinColumn(name = "ACCADEMICYEAR_ID") })
	private List<AccademicYear> accademicYears;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<AccademicYear> getAccademicYears() {
		return accademicYears;
	}

	public void setAccademicYears(List<AccademicYear> accademicYears) {
		this.accademicYears = accademicYears;
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

}
