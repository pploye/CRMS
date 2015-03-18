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

	private String mission;
	private String vision;
	private String pageName;
	private String logoPath;
	private Date establishmentDate; 

	@OneToMany(mappedBy = "institute")
	private List<Address> addresses;
}