package com.telstra.mainpack;

import com.telstra.threadpack.ThreadClass1;
import com.telstra.threadpack.ThreadClass2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The default priority for any thread is NORM_PRIORITY(5)

		ThreadClass1 tob1= new ThreadClass1();
		
		Thread t1 = new Thread(tob1);
		t1.setName("Thread 1");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		
		//System.out.println("Thread 1 :" + t1.isAlive());
		
		Thread t2 = new Thread(tob1);
		t2.setName("Thread 2");
		//System.out.println("Thread 2 :" + t2.isAlive());
		t2.start();
		
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread t3 = new Thread(tob1);
		t3.setName("Thread 3");
		t3.start();
		
//		ThreadClass2 t3 = new ThreadClass2();
//		t3.setName("Thread 3");
//		t3.start();
//		
//		ThreadClass2 t4 = new ThreadClass2();
//		t4.setName("Thread 4");
//		t4.start();
		
		
	}

}
