package com.udemy.model;

public class ContactModel {

	private int id;
	private String firstname;
	private String lastName;
	private String telephone;
	private String city;
	
	public ContactModel() {
		
	}
	
	public ContactModel(int id, String firstname, String lastName, String telephone, String city) {
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.telephone = telephone;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", telephone="
				+ telephone + ", city=" + city + "]";
	}	
	
}
