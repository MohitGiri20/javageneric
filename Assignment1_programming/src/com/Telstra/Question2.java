package com.Telstra;

import java.util.Scanner;

public class Question2 {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//2.	To find whether a number is Armstrong number 
		
		System.out.println("Enter the number:");
	       
		int num = scn.nextInt();
		
		boolean isArmstrong = checkArmstrong(num);
		
		System.out.println(isArmstrong== true ? "It is an armstrong number" : "It is not an armstrong number");
	}
	
	public static boolean checkArmstrong(int num) {
		
		int n =num;
		
		int armstrong=0;
		while(num>0) {
			
			int rem = num % 10;
			armstrong+= Math.pow(rem,3);
			num = num / 10;
		}
		
		return armstrong == n ? true : false;
	}

}
