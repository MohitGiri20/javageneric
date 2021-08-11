package com.telstra.model.ppack;

public class Book {

	private int bookId;
	private String bookName;
	private int bookPrice;
	private int units;
	
	
	public Book(int bookId, String bookName, int bookPrice, int units) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.units = units;
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


	public int getUnits() {
		return units;
	}
   
	

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", units=" + units
				+ "]";
	}
	
	
	
	
}
