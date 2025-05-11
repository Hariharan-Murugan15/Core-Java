package com.java.SortingMethods;

import java.util.Arrays;
import java.util.Random;

public class Quick {
	public static void main(String[] args) {
		Random random = new Random();
		int[] list = new int[10];
		for(int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(100);
		}

//		System.out.println(Arrays.toString(list));
		quickSort(list, 0, list.length - 1);
		System.out.println(Arrays.toString(list));
	}

	static void quickSort(int[] list, int low, int high) {
		if(low < high) {
			int pivot = partition(list, low, high);
			
			quickSort(list, low, pivot - 1);
			quickSort(list, pivot + 1, high);
		}
	}

	private static int partition(int[] list, int low, int high) {
		int pivot = list[high];
		int i = low - 1;
		for(int j = low; j < high; j++) {
			if(list[j] < pivot) {
				i++;
				swap(list, i, j);				
			}
		}
		swap(list, i + 1, high);
		return pivot + 1;
	}

	private static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
