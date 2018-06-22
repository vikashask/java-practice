package com.collection;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a linked list
	      LinkedList ll = new LinkedList();
	      
	      // add elements to the linked list
	      ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of ll: " + ll);
	      // remove elements from the linked list
	      ll.remove("F"); // F removed 
	      ll.remove(2); // now on index of 2 is B so this one also removed
	      System.out.println("Contents of ll after deletion: " + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: " + ll);

	      // get and set a value
	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Changed");
	      System.out.println("ll after change: " + ll);
	}

}
