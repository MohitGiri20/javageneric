package com.telstra;

public class Person {
	
	
	private int id;
	private int age;
	public Person(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	
	

}
