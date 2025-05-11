package com.java.IterableVsIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomArray<T> implements Iterable<T> {
	
	private List<T> myList = new ArrayList<>();
	
	public void Add(T value) {
		myList.add(value);
	}

	@Override
	public Iterator<T> iterator() {
		return (new customIterator<T>(myList));
	}
	
	
	public class customIterator<E> implements Iterator<E> {
		int indexPositions = 0;
		List<E> iterableList;
		
		public customIterator(List<E> iterableList) {
			this.iterableList = iterableList;
		}

		@Override
		public boolean hasNext() {
			if(iterableList.size() >= indexPositions + 1) return true;
			return false;
		}

		@Override
		public E next() {
			E value = iterableList.get(indexPositions);
			indexPositions += 2;
			return value;
		}
	}
}
