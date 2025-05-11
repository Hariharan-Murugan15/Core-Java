package com.Main.one;

class Car{
	private String brandName;
	private String color;
	private int year;
	
	Car(String bname, String color, int yr) {
		this.brandName = bname;
		this.color = color;
		this.year = yr;
	}
	
	void getter() {
		System.out.println(brandName + " " + color + " " + year);
	}
}

class New{
	private String name;
	private Integer rollNo;
	private Integer Year;
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Ferrari", "Red", 1950);
//		car1.getter();
		
		New new1 = new New();
		System.out.println(new1);
	}

}
