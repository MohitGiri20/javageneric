package com.telstra.model;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	
	
	/**
	 * 
	 */
	
	// This interface has no methods
	private static final long serialVersionUID = 1999999L;
	private int studentId;
	private int studentAge;
	private String studentName;
	
	
	
	public Student(int studentId, int studentAge, String studentName) {
		super();
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentName = studentName;
		
		System.out.println("Constructor Working");
	}
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentAge=" + studentAge + ", studentName=" + studentName + "]";
	}
	
	

}
