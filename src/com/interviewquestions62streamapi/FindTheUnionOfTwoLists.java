package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheUnionOfTwoLists {
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> asList2 = Arrays.asList(7,8,9,0);
		
		 List<Integer> concat = Stream.concat(asList.stream(), asList2.stream()).collect(Collectors.toList());
		 System.out.println(concat);
	}

}
