package com.aurora.crms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name = "Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String street;
	@NotNull
	private String city;
	@Size(min=2, max=2, message="Size.Address.state")
	private String state;
	
	@Pattern(regexp="^\\d{5}(-\\d{4})?$",message="{Pattern.zipcode}")
	private String zipCode;
	
	@ManyToOne
	@JoinColumn(name= "INSTITUTE_ID")
	private Institution institute;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Institution getInstitute() {
		return institute;
	}

	public void setInstitute(Institution institute) {
		this.institute = institute;
	}

}
