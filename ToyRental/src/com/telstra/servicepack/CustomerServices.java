package com.telstra.servicepack;

import java.util.ArrayList;

import com.telstra.model.ppack.Toy;
import com.telstra.model.toyop.ToyMethodsImplementation;

public class CustomerServices {
	
	//public static ToyMethodsImplementation custObj = new ToyMethodsImplementation();
	
	  public static CustomerServiceImplementation custObj = new CustomerServiceImplementation();
	  
	  
	  public static String addToCartService(int toyId,int units) {
		      
		     return custObj.rent(toyId, units);
	  }
	  
	  public static void viewCartService() {
		  
		   custObj.viewCart();
		  
		  
	  }
	  
	  public static String deleteFromCartService(int toyId) {
		      
		    return custObj.deleteFromCart(toyId);
	  }
	
	  public static float billingService() {
		  
		  return custObj.getCustomerBill();
	  }

}
