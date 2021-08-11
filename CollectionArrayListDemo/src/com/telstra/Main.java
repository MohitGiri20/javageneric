package com.telstra;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List is the base class for ArrayList
		// By default size is 10;
		
//		List<String> strArr = new ArrayList<String>();
//		
//		strArr.add("Mg");
//		strArr.add("mg");
//		strArr.add("Hello");
//		strArr.add("Mohit");
//		
//		System.out.println(strArr);
//        strArr.add(2,"Giri");	
//        System.out.println(strArr);
//        
//        strArr.remove(2);
//        
//        System.out.println(strArr);
//        
//     
//        ArrayList<String> subArr = new ArrayList<String>();
//        
//        subArr.add("mo");
//        subArr.add("wq");
//        
//        strArr.addAll(2, subArr);
//        System.out.println(strArr);
//        
//        System.out.println(strArr.get(4));
//        
//        
//        // Printing using enhanced for loop
//        for(String str : strArr) {
//        	System.out.print(str+ " ");
//        }
//        
//        System.out.println();
//        // Printing using conventional for loop
//        
//        
//        for(int i=0;i<strArr.size();i++) {
//        	System.out.print(strArr.get(i)+" ");
//        }
        
        
        // Using Iterator class available in util.java
        
//        Iterator<String> itr = strArr.iterator();
//        
//        
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        	
//        }
        
        // sum of all elements in an array using arrayList
        
//        System.out.println("Enter size of array");
//        
//        int n = scn.nextInt();
//        
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        
//        
//        int sum=0;         
//        for(int i=0;i < n;i++) {
//        	System.out.println("Enter array element " + (i+1));
//        	int a = scn.nextInt();
//        	arr.add(a);
//        }
//        
//        for(int ele : arr) {
//        	sum+=ele;
//        }
//        System.out.println(sum);
        
        
//
//		List<String> strArr = new ArrayList<String>();
//		
//		strArr.add("Mg");
//		strArr.add("mg");
//		strArr.add("Hello");
//		strArr.add("Mohit");
//        
//		Collections.sort(strArr);
//        
//        System.out.println(strArr);
        
        
        ArrayList<Person> persons = new ArrayList<Person>();
        
        persons.add(new Person(101,12));
        persons.add(new Person(102,22));
        persons.add(new Person(0101,20));
        persons.add(new Person(1010,23));
        persons.add(new Person(1100,20));
        
        for(Person p : persons) {
        	if(p.getAge() == 20) {
        		System.out.println(p.toString());
        	}
        }
        
        scn.close();
        
	}

}
