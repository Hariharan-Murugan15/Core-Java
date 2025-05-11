package com.java.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Charles", "Carlos", "Lewis", "Lando", "George", "Kimi Antonelli");
//		System.out.println(list);
		
		Iterator<String> it = list.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
//		
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}else {
//			System.out.println("Err");
//		}
//		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		for(Iterator itt : )
	}
}
