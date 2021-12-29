package com.assignments.examples;

import java.util.Scanner;

public class LoginAttempts {
	
	public static void main(String[] args) {

		String UserId = "Vijaya", Pwd = "Vijaya";
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("Plase Enter valid UserId : ");
			String Login = scan.next();
			String pass = scan.next();
			if (UserId.equals(Login) && Pwd.equals(pass))
				System.out.println("Welcom " + UserId);
			else {
				System.out.println("Invalid Cridentials");
			}

		}
		System.out.println("Contact Admin");
		scan.close();

	}

}
