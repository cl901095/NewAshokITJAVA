package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flatmap1 {

	public static void main(String[] args) {

		List<String> Backend = Arrays.asList("java", "python", "c", "c++", "c#");
		List<String> Frontend = Arrays.asList("Html", "css", "react", "angular");

		List<List<String>> courses = Arrays.asList(Backend, Frontend);

		// Approach 1
		courses.stream().forEach(i -> System.out.println(i));

		// Approach 2
		Stream<String> fm = courses.stream().flatMap(s -> s.stream());
		fm.forEach(i -> System.out.println(i));

	}

}
