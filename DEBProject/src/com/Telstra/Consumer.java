package com.Telstra;

public class Consumer {
	
	private int meterNo;
	private int unitsConsumed;
	private int unitPrice;
	public Consumer(int meterNo, int unitsConsumed, int unitPrice) {
		super();
		this.meterNo = meterNo;
		this.unitsConsumed = unitsConsumed;
		this.unitPrice = unitPrice;
	}
	//Encapsulation
	
	private int calculateBill() {
		
		return this.unitsConsumed * this.unitPrice;
	}
	
	
	
	@Override
	public String toString() {
		return "Consumer [meterNo=" + meterNo + ", unitsConsumed=" + unitsConsumed + ", unitPrice=" + unitPrice + ", Bill Amount=" + calculateBill() + "]";
	}
	
	
	

}
