package com.java.Multithreading.SynchronizationEx;

public class Count {
	int count = 0;
	
	synchronized void increase() {
		count++;
	}
}
