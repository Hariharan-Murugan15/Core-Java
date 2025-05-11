package com.java.JUnit5.Calculator;

public class Calculator {

	
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	public int perform2XAdd(int a, int b) {
		return service.add(a, b) * a;
//		return (a + b) * 2;
	}

	public int perform2XMul(int a , int b) {
		return service.mult(a, b) * a;
	}
	
}
