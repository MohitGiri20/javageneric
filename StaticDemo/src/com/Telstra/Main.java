package com.Telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Person p1 = new Person(1,"mg",21);
		Person p2 = new Person(2,"MG",21);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(Person.getCount());
		
	}

}
