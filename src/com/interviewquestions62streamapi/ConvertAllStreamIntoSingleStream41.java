package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;

public class ConvertAllStreamIntoSingleStream41 {

	// 41 Convert a list of string to uppercase and then concatenate
	public static void main(String[] args) {

		List<String> charcerts = Arrays.asList("a", "b", "c", "d");

		String ans = charcerts.stream().map(String::toUpperCase)
				               .reduce((s1, s2) -> s1 + " " + s2)
				               .orElse("");
		                  System.out.println(ans);
	}

}
