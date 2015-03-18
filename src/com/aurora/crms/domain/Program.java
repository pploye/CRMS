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
	@Column(name = "Program_Code")
	private String programCode;
	
	@Column(name = "Program_Name")
	private String programName;
	
	@Column(name = "Program_Title")
	private String programTitle;
	
	@Column(name = "Description")
	private String description;

	@Column( name = "Is_Trashed")
    private boolean isTrashed;
    
    @Column( name = "Trashed_Date")
    private boolean trashedDate;
    
    @Column( name = "Is_Active")
    private boolean isActive;
    
    @Column( name = "Active_Date")
    private boolean activeDate;
	
	@OneToMany(mappedBy = "program")
	List<Student> student;

	@ManyToMany()
	@JoinTable(name = "PROGRAM_ACCADEMICYEAR", joinColumns = { @JoinColumn(name = "PROGRAM_ID") }, inverseJoinColumns = { @JoinColumn(name = "ACCADEMICYEAR_ID") })
	private List<AccademicYear> accademicYears;

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
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

	public boolean isTrashed() {
		return isTrashed;
	}

	public void setTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}

	public boolean isTrashedDate() {
		return trashedDate;
	}

	public void setTrashedDate(boolean trashedDate) {
		this.trashedDate = trashedDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isActiveDate() {
		return activeDate;
	}

	public void setActiveDate(boolean activeDate) {
		this.activeDate = activeDate;
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