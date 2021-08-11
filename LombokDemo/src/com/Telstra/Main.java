package com.Telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.setPId(101);
		p.setAge(23);
		p.setPName("Mohan");
		
		System.out.println(p);
		
		
		Customer c = new Customer(101,22,"Mg",900000);
		System.out.println(c.getAge());
	}

}
