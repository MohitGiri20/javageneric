package com.Telstra;

public class Average {
	
	// ... defines an array of num of type int
	public static int avergae(int ...num) {
		
		int sum=0;
		
		for(int ele : num) {
			sum+=ele;
		}
		
		return (sum / num.length); 
	}
	
	public static double avergae1(double d,float f,int ...num) {
		
		int sum=0;
		
		for(int ele : num) {
			sum+=ele;
		}
		
		return (sum / num.length); 
	}

}
