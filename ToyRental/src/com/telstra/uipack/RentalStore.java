package com.telstra.uipack;

import java.util.Scanner;

import com.telstra.model.ppack.Address;
import com.telstra.model.ppack.Customer;
import com.telstra.servicepack.CustomerServices;
import com.telstra.servicepack.ToyServices;






public class RentalStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		boolean customerExists = false;

                    while(true) {
                    	
                        
                	 System.out.println("1. Add a Toy"); // Admin
                     System.out.println("2. Get a Toy"); // Admin, User
                     System.out.println("3. List of Toys"); // Admin, User
                     System.out.println("4. Delete a Toy"); // Admin
                     System.out.println("5. Update Toy Price");//Admin
                     System.out.println("6. Get Inventory Value");
                     System.out.println("7. Switch to customer dashboard");
                     System.out.println("8. Exit");
                     
                     System.out.println("Enter your choice");
                     int choice = scn.nextInt();
                     
                     switch(choice){
                     case 1:
                     {   
                     	System.out.println("Enter toy details:");
                     	int toyId = scn.nextInt();
                     	String toyName = scn.next();
                     	String toyType = scn.next();
                 		int minAge = scn.nextInt();
                 		int maxAge = scn.nextInt();
                 		int quantity = scn.nextInt();
                 		float toyPrice = scn.nextInt();
                 		float rentalAmount = scn.nextFloat();
                 		float rentalDeposit = scn.nextFloat();
                 		System.out.println(ToyServices.addService(toyId,toyName,toyType,minAge,maxAge,quantity,toyPrice,
                     			rentalAmount,rentalDeposit));
                     	
                         break;
                     }
                     case 2:
                     {
                     	System.out.println("Enter the toyId:");
                     	int toyId = scn.nextInt();
                     	
                     	//System.out.println(bop.getABook(bookId) == null ? "Book not found" : "Book found " + bop.getABook(bookId) );
                          System.out.println(ToyServices.getService(toyId));
                         break;
                     }
                 case 3:
                     {           	
                     	ToyServices.getAllToysService();
                     	
                         break;
                     }
                     case 4:
                     {
                     	System.out.println("Enter the toyId to be deleted");
                     	int toyId = scn.nextInt();
                     	
                     	System.out.println(ToyServices.deleteService(toyId));
                     	
                     	break;
                     }
                     case 5:
                     {
                     	System.out.println("Enter the toyId to be updated");
                     	int toyId = scn.nextInt();
                     	
                     	System.out.println("Enter the updated price of book");
                     	int upPrice = scn.nextInt();
                     	
                     	System.out.println(ToyServices.updateService(toyId, upPrice));  
                     	 
                     	break;
                     }
                     
                        
                 case 6:
                 {
                 	
                 	System.out.println(ToyServices.getInventoryService());
                 	
                 	break;
                 }
                 case 7:
                 {
                 	System.out.println("Switch to customer dashboard");
                 	
                	while(true) {
                		
                		if(customerExists == false) {
                		customerExists = true;
                		System.out.println("Enter Customer Details:");
                		
                		String city = scn.next();
                		String state = scn.next();
                		String country = scn.next();
                		int zip = scn.nextInt();
                		Address ad = new Address(city,state,country,zip);
                		
                		int custId = scn.nextInt();
                		String custName = scn.next();
                		String email = scn.next();
                		String pass = scn.next();
                		
                		Customer c = new Customer(custId,custName,email,pass,ad);
                		}
                	
                    	
                	System.out.println("1. Get a Toy"); // Admin, User
                    System.out.println("2. List of Toys");
                    System.out.println("3. Add to Cart");// User
                    System.out.println("4. View the Cart");// User
                    System.out.println("5. Delete from Cart");// User
                    System.out.println("6. Billing");// User
                    System.out.println("7. Exit");
                    
                    System.out.println("Enter your choice");
                    int ch = scn.nextInt();
                    
                    switch(ch){
                    case 1:
                    {
                    	System.out.println("Enter the toyId:");
                    	int toyId = scn.nextInt();
                    	
                    	//System.out.println(bop.getABook(bookId) == null ? "Book not found" : "Book found " + bop.getABook(bookId) );
                         System.out.println(ToyServices.getService(toyId));
                        break;
                    }
                    case 2:
                    {
                    	ToyServices.getAllToysService();
                    	
                        break;
                    }
                    
                    case 3:
                    {   
                    	System.out.println("Enter the toyId:");
                    	int toyId = scn.nextInt();
                    	System.out.println("Enter the quantity:");
                    	int quantity = scn.nextInt();
                    	
                        System.out.println(CustomerServices.addToCartService(toyId, quantity));
                    	
                    	break;
                    }
                    
                    case 4:
                    {   
                    	CustomerServices.viewCartService();
                    	break;
                    }
                    
                    case 5:
                    {   
                    	System.out.println("Enter the id of toy to be deleted:");
                    	int toyId = scn.nextInt();
                    	CustomerServices.deleteFromCartService(toyId);
                    	break;
                    }
                    
                    case 6:
                    {
                    	System.out.println("Total Bill:");
                    	System.out.println(CustomerServices.billingService()); 
                    	break;
                    }
                    
                    
                    default:
                        
                        System.out.println("Bye");
                        System.exit(0);
                    
                	}
                    
                }
                 	
                 	
                 }
                     default:
                        
                         System.out.println("Bye");
                         System.exit(0);
                         
                     }
                    
                     
                     
                    }
                 
            
            }
}     
           
            
			
//            System.out.println("1. Add a Toy"); // Admin
//            System.out.println("2. Get a Toy"); // Admin, User
//            System.out.println("3. List of Toys"); // Admin, User
//            System.out.println("4. Delete a Toy"); // Admin
//            System.out.println("5. Update Toy Price");//Admin
//            System.out.println("6. Get Inventory Value"); // Admin
//            System.out.println("7. Add to Cart");// User
//            System.out.println("8. View the Cart");// User
//            System.out.println("9. Delete from Cart");// User
//            System.out.println("10. Billing");// User
//            System.out.println("11. Exit");
//            
//            
//            System.out.println("Enter your choice");
//            int choice = scn.nextInt();
//           
//            switch(choice){
//            case 1:
//            {   
//            	System.out.println("Enter toy details:");
//            	int toyId = scn.nextInt();
//            	String toyName = scn.next();
//            	String toyType = scn.next();
//        		int minAge = scn.nextInt();
//        		int maxAge = scn.nextInt();
//        		int quantity = scn.nextInt();
//        		float toyPrice = scn.nextInt();
//        		float rentalAmount = scn.nextFloat();
//        		float rentalDeposit = scn.nextFloat();
//        		System.out.println(ToyServices.addService(toyId,toyName,toyType,minAge,maxAge,quantity,toyPrice,
//            			rentalAmount,rentalDeposit));
//            	
//                break;
//            }
//            case 2:
//            {
//            	System.out.println("Enter the toyId:");
//            	int toyId = scn.nextInt();
//            	
//            	//System.out.println(bop.getABook(bookId) == null ? "Book not found" : "Book found " + bop.getABook(bookId) );
//                 System.out.println(ToyServices.getService(toyId));
//                break;
//            }
//        case 3:
//            {
////            	
////                ArrayList<Book> books = new ArrayList<Book>();
////                 
////                books = bop.getAllBooks();
////                
////                for(Book book:books) {
////                	System.out.println(book);
////                }
//            
//                
////            	
//            	ToyServices.getAllToysService();
//            	
//                break;
//            }
//            case 4:
//            {
//            	System.out.println("Enter the toyId to be deleted");
//            	int toyId = scn.nextInt();
//            	
//            	System.out.println(ToyServices.deleteService(toyId));
//            	
//            	break;
//            }
//            case 5:
//            {
//            	System.out.println("Enter the toyId to be updated");
//            	int toyId = scn.nextInt();
//            	
//            	System.out.println("Enter the updated price of book");
//            	int upPrice = scn.nextInt();
//            	
//            	System.out.println(ToyServices.updateService(toyId, upPrice));  
//            	 
//            	break;
//            }
//            
//               
//        case 6:
//        {
//        	
//        	System.out.println(ToyServices.getInventoryService());
//        	
//        	break;
//        }
//            default:
//               
//                System.out.println("Bye");
//                System.exit(0);
//            }
           
		


