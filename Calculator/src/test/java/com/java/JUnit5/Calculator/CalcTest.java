package com.java.JUnit5.Calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalcTest {
	
	Calculator calc;
	CalculatorService service = mock(CalculatorService.class);
	
//	@Mock
//	CalculatorService service;
	
	

	@BeforeEach
	public void setUp() {
		calc = new Calculator(service);
	}
	
	@Test
	public void performTest() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, calc.perform2XAdd(2, 3));
		verify(service).add(2, 3);
	}

}
