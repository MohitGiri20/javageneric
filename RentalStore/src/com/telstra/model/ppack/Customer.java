package com.telstra.model.ppack;

public class Customer {
	
	private int custId;
	private String custName;
	private String email;
	private String pass;
	
	Address address;

	public Customer(int custId, String custName, String email, String pass, Address address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.pass = pass;
		this.address = address;
	}
	
	

	public int getCustId() {
		return custId;
	}



	public String getCustName() {
		return custName;
	}



	public String getEmail() {
		return email;
	}



	public String getPass() {
		return pass;
	}



	public Address getAddress() {
		return address;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", pass=" + pass
				+ ", address=" + address + "]";
	}
    
	
	
	
}
