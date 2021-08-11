package com.Telstra;

public class Account {
	
	private int accId;
	private String accType;
	private float bal;
	
	

	public Account(int accId, String accType, float bal) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.bal = bal;
	}

	public float withdraw(float wdrawAmount) {
		
		 // Minimum Amount to be maintained in bank is 10000.
		 
		 if((float)(bal - wdrawAmount) < 10000f) {
			 return -1;
		 }else {
			 bal = (float)(bal - wdrawAmount);
			 return bal;
		 }
		
		
	}
	
    public float deposit(float depAmount) {
		
		return bal =  bal + depAmount;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accType=" + accType + ", bal=" + bal + "]";
	}

	
	

}
