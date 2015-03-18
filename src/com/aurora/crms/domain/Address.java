package com.aurora.crms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity(name = "Address")
public class Address {
	@Id
	@NotNull
	@Column(name = "Address_Code")
	private String addressCode;
    
    @Size(min = 2, max = 2, message = "Size.Address.State")
    @Column(name = "State")
    private String state;
    
    @Size(min = 2, max = 2, message = "Size.Address.Street")
    @Column(name = "Street")
	private String street;
    
    @Size(min = 2, max = 2, message = "Size.Address.City")
    @Column(name = "City")
    private String city;
    
    @NotNull
    @Size(min = 2, max = 2, message = "Size.Address.Country")
    @Column(name = "Country")
    private String country;
    
    @Pattern(regexp = "^\\d{5}(-\\d{4})?$", message = "{Pattern.zipcode}")
    @Column(name = "Zip_Code")
    private String zipCode;
    
    @Email
    @Column(name = "Email")
    private String Email;
    
    @Column(name = "Website")
    private String website;
    
    @Column(name = "Phone_Number")
    private String phoneNumber;
    
    @Column(name = "Is_Cell")
    private boolean isCell = false;
    
    @Column(name = "Is_Trashed")
    private boolean isTrashed = false;
    
    @Column(name = "Trashed_Date")
    private Date trashedDate;
    
    @Column(name = "Is_Active")
    private boolean isActive = true;
    
    @Column(name = "Activate_Date")
    private Date activeDate;
    
    @Column(name = "Fax")
    private String Fax;
    
    // Relationship
    @ManyToOne
	@JoinColumn(name = "INSTITUTE_ID")
	private Institution institute;

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isCell() {
		return isCell;
	}

	public void setCell(boolean isCell) {
		this.isCell = isCell;
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

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public Institution getInstitute() {
		return institute;
	}

	public void setInstitute(Institution institute) {
		this.institute = institute;
	}
}
