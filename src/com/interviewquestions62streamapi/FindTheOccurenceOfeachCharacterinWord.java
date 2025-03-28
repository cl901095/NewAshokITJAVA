package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOccurenceOfeachCharacterinWord {
	 public static void main(String[] args) {
		
		 String s="chandra";
		//Approach 1 
	  Map<String, Long> collect = Arrays.stream(s.split(""))
			                       .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  System.out.println(collect);
	  
	  //Approach 2
	  Map<String, Long> collect2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
	  System.out.println(collect2);
	  
	}
}
