package com.aurora.crms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "Course")
public class Course {
	
	@Id @NotNull
	@Column(name="Corse_Code")
	private String courseId;

	@NotNull
	@Size(min = 3, max = 30)
	@Column(name="Course_Name")
	private String courseName;
	
	@Column(name="Credit_Hour")
	@NotNull
	private String creditHour;

	@Column(name="Description")
	private String courseDescription;
	
	@Column(name = "Is_Trashed")
	private boolean isTrashed = false;
	
	@NotNull
    @Column(name = "Trashed_Date")
    private Date trashedDate;
    
    @Column(name = "Is_Active")
    private boolean isActive = true;
    
    @Column(name = "Activate_Date")
    private Date activeDate;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCreditHour() {
		return creditHour;
	}

	public void setCreditHour(String creditHour) {
		this.creditHour = creditHour;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
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
}

