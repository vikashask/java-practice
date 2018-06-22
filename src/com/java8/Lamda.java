package com.java8;

public class Lamda {

	// parameter -> expression body

	public static void main(String[] args) {

		Lamda lamda = new Lamda();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println("10 + 5 = " + lamda.operate(10, 5, addition));

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;
		System.out.println("10-5 = " + lamda.operate(10, 5, subtraction));

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			int c = 10;
			return a * b * c;
		};
		System.out.println("10 x 5 = " + lamda.operate(10, 5, multiplication));

	}

	interface MathOperation {
		int operation(int a, int b);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}
