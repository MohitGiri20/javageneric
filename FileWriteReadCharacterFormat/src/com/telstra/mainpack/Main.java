package com.telstra.mainpack;

import java.util.Scanner;

import com.telstra.data.Student;
import com.telstra.fpack.FileReadClass;
import com.telstra.fpack.FileWriteClass;

public class Main {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Enter the student id:");
//		int id  =scn.nextInt();
//		
//		System.out.println("Enter the student name:");
//		String name = scn.next();
//		
//		FileWriteClass fw= new FileWriteClass();
//		
//		fw.writeRec(id,name);
//		
//		
	    FileReadClass fr= new FileReadClass();
	    Student[] sArr = fr.ReadFile();
	    
	    for(Student s : sArr) {
	    	System.out.println(s);
	    }
	    
	    
	
		
		
		scn.close();
		
		

	}

}
