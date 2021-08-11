package com.telstra;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> students = new ArrayList<Student> ();
		
		students.add(new Student(101,99,"Mohan"));
		students.add(new Student(102,95,"Madan"));
		students.add(new Student(96,87,"Mudit"));
		students.add(new Student(76,95,"Mridul"));
		
	   System.out.println(students);
	   
	   Collections.sort(students);
	   
	   System.out.println(students);
		
		
		
		
		

	}

}
