package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveNonNumericChracters {
	public static void main(String[] args) {

		List<String> asList = Arrays.asList("1234gfd", "4567sdf", "234567,sdfgh");

		Pattern pattern = Pattern.compile("[^0-9]");

		List<String> collect = asList.stream().map(x -> pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
		System.out.println(collect);
	}

}
