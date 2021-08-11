package com.telstra;

public class Address {
	
	String houseNo;
	String city;
	String state;
	String country;
	int pinCode;
	public Address(String houseNo, String city, String state, String country, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pinCode=" + pinCode + "]";
	}
	
	
	

}
