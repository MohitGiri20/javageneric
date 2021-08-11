package com.telstra;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vectors are thread safe and arrayLists are not thread safe.
		
		// Similar to arrayLists
		
		// Vectors come under lists(ArrayList,LinkedList,Vectors)
		
		// Iterator don't works here.
		
		Vector<String> v = new Vector<String>();
		
		v.add("Mg");
		v.add("Kg");
		v.add("Pg");
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		
		System.out.println();
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			
			System.out.print(it.next() + " ");
		}
		
	
		
	}

}
