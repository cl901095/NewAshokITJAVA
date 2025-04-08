package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindFirstTwoelementsOfProduct {
	public static void main(String[] args) {
		
		int [] arr= {12,9,8,9,0};
		Integer reduce = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().limit(2).reduce(1,(a,b)->a*b);
		
		System.out.println(reduce);
	}

}
