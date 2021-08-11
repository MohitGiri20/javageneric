package com.telstra.servicepack;

import java.util.ArrayList;

import com.telstra.model.ppack.Toy;

public interface AdminService {
	
	String addToy(Toy toy);
    Toy getToy(int toyId);
    ArrayList<Toy> getAllToys();
    String deleteToy(int toyId);
    String updatePrice(int toyId,int toyUprice);
    long getInventory();
    String search(int toyId);

}
