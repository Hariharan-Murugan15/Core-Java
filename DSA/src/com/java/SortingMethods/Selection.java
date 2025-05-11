package com.java.SortingMethods;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int[] list = {42, 34, 21, 66, 12, 9, 28};
		
		selectionSort(list);
		
		System.out.println(Arrays.toString(list));
	}
	
	static void selectionSort(int[] ls) {
		for(int i = 0; i < ls.length -1; i++) {
			int min = i;
			for(int j = i; j < ls.length; j++) {
				if(ls[j] < ls[min]) 
					min = j;
			}
			
			int temp = ls[min];
			ls[min] = ls[i];
			ls[i] = temp;
		}
	}
}
