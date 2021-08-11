package com.Telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res=0;
        
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		res= n1/n2;
		}catch(ArithmeticException e1){
			System.out.println(e1.getMessage());
			System.out.println("Denominator is 0");
			e1.printStackTrace();
		}catch(NumberFormatException e2) {
			System.out.println(e2.getMessage());
			System.out.println("Invalid Input is given");
			e2.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println(e3.getMessage());
			System.out.println("No arguments passed or insufficient or more than required arguments are passed");
            e3.printStackTrace();		
		}finally {
		System.out.println("Finally Block Reached");	
		System.out.println("Result:" + res);
		}
		
		System.out.println("Reached Here");
		
		
	}

}
