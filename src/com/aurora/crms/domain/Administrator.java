package com.aurora.crms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class Administrator {
    
    @NotNull
    @Id
    @Column(name="Admin_Code")
    private String adminCode;
	
	@NotNull
	@Column(name="First_Name")
	private String firstName;
	
	@NotNull
	@Column(name="Last_Name")
	private String lastName;
	
	@NotNull
	@Column(name="Gender")
	private String gender;
	
	@NotNull
	@Column(name="Date_Of_Birth")
	private Date dateOfBirth;
	
	@Column(name="Is_Trashed")
	private boolean isTrashed;
	
	@NotNull
	@Column(name="Trashed_Date")
	private Date trashedDate;
	
	@Column(name="Is_Active")
	private boolean isActive;
	
	@Column(name="Active_Date")
	private Date activeDate;
	
	@NotNull
	@OneToOne(fetch = FetchType.LAZY)
	@Column(name="User_Name")
	private User user;

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
