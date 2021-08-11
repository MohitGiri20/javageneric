package com.telstra;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		File file1 = new File("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\file1.txt");
		
		// Alternate Way
		//File file1 = new File("C:/Users/d976996/OneDrive - Telstra/Desktop/file1.txt");
		
		
		try {
			file1.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getName());
		System.out.println(file1.getParent());
		
		// Another way to create file 
		
		File file2 = new File("C:/Users/d976996/OneDrive - Telstra/Desktop","file2.txt");
		
		try {
			file2.createNewFile();
			System.out.println("File 2 created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File dir = new File("C:\\Users\\d976996\\OneDrive - Telstra\\Documents");
		
		File[] files = dir.listFiles();
		
		for(File file : files) {
			System.out.println(file.getName());
		}
		
	}

}
