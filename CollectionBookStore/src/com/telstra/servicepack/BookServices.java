package com.telstra.servicepack;

import java.util.ArrayList;

import com.telstra.model.bookop.BookOperationImplementation;
import com.telstra.model.ppack.Book;

public class BookServices {
	
	
	 public static BookOperationImplementation bop = new BookOperationImplementation();
	
	public static String addService(int bookId, String bookName,int bookPrice,int units) {
		
		Book book = new Book(bookId,bookName,bookPrice,units);
		
		return bop.addBook(book);
		
	}
	
	public static String getService(int bookId) {
		//bop.getABook(bookId)
		
		return bop.getABook(bookId) == null ? "Book not found" : "Book found " + bop.getABook(bookId) ;
	}
	
	public static void getAllBooksService() {
		ArrayList<Book> books = new ArrayList<Book>();
      
     books = bop.getAllBooks();
     
 
     for(Book book:books) {
    	  	System.out.println(book);
    	     } 
	}
	
	public static String deleteService(int bookId) {
		
		return bop.deleteBook(bookId);
	}
	
	public static String updateService(int bookId,int upPrice) {
		
		return bop.updatePrice(bookId, upPrice);
	}
	
	public static long getInventoryService() {
		
		return  bop.getInventory();
	}
	

}
