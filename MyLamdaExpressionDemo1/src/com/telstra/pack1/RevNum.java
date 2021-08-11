package com.telstra.pack1;

public class RevNum {
	
	private int num;

	public RevNum(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
	public int getRevNum() {
		
		int rev = 0;
		
		while(num>0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num /=10;
		}
		return rev;
	}
	

}
