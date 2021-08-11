package com.Telstra;

public class Book {

	// instance variables, members variables
	
	// Each object will have the copy of all the members of this class to store
	// it's state;
	
	 int bookId;
	 String bookName;
	 int bookPrice;
	 
	 
	 // constructor to create instances
	 // same as class
	 
	public Book(int bookId, String bookName, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}


	public int getBookId() {
		return bookId;
	}




	public String getBookName() {
		return bookName;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	 
	
	 
	 
}
