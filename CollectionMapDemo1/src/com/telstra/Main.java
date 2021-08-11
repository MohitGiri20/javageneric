package com.telstra;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Map<Integer,String> map = new HashMap<Integer,String>();
		//Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		Map<Integer,String> map = new TreeMap<Integer,String>();
		
		// Linkedhashmap gives the element in order in which it is saved in 
		// map.
		
		// TreeMap gives the output in the sorted order.
		map.put(1,"Mg");
		map.put(2908, "Kg");
		map.put(3, null);  // null key is not allowed in tree map
	  //map.put(null,null);// null key is not allowed in tree map
		map.put(14, "KKKf");
		
		System.out.println(map);
		
		// Hashtable doesn't allow null as key.
		// All it's methods are thread safe.(Vector,Stack)
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		
		ht.put(1,"Mg");
		ht.put(2908, "Kg");
		ht.put(14, "KKKf");
		ht.put(12, "JHjsdh");
		ht.put(213, "hteq");
		
		System.out.println(ht);
		
				
		
		
	}

}
