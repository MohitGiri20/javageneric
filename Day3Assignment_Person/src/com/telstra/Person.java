package com.telstra;

public class Person {
	
	static int pId;
	String pName;
	Address address;
	
    static {
       pId = 0;
    }

	public Person(String pName, Address address) {
		super();
		this.pName = pName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
