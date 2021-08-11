package com.telstra.pack1;

public class PalindromeString {
	
	private String str;
	
	public PalindromeString(String str) {
		super();
		this.str = str;
	}

	public String getString() {
		return str;
	}
	
	public String getRevString() {
		
		int i=0;
		int j = str.length()-1;
		
		while(i<=j) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return null;
			}
		}
		return str;
	}
	
	

}
