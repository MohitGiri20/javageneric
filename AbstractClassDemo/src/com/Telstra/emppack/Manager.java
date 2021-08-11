package com.Telstra.emppack;

public class Manager extends Employee{

	private String depName;
	private int empCount;
	
	
	public Manager(int empId, String empName, int bsal, String depName, int empCount) {
		super(empId, empName, bsal);
		this.depName = depName;
		this.empCount = empCount;
	}
	
	public String getDetails() {
		
		return super.getDetails() + " " + depName + " "+ empCount;
	}

	public String getDepName() {
		return depName;
	}

	public int getEmpCount() {
		return empCount;
	}

	@Override
	public double caclNetSal() {
		// TODO Auto-generated method stub
		
		return (bsal+(0.1*bsal+0.2*empCount));
	
	}
	
	
	
	
}
