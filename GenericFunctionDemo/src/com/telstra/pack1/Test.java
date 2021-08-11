package com.telstra.pack1;

public class Test {
	
	public static <T> void PrintArray(T[] arr) {
		
		for(T ele : arr) {
			System.out.println(ele);
		}
	}

}
