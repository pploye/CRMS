package com.aurora.crms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Accademic_Year")
public class AccademicYear {
	
	@Id
	@Column(name = "Accadamic_Year_Code")
	private String accadamicYearCode;

    @Column(name = "Name")
	private String name;
    
    @Column(name = "Description")
	private String description;
    
    @Column(name = "Start_Date")
	private Date startDate;
    
    @Column(name = "End_Date")
	private Date endDate;
    
    @Column( name = "Is_Trashed")
    private boolean isTrashed;
    
    @Column( name = "Trashed_Date")
    private boolean trashedDate;
    
    @Column( name = "Is_Active")
    private boolean isActive;
    
    @Column( name = "Active_Date")
    private boolean activeDate;

	public String getAccadamicYearCode() {
		return accadamicYearCode;
	}

	public void setAccadamicYearCode(String accadamicYearCode) {
		this.accadamicYearCode = accadamicYearCode;
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
}
