package com.telstra.pack1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ilist = new ArrayList<Integer>();
		
		ilist.add(2);
		ilist.add(10);
		ilist.add(12);
		
		System.out.println(Test.sumOfList(ilist));

		// This will not work for object class (error due to upper bond)
		// Number is upperbond
		
		List<Object> olist = new ArrayList<Object>();
		olist.add(12);
		olist.add(20);
		olist.add(30);
		
//		System.out.println(Test.sumOfList(olist));
         
		System.out.println(Test.sumOfList1(olist));
		System.out.println(Test.sumOfList2(olist));
		
		System.out.println(Test.printList(olist));
		
		System.out.println(Test.maximum(10, 9,20));
		
		
		Student s1 = new Student(101,"Mg",98);
		Student s2 = new Student(102,"Kg",99);
		Student s3 = new Student(103,"Lg",76);
		
		System.out.println(Test.maximum(s1, s2, s3));
	}
	
	
	

}
