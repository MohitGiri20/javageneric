package com.telstra.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjectClass {
	
	
	public void readObject() {
		

		try(
				
			FileInputStream input = new FileInputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\std1.dat");
				ObjectInputStream in = new ObjectInputStream(input);
				) {
			
			
			// For getting the data back we need to do the deserialization as 
			// it is stored in the bytecode form.
			// Now Read the object
//		
			while(input.available() > 0) {
				
				Student student = (Student)in.readObject();
				System.out.println(student);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	}


