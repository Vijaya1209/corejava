package com.assignments.examples;

import java.util.Scanner;

public class ArrayNumberSearch {

	public static void main(String[] args) {

		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int i = scan.nextInt();
		int j = 0;
		for (int a : arr) {
			if (a == i)
				j++;
		}
		if (j == 1)
			System.out.println("Enter number " + i + " is contanied in Array");
		else
			System.out.println("Enter number " + i + " is not contanied in Array");

		scan.close();
	}

}
