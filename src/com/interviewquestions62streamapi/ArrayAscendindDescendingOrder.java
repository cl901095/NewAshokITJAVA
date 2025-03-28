package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayAscendindDescendingOrder {
	public static void main(String[] args) {
		
		int [] arr= {26,98,9,5,7,89,23,45,89};
		
		//  ascending order
		Arrays.stream(arr).mapToObj(x->x).sorted().forEach(System.out::println);
		System.out.println("******************************");
		// descending order
		Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
