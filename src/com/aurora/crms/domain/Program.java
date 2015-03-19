package com.aurora.crms.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Program_Department", joinColumns = { @JoinColumn(name = "Program_Code") }, inverseJoinColumns = { @JoinColumn(name = "Department_Code")})
	private Set<Department> departments;

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

	public boolean getIsTrashed() {
		return isTrashed;
	}

	public void setIsTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
	}

	public boolean getTrashedDate() {
		return trashedDate;
	}

	public void setTrashedDate(boolean trashedDate) {
		this.trashedDate = trashedDate;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(boolean activeDate) {
		this.activeDate = activeDate;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	
}