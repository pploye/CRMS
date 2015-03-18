package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "Institution")
public class Institution {
	
	@Id
	@NotNull
	@Column(name="Institution_Code")
	private String institutionCode;

	@NotNull
	@NotEmpty(message = "Enter the Institution name")
	@Column(name="Institution_Name")
	private String institutionName;

	@Column(name="Mission")
	private String mission;
	
	@Column(name="Vision")
	private String vision;
	
	@NotNull
	@Column(name="Page_Name")
	private String pageName;
	
	@Column(name="Logo_Path")
	private String logoPath;
	
	@NotNull
	@Column(name="Establishment_Date")
	private Date establishmentDate;
	
	@NotNull
	@Column(name="Registration_Date")
	private Date registrationDate;
	
	@Column(name="Is_Trashed")
	private boolean isTrashed;
	
	@NotNull
	@Column(name="Trashed_Date")
	private Date trashedDate;
	
	@Column(name="Is_Active")
	private boolean isActive;
	
	@Column(name="Active_Date")
	private Date activeDate;
	
	@OneToMany(mappedBy = "institute")
	private List<Address> addresses;


	public String getInstitutionCode() {
		return institutionCode;
	}


	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}


	public String getInstitutionName() {
		return institutionName;
	}


	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}


	public String getMission() {
		return mission;
	}


	public void setMission(String mission) {
		this.mission = mission;
	}


	public String getVision() {
		return vision;
	}


	public void setVision(String vision) {
		this.vision = vision;
	}


	public String getPageName() {
		return pageName;
	}


	public void setPageName(String pageName) {
		this.pageName = pageName;
	}


	public String getLogoPath() {
		return logoPath;
	}


	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}


	public Date getEstablishmentDate() {
		return establishmentDate;
	}


	public void setEstablishmentDate(Date establishmentDate) {
		this.establishmentDate = establishmentDate;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	public boolean isTrashed() {
		return isTrashed;
	}


	public void setTrashed(boolean isTrashed) {
		this.isTrashed = isTrashed;
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


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}

