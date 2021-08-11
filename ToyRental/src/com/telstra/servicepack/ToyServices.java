package com.telstra.servicepack;

import java.util.ArrayList;

import com.telstra.model.ppack.Toy;
import com.telstra.model.toyop.ToyMethodsImplementation;

public class ToyServices {
	
	public static ToyMethodsImplementation tobj = new ToyMethodsImplementation();
	
	
     public static String addService(int toyId, String toyName, String toyType, int minAge, int maxAge, int quantity, float price,
 			float rentalAmount, float rentalDeposit) {
		
		Toy toy = new Toy(toyId,toyName,toyType,minAge,maxAge,quantity,price,rentalAmount,rentalDeposit);
		
		return tobj.addToy(toy);
		
	}
	
	public static String getService(int toyId) {
		//bop.getABook(bookId)
		
		return tobj.getToy(toyId) == null ? "Toy not found" : "Toy found " + tobj.getToy(toyId) ;
	}
	
	public static void getAllToysService() {
		ArrayList<Toy> toys = new ArrayList<Toy>();
      
     toys = tobj.getAllToys();
     
 
     for(Toy toy:toys) {
    	  	System.out.println(toy);
    	     } 
	}
	
	public static String deleteService(int toyId) {
		
		return tobj.deleteToy(toyId);
	}
	
	public static String updateService(int toyId,int upPrice) {
		
		return tobj.updatePrice(toyId, upPrice);
	}
	
	public static long getInventoryService() {
		
		return tobj.getInventory();
	}
	

}
