package com.telstra.model.ppack;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.telstra.model.bookop.BookOperationImplementation;

public class Customer {
	
	
	private static int count = 1;
	private ArrayList<Book> shoppingList;
	private int tid;
	private HashMap<Integer, Integer> smap = new HashMap<Integer,Integer>();
	
	public Customer() {
		super();
		this.tid =count++;
	}
	
	public void addToCart(int bookId, int units) {
		BookOperationImplementation bop =new BookOperationImplementation();
		Book book = bop.getABook(bookId);
		shoppingList.add(book);
		smap.put(book.getBookId(), book.getBookPrice()*units);
		
	}
	
	public int getBill() {
		
		int totalAmount = 0;
		
		for(int ele : smap.keySet()) {
			totalAmount+=smap.get(ele); 
		}
		
		return totalAmount;
		
//		Collection<Integer> value = smap.values();
//		Iterator<Integer> it = 
	}
	
	

}
