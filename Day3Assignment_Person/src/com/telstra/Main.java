package com.telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int count =0;
		
		Address a1 = new Address("D-58","Delhi","Delhi","India",110085);
		Address a2 = new Address("D-59","Gurugram","Haryana","India",573898);
		
		Person p1 = new Person("Manan",a1);
		Person.pId = ++count;
		System.out.println(p1.toString());
		
		Person p2 = new Person("Mohan",a2);
		Person.pId = ++count;
        System.out.println(p2.toString());
	}

}
