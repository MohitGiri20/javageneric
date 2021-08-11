package com.Telstra;

public class Circle {
	
	private double radius;
	private String colour;
	
	
	
	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}
	
	public Circle() {
		this(5,"Red"); // call for fully paramaterized constructor already there.
	}
	
	public Circle(double radius) {
		
		this(radius,"Blue");
		
	}
	
    public Circle(String colour) {
    	
    	this(10.2,colour);
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	
	
	
	
	

}
