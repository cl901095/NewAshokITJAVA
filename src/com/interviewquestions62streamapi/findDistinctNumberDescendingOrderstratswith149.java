package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class findDistinctNumberDescendingOrderstratswith149 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,23,5,6,789,11,1345,112,90};
		
		    Arrays.stream(arr).distinct()
		                      .filter(x->String.valueOf(x).startsWith("1"))
		                      .boxed()
		                      .sorted((a,b)->b-a)
		                      .collect(Collectors.toList())
		                      .forEach(System.out::println);
		    
	}

}
