package com.telstra.fpack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.telstra.data.Student;


public class FileReadClass {
	
	
	public Student[] ReadFile(){
		
		Student[] sArr = new Student[5];
		
		try(
			FileReader fr =new FileReader("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\Stdfile.txt");
		    BufferedReader br =new BufferedReader(fr);) 
		 {
			
			String str=br.readLine();
			int i=0;
			while(str!=null) {
                  
			    System.out.println(str);
			    String[] word = str.split(" :");
			    int id = Integer.parseInt(word[0]);
			    
			    String name = word[1];
			    
			    Student s = new Student(id,name);
			    sArr[i++] =s;
			    
				str = br.readLine();
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return sArr;
		
	}

}
