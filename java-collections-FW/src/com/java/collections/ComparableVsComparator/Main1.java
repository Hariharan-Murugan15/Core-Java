package com.java.collections.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("Mac", 12, 1700));
		laps.add(new Laptop("HP", 16, 1200));
		laps.add(new Laptop("Acer", 16, 1800));
		laps.add(new Laptop("Lenovo", 8, 900));
		
//		Collections.sort(laps, (l1, l2) -> l2.getPrice() - l1.getPrice());
//		System.out.println(laps.toString());
		
		Collections.sort(laps);
		for(Laptop l : laps) {
			System.out.println(l);
		}
	}

}
