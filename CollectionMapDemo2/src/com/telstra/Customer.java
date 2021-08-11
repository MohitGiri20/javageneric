package com.telstra;

import java.util.Comparator;

public class Customer implements Comparator<Customer>{
	
	private int id;
	private String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		
		return o1.name.compareTo(o2.name);
	}
	
	

}
