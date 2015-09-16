package com.jesuswalk.jwService.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity
public class Contact {

	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String cellPhone;
	private String homePhone;
	private String email;
	
}
