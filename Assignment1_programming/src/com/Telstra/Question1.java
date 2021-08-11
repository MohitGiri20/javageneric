package com.Telstra;
import java.util.Scanner;
public class Question1 {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.	 Finding a prime number
		
		System.out.println("Enter the number:");
       
		int num = scn.nextInt();
		
		//boolean isPrime = checkPrime(num);
		boolean isPrimeOpti= checkPrimeOpti(num);
		
		//System.out.println(isPrime);
		System.out.println(isPrimeOpti== true ? "It is a prime number" : "It is not a prime number");
	}
	
	public static boolean checkPrime(int num) {
		
		if(num<=1) return false;
		
		if(num == 2)return true;
		
		for(int i=2;i<num;i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkPrimeOpti(int num) {
		
		if(num<=1) return false;
		
		if(num == 2)return true;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	

}
