package com.telstra.threadpack;

public class ThreadClass2 extends Thread{
	
	
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(i+ " " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
	
}
