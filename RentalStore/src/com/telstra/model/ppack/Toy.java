package com.telstra.model.ppack;

public class Toy {
	
	private int toyId;
	private String toyName;
	private String toyType;
	private int minAge;
	private int maxAge;
	private int quantity;
	private float price;
	private float rentalAmount;
	private float rentalDeposit;
	
	
	public Toy(int toyId, String toyName, String toyType, int minAge, int maxAge, int quantity, float price,
			float rentalAmount, float rentalDeposit) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
		this.toyType = toyType;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.quantity = quantity;
		this.price = price;
		this.rentalAmount = rentalAmount;
		this.rentalDeposit = rentalDeposit;
	}


	public int getToyId() {
		return toyId;
	}


	public String getToyName() {
		return toyName;
	}


	public String getToyType() {
		return toyType;
	}


	public int getMinAge() {
		return minAge;
	}


	public int getMaxAge() {
		return maxAge;
	}


	public int getQuantity() {
		return quantity;
	}


	public float getPrice() {
		return price;
	}


	public float getRentalAmount() {
		return rentalAmount;
	}


	public float getRentalDeposit() {
		return rentalDeposit;
	}


	@Override
	public String toString() {
		return "Toy [toyId=" + toyId + ", toyName=" + toyName + ", toyType=" + toyType + ", minAge=" + minAge
				+ ", maxAge=" + maxAge + ", quantity=" + quantity + ", price=" + price + ", rentalAmount="
				+ rentalAmount + ", rentalDeposit=" + rentalDeposit + "]";
	}
	
	
	
	
	

}
