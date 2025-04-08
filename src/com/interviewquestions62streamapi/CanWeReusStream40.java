package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CanWeReusStream40 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("chandu", "sekhar", "gopi", "siva", "pandu");

		Supplier<Stream<String>> nameStream = () -> names.stream();

		// Consumption 1
		nameStream.get().forEach(System.out::println);

		// consumption2
		long count = nameStream.get().count();
		System.out.println(count);
	}

}
