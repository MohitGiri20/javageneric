package com.telstra;

public class Student implements Comparable<Student> {
	
	private int id;
	private int marks;
	private String name;
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		 
//		if(this.marks > o.marks) {
//			return 1;
//		}
//		if(this.marks == o.marks) {
//			return  this.id - o.id; 
//		}
//		else {
//			return -1;
//		}
		
		
		if(o.marks < this.marks) {
			return 1;
		}else if (o.marks == this.marks) {
			return  this.id - o.id;
		}else {
			return -1;
		}
		
	}
	
	
	

}
