package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindandPrinttheStringscontainsOnlyDigits {
	
	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("123","asd","6543","sdf","1234567");
		
		List<String> collect1 = asList.stream().filter(x->x.matches("[0-9]+")).collect(Collectors.toList());
		System.out.println(collect1);
		
		List<String> collect2 = asList.stream().filter(x->x.matches("\\d+")).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
