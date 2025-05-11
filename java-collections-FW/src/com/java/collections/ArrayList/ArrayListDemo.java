package com.java.collections.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> firstFiveNumbers = new ArrayList<>();
		firstFiveNumbers.add(1);
		firstFiveNumbers.add(2);
		firstFiveNumbers.add(3);
		firstFiveNumbers.add(4);
		firstFiveNumbers.add(5);
		
		ArrayList<Integer> firstTenNumbers = new ArrayList<>(firstFiveNumbers);
		System.out.println(firstTenNumbers);
		
		ArrayList<Integer> nextFiveNumbers = new ArrayList<>();
		nextFiveNumbers.add(6);
		nextFiveNumbers.add(7);
		nextFiveNumbers.add(8);
		nextFiveNumbers.add(9);
		nextFiveNumbers.add(10);
		
		
		firstTenNumbers.addAll(nextFiveNumbers);
		System.out.println(firstTenNumbers);
//		firstTenNumbers.clear();
		System.out.println(firstTenNumbers.size());
		System.out.println(firstTenNumbers.isEmpty() ? "Yes" : "No");
		
//		ArrayList list = new ArrayList<>
//		System.out.println();
		}

}
