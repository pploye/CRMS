package com.aurora.crms.domain;

import java.util.Date;

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
	
	@Column(name = "Registration_Date")
	private Date registrationDate;
	
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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public boolean getIsTrahed() {
		return isTrahed;
	}

	public void setIsTrahed(boolean isTrahed) {
		this.isTrahed = isTrahed;
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
