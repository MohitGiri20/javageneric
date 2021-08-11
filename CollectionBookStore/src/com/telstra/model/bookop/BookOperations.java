package com.telstra.model.bookop;

import java.util.ArrayList;

import com.telstra.model.ppack.Book;

public interface BookOperations {
	
	String addBook(Book book);
    Book getABook(int bookId);
    ArrayList<Book> getAllBooks();
    String deleteBook(int bookId);
    String updatePrice(int bookId,int bookUprice);
    long getInventory();
    
	
}
