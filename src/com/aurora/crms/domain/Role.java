package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Role {
	
	@NotNull
    @Id @Column(name = "User_Role_Code")
    private String userRoleCode;
	
	@NotNull
	@NotEmpty
	@Column(name = "Role_Name")
	private String roleName;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Is_Trashed")
	private boolean isTrashed;
	
	@NotNull
	@Column(name ="Trashed_Date")
	private Date trashedDate;
	
	@Column(name="Is_Active")
	private boolean isActive;
	
	@Column(name="Active_Date")
	private Date activeDate;
	
	@OneToMany
	@JoinColumn(name = "User_Role_Code", referencedColumnName = "User_Role_Code")
	private List<User> users;
	
    public String getUserRoleCode() {
		return userRoleCode;
	}

	public void setUserRoleCode(String userRoleCode) {
		this.userRoleCode = userRoleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
