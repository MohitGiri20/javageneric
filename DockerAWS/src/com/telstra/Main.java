package com.telstra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scn = new Scanner(System.in);
		
		ArrayList<Items> arr= new ArrayList<Items>();
		
		System.out.println("Enter number of items");
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter the item details:");
			
			System.out.println("Enter item name");
			String itemName = scn.next();
			
			System.out.println("Enter item price");
			float itemPrice = scn.nextFloat();
			
			System.out.println("Enter item quantity");
			int itemQuantity = scn.nextInt();
			
			arr.add(new Items(itemName,itemPrice,itemQuantity));
		
		}
		
		for(Items item : arr) {
			System.out.println(item);
		}
		
		
		
		
		
		
	
	}

}
