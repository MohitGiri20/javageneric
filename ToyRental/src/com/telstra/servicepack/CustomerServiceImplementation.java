package com.telstra.servicepack;

import java.util.ArrayList;
import java.util.HashMap;

import com.telstra.model.ppack.Toy;
import com.telstra.model.toyop.ToyMethodsImplementation;


public class CustomerServiceImplementation implements CustomerService{
	
	
	private static int count = 1; //TODO
	ArrayList<Toy> custShoppingList= new ArrayList<Toy>();;
	private int rentalId; //TODO
	private HashMap<Integer, Float> custMap = new HashMap<Integer,Float>();
	
//	public Customer() {
//		super();
//		this.tid =count++;
//	}
	
//	public void addToCart(int toyId, int units) {
//		ToyMethodsImplementation tobj =new ToyMethodsImplementation();
//		Toy toy = tobj.getToy(toyId);
//		custShoppingList.add(toy);
//		custMap.put(toy.getToyId(), toy.getPrice()*units);
//		
//	}
	
	

	@Override
	public String rent(int toyId,int units) {
		// TODO Auto-generated method stub
		
		ToyMethodsImplementation tobj =new ToyMethodsImplementation();
		Toy toy = tobj.getToy(toyId);
		 
		custShoppingList.add(toy);
		//custMap.put(toy.getToyId(), toy.getPrice()*units);
		for(Toy t : custShoppingList) {
			System.out.println(t);
		}
		
		
		return "Toy added successfully";
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
	public Toy getToy(int toyId) {
		// TODO Auto-generated method stub
		ToyMethodsImplementation tobj =new ToyMethodsImplementation();
		
		return tobj.getToy(toyId);
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
		
		float totalAmount = 0.0f;
		
		for(int ele : custMap.keySet()) {
			totalAmount+=custMap.get(ele); 
		}
		
		return totalAmount;

	}
	
	

}
