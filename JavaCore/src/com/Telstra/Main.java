package com.Telstra;
import java.util.Scanner;

public class Main {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int n1=100;
//        int n2=15;
//        int n3=20;
        
        
        
//        int n1 = scn.nextInt();
//        int n2 = scn.nextInt();
//        int n3 = scn.nextInt();
//        
//        int large = n1 > n2 ? n1 : n2;
//        
//        
//        
//        int largest =large > n3 ? large : n3;
//       // int largest = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
//        System.out.println(largest);
	
	   // Type Conversion/Casting
        // Implicit Type Casting
//        
//        float f1 = 13.22F;
//        System.out.println(f1);
//        double d1 = f1;
//        System.out.println(d1);
//        float f2 =(float) d1;
//        System.out.println(f2);
//        
//        
//        double d2=Math.pow(2, 63);
//        
//        float f3 = (float)d2;
//        System.out.println(f3);
//        System.out.println(d2);

		
//		for(int i=0;++i<=10;i++) {
//			System.out.println(i);
//		}
//	   
//	
		 int n= 102;
		 
		
		 
		 
		  int revn = revNumber(n);
		  if(n<0) revn*=-1;
		 System.out.println(revn);
	}
	
	public static int revNumber(int n) {
		 if(n< 0) n*=-1;
		int revn=0;
		 while(n>0) {
			 int rem = n%10;
			 revn = revn*10 + rem;
			 n/=10;
		 }
		 return revn;
	}

}
