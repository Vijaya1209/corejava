package com.coreassignments7.com;

interface Arithmetic {
	int operation(int a, int b);
}

public class ArithmeticExample {
	public static void main(String args[]) {
		Arithmetic Addition = (int a, int b) -> (a + b);
		System.out.println("Addition=" + Addition.operation(5, 6));
		Arithmetic Subtraction = (int a, int b) -> (a - b);
		System.out.println("Subtraction=" + Subtraction.operation(5, 3));
		Arithmetic Multiplication = (int a, int b) -> (a * b);
		System.out.println("Multiplication=" + Multiplication.operation(4, 6));
		Arithmetic Division = (int a, int b) -> (a / b);
		System.out.println("Division=" + Division.operation(12, 6));
	}
}
