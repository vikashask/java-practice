package com.java8;

public class Lamda {

//	parameter -> expression body

	public static void main(String [] args){
		Lamda lamda = new Lamda();
		
	}
	 interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	   
}
