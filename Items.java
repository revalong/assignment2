package com.fmt;

public class Items{
	private String code;
	private String type;
	private String unit;
	private String price;
	
	
	
	public Items(String code, String type, String unit, String price) {
		super();
		this.code = code;
		this.type = type;
		this.unit = unit;
		this.price = price;
	}


	public String getCode() {
		return code;
	}

	public String getType() {
		return type;
	}

	public String getUnit() {
		return unit;
	}


	public String getPrice() {
		return price;
	}

	public String toString() {
		return null;
	}
} 
