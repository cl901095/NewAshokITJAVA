package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheListinAlphabeticalOrder {
	public static void main(String[] args) {
		
		List<String> arr=Arrays.asList("addida","puma","nike","trends");
		
	  List<String> collect = arr.stream().sorted().collect(Collectors.toList());
	  System.out.println(collect);
	}

}
