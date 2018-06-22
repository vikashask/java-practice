package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemo {
	public static void main(String args[]) {
		// create an array list
		// printElements();
		/*
		 * List<String> listOfString = Arrays.asList("CE","A","E","B","D","F");
		 * //listOfString.forEach(x->System.out.println(x));
		 * listOfString.stream().filter(x->x.contains("E")).forEach(System.out::
		 * println); System.out.println("----");
		 * listOfString.stream().filter(x->x.contains("E")).forEach(System.out::
		 * println); System.out.println("----");
		 * listOfString.parallelStream().filter(x->x.contains("E")).forEach(
		 * System.out::println);
		 */
		Stream<String> anStream = Stream.of("a", "b", "c", "d", "e");
		Stream<String> newStream = Stream.concat(anStream, Stream.of("A"));
		List<String> resultList = newStream.collect(Collectors.toList());
		
		resultList.forEach(System.out::println);
	}

	private static void printElements() {
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " + al.size());

		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Size of al after additions: " + al.size());

		// display the array list
		System.out.println("Contents of al: " + al);

		// Remove elements from the array list
		al.remove("F");
		al.remove(2);

		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}
}
