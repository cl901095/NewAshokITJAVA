package com.interviewquestions62streamapi;

import java.util.Map;
import java.util.stream.Collectors;

public class Returncharacterwiththemaximumfrequency56 {

	public static void main(String[] args) {
		
		String s="javadeveleper";
		
		
		char ch=s.chars()
				.mapToObj(c->(char) c)
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);
		System.out.println(ch);
		
	}

}
