package com.coreassignments7.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class MapKeyValuePair {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("abhi", "vineetha"));
		System.out.println(alphabets);
		alphabets.replaceAll(new MyOperator());
		System.out.println(alphabets);
	}
}

class MyOperator implements UnaryOperator<String> {
	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
}
