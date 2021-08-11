package com.telstra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileReader fr = new FileReader("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\file1.txt");
			    BufferedReader br =new BufferedReader(fr);){
			
		    
		   
				String str = br.readLine();
			
//				while(!str.equalsIgnoreCase("End")) {
//					
//					System.out.println(str);
//					str = br.readLine();
//			}
				
				//Alternate Way
				
				while(str!=null) { // checking EOF(end of file) condition
					
					System.out.println(str);
                    str = br.readLine(); 
				}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
