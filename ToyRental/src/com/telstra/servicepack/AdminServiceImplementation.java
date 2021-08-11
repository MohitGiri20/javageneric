package com.telstra.servicepack;

import java.util.ArrayList;

import com.telstra.model.ppack.Toy;
import com.telstra.model.toyop.ToyMethodsImplementation;

public class AdminServiceImplementation  implements AdminService{
	
	
	ToyMethodsImplementation tobj = new ToyMethodsImplementation();

	@Override
	public String addToy(Toy toy) {
		// TODO Auto-generated method stub
		return tobj.addToy(toy);
	}

	@Override
	public Toy getToy(int toyId) {
		// TODO Auto-generated method stub
		return tobj.getToy(toyId);
	}

	@Override
	public ArrayList<Toy> getAllToys() {
		// TODO Auto-generated method stub
		return tobj.getAllToys();
	}

	@Override
	public String deleteToy(int toyId) {
		// TODO Auto-generated method stub
		return tobj.deleteToy(toyId);
	}

	@Override
	public String updatePrice(int toyId, int toyUprice) {
		// TODO Auto-generated method stub
		
		return tobj.updatePrice(toyId, toyUprice);
	}

	@Override
	public long getInventory() {
		// TODO Auto-generated method stub
		return tobj.getInventory();
	}

	@Override
	public String search(int toyId) {
		// TODO Auto-generated method stub
        ArrayList<Toy> tempArr = tobj.getAllToys();
		
		for(Toy toy : tempArr) {
			
			if(toy.getToyId() == toyId) {
				return ("Toy found " + tobj.getToy(toyId) );
			}
		}
		return "Toy not found";
	}
	
	 

}
