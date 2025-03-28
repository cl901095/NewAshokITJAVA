package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("chandra", "sekhar", "lingisetti", "tcs", "wipro");

		names.stream().filter(i -> i.startsWith("c")).forEach(i -> System.out.println(i));
	}

}
