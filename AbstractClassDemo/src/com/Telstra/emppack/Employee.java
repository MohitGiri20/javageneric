package com.Telstra.emppack;

public abstract class Employee {
	// No access specifier then it is default(package friendly)
	
	// private  only visible accessible within the class
	// No access specifiers mentioned default: package friendly 
	// protected : package friendly, for derived classes in different package 
	// public : Accessible for all the classes
	
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
	
	 protected  abstract  double caclNetSal();
	
	

	

}
