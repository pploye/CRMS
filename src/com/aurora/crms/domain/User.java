package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
public class User {
	
	@Id
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Description")
    private String description;
	
	@Column(name = "Registration_Date")
	private Date registrationDate;
	
	@Column(name = "Institution_Code")
	private List<Institution> institution;
	@Column(name = "User_Code")
    private String userCode;
	
	@Column(name ="Is_Trashed")
	private boolean isTrahed;
	
	@Column(name ="Trashed_Date")
	private Date trashedDate;
	
	@Column(name ="Is_Active")
	private boolean isActive;
	
	@Column(name ="Trashed_Date")
	private Date activeDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<Institution> getInstitution() {
		return institution;
	}

	public void setInstitution(List<Institution> institution) {
		this.institution = institution;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public boolean isTrahed() {
		return isTrahed;
	}

	public void setTrahed(boolean isTrahed) {
		this.isTrahed = isTrahed;
	}

	public Date getTrashedDate() {
		return trashedDate;
	}

	public void setTrashedDate(Date trashedDate) {
		this.trashedDate = trashedDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}
}
