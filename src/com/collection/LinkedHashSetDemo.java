package com.collection;

import java.util.*;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		// inherits HashSet class and implements Set interface.
		/* 
		Contains unique elements only like HashSet.
		Provides all optional set operations, and permits null elements.
		Maintains insertion order.
		*/
		Set <String> hs = new HashSet<String>();

		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("F");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+ "--");
		}
		System.out.println(hs);
	}
}
