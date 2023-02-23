package com.fmt;

public class Persons{
	private String code;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String cip;
	private String country;
	
	
	public String getCode() {
		return code;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getCip() {
		return cip;
	}


	public String getCountry() {
		return country;
	}


	public Persons(String code, String firstName, String lastName, String street, String city, String state, String cip,
			String country) {
		super();
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.cip = cip;
		this.country = country;
	}


	public String toString() {
		return null;
		
	}
	
	
	
	
	
}
