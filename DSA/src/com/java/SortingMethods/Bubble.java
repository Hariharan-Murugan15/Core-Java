package com.java.SortingMethods;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int[] list = {42, 34, 21, 66, 12, 9, 28};
		bubbleSort(list);
		System.out.println(Arrays.toString(list));	
	}
	
	static void bubbleSort(int[] ls) {
		for(int i = ls.length ; i > 0; i--) {
			int isSwap = 0;
			for(int j = 0; j < i - 1; j++) {
				if(ls[j] > ls[j + 1]) {
					int temp = ls[j];
					ls[j] = ls[j + 1];
					ls[j + 1] = temp;
					isSwap = 1;
				}
				if(isSwap == 0) break;
			}
		}
	}

}
