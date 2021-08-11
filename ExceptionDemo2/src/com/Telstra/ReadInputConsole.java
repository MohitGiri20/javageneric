package com.Telstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputConsole {
	
	
	// CHECKED EXCEPTION
	public void readInput1() {
		
		InputStreamReader ir = null; 
		
		BufferedReader br = null;
		
		String str1,str2;
		int result =0;
		
		ir = new InputStreamReader(System.in); // read from console
		br = new BufferedReader(ir);
		try {
			str1 = br.readLine();
			str2 = br.readLine();
			result  = Integer.parseInt(str1)/ Integer.parseInt(str2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ir.close();
				br.close();
				System.out.println("Result:" + result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void readInput2() {
		
		// With autoclose option
		
		try(InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);	
			)
		{
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println(Integer.parseInt(str1)/ Integer.parseInt(str2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int readInput3() throws IOException, NumberFormatException{
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);	
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		System.out.println(Integer.parseInt(str1)/ Integer.parseInt(str2));
		
		return Integer.parseInt(str1)/ Integer.parseInt(str2);
	}
	

}
