package com.aurora.crms.domain;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Address {
	private String addressCode;
	
	@ManyToOne
	@JoinColumn(name="STUDID")
	private Student student;

	public String getAddressCode() {
		return addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	private String cellPhone;

}
