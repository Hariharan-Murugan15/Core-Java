package com.java.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarImplTestJ4 {
	
	
	private Car car;


	@Before
	public void setup() {
		System.out.println("Setup");
		car = new CarImpl();
	}
	

	@Test
	public void MyFavShouldReturnVoidOutput() throws IllegalArgumentException {
		System.out.println("MyFavShouldReturnVoidOutput");

		String res = car.myFav("Ferrai");
		
		assertNotNull(res);
		assertEquals("My Fav Car: Ferrai", res);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void MyFavShouldThrowException_If_NameIsNull() throws IllegalArgumentException {
		System.out.println("MyFavShouldThrowException_If_NameIsNull");
		car.myFav(null);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void MyFavShouldThrowException_If_NameIsBlank() throws IllegalArgumentException {
		System.out.println("MyFavShouldThrowException_If_NameIsBlank");
		car.myFav("");
	}
	
	
	@After
	public void cleanup() {
		System.out.println("Cleanup");
		car = null;
	}
}
