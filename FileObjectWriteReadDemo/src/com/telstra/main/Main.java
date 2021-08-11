package com.telstra.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.telstra.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try(FileOutputStream output = new FileOutputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\std.dat");
			ObjectOutputStream  out= new ObjectOutputStream(output);
				
			FileInputStream input = new FileInputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\std.dat");
				ObjectInputStream in = new ObjectInputStream(input);
				) {
			
			Student s1 = new Student(101,22,"Mohit");
			
			out.writeObject(s1);
			
			Student s2 = new Student(102,22,"Mg");
			
			out.writeObject(s2);
			
			System.out.println("Records Updated");
			
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
