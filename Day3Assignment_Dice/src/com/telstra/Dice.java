package com.telstra;

public class Dice {
	
private int fValue ;
	
	
	public int roll() {
		
		fValue = (int)(Math.random() * 8) + 1;
		
		return fValue;
	}
	
	public int getfValue() {
		
		return fValue;
	}
	

}
