package com.interviewquestions62streamapi;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepatedCharcater {
	public static void main(String[] args) {
		
		String s="hello world";
		
		  Character ans = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
				   LinkedHashMap::new,Collectors.counting()))
		           .entrySet().stream().filter(m->m.getValue()>1)
		           .map(m->m.getKey()).findFirst().get();
		  
		  System.out.println(ans);
		  
	}

}
