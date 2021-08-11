package com.Telstra;

import java.util.Random;

public class Person {
	
	private int pId;
	private String pName;
	private int pAge;
	
	private static int count;
	
	static {
		count =0;
	}
	
	public static int getCount() {
		
		Random rand  = new Random();
		count  = rand.nextInt(100) + 1;
		
		return count;
		//return count++;
	}
	
	public Person(int pId, String pName, int pAge) {
		super();
		this.pId = getCount();
		this.pName = pName;
		this.pAge = pAge;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + "]";
	}
	
	

}
