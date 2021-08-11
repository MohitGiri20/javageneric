package com.Telstra;

import java.util.Scanner;

public class Question5 {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5.     Find the sum odd place values in a  given number(335421   ----> 3+5+2 =  10 )
		
		System.out.println("Enter the number:");
	       
		int num = scn.nextInt();
		
		int sum = findOddPlaceSum(num);
		
		
		System.out.println("Sum of odd place values for the given number is " + sum);
	
		
		     

	}
	
	public static int findOddPlaceSum(int num) {
		
		int sum=0;
		
		int count = 0;
		while(num >0 ) {
			
			int rem = num % 10;
			
			if(count % 2 !=0) {
				sum+= rem;
			}
			count++;
			num = num / 10;
		}
		
		return sum;
		
	}

}
