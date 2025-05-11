package com.java.Multithreading;

public class Multithread {
	public static void main(String[] args) {
		MultithreadningThing myThing1 = new MultithreadningThing("T1");
		MultithreadningThing myThing2 = new MultithreadningThing("T2");
		myThing1.start();
		myThing2.start();
	}
}
