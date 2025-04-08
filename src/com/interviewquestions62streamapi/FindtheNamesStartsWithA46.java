package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindtheNamesStartsWithA46 {
	
	public static void main(String[] args) {
		  
		
		List<String> asList = Arrays.asList("chandra","akhil","sekhar","siva");
		
		  Stream<String> names= asList.stream().filter(x->x.startsWith("a"));
		  Stream<String> names1= asList.stream().filter(x->x.startsWith("a"));
		  names.forEach(System.out::println);
		  
		  try {
			  long count = names1.count();
			  System.out.println(count);
		  }catch(IllegalStateException e) {
			  System.out.println(e);
		  }
		  
	}

}
