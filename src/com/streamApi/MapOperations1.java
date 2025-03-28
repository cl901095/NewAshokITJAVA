package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapOperations1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("chandra", "sekhar", "lingisetti", "tcs", "wipro");

//		for(String name : names) {
//			System.out.println(name.toUpperCase());
//		}

		names.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));

		// to find out given names length using mapto int method
		names.stream().mapToInt(i -> i.length()).forEach(i -> System.out.println(i));
	}
}
