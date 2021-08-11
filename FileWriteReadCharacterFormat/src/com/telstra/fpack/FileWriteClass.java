package com.telstra.fpack;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.telstra.data.Student;

public class FileWriteClass {
	
	
	private String createRec(Student st) {
		
		return (st.getStudentId() + " " + st.getStudentName());
	}
	
	public void writeRec(int id,String name) {
		
		Student st = new Student(id,name);
		
		String str = createRec(st);
		// default mode : false, rewrite mode
		// true : append mode
		try(FileWriter out = new FileWriter("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\Stdfile.txt",true);
				BufferedWriter bw =new BufferedWriter(out)){
			
			bw.write(str);
			bw.newLine();
			
			System.out.println("Record Added Successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
