package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindandPrintThedisticntOddNumbers {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,9,0,00,9);
		
	List<Integer> collect = list.stream().filter(x->x%2!=0).distinct().collect(Collectors.toList());
	      System.out.println(collect);
	}

}
