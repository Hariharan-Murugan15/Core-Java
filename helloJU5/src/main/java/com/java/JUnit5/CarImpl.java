	package com.java.JUnit5;
	
	public class CarImpl implements Car {
		public static void main(String[] args) throws IllegalArgumentException {
			CarImpl c = new CarImpl();
			System.out.println(c.myFav("befvhb"));
		}
	
		@Override
		public String myFav(String name) throws IllegalArgumentException {
			if(name == null || name.length() == 0) {
				throw new IllegalArgumentException();
			}
			return "My Fav Car: " + name;
		}
	
	}