package com.assignments.examples;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

		System.out.println("Given array is ");
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}

		}
		System.out.println("After sorting your array is ");
		for (int x : arr) {
			System.out.print(x + " ");

		}
	}

}
