package com.java.JUnit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarImplTestJ4 {
	
	private Car car;


	@BeforeEach
	public void setup() {
		System.out.println("Setup");
		car = new CarImpl();
	}
	

	@Test
	public void MyFavShouldReturnVoidOutput() throws IllegalArgumentException {
		System.out.println("MyFavShouldReturnVoidOutput");

		String res = car.myFav("Ferrai");
		
		Assertions.assertNotNull(res);
		Assertions.assertEquals("My Fav Car: Ferrai", res);
	}
	
	
	@Test
	public void MyFavShouldThrowException_If_NameIsNull() throws IllegalArgumentException {
		System.out.println("MyFavShouldThrowException_If_NameIsNull");
		
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> car.myFav(null) );
	}
	
	
	@Test
	public void MyFavShouldThrowException_If_NameIsBlank() throws IllegalArgumentException {
		System.out.println("MyFavShouldThrowException_If_NameIsBlank");
		Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> car.myFav(""));
	}
	
	
	@AfterEach
	public void cleanup() {
		System.out.println("Cleanup");
		car = null;
	}
}
