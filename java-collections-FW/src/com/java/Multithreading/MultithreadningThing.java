package com.java.Multithreading;


public class MultithreadningThing extends Thread {
	private String name;
	
	MultithreadningThing(String name){
		this.name = name;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() +" "+ i );
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
