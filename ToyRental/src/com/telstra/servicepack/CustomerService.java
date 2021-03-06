package com.telstra.servicepack;

import java.util.ArrayList;

import com.telstra.model.ppack.Toy;

public interface CustomerService {
	
	 String rent(int toyId,int units); // Add details of rented toy
	 Toy getToy(int toyId);
	 String search(int toyId);
	 void display();
     void viewCart();
     String deleteFromCart(int toyId);
     float getCustomerBill();
}
