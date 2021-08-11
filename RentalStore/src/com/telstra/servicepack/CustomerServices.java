package com.telstra.servicepack;

import com.telstra.model.customerop.CustomerMethodsImplementation;

public class CustomerServices {
	
	public static CustomerMethodsImplementation cobj = new CustomerMethodsImplementation();
	
	
	 public static String addToCartService(int toyId,int units) {
	      
	     return cobj.rent(toyId, units);
  }
  
  public static void viewCartService() {
	  
	   cobj.viewCart();
	  
	  
  }
  
  public static String deleteFromCartService(int toyId) {
	      
	    return cobj.deleteFromCart(toyId);
  }

  public static float billingService() {
	  
	  return cobj.getCustomerBill();
  }

}
