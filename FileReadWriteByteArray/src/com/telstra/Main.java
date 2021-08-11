package com.telstra;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		try(InputStream is = new FileInputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\file1.txt");
				BufferedInputStream bi = new BufferedInputStream(is);
           ) {
			
			byte[] buffer = new byte[is.available()];
			
			bi.read(buffer);
			
			for(byte b : buffer) {
				
				//System.out.print(b);
				
				System.out.print((char)b);
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
