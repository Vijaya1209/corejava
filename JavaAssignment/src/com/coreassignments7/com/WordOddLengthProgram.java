package com.coreassignments7.com;

import java.util.ArrayList;
import java.util.Arrays;

public class WordOddLengthProgram {
	interface Stringlength {
		int getLength(String str);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> names = new ArrayList<>(Arrays.asList("ram", "vijay", "abhi", "kumar"));
		names.removeIf((String str) -> str.length() % 2 == 1);
		System.out.println(names);
	}
}
