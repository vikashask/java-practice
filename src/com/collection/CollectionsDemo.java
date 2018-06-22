package com.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsDemo {
	public static void main(String[] args) {
		// ArrayList
		List<String> a1 = Arrays.asList("Zara","Vikas","Ayan");
	//	a1.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::print);
		
		
			/*	
//		 sorting that array
		//Collections.sort(a1);
		
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);

		// LinkedList
		List l1 = new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + l1);

		// HashSet
		Set s1 = new HashSet();
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println();
		System.out.println(" Set Elements");
		System.out.print("\t" + s1);
*/
		// HashMap
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		
		m1.entrySet().stream().forEach(System.out::println);
		
	}

}
