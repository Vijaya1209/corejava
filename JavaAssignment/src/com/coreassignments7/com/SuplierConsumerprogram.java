package com.coreassignments7.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SuplierConsumerprogram {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Supplier<Integer> Supplier = () -> new Integer((int) (Math.random() * 1000D));// supplier API
		System.out.println("Supplier API");
		Consumer<Integer> Consumer = (value) -> System.out.println(value);// Consumer API
		System.out.println("Consumer API");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// multiple filters
		List<Integer> collect = list.stream().filter(x -> x > 5 && x < 8).collect(Collectors.toList());

		System.out.println(collect);
		System.out.println("Predicate API");
		Function<Long, Long> adder = (value) -> value + 3;// Function API
		Long resultLambda = adder.apply((long) 8);
		System.out.println("resultLambda Function API = " + resultLambda);
	}
}
