package com.telstra;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// FIFO(First In First Out)
		
		// Queue is not having direct implementation in Java Collections
		// We need to implement queue using LinkedList
		
		Queue<String> que = new LinkedList<String>();
		
		que.add("mg");
		que.add("mohit");
		que.add("max");
		que.add("min");
		
		System.out.println(que);
		
		// Gives the first element and removes it from queue.
		
		System.out.println(que.poll());
		
		System.out.println(que);
		
		System.out.println(que.peek());
		
		System.out.println(que.remove());
		System.out.println(que);
		

	}

}
