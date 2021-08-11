package com.Telstra;

public class Baby extends FitnessCenter {
	
	private int id;
	private String name;
	private String gender;
	private double weight;
	public Baby(int id, String name, String gender, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.weight = weight;
	}
	
	protected double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return "Baby [id=" + id + ", name=" + name + ", gender=" + gender + ", weight=" + weight + "]";
	}
	
	
	

}
