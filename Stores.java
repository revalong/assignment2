package com.fmt;

public class Stores{
	private String code;
	private String managerCode;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
		
	
	public Stores(String code, String managerCode, String street, String city, String state, String zip,
			String country) {
		super();
		this.code = code;
		this.managerCode = managerCode;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public String getManagerCode() {
		return managerCode;
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

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return null;
		
	}
	
}
