package com.telstra.model.customerop;

import java.util.ArrayList;


import com.telstra.model.ppack.Toy;
import com.telstra.model.toyop.ToyMethodsImplementation;

public class CustomerMethodsImplementation implements CustomerOperations{
	
	ArrayList<Toy> custShoppingList = new ArrayList<Toy>();

	@Override
	public String rent(int toyId, int units) {
		// TODO Auto-generated method stub
		ToyMethodsImplementation tobj = new ToyMethodsImplementation();
		Toy toy = tobj.getToy(toyId);
		 
		custShoppingList.add(toy);
		//custMap.put(toy.getToyId(), toy.getPrice()*units);
		for(Toy t : custShoppingList) {
			System.out.println(t);
		}
		
		
		return "Toy added successfully";
		
	}

	@Override
	public Toy getToy(int toyId) {
		// TODO Auto-generated method stub
        ToyMethodsImplementation tobj =new ToyMethodsImplementation();
		
		return tobj.getToy(toyId);
		
	}

	@Override
	public String search(int toyId) {
		// TODO Auto-generated method stub
		ToyMethodsImplementation tobj =new ToyMethodsImplementation();
		ArrayList<Toy> tempArr = tobj.getAllToys();
		
		for(Toy toy : tempArr) {
			
			if(toy.getToyId() == toyId) {
				return ("Toy found " + tobj.getToy(toyId) );
			}
		}
		return "Toy not found";
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		ToyMethodsImplementation tobj =new ToyMethodsImplementation();
		ArrayList<Toy> tempArr = tobj.getAllToys();
		
		for(Toy toy : tempArr) {
		   System.out.println(toy);
		}
	}

	@Override
	public void viewCart() {
		// TODO Auto-generated method stub
		
		for(Toy toy : custShoppingList) {
			System.out.println(toy);
		}

		
	}

	@Override
	public String deleteFromCart(int toyId) {
		// TODO Auto-generated method stub
       for(Toy toy : custShoppingList) {
			
			if(toy.getToyId() == toyId) {
				custShoppingList.remove(toy);
				return "Selected toy deleted successfully";
			}
		}
		
		return "Toy not found";
	}

	@Override
	public float getCustomerBill() {
		// TODO Auto-generated method stub
        float totalAmount = 0.0f;
		
		return totalAmount;
	}
	
	

}
