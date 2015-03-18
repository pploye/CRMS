package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity(name = "Institution")
public class Institution {

	@Id
	private String institutionCode;

	@NotEmpty(message = "Enter the Institution name")
	private String institutionName;

	private Date dateEstablished;
	private String institutionOwner;
	private String institutionVision;

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

	public Date getDateEstablished() {
		return dateEstablished;
	}

	public void setDateEstablished(Date dateEstablished) {
		this.dateEstablished = dateEstablished;
	}

	public String getInstitutionOwner() {
		return institutionOwner;
	}

	public void setInstitutionOwner(String institutionOwner) {
		this.institutionOwner = institutionOwner;
	}

	public String getInstitutionVision() {
		return institutionVision;
	}

	public void setInstitutionVision(String institutionVision) {
		this.institutionVision = institutionVision;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
