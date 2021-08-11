package com.telstra.model.bookop;

import java.util.ArrayList;
import java.util.HashMap;

import com.telstra.model.ppack.Book;

public class BookOperationImplementation implements BookOperations{
	
	private ArrayList<Book> bookList  = new ArrayList<Book>();
	
	
	HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	//key : bookId
	//value: bookPrice*units

	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		
		bookList.add(book);		
		map.put(book.getBookId(), book.getBookPrice() * book.getUnits());
		
		return "Book added successfully";
	}

	@Override
	public Book getABook(int bookId) {
		// TODO Auto-generated method stub
		
		for(Book book : bookList) {
			
			if(book.getBookId() == bookId) {
				return book;
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookList;
	}

	@Override
	public String deleteBook(int bookId) {
		// TODO Auto-generated method stub
		Book book = getABook(bookId);
		
		if(book != null) {
			bookList.remove(book);
			map.remove(bookId);
			return "Book deleted successfully";
		}
		
		return "Book not found, Unable to delete";
	}

	@Override
	public long getInventory() {
		// TODO Auto-generated method stub
		
		long totalAmount = 0l;
		
		for(Integer bookId : map.keySet()) {
		   totalAmount+= map.get(bookId);	
		}
		
		return totalAmount;
	}
	
	

	@Override
	public String updatePrice(int bookId, int bookUprice) {
		// TODO Auto-generated method stub
		
		Book book  = getABook(bookId);
		
		if(book == null) {
			return "Book not found, Can't update Price" ;
		}
		
		book.setBookPrice(bookUprice);
		map.put(book.getBookId(), book.getBookPrice() * book.getUnits());
		return "Book Price updated successfully";
		
		
	}

}
