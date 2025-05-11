package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.jupiter.api.Test;

class CarImplTest {

	@Test
	void myFavShouldReturnVoidOutput() throws IllegalAccessException {
		Car car1 = new CarImpl();
		String result = car1.myFav("Ferrai");
		
		assertNotNull(result);
		assertEquals("My Fav Car: Ferrai", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	void myFavShouldThrowsillegalException_If_NameIsNull() throws IllegalAccessException  {
		Car car1 = new CarImpl();
		car1.myFav(null);
	}
	

}
