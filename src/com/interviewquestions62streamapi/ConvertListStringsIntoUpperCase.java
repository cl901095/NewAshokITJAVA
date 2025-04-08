package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListStringsIntoUpperCase {
	
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("chandu","sekhar","siva","gopi","krishna");
		
		List<String> collect = asList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}

}
