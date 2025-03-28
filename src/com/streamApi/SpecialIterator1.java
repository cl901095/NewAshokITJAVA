package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpecialIterator1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("chandra", "sekhar", "lingisetti");

		Spliterator<String> spi = names.stream().spliterator();

		spi.forEachRemaining(n -> System.out.println(n));

	}
}
