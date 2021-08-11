package com.telstra;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Item> pq = new PriorityQueue<Item>();
		
		pq.add(new Item(101,"JavaBook"));
		pq.add(new Item(02,"CPPbook"));
		pq.add(new Item(93,"JavaScriptBook"));
		pq.add(new Item(1010,"PythonBook"));
		pq.add(new Item(76,"HTMLbook"));
		// Lowest priority is at first because of compareTo implementation.
		
		System.out.println(pq);
		
		pq.poll();
        
		System.out.println(pq);
	}

}
