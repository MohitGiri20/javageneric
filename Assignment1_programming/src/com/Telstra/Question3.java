package com.Telstra;

import java.util.Scanner;

public class Question3 {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3.	To find  palindrome words in a given string
		
		System.out.println("Enter the string:");
		
		String s = scn.nextLine();
		
		System.out.println("Entered string is:" + s);
		
		System.out.println("Palindrome words in given string are");
		//s+=" ";
		String w = "";
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				w+=s.charAt(i);
			}else {
				   if(w != "") {
				    boolean isPalindrome = checkPalindrome(w);
				
				    if(isPalindrome) {
					System.out.println(w);
				    }
				    w="";
				  }
			}
		}
		
		boolean isPalindrome = checkPalindrome(w);
		
		if(isPalindrome) System.out.println(w);
		
		scn.close();
		

	}
	
	public static boolean checkPalindrome(String str) {
		
	 int start = 0;
	 int end = str.length() - 1;
	 
	 while(start<=end) {
		 
		 if(str.charAt(start) != str.charAt(end)) {
			 return false;
		 }
		 start++;
		 end--;
	 }
	 
	 return true;
	 
	 
		
	}

}
