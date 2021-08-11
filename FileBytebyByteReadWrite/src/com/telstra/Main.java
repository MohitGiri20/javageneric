package com.telstra;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try(FileInputStream input = new FileInputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\file1.txt");
			BufferedInputStream bi = new BufferedInputStream(input);
			FileOutputStream output = new FileOutputStream("C:\\Users\\d976996\\OneDrive - Telstra\\Desktop\\copyfile1.txt");
			BufferedOutputStream bo = new BufferedOutputStream(output);
		  ) {
			
			int c;
			
			while((c=bi.read())!=-1) {  //EOF(End of File) condition when it reaches -1
				
				bo.write(c);
				System.out.print((char)c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
