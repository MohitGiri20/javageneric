package com.Telstra;
import java.util.Scanner;


public class MainLibrary {
	
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter book details");
		
		System.out.println("Enter number of books");
		int noOfBooks = scn.nextInt();
		
		Book [] books = new Book[noOfBooks];
		
		for(int i=0;i<noOfBooks;i++) {
			
			System.out.println("Enter the book Id");
			int bookId = scn.nextInt();
			System.out.println("Enter the book Name");
			scn.nextLine();
			String bookName = scn.nextLine();
			System.out.println("Enter the book Price");
			int bookPrice = scn.nextInt();
			
			 books[i] = new Book(bookId,bookName,bookPrice);
	
			
		}
		
		// For Each Loop/ enhanced for loop
		for(Book book : books) {
		   System.out.println(book);	
		}
		
		
	
    //    System.out.println("BookId:" + book1.bookId + " " + "BookName:" + book1.bookName); 
	}

}
