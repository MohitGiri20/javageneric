package com.telstra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the price of item:");
		float p = scn.nextFloat();
		
		System.out.println("Enter the discount amount on this item");
		float d = scn.nextFloat();
		
		if(d>p) {
			System.out.println("Invalid discount");
		    return;
		}
		
		System.out.println("Discount percentage is:");
		
		float percd = (d/p) *100;
		
		System.out.println(percd + "%");
		System.out.println("You pay Rs: " + (p - d));
		
	}

}
