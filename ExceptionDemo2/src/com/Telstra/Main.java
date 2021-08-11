package com.Telstra;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ReadInputConsole r = new ReadInputConsole();
		//r.readInput1();
		r.readInput2();
		
		try {
			System.out.println(r.readInput3());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
