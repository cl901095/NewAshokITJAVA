package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapOperation2 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("chandra", "sekhar", "ligisetti", "tcs", "wipro");

		// print name with its length which are starting with 'A'

		names.stream().filter(i -> i.startsWith("l"))
		     .map(i -> i + " - " + i.length())
			 .forEach(i -> System.out.println(i));

	}

}
