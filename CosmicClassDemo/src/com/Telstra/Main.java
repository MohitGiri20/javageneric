package com.Telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Date1 d1 = new Date1(23,07,2021);
		Date1 d2 = new Date1(25,07,2021);
		Date1 d3 = new Date1(23,07,2021);
		
		    d1=d2;
			System.out.println(d1.equals(d2));
		 
			System.out.println(d1.equals(d3));
			
			System.out.println(d1.hashCode());
			System.out.println(d2.hashCode());
			System.out.println(d3.hashCode());
		
	}

}
