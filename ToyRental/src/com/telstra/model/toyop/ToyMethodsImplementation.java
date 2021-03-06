package com.telstra.model.toyop;

import java.util.ArrayList;

import com.telstra.model.ppack.Toy;

public class ToyMethodsImplementation implements ToyOperations{
	
	ArrayList<Toy> toys = new ArrayList<Toy>();
	

	@Override
	public String addToy(Toy toy) {
		// TODO Auto-generated method stub
		toys.add(toy);
		return "Toy added successfully to the database";
	}

	@Override
	public Toy getToy(int toyId) {
		// TODO Auto-generated method stub
		
       for(Toy toy : toys) {
			
			if(toy.getToyId() == toyId) {
				return toy;
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Toy> getAllToys() {
		// TODO Auto-generated method stub
		return toys;
	}

	@Override
	public String deleteToy(int toyId) {
		// TODO Auto-generated method stub
		
        for(Toy toy : toys) {
			
			if(toy.getToyId() == toyId) {
				 toys.remove(toy);
				 return "Selected toy is deleted successfully";
			}
		}
		
		return "Deletion Unsuccessful, No toy found";
		
	}

	@Override
	public String updatePrice(int toyId, int toyUprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getInventory() {
		// TODO Auto-generated method stub
		return 0;
	}

}
