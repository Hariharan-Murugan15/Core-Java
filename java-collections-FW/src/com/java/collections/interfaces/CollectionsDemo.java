package com.java.collections.interfaces;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionsDemo {

	public static void main(String[] args) {
		Collection<String> carCollections = new ArrayList<>();
		carCollections.add("Ferrari");
		carCollections.add("McLaren");
		carCollections.add("Mercedes");
		System.out.println(carCollections);
		
		carCollections.remove("McLaren");
		System.out.println(carCollections);
		
		Collection<String> pilots = new ArrayList<String>();
		pilots.add("Charles");
		pilots.add("Lewis Hamilton");
		pilots.addAll(carCollections);
		
		System.out.println(pilots);
		
		System.out.println(pilots.containsAll(pilots));
		
		
		pilots.forEach(ele -> {
			System.out.println(ele);
		});
		
		pilots.clear();
		System.out.println(pilots);
		
		
		
		
	}

}
