package com.telstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("mg");
		ll.add("mohit");
		ll.add("max");
		ll.add("min");
		
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("mohit"));
		
		ListIterator<String> itr = ll.listIterator();
		// ListIterator is different from iterator it has both movements
		// i.e. both in forward and backward direction..
		
		
		// Moving in forward direction
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		// Backward pass
		
//		ListIterator<String> itr1 = ll.listIterator(ll.size());
//		
//	   while(itr1.hasPrevious()) {
//		   System.out.println(itr1.previous());
//	   }
//		
//		
//		System.out.println();
		
		
//		ListIterator also works with ArrayList.
		
//		ArrayList<String> arr = new ArrayList<String>();
//		
//		ListIterator<String> itr2 = arr.listIterator();
//   
		
//		Collections.reverse(ll);
//		System.out.println(ll);
		//Collections.sort(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
	}

}
