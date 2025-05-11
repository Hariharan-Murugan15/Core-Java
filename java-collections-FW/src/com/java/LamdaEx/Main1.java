package com.java.LamdaEx;

@FunctionalInterface
interface interface1{
	void hello();
//	void hi;	This is not possible because FunctionalInterface not allows more than 1 method.
//	String toString();	//This is possible because toString() is method that in `Object` class. 
						//Every class in java extends Object Class.
}

//class class1 extends Object implements interface1{
//	public void hello(){
//		System.out.println("Hello");
//	}
//}

public class Main1 {
	public static void main(String[] args) {
//		interface1 obj = new interface1() {
//			public void hello(){
//				System.out.println("Hello");
//			}
//		};
		
//		obj.hello();
		
		
		interface1 obj2 = () -> {
			System.out.println("Lamda Ex");
		};
		
		
		obj2.hello();
	}
}
