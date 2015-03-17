package com.aurora.crms.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Institution {

	@Id
	private String Code;
	
	@NotEmpty(message="Enter the Institution name")
	private String Name;
	
	@NotNull
	private Date dateEstablished;
	
	@NotEmpty(message="Enter the Owner's name")
	private String Owner;
	
	private String Vision;
	
	@OneToMany(mappedBy ="institute")
	private List<Address> addresses;

	
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDateEstablished() {
		return dateEstablished;
	}

	public void setDateEstablished(Date dateEstablished) {
		this.dateEstablished = dateEstablished;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public String getVision() {
		return Vision;
	}

	public void setVision(String vision) {
		Vision = vision;
	}



	public String getInstitutionCode() {
		return Code;
	}

	public void setInstitutionCode(String institutionCode) {
		this.Code = institutionCode;
	}

	public String getInstitutionName() {
		return Name;
	}

	public void setInstitutionName(String institutionName) {
		this.Name = institutionName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
