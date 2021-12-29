package com.coreassignments7.com;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceWordExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("raj", "kumar", "abhi"));

		System.out.println(alphabets);

		alphabets.replaceAll(e -> e.toUpperCase());

		System.out.println(alphabets);
	}
}
