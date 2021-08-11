package com.telstra;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Bunkbed", 20000);
		map.put("Bed", 25000);
		map.put("Table",5000);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		int totalAmount=0;
		
		for(String s : map.keySet()) {
			System.out.print(s+ " ");
			totalAmount+=map.get(s); 
		}
		System.out.println();
		System.out.println(totalAmount);

	   
		TreeMap<Customer,String> tm = new TreeMap<Customer,String>();
		
		tm.put(new Customer(101,"Mg"),"Delhi");
		tm.put(new Customer(102,"Mohit"),"Haryana");
		tm.put(new Customer(99,"Ag"), "UP");
		
		
		for(Customer c : tm.keySet()) {
			System.out.println("Customer Name:" + c.getName() + ", Location" + tm.get(c));
		}
		
	}

}
