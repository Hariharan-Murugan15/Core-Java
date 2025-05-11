package com.java.Multithreading.SynchronizationEx;


public class Sync {
	public static void main(String[] args) throws InterruptedException {
		Count count = new Count();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 10000; i++) {
//					System.out.println("Count: " + count.count);
					count.increase();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 10000; i++) {
//					System.out.println("Count: " + count.count);
					count.increase();
				}
			}
		});		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count: " + count.count);
	}
}
