package com.Telstra;

public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.2);
		Circle c3 = new Circle("White");
		Circle c4 = new Circle(87.5,"Yellow");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
	}

}
