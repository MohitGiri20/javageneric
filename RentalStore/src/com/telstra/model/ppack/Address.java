package com.telstra.model.ppack;

public class Address {
	
	private String city;
	private String state;
	private String country;
	private int zip;
	public Address(String city, String state, String country, int zip) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zip=" + zip + "]";
	}
	
	

}
