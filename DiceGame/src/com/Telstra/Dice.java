package com.Telstra;

public class Dice {
	
	private int fValue ;
	
	
	public int roll() {
		
		fValue = (int)(Math.random() * 6) + 1;
		
		return fValue;
	}
	
	public int getfValue() {
		
		return fValue;
	}
	
	
	
	

	
}
