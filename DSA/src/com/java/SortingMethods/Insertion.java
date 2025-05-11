package com.java.SortingMethods;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		int[] list = {42, 34, 21, 66, 12, 9, 28};
		insertionSort(list);
		System.out.println(Arrays.toString(list));
	}

	static void insertionSort(int[] list) {
		for(int i = 1; i < list.length; i++) {
			int key = list[i];
			int j = i - 1;
			while(j >= 0  &&  list[j] > key) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = key;
		}
	}
}
