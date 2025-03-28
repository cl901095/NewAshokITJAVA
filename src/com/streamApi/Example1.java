package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {

		// before 1.8 version comes
		List<Integer> list = Arrays.asList(12, 32, 45, 9, 1);

		for (Integer i : list) {
			if (i < 10) {
				System.out.println(i);
			}
		}

		// using Stream API
		System.out.println("after using of stream api ");
		Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(i -> i < 10);
		filter.forEach(i -> System.out.println(i));

		// Simplifying above code

		System.out.println("After simplifying above code   ");
		list.stream().filter(i -> i < 10).forEach(i -> System.out.println(i));
	}
}
