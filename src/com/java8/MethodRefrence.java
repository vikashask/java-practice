package com.java8;

import java.util.ArrayList;
import java.util.List;

/*Method references help to point to methods by their names. A method reference is described using "::" symbo
 * method reference can be used
 *  1.Static methods
	2.Instance methods
	3.Constructors using new operator (TreeSet::new)
 * */
public class MethodRefrence {
	public static void main(String[] args) {
		List names = new ArrayList<String>();
		
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(System.out::println);
	}
}
