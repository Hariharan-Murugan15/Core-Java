package com.java.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main1 {
//	private static final String Predicate = null;

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(8,3,5,1,5);
		
		Stream<Integer> data = nums.stream().sorted();
		data.forEach(n -> {
			System.out.println(n);
		});
		
//		nums.stream().sorted().map(num -> num * 2).forEach(num -> System.out.println(num));

		
		int res = nums.stream()
					  .filter(n -> n%2==0)
					  .sorted()
					  .map(n -> n *2)
					  .reduce(0, (a, b) -> a + b);
		
		System.out.println(res);
		}
}
