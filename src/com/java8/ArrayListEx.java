package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListEx {
	public static void main(String[] args) {
		// Constructor Accepting Initial Capacity
		//List<String> list = new ArrayList(20);
		//You may insert an element either at the end or at the specific position:
		List<Long> list = new ArrayList<>();		 
		list.add(1L);
		list.add(2L);
		list.add(1, 3L);
		
		//System.out.println(list);
		
		//You may also insert a collection or several elements at once:
		List<Long> list2 = new ArrayList<>(Arrays.asList(1L,2L,3L));
		//list2.forEach(y->System.out.println(y));  // can we put if condition ??
		
		
		 List<String> listOfString = Arrays.asList("CE","A","E","B","D","F");
		 //listOfString.forEach(x->System.out.println(x));
		 
		 
		 List<Integer> listNumbers = Arrays.asList(31, 87, 22, 45, 12, 98, 3, 6, 7);
		 //listNumbers.stream().filter(x->x>12).sorted().forEach(System.out::println);
		 
		 /// working with key value
		 Map<String,String> map = new HashMap<>();
		 map.put("venkat", "1");
		 map.put("Gadarla", "2");
		 map.put("Chalam", "3");
		 
		 List<String> listOfKeys = map.entrySet().stream().map(a->a.getKey()).collect(Collectors.toList());
		 listOfKeys.stream().sorted().forEach(x->System.out.println(x));
		 
		 // getting maximum number
		 System.out.println(listNumbers.size());
		 Integer max = Collections.max(listNumbers);
		 System.out.println("Maximum number: " + max);
		 
		 List<Integer> source = Arrays.asList(18, 33, 66, 99, 22, 33, 66, 11, 100);
		 List<Integer> target = Arrays.asList(33, 66);
		 
		 // binary search
//		 int binarySearch = Collections.binarySearch(source, 66);
		 
		 // getting lastIndexOfSubList
		 //int lastIndexOfSubList = Collections.lastIndexOfSubList(source, target);
		 
		 
		 int indexOfSubList = Collections.indexOfSubList(source, target);
		 
//		 int indexOfSubList = Collections.reverse(source);
		 
		  
		 System.out.println("Last index : " + indexOfSubList);
		 
	}
}
