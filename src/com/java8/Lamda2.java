package com.java8;

public class Lamda2 {
	 final static String salutation = "Hello! ";
	 
	public static void main(String[] args) {
		GreetingService greet = message-> System.out.println(salutation+message);
		
		greet.sayMess("Vikash");
	}
	
	interface GreetingService{
		void sayMess(String message);
	}
}
