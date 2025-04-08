package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheIntersectionoftwoLists32 {
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> asList2 = Arrays.asList(4,5,6,7,8,9);
						
	List<Integer> collect = asList.stream().filter(asList2::contains).collect(Collectors.toList());
	System.out.println(collect);
		            
	}

}
