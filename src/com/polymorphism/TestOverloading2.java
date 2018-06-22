package com.polymorphism;

class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

class TestOverloading2 {
	public static void main(String[] args) {
		System.out.println(Adder1.add(11, 22));
		System.out.println(Adder1.add(11.1, 22.2));
		//Adder.add(11, 11));
		//System.out.println(Adder.add(12.3, 12.6));
	}
}