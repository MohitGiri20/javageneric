package com.Telstra;

import java.util.Scanner;

public class Hospital {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bid = (int)(Math.random() * 100) + 1;
		String bName;
		String bGender;
		double bWeight;
	
		
		
		System.out.println("Hospital Form");
	    
		System.out.println("Input Baby Details");
		
		System.out.println("Enter baby name:");
		bName = scn.next();
		
		System.out.println("Enter baby gender:");
		bGender = scn.next();
		
		System.out.println("Enter baby weight:");
		bWeight = scn.nextDouble();
		
		
		Baby b = new Baby(bid,bName,bGender,bWeight);
		
		
		String healthRepo1 = b.healthCondition(b.getWeight());
		
		System.out.println("Health Report from Fitness Center:" + healthRepo1);
		
		int fId1 = b.getfId();
		
		System.out.println("Detailed Report from Fitness Center");
		System.out.println("Fitness Center Id => FId:"+fId1);
		System.out.println(b.toString());
	


	}

}
