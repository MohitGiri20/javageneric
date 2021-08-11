package com.Telstra.emppack;

public class Employee {
	// No access specifier then it is default(package friendly)
	
	
	protected int empId;
	protected String empName;
	protected int bsal;
	public Employee(int empId, String empName, int bsal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bsal = bsal;
	}
	
	
	public String getDetails() {
		
		return empId + " " + empName + " " + bsal;
	}
	
	

}
