package com.telstra.uipack;


import java.util.Scanner;

import com.telstra.servicepack.BookServices;



public class BookStoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// Menu driven Program
		
		Scanner scn = new Scanner(System.in);
		
	//	BookOperationImplementation bop = new BookOperationImplementation();
	
		
		
        while(true){
            System.out.println("1. Add a Book"); // Admin
            System.out.println("2. Get a Book"); // Admin, User
            System.out.println("3. List of Books"); // Admin, User
            System.out.println("4. Delete a Book"); // Admin
            System.out.println("5. Update Book Price");//Admin
            System.out.println("6. Get Inventory Value"); // Admin
            System.out.println("7. Add to Cart");// User
            System.out.println("8. View the Cart");// User
            System.out.println("9. Delete from Cart");// User
            System.out.println("10. Billing");// User
            System.out.println("11. Exit");
            
            
            System.out.println("Enter your choice");
            int choice = scn.nextInt();
           
            switch(choice){
            case 1:
            {   
            	System.out.println("Enter book details:");
            	int bookId = scn.nextInt();
            	String bookName = scn.next();
            	int bookPrice = scn.nextInt();
            	int units = scn.nextInt();
            	
            	//Book book = new Book(bookId,bookName,bookPrice,units);
            	
            	System.out.println(BookServices.addService(bookId, bookName, bookPrice, units));
            
                break;
            }
            case 2:
            {
            	System.out.println("Enter the bookId:");
            	int bookId = scn.nextInt();
            	
            	//System.out.println(bop.getABook(bookId) == null ? "Book not found" : "Book found " + bop.getABook(bookId) );
                 System.out.println(BookServices.getService(bookId));
                break;
            }
        case 3:
            {
//            	
//                ArrayList<Book> books = new ArrayList<Book>();
//                 
//                books = bop.getAllBooks();
//                
//                for(Book book:books) {
//                	System.out.println(book);
//                }
            
                
//            	
            	BookServices.getAllBooksService();
            	
                break;
            }
            case 4:
            {
            	System.out.println("Enter the bookId to be deleted");
            	int bookId = scn.nextInt();
            	
            	System.out.println(BookServices.deleteService(bookId));
            	
            	break;
            }
            case 5:
            {
            	System.out.println("Enter the bookId to be updated");
            	int bookId = scn.nextInt();
            	
            	System.out.println("Enter the updated price of book");
            	int upPrice = scn.nextInt();
            	
            	System.out.println(BookServices.updateService(bookId, upPrice));  
            	 
            	break;
            }
            
               
        case 6:
        {
        	
        	System.out.println(BookServices.getInventoryService());
        	
        	break;
        }
            default:
               
                System.out.println("Bye");
                System.exit(0);
            }
           
		
	}

 }
		
}	
