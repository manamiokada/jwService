package com.jesuswalk.jwService.model;

import java.util.Date;
import java.util.List;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.bson.types.ObjectId;

@Entity
public class Person {

	@Id private ObjectId PersonID;
	
	private String firstName;
	private String lastName;
	private String grade;
	private int age;
	private Date birthdate;
	private String shirtSize;
	private boolean registered;
	
	//@Embedded
	//private Contact contact;
	
	//@Embedded
	//private List<BaseRole> roles;
	
	
	public ObjectId getPersonID() {
		return PersonID;
	}

	public void setPersonID(ObjectId personID) {
		PersonID = personID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getShirtSize() {
		return shirtSize;
	}

	public void setShirtSize(String shirtSize) {
		this.shirtSize = shirtSize;
	}

	/*public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<BaseRole> getRoles() {
		return roles;
	}

	public void setRoles(List<BaseRole> roles) {
		this.roles = roles;
	}*/

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
}
