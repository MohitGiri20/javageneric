package com.telstra;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Mohit";
		
		
		System.out.println(Integer.toHexString(str1.hashCode()));
		
		String str2 = "Giri";
		
		String str3 = "Giri";
		
		str1 = "Mg";
		
		System.out.println(Integer.toHexString(str1.hashCode()));
		
		
		
		System.out.println(str1);
		
		String str4 = new String("Giri");
		
		// == compares the references
		System.out.println(str1 == str2);
		System.out.println(str1==str3);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		
		System.out.println(str3.equals(str4));
		
		
		
		StringTokenizer st = new StringTokenizer("hello:mg:how:do:you:do",":");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.hasMoreTokens());
		}
		
	}

}
