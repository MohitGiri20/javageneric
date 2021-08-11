package com.telstra.model;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectClass {
	
	public void writeObject() {

	try(FileOutputStream output = new FileOutputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\std1.dat");
		ObjectOutputStream  out= new ObjectOutputStream(output);
			
		
			) {
		
		Student s1 = new Student(101,95,99);
		
		out.writeObject(s1);
		
		Student s2 = new Student(102,93,94);
		
		out.writeObject(s2);
		
		System.out.println("Records Updated");
		
		// For getting the data back we need to do the deserialization as 
		// it is stored in the bytecode form.
		// Now Read the object
//		
				
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

}

}
