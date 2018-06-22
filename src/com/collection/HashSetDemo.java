package com.collection;

import java.util.*;

public class HashSetDemo {

	public static void main(String args[]) {
	      // create a hash set
		//A hash table stores information by using a mechanism called hashing. 
		//informational content of a key is used to determine a unique value
	      HashSet hs = new HashSet();
	      
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      hs.add("F");
	      System.out.println(hs);
	   }

}
