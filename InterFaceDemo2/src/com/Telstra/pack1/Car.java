package com.Telstra.pack1;

public class Car extends Vehicle{
	
	private String type;
	private int maxSpeed;
	

	public Car(int regNo, String model, int currSpeed, String type, int maxSpeed) {
		super(regNo, model, currSpeed);
		this.type = type;
		this.maxSpeed = maxSpeed;
	}

   
    




	@Override
	public int incSpeed(int n) {
		// TODO Auto-generated method stub
		if(currSpeed + n <= maxSpeed) {
			currSpeed+=n;
			return currSpeed;
		}
		
		return -1;
	}
   
	
	public int getMaxSpeed() {
		return maxSpeed;
	}







	@Override
	public String toString() {
		return "Car [type=" + type + ", maxSpeed=" + maxSpeed + ", regNo=" + regNo + ", model=" + model + ", currSpeed="
				+ currSpeed + "]";
	}



	
	

}
