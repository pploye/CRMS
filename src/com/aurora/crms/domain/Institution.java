package com.aurora.crms.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Institution_Address", joinColumns = { @JoinColumn(name = "Institution_Code") }, inverseJoinColumns = { @JoinColumn(name = "Address_Code") })
	private Set<Address> addresss;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Institution_Program", joinColumns = { @JoinColumn(name = "Institution_Code") }, inverseJoinColumns = { @JoinColumn(name = "Program_Code", unique = true)})
	private Set<Program> programs;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Institution_Administrator", joinColumns = { @JoinColumn(name = "Institution_Code") }, inverseJoinColumns = { @JoinColumn(name = "Admin_Code", unique = true)})
	private Set<Administrator> administrators;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Institution_Professor", joinColumns = { @JoinColumn(name = "Institution_Code") }, inverseJoinColumns = { @JoinColumn(name = "Professor_Code", unique = true)})
	private Set<Professor> professors;

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

	public Set<Address> getAddresss() {
		return addresss;
	}

	public void setAddresss(Set<Address> addresss) {
		this.addresss = addresss;
	}

	public Set<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}

	public Set<Administrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Set<Administrator> administrators) {
		this.administrators = administrators;
	}
}

