package com.java.IterableVsIterator;

public class Main1 {
	public static void main(String[] args) {
		CustomArray<String> myCustomArray = new CustomArray<>();
		myCustomArray.Add("Clarles Leclerc");
		myCustomArray.Add("Lewis Hamilton");
		myCustomArray.Add("Lando Norris");
		myCustomArray.Add("Oscar Piastri");
		myCustomArray.Add("George Russell");
		myCustomArray.Add("Andrea Kimi Antonelli");
		myCustomArray.Add("Max Verstappen");
		myCustomArray.Add("Liam Lawson");
		
		myCustomArray.forEach(n -> {
			System.out.println(n);
		});
	}
}
