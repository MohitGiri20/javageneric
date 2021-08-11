package com.telstra;

public class Items {
	
	private String itemName;
	private float price;
	private int quantity;
	public Items(String itemName, float price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getItemName() {
		return itemName;
	}
	public float getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "Items [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
