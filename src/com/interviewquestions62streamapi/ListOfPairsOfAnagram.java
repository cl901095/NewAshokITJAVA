package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfPairsOfAnagram {
	public static void main(String[] args) {
		String[] arr= {"pat","tap","pan","nap","team","tree","meat"};
		
		List<String> list=Arrays.asList(arr);
		
     Collection< List<String>> collect = list.stream().collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split("")).sorted()
		            		.collect(Collectors.toList()))).values();
      System.out.println(collect);
	}

}
