package com.Telstra.emppack;

public class Programmer extends Employee {
	
	private int noOfProjects;
	private String skills;
	
	
	public Programmer(int empId, String empName, int bsal, int noOfProjects, String skills) {
		super(empId, empName, bsal);
		this.noOfProjects = noOfProjects;
		this.skills = skills;
	}
	
    public String getDetails() {
		
		return super.getDetails() + " " + noOfProjects + " "+ skills;
	}

	public int getNoOfProjects() {
		return noOfProjects;
	}

	public String getSkills() {
		return skills;
	}
	
	

}
