package com.telstra.pack1;

public class Student implements Comparable<Student> {
	
	private int sId;
	private String sName;
	private int sMarks;
	
	
	

	public Student(int sId, String sName, int sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}




	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}






	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.sMarks - o.sMarks > 0) return 1;
		else return 0;
	
	}
	
	
	
	
	

}
