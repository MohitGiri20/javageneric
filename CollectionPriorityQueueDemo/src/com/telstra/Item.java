package com.telstra;

public class Item implements Comparable<Item> {

	private int id;
	private String name;
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		
	    if(this.id > o.id) return 1;
	    else if(this.id == o.id)
		return 0;
	    else return -1;
	}
	
	
	
}
