package com.assignments.examples;

import java.util.Scanner;

public class SupplyMarks {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3 subject marks : ");
		int Subject1 = scan.nextInt();
		int Subject2 = scan.nextInt();
		int Subject3 = scan.nextInt();
		if (Subject1 > 60 && Subject2 > 60 && Subject3 > 60)
			System.out.println("Pass");
		else if (Subject1 > 60 && Subject2 > 60 || Subject1 > 60 && Subject3 > 60 || Subject2 > 60 && Subject3 > 60)
			System.out.println("Promoted");
		else
			System.out.println("Fail");
		scan.close();
	}

}
