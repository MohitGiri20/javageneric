package com.Telstra;
import java.util.Scanner;

public class Main {
	
	 public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int len = Integer.parseInt(args[0]);
		int [] arr = new int[len];
		
		System.out.println("Enter the element in array:");
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			sum+=arr[i];
		}
	
		
		System.out.println(sum);
		
		int min = MinElement(arr);
		System.out.println(min);
		
		
		
	}
	
	public static int MinElement(int [] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
